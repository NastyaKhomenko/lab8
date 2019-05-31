package lviv.iot.lab8;


import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.CarCleaningGoods.models.CarCleaningGoods;

public interface CarCleaningGoodsRepository 
extends CrudRepository<CarCleaningGoods, Integer> {

}
