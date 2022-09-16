package defpackage;
/* compiled from: PG */
/* renamed from: afdr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afdr implements Runnable {
    public final /* synthetic */ afds a;
    public final /* synthetic */ aent b;
    private final /* synthetic */ int c;

    public /* synthetic */ afdr(afds afdsVar, aent aentVar) {
        this.a = afdsVar;
        this.b = aentVar;
    }

    public /* synthetic */ afdr(afds afdsVar, aent aentVar, int i) {
        this.c = i;
        this.a = afdsVar;
        this.b = aentVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            afds afdsVar = this.a;
            afdsVar.b = this.b;
            afdsVar.b();
            return;
        }
        afds afdsVar2 = this.a;
        afdsVar2.c = this.b;
        afdo afdoVar = afdsVar2.a;
        if (afdoVar == null) {
            return;
        }
        afdoVar.a(afdsVar2.c, 1);
    }
}
