package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfcx  reason: default package */
/* loaded from: classes3.dex */
public final class bfcx implements bexy {
    final /* synthetic */ bfcz a;

    public bfcx(bfcz bfczVar) {
        this.a = bfczVar;
    }

    @Override // defpackage.bexy
    public final void a(final bexz bexzVar, boolean z) {
        if (!z) {
            this.a.g.b(new Runnable(this) { // from class: bfcv
                private final bfcx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bfcx bfcxVar = this.a;
                    bfcz bfczVar = bfcxVar.a;
                    bfczVar.m = false;
                    bfczVar.n = false;
                    cqkx.p(bfcxVar.a);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        bfcz bfczVar = this.a;
        if (!bfczVar.n || bfczVar.i == null) {
            return;
        }
        bfczVar.m = true;
        bfczVar.n = false;
        ilo c = this.a.i.c();
        dbsk.s(c);
        this.a.l = bexzVar.c(c);
        this.a.g.b(new Runnable(this, bexzVar) { // from class: bfcw
            private final bfcx a;
            private final bexz b;

            {
                this.a = this;
                this.b = bexzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bfcx bfcxVar = this.a;
                bexz bexzVar2 = this.b;
                bfcz bfczVar2 = bfcxVar.a;
                baal baalVar = bfczVar2.l;
                if (baalVar != null) {
                    bfczVar2.a = bexzVar2.e(baalVar);
                    cqkx.p(bfcxVar.a);
                }
            }
        }, bvrj.UI_THREAD);
    }
}
