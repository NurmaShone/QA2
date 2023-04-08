package com.example.QA.controllers;

import lombok.RequiredArgsConstructor;
import models.Market;
import org.h2.engine.Mode;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import services.MarketService;
import org.springframework.ui.Model;
@Controller
@RequiredArgsConstructor

@Component
public class MarketController {
    private final MarketService marketService;
    @GetMapping("/")
    public String markets(Model model){
        model.addAttribute("markets", marketService.listMarkets());
        return "markets";

    }
@GetMapping("/market/{id}")
    public String marketInfo(@PathVariable  Long id, Model model){
        model.addAttribute("market", marketService.getMarketById(id));
return "market-info";
    }
@PostMapping("/market/create")
    public String createMarket(Market market){
marketService.saveMarket(market);
return "redirect:/ ";
    }
@PostMapping("market/delete/{id}")
    public String deleteMarket (@PathVariable Long id){
        marketService.deleteMarket(id);
    return "redirect:/ ";

    }
}
