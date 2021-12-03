package com.offcn.controller;

import com.github.pagehelper.PageInfo;
import com.offcn.bean.ConditionBean;
import com.offcn.bean.Moviedetailtable;
import com.offcn.bean.Movietable;
import com.offcn.service.CategroyService;
import com.offcn.service.MovieTableService;
import com.offcn.util.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private CategroyService categroyService;
    @Autowired
    private MovieTableService movieTableService;
    /**
     * 展示电影列表
     * @return
     */
    @RequestMapping("show-movie")

    public  String showMovie(Model model, ConditionBean conditionBean, @RequestParam(defaultValue = "1")int currentPage){

        List<String> categroyNameList=categroyService.getCategroyNameList();


        //分页条件获取电影列表数据
        conditionBean.setPage(currentPage);
        conditionBean.setPageSize(9);
        PageInfo<Movietable> pageInfo = movieTableService.findMoviesByConditionBean(conditionBean);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("searchS",categroyNameList);
        model.addAttribute("conditionBean",conditionBean);
        return  "WEB-INF/jsp/movie/movielist";


    }
    @RequestMapping("show-add-movie")
    public  String showAddMovie(){
        return  "WEB-INF/jsp/movie/movieadd";
    }

    /**
     * 新增电影
     */
    @RequestMapping("add-movie")


    public  String addMovie(Movietable movietable,
                            Moviedetailtable moviedetailtable,
                            @RequestParam("files") MultipartFile files,
                            HttpServletRequest request){
        //上传图片
        movietable.setStatus(1);
        movietable.setSource("iqiyi");
        String oldFileName = files.getOriginalFilename();
        int index=oldFileName.lastIndexOf(".");
        String suffix = oldFileName.substring(index);
        String newFileName = UUID.randomUUID().toString()+suffix;
        File filepath = new File(request.getSession().getServletContext().getRealPath("photo"),newFileName);
        try {
            files.transferTo(filepath);
            movietable.setSaveimagepath("/photo/"+newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //新增电影
        BaseResult result=movieTableService.addMovie(movietable,moviedetailtable);
        if(result.isSuccess()){
            return "redirect:/movie/show-movie";
        }else{
           // return "WEB-INF/jsp/movie/movieadd";
            return "forward:/movie/show-add-movie";
        }
    }
}
