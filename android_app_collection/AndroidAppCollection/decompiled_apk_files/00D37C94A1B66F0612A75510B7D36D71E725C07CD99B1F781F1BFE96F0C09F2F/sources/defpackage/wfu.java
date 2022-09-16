package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wfu  reason: default package */
/* loaded from: classes4.dex */
public final class wfu implements Runnable {
    final /* synthetic */ Exception a;
    final /* synthetic */ wfv b;

    public wfu(wfv wfvVar, Exception exc) {
        this.b = wfvVar;
        this.a = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (afwa afwaVar : this.b.d) {
            afwaVar.c(this.a);
        }
        this.b.d.clear();
    }
}
