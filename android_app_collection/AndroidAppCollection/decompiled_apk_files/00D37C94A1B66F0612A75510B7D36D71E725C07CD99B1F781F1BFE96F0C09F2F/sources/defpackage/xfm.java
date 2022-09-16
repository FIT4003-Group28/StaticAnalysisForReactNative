package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: xfm  reason: default package */
/* loaded from: classes4.dex */
public final class xfm implements xig {
    public final xfk a;
    public final aafo b;
    public final xfj[] c;
    public xfl d;

    public xfm(xfk xfkVar, acti actiVar, aafo aafoVar, xfj... xfjVarArr) {
        xfkVar.getClass();
        this.a = xfkVar;
        actiVar.getClass();
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = xfjVarArr;
        xfkVar.nR(this);
    }

    @Override // defpackage.xig
    public final void a(Bundle bundle) {
        xgo xgoVar;
        xfl f = f();
        if (f == null || (xgoVar = ((wmh) f).e) == null) {
            return;
        }
        xgoVar.c(bundle);
    }

    @Override // defpackage.xig
    public final void b() {
        xfl f = f();
        if (f != null) {
            f.e();
        }
    }

    @Override // defpackage.xig
    public final void c(boolean z) {
        xgo xgoVar;
        xfl f = f();
        if (f == null || (xgoVar = ((wmh) f).e) == null) {
            return;
        }
        xgoVar.g(z);
    }

    @Override // defpackage.xig
    public final void d() {
        xfl f = f();
        if (f != null) {
            wmh wmhVar = (wmh) f;
            ((wmd) wmhVar.a.get()).p();
            xgo xgoVar = wmhVar.e;
            if (xgoVar == null) {
                return;
            }
            xgoVar.p();
        }
    }

    @Override // defpackage.xig
    public final void e(int i, int i2) {
        xfl f = f();
        if (f != null) {
            wmh wmhVar = (wmh) f;
            ((wsq) wmhVar.b.get()).a = i;
            ((wsq) wmhVar.c.get()).a = i2;
            xgo xgoVar = wmhVar.e;
            if (xgoVar == null) {
                return;
            }
            xgoVar.q(i, i2);
        }
    }

    public final xfl f() {
        xfl xflVar = this.d;
        if (xflVar != null) {
            return xflVar;
        }
        return null;
    }
}
