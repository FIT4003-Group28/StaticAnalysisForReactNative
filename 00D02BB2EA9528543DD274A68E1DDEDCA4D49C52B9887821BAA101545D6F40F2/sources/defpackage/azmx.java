package defpackage;
/* compiled from: PG */
/* renamed from: azmx  reason: default package */
/* loaded from: classes3.dex */
final class azmx implements degu<azxi> {
    final /* synthetic */ deig a;
    final /* synthetic */ azmy b;

    public azmx(azmy azmyVar, deig deigVar) {
        this.b = azmyVar;
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi azxi azxiVar) {
        final azxi azxiVar2 = azxiVar;
        final deig deigVar = this.a;
        this.b.c.a().b(new axxd(this, azxiVar2, deigVar) { // from class: azmw
            private final azmx a;
            private final azxi b;
            private final deig c;

            {
                this.a = this;
                this.b = azxiVar2;
                this.c = deigVar;
            }

            @Override // defpackage.axxd
            public final void a(boolean z) {
                azmx azmxVar = this.a;
                azxi azxiVar3 = this.b;
                deig deigVar2 = this.c;
                try {
                    azmy azmyVar = azmxVar.b;
                    dbsk.s(azxiVar3);
                    dbsg<azxi> b = azmyVar.b(azxiVar3);
                    if (b.a()) {
                        deigVar2.j(b.b());
                    } else {
                        deigVar2.j(azxiVar3);
                    }
                } catch (axxc e) {
                    deigVar2.k(e);
                }
            }
        });
    }
}
