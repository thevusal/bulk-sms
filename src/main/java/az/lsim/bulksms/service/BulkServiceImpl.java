package az.lsim.bulksms.service;

import az.lsim.bulksms.Entity.Bulk;
import az.lsim.bulksms.dao.BulkRepository;
import az.lsim.bulksms.dto.BulkDto;
import az.lsim.bulksms.dto.SmsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BulkServiceImpl implements BulkService {
    @Autowired
    private BulkRepository bulkRepository;

    @Override
    public void sendSms(BulkDto bulkDto) {
        Bulk bulk = getBulk(bulkDto);
        bulkRepository.save(bulk);
    }

    private Bulk getBulk(BulkDto bulkDto) {
        Bulk bulk = new Bulk();
//        bulk.getDoneDate(bulkDto.getDoneDate());
        bulk.setIsSent(bulkDto.getIsSent());


        return bulk;
    }

    @Override
    public SmsStatus getSmsStatus(String msisdn, String senderName, String messageBody) {
        return null;
    }
}
