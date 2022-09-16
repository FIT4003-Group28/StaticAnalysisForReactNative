package defpackage;
/* compiled from: PG */
/* renamed from: ruo  reason: default package */
/* loaded from: classes4.dex */
final class ruo implements Runnable {
    final /* synthetic */ rup a;

    public ruo(rup rupVar) {
        this.a = rupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            ruq ruqVar = this.a.b;
            if (ruqVar != null) {
                ruqVar.b();
            }
        }
    }
}
