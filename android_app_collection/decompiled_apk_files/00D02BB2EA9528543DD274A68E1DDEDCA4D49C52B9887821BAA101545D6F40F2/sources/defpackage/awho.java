package defpackage;
/* compiled from: PG */
/* renamed from: awho  reason: default package */
/* loaded from: classes3.dex */
public final class awho implements avlm {
    private final cqat a;
    private final awar b;
    private final avzo c;

    public awho(cqat cqatVar, awar awarVar, avzo avzoVar) {
        this.a = cqatVar;
        this.b = awarVar;
        this.c = avzoVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        dlrj dlrjVar = dlptVar.e;
        if (dlrjVar == null) {
            dlrjVar = dlrj.e;
        }
        boolean z = false;
        boolean z2 = false;
        for (dltm dltmVar : dlrjVar.b) {
            int a = dlth.a(dltmVar.e);
            if (a != 0 && a == 8) {
                z = true;
            } else if (avzo.c(dltmVar, this.a.b())) {
                z2 = true;
            }
        }
        if (!z) {
            this.b.m();
            this.b.n();
            this.b.p();
        }
        if (!z2) {
            this.b.k();
            this.b.o();
            this.b.q();
        }
    }
}
