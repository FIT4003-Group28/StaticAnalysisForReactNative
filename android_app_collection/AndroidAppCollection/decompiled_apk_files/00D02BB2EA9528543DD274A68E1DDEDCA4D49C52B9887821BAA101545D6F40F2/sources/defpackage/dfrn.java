package defpackage;

import android.animation.TypeEvaluator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrn  reason: default package */
/* loaded from: classes6.dex */
public final class dfrn implements TypeEvaluator<dhjx> {
    private final dhjw a = dhjx.f.bZ();
    private final dhjy b = dhjz.e.bZ();
    private final dhka c = dhkb.e.bZ();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ dhjx evaluate(float f, dhjx dhjxVar, dhjx dhjxVar2) {
        dhjx dhjxVar3;
        dhjx dhjxVar4 = dhjxVar;
        dhjx dhjxVar5 = dhjxVar2;
        dhjw dhjwVar = this.a;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar6 = (dhjx) dhjwVar.b;
        dhjx dhjxVar7 = dhjx.f;
        dhjxVar6.b = null;
        dhjxVar6.a &= -2;
        dhjw dhjwVar2 = this.a;
        if (dhjwVar2.c) {
            dhjwVar2.bF();
            dhjwVar2.c = false;
        }
        dhjx dhjxVar8 = (dhjx) dhjwVar2.b;
        dhjxVar8.c = null;
        dhjxVar8.a &= -3;
        dhjw dhjwVar3 = this.a;
        if (dhjwVar3.c) {
            dhjwVar3.bF();
            dhjwVar3.c = false;
        }
        dhjx dhjxVar9 = (dhjx) dhjwVar3.b;
        dhjxVar9.a &= -9;
        dhjxVar9.e = 0.0f;
        double d = f;
        Double.isNaN(d);
        double d2 = 1.0d - d;
        if ((dhjxVar4.a & 1) != 0 && (dhjxVar5.a & 1) != 0) {
            dhjz dhjzVar = dhjxVar4.b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            dhjz dhjzVar2 = dhjxVar5.b;
            if (dhjzVar2 == null) {
                dhjzVar2 = dhjz.e;
            }
            dhjy dhjyVar = this.b;
            double d3 = dhjzVar2.b;
            Double.isNaN(d);
            double d4 = (dhjzVar.b * d2) + (d3 * d);
            if (dhjyVar.c) {
                dhjyVar.bF();
                dhjyVar.c = false;
            }
            dhjz dhjzVar3 = (dhjz) dhjyVar.b;
            int i = dhjzVar3.a | 1;
            dhjzVar3.a = i;
            dhjzVar3.b = d4;
            double d5 = dhjzVar.c;
            double d6 = dhjzVar2.c;
            int i2 = i | 2;
            dhjzVar3.a = i2;
            Double.isNaN(d);
            dhjzVar3.c = (d5 * d2) + (d6 * d);
            double d7 = dhjzVar.d;
            double d8 = dhjzVar2.d;
            dhjzVar3.a = i2 | 4;
            Double.isNaN(d);
            dhjzVar3.d = (d7 * d2) + (d8 * d);
            dhjw dhjwVar4 = this.a;
            dhjy dhjyVar2 = this.b;
            if (dhjwVar4.c) {
                dhjwVar4.bF();
                dhjwVar4.c = false;
            }
            dhjx dhjxVar10 = (dhjx) dhjwVar4.b;
            dhjz bK = dhjyVar2.bK();
            bK.getClass();
            dhjxVar10.b = bK;
            dhjxVar10.a |= 1;
        }
        if ((dhjxVar4.a & 2) == 0 || (dhjxVar5.a & 2) == 0) {
            dhjxVar3 = dhjxVar5;
        } else {
            dhkb dhkbVar = dhjxVar4.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            float f2 = dhkbVar.b;
            dhkb dhkbVar2 = dhjxVar5.c;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            float f3 = dfug.f(f2, dhkbVar2.b);
            dhkb dhkbVar3 = dhjxVar4.c;
            if (dhkbVar3 == null) {
                dhkbVar3 = dhkb.e;
            }
            float f4 = dhkbVar3.c;
            dhkb dhkbVar4 = dhjxVar5.c;
            if (dhkbVar4 == null) {
                dhkbVar4 = dhkb.e;
            }
            float f5 = dhkbVar4.c;
            dhkb dhkbVar5 = dhjxVar4.c;
            if (dhkbVar5 == null) {
                dhkbVar5 = dhkb.e;
            }
            float f6 = dhkbVar5.d;
            dhkb dhkbVar6 = dhjxVar5.c;
            if (dhkbVar6 == null) {
                dhkbVar6 = dhkb.e;
            }
            float f7 = dhkbVar6.d;
            float f8 = dfug.f(f6, f7);
            dhka dhkaVar = this.c;
            float e = dfug.e(f2 + (f3 * f));
            if (dhkaVar.c) {
                dhkaVar.bF();
                dhkaVar.c = false;
            }
            dhkb dhkbVar7 = (dhkb) dhkaVar.b;
            dhjxVar3 = dhjxVar5;
            dhkbVar7.a |= 1;
            dhkbVar7.b = e;
            double d9 = f4;
            Double.isNaN(d9);
            double d10 = f5;
            Double.isNaN(d);
            Double.isNaN(d10);
            float d11 = dfug.d((float) ((d9 * d2) + (d10 * d)), 0.0f, 180.0f);
            if (dhkaVar.c) {
                dhkaVar.bF();
                dhkaVar.c = false;
            }
            dhkb dhkbVar8 = (dhkb) dhkaVar.b;
            dhkbVar8.a |= 2;
            dhkbVar8.c = d11;
            if (f6 != 0.0f || f7 != 0.0f) {
                dhka dhkaVar2 = this.c;
                float e2 = dfug.e(f6 + (f * f8));
                if (dhkaVar2.c) {
                    dhkaVar2.bF();
                    dhkaVar2.c = false;
                }
                dhkb dhkbVar9 = (dhkb) dhkaVar2.b;
                dhkbVar9.a |= 4;
                dhkbVar9.d = e2;
            }
            dhjw dhjwVar5 = this.a;
            dhka dhkaVar3 = this.c;
            if (dhjwVar5.c) {
                dhjwVar5.bF();
                dhjwVar5.c = false;
            }
            dhjx dhjxVar11 = (dhjx) dhjwVar5.b;
            dhkb bK2 = dhkaVar3.bK();
            bK2.getClass();
            dhjxVar11.c = bK2;
            dhjxVar11.a |= 2;
        }
        if ((dhjxVar4.a & 8) != 0) {
            dhjx dhjxVar12 = dhjxVar3;
            if ((dhjxVar12.a & 8) != 0) {
                dhjw dhjwVar6 = this.a;
                double d12 = dhjxVar4.e;
                Double.isNaN(d12);
                double d13 = dhjxVar12.e;
                Double.isNaN(d);
                Double.isNaN(d13);
                float f9 = (float) ((d2 * d12) + (d * d13));
                if (dhjwVar6.c) {
                    dhjwVar6.bF();
                    dhjwVar6.c = false;
                }
                dhjx dhjxVar13 = (dhjx) dhjwVar6.b;
                dhjxVar13.a |= 8;
                dhjxVar13.e = f9;
            }
        }
        return this.a.bK();
    }
}
