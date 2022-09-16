package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wft  reason: default package */
/* loaded from: classes4.dex */
public final class wft implements Runnable {
    final /* synthetic */ wfv a;
    private final /* synthetic */ int b;

    public wft(wfv wfvVar) {
        this.a = wfvVar;
    }

    public wft(wfv wfvVar, int i) {
        this.b = i;
        this.a = wfvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            for (afwa afwaVar : this.a.d) {
                afwaVar.a();
            }
            this.a.d.clear();
            return;
        }
        for (afwa afwaVar2 : this.a.d) {
            afwaVar2.b();
        }
        this.a.d.clear();
    }
}
