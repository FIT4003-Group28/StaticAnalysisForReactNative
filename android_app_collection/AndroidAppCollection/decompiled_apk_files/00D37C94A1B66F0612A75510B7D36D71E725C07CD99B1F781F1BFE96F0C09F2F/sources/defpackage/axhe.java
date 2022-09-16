package defpackage;
/* compiled from: PG */
/* renamed from: axhe  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axhe implements Runnable {
    public final /* synthetic */ axhn a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ axhe(axhn axhnVar, int i) {
        this.a = axhnVar;
        this.b = i;
    }

    public /* synthetic */ axhe(axhn axhnVar, int i, int i2) {
        this.c = i2;
        this.a = axhnVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            axhn axhnVar = this.a;
            axhnVar.n(this.b, false);
            synchronized (axhnVar.C) {
                axhnVar.D--;
                axhnVar.C.notifyAll();
            }
            return;
        }
        axhn axhnVar2 = this.a;
        axhnVar2.n(this.b, false);
        synchronized (axhnVar2.C) {
            axhnVar2.D--;
            axhnVar2.C.notifyAll();
        }
    }
}
