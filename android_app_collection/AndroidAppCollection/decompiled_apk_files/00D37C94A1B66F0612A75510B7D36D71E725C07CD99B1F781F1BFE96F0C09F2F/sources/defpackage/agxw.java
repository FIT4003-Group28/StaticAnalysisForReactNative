package defpackage;
/* compiled from: PG */
/* renamed from: agxw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agxw implements Runnable {
    public final /* synthetic */ agyb a;
    private final /* synthetic */ int b;

    public /* synthetic */ agxw(agyb agybVar, int i) {
        this.b = i;
        this.a = agybVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.q();
        } else if (i == 1) {
            do {
            } while (this.a.s());
        } else {
            agyb agybVar = this.a;
            synchronized (agybVar.k) {
                ankt anktVar = agybVar.l;
                if ((anktVar == null || anktVar.isDone()) && agybVar.e() <= 0 && !agybVar.i) {
                    agybVar.e.c(!agybVar.j);
                }
            }
        }
    }
}
