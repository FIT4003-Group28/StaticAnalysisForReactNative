package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: nor  reason: default package */
/* loaded from: classes7.dex */
public abstract class nor implements noq {
    private final cjqy a;
    private final cjqq b;
    @dzsi
    private cjqp c;

    /* JADX INFO: Access modifiers changed from: protected */
    public nor(cjqy cjqyVar, cjqq cjqqVar) {
        this.a = cjqyVar;
        this.b = cjqqVar;
    }

    @Override // defpackage.btph
    public void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public void a() {
        throw null;
    }

    @Override // defpackage.non
    public void e() {
        throw null;
    }

    @Override // defpackage.non
    public void f() {
        throw null;
    }

    @Override // defpackage.non
    public boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(cjtg cjtgVar) {
        bvrj.UI_THREAD.c();
        cjqp e = this.b.e(this.a.r(cjtgVar), cjtgVar);
        this.c = e;
        this.b.i(e, d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        bvrj.UI_THREAD.c();
        if (this.c != null) {
            this.b.h(d());
        }
    }

    @dzsi
    public final cjqp u() {
        bvrj.UI_THREAD.c();
        return this.c;
    }

    public final dehn<cjqp> v() {
        bvrj.UI_THREAD.c();
        return deha.a(this.c);
    }
}
