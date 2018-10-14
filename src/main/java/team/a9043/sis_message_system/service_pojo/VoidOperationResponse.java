package team.a9043.sis_message_system.service_pojo;

import java.io.Serializable;

/**
 * @author a9043
 */
public class VoidOperationResponse extends OperationResponse<Void> implements Serializable {
    public VoidOperationResponse() {
    }

    public VoidOperationResponse(boolean success, String message) {
        super(success, message);
    }

    public void setData(Void data) {
    }

    public Void getData() {
        return null;
    }
}
