package defpackage;
/* compiled from: PG */
/* renamed from: dyqo  reason: default package */
/* loaded from: classes6.dex */
final class dyqo implements Runnable {
    final /* synthetic */ dyrz a;

    public dyqo(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.A.get()) {
            dyrz dyrzVar = this.a;
            if (dyrzVar.s == null) {
                return;
            }
            dyrzVar.m(false);
            this.a.l();
        }
    }
}
