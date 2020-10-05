package az.lsim.bulksms.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class BulkDto {

    @Pattern(regexp = "\\+994?(50|51|55|60|70|77|99)[0-9]{7}", message = "INVALID_PHONE_NUMBER")
    @NotNull
    private String msisdn;

    @NotNull
    private String senderName;

    @NotNull
    private String messageBody;

    @Builder.Default
    private Date insertDate = new Date();

    @Builder.Default
    private Date doneDate = null;

    @Builder.Default
    private int isSent = 0;

    @Builder.Default
    private int status = 1;


    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public int getIsSent() {
        return isSent;
    }

    public void setIsSent(int isSent) {
        this.isSent = isSent;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
