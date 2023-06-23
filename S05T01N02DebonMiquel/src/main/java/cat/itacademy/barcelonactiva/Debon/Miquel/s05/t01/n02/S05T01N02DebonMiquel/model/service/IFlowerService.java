package cat.itacademy.barcelonactiva.Debon.Miquel.s05.t01.n02.S05T01N02DebonMiquel.model.service;

import cat.itacademy.barcelonactiva.Debon.Miquel.s05.t01.n02.S05T01N02DebonMiquel.model.DTO.FlowerDTO;
import cat.itacademy.barcelonactiva.Debon.Miquel.s05.t01.n02.S05T01N02DebonMiquel.model.domainEntity.Flower;

import java.util.List;
import java.util.Optional;

public interface IFlowerService {
    boolean existFlowerById(int id);
    Optional<FlowerDTO> getOne(int id);
    List<FlowerDTO> getAll();
    void delete(int id);
    void save(Flower flower);

}
