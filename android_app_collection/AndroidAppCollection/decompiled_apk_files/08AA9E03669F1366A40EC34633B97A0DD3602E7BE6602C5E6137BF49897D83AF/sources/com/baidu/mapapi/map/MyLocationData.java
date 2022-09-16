package com.baidu.mapapi.map;
/* loaded from: classes.dex */
public class MyLocationData {
    public final float accuracy;
    public final float direction;
    public final double latitude;
    public final double longitude;
    public final int satellitesNum;
    public final float speed;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private double f1651a;

        /* renamed from: b  reason: collision with root package name */
        private double f1652b;

        /* renamed from: c  reason: collision with root package name */
        private float f1653c;

        /* renamed from: d  reason: collision with root package name */
        private float f1654d;
        private float e;
        private int f;

        public Builder accuracy(float f) {
            this.e = f;
            return this;
        }

        public MyLocationData build() {
            return new MyLocationData(this.f1651a, this.f1652b, this.f1653c, this.f1654d, this.e, this.f);
        }

        public Builder direction(float f) {
            this.f1654d = f;
            return this;
        }

        public Builder latitude(double d2) {
            this.f1651a = d2;
            return this;
        }

        public Builder longitude(double d2) {
            this.f1652b = d2;
            return this;
        }

        public Builder satellitesNum(int i) {
            this.f = i;
            return this;
        }

        public Builder speed(float f) {
            this.f1653c = f;
            return this;
        }
    }

    MyLocationData(double d2, double d3, float f, float f2, float f3, int i) {
        this.latitude = d2;
        this.longitude = d3;
        this.speed = f;
        this.direction = f2;
        this.accuracy = f3;
        this.satellitesNum = i;
    }
}
