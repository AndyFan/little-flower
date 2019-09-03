package org.kite.little.flower.controller;

import org.kite.little.flower.dto.Overview;
import org.kite.little.flower.service.MonitorDashboardService;
import org.kite.little.flower.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MonitorController
 *
 * @author fengzheng
 * @date 2019/8/6
 */
@RestController
@RequestMapping(value = "dashboard")
public class MonitorController {

    @Autowired
    private MonitorDashboardService monitorDashboardService;

    @GetMapping(value = "overview")
    public Result<Overview> overview(){
        Overview overview = monitorDashboardService.overview();
        return Result.success(overview);
    }

    @GetMapping(value = "abTest")
    public Result<String> abTest(){
        return Result.success("OK");
    }

}
