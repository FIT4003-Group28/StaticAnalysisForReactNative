package defpackage;
/* compiled from: PG */
/* renamed from: vdn  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class vdn implements Runnable {
    public final /* synthetic */ vco a;
    private final /* synthetic */ int b;

    public /* synthetic */ vdn(vco vcoVar) {
        this.a = vcoVar;
    }

    public /* synthetic */ vdn(vco vcoVar, int i) {
        this.b = i;
        this.a = vcoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.d();
        } else if (i == 1) {
            this.a.b();
        } else {
            vco vcoVar = this.a;
            vbk vbkVar = vcoVar.b;
            ankt b = vcr.a(vbkVar).b(new fct(vcoVar.c, 20), vbkVar.c());
            b.qY(new vdo(vcoVar, b), vcoVar.b.c());
        }
    }
}
