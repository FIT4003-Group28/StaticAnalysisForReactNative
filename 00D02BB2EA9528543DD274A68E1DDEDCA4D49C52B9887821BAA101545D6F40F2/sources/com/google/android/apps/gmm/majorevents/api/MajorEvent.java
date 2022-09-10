package com.google.android.apps.gmm.majorevents.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MajorEvent implements Parcelable {
    public static final Parcelable.Creator<MajorEvent> CREATOR = new akgb();
    public final aknt a;
    public final diwb b;
    private akrc c;

    public MajorEvent(aknt akntVar, diwb diwbVar) {
        this.a = akntVar;
        ditt dittVar = diwbVar.e;
        dittVar = dittVar == null ? ditt.n : dittVar;
        dsqp dsqpVar = (dsqp) dittVar.cu(5);
        dsqpVar.bC(dittVar);
        ditq ditqVar = (ditq) dsqpVar;
        if (ditqVar.c) {
            ditqVar.bF();
            ditqVar.c = false;
        }
        ditt dittVar2 = (ditt) ditqVar.b;
        dittVar2.a &= -3;
        dittVar2.c = ditt.n.c;
        ditt bK = ditqVar.bK();
        if (!ditt.n.equals(bK)) {
            dsqp dsqpVar2 = (dsqp) diwbVar.cu(5);
            dsqpVar2.bC(diwbVar);
            diug diugVar = (diug) dsqpVar2;
            if (diugVar.c) {
                diugVar.bF();
                diugVar.c = false;
            }
            diwb diwbVar2 = (diwb) diugVar.b;
            bK.getClass();
            diwbVar2.e = bK;
            diwbVar2.a |= 4;
            this.b = (diwb) diugVar.bK();
            return;
        }
        dsqp dsqpVar3 = (dsqp) diwbVar.cu(5);
        dsqpVar3.bC(diwbVar);
        diug diugVar2 = (diug) dsqpVar3;
        if (diugVar2.c) {
            diugVar2.bF();
            diugVar2.c = false;
        }
        diwb diwbVar3 = (diwb) diugVar2.b;
        diwbVar3.e = null;
        diwbVar3.a &= -5;
        this.b = (diwb) diugVar2.bK();
    }

    private final boolean n(akqs akqsVar) {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        dits ditsVar = dittVar.e;
        if (ditsVar == null) {
            ditsVar = dits.f;
        }
        dpuo dpuoVar = ditsVar.c;
        if (dpuoVar == null) {
            dpuoVar = dpuo.b;
        }
        if (dpuoVar.a.size() < 3) {
            return false;
        }
        akrp g = akrp.g(akra.f(akqsVar.j()), akra.f(akqsVar.k()));
        if (this.c == null) {
            ditt dittVar2 = this.b.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            dits ditsVar2 = dittVar2.e;
            if (ditsVar2 == null) {
                ditsVar2 = dits.f;
            }
            dpuo dpuoVar2 = ditsVar2.c;
            if (dpuoVar2 == null) {
                dpuoVar2 = dpuo.b;
            }
            dsrj<dpum> dsrjVar = dpuoVar2.a;
            akra[] akraVarArr = new akra[dsrjVar.size()];
            for (int i = 0; i < dsrjVar.size(); i++) {
                dpum dpumVar = dsrjVar.get(i);
                akraVarArr[i] = akra.e(dpumVar.b, dpumVar.c);
            }
            this.c = new akrc(akraVarArr);
        }
        return g.k(this.c);
    }

    public final String a() {
        return this.b.c;
    }

    @dzsi
    public final ditt b() {
        if (this.a == aknt.AMBIENT || this.a == aknt.COMPLETE) {
            ditt dittVar = this.b.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            dsqp dsqpVar = (dsqp) dittVar.cu(5);
            dsqpVar.bC(dittVar);
            ditq ditqVar = (ditq) dsqpVar;
            String a = a();
            if (ditqVar.c) {
                ditqVar.bF();
                ditqVar.c = false;
            }
            ditt dittVar2 = (ditt) ditqVar.b;
            a.getClass();
            dittVar2.a |= 2;
            dittVar2.c = a;
            return ditqVar.bK();
        }
        return null;
    }

    public final boolean c() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        return (dittVar.a & 1) != 0;
    }

    public final String d() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        return dittVar.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        return dittVar.i;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof MajorEvent)) {
            return false;
        }
        MajorEvent majorEvent = (MajorEvent) obj;
        return this.a == majorEvent.a && this.b.equals(majorEvent.b);
    }

    public final String f() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        return dittVar.f;
    }

    public final diuw g() {
        diuw diuwVar = this.b.u;
        return diuwVar == null ? diuw.e : diuwVar;
    }

    public final boolean h() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        return (dittVar.a & 512) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final akqs i() {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        dbsk.l((dittVar.a & 512) != 0);
        ditt dittVar2 = this.b.e;
        if (dittVar2 == null) {
            dittVar2 = ditt.n;
        }
        dpuq dpuqVar = dittVar2.k;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        akqr a = akqs.a();
        dpum dpumVar = dpuqVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        double d = dpumVar.b;
        dpum dpumVar2 = dpuqVar.b;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        a.c(d, dpumVar2.c);
        dpum dpumVar3 = dpuqVar.c;
        if (dpumVar3 == null) {
            dpumVar3 = dpum.d;
        }
        double d2 = dpumVar3.b;
        dpum dpumVar4 = dpuqVar.c;
        if (dpumVar4 == null) {
            dpumVar4 = dpum.d;
        }
        a.c(d2, dpumVar4.c);
        return a.b();
    }

    public final boolean j() {
        diuw diuwVar = this.b.u;
        if (diuwVar == null) {
            diuwVar = diuw.e;
        }
        diuv diuvVar = diuwVar.c;
        if (diuvVar == null) {
            diuvVar = diuv.g;
        }
        return (diuvVar.a & 1) != 0;
    }

    public final akqs k() {
        diuw diuwVar = this.b.u;
        if (diuwVar == null) {
            diuwVar = diuw.e;
        }
        diuv diuvVar = diuwVar.c;
        if (diuvVar == null) {
            diuvVar = diuv.g;
        }
        boolean z = true;
        if (1 != (diuvVar.a & 1)) {
            z = false;
        }
        dbsk.l(z);
        diuw diuwVar2 = this.b.u;
        if (diuwVar2 == null) {
            diuwVar2 = diuw.e;
        }
        diuv diuvVar2 = diuwVar2.c;
        if (diuvVar2 == null) {
            diuvVar2 = diuv.g;
        }
        dpuq dpuqVar = diuvVar2.c;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        akqr a = akqs.a();
        dpum dpumVar = dpuqVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        double d = dpumVar.b;
        dpum dpumVar2 = dpuqVar.b;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        a.c(d, dpumVar2.c);
        dpum dpumVar3 = dpuqVar.c;
        if (dpumVar3 == null) {
            dpumVar3 = dpum.d;
        }
        double d2 = dpumVar3.b;
        dpum dpumVar4 = dpuqVar.c;
        if (dpumVar4 == null) {
            dpumVar4 = dpum.d;
        }
        a.c(d2, dpumVar4.c);
        return a.b();
    }

    public final boolean l(akqs akqsVar, double d) {
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        dits ditsVar = dittVar.e;
        if (ditsVar == null) {
            ditsVar = dits.f;
        }
        if ((ditsVar.a & 8) != 0) {
            ditt dittVar2 = this.b.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            dits ditsVar2 = dittVar2.e;
            if (ditsVar2 == null) {
                ditsVar2 = dits.f;
            }
            if (d >= ditsVar2.e) {
                return n(akqsVar);
            }
            return false;
        }
        ditt dittVar3 = this.b.e;
        if (dittVar3 == null) {
            dittVar3 = ditt.n;
        }
        dits ditsVar3 = dittVar3.e;
        if (ditsVar3 == null) {
            ditsVar3 = dits.f;
        }
        if (d >= ditsVar3.d) {
            return n(akqsVar);
        }
        return false;
    }

    public final dpwv m() {
        dpwu bZ = dpwv.d.bZ();
        String str = this.b.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpwv dpwvVar = (dpwv) bZ.b;
        str.getClass();
        dpwvVar.a |= 1;
        dpwvVar.b = str;
        ditt dittVar = this.b.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        if ((dittVar.a & 2048) != 0) {
            ditt dittVar2 = this.b.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            long j = dittVar2.m;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpwv dpwvVar2 = (dpwv) bZ.b;
            dpwvVar2.a |= 2;
            dpwvVar2.c = j;
        }
        return bZ.bK();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aknp bZ = aknq.d.bZ();
        aknt akntVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aknq aknqVar = (aknq) bZ.b;
        aknqVar.b = akntVar.e;
        int i2 = aknqVar.a | 1;
        aknqVar.a = i2;
        diwb diwbVar = this.b;
        diwbVar.getClass();
        aknqVar.c = diwbVar;
        aknqVar.a = i2 | 2;
        parcel.writeByteArray(bZ.bK().bS());
    }
}
