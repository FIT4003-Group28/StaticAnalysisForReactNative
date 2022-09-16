package defpackage;
/* compiled from: PG */
/* renamed from: omp  reason: default package */
/* loaded from: classes3.dex */
public final class omp implements omq {
    private final aadd a;

    public omp(aadd aaddVar) {
        this.a = aaddVar;
    }

    private final aynx e() {
        return this.a.a.i(aynq.LATEST).C(olg.s);
    }

    @Override // defpackage.omq
    public final aynx a() {
        return e().C(olg.u);
    }

    @Override // defpackage.omq
    public final aynx b() {
        return e().C(ona.b);
    }

    @Override // defpackage.omq
    public final aynx c() {
        return e().C(olg.t);
    }

    @Override // defpackage.omq
    public final String d() {
        asxp asxpVar = this.a.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        return (asxpVar.f & 2) != 0 ? asxpVar.al : "https://m.youtube.com/";
    }
}
