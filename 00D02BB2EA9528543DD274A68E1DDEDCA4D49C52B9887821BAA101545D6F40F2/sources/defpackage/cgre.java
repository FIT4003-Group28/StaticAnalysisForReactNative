package defpackage;

import android.os.Bundle;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cgre  reason: default package */
/* loaded from: classes4.dex */
public final class cgre<Q extends dssj, S extends dssj> implements cgrb, btzi {
    @dzsi
    cgrd<S> a;
    public boolean b;
    @dzsi
    Q c;
    @dzsi
    S d;
    @dzsi
    btzy e;
    private boolean f = false;

    public cgre(cgrd<S> cgrdVar) {
        dbsk.s(cgrdVar);
        this.a = cgrdVar;
    }

    public static <Q extends dssj, S extends dssj> void g(cgrc cgrcVar, Class<Q> cls, cgrd<S> cgrdVar) {
        cgrcVar.g(n(cls), new cgre(cgrdVar));
    }

    public static <Q extends dssj, S extends dssj> void h(cgrc cgrcVar, cgrd<S> cgrdVar, String str) {
        cgrcVar.g(o(str), new cgre(cgrdVar));
    }

    public static <Q extends dssj, S extends dssj> btzc i(cgrc cgrcVar, btzp<Q, S> btzpVar, Q q) {
        return k(cgrcVar, q.getClass()).j(btzpVar, q);
    }

    public static <Q extends dssj, S extends dssj> cgre<Q, S> k(cgrc cgrcVar, Class<Q> cls) {
        return (cgre) cgrcVar.b(n(cls));
    }

    public static <Q extends dssj, S extends dssj> void m(cgrc cgrcVar, btzp<Q, S> btzpVar, Q q, String str) {
        ((cgre) cgrcVar.b(o(str))).j(btzpVar, q);
    }

    private static String n(Class<? extends dssj> cls) {
        String canonicalName = cgre.class.getCanonicalName();
        String canonicalName2 = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 28 + String.valueOf(canonicalName2).length());
        sb.append("RequestClassListenerPrefix:");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(canonicalName2);
        return sb.toString();
    }

    private static String o(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "CustomPrefix:".concat(valueOf) : new String("CustomPrefix:");
    }

    private final void p() {
        S s = this.d;
        btzy btzyVar = this.e;
        this.d = null;
        this.e = null;
        this.b = false;
        cgrd<S> cgrdVar = this.a;
        if (cgrdVar == null) {
            bvoo.i(new NullPointerException());
        } else if (s != null) {
            cgrdVar.c(s);
        } else if (btzyVar != null) {
            cgrdVar.a(btzyVar);
        } else {
            cgrdVar.b();
        }
    }

    private final void q(@dzsi S s, @dzsi btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.c = null;
        this.d = s;
        this.e = btzyVar;
        if (this.f) {
            p();
        } else {
            this.b = true;
        }
    }

    @Override // defpackage.btzi
    public final void QY(btzr<Q> btzrVar, btzy btzyVar) {
        q(null, btzyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        q((dssj) obj, null);
    }

    @Override // defpackage.cgrb
    public final void c() {
        bvrj.UI_THREAD.c();
        this.f = true;
        if (this.b) {
            p();
        }
    }

    @Override // defpackage.cgrb
    public final void d(Bundle bundle) {
        bvrj.UI_THREAD.c();
        bundle.putBoolean("PENDING", this.c != null);
    }

    @Override // defpackage.cgrb
    public final void e() {
        this.f = false;
    }

    @Override // defpackage.cgrb
    public final void f() {
        this.f = false;
        this.a = null;
    }

    public final btzc j(btzp<Q, S> btzpVar, Q q) {
        bvrj.UI_THREAD.c();
        this.c = q;
        return btzpVar.a(q, this, bvrj.UI_THREAD);
    }

    public final boolean l() {
        return this.c != null;
    }
}
