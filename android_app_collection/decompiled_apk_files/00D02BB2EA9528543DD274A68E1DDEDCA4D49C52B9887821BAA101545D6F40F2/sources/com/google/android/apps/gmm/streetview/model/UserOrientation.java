package com.google.android.apps.gmm.streetview.model;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UserOrientation implements Parcelable {
    public static final Parcelable.Creator<UserOrientation> CREATOR = new bwzq();
    public float a = 0.0f;
    private float c = 0.0f;
    public float b = 60.0f;

    public UserOrientation() {
    }

    public UserOrientation(float f, float f2, float f3) {
        a(f);
        c(f2);
        d(f3);
    }

    private static float g(float f) {
        if (f < dcyn.a) {
            f = (f % 360.0f) + 360.0f;
        }
        return f % 360.0f;
    }

    private static float h(float f, float f2) {
        return Math.min(90.0f, Math.max(f2, f));
    }

    public final void a(float f) {
        this.a = g(f);
    }

    public final float b() {
        return this.c + 90.0f;
    }

    public final void c(float f) {
        this.c = h(f, -90.0f);
    }

    public final void d(float f) {
        this.b = h(f, 15.0f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return dbrz.f(',').i("1", Float.valueOf(this.a), "", Float.valueOf(3.0f), Float.valueOf(-this.c));
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof UserOrientation) {
            UserOrientation userOrientation = (UserOrientation) obj;
            if (this.a == userOrientation.a && this.c == userOrientation.c && this.b == userOrientation.b) {
                return true;
            }
        }
        return false;
    }

    public final void f(dhjw dhjwVar) {
        dhka bZ = dhkb.e.bZ();
        float g = g(this.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkb dhkbVar = (dhkb) bZ.b;
        int i = dhkbVar.a | 1;
        dhkbVar.a = i;
        dhkbVar.b = g;
        float f = this.c;
        dhkbVar.a = i | 2;
        dhkbVar.c = f + 90.0f;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar = (dhjx) dhjwVar.b;
        dhkb bK = bZ.bK();
        dhjx dhjxVar2 = dhjx.f;
        bK.getClass();
        dhjxVar.c = bK;
        dhjxVar.a |= 2;
        float f2 = this.b;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar3 = (dhjx) dhjwVar.b;
        dhjxVar3.a |= 8;
        dhjxVar3.e = f2;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        return "UserOrientation[" + this.a + ", " + this.c + ", " + this.b + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.b);
    }

    public UserOrientation(Parcel parcel) {
        a(parcel.readFloat());
        c(parcel.readFloat());
        d(parcel.readFloat());
    }

    public UserOrientation(dhjx dhjxVar) {
        float f = 0.0f;
        float f2 = 60.0f;
        dhkb dhkbVar = dhjxVar.c;
        a((dhkbVar == null ? dhkb.e : dhkbVar).b);
        dhkb dhkbVar2 = dhjxVar.c;
        if (((dhkbVar2 == null ? dhkb.e : dhkbVar2).a & 2) != 0) {
            dhkb dhkbVar3 = dhjxVar.c;
            f = (dhkbVar3 == null ? dhkb.e : dhkbVar3).c - 90.0f;
        }
        c(f);
        d((dhjxVar.a & 8) != 0 ? dhjxVar.e : f2);
    }
}
