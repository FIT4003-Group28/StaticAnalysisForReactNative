package defpackage;
/* compiled from: PG */
/* renamed from: vyg  reason: default package */
/* loaded from: classes4.dex */
public final class vyg implements afzf {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ vyh c;

    public vyg(vyh vyhVar, Runnable runnable, Runnable runnable2) {
        this.c = vyhVar;
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        yzj yzjVar = this.c.c;
        yzjVar.d(yzjVar.b(cffVar));
        this.a.run();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        this.c.a((arms) obj, 3, this.b, this.a);
    }
}
