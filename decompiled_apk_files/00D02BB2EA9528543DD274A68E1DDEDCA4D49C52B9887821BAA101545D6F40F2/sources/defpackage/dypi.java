package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dypi  reason: default package */
/* loaded from: classes6.dex */
public final class dypi implements Runnable {
    final /* synthetic */ dypz a;

    public dypi(dypz dypzVar) {
        this.a = dypzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.p.a == dyfk.IDLE) {
            this.a.d.a(2, "CONNECTING as requested");
            this.a.c(dyfk.CONNECTING);
            this.a.b();
        }
    }
}
