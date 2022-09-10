package defpackage;
/* compiled from: PG */
/* renamed from: bnmg  reason: default package */
/* loaded from: classes3.dex */
public class bnmg implements bnmf {
    @dzsi
    private final jdi a;
    private final btvo b;
    private final dxio<bvjj> c;
    private final dxio<afha> d;
    private final gga e;

    public bnmg(@dzsi jdi jdiVar, btvo btvoVar, dxio<bvjj> dxioVar, dxio<afha> dxioVar2, gga ggaVar) {
        this.a = jdiVar;
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = ggaVar;
    }

    @Override // defpackage.bnmf
    public String a() {
        dujy dujyVar = this.b.getAdsParameters().n;
        if (dujyVar == null) {
            dujyVar = dujy.g;
        }
        return dujyVar.a;
    }

    @Override // defpackage.bnmf
    public String b() {
        dujy dujyVar = this.b.getAdsParameters().n;
        if (dujyVar == null) {
            dujyVar = dujy.g;
        }
        return dujyVar.b;
    }

    @Override // defpackage.bnmf
    public cqkl c() {
        this.a.f();
        this.c.a().S(bvjk.kq, true);
        return cqkl.a;
    }

    @Override // defpackage.bnmf
    public cqkl d() {
        this.a.f();
        this.c.a().S(bvjk.kq, true);
        afha a = this.d.a();
        gga ggaVar = this.e;
        dujy dujyVar = this.b.getAdsParameters().n;
        if (dujyVar == null) {
            dujyVar = dujy.g;
        }
        a.k(ggaVar, dujyVar.e, 4);
        return cqkl.a;
    }
}
