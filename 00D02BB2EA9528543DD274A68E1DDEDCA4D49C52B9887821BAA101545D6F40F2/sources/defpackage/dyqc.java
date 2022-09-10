package defpackage;
/* compiled from: PG */
/* renamed from: dyqc  reason: default package */
/* loaded from: classes6.dex */
final class dyqc implements Runnable {
    final /* synthetic */ dyqg a;

    public dyqc(dyqg dyqgVar) {
        this.a = dyqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.a) {
            dyqg dyqgVar = this.a;
            if (dyqgVar.i != 6) {
                dyqgVar.i = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.a.j.a.f(dyjb.m.g("Keepalive failed. The connection is likely gone"));
        }
    }
}
