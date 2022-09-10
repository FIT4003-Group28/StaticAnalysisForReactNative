package defpackage;

import android.view.inputmethod.InputMethodManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdyg  reason: default package */
/* loaded from: classes3.dex */
public final class bdyg implements Runnable {
    final /* synthetic */ gga a;
    final /* synthetic */ bdyk b;

    public bdyg(bdyk bdykVar, gga ggaVar) {
        this.b = bdykVar;
        this.a = ggaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.Y().booleanValue()) {
            this.b.a.d();
            bfvq i = this.b.a.i();
            if (i != null) {
                cqkx.p(this.b);
                i.h();
            }
        } else {
            bnix aq = this.b.aq();
            bdyk bdykVar = this.b;
            bmlh R = bdykVar.R();
            aq.I((R == null || !bdykVar.S().booleanValue() || R.f() == bege.OVERVIEW) ? false : true);
            cqkx.p(this.b);
        }
        bkiw bkiwVar = this.b.k;
        if (bkiwVar != null) {
            bkiwVar.y();
        }
        ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindow().getDecorView().getWindowToken(), 0);
        this.b.b.c();
        this.b.c.c();
    }
}
