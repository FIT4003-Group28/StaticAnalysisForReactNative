package defpackage;
/* compiled from: PG */
/* renamed from: bwbt  reason: default package */
/* loaded from: classes4.dex */
public final class bwbt extends bvxb<dfvg, dfvi> implements bvxc {
    public static final dcqe a = dcqe.c("bwbt");
    @dzsi
    public bwce b;
    private final gga c;

    public bwbt(gga ggaVar) {
        this.c = ggaVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rts_v2";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bvxc
    public final void d(bvxh bvxhVar) {
        this.b = bvxhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dfvi e(dfvg dfvgVar) {
        final dfvg dfvgVar2 = dfvgVar;
        this.c.runOnUiThread(new Runnable(this, dfvgVar2) { // from class: bwbs
            private final bwbt a;
            private final dfvg b;

            {
                this.a = this;
                this.b = dfvgVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwbt bwbtVar = this.a;
                dfvg dfvgVar3 = this.b;
                bwce bwceVar = bwbtVar.b;
                if (bwceVar == null) {
                    bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                } else {
                    bwceVar.i(dfvgVar3);
                }
            }
        });
        return dfvi.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dfvg j(byte[] bArr) {
        return bArr.length == 0 ? dfvg.c : ((dfvf) dfvg.c.bZ().by(bArr)).bK();
    }
}
