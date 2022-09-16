package defpackage;
/* compiled from: PG */
/* renamed from: bsqn  reason: default package */
/* loaded from: classes4.dex */
public class bsqn implements bssi {
    private final cqg a;
    private final cjtd b = cjtd.a(dtxj.K);
    private final boolean c;

    public bsqn(dzsj<cqg> dzsjVar, btvo btvoVar) {
        this.a = dzsjVar.a();
        this.c = btvoVar.getUgcParameters().t();
    }

    @Override // defpackage.bssi
    public cqkl a() {
        this.a.b(cqf.a(dnqb.SEARCH_RESULT), true);
        return cqkl.a;
    }

    @Override // defpackage.bssi
    public cjtd b() {
        return this.b;
    }

    @Override // defpackage.bssi
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }
}
