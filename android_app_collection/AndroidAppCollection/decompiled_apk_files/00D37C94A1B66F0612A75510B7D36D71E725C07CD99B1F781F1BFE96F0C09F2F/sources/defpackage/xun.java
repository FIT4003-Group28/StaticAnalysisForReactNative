package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xun  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xun implements View.OnClickListener {
    public final /* synthetic */ xuz a;
    private final /* synthetic */ int b;

    public /* synthetic */ xun(xuz xuzVar) {
        this.a = xuzVar;
    }

    public /* synthetic */ xun(xuz xuzVar, int i) {
        this.b = i;
        this.a = xuzVar;
    }

    public xun(xuz xuzVar, int i, byte[] bArr) {
        this.b = i;
        this.a = xuzVar;
    }

    public xun(xuz xuzVar, int i, char[] cArr) {
        this.b = i;
        this.a = xuzVar;
    }

    public xun(xuz xuzVar, int i, int[] iArr) {
        this.b = i;
        this.a = xuzVar;
    }

    public xun(xuz xuzVar, int i, short[] sArr) {
        this.b = i;
        this.a = xuzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                xuz xuzVar = this.a;
                zag.o(xuzVar.aJ, false);
                xuzVar.aJ();
                xuzVar.aB = null;
                xuzVar.aC = null;
                xuzVar.aG.clear();
                xuzVar.aL();
                return;
            case 1:
                this.a.aI();
                return;
            case 2:
                this.a.aK();
                return;
            case 3:
                xuz xuzVar2 = this.a;
                xuzVar2.aK = null;
                zag.o(xuzVar2.aI, false);
                xuzVar2.aJ();
                xuzVar2.aL();
                xuzVar2.aQ(xuzVar2.aG());
                return;
            case 4:
                this.a.aE.requestFocus();
                zag.p(this.a.aE);
                xxe xxeVar = this.a.aQ;
                if (xxeVar == null) {
                    return;
                }
                xxeVar.c();
                return;
            case 5:
                this.a.aN = true;
                this.a.aP(amuk.q());
                return;
            case 6:
                xxa xxaVar = this.a.aD;
                xxaVar.c.d();
                xxaVar.a.setImageDrawable(null);
                xxaVar.h = 0;
                xxaVar.b(1);
                xxaVar.e = null;
                xxaVar.f = null;
                xxaVar.j = 0;
                xuz xuzVar3 = this.a;
                xuzVar3.aB = null;
                xuzVar3.aL();
                return;
            default:
                xrw xrwVar = this.a.ag;
                xrv xrvVar = xrwVar.b;
                xrwVar.b = null;
                if (xrvVar == null) {
                    return;
                }
                xrwVar.c(xrvVar.a, xrvVar.b, xrvVar.c);
                return;
        }
    }
}
