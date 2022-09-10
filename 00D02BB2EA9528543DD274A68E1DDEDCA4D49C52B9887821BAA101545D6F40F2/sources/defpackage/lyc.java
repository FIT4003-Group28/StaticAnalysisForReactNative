package defpackage;
/* compiled from: PG */
/* renamed from: lyc  reason: default package */
/* loaded from: classes7.dex */
final class lyc implements lyd {
    final /* synthetic */ lye a;
    private final dcdc<ldm> b;
    private final lyy c;
    private final int d;
    @dzsi
    private final dpfh e;
    private final amte f;
    private final lzd g;
    @dzsi
    private final lze h;

    public lyc(lye lyeVar, dcdc<ldm> dcdcVar, lyy lyyVar, @dzsi int i, dpfh dpfhVar, amte amteVar, @dzsi lzd lzdVar, lze lzeVar) {
        this.a = lyeVar;
        this.b = dcdcVar;
        this.c = lyyVar;
        this.d = i;
        this.e = dpfhVar;
        dbsk.s(amteVar);
        this.f = amteVar;
        dbsk.s(lzdVar);
        this.g = lzdVar;
        this.h = lzeVar;
    }

    @Override // defpackage.lyd
    public final void a() {
        crfm crfmVar = this.a.c;
        crfn a = crfn.a(this.f);
        a.d = this.d;
        dpfh dpfhVar = this.e;
        a.k = dpfhVar == null ? null : dpfhVar.f;
        a.b = lye.m();
        crfmVar.c(a.c());
    }

    @Override // defpackage.lyd
    public final arym b() {
        return arym.GUIDED_NAV;
    }

    @Override // defpackage.lyd
    public final void c() {
        lze lzeVar = this.h;
        if (lzeVar != null) {
            lzeVar.a();
        }
    }

    @Override // defpackage.lyd
    public final void d() {
        this.g.a(this.b, this.c);
    }
}
