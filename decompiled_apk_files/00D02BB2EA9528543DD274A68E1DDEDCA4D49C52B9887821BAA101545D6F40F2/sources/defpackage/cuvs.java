package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cuvs  reason: default package */
/* loaded from: classes5.dex */
public final class cuvs implements cuvk, cusr {
    private static final cuvj i = new cuvr();
    public cufj b;
    private final cuvl c;
    private final cuss<cufp> d;
    private final dbsg<cuss<cufj>> e;
    private cufp g;
    private boolean f = false;
    public cuvj a = i;
    private final cusr<cufj> h = new cusr(this) { // from class: cuvq
        private final cuvs a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            cuvs cuvsVar = this.a;
            cuvsVar.b = (cufj) obj;
            cuvsVar.e();
        }
    };

    public cuvs(cuvl cuvlVar, cuss<cufp> cussVar, dbsg<cuss<cufj>> dbsgVar) {
        this.c = cuvlVar;
        this.e = dbsgVar;
        this.d = cussVar;
        cuvlVar.setPresenter(this);
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.d.g(this);
        if (this.e.a()) {
            this.e.b().g(this.h);
        }
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cusr
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.g = (cufp) obj;
        e();
    }

    @Override // defpackage.cuvk
    public final void b() {
        this.a.a(this.f);
    }

    @Override // defpackage.cuvk
    public final void c(boolean z) {
        this.f = z;
    }

    @Override // defpackage.cuvk
    public final void d() {
        this.a.b();
    }

    public final void e() {
        cufp cufpVar = this.g;
        if (cufpVar == null) {
            return;
        }
        if (cufpVar.a().c() == ConversationId.IdType.GROUP) {
            this.c.a(this.g.b().c(""));
            return;
        }
        cufj cufjVar = this.b;
        if (cufjVar == null) {
            return;
        }
        this.c.a(cufjVar.b().c(""));
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.d.q(this);
        if (this.e.a()) {
            this.e.b().q(this.h);
        }
    }
}
