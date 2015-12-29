package com.example.s198569.fnuggno.model.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Fetche all the API elements for all resorts.
 * Created by luke on 11/19/15.
 */
public class ResponseHuge implements Serializable{

    private int took;
    private boolean timed_out;
    private ShardsEntity _shards;
    private Hits hits;
    private AggregationsEntity aggregations;

    public void setTook(int took) {
        this.took = took;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }

    public void set_shards(ShardsEntity _shards) {
        this._shards = _shards;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    public void setAggregations(AggregationsEntity aggregations) {
        this.aggregations = aggregations;
    }

    public int getTook() {
        return took;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public ShardsEntity get_shards() {
        return _shards;
    }

    public Hits getHits() {
        return hits;
    }

    public AggregationsEntity getAggregations() {
        return aggregations;
    }

    public static class ShardsEntity implements Serializable{
        private int total;
        private int successful;
        private int failed;

        public void setTotal(int total) {
            this.total = total;
        }

        public void setSuccessful(int successful) {
            this.successful = successful;
        }

        public void setFailed(int failed) {
            this.failed = failed;
        }

        public int getTotal() {
            return total;
        }

        public int getSuccessful() {
            return successful;
        }

        public int getFailed() {
            return failed;
        }
    }

    public static class Hits implements Serializable{

        private int total;
        private int max_score;
        private List<HitsEntity> hits;

        public void setTotal(int total) {
            this.total = total;
        }

        public void setMax_score(int max_score) {
            this.max_score = max_score;
        }

        public void setHits(List<HitsEntity> hits) {
            this.hits = hits;
        }

        public int getTotal() {
            return total;
        }

        public int getMax_score() {
            return max_score;
        }

        public List<HitsEntity> getHits() {
            return hits;
        }

        public static class HitsEntity implements Serializable{
            private String _index;
            private String _type;
            private String _id;
            private int _score;
            private SourceEntity _source;

            public void set_index(String _index) {
                this._index = _index;
            }

            public void set_type(String _type) {
                this._type = _type;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public void set_score(int _score) {
                this._score = _score;
            }

            public void set_source(SourceEntity _source) {
                this._source = _source;
            }

            public String get_index() {
                return _index;
            }

            public String get_type() {
                return _type;
            }

            public String get_id() {
                return _id;
            }

            public int get_score() {
                return _score;
            }

            public SourceEntity get_source() {
                return _source;
            }

            public static class SourceEntity implements Serializable{
                private int id;
                private String name;
                private String description;
                private ContactEntity contact;
                private OpeningHoursEntity opening_hours;
                private LiftsEntity lifts;
                private SlopesEntity slopes;
                private Object slope_map;
                private ImagesEntity images;
                private SocialMediaEntity social_media;
                private Object booking;
                private UrlsEntity urls;
                private String park_description;
                private LocationEntity location;
                private WeatherZonesEntity weather_zones;
                private ConditionsEntity conditions;
                private String last_updated;
                private String site_path;
                private List<?> lift_ticket_prices;
                private List<?> resort_type;
                private List<?> region;
                private List<NearestResortsEntity> nearest_resorts;

                public void setId(int id) {
                    this.id = id;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public void setContact(ContactEntity contact) {
                    this.contact = contact;
                }

                public void setOpening_hours(OpeningHoursEntity opening_hours) {
                    this.opening_hours = opening_hours;
                }

                public void setLifts(LiftsEntity lifts) {
                    this.lifts = lifts;
                }

                public void setSlopes(SlopesEntity slopes) {
                    this.slopes = slopes;
                }

                public void setSlope_map(Object slope_map) {
                    this.slope_map = slope_map;
                }

                public void setImages(ImagesEntity images) {
                    this.images = images;
                }

                public void setSocial_media(SocialMediaEntity social_media) {
                    this.social_media = social_media;
                }

                public void setBooking(Object booking) {
                    this.booking = booking;
                }

                public void setUrls(UrlsEntity urls) {
                    this.urls = urls;
                }

                public void setPark_description(String park_description) {
                    this.park_description = park_description;
                }

                public void setLocation(LocationEntity location) {
                    this.location = location;
                }

                public void setWeather_zones(WeatherZonesEntity weather_zones) {
                    this.weather_zones = weather_zones;
                }

                public void setConditions(ConditionsEntity conditions) {
                    this.conditions = conditions;
                }

                public void setLast_updated(String last_updated) {
                    this.last_updated = last_updated;
                }

                public void setSite_path(String site_path) {
                    this.site_path = site_path;
                }

                public void setLift_ticket_prices(List<?> lift_ticket_prices) {
                    this.lift_ticket_prices = lift_ticket_prices;
                }

                public void setResort_type(List<?> resort_type) {
                    this.resort_type = resort_type;
                }

                public void setRegion(List<?> region) {
                    this.region = region;
                }

                public void setNearest_resorts(List<NearestResortsEntity> nearest_resorts) {
                    this.nearest_resorts = nearest_resorts;
                }

                public int getId() {
                    return id;
                }

                public String getName() {
                    return name;
                }

                public String getDescription() {
                    return description;
                }

                public ContactEntity getContact() {
                    return contact;
                }

                public OpeningHoursEntity getOpening_hours() {
                    return opening_hours;
                }

                public LiftsEntity getLifts() {
                    return lifts;
                }

                public SlopesEntity getSlopes() {
                    return slopes;
                }

                public Object getSlope_map() {
                    return slope_map;
                }

                public ImagesEntity getImages() {
                    return images;
                }

                public SocialMediaEntity getSocial_media() {
                    return social_media;
                }

                public Object getBooking() {
                    return booking;
                }

                public UrlsEntity getUrls() {
                    return urls;
                }

                public String getPark_description() {
                    return park_description;
                }

                public LocationEntity getLocation() {
                    return location;
                }

                public WeatherZonesEntity getWeather_zones() {
                    return weather_zones;
                }

                public ConditionsEntity getConditions() {
                    return conditions;
                }

                public String getLast_updated() {
                    return last_updated;
                }

                public String getSite_path() {
                    return site_path;
                }

                public List<?> getLift_ticket_prices() {
                    return lift_ticket_prices;
                }

                public List<?> getResort_type() {
                    return resort_type;
                }

                public List<?> getRegion() {
                    return region;
                }

                public List<NearestResortsEntity> getNearest_resorts() {
                    return nearest_resorts;
                }

                public static class ContactEntity implements Serializable{
                    private String address;
                    private String zip_code;
                    private String city;
                    private String phone_servicecenter;
                    private String phone_skipatrol;
                    private String call_number;
                    private String email;

                    public void setAddress(String address) {
                        this.address = address;
                    }

                    public void setZip_code(String zip_code) {
                        this.zip_code = zip_code;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public void setPhone_servicecenter(String phone_servicecenter) {
                        this.phone_servicecenter = phone_servicecenter;
                    }

                    public void setPhone_skipatrol(String phone_skipatrol) {
                        this.phone_skipatrol = phone_skipatrol;
                    }

                    public void setCall_number(String call_number) {
                        this.call_number = call_number;
                    }

                    public void setEmail(String email) {
                        this.email = email;
                    }

                    public String getAddress() {
                        return address;
                    }

                    public String getZip_code() {
                        return zip_code;
                    }

                    public String getCity() {
                        return city;
                    }

                    public String getPhone_servicecenter() {
                        return phone_servicecenter;
                    }

                    public String getPhone_skipatrol() {
                        return phone_skipatrol;
                    }

                    public String getCall_number() {
                        return call_number;
                    }

                    public String getEmail() {
                        return email;
                    }
                }

                public static class OpeningHoursEntity implements Serializable{

                    private MondayEntity monday;
                    private TuesdayEntity tuesday;
                    private WednesdayEntity wednesday;
                    private ThursdayEntity thursday;
                    private FridayEntity friday;
                    private SaturdayEntity saturday;
                    private SundayEntity sunday;
                    private List<?> exception_days;

                    public void setMonday(MondayEntity monday) {
                        this.monday = monday;
                    }

                    public void setTuesday(TuesdayEntity tuesday) {
                        this.tuesday = tuesday;
                    }

                    public void setWednesday(WednesdayEntity wednesday) {
                        this.wednesday = wednesday;
                    }

                    public void setThursday(ThursdayEntity thursday) {
                        this.thursday = thursday;
                    }

                    public void setFriday(FridayEntity friday) {
                        this.friday = friday;
                    }

                    public void setSaturday(SaturdayEntity saturday) {
                        this.saturday = saturday;
                    }

                    public void setSunday(SundayEntity sunday) {
                        this.sunday = sunday;
                    }

                    public void setException_days(List<?> exception_days) {
                        this.exception_days = exception_days;
                    }

                    public MondayEntity getMonday() {
                        return monday;
                    }

                    public TuesdayEntity getTuesday() {
                        return tuesday;
                    }

                    public WednesdayEntity getWednesday() {
                        return wednesday;
                    }

                    public ThursdayEntity getThursday() {
                        return thursday;
                    }

                    public FridayEntity getFriday() {
                        return friday;
                    }

                    public SaturdayEntity getSaturday() {
                        return saturday;
                    }

                    public SundayEntity getSunday() {
                        return sunday;
                    }

                    public List<?> getException_days() {
                        return exception_days;
                    }

                    public static class MondayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class TuesdayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class WednesdayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class ThursdayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class FridayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class SaturdayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }

                    public static class SundayEntity implements Serializable{
                        private String from;
                        private String to;
                        private boolean closed;

                        public void setFrom(String from) {
                            this.from = from;
                        }

                        public void setTo(String to) {
                            this.to = to;
                        }

                        public void setClosed(boolean closed) {
                            this.closed = closed;
                        }

                        public String getFrom() {
                            return from;
                        }

                        public String getTo() {
                            return to;
                        }

                        public boolean isClosed() {
                            return closed;
                        }
                    }
                }

                public static class LiftsEntity implements Serializable{
                    private int count;
                    private int open;
                    private int closed;
                    private List<ListEntity> list;

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public void setOpen(int open) {
                        this.open = open;
                    }

                    public void setClosed(int closed) {
                        this.closed = closed;
                    }

                    public void setList(List<ListEntity> list) {
                        this.list = list;
                    }

                    public int getCount() {
                        return count;
                    }

                    public int getOpen() {
                        return open;
                    }

                    public int getClosed() {
                        return closed;
                    }

                    public List<ListEntity> getList() {
                        return list;
                    }

                    public static class ListEntity implements Serializable{
                        private String name;
                        private String status;

                        public void setName(String name) {
                            this.name = name;
                        }

                        public void setStatus(String status) {
                            this.status = status;
                        }

                        public String getName() {
                            return name;
                        }

                        public String getStatus() {
                            return status;
                        }
                    }
                }

                public static class SlopesEntity implements Serializable{
                    private int count;
                    private int open;
                    private int closed;
                    private List<ListEntity> list;

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public void setOpen(int open) {
                        this.open = open;
                    }

                    public void setClosed(int closed) {
                        this.closed = closed;
                    }

                    public void setList(List<ListEntity> list) {
                        this.list = list;
                    }

                    public int getCount() {
                        return count;
                    }

                    public int getOpen() {
                        return open;
                    }

                    public int getClosed() {
                        return closed;
                    }

                    public List<ListEntity> getList() {
                        return list;
                    }

                    public static class ListEntity implements Serializable{
                        private String name;
                        private String status;

                        public void setName(String name) {
                            this.name = name;
                        }

                        public void setStatus(String status) {
                            this.status = status;
                        }

                        public String getName() {
                            return name;
                        }

                        public String getStatus() {
                            return status;
                        }
                    }
                }

                public static class ImagesEntity implements Serializable{
                    private String last_updated;
                    private Object photo_credit;
                    private String image_full;
                    private String image_16_9_xl;
                    private String image_1_1_l;
                    private String image_1_1_s;
                    private String image_16_9_m;
                    private String image_16_9_s;
                    private MobileEntity mobile;

                    public void setLast_updated(String last_updated) {
                        this.last_updated = last_updated;
                    }

                    public void setPhoto_credit(Object photo_credit) {
                        this.photo_credit = photo_credit;
                    }

                    public void setImage_full(String image_full) {
                        this.image_full = image_full;
                    }

                    public void setImage_16_9_xl(String image_16_9_xl) {
                        this.image_16_9_xl = image_16_9_xl;
                    }

                    public void setImage_1_1_l(String image_1_1_l) {
                        this.image_1_1_l = image_1_1_l;
                    }

                    public void setImage_1_1_s(String image_1_1_s) {
                        this.image_1_1_s = image_1_1_s;
                    }

                    public void setImage_16_9_m(String image_16_9_m) {
                        this.image_16_9_m = image_16_9_m;
                    }

                    public void setImage_16_9_s(String image_16_9_s) {
                        this.image_16_9_s = image_16_9_s;
                    }

                    public void setMobile(MobileEntity mobile) {
                        this.mobile = mobile;
                    }

                    public String getLast_updated() {
                        return last_updated;
                    }

                    public Object getPhoto_credit() {
                        return photo_credit;
                    }

                    public String getImage_full() {
                        return image_full;
                    }

                    public String getImage_16_9_xl() {
                        return image_16_9_xl;
                    }

                    public String getImage_1_1_l() {
                        return image_1_1_l;
                    }

                    public String getImage_1_1_s() {
                        return image_1_1_s;
                    }

                    public String getImage_16_9_m() {
                        return image_16_9_m;
                    }

                    public String getImage_16_9_s() {
                        return image_16_9_s;
                    }

                    public MobileEntity getMobile() {
                        return mobile;
                    }

                    public static class MobileEntity implements Serializable{

                        private Scale1Entity scale1;
                        private Scale2Entity scale2;
                        private Scale3Entity scale3;

                        public void setScale1(Scale1Entity scale1) {
                            this.scale1 = scale1;
                        }

                        public void setScale2(Scale2Entity scale2) {
                            this.scale2 = scale2;
                        }

                        public void setScale3(Scale3Entity scale3) {
                            this.scale3 = scale3;
                        }

                        public Scale1Entity getScale1() {
                            return scale1;
                        }

                        public Scale2Entity getScale2() {
                            return scale2;
                        }

                        public Scale3Entity getScale3() {
                            return scale3;
                        }

                        public static class Scale1Entity implements Serializable{
                            private String small_thumbnail;
                            private String big_thumbnail;
                            private String cover;

                            public void setSmall_thumbnail(String small_thumbnail) {
                                this.small_thumbnail = small_thumbnail;
                            }

                            public void setBig_thumbnail(String big_thumbnail) {
                                this.big_thumbnail = big_thumbnail;
                            }

                            public void setCover(String cover) {
                                this.cover = cover;
                            }

                            public String getSmall_thumbnail() {
                                return small_thumbnail;
                            }

                            public String getBig_thumbnail() {
                                return big_thumbnail;
                            }

                            public String getCover() {
                                return cover;
                            }
                        }

                        public static class Scale2Entity implements Serializable{
                            private String small_thumbnail;
                            private String big_thumbnail;
                            private String cover;

                            public void setSmall_thumbnail(String small_thumbnail) {
                                this.small_thumbnail = small_thumbnail;
                            }

                            public void setBig_thumbnail(String big_thumbnail) {
                                this.big_thumbnail = big_thumbnail;
                            }

                            public void setCover(String cover) {
                                this.cover = cover;
                            }

                            public String getSmall_thumbnail() {
                                return small_thumbnail;
                            }

                            public String getBig_thumbnail() {
                                return big_thumbnail;
                            }

                            public String getCover() {
                                return cover;
                            }
                        }

                        public static class Scale3Entity implements Serializable{
                            private String small_thumbnail;
                            private String big_thumbnail;
                            private String cover;

                            public void setSmall_thumbnail(String small_thumbnail) {
                                this.small_thumbnail = small_thumbnail;
                            }

                            public void setBig_thumbnail(String big_thumbnail) {
                                this.big_thumbnail = big_thumbnail;
                            }

                            public void setCover(String cover) {
                                this.cover = cover;
                            }

                            public String getSmall_thumbnail() {
                                return small_thumbnail;
                            }

                            public String getBig_thumbnail() {
                                return big_thumbnail;
                            }

                            public String getCover() {
                                return cover;
                            }
                        }
                    }
                }

                public static class SocialMediaEntity implements Serializable{
                    private String twitter;
                    private String instagram;

                    public void setTwitter(String twitter) {
                        this.twitter = twitter;
                    }

                    public void setInstagram(String instagram) {
                        this.instagram = instagram;
                    }

                    public String getTwitter() {
                        return twitter;
                    }

                    public String getInstagram() {
                        return instagram;
                    }
                }

                public static class UrlsEntity implements Serializable{
                    private String homepage;
                    private String opening_hours;
                    private String lift_ticket_prices;

                    public void setHomepage(String homepage) {
                        this.homepage = homepage;
                    }

                    public void setOpening_hours(String opening_hours) {
                        this.opening_hours = opening_hours;
                    }

                    public void setLift_ticket_prices(String lift_ticket_prices) {
                        this.lift_ticket_prices = lift_ticket_prices;
                    }

                    public String getHomepage() {
                        return homepage;
                    }

                    public String getOpening_hours() {
                        return opening_hours;
                    }

                    public String getLift_ticket_prices() {
                        return lift_ticket_prices;
                    }
                }

                public static class LocationEntity implements Serializable{
                    private double lat;
                    private double lon;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLon(double lon) {
                        this.lon = lon;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLon() {
                        return lon;
                    }
                }

                public static class WeatherZonesEntity implements Serializable{

                    private String type;
                    private TopEntity top;

                    public void setType(String type) {
                        this.type = type;
                    }

                    public void setTop(TopEntity top) {
                        this.top = top;
                    }

                    public String getType() {
                        return type;
                    }

                    public TopEntity getTop() {
                        return top;
                    }

                    public static class TopEntity implements Serializable{
                        private double lat;
                        private double lon;

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public void setLon(double lon) {
                            this.lon = lon;
                        }

                        public double getLat() {
                            return lat;
                        }

                        public double getLon() {
                            return lon;
                        }
                    }
                }

                public static class ConditionsEntity implements Serializable{
                    private CurrentReportEntity current_report;
                    private CombinedEntity combined;
                    private ForecastEntity forecast;

                    public void setCurrent_report(CurrentReportEntity current_report) {
                        this.current_report = current_report;
                    }

                    public void setCombined(CombinedEntity combined) {
                        this.combined = combined;
                    }

                    public void setForecast(ForecastEntity forecast) {
                        this.forecast = forecast;
                    }

                    public CurrentReportEntity getCurrent_report() {
                        return current_report;
                    }

                    public CombinedEntity getCombined() {
                        return combined;
                    }

                    public ForecastEntity getForecast() {
                        return forecast;
                    }

                    public static class CurrentReportEntity implements Serializable{

                        private TopEntity top;

                        public void setTop(TopEntity top) {
                            this.top = top;
                        }

                        public TopEntity getTop() {
                            return top;
                        }

                        public static class TopEntity implements Serializable{
                            private Object id;
                            private String reporter;
                            private SnowEntity snow;
                            private String last_updated;
                            private Object condition;
                            private String condition_description;
                            private SymbolEntity symbol;
                            private TemperatureEntity temperature;
                            private WindEntity wind;
                            private String zone;

                            public void setId(Object id) {
                                this.id = id;
                            }

                            public void setReporter(String reporter) {
                                this.reporter = reporter;
                            }

                            public void setSnow(SnowEntity snow) {
                                this.snow = snow;
                            }

                            public void setLast_updated(String last_updated) {
                                this.last_updated = last_updated;
                            }

                            public void setCondition(Object condition) {
                                this.condition = condition;
                            }

                            public void setCondition_description(String condition_description) {
                                this.condition_description = condition_description;
                            }

                            public void setSymbol(SymbolEntity symbol) {
                                this.symbol = symbol;
                            }

                            public void setTemperature(TemperatureEntity temperature) {
                                this.temperature = temperature;
                            }

                            public void setWind(WindEntity wind) {
                                this.wind = wind;
                            }

                            public void setZone(String zone) {
                                this.zone = zone;
                            }

                            public Object getId() {
                                return id;
                            }

                            public String getReporter() {
                                return reporter;
                            }

                            public SnowEntity getSnow() {
                                return snow;
                            }

                            public String getLast_updated() {
                                return last_updated;
                            }

                            public Object getCondition() {
                                return condition;
                            }

                            public String getCondition_description() {
                                return condition_description;
                            }

                            public SymbolEntity getSymbol() {
                                return symbol;
                            }

                            public TemperatureEntity getTemperature() {
                                return temperature;
                            }

                            public WindEntity getWind() {
                                return wind;
                            }

                            public String getZone() {
                                return zone;
                            }

                            public static class SnowEntity implements Serializable{
                                private Object today;
                                private Object depth_terrain;
                                private Object depth_slope;
                                private String unit;

                                public void setToday(Object today) {
                                    this.today = today;
                                }

                                public void setDepth_terrain(Object depth_terrain) {
                                    this.depth_terrain = depth_terrain;
                                }

                                public void setDepth_slope(Object depth_slope) {
                                    this.depth_slope = depth_slope;
                                }

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public Object getToday() {
                                    return today;
                                }

                                public Object getDepth_terrain() {
                                    return depth_terrain;
                                }

                                public Object getDepth_slope() {
                                    return depth_slope;
                                }

                                public String getUnit() {
                                    return unit;
                                }
                            }

                            public static class SymbolEntity implements Serializable{
                                private Object fnugg_id;
                                private String name;

                                public void setFnugg_id(Object fnugg_id) {
                                    this.fnugg_id = fnugg_id;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public Object getFnugg_id() {
                                    return fnugg_id;
                                }

                                public String getName() {
                                    return name;
                                }
                            }

                            public static class TemperatureEntity implements Serializable{
                                private String unit;
                                private Object value;

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public void setValue(Object value) {
                                    this.value = value;
                                }

                                public String getUnit() {
                                    return unit;
                                }

                                public Object getValue() {
                                    return value;
                                }
                            }

                            public static class WindEntity implements Serializable{
                                private Object mps;
                                private String name;
                                private Object degree;
                                private String speed;
                                private String direction;

                                public void setMps(Object mps) {
                                    this.mps = mps;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public void setDegree(Object degree) {
                                    this.degree = degree;
                                }

                                public void setSpeed(String speed) {
                                    this.speed = speed;
                                }

                                public void setDirection(String direction) {
                                    this.direction = direction;
                                }

                                public Object getMps() {
                                    return mps;
                                }

                                public String getName() {
                                    return name;
                                }

                                public Object getDegree() {
                                    return degree;
                                }

                                public String getSpeed() {
                                    return speed;
                                }

                                public String getDirection() {
                                    return direction;
                                }
                            }
                        }
                    }

                    public static class CombinedEntity implements Serializable{

                        private TopEntity top;

                        public void setTop(TopEntity top) {
                            this.top = top;
                        }

                        public TopEntity getTop() {
                            return top;
                        }

                        public static class TopEntity implements Serializable{

                            private Object id;
                            private String reporter;
                            private SnowEntity snow;
                            private String last_updated;
                            private Object condition;
                            private String condition_description;
                            private SymbolEntity symbol;
                            private TemperatureEntity temperature;
                            private WindEntity wind;
                            private String zone;
                            private double pressure;
                            private double precipitation;
                            private PeriodEntity period;

                            public void setId(Object id) {
                                this.id = id;
                            }

                            public void setReporter(String reporter) {
                                this.reporter = reporter;
                            }

                            public void setSnow(SnowEntity snow) {
                                this.snow = snow;
                            }

                            public void setLast_updated(String last_updated) {
                                this.last_updated = last_updated;
                            }

                            public void setCondition(Object condition) {
                                this.condition = condition;
                            }

                            public void setCondition_description(String condition_description) {
                                this.condition_description = condition_description;
                            }

                            public void setSymbol(SymbolEntity symbol) {
                                this.symbol = symbol;
                            }

                            public void setTemperature(TemperatureEntity temperature) {
                                this.temperature = temperature;
                            }

                            public void setWind(WindEntity wind) {
                                this.wind = wind;
                            }

                            public void setZone(String zone) {
                                this.zone = zone;
                            }

                            public void setPressure(double pressure) {
                                this.pressure = pressure;
                            }

                            public void setPrecipitation(double precipitation) {
                                this.precipitation = precipitation;
                            }

                            public void setPeriod(PeriodEntity period) {
                                this.period = period;
                            }

                            public Object getId() {
                                return id;
                            }

                            public String getReporter() {
                                return reporter;
                            }

                            public SnowEntity getSnow() {
                                return snow;
                            }

                            public String getLast_updated() {
                                return last_updated;
                            }

                            public Object getCondition() {
                                return condition;
                            }

                            public String getCondition_description() {
                                return condition_description;
                            }

                            public SymbolEntity getSymbol() {
                                return symbol;
                            }

                            public TemperatureEntity getTemperature() {
                                return temperature;
                            }

                            public WindEntity getWind() {
                                return wind;
                            }

                            public String getZone() {
                                return zone;
                            }

                            public double getPressure() {
                                return pressure;
                            }

                            public double getPrecipitation() {
                                return precipitation;
                            }

                            public PeriodEntity getPeriod() {
                                return period;
                            }

                            public static class SnowEntity implements Serializable{
                                private Object today;
                                private Object depth_terrain;
                                private Object depth_slope;
                                private String unit;
                                private Object season;
                                private Object week;

                                public void setToday(Object today) {
                                    this.today = today;
                                }

                                public void setDepth_terrain(Object depth_terrain) {
                                    this.depth_terrain = depth_terrain;
                                }

                                public void setDepth_slope(Object depth_slope) {
                                    this.depth_slope = depth_slope;
                                }

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public void setSeason(Object season) {
                                    this.season = season;
                                }

                                public void setWeek(Object week) {
                                    this.week = week;
                                }

                                public Object getToday() {
                                    return today;
                                }

                                public Object getDepth_terrain() {
                                    return depth_terrain;
                                }

                                public Object getDepth_slope() {
                                    return depth_slope;
                                }

                                public String getUnit() {
                                    return unit;
                                }

                                public Object getSeason() {
                                    return season;
                                }

                                public Object getWeek() {
                                    return week;
                                }
                            }

                            public static class SymbolEntity implements Serializable{
                                private int fnugg_id;
                                private String name;
                                private String reporter;
                                private String to;
                                private int yr_id;
                                private String from;

                                public void setFnugg_id(int fnugg_id) {
                                    this.fnugg_id = fnugg_id;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public void setReporter(String reporter) {
                                    this.reporter = reporter;
                                }

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setYr_id(int yr_id) {
                                    this.yr_id = yr_id;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public int getFnugg_id() {
                                    return fnugg_id;
                                }

                                public String getName() {
                                    return name;
                                }

                                public String getReporter() {
                                    return reporter;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getYr_id() {
                                    return yr_id;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }

                            public static class TemperatureEntity implements Serializable{
                                private String unit;
                                private int value;
                                private String reporter;
                                private int minTemperature;
                                private int maxTemperature;

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public void setValue(int value) {
                                    this.value = value;
                                }

                                public void setReporter(String reporter) {
                                    this.reporter = reporter;
                                }

                                public void setMinTemperature(int minTemperature) {
                                    this.minTemperature = minTemperature;
                                }

                                public void setMaxTemperature(int maxTemperature) {
                                    this.maxTemperature = maxTemperature;
                                }

                                public String getUnit() {
                                    return unit;
                                }

                                public int getValue() {
                                    return value;
                                }

                                public String getReporter() {
                                    return reporter;
                                }

                                public int getMinTemperature() {
                                    return minTemperature;
                                }

                                public int getMaxTemperature() {
                                    return maxTemperature;
                                }
                            }

                            public static class WindEntity implements Serializable{
                                private double mps;
                                private String name;
                                private double degree;
                                private String speed;
                                private String direction;
                                private String reporter;

                                public void setMps(double mps) {
                                    this.mps = mps;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public void setDegree(double degree) {
                                    this.degree = degree;
                                }

                                public void setSpeed(String speed) {
                                    this.speed = speed;
                                }

                                public void setDirection(String direction) {
                                    this.direction = direction;
                                }

                                public void setReporter(String reporter) {
                                    this.reporter = reporter;
                                }

                                public double getMps() {
                                    return mps;
                                }

                                public String getName() {
                                    return name;
                                }

                                public double getDegree() {
                                    return degree;
                                }

                                public String getSpeed() {
                                    return speed;
                                }

                                public String getDirection() {
                                    return direction;
                                }

                                public String getReporter() {
                                    return reporter;
                                }
                            }

                            public static class PeriodEntity implements Serializable{
                                private String to;
                                private int day_of_week;
                                private String from;

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setDay_of_week(int day_of_week) {
                                    this.day_of_week = day_of_week;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getDay_of_week() {
                                    return day_of_week;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }
                        }
                    }

                    public static class ForecastEntity implements Serializable{

                        private WeekendEntity weekend;
                        private TodayEntity today;
                        private String last_updated;
                        private List<LongTermEntity> long_term;

                        public void setWeekend(WeekendEntity weekend) {
                            this.weekend = weekend;
                        }

                        public void setToday(TodayEntity today) {
                            this.today = today;
                        }

                        public void setLast_updated(String last_updated) {
                            this.last_updated = last_updated;
                        }

                        public void setLong_term(List<LongTermEntity> long_term) {
                            this.long_term = long_term;
                        }

                        public WeekendEntity getWeekend() {
                            return weekend;
                        }

                        public TodayEntity getToday() {
                            return today;
                        }

                        public String getLast_updated() {
                            return last_updated;
                        }

                        public List<LongTermEntity> getLong_term() {
                            return long_term;
                        }

                        public static class WeekendEntity implements Serializable{
                            private String reporter;
                            private WindEntity wind;
                            private SymbolEntity symbol;
                            private double pressure;
                            private double precipitation;
                            private String last_updated;
                            private PeriodEntity period;
                            private TemperatureEntity temperature;

                            public void setReporter(String reporter) {
                                this.reporter = reporter;
                            }

                            public void setWind(WindEntity wind) {
                                this.wind = wind;
                            }

                            public void setSymbol(SymbolEntity symbol) {
                                this.symbol = symbol;
                            }

                            public void setPressure(double pressure) {
                                this.pressure = pressure;
                            }

                            public void setPrecipitation(double precipitation) {
                                this.precipitation = precipitation;
                            }

                            public void setLast_updated(String last_updated) {
                                this.last_updated = last_updated;
                            }

                            public void setPeriod(PeriodEntity period) {
                                this.period = period;
                            }

                            public void setTemperature(TemperatureEntity temperature) {
                                this.temperature = temperature;
                            }

                            public String getReporter() {
                                return reporter;
                            }

                            public WindEntity getWind() {
                                return wind;
                            }

                            public SymbolEntity getSymbol() {
                                return symbol;
                            }

                            public double getPressure() {
                                return pressure;
                            }

                            public double getPrecipitation() {
                                return precipitation;
                            }

                            public String getLast_updated() {
                                return last_updated;
                            }

                            public PeriodEntity getPeriod() {
                                return period;
                            }

                            public TemperatureEntity getTemperature() {
                                return temperature;
                            }

                            public static class WindEntity implements Serializable{
                                private double degree;
                                private String speed;
                                private double mps;
                                private String direction;
                                private String name;

                                public void setDegree(double degree) {
                                    this.degree = degree;
                                }

                                public void setSpeed(String speed) {
                                    this.speed = speed;
                                }

                                public void setMps(double mps) {
                                    this.mps = mps;
                                }

                                public void setDirection(String direction) {
                                    this.direction = direction;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public double getDegree() {
                                    return degree;
                                }

                                public String getSpeed() {
                                    return speed;
                                }

                                public double getMps() {
                                    return mps;
                                }

                                public String getDirection() {
                                    return direction;
                                }

                                public String getName() {
                                    return name;
                                }
                            }

                            public static class SymbolEntity implements Serializable{
                                private String to;
                                private int fnugg_id;
                                private String name;
                                private int yr_id;
                                private String from;

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setFnugg_id(int fnugg_id) {
                                    this.fnugg_id = fnugg_id;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public void setYr_id(int yr_id) {
                                    this.yr_id = yr_id;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getFnugg_id() {
                                    return fnugg_id;
                                }

                                public String getName() {
                                    return name;
                                }

                                public int getYr_id() {
                                    return yr_id;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }

                            public static class PeriodEntity implements Serializable{
                                private String to;
                                private int day_of_week;
                                private String from;

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setDay_of_week(int day_of_week) {
                                    this.day_of_week = day_of_week;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getDay_of_week() {
                                    return day_of_week;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }

                            public static class TemperatureEntity implements Serializable{
                                private String unit;
                                private int minTemperature;
                                private int value;
                                private int maxTemperature;

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public void setMinTemperature(int minTemperature) {
                                    this.minTemperature = minTemperature;
                                }

                                public void setValue(int value) {
                                    this.value = value;
                                }

                                public void setMaxTemperature(int maxTemperature) {
                                    this.maxTemperature = maxTemperature;
                                }

                                public String getUnit() {
                                    return unit;
                                }

                                public int getMinTemperature() {
                                    return minTemperature;
                                }

                                public int getValue() {
                                    return value;
                                }

                                public int getMaxTemperature() {
                                    return maxTemperature;
                                }
                            }
                        }

                        public static class TodayEntity implements Serializable{

                            private TopEntity top;

                            public void setTop(TopEntity top) {
                                this.top = top;
                            }

                            public TopEntity getTop() {
                                return top;
                            }

                            public static class TopEntity implements Serializable{
                                private String reporter;
                                private WindEntity wind;
                                private SymbolEntity symbol;
                                private double pressure;
                                private Object condition;
                                private double precipitation;
                                private SnowEntity snow;
                                private String last_updated;
                                private PeriodEntity period;
                                private String condition_description;
                                private TemperatureEntity temperature;

                                public void setReporter(String reporter) {
                                    this.reporter = reporter;
                                }

                                public void setWind(WindEntity wind) {
                                    this.wind = wind;
                                }

                                public void setSymbol(SymbolEntity symbol) {
                                    this.symbol = symbol;
                                }

                                public void setPressure(double pressure) {
                                    this.pressure = pressure;
                                }

                                public void setCondition(Object condition) {
                                    this.condition = condition;
                                }

                                public void setPrecipitation(double precipitation) {
                                    this.precipitation = precipitation;
                                }

                                public void setSnow(SnowEntity snow) {
                                    this.snow = snow;
                                }

                                public void setLast_updated(String last_updated) {
                                    this.last_updated = last_updated;
                                }

                                public void setPeriod(PeriodEntity period) {
                                    this.period = period;
                                }

                                public void setCondition_description(String condition_description) {
                                    this.condition_description = condition_description;
                                }

                                public void setTemperature(TemperatureEntity temperature) {
                                    this.temperature = temperature;
                                }

                                public String getReporter() {
                                    return reporter;
                                }

                                public WindEntity getWind() {
                                    return wind;
                                }

                                public SymbolEntity getSymbol() {
                                    return symbol;
                                }

                                public double getPressure() {
                                    return pressure;
                                }

                                public Object getCondition() {
                                    return condition;
                                }

                                public double getPrecipitation() {
                                    return precipitation;
                                }

                                public SnowEntity getSnow() {
                                    return snow;
                                }

                                public String getLast_updated() {
                                    return last_updated;
                                }

                                public PeriodEntity getPeriod() {
                                    return period;
                                }

                                public String getCondition_description() {
                                    return condition_description;
                                }

                                public TemperatureEntity getTemperature() {
                                    return temperature;
                                }

                                public static class WindEntity implements Serializable{
                                    private String reporter;
                                    private double degree;
                                    private String speed;
                                    private double mps;
                                    private String direction;
                                    private String name;

                                    public void setReporter(String reporter) {
                                        this.reporter = reporter;
                                    }

                                    public void setDegree(double degree) {
                                        this.degree = degree;
                                    }

                                    public void setSpeed(String speed) {
                                        this.speed = speed;
                                    }

                                    public void setMps(double mps) {
                                        this.mps = mps;
                                    }

                                    public void setDirection(String direction) {
                                        this.direction = direction;
                                    }

                                    public void setName(String name) {
                                        this.name = name;
                                    }

                                    public String getReporter() {
                                        return reporter;
                                    }

                                    public double getDegree() {
                                        return degree;
                                    }

                                    public String getSpeed() {
                                        return speed;
                                    }

                                    public double getMps() {
                                        return mps;
                                    }

                                    public String getDirection() {
                                        return direction;
                                    }

                                    public String getName() {
                                        return name;
                                    }
                                }

                                public static class SymbolEntity implements Serializable{
                                    private String reporter;
                                    private String to;
                                    private int fnugg_id;
                                    private String name;
                                    private int yr_id;
                                    private String from;

                                    public void setReporter(String reporter) {
                                        this.reporter = reporter;
                                    }

                                    public void setTo(String to) {
                                        this.to = to;
                                    }

                                    public void setFnugg_id(int fnugg_id) {
                                        this.fnugg_id = fnugg_id;
                                    }

                                    public void setName(String name) {
                                        this.name = name;
                                    }

                                    public void setYr_id(int yr_id) {
                                        this.yr_id = yr_id;
                                    }

                                    public void setFrom(String from) {
                                        this.from = from;
                                    }

                                    public String getReporter() {
                                        return reporter;
                                    }

                                    public String getTo() {
                                        return to;
                                    }

                                    public int getFnugg_id() {
                                        return fnugg_id;
                                    }

                                    public String getName() {
                                        return name;
                                    }

                                    public int getYr_id() {
                                        return yr_id;
                                    }

                                    public String getFrom() {
                                        return from;
                                    }
                                }

                                public static class SnowEntity implements Serializable{
                                    private String unit;
                                    private Object season;
                                    private Object today;
                                    private Object depth_slope;
                                    private Object depth_terrain;
                                    private Object week;

                                    public void setUnit(String unit) {
                                        this.unit = unit;
                                    }

                                    public void setSeason(Object season) {
                                        this.season = season;
                                    }

                                    public void setToday(Object today) {
                                        this.today = today;
                                    }

                                    public void setDepth_slope(Object depth_slope) {
                                        this.depth_slope = depth_slope;
                                    }

                                    public void setDepth_terrain(Object depth_terrain) {
                                        this.depth_terrain = depth_terrain;
                                    }

                                    public void setWeek(Object week) {
                                        this.week = week;
                                    }

                                    public String getUnit() {
                                        return unit;
                                    }

                                    public Object getSeason() {
                                        return season;
                                    }

                                    public Object getToday() {
                                        return today;
                                    }

                                    public Object getDepth_slope() {
                                        return depth_slope;
                                    }

                                    public Object getDepth_terrain() {
                                        return depth_terrain;
                                    }

                                    public Object getWeek() {
                                        return week;
                                    }
                                }

                                public static class PeriodEntity implements Serializable{
                                    private String to;
                                    private int day_of_week;
                                    private String from;

                                    public void setTo(String to) {
                                        this.to = to;
                                    }

                                    public void setDay_of_week(int day_of_week) {
                                        this.day_of_week = day_of_week;
                                    }

                                    public void setFrom(String from) {
                                        this.from = from;
                                    }

                                    public String getTo() {
                                        return to;
                                    }

                                    public int getDay_of_week() {
                                        return day_of_week;
                                    }

                                    public String getFrom() {
                                        return from;
                                    }
                                }

                                public static class TemperatureEntity implements Serializable{
                                    private String reporter;
                                    private String unit;
                                    private int minTemperature;
                                    private int value;
                                    private int maxTemperature;

                                    public void setReporter(String reporter) {
                                        this.reporter = reporter;
                                    }

                                    public void setUnit(String unit) {
                                        this.unit = unit;
                                    }

                                    public void setMinTemperature(int minTemperature) {
                                        this.minTemperature = minTemperature;
                                    }

                                    public void setValue(int value) {
                                        this.value = value;
                                    }

                                    public void setMaxTemperature(int maxTemperature) {
                                        this.maxTemperature = maxTemperature;
                                    }

                                    public String getReporter() {
                                        return reporter;
                                    }

                                    public String getUnit() {
                                        return unit;
                                    }

                                    public int getMinTemperature() {
                                        return minTemperature;
                                    }

                                    public int getValue() {
                                        return value;
                                    }

                                    public int getMaxTemperature() {
                                        return maxTemperature;
                                    }
                                }
                            }
                        }

                        public static class LongTermEntity implements Serializable {
                            private String reporter;
                            private WindEntity wind;
                            private SymbolEntity symbol;
                            private double pressure;
                            private double precipitation;
                            private String last_updated;
                            private PeriodEntity period;
                            private TemperatureEntity temperature;

                            public void setReporter(String reporter) {
                                this.reporter = reporter;
                            }

                            public void setWind(WindEntity wind) {
                                this.wind = wind;
                            }

                            public void setSymbol(SymbolEntity symbol) {
                                this.symbol = symbol;
                            }

                            public void setPressure(double pressure) {
                                this.pressure = pressure;
                            }

                            public void setPrecipitation(double precipitation) {
                                this.precipitation = precipitation;
                            }

                            public void setLast_updated(String last_updated) {
                                this.last_updated = last_updated;
                            }

                            public void setPeriod(PeriodEntity period) {
                                this.period = period;
                            }

                            public void setTemperature(TemperatureEntity temperature) {
                                this.temperature = temperature;
                            }

                            public String getReporter() {
                                return reporter;
                            }

                            public WindEntity getWind() {
                                return wind;
                            }

                            public SymbolEntity getSymbol() {
                                return symbol;
                            }

                            public double getPressure() {
                                return pressure;
                            }

                            public double getPrecipitation() {
                                return precipitation;
                            }

                            public String getLast_updated() {
                                return last_updated;
                            }

                            public PeriodEntity getPeriod() {
                                return period;
                            }

                            public TemperatureEntity getTemperature() {
                                return temperature;
                            }

                            public static class WindEntity implements Serializable{
                                private double degree;
                                private String speed;
                                private double mps;
                                private String direction;
                                private String name;

                                public void setDegree(double degree) {
                                    this.degree = degree;
                                }

                                public void setSpeed(String speed) {
                                    this.speed = speed;
                                }

                                public void setMps(double mps) {
                                    this.mps = mps;
                                }

                                public void setDirection(String direction) {
                                    this.direction = direction;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public double getDegree() {
                                    return degree;
                                }

                                public String getSpeed() {
                                    return speed;
                                }

                                public double getMps() {
                                    return mps;
                                }

                                public String getDirection() {
                                    return direction;
                                }

                                public String getName() {
                                    return name;
                                }
                            }

                            public static class SymbolEntity implements Serializable{
                                private String to;
                                private int fnugg_id;
                                private String name;
                                private int yr_id;
                                private String from;

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setFnugg_id(int fnugg_id) {
                                    this.fnugg_id = fnugg_id;
                                }

                                public void setName(String name) {
                                    this.name = name;
                                }

                                public void setYr_id(int yr_id) {
                                    this.yr_id = yr_id;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getFnugg_id() {
                                    return fnugg_id;
                                }

                                public String getName() {
                                    return name;
                                }

                                public int getYr_id() {
                                    return yr_id;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }

                            public static class PeriodEntity implements Serializable {
                                private String to;
                                private int day_of_week;
                                private String from;

                                public void setTo(String to) {
                                    this.to = to;
                                }

                                public void setDay_of_week(int day_of_week) {
                                    this.day_of_week = day_of_week;
                                }

                                public void setFrom(String from) {
                                    this.from = from;
                                }

                                public String getTo() {
                                    return to;
                                }

                                public int getDay_of_week() {
                                    return day_of_week;
                                }

                                public String getFrom() {
                                    return from;
                                }
                            }

                            public static class TemperatureEntity implements Serializable{
                                private String unit;
                                private int minTemperature;
                                private int value;
                                private int maxTemperature;

                                public void setUnit(String unit) {
                                    this.unit = unit;
                                }

                                public void setMinTemperature(int minTemperature) {
                                    this.minTemperature = minTemperature;
                                }

                                public void setValue(int value) {
                                    this.value = value;
                                }

                                public void setMaxTemperature(int maxTemperature) {
                                    this.maxTemperature = maxTemperature;
                                }

                                public String getUnit() {
                                    return unit;
                                }

                                public int getMinTemperature() {
                                    return minTemperature;
                                }

                                public int getValue() {
                                    return value;
                                }

                                public int getMaxTemperature() {
                                    return maxTemperature;
                                }
                            }
                        }
                    }
                }

                public static class NearestResortsEntity implements Serializable {
                    private String id;
                    private int distance;
                    private String sort;
                    private String name;
                    private String site_path;

                    public void setId(String id) {
                        this.id = id;
                    }

                    public void setDistance(int distance) {
                        this.distance = distance;
                    }

                    public void setSort(String sort) {
                        this.sort = sort;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public void setSite_path(String site_path) {
                        this.site_path = site_path;
                    }

                    public String getId() {
                        return id;
                    }

                    public int getDistance() {
                        return distance;
                    }

                    public String getSort() {
                        return sort;
                    }

                    public String getName() {
                        return name;
                    }

                    public String getSite_path() {
                        return site_path;
                    }
                }
            }
        }
    }

    public static class AggregationsEntity implements Serializable {

        private RegionEntity region;
        private WeekendEntity weekend;
        private TodayEntity today;
        private ResortTypeEntity resort_type;

        public void setRegion(RegionEntity region) {
            this.region = region;
        }

        public void setWeekend(WeekendEntity weekend) {
            this.weekend = weekend;
        }

        public void setToday(TodayEntity today) {
            this.today = today;
        }

        public void setResort_type(ResortTypeEntity resort_type) {
            this.resort_type = resort_type;
        }

        public RegionEntity getRegion() {
            return region;
        }

        public WeekendEntity getWeekend() {
            return weekend;
        }

        public TodayEntity getToday() {
            return today;
        }

        public ResortTypeEntity getResort_type() {
            return resort_type;
        }

        public static class RegionEntity implements Serializable {
            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<BucketsEntity> buckets;

            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
            }

            public void setSum_other_doc_count(int sum_other_doc_count) {
                this.sum_other_doc_count = sum_other_doc_count;
            }

            public void setBuckets(List<BucketsEntity> buckets) {
                this.buckets = buckets;
            }

            public int getDoc_count_error_upper_bound() {
                return doc_count_error_upper_bound;
            }

            public int getSum_other_doc_count() {
                return sum_other_doc_count;
            }

            public List<BucketsEntity> getBuckets() {
                return buckets;
            }

            public static class BucketsEntity implements Serializable {
                private String key;
                private int doc_count;

                public void setKey(String key) {
                    this.key = key;
                }

                public void setDoc_count(int doc_count) {
                    this.doc_count = doc_count;
                }

                public String getKey() {
                    return key;
                }

                public int getDoc_count() {
                    return doc_count;
                }
            }
        }

        public static class WeekendEntity implements Serializable {
            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<BucketsEntity> buckets;

            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
            }

            public void setSum_other_doc_count(int sum_other_doc_count) {
                this.sum_other_doc_count = sum_other_doc_count;
            }

            public void setBuckets(List<BucketsEntity> buckets) {
                this.buckets = buckets;
            }

            public int getDoc_count_error_upper_bound() {
                return doc_count_error_upper_bound;
            }

            public int getSum_other_doc_count() {
                return sum_other_doc_count;
            }

            public List<BucketsEntity> getBuckets() {
                return buckets;
            }

            public static class BucketsEntity implements Serializable {
                private int key;
                private int doc_count;

                public void setKey(int key) {
                    this.key = key;
                }

                public void setDoc_count(int doc_count) {
                    this.doc_count = doc_count;
                }

                public int getKey() {
                    return key;
                }

                public int getDoc_count() {
                    return doc_count;
                }
            }
        }

        public static class TodayEntity implements Serializable {
            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<BucketsEntity> buckets;

            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
            }

            public void setSum_other_doc_count(int sum_other_doc_count) {
                this.sum_other_doc_count = sum_other_doc_count;
            }

            public void setBuckets(List<BucketsEntity> buckets) {
                this.buckets = buckets;
            }

            public int getDoc_count_error_upper_bound() {
                return doc_count_error_upper_bound;
            }

            public int getSum_other_doc_count() {
                return sum_other_doc_count;
            }

            public List<BucketsEntity> getBuckets() {
                return buckets;
            }

            public static class BucketsEntity implements Serializable {
                private int key;
                private int doc_count;

                public void setKey(int key) {
                    this.key = key;
                }

                public void setDoc_count(int doc_count) {
                    this.doc_count = doc_count;
                }

                public int getKey() {
                    return key;
                }

                public int getDoc_count() {
                    return doc_count;
                }
            }
        }

        public static class ResortTypeEntity implements Serializable {
            private int doc_count_error_upper_bound;
            private int sum_other_doc_count;
            private List<BucketsEntity> buckets;

            public void setDoc_count_error_upper_bound(int doc_count_error_upper_bound) {
                this.doc_count_error_upper_bound = doc_count_error_upper_bound;
            }

            public void setSum_other_doc_count(int sum_other_doc_count) {
                this.sum_other_doc_count = sum_other_doc_count;
            }

            public void setBuckets(List<BucketsEntity> buckets) {
                this.buckets = buckets;
            }

            public int getDoc_count_error_upper_bound() {
                return doc_count_error_upper_bound;
            }

            public int getSum_other_doc_count() {
                return sum_other_doc_count;
            }

            public List<BucketsEntity> getBuckets() {
                return buckets;
            }

            public static class BucketsEntity implements Serializable {
                private String key;
                private int doc_count;

                public void setKey(String key) {
                    this.key = key;
                }

                public void setDoc_count(int doc_count) {
                    this.doc_count = doc_count;
                }

                public String getKey() {
                    return key;
                }

                public int getDoc_count() {
                    return doc_count;
                }
            }
        }
    }
}
