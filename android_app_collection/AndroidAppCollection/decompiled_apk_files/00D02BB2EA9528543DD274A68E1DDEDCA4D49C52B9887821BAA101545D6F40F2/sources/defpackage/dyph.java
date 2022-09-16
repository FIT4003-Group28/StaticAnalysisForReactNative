package defpackage;
/* compiled from: PG */
/* renamed from: dyph  reason: default package */
/* loaded from: classes6.dex */
final class dyph implements Runnable {
    final /* synthetic */ dypz a;

    public dyph(dypz dypzVar) {
        this.a = dypzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dypz dypzVar = this.a;
        dypzVar.i = null;
        dypzVar.d.a(2, "CONNECTING after backoff");
        this.a.c(dyfk.CONNECTING);
        this.a.b();
    }
}
