package az.lsim.bulksms.service;

import az.lsim.bulksms.dto.BulkDto;
import az.lsim.bulksms.dto.SmsStatus;

public interface BulkService {

    void sendSms(BulkDto bulkDto);

    SmsStatus getSmsStatus(String msisdn, String senderName, String messageBody);
}
