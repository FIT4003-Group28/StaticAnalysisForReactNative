package defpackage;
/* compiled from: PG */
/* renamed from: wvo  reason: default package */
/* loaded from: classes4.dex */
final class wvo implements wzu {
    final /* synthetic */ xdu a;
    final /* synthetic */ xci b;
    final /* synthetic */ wvp c;

    public wvo(wvp wvpVar, xdu xduVar, xci xciVar) {
        this.c = wvpVar;
        this.a = xduVar;
        this.b = xciVar;
    }

    @Override // defpackage.wzu
    public final void d(int i, int i2) {
        ((wlh) this.c.c.get()).j(i, i2);
        wvp wvpVar = this.c;
        xdu xduVar = this.a;
        xci xciVar = this.b;
        wvpVar.d(xduVar, xciVar, xciVar.a, wvp.a);
    }

    @Override // defpackage.wzu
    public final void e() {
        wvp wvpVar = this.c;
        xdu xduVar = this.a;
        xci xciVar = this.b;
        wvpVar.d(xduVar, xciVar, xciVar.a, wvp.b);
    }
}
