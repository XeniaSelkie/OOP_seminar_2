package ru.gb.lessons.interfaces.core.clients.supports;

import java.util.Date;

/**
 * Запись в карточке пациента.
 */
public class Record {
    private String record;
    private Date date;

    public Record(String record, Date date) {
        this.record = record;
        this.date = date;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "record='" + record + '\'' +
                ", date=" + date +
                '}';
    }
}
