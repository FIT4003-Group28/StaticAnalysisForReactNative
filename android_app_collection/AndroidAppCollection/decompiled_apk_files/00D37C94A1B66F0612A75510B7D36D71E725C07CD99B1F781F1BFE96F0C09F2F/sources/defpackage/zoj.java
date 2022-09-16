package defpackage;
/* compiled from: PG */
/* renamed from: zoj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zoj implements Runnable {
    public final /* synthetic */ zou a;
    private final /* synthetic */ int b;

    public /* synthetic */ zoj(zou zouVar, int i) {
        this.b = i;
        this.a = zouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            zou zouVar = this.a;
            zouVar.G = false;
            zouVar.c();
            return;
        }
        zou zouVar2 = this.a;
        if (zouVar2.G) {
            return;
        }
        zouVar2.G = true;
        zouVar2.b.postDelayed(zouVar2.I, 66L);
    }
}
