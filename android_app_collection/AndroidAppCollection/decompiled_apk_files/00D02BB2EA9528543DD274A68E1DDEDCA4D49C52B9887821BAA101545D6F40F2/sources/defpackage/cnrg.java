package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnrg  reason: default package */
/* loaded from: classes5.dex */
public final class cnrg implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ cnrj b;

    public cnrg(cnrj cnrjVar, int i) {
        this.b = cnrjVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d(this.a);
    }
}
