package defpackage;

import android.view.View;
import android.view.ViewStub;
/* compiled from: PG */
/* renamed from: fqe  reason: default package */
/* loaded from: classes3.dex */
public abstract class fqe implements fqu {
    public fqt a;
    public Object b;
    public ViewStub c;
    private boolean d;
    private int e;
    private yye f;

    private final void a() {
        if (this.f == null || this.d) {
            return;
        }
        n();
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View g() {
        yye yyeVar = this.f;
        if (yyeVar != null) {
            return yyeVar.b;
        }
        return null;
    }

    @Override // defpackage.fqu
    public final void h(ViewStub viewStub, int i) {
        viewStub.getClass();
        this.c = viewStub;
        this.e = i;
        p();
    }

    protected abstract void i();

    @Override // defpackage.fqu
    public final void j(fqt fqtVar) {
        this.a = fqtVar;
    }

    public final void k(Object obj) {
        if (akzj.f(this.b, obj)) {
            return;
        }
        this.b = obj;
        boolean z = false;
        this.d = false;
        fqt fqtVar = this.a;
        if (fqtVar != null) {
            if (obj != null) {
                z = true;
            }
            fqtVar.a(z);
        }
        if (!o()) {
            return;
        }
        a();
    }

    @Override // defpackage.fqu
    public void l(boolean z, boolean z2) {
        ViewStub viewStub;
        if (z) {
            if (this.f == null && (viewStub = this.c) != null) {
                View inflate = viewStub.inflate();
                this.c = null;
                yye yyeVar = new yye(inflate);
                this.f = yyeVar;
                long j = this.e;
                yyeVar.d = j;
                yyeVar.e = j;
                i();
            }
            a();
        }
        yye yyeVar2 = this.f;
        if (yyeVar2 == null) {
            return;
        }
        yyeVar2.a(z, z2);
    }

    @Override // defpackage.fqu
    public final void m(int i) {
        yye yyeVar = this.f;
        if (yyeVar == null) {
            return;
        }
        yyeVar.d = i;
    }

    protected abstract void n();

    @Override // defpackage.fqu
    public final boolean o() {
        yye yyeVar = this.f;
        return yyeVar != null && yyeVar.e();
    }

    protected abstract void p();
}
