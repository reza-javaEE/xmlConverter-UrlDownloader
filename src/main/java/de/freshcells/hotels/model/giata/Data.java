package de.freshcells.hotels.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data implements Serializable {

    public String Hotelname;
    public String Stadtname;
    public String Zielgebietsname;
    public int Stadtnummer;
    public int Zielgebietsnummer;
    public String Landname;
    public String Landcode;
    public String Veranstaltercode;
    public Date datestart;
    public Date dateend;
    public GeoData GeoData;
    public String Objectcode;
    public Objectcodes Objectcodes;
    public Text Text;
    public String Landkarte;
    public Climate climate;
    public int KatalogID;
    public int Katalogseite;
    public int Preisseite;
    public String Katalogname;
    public String Veranstaltername;
    public int VeranstalterID;
    public int KataloghotelID;
    public String KatalogSaisonTyp;
    public List<Bildfile> Bildfile;
    public String Textfile;
    public String Klimagrafik;
    public String AGB;
    public String TDS;
    public int id;
    //    @XmlAttribute("Text")
    public String text;


    public Data() {
    }

    public Data(String hotelname, String stadtname, String zielgebietsname, int stadtnummer, int zielgebietsnummer, String landname, String landcode, String veranstaltercode, Date datestart, Date dateend, de.freshcells.hotels.model.giata.GeoData geoData, String objectcode, de.freshcells.hotels.model.giata.Objectcodes objectcodes, de.freshcells.hotels.model.giata.Text text, String landkarte, Climate climate, int katalogID, int katalogseite, int preisseite, String katalogname, String veranstaltername, int veranstalterID, int kataloghotelID, String katalogSaisonTyp, List<de.freshcells.hotels.model.giata.Bildfile> bildfile, String textfile, String klimagrafik, String AGB, String TDS, int id, String text1) {
        Hotelname = hotelname;
        Stadtname = stadtname;
        Zielgebietsname = zielgebietsname;
        Stadtnummer = stadtnummer;
        Zielgebietsnummer = zielgebietsnummer;
        Landname = landname;
        Landcode = landcode;
        Veranstaltercode = veranstaltercode;
        this.datestart = datestart;
        this.dateend = dateend;
        GeoData = geoData;
        Objectcode = objectcode;
        Objectcodes = objectcodes;
        Text = text;
        Landkarte = landkarte;
        this.climate = climate;
        KatalogID = katalogID;
        Katalogseite = katalogseite;
        Preisseite = preisseite;
        Katalogname = katalogname;
        Veranstaltername = veranstaltername;
        VeranstalterID = veranstalterID;
        KataloghotelID = kataloghotelID;
        KatalogSaisonTyp = katalogSaisonTyp;
        Bildfile = bildfile;
        Textfile = textfile;
        Klimagrafik = klimagrafik;
        this.AGB = AGB;
        this.TDS = TDS;
        this.id = id;
        this.text = text1;
    }

    public String getHotelname() {
        return Hotelname;
    }

    public void setHotelname(String hotelname) {
        Hotelname = hotelname;
    }

    public String getStadtname() {
        return Stadtname;
    }

    public void setStadtname(String stadtname) {
        Stadtname = stadtname;
    }

    public String getZielgebietsname() {
        return Zielgebietsname;
    }

    public void setZielgebietsname(String zielgebietsname) {
        Zielgebietsname = zielgebietsname;
    }

    public int getStadtnummer() {
        return Stadtnummer;
    }

    public void setStadtnummer(int stadtnummer) {
        Stadtnummer = stadtnummer;
    }

    public int getZielgebietsnummer() {
        return Zielgebietsnummer;
    }

    public void setZielgebietsnummer(int zielgebietsnummer) {
        Zielgebietsnummer = zielgebietsnummer;
    }

    public String getLandname() {
        return Landname;
    }

    public void setLandname(String landname) {
        Landname = landname;
    }

    public String getLandcode() {
        return Landcode;
    }

    public void setLandcode(String landcode) {
        Landcode = landcode;
    }

    public String getVeranstaltercode() {
        return Veranstaltercode;
    }

    public void setVeranstaltercode(String veranstaltercode) {
        Veranstaltercode = veranstaltercode;
    }

    public Date getDatestart() {
        return datestart;
    }

    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }

    public Date getDateend() {
        return dateend;
    }

    public void setDateend(Date dateend) {
        this.dateend = dateend;
    }

    public de.freshcells.hotels.model.giata.GeoData getGeoData() {
        return GeoData;
    }

    public void setGeoData(de.freshcells.hotels.model.giata.GeoData geoData) {
        GeoData = geoData;
    }

    public String getObjectcode() {
        return Objectcode;
    }

    public void setObjectcode(String objectcode) {
        Objectcode = objectcode;
    }

    public de.freshcells.hotels.model.giata.Objectcodes getObjectcodes() {
        return Objectcodes;
    }

    public void setObjectcodes(de.freshcells.hotels.model.giata.Objectcodes objectcodes) {
        Objectcodes = objectcodes;
    }

    public de.freshcells.hotels.model.giata.Text getText() {
        return Text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setText(de.freshcells.hotels.model.giata.Text text) {
        Text = text;
    }

    public String getLandkarte() {
        return Landkarte;
    }

    public void setLandkarte(String landkarte) {
        Landkarte = landkarte;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    public int getKatalogID() {
        return KatalogID;
    }

    public void setKatalogID(int katalogID) {
        KatalogID = katalogID;
    }

    public int getKatalogseite() {
        return Katalogseite;
    }

    public void setKatalogseite(int katalogseite) {
        Katalogseite = katalogseite;
    }

    public int getPreisseite() {
        return Preisseite;
    }

    public void setPreisseite(int preisseite) {
        Preisseite = preisseite;
    }

    public String getKatalogname() {
        return Katalogname;
    }

    public void setKatalogname(String katalogname) {
        Katalogname = katalogname;
    }

    public String getVeranstaltername() {
        return Veranstaltername;
    }

    public void setVeranstaltername(String veranstaltername) {
        Veranstaltername = veranstaltername;
    }

    public int getVeranstalterID() {
        return VeranstalterID;
    }

    public void setVeranstalterID(int veranstalterID) {
        VeranstalterID = veranstalterID;
    }

    public int getKataloghotelID() {
        return KataloghotelID;
    }

    public void setKataloghotelID(int kataloghotelID) {
        KataloghotelID = kataloghotelID;
    }

    public String getKatalogSaisonTyp() {
        return KatalogSaisonTyp;
    }

    public void setKatalogSaisonTyp(String katalogSaisonTyp) {
        KatalogSaisonTyp = katalogSaisonTyp;
    }

    public List<de.freshcells.hotels.model.giata.Bildfile> getBildfile() {
        return Bildfile;
    }

    public void setBildfile(List<de.freshcells.hotels.model.giata.Bildfile> bildfile) {
        Bildfile = bildfile;
    }

    public String getTextfile() {
        return Textfile;
    }

    public void setTextfile(String textfile) {
        Textfile = textfile;
    }

    public String getKlimagrafik() {
        return Klimagrafik;
    }

    public void setKlimagrafik(String klimagrafik) {
        Klimagrafik = klimagrafik;
    }

    public String getAGB() {
        return AGB;
    }

    public void setAGB(String AGB) {
        this.AGB = AGB;
    }

    public String getTDS() {
        return TDS;
    }

    public void setTDS(String TDS) {
        this.TDS = TDS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Hotelname='" + Hotelname + '\'' +
                ", Stadtname='" + Stadtname + '\'' +
                ", Zielgebietsname='" + Zielgebietsname + '\'' +
                ", Stadtnummer=" + Stadtnummer +
                ", Zielgebietsnummer=" + Zielgebietsnummer +
                ", Landname='" + Landname + '\'' +
                ", Landcode='" + Landcode + '\'' +
                ", Veranstaltercode='" + Veranstaltercode + '\'' +
                ", datestart=" + datestart +
                ", dateend=" + dateend +
                ", GeoData=" + GeoData +
                ", Objectcode='" + Objectcode + '\'' +
                ", Objectcodes=" + Objectcodes +
                ", Text=" + Text +
                ", Landkarte='" + Landkarte + '\'' +
                ", climate=" + climate +
                ", KatalogID=" + KatalogID +
                ", Katalogseite=" + Katalogseite +
                ", Preisseite=" + Preisseite +
                ", Katalogname='" + Katalogname + '\'' +
                ", Veranstaltername='" + Veranstaltername + '\'' +
                ", VeranstalterID=" + VeranstalterID +
                ", KataloghotelID=" + KataloghotelID +
                ", KatalogSaisonTyp='" + KatalogSaisonTyp + '\'' +
                ", Bildfile=" + Bildfile +
                ", Textfile='" + Textfile + '\'' +
                ", Klimagrafik='" + Klimagrafik + '\'' +
                ", AGB='" + AGB + '\'' +
                ", TDS='" + TDS + '\'' +
                ", id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
