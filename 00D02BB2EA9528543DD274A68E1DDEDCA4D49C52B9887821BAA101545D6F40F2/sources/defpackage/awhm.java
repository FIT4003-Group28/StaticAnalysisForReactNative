package defpackage;
/* compiled from: PG */
/* renamed from: awhm  reason: default package */
/* loaded from: classes3.dex */
public final class awhm implements avlm {
    @dzsi
    private final avlx a;

    public awhm(@dzsi avlx avlxVar) {
        this.a = avlxVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        if (this.a == null) {
            return;
        }
        dcdg p = dcdn.p();
        dlrj dlrjVar = dlptVar.e;
        if (dlrjVar == null) {
            dlrjVar = dlrj.e;
        }
        for (dltm dltmVar : dlrjVar.b) {
            this.a.b(dltmVar);
            p.f(dltmVar.b, dltmVar);
        }
        dcdn b = p.b();
        dlrj dlrjVar2 = dlptVar.d;
        if (dlrjVar2 == null) {
            dlrjVar2 = dlrj.e;
        }
        for (dltm dltmVar2 : dlrjVar2.b) {
            dltm dltmVar3 = (dltm) b.get(dltmVar2.b);
            if (dltmVar3 == null) {
                this.a.c(dltmVar2);
            } else if (!this.a.a(dltmVar3)) {
                this.a.c(dltmVar3);
            }
        }
    }
}
