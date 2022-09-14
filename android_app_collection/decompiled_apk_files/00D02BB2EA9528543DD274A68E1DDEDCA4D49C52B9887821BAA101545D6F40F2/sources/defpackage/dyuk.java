package defpackage;
/* compiled from: PG */
/* renamed from: dyuk  reason: default package */
/* loaded from: classes6.dex */
final class dyuk implements Runnable {
    final dyui a;
    final /* synthetic */ dyut b;

    public dyuk(dyut dyutVar, dyui dyuiVar) {
        this.b = dyutVar;
        this.a = dyuiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.i.execute(new dyuj(this));
    }
}
