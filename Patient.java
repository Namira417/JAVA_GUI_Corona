// 환자 정보

public class Patient {
    // 일련 번호
    int id;

    // 확진 날짜
    String influe_Date;

    // 환자 번호
    int patient_Number;

    // 거주지
    String residence;

    // 여행 이력
    String travel;

    // 접촉 지역
    String connect_Region;

    // 환자 상태
    String patient_Status;

    // 이동 경로
    String route;

    // 등록 일자
    String registration_Date;

    // 수정 일자
    String modified_Date;

    // 노출여부
    String exposure;

    // 매개변수를 받지 않았을 시
    public Patient() {
        this.setId(0);
        this.setInflue_Date("2020.00.00");
        this.setPatient_Number(0);
        this.setResidence("");
        this.setTravel("");
        this.setConnect_Region("");
        this.setPatient_Status("");
        this.setRoute("");
        this.setRegistraion_Date("2020.00.00");
        this.setModified_Date("2020.00.00");
        this.setExposure("N");
    }

    // 매개변수를 받았을 시
    public Patient(int id, String influe_Date, int patient_Number, String residence, String travel,
            String connect_region, String patient_Status, String route, String registraion_Date, String modified_Date,
            String exposure) {
        this.setId(id);
        this.setInflue_Date(influe_Date);
        this.setPatient_Number(patient_Number);
        this.setResidence(residence);
        this.setTravel(travel);
        this.setConnect_Region(connect_region);
        this.setPatient_Status(patient_Status);
        this.setRoute(route);
        this.setRegistraion_Date(registraion_Date);
        this.setModified_Date(modified_Date);
        this.setExposure(exposure);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setInflue_Date(String influe_Date) {
        this.influe_Date = influe_Date;
    }

    public void setPatient_Number(int patient_Number) {
        this.patient_Number = patient_Number;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public void setConnect_Region(String connect_Region) {
        this.connect_Region = connect_Region;
    }

    public void setPatient_Status(String patient_Status) {
        this.patient_Status = patient_Status;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void setRegistraion_Date(String registration_Date) {
        this.registration_Date = registration_Date;
    }

    public void setModified_Date(String modified_Date) {
        this.modified_Date = modified_Date;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public int getId() {
        return id;
    }

    public String getInflue_Date() {
        return influe_Date;
    }

    public int getPatient_Number() {
        return patient_Number;
    }

    public String getResidence() {
        return residence;
    }

    public String getTravel() {
        return travel;
    }

    public String getConnect_Region() {
        return connect_Region;
    }

    public String getPatient_Status() {
        return patient_Status;
    }

    public String getRoute() {
        return route;
    }

    public String getRegistraion_Date() {
        return registration_Date;
    }

    public String getModified_Date() {
        return modified_Date;
    }

    public String getExposure() {
        return exposure;
    }
}
