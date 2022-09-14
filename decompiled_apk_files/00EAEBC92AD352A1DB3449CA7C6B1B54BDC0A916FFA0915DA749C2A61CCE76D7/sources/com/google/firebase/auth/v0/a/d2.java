package com.google.firebase.auth.v0.a;

import android.os.Parcel;
import c.e.a.b.d.e.f3;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class d2 extends c.e.a.b.d.e.a implements e2 {
    public d2() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    @Override // c.e.a.b.d.e.a
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((c.e.a.b.d.e.y2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.y2.CREATOR));
                return true;
            case 2:
                a((c.e.a.b.d.e.y2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.y2.CREATOR), (c.e.a.b.d.e.u2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.u2.CREATOR));
                return true;
            case 3:
                a((c.e.a.b.d.e.s2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.s2.CREATOR));
                return true;
            case 4:
                a((f3) c.e.a.b.d.e.m1.a(parcel, f3.CREATOR));
                return true;
            case 5:
                a((Status) c.e.a.b.d.e.m1.a(parcel, Status.CREATOR));
                return true;
            case 6:
                c();
                return true;
            case 7:
                j();
                return true;
            case 8:
                a(parcel.readString());
                return true;
            case 9:
                c(parcel.readString());
                return true;
            case 10:
                a((com.google.firebase.auth.m0) c.e.a.b.d.e.m1.a(parcel, com.google.firebase.auth.m0.CREATOR));
                return true;
            case 11:
                b(parcel.readString());
                return true;
            case 12:
                a((Status) c.e.a.b.d.e.m1.a(parcel, Status.CREATOR), (com.google.firebase.auth.m0) c.e.a.b.d.e.m1.a(parcel, com.google.firebase.auth.m0.CREATOR));
                return true;
            case 13:
                l();
                return true;
            case 14:
                a((c.e.a.b.d.e.n2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.n2.CREATOR));
                return true;
            case 15:
                a((c.e.a.b.d.e.p2) c.e.a.b.d.e.m1.a(parcel, c.e.a.b.d.e.p2.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
