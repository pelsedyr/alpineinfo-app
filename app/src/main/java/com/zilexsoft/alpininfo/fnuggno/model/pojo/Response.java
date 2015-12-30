package com.zilexsoft.alpininfo.fnuggno.model.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * Not in use for now. Pojo used in app is the ResponseHuge.java
 * This is a frugal pojo that fethces only the nescessery resort elements.
 * Created by luke on 11/19/15.
 */
public class Response implements Serializable{


    private Hits hits;

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    public Hits getHits() {
        return hits;
    }

    public static class Hits {


        private List<HitsEntity> hits;

        public void setHits(List<HitsEntity> hits) {
            this.hits = hits;
        }

        public List<HitsEntity> getHits() {
            return hits;
        }

        public static class HitsEntity {
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

            public static class SourceEntity {
                private int id;
                private String name;
                private String description;


                private ContactEntity contact;


                private OpeningHoursEntity opening_hours;

                private LiftsEntity lifts;


                private SlopesEntity slopes;
                private Object slope_map;

                private ImagesEntity images;


                private UrlsEntity urls;
                private String park_description;

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

                public void setUrls(UrlsEntity urls) {
                    this.urls = urls;
                }

                public void setPark_description(String park_description) {
                    this.park_description = park_description;
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

                public UrlsEntity getUrls() {
                    return urls;
                }

                public String getPark_description() {
                    return park_description;
                }

                public static class ContactEntity {
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

                public static class OpeningHoursEntity {


                    private SundayEntity sunday;
                    private List<?> exception_days;

                    public void setSunday(SundayEntity sunday) {
                        this.sunday = sunday;
                    }

                    public void setException_days(List<?> exception_days) {
                        this.exception_days = exception_days;
                    }

                    public SundayEntity getSunday() {
                        return sunday;
                    }

                    public List<?> getException_days() {
                        return exception_days;
                    }

                    public static class SundayEntity {
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

                public static class LiftsEntity {
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

                    public static class ListEntity {
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

                public static class SlopesEntity {
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

                    public static class ListEntity {
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

                public static class ImagesEntity {
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

                    public static class MobileEntity {

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

                        public static class Scale1Entity {
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

                        public static class Scale2Entity {
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

                        public static class Scale3Entity {
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

                public static class UrlsEntity {
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
            }
        }
    }
}
