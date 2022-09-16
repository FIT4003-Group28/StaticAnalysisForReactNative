package defpackage;
/* compiled from: PG */
/* renamed from: ahra  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ahra implements Runnable {
    public final /* synthetic */ ahrd a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahra(ahrd ahrdVar, int i) {
        this.b = i;
        this.a = ahrdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            ahrd ahrdVar = this.a;
            for (ahig ahigVar : ahrdVar.a) {
                ahigVar.q(false);
            }
            ahrdVar.kT();
            return;
        }
        ahrd ahrdVar2 = this.a;
        for (ahig ahigVar2 : ahrdVar2.a) {
            ahigVar2.p();
        }
        ahrdVar2.b = null;
        ahrdVar2.kT();
    }
}
