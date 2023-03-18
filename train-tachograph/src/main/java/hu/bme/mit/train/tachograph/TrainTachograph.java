package hu.bme.mit.train.tachograph;

import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import java.time.LocalDateTime;

public class TrainTachograph {

    public Table<LocalDateTime, Integer, Integer> dataTable = HashBasedTable.create();

    public void updateTachograph(int speed, int joystickPosition){
        this.dataTable.put(LocalDateTime.now(), Integer.valueOf(speed), Integer.valueOf(joystickPosition));
        //this.dataTable.put(null, null, null);
    }
}