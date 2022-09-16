package defpackage;
/* compiled from: PG */
/* renamed from: pye  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pye implements Runnable {
    public final /* synthetic */ pyj a;
    public final /* synthetic */ pms b;
    private final /* synthetic */ int c;

    public /* synthetic */ pye(pyj pyjVar, pms pmsVar) {
        this.a = pyjVar;
        this.b = pmsVar;
    }

    public /* synthetic */ pye(pyj pyjVar, pms pmsVar, int i) {
        this.c = i;
        this.a = pyjVar;
        this.b = pmsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            pyj pyjVar = this.a;
            pms pmsVar = this.b;
            pyk pykVar = pyjVar.b;
            int i = pxi.a;
            pykVar.C(pmsVar);
            return;
        }
        pyj pyjVar2 = this.a;
        pms pmsVar2 = this.b;
        pmsVar2.a();
        pyk pykVar2 = pyjVar2.b;
        int i2 = pxi.a;
        pykVar2.B(pmsVar2);
    }
}
