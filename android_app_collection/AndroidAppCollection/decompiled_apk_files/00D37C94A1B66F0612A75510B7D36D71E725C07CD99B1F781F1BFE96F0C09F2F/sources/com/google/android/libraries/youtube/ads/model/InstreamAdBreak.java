package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InstreamAdBreak implements Parcelable, afto {
    public final AdBreakRendererModel c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final byte[] i;
    public static final amup a = amyc.b;
    public static final Parcelable.Creator CREATOR = new xcg(1);
    public static final xcf b = new xcf();

    public InstreamAdBreak(AdBreakRendererModel adBreakRendererModel, int i, boolean z, String str, String str2, String str3, byte[] bArr) {
        adBreakRendererModel.getClass();
        this.c = adBreakRendererModel;
        this.d = i;
        this.e = z;
        zgh.m(str);
        this.f = str;
        zgh.m(str2);
        this.g = str2;
        if (b() != xdb.PRE_ROLL) {
            str3 = null;
        } else if (z) {
            str3 = "";
        }
        this.h = str3;
        this.i = bArr == null ? aadi.b : bArr;
    }

    public final long a() {
        AdBreakRendererModel adBreakRendererModel = this.c;
        int d = aoyt.d(adBreakRendererModel.b.d);
        if (d != 0 && d == 4) {
            return -1L;
        }
        return Math.max(adBreakRendererModel.b.b, 0);
    }

    public final xdb b() {
        int d = aoyt.d(this.c.b.d);
        if (d == 0) {
            d = 1;
        }
        int i = d - 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return xdb.POST_ROLL;
                }
                if (i != 6) {
                    return null;
                }
            }
            return xdb.MID_ROLL;
        }
        return xdb.PRE_ROLL;
    }

    public final List c() {
        return this.c.b();
    }

    public final List d() {
        return this.c.b.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List e() {
        return this.c.b.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InstreamAdBreak)) {
            return false;
        }
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) obj;
        return akzj.f(this.c, instreamAdBreak.c) && this.d == instreamAdBreak.d && akzj.f(this.f, instreamAdBreak.f) && akzj.f(this.h, instreamAdBreak.h) && Arrays.equals(this.i, instreamAdBreak.i);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xcf(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(this.d), this.f, Integer.valueOf(Arrays.hashCode(this.i))});
    }

    public final String toString() {
        return String.format("InstreamAdBreak: [breakType:%s, adBreakIndex:%s, offset:%s, originalVideoId:%s]", b(), Integer.valueOf(this.d), Long.valueOf(a()), this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i.length);
        parcel.writeByteArray(this.i);
    }
}
