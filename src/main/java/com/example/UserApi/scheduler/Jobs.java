package com.example.UserApi.scheduler;

import com.example.UserApi.repo.UserRepo;
import com.example.UserApi.service.FetchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Jobs {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private FetchService fetchService;

//    @Scheduled(cron = "${Get-User-Scheduler}")
//    public void startUserJob(){
//        fetchService.getUsers();
//    }

//    @Scheduled(cron = "${Get-Comment-Scheduler}")
//    public void startCommentJob(){
//        fetchService.getComments();
//    }

//    @Scheduled(cron = "${Get-Post-Scheduler}")
//    public void startPostJob(){
//        fetchService.getPosts();
//    }
}
