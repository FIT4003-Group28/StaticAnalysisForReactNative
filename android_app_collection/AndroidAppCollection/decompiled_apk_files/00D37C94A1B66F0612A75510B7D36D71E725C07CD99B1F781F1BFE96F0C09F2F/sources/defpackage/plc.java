package defpackage;
/* compiled from: PG */
/* renamed from: plc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class plc implements Runnable {
    public final /* synthetic */ plh a;
    public final /* synthetic */ pms b;
    private final /* synthetic */ int c;

    public /* synthetic */ plc(plh plhVar, pms pmsVar) {
        this.a = plhVar;
        this.b = pmsVar;
    }

    public /* synthetic */ plc(plh plhVar, pms pmsVar, int i) {
        this.c = i;
        this.a = plhVar;
        this.b = pmsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            plh plhVar = this.a;
            pms pmsVar = this.b;
            pli pliVar = plhVar.a;
            int i = pxi.a;
            pliVar.g(pmsVar);
            return;
        }
        plh plhVar2 = this.a;
        pms pmsVar2 = this.b;
        pmsVar2.a();
        pli pliVar2 = plhVar2.a;
        int i2 = pxi.a;
        pliVar2.f(pmsVar2);
    }
}
