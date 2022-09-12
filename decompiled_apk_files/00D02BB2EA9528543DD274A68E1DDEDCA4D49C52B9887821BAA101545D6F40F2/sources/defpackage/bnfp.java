package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnfp  reason: default package */
/* loaded from: classes3.dex */
public class bnfp implements bnem {
    final e a;
    public final crzp<ccih> b;
    public final gga c;
    public final cchz d;
    public final Executor e;
    @dzsi
    public ccih f;

    public bnfp(gga ggaVar, cchz cchzVar, Executor executor) {
        e eVar = new e() { // from class: com.google.android.apps.gmm.place.updates.viewmodelimpl.UserProfileBarViewModelImpl$1
            @Override // defpackage.f
            public final void a(m mVar) {
            }

            @Override // defpackage.f
            public final void b(m mVar) {
                crzm<ccih> d = bnfp.this.d.d();
                bnfp bnfpVar = bnfp.this;
                d.d(bnfpVar.b, bnfpVar.e);
            }

            @Override // defpackage.f
            public final void c(m mVar) {
            }

            @Override // defpackage.f
            public final void d(m mVar) {
            }

            @Override // defpackage.f
            public final void e(m mVar) {
                bnfp.this.d.d().c(bnfp.this.b);
            }

            @Override // defpackage.f
            public final void f(m mVar) {
                bnfp.this.c.g.b(this);
            }
        };
        this.a = eVar;
        this.b = new bnfo(this);
        this.c = ggaVar;
        this.d = cchzVar;
        this.e = executor;
        ggaVar.g.a(eVar);
    }

    @Override // defpackage.bnem
    public String a() {
        ccih ccihVar = this.f;
        return ccihVar == null ? "" : (String) dbsg.j(ccihVar.a().v()).c("");
    }

    @Override // defpackage.bnem
    @dzsi
    public jic b() {
        ccih ccihVar = this.f;
        return new jic(ccihVar == null ? "" : ccihVar.b(), ckqc.FIFE_MERGE, 2131232998);
    }
}
