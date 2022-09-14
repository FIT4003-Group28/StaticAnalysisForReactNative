package defpackage;
/* compiled from: PG */
/* renamed from: bbae  reason: default package */
/* loaded from: classes3.dex */
final class bbae implements bexy {
    final /* synthetic */ bbag a;

    public bbae(bbag bbagVar) {
        this.a = bbagVar;
    }

    @Override // defpackage.bexy
    public final void a(bexz bexzVar, final boolean z) {
        this.a.a.b(new Runnable(this, z) { // from class: bbac
            private final bbae a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bbae bbaeVar = this.a;
                if (this.b) {
                    bbaeVar.a.k(true);
                    bbaeVar.a.u();
                    bbaeVar.a.c = false;
                } else {
                    bbaeVar.a.b.clear();
                    bbaeVar.a.l(false, new Runnable(bbaeVar) { // from class: bbad
                        private final bbae a;

                        {
                            this.a = bbaeVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.j();
                        }
                    });
                }
                bbaeVar.a.A(false);
                cqkx.p(bbaeVar.a);
            }
        }, bvrj.UI_THREAD);
    }
}
