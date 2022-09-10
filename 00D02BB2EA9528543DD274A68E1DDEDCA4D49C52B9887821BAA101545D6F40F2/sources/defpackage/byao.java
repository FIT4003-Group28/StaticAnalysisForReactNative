package defpackage;
/* compiled from: PG */
/* renamed from: byao  reason: default package */
/* loaded from: classes4.dex */
public final class byao implements defg {
    final /* synthetic */ byap a;

    public byao(byap byapVar) {
        this.a = byapVar;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [Request extends dssj, dssj] */
    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn a(Object obj) {
        dssj dssjVar = (dssj) obj;
        dlzs dlzsVar = (dlzs) dssjVar;
        dmaa dmaaVar = dlzsVar.a == 3 ? (dmaa) dlzsVar.b : null;
        if (dmaaVar == null) {
            return deha.a(dssjVar);
        }
        if ((dmaaVar.a & 2) != 0) {
            byap byapVar = this.a;
            dmag b = byapVar.b(byapVar.e);
            dsqp dsqpVar = (dsqp) b.cu(5);
            dsqpVar.bC(b);
            dmaf dmafVar = (dmaf) dsqpVar;
            String str = dmaaVar.c;
            if (dmafVar.c) {
                dmafVar.bF();
                dmafVar.c = false;
            }
            dmag dmagVar = (dmag) dmafVar.b;
            dmag dmagVar2 = dmag.d;
            str.getClass();
            dmagVar.a |= 1;
            dmagVar.b = str;
            byap byapVar2 = this.a;
            byapVar2.e = byapVar2.c(byapVar2.e, dmafVar);
        }
        int i = dmaaVar.b;
        if (i <= 0) {
            throw new byal(bttq.HTTP_SERVER_ERROR);
        }
        final deig d = deig.d();
        this.a.c.a(new Runnable(this, d) { // from class: byan
            private final byao a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.p(this.a.a.d());
            }
        }, bvrj.UI_THREAD, i);
        return deew.g(d, this, dege.a);
    }
}
