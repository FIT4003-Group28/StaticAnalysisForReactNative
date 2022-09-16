package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: tc  reason: default package */
/* loaded from: classes4.dex */
public final class tc implements lo {
    int a;
    final /* synthetic */ td b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public tc(td tdVar) {
        this.b = tdVar;
    }

    @Override // defpackage.lo
    public final void a(View view) {
        if (this.c) {
            return;
        }
        td tdVar = this.b;
        tdVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.lo
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.lo
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    public final void d(ln lnVar, int i) {
        this.b.f = lnVar;
        this.a = i;
    }
}
