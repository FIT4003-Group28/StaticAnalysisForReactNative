package defpackage;

import java.lang.reflect.Type;
/* compiled from: PG */
/* renamed from: dgvt  reason: default package */
/* loaded from: classes6.dex */
public final class dgvt<T> extends dgtl<T> {
    public final dgsx a;
    private final dgti<T> b;
    private final dgtb<T> c;
    private final dgxd<T> d;
    private final dgtm e;
    private final dgvs f = new dgvs(this);
    private dgtl<T> g;

    public dgvt(dgti<T> dgtiVar, dgtb<T> dgtbVar, dgsx dgsxVar, dgxd<T> dgxdVar, dgtm dgtmVar) {
        this.b = dgtiVar;
        this.c = dgtbVar;
        this.a = dgsxVar;
        this.d = dgxdVar;
        this.e = dgtmVar;
    }

    private final dgtl<T> d() {
        dgtl<T> dgtlVar = this.g;
        if (dgtlVar != null) {
            return dgtlVar;
        }
        dgtl<T> c = this.a.c(this.e, this.d);
        this.g = c;
        return c;
    }

    @Override // defpackage.dgtl
    public final T a(dgxe dgxeVar) {
        if (this.c == null) {
            return d().a(dgxeVar);
        }
        dgtc a = dguy.a(dgxeVar);
        if (a instanceof dgte) {
            return null;
        }
        dgtb<T> dgtbVar = this.c;
        Type type = this.d.b;
        return dgtbVar.a(a);
    }

    @Override // defpackage.dgtl
    public final void b(dgxg dgxgVar, T t) {
        dgti<T> dgtiVar = this.b;
        if (dgtiVar == null) {
            d().b(dgxgVar, t);
        } else if (t == null) {
            dgxgVar.f();
        } else {
            Type type = this.d.b;
            dguy.b(dgtiVar.b(t, this.f), dgxgVar);
        }
    }
}
