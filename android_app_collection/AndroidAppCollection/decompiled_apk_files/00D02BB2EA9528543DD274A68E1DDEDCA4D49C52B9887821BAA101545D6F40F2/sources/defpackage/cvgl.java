package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cvgl  reason: default package */
/* loaded from: classes5.dex */
public final class cvgl implements cvgh, cusr {
    private static final cvgg i = cvgk.a;
    public cufj b;
    private final cvgi c;
    private final cuss<cufp> d;
    private final dbsg<cuss<cufj>> e;
    private final boolean f;
    private cufp g;
    public cvgg a = i;
    private final cusr<cufj> h = new cusr(this) { // from class: cvgj
        private final cvgl a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            cvgl cvglVar = this.a;
            cvglVar.b = (cufj) obj;
            cvglVar.c();
        }
    };

    public cvgl(cvgi cvgiVar, cuss<cufp> cussVar, dbsg<cuss<cufj>> dbsgVar, boolean z) {
        this.c = cvgiVar;
        this.d = cussVar;
        this.e = dbsgVar;
        this.f = z;
        cvgiVar.setPresenter(this);
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
        c();
    }

    @Override // defpackage.cvgh
    public final void b() {
        this.a.a();
    }

    public final void c() {
        cufp cufpVar = this.g;
        if (cufpVar == null) {
            return;
        }
        if (cufpVar.a().c() == ConversationId.IdType.GROUP) {
            this.c.a(this.g.b().c(""), this.f);
            return;
        }
        cufj cufjVar = this.b;
        if (cufjVar == null) {
            return;
        }
        this.c.a(cufjVar.b().c(""), this.f);
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.d.q(this);
        if (this.e.a()) {
            this.e.b().q(this.h);
        }
    }
}
