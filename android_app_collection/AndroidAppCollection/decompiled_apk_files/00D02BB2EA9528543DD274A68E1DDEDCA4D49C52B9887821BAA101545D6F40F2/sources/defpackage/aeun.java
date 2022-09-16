package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aeun  reason: default package */
/* loaded from: classes2.dex */
public final class aeun {
    private final bvrb a;
    private final buxh b;

    public aeun(bvrb bvrbVar, buxh buxhVar) {
        this.a = bvrbVar;
        this.b = buxhVar;
    }

    public static String a(dwhj dwhjVar) {
        dfyp dfypVar = dwhjVar.e;
        if (dfypVar == null) {
            dfypVar = dfyp.d;
        }
        if ((dfypVar.a & 4) != 0) {
            dfyp dfypVar2 = dwhjVar.e;
            if (dfypVar2 == null) {
                dfypVar2 = dfyp.d;
            }
            dgly dglyVar = dfypVar2.c;
            if (dglyVar == null) {
                dglyVar = dgly.c;
            }
            return dglyVar.a;
        }
        dfyp dfypVar3 = dwhjVar.e;
        if (dfypVar3 == null) {
            dfypVar3 = dfyp.d;
        }
        if ((dfypVar3.a & 2) == 0) {
            return "";
        }
        dfyp dfypVar4 = dwhjVar.e;
        if (dfypVar4 == null) {
            dfypVar4 = dfyp.d;
        }
        dgly dglyVar2 = dfypVar4.b;
        if (dglyVar2 == null) {
            dglyVar2 = dgly.c;
        }
        return dglyVar2.a;
    }

    public final dehn<aeuk> b(GmmLocation gmmLocation, int i) {
        dwhe bZ = dwhf.i.bZ();
        akqq B = gmmLocation.B();
        alaa a = alad.a();
        a.c(B);
        a.c = 16.0f;
        dhjx d = alad.d(a.a(), 1.0f, 13.1f, 640, 960);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwhf dwhfVar = (dwhf) bZ.b;
        d.getClass();
        dwhfVar.c = d;
        int i2 = dwhfVar.a | 2;
        dwhfVar.a = i2;
        dwhfVar.e = i - 1;
        dwhfVar.a = i2 | 8;
        final deig d2 = deig.d();
        aeum aeumVar = new aeum(d2);
        final btzc b = ((buxj) this.b).b().b(bZ.bK(), aeumVar, this.a.h());
        d2.Pk(new Runnable(d2, b) { // from class: aeul
            private final deig a;
            private final btzc b;

            {
                this.a = d2;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                btzc btzcVar = this.b;
                if (deigVar.isCancelled()) {
                    btzcVar.a();
                }
            }
        }, this.a.h());
        return d2;
    }
}
