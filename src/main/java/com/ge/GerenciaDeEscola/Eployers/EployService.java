package com.ge.GerenciaDeEscola.Eployers;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EployService {

    private EployRepository eployeRepository;

    public EployService(EployRepository eployeRepository) {

        this.eployeRepository = eployeRepository;

    }

    public List<EployeModel> EployToList(){
            return eployeRepository.findAll();
    }
}
