package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwe();
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public Email f;
    public Phone g;
    public Sms h;
    public WiFi i;
    public UrlBookmark j;
    public GeoPoint k;
    public CalendarEvent l;
    public ContactInfo m;
    public DriverLicense n;
    public byte[] o;
    public boolean p;
    public double q;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(7);
        public int a;
        public String[] b;

        public Address() {
        }

        public Address(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.s(parcel, 2, this.a);
            tqj.G(parcel, 3, this.b);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(8);
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public String h;

        public CalendarDateTime() {
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.s(parcel, 2, this.a);
            tqj.s(parcel, 3, this.b);
            tqj.s(parcel, 4, this.c);
            tqj.s(parcel, 5, this.d);
            tqj.s(parcel, 6, this.e);
            tqj.s(parcel, 7, this.f);
            tqj.o(parcel, 8, this.g);
            tqj.F(parcel, 9, this.h);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(9);
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public CalendarDateTime f;
        public CalendarDateTime g;

        public CalendarEvent() {
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = calendarDateTime;
            this.g = calendarDateTime2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.F(parcel, 4, this.c);
            tqj.F(parcel, 5, this.d);
            tqj.F(parcel, 6, this.e);
            tqj.E(parcel, 7, this.f, i);
            tqj.E(parcel, 8, this.g, i);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(10);
        public PersonName a;
        public String b;
        public String c;
        public Phone[] d;
        public Email[] e;
        public String[] f;
        public Address[] g;

        public ContactInfo() {
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.a = personName;
            this.b = str;
            this.c = str2;
            this.d = phoneArr;
            this.e = emailArr;
            this.f = strArr;
            this.g = addressArr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.E(parcel, 2, this.a, i);
            tqj.F(parcel, 3, this.b);
            tqj.F(parcel, 4, this.c);
            tqj.I(parcel, 5, this.d, i);
            tqj.I(parcel, 6, this.e, i);
            tqj.G(parcel, 7, this.f);
            tqj.I(parcel, 8, this.g, i);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(11);
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        public DriverLicense() {
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = str14;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.F(parcel, 4, this.c);
            tqj.F(parcel, 5, this.d);
            tqj.F(parcel, 6, this.e);
            tqj.F(parcel, 7, this.f);
            tqj.F(parcel, 8, this.g);
            tqj.F(parcel, 9, this.h);
            tqj.F(parcel, 10, this.i);
            tqj.F(parcel, 11, this.j);
            tqj.F(parcel, 12, this.k);
            tqj.F(parcel, 13, this.l);
            tqj.F(parcel, 14, this.m);
            tqj.F(parcel, 15, this.n);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(12);
        public int a;
        public String b;
        public String c;
        public String d;

        public Email() {
        }

        public Email(int i, String str, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.s(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.F(parcel, 4, this.c);
            tqj.F(parcel, 5, this.d);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(13);
        public double a;
        public double b;

        public GeoPoint() {
        }

        public GeoPoint(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.p(parcel, 2, this.a);
            tqj.p(parcel, 3, this.b);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(14);
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public PersonName() {
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.F(parcel, 4, this.c);
            tqj.F(parcel, 5, this.d);
            tqj.F(parcel, 6, this.e);
            tqj.F(parcel, 7, this.f);
            tqj.F(parcel, 8, this.g);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(15);
        public int a;
        public String b;

        public Phone() {
        }

        public Phone(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.s(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(16);
        public String a;
        public String b;

        public Sms() {
        }

        public Sms(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(17);
        public String a;
        public String b;

        public UrlBookmark() {
        }

        public UrlBookmark(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.n(parcel, m);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(18);
        public String a;
        public String b;
        public int c;

        public WiFi() {
        }

        public WiFi(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 2, this.a);
            tqj.F(parcel, 3, this.b);
            tqj.s(parcel, 4, this.c);
            tqj.n(parcel, m);
        }
    }

    public Barcode() {
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense, byte[] bArr, boolean z, double d) {
        this.a = i;
        this.b = str;
        this.o = bArr;
        this.c = str2;
        this.d = i2;
        this.e = pointArr;
        this.p = z;
        this.q = d;
        this.f = email;
        this.g = phone;
        this.h = sms;
        this.i = wiFi;
        this.j = urlBookmark;
        this.k = geoPoint;
        this.l = calendarEvent;
        this.m = contactInfo;
        this.n = driverLicense;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.F(parcel, 4, this.c);
        tqj.s(parcel, 5, this.d);
        tqj.I(parcel, 6, this.e, i);
        tqj.E(parcel, 7, this.f, i);
        tqj.E(parcel, 8, this.g, i);
        tqj.E(parcel, 9, this.h, i);
        tqj.E(parcel, 10, this.i, i);
        tqj.E(parcel, 11, this.j, i);
        tqj.E(parcel, 12, this.k, i);
        tqj.E(parcel, 13, this.l, i);
        tqj.E(parcel, 14, this.m, i);
        tqj.E(parcel, 15, this.n, i);
        tqj.w(parcel, 16, this.o);
        tqj.o(parcel, 17, this.p);
        tqj.p(parcel, 18, this.q);
        tqj.n(parcel, m);
    }
}
