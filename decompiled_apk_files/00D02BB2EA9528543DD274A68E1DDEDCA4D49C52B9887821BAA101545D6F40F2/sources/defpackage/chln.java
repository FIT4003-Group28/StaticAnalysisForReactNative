package defpackage;
/* compiled from: PG */
/* renamed from: chln  reason: default package */
/* loaded from: classes4.dex */
class chln implements jbc {
    final /* synthetic */ float a;
    final /* synthetic */ dzsj b;
    final /* synthetic */ bwrs c;
    final /* synthetic */ chlr d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;
    final /* synthetic */ ddho g;

    public chln(float f, dzsj dzsjVar, bwrs bwrsVar, chlr chlrVar, String str, String str2, ddho ddhoVar) {
        this.a = f;
        this.b = dzsjVar;
        this.c = bwrsVar;
        this.d = chlrVar;
        this.e = str;
        this.f = str2;
        this.g = ddhoVar;
    }

    @Override // defpackage.jbc
    public Float a() {
        return Float.valueOf(this.a);
    }

    @Override // defpackage.jbc
    @dzsi
    public jez b() {
        final dzsj dzsjVar = this.b;
        final bwrs bwrsVar = this.c;
        final chlr chlrVar = this.d;
        return new jez(dzsjVar, bwrsVar, chlrVar) { // from class: chlm
            private final dzsj a;
            private final bwrs b;
            private final chlr c;

            {
                this.a = dzsjVar;
                this.b = bwrsVar;
                this.c = chlrVar;
            }

            @Override // defpackage.jez
            public final void a(cjqm cjqmVar, float f) {
                dzsj dzsjVar2 = this.a;
                bwrs<ilo> bwrsVar2 = this.b;
                chlr chlrVar2 = this.c;
                dnqh c = bzwi.c(blpk.THANKS_PAGE);
                if (cjqmVar.a().a()) {
                    dsqp dsqpVar = (dsqp) c.cu(5);
                    dsqpVar.bC(c);
                    dnqg dnqgVar = (dnqg) dsqpVar;
                    String b = cjqmVar.a().b();
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar = (dnqh) dnqgVar.b;
                    dnqh dnqhVar2 = dnqh.p;
                    b.getClass();
                    dnqhVar.a |= 2;
                    dnqhVar.c = b;
                    c = dnqgVar.bK();
                }
                bqjf r = bqjh.r();
                r.f(c);
                r.g(true);
                r.j((int) f);
                r.n(chbv.OBEY_SERVER_RESPONSE);
                ((bqji) dzsjVar2.a()).b(bwrsVar2, r.o());
                chlrVar2.q(false);
            }
        };
    }

    @Override // defpackage.jbc
    @dzsi
    public cjtd c() {
        cjta b = cjtd.b();
        b.b = this.e;
        b.g(this.f);
        b.d = this.g;
        return b.a();
    }
}
