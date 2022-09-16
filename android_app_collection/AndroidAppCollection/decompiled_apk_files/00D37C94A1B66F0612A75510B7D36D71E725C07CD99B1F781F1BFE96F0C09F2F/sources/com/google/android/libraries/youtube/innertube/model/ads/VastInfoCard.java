package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VastInfoCard implements Parcelable, afto {
    public final int b;
    public final List c;
    public final List d;
    public final InfoCardApp e;
    public static final aalr a = new aalr();
    public static final Parcelable.Creator CREATOR = new aalf(6);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardAction implements Parcelable, afto {
        public final int b;
        public final Uri c;
        public final String d;
        public final List e;
        public static final aals a = new aals();
        public static final Parcelable.Creator CREATOR = new aalf(7);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj != null && getClass().equals(obj.getClass())) {
                InfoCardAction infoCardAction = (InfoCardAction) obj;
                return akzj.f(Integer.valueOf(this.b), Integer.valueOf(infoCardAction.b)) && akzj.f(this.c, infoCardAction.c) && akzj.f(this.d, infoCardAction.d) && akzj.f(this.e, infoCardAction.e);
            }
            return false;
        }

        @Override // defpackage.afto
        public final /* bridge */ /* synthetic */ aftn h() {
            return new aals(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, 0);
            parcel.writeString(this.d);
            parcel.writeTypedList(this.e);
        }

        public InfoCardAction(int i, Uri uri, String str, List list) {
            this.b = i;
            this.c = uri;
            this.d = str;
            this.e = Collections.unmodifiableList(list == null ? new ArrayList() : list);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardApp implements Parcelable, afto {
        public final String b;
        public final Uri c;
        public final String d;
        public final boolean e;
        public final float f;
        public final int g;
        public final Uri h;
        public final String i;
        public static final aalt a = new aalt();
        public static final Parcelable.Creator CREATOR = new aalf(8);

        public InfoCardApp(String str, String str2, Uri uri, String str3, boolean z, float f, Uri uri2, int i) {
            this.b = str;
            this.i = str2;
            this.c = uri;
            this.d = str3;
            this.e = z;
            this.f = f;
            this.h = uri2;
            this.g = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj != null && getClass().equals(obj.getClass())) {
                InfoCardApp infoCardApp = (InfoCardApp) obj;
                return akzj.f(this.b, infoCardApp.b) && akzj.f(this.i, infoCardApp.i) && akzj.f(this.c, infoCardApp.c) && akzj.f(this.d, infoCardApp.d) && akzj.f(Float.valueOf(this.f), Float.valueOf(infoCardApp.f)) && akzj.f(this.h, infoCardApp.h) && akzj.f(Integer.valueOf(this.g), Integer.valueOf(infoCardApp.g));
            }
            return false;
        }

        @Override // defpackage.afto
        public final /* bridge */ /* synthetic */ aftn h() {
            return new aalt(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.i);
            parcel.writeParcelable(this.c, 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeFloat(this.f);
            parcel.writeParcelable(this.h, 0);
            parcel.writeInt(this.g);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardTrackingEvent implements Parcelable, afto {
        public static final Parcelable.Creator CREATOR = new aalf(9);
        public static final aalu a = new aalu();
        private final int b;
        private final Uri c;

        public InfoCardTrackingEvent(int i, Uri uri) {
            this.b = i;
            this.c = uri;
        }

        public int a() {
            return this.b;
        }

        public Uri b() {
            return this.c;
        }

        @Override // defpackage.afto
        /* renamed from: c */
        public aalu h() {
            return new aalu(this);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj != null && getClass().equals(obj.getClass())) {
                InfoCardTrackingEvent infoCardTrackingEvent = (InfoCardTrackingEvent) obj;
                return akzj.f(Integer.valueOf(a()), Integer.valueOf(infoCardTrackingEvent.a())) && akzj.f(b(), infoCardTrackingEvent.b());
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(a());
            parcel.writeParcelable(b(), 0);
        }
    }

    public VastInfoCard(int i, List list, List list2, InfoCardApp infoCardApp) {
        this.b = i;
        list.getClass();
        this.c = Collections.unmodifiableList(list);
        list2.getClass();
        this.d = Collections.unmodifiableList(list2);
        this.e = infoCardApp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            VastInfoCard vastInfoCard = (VastInfoCard) obj;
            return akzj.f(Integer.valueOf(this.b), Integer.valueOf(vastInfoCard.b)) && akzj.f(this.d, vastInfoCard.d) && akzj.f(this.c, vastInfoCard.c) && akzj.f(this.e, vastInfoCard.e);
        }
        return false;
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new aalr(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeParcelable(this.e, 0);
    }
}
