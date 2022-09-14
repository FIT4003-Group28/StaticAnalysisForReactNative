package defpackage;
/* compiled from: PG */
/* renamed from: ajud  reason: default package */
/* loaded from: classes2.dex */
final class ajud implements ajxw {
    final /* synthetic */ ajui a;

    public ajud(ajui ajuiVar) {
        this.a = ajuiVar;
    }

    @Override // defpackage.ajxw
    public final void a(boolean z) {
        ajui ajuiVar = this.a;
        boolean z2 = ajuiVar.e;
        ajuiVar.e = z;
        if (!z) {
            ajuiVar.f.clear();
            this.a.g.clear();
        } else if (z2) {
            return;
        }
        cqkx.p(this.a);
    }

    @Override // defpackage.ajxw
    public final void b(final czha czhaVar) {
        this.a.a.execute(new Runnable(this, czhaVar) { // from class: ajua
            private final ajud a;
            private final czha b;

            {
                this.a = this;
                this.b = czhaVar;
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [ajuh, ajyk] */
            @Override // java.lang.Runnable
            public final void run() {
                final ajud ajudVar = this.a;
                final czha czhaVar2 = this.b;
                ajui ajuiVar = ajudVar.a;
                if (ajuiVar.c.a(czhaVar2, ajuiVar.d)) {
                    boolean isEmpty = ajudVar.a.f.isEmpty();
                    ?? r3 = ajudVar.a.b;
                    Runnable runnable = new Runnable(ajudVar, czhaVar2) { // from class: ajuc
                        private final ajud a;
                        private final czha b;

                        {
                            this.a = ajudVar;
                            this.b = czhaVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ajud ajudVar2 = this.a;
                            czha czhaVar3 = this.b;
                            cxsx cxsxVar = ajudVar2.a.h;
                            dbsk.s(cxsxVar);
                            cxsxVar.a(czhaVar3);
                        }
                    };
                    ajtj ajtjVar = (ajtj) r3;
                    if (ajtjVar.am) {
                        ajtjVar.ap = czhaVar2;
                        ajtjVar.aq = runnable;
                        ajtjVar.ar = ajye.aJ((fd) r3, r3, false);
                        ajtjVar.ar.aK();
                    }
                    ajudVar.a.f.add(czhaVar2);
                    if (!isEmpty) {
                        return;
                    }
                    cqkx.p(ajudVar.a);
                }
            }
        });
    }

    @Override // defpackage.ajxw
    public final void c(final czha czhaVar) {
        this.a.a.execute(new Runnable(this, czhaVar) { // from class: ajub
            private final ajud a;
            private final czha b;

            {
                this.a = this;
                this.b = czhaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajud ajudVar = this.a;
                czha czhaVar2 = this.b;
                boolean isEmpty = ajudVar.a.f.remove(czhaVar2) ? ajudVar.a.f.isEmpty() : false;
                if (ajudVar.a.g.remove(czhaVar2)) {
                    isEmpty = ajudVar.a.g.isEmpty();
                }
                if (isEmpty) {
                    cqkx.p(ajudVar.a);
                }
            }
        });
    }
}
