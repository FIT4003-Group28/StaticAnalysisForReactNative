package defpackage;
/* compiled from: PG */
/* renamed from: vtn  reason: default package */
/* loaded from: classes4.dex */
final class vtn implements Runnable {
    final /* synthetic */ vtq a;
    private final /* synthetic */ int b;

    public vtn(vtq vtqVar) {
        this.a = vtqVar;
    }

    public vtn(vtq vtqVar, int i) {
        this.b = i;
        this.a = vtqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.q();
            this.a.r();
            this.a.s();
            this.a.g();
            return;
        }
        this.a.s();
    }
}
