package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: apvn  reason: default package */
/* loaded from: classes2.dex */
public class apvn implements apvl {
    final ilo a;
    private final dvyw b;
    private final begg c;
    @dzsi
    private final cqtd d;

    public apvn(gga ggaVar, begg beggVar, czsy czsyVar, dvyw dvywVar) {
        this.c = beggVar;
        this.b = dvywVar;
        ily ilyVar = new ily();
        ilyVar.E(dvywVar);
        this.a = ilyVar.d();
        int e = irh.p().e(ggaVar);
        Bitmap createBitmap = Bitmap.createBitmap(e, e, Bitmap.Config.ARGB_8888);
        czsyVar.b(dvywVar.i);
        cztn bZ = czto.f.bZ();
        String str = dvywVar.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        czto cztoVar = (czto) bZ.b;
        str.getClass();
        cztoVar.a |= 8;
        cztoVar.e = str;
        czsyVar.c(czta.a(bZ.bK()));
        czsyVar.a(createBitmap);
        this.d = cqtt.a(createBitmap);
    }

    @Override // defpackage.apvl
    public String a() {
        return this.b.i;
    }

    @Override // defpackage.apvl
    public String b() {
        return this.b.p;
    }

    @Override // defpackage.apvl
    public jic c() {
        return new jic(this.a.cP(), ckqc.FIFE_MONOGRAM, this.d, 0);
    }

    @Override // defpackage.apvl
    public cqkl d() {
        bwrs<ilo> a = bwrs.a(this.a);
        begj begjVar = new begj();
        begjVar.i = a;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        begjVar.n = true;
        this.c.o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.apvl
    public cjtd e() {
        return cjtd.a(dtxv.dk);
    }
}
