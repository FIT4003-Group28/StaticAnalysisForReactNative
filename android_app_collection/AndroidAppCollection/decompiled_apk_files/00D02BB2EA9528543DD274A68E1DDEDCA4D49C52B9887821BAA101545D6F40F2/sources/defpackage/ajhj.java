package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajhj  reason: default package */
/* loaded from: classes2.dex */
public final class ajhj implements degu<ajnc> {
    final /* synthetic */ btlu a;
    final /* synthetic */ ajhm b;

    public ajhj(ajhm ajhmVar, btlu btluVar) {
        this.b = ajhmVar;
        this.a = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ajhm ajhmVar = this.b;
        ajhmVar.as = 4;
        bvrb bvrbVar = ajhmVar.d;
        final btlu btluVar = this.a;
        bvrbVar.b(new Runnable(this, btluVar) { // from class: ajhi
            private final ajhj a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajhj ajhjVar = this.a;
                ajhjVar.b.i(this.b);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(ajnc ajncVar) {
        dehn<Void> dehnVar;
        if (!ajncVar.c().contains(aild.NOT_ELIGIBLE_TO_REPORT_REQUIRES_LOCATION_HISTORY_NOT_REQUIRED_ACKNOWLEDGEMENT)) {
            ajhm ajhmVar = this.b;
            ajhmVar.as = 2;
            bvrb bvrbVar = ajhmVar.d;
            final btlu btluVar = this.a;
            bvrbVar.b(new Runnable(this, btluVar) { // from class: ajhh
                private final ajhj a;
                private final btlu b;

                {
                    this.a = this;
                    this.b = btluVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajhj ajhjVar = this.a;
                    ajhjVar.b.i(this.b);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        ajhm ajhmVar2 = this.b;
        if (ajhmVar2.as == 1 && (dehnVar = ajhmVar2.an) != null && dehnVar.isDone()) {
            ajhm ajhmVar3 = this.b;
            ajhmVar3.as = 3;
            bvrb bvrbVar2 = ajhmVar3.d;
            final btlu btluVar2 = this.a;
            bvrbVar2.b(new Runnable(this, btluVar2) { // from class: ajhe
                private final ajhj a;
                private final btlu b;

                {
                    this.a = this;
                    this.b = btluVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajhj ajhjVar = this.a;
                    ajhjVar.b.i(this.b);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        ajhm ajhmVar4 = this.b;
        ajhmVar4.as = 1;
        if (ajhmVar4.ak == null) {
            ajhmVar4.as = 4;
            bvrb bvrbVar3 = ajhmVar4.d;
            final btlu btluVar3 = this.a;
            bvrbVar3.b(new Runnable(this, btluVar3) { // from class: ajhg
                private final ajhj a;
                private final btlu b;

                {
                    this.a = this;
                    this.b = btluVar3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ajhj ajhjVar = this.a;
                    ajhjVar.b.i(this.b);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        btlu btluVar4 = this.a;
        ff J = this.b.J();
        dbsk.s(J);
        cqkj cqkjVar = this.b.ak;
        dbsk.s(cqkjVar);
        final dehn<Void> a = ajhmVar4.ah.a().a(btluVar4, J, cqkjVar);
        this.b.an = a;
        final btlu btluVar5 = this.a;
        a.Pk(new Runnable(this, a, btluVar5) { // from class: ajhf
            private final ajhj a;
            private final dehn b;
            private final btlu c;

            {
                this.a = this;
                this.b = a;
                this.c = btluVar5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajhj ajhjVar = this.a;
                dehn dehnVar2 = this.b;
                btlu btluVar6 = this.c;
                if (dehnVar2.isCancelled()) {
                    return;
                }
                ajhjVar.b.i(btluVar6);
            }
        }, this.b.d.h());
    }
}
