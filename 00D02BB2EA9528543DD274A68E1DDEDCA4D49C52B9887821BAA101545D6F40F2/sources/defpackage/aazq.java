package defpackage;
/* compiled from: PG */
/* renamed from: aazq  reason: default package */
/* loaded from: classes2.dex */
public class aazq implements jaf {
    private final dxio<bbut> a;
    private final String b;

    public aazq(dxio<bbut> dxioVar, String str) {
        this.a = dxioVar;
        this.b = str;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        throw null;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ily ilyVar = new ily();
        dvya bZ = dvyw.bv.bZ();
        String str = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        str.getClass();
        dvywVar.a |= 8;
        dvywVar.h = str;
        ilyVar.E(bZ.bK());
        ilo d = ilyVar.d();
        bbuz m = bbve.m();
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        m.e(dwyd.EXPERIENCE_SHEET);
        ((bbsu) m).b = d;
        this.a.a().j(m.a());
        return cqkl.a;
    }
}
