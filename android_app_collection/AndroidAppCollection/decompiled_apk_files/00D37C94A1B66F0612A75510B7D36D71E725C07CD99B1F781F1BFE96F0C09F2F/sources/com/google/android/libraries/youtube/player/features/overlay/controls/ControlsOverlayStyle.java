package com.google.android.libraries.youtube.player.features.overlay.controls;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControlsOverlayStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ControlsOverlayStyle a;
    public static final ControlsOverlayStyle b;
    public static final ControlsOverlayStyle c;
    public static final ControlsOverlayStyle d;
    public static final ControlsOverlayStyle e;
    public static final ControlsOverlayStyle f;
    public static final ControlsOverlayStyle g;
    public static final ControlsOverlayStyle h;
    public static final ControlsOverlayStyle i;
    public static final ControlsOverlayStyle j;
    public static final ControlsOverlayStyle k;
    public static final ControlsOverlayStyle l;
    public static final ControlsOverlayStyle m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        ahza ahzaVar = new ahza();
        ahzaVar.a = "YOUTUBE";
        ahzaVar.b = false;
        ahzaVar.c = true;
        ahzaVar.d = -65536;
        ahzaVar.e = true;
        ahzaVar.f = true;
        ahzaVar.g = true;
        ahzaVar.h = true;
        ahzaVar.i = false;
        ahzaVar.j = true;
        ahzaVar.k = true;
        ahzaVar.l = true;
        ahzaVar.m = false;
        a = ahzaVar.a();
        ahza ahzaVar2 = new ahza();
        ahzaVar2.a = "PREROLL";
        ahzaVar2.b = false;
        ahzaVar2.c = true;
        ahzaVar2.d = -14183450;
        ahzaVar2.e = true;
        ahzaVar2.f = true;
        ahzaVar2.g = true;
        ahzaVar2.h = false;
        ahzaVar2.i = false;
        ahzaVar2.j = true;
        ahzaVar2.k = true;
        ahzaVar2.l = false;
        ahzaVar2.m = false;
        b = ahzaVar2.a();
        ahza ahzaVar3 = new ahza();
        ahzaVar3.a = "POSTROLL";
        ahzaVar3.b = false;
        ahzaVar3.c = true;
        ahzaVar3.d = -14183450;
        ahzaVar3.e = true;
        ahzaVar3.f = true;
        ahzaVar3.g = true;
        ahzaVar3.h = true;
        ahzaVar3.i = false;
        ahzaVar3.j = true;
        ahzaVar3.k = true;
        ahzaVar3.l = false;
        ahzaVar3.m = false;
        c = ahzaVar3.a();
        ahza ahzaVar4 = new ahza();
        ahzaVar4.a = "TRAILER";
        ahzaVar4.b = false;
        ahzaVar4.c = true;
        ahzaVar4.d = -14183450;
        ahzaVar4.e = true;
        ahzaVar4.f = true;
        ahzaVar4.g = true;
        ahzaVar4.h = true;
        ahzaVar4.i = false;
        ahzaVar4.j = true;
        ahzaVar4.k = true;
        ahzaVar4.l = false;
        ahzaVar4.m = false;
        d = ahzaVar4.a();
        ahza ahzaVar5 = new ahza();
        ahzaVar5.a = "REMOTE_TRAILER";
        ahzaVar5.b = false;
        ahzaVar5.c = true;
        ahzaVar5.d = -14183450;
        ahzaVar5.e = false;
        ahzaVar5.f = true;
        ahzaVar5.g = true;
        ahzaVar5.h = true;
        ahzaVar5.i = false;
        ahzaVar5.j = true;
        ahzaVar5.k = true;
        ahzaVar5.l = false;
        ahzaVar5.m = false;
        e = ahzaVar5.a();
        ahza ahzaVar6 = new ahza();
        ahzaVar6.a = "REMOTE";
        ahzaVar6.b = false;
        ahzaVar6.c = true;
        ahzaVar6.d = -65536;
        ahzaVar6.e = false;
        ahzaVar6.f = true;
        ahzaVar6.g = true;
        ahzaVar6.h = true;
        ahzaVar6.i = false;
        ahzaVar6.j = true;
        ahzaVar6.k = true;
        ahzaVar6.l = false;
        ahzaVar6.m = false;
        f = ahzaVar6.a();
        ahza ahzaVar7 = new ahza();
        ahzaVar7.a = "REMOTE_LIVE";
        ahzaVar7.b = false;
        ahzaVar7.c = false;
        ahzaVar7.d = -65536;
        ahzaVar7.e = false;
        ahzaVar7.f = false;
        ahzaVar7.g = true;
        ahzaVar7.h = true;
        ahzaVar7.i = false;
        ahzaVar7.j = false;
        ahzaVar7.k = true;
        ahzaVar7.l = false;
        ahzaVar7.m = false;
        g = ahzaVar7.a();
        ahza ahzaVar8 = new ahza();
        ahzaVar8.a = "REMOTE_LIVE_DVR";
        ahzaVar8.b = false;
        ahzaVar8.c = true;
        ahzaVar8.d = -65536;
        ahzaVar8.e = false;
        ahzaVar8.f = true;
        ahzaVar8.g = true;
        ahzaVar8.h = true;
        ahzaVar8.i = false;
        ahzaVar8.j = true;
        ahzaVar8.k = true;
        ahzaVar8.l = false;
        ahzaVar8.m = true;
        h = ahzaVar8.a();
        ahza ahzaVar9 = new ahza();
        ahzaVar9.a = "AD";
        ahzaVar9.b = false;
        ahzaVar9.c = true;
        ahzaVar9.d = -1524949;
        ahzaVar9.e = false;
        ahzaVar9.f = false;
        ahzaVar9.g = true;
        ahzaVar9.h = false;
        ahzaVar9.i = true;
        ahzaVar9.j = false;
        ahzaVar9.k = false;
        ahzaVar9.l = false;
        ahzaVar9.m = false;
        i = ahzaVar9.a();
        ahza ahzaVar10 = new ahza();
        ahzaVar10.a = "AD_REMOTE";
        ahzaVar10.b = false;
        ahzaVar10.c = true;
        ahzaVar10.d = -1524949;
        ahzaVar10.e = false;
        ahzaVar10.f = false;
        ahzaVar10.g = true;
        ahzaVar10.h = false;
        ahzaVar10.i = true;
        ahzaVar10.j = false;
        ahzaVar10.k = false;
        ahzaVar10.l = false;
        ahzaVar10.m = false;
        j = ahzaVar10.a();
        ahza ahzaVar11 = new ahza();
        ahzaVar11.a = "LIVE";
        ahzaVar11.b = false;
        ahzaVar11.c = false;
        ahzaVar11.d = -65536;
        ahzaVar11.e = false;
        ahzaVar11.f = false;
        ahzaVar11.g = true;
        ahzaVar11.h = true;
        ahzaVar11.i = false;
        ahzaVar11.j = false;
        ahzaVar11.k = true;
        ahzaVar11.l = false;
        ahzaVar11.m = false;
        k = ahzaVar11.a();
        ahza ahzaVar12 = new ahza();
        ahzaVar12.a = "LIVE_DVR";
        ahzaVar12.b = false;
        ahzaVar12.c = true;
        ahzaVar12.d = -65536;
        ahzaVar12.e = false;
        ahzaVar12.f = true;
        ahzaVar12.g = true;
        ahzaVar12.h = true;
        ahzaVar12.i = false;
        ahzaVar12.j = true;
        ahzaVar12.k = true;
        ahzaVar12.l = false;
        ahzaVar12.m = true;
        l = ahzaVar12.a();
        ahza ahzaVar13 = new ahza();
        ahzaVar13.a = "HIDDEN";
        ahzaVar13.b = true;
        ahzaVar13.c = false;
        ahzaVar13.d = -65536;
        ahzaVar13.e = false;
        ahzaVar13.f = false;
        ahzaVar13.g = false;
        ahzaVar13.h = false;
        ahzaVar13.i = false;
        ahzaVar13.j = false;
        ahzaVar13.k = false;
        ahzaVar13.l = false;
        ahzaVar13.m = false;
        m = ahzaVar13.a();
        CREATOR = new abjw(16);
    }

    public ControlsOverlayStyle(ahza ahzaVar) {
        this.n = ahzaVar.a;
        this.o = ahzaVar.b;
        this.p = ahzaVar.c;
        this.q = ahzaVar.d;
        this.r = ahzaVar.e;
        this.s = ahzaVar.f;
        this.t = ahzaVar.g;
        this.u = ahzaVar.h;
        this.v = ahzaVar.i;
        this.w = ahzaVar.j;
        this.x = ahzaVar.k;
        this.y = ahzaVar.l;
        this.z = ahzaVar.m;
    }

    public ControlsOverlayStyle(Parcel parcel) {
        this.n = parcel.readString();
        boolean z = true;
        this.o = parcel.readByte() != 0;
        this.p = parcel.readByte() != 0;
        this.q = parcel.readInt();
        this.r = parcel.readByte() != 0;
        this.s = parcel.readByte() != 0;
        this.t = parcel.readByte() != 0;
        this.u = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readByte() != 0;
        this.y = parcel.readByte() != 0;
        this.z = parcel.readByte() == 0 ? false : z;
    }

    public static boolean a(ControlsOverlayStyle controlsOverlayStyle) {
        return akzj.f(controlsOverlayStyle.n, i.n) || akzj.f(controlsOverlayStyle.n, j.n);
    }

    public static boolean b(ControlsOverlayStyle controlsOverlayStyle) {
        return akzj.f(controlsOverlayStyle.n, k.n) || akzj.f(controlsOverlayStyle.n, l.n) || akzj.f(controlsOverlayStyle.n, g.n) || akzj.f(controlsOverlayStyle.n, h.n);
    }

    public static boolean c(ControlsOverlayStyle controlsOverlayStyle) {
        return akzj.f(controlsOverlayStyle.n, k.n) || akzj.f(controlsOverlayStyle.n, g.n);
    }

    public static boolean d(ControlsOverlayStyle controlsOverlayStyle) {
        return akzj.f(controlsOverlayStyle.n, f.n) || akzj.f(controlsOverlayStyle.n, g.n) || akzj.f(controlsOverlayStyle.n, e.n) || akzj.f(controlsOverlayStyle.n, h.n);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.q);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
    }
}
