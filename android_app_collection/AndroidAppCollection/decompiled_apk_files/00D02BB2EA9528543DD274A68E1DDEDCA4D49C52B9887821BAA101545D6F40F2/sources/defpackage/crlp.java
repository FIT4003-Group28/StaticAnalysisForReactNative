package defpackage;
/* compiled from: PG */
/* renamed from: crlp  reason: default package */
/* loaded from: classes5.dex */
public final class crlp implements crgy {
    public static final dcqe a = dcqe.c("crlp");
    @dzsi
    public crln b;
    @dzsi
    public crlo c;
    public long d;
    private final btrm e;

    public crlp(btrm btrmVar) {
        dbsk.t(btrmVar, "eventBus");
        this.e = btrmVar;
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        btrm btrmVar = this.e;
        dceq a2 = dcet.a();
        a2.b(cria.class, new crlq(cria.class, this));
        btrmVar.g(this, a2.a());
        e();
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        this.e.a(this);
    }

    @dzsi
    public final dspd c() {
        crlo crloVar = this.c;
        if (crloVar != null) {
            this.d = crloVar.b;
            this.c = null;
        }
        crln crlnVar = this.b;
        if (crlnVar == null) {
            return null;
        }
        return crlnVar.a;
    }

    public final void d(dspd dspdVar, long j) {
        e();
        this.b = new crln(dspdVar, j);
    }

    public final void e() {
        this.b = null;
        this.c = null;
        this.d = -1L;
    }
}
