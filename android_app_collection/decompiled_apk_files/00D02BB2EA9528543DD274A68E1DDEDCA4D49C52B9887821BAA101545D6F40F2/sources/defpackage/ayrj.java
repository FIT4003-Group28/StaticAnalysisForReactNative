package defpackage;
/* compiled from: PG */
/* renamed from: ayrj  reason: default package */
/* loaded from: classes3.dex */
public final class ayrj extends bvxb<dfvk, dfvm> {
    public final dxio<axwo> a;
    private final gga b;

    public ayrj(gga ggaVar, dxio<axwo> dxioVar) {
        this.b = ggaVar;
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "lsrl.ol";
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dfvm e(dfvk dfvkVar) {
        final dfvk dfvkVar2 = dfvkVar;
        this.b.runOnUiThread(new Runnable(this, dfvkVar2) { // from class: ayri
            private final ayrj a;
            private final dfvk b;

            {
                this.a = this;
                this.b = dfvkVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().f(this.b.a);
            }
        });
        return dfvm.a;
    }

    @Override // defpackage.bvxb
    protected final /* bridge */ /* synthetic */ dfvk j(byte[] bArr) {
        return ((dfvj) dfvk.b.bZ().by(bArr)).bK();
    }
}
