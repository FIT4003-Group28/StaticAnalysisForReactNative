package defpackage;
/* compiled from: PG */
/* renamed from: buwq  reason: default package */
/* loaded from: classes4.dex */
public final class buwq implements buwp {
    public final dxio<btze> a;
    public final bvrb b;
    public final buac c;

    public buwq(dxio<btze> dxioVar, bvrb bvrbVar) {
        this.a = dxioVar;
        this.b = bvrbVar;
        buac a = buad.a();
        this.c = a;
        dunt duntVar = dunt.REJECT_PEOPLE_FOLLOWER_REQUEST;
        a.i = btyk.GMM_SERVER;
        btyp bZ = btyq.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        btyq btyqVar = (btyq) bZ.b;
        int i = btyqVar.a | 1;
        btyqVar.a = i;
        btyqVar.b = true;
        int i2 = i | 8;
        btyqVar.a = i2;
        btyqVar.e = false;
        int i3 = i2 | 2;
        btyqVar.a = i3;
        btyqVar.c = false;
        int i4 = i3 | 32;
        btyqVar.a = i4;
        btyqVar.g = true;
        btyqVar.a = i4 | 4;
        btyqVar.d = false;
        btyq.b(btyqVar);
        a.a = bZ.bK();
        btyr bZ2 = btys.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        btys btysVar = (btys) bZ2.b;
        int i5 = btysVar.a | 8;
        btysVar.a = i5;
        btysVar.e = 0;
        int i6 = i5 | 2;
        btysVar.a = i6;
        btysVar.c = 1;
        int i7 = i6 | 1;
        btysVar.a = i7;
        btysVar.b = 100;
        btysVar.a = i7 | 4;
        btysVar.d = 30000L;
        a.c(bZ2.bK());
        btyv bZ3 = btyw.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        btyw btywVar = (btyw) bZ3.b;
        btywVar.a |= 1;
        btywVar.b = 0;
        a.d(bZ3.bK());
        a.g = duntVar;
        a.h = (dssr) djoq.b.cu(7);
        btyl bZ4 = btyo.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        btyo btyoVar = (btyo) bZ4.b;
        btyoVar.c = 0;
        int i8 = btyoVar.a | 2;
        btyoVar.a = i8;
        btyoVar.a = i8 | 4;
        btyoVar.d = 0;
        a.d = bZ4.bK();
    }

    @Override // defpackage.btzo
    public final buac a() {
        return this.c;
    }

    @Override // defpackage.btzo
    /* renamed from: c */
    public final buwr b() {
        return new buwr(this);
    }
}
