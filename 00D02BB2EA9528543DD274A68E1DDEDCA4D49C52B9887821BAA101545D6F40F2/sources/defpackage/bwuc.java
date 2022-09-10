package defpackage;

import android.view.animation.AnimationUtils;
/* compiled from: PG */
/* renamed from: bwuc  reason: default package */
/* loaded from: classes4.dex */
final class bwuc implements akth {
    final /* synthetic */ bwud a;

    public bwuc(bwud bwudVar) {
        this.a = bwudVar;
    }

    @Override // defpackage.akth
    public final akwf a(akti aktiVar) {
        double d;
        synchronized (this) {
            bwud bwudVar = this.a;
            bwudVar.e.d = bwudVar.b;
            bwud bwudVar2 = this.a;
            bwudVar2.f.d = bwsr.b(bwudVar2.c);
            bwud bwudVar3 = this.a;
            bwudVar3.g.d = bwudVar3.d;
        }
        akwa bZ = akwf.h.bZ();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = this.a.h;
        if (j == -1) {
            d = 0.016666666666666666d;
        } else {
            double d2 = currentAnimationTimeMillis - j;
            Double.isNaN(d2);
            d = d2 / 1000.0d;
        }
        double d3 = decb.d(d, 0.008333333333333333d, 0.03333333333333333d);
        bwud bwudVar4 = this.a;
        bwudVar4.h = currentAnimationTimeMillis;
        bwsx bwsxVar = bwudVar4.e;
        bwsxVar.c = bwsxVar.b - bwsxVar.d;
        double d4 = 2.0d / bwsxVar.e;
        double exp = 1.0d / Math.exp(d4 * d3);
        double d5 = bwsxVar.a;
        double d6 = bwsxVar.c;
        double d7 = (d5 + (d4 * d6)) * d3;
        bwsxVar.a = (d5 - (d4 * d7)) * exp;
        double d8 = bwsxVar.d + ((d6 + d7) * exp);
        bwsxVar.b = d8;
        double a = bwsr.a(this.a.f.a(d3));
        double a2 = this.a.g.a(d3);
        dhjy bZ2 = dhjz.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = d8;
        dhjzVar.a = i | 1;
        dhjzVar.b = a;
        dhjz bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akwf akwfVar = (akwf) bZ.b;
        bK.getClass();
        akwfVar.b = bK;
        akwfVar.a |= 1;
        akwb bZ3 = akwe.d.bZ();
        float f = (float) a2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        akwe akweVar = (akwe) bZ3.b;
        akweVar.a |= 1;
        akweVar.b = f;
        akwd akwdVar = akwd.WORLD_RELATIVE;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        akwe akweVar2 = (akwe) bZ3.b;
        akweVar2.c = akwdVar.d;
        akweVar2.a |= 2;
        akwe bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akwf akwfVar2 = (akwf) bZ.b;
        bK2.getClass();
        akwfVar2.e = bK2;
        akwfVar2.a |= 8;
        akwf bK3 = bZ.bK();
        if (Math.abs(this.a.e.c) < 1.0E-6d && Math.abs(bwsr.a(this.a.f.c)) < 1.0E-6d && Math.abs(this.a.g.a) < 0.01d && Math.abs(this.a.g.c) < 0.01d) {
            aktiVar.d();
            aktiVar.a(bK3);
            this.a.h = -1L;
        }
        return bK3;
    }
}
