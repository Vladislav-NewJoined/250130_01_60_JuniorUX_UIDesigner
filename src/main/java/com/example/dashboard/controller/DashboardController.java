package com.example.dashboard.controller;

import com.example.dashboard.model.Station;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        List<Station> stations = fetchStations(); // Метод для получения данных о станциях
        model.addAttribute("stations", stations);
        return "dashboard"; // Имя шаблона HTML
    }

    private List<Station> fetchStations() {
        // Логика получения данных о станциях (например, из базы данных)
        return List.of(new Station("Cafe 1", "Address 1", true, 95.0, "9 AM - 9 PM", 1000.0, 10.0, 5.0));
    }
}
