package az.lsim.bulksms.controller;

import az.lsim.bulksms.dto.BulkDto;
import az.lsim.bulksms.dto.SmsStatus;
import az.lsim.bulksms.service.BulkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sms")

public class BulkRestController {

    @Autowired
    private BulkService bulkService;


    @PostMapping("/send")
    public void sendSms(@RequestBody BulkDto bulkDto) {
        bulkService.sendSms(bulkDto);
    }

    @GetMapping("/send")
    public SmsStatus getSmsStatus(@RequestParam("msisdn") String msisdn,
                                  @RequestParam("senderName") String senderName,
                                  @RequestParam("messageBody") String messageBody) {
        return bulkService.getSmsStatus(msisdn, senderName, messageBody);
    }


}
