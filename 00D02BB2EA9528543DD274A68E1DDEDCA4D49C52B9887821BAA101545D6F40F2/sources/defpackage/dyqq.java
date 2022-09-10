package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyqq  reason: default package */
/* loaded from: classes6.dex */
public final class dyqq implements Runnable {
    final /* synthetic */ dyrz a;

    public dyqq(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.G.a(2, "Entering SHUTDOWN state");
        this.a.q.a(dyfk.SHUTDOWN);
    }
}
