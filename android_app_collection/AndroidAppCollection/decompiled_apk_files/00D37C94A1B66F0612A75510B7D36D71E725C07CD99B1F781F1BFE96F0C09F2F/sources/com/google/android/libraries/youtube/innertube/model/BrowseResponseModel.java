package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class BrowseResponseModel implements Parcelable, ajga {
    public static final Parcelable.Creator CREATOR = new xcg(18);
    public final arlt a;
    public Object b;
    private final Map c = new HashMap();
    private amuk d;

    public BrowseResponseModel(arlt arltVar) {
        this.a = arltVar;
    }

    public static BrowseResponseModel e(byte[] bArr, aaqp aaqpVar) {
        if (bArr == null) {
            return null;
        }
        return new BrowseResponseModel((arlt) aaqpVar.a(bArr, arlt.a));
    }

    @Override // defpackage.ajga
    public final auna a() {
        auna aunaVar = this.a.i;
        return aunaVar == null ? auna.a : aunaVar;
    }

    @Override // defpackage.ajga
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.ajga
    public final void c(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.ajga
    public final byte[] d() {
        return this.a.j.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final aakw f() {
        auqh auqhVar;
        arlu arluVar = this.a.f;
        if (arluVar == null) {
            arluVar = arlu.a;
        }
        if (arluVar.b == 49399797) {
            arlu arluVar2 = this.a.f;
            if (arluVar2 == null) {
                arluVar2 = arlu.a;
            }
            if (arluVar2.b == 49399797) {
                auqhVar = (auqh) arluVar2.c;
            } else {
                auqhVar = auqh.a;
            }
            return new aakw(auqhVar);
        }
        return null;
    }

    public final amuk g() {
        armc armcVar;
        if (this.d == null) {
            arlu arluVar = this.a.f;
            if (arluVar == null) {
                arluVar = arlu.a;
            }
            if (arluVar.b == 58173949) {
                armcVar = (armc) arluVar.c;
            } else {
                armcVar = armc.a;
            }
            this.d = (amuk) ((ayos) ayoi.Q(armcVar.c).I(zwb.e).V(aaku.b).ay(yps.m)).U();
        }
        return this.d;
    }

    public final Object h(String str, Object obj) {
        return this.c.containsKey(str) ? this.c.get(str) : obj;
    }

    public final void i(String str, Object obj) {
        this.c.put(str, obj);
    }

    public final boolean j() {
        return (this.a.b & 64) == 0;
    }

    public final byte[] k() {
        return this.a.toByteArray();
    }

    public final String toString() {
        arlt arltVar = this.a;
        return arltVar == null ? "(null)" : arltVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
    }
}
