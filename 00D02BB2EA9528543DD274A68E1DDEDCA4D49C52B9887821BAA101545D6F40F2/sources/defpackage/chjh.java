package defpackage;
/* compiled from: PG */
/* renamed from: chjh  reason: default package */
/* loaded from: classes4.dex */
final class chjh implements bexy {
    final /* synthetic */ chjk a;

    public chjh(chjk chjkVar) {
        this.a = chjkVar;
    }

    @Override // defpackage.bexy
    public final void a(final bexz bexzVar, final boolean z) {
        this.a.g.b(new Runnable(this, z, bexzVar) { // from class: chjg
            private final chjh a;
            private final boolean b;
            private final bexz c;

            {
                this.a = this;
                this.b = z;
                this.c = bexzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chjh chjhVar = this.a;
                boolean z2 = this.b;
                bexz bexzVar2 = this.c;
                if (z2) {
                    chjk chjkVar = chjhVar.a;
                    chjkVar.k = bexzVar2.c(chjkVar.e);
                    chjk chjkVar2 = chjhVar.a;
                    baal baalVar = chjkVar2.k;
                    if (baalVar != null) {
                        chjkVar2.a = bexzVar2.e(baalVar);
                    }
                }
                chjk chjkVar3 = chjhVar.a;
                chjkVar3.j = false;
                cqkx.p(chjkVar3);
            }
        }, bvrj.UI_THREAD);
    }
}
