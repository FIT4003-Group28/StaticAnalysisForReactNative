package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tnd  reason: default package */
/* loaded from: classes7.dex */
public final class tnd {
    private final Activity a;

    public tnd(Activity activity) {
        this.a = activity;
    }

    public final bwnj a(dcdc<amvh> dcdcVar, int i, boolean z) {
        bxla bxlaVar;
        dtjs dtjsVar;
        dbsk.a(i >= 0 && i < dcdcVar.size());
        bwnj bwnjVar = new bwnj();
        dcdc z2 = dcbg.b(dcdcVar).s(tnc.a).z();
        dtjq bZ = dtjt.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar = (dtjt) bZ.b;
        dtjtVar.a |= 2;
        dtjtVar.d = i;
        dtju bZ2 = dtjv.d.bZ();
        dqvj dqvjVar = dqvj.MIXED;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dtjv dtjvVar = (dtjv) bZ2.b;
        dtjvVar.b = dqvjVar.k;
        dtjvVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtjt dtjtVar2 = (dtjt) bZ.b;
        dtjv bK = bZ2.bK();
        bK.getClass();
        dtjtVar2.b = bK;
        dtjtVar2.a |= 1;
        bZ.a(z2);
        dtjt bK2 = bZ.bK();
        bwnjVar.c(dtja.DIRECTIONS_DRIVING);
        if (i == 0) {
            bxlaVar = bxla.START_LOCATION;
        } else if (i == dcdcVar.size() - 1) {
            bxlaVar = bxla.END_LOCATION;
        } else {
            bxlaVar = bxla.VIA_LOCATION;
        }
        bwnjVar.m(bxlaVar);
        bwnjVar.p(bwnl.a);
        if (i == 0) {
            dtjsVar = dtjs.SOURCE;
        } else if (i != dcdcVar.size() - 1) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
                if (!dcdcVar.get(i2).a()) {
                    if (i2 < i) {
                        z3 = true;
                    } else if (i2 > i) {
                        z4 = true;
                    }
                }
            }
            if (!z3) {
                dtjsVar = dtjs.SOURCE;
            } else if (!z4) {
                dtjsVar = dtjs.DESTINATION;
            } else {
                dtjsVar = dtjs.VIA;
            }
        } else {
            dtjsVar = dtjs.DESTINATION;
        }
        bwnjVar.k(dtjsVar);
        bwnjVar.E(bK2);
        bwnjVar.e(!z);
        bwnjVar.g(z);
        bwnjVar.M(false);
        bwnjVar.G(z);
        bwnjVar.W(bwnd.b(this.a.getResources(), bK2, bwnjVar), null);
        return bwnjVar;
    }
}
