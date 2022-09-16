package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gwx  reason: default package */
/* loaded from: classes3.dex */
public final class gwx implements zmv {
    final /* synthetic */ gxk a;

    public gwx(gxk gxkVar) {
        this.a = gxkVar;
    }

    @Override // defpackage.zmv
    public final void c() {
    }

    @Override // defpackage.zmv
    public final void e(float f, float f2) {
        this.a.aA.l(f, f2, new zlx() { // from class: gww
            @Override // defpackage.zlx
            public final void a(int i, int i2) {
                gwx gwxVar = gwx.this;
                gwxVar.a.ax.b(acuo.b(99211)).b();
                gwxVar.a.aR.a(i, i2);
            }
        });
    }

    @Override // defpackage.zmv
    public final void md() {
        if (this.a.bc.getVisibility() != 0 && this.a.aA.I()) {
            this.a.ax.b(acuo.b(96641)).i(257);
            this.a.aL.e();
        }
    }

    @Override // defpackage.zmv
    public final void me(int i) {
        gxk gxkVar = this.a;
        if (gxkVar.aZ && !gxkVar.aA.H()) {
            this.a.ar.b(i);
        }
    }

    @Override // defpackage.zmv
    public final void mj(float f) {
        this.a.aA.k(f);
    }
}
