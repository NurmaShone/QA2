package services;

import models.Market;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class MarketService {
    private long ID = 0;
    private List<Market> markets = new ArrayList<>();
    {
        markets.add(new Market(++ID,"Globus", "Bishkek", "Yunusalieva", 24, 8, 12));
        markets.add(new Market(++ID,"Frunze", "Osh", "Moskovskaya", 12, 8, 12));

    }

    public List <Market> listMarkets (){
        return markets;
    }

    public void saveMarket(Market market){
        market.setId(++ID);
        markets.add(market);
    }

    public void deleteMarket (Long id){
        markets.removeIf(market -> market.getId() == id);
    }

    public Market getMarketById(Long id){
        for (Market market : markets) {
            if (market.getId() == id) return market;
        }
        return null;
    }
}
