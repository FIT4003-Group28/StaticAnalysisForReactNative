package defpackage;
/* compiled from: PG */
/* renamed from: ldw  reason: default package */
/* loaded from: classes7.dex */
final class ldw implements Runnable {
    final /* synthetic */ dcdc a;
    final /* synthetic */ lyy b;
    final /* synthetic */ ldx c;

    public ldw(ldx ldxVar, dcdc dcdcVar, lyy lyyVar) {
        this.c = ldxVar;
        this.a = dcdcVar;
        this.b = lyyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b.b.a();
        ldz ldzVar = this.c.b;
        ldy ldyVar = ldzVar.d;
        lkn lknVar = ldzVar.p;
        dcdc<ldm> dcdcVar = this.a;
        lyy lyyVar = this.b;
        final les lesVar = ldzVar.k;
        lesVar.getClass();
        lkr b = ldyVar.b(lknVar, dcdcVar, lyyVar, new Runnable(lesVar) { // from class: ldv
            private final les a;

            {
                this.a = lesVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        });
        non j = this.c.b.g.j();
        ldz ldzVar2 = this.c.b;
        les lesVar2 = ldzVar2.k;
        if (j == lesVar2) {
            boolean z = b.u;
            lesVar2.u();
        } else {
            dbsk.l(ldzVar2.l != null);
            this.c.b.g.n();
        }
        if (this.c.b.m) {
            b.d();
        }
        this.c.b.g.k(b);
        this.c.b.b.b();
        ldz ldzVar3 = this.c.b;
        ldzVar3.l = b;
        dcba<ldu> dcbaVar = ldzVar3.n;
        ldzVar3.h.b();
        dcbaVar.add(new ldu());
        this.c.b.k.n();
    }
}
