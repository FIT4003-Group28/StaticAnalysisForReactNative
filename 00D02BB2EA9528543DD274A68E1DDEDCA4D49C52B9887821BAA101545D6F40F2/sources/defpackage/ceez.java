package defpackage;

import android.os.Bundle;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ceez  reason: default package */
/* loaded from: classes4.dex */
public abstract class ceez<Q extends dssj, S extends dssj> implements cgrd<S> {
    protected final cgrc a;
    public Q b;
    @dzsi
    protected Q c;
    public ceey<S> d;
    private final btzp<Q, S> e;
    @dzsi
    private btzc f;

    public ceez(cgrc cgrcVar, btzp<Q, S> btzpVar, Q q) {
        this.a = cgrcVar;
        this.e = btzpVar;
        this.b = q;
        this.c = q;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.f = null;
        if (btzyVar.equals(btzy.d)) {
            return;
        }
        Throwable th = btzyVar.r;
        bttq bttqVar = btzyVar.p;
        String str = btzyVar.q;
        ceey<S> ceeyVar = this.d;
        if (ceeyVar == null) {
            return;
        }
        ceeyVar.c(btzyVar);
    }

    @Override // defpackage.cgrd
    public final void b() {
        bvrj.UI_THREAD.c();
        this.f = null;
        g();
    }

    public abstract void d();

    protected abstract dssr<Q> e();

    protected abstract void f(S s);

    public final void g() {
        bvrj.UI_THREAD.c();
        Q q = this.c;
        if (q != null && this.f == null) {
            this.f = cgre.i(this.a, this.e, q);
        }
    }

    public void h() {
        bvrj.UI_THREAD.c();
        btzc btzcVar = this.f;
        if (btzcVar != null) {
            btzcVar.a();
        }
        Q q = this.b;
        this.c = q;
        this.f = cgre.i(this.a, this.e, q);
    }

    public final boolean i() {
        return this.c != null;
    }

    public final void j(Bundle bundle) {
        bundle.putByteArray("profile_leaf_page_first_request_key", this.b.bS());
        Q q = this.c;
        if (q != null) {
            bundle.putByteArray("profile_leaf_page_next_request_key", q.bS());
        }
    }

    public void k(Bundle bundle) {
        this.b = (Q) bvrs.g(bundle, "profile_leaf_page_first_request_key", e(), this.b);
        this.c = (Q) bvrs.f(bundle, "profile_leaf_page_next_request_key", e());
    }

    @Override // defpackage.cgrd
    /* renamed from: l */
    public void c(S s) {
        bvrj.UI_THREAD.c();
        this.f = null;
        if (this.d == null) {
            return;
        }
        f(s);
        this.d.b(s);
    }
}
