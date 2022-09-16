package defpackage;
/* compiled from: PG */
/* renamed from: pnf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pnf implements Runnable {
    public final /* synthetic */ pnj a;
    public final /* synthetic */ pnk b;
    private final /* synthetic */ int c;

    public /* synthetic */ pnf(pnj pnjVar, pnk pnkVar) {
        this.a = pnjVar;
        this.b = pnkVar;
    }

    public /* synthetic */ pnf(pnj pnjVar, pnk pnkVar, int i) {
        this.c = i;
        this.a = pnjVar;
        this.b = pnkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            pnj pnjVar = this.a;
            this.b.L(pnjVar.a, pnjVar.c);
        } else if (i == 1) {
            pnj pnjVar2 = this.a;
            this.b.K(pnjVar2.a, pnjVar2.c);
        } else if (i == 2) {
            pnj pnjVar3 = this.a;
            this.b.M(pnjVar3.a, pnjVar3.c);
        } else {
            pnj pnjVar4 = this.a;
            this.b.P(pnjVar4.a, pnjVar4.c);
        }
    }
}
