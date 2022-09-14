package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmw  reason: default package */
/* loaded from: classes.dex */
final class cqmw<V extends cqkp> extends cqmf<V> {
    private final Object g;
    private final cqnf<V> h;
    private final cqnf<V> i;
    private cqiz<V> j;
    private cqiz<V> k;
    private cqiz<V> l;

    public cqmw(cqku cqkuVar, cqjz<V> cqjzVar, StackTraceElement[] stackTraceElementArr, Object obj, cqnf<V> cqnfVar, cqnf<V> cqnfVar2) {
        super(cqkuVar, cqjzVar, cqfb.d, stackTraceElementArr);
        this.g = obj;
        this.h = cqnfVar;
        this.i = cqnfVar2;
    }

    @Override // defpackage.cqmf, defpackage.cqiz
    public final void a(@dzsi cqkv cqkvVar, boolean z) {
        super.a(cqkvVar, z);
        cqiz<V> cqizVar = this.j;
        if (cqizVar != null) {
            cqizVar.a(cqkvVar, z);
        }
        cqiz<V> cqizVar2 = this.k;
        if (cqizVar2 != null) {
            cqizVar2.a(cqkvVar, z);
        }
    }

    @Override // defpackage.cqmf, defpackage.cqiz
    public final void c() {
        super.c();
        cqiz<V> cqizVar = this.l;
        if (cqizVar != null) {
            cqizVar.c();
        }
    }

    @Override // defpackage.cqmf
    protected final void f(cqkv cqkvVar, V v, boolean z) {
        cqiz<V> cqizVar;
        if (((Boolean) cqjv.b(this.g, v, this.e.c.getContext())).booleanValue()) {
            if (this.j == null) {
                this.j = this.h.e(this.e);
            }
            cqizVar = this.j;
        } else {
            if (this.k == null) {
                this.k = this.i.e(this.e);
            }
            cqizVar = this.k;
        }
        if (cqizVar != this.l) {
            this.l = cqizVar;
            cqizVar.c();
        }
        this.l.b(cqkvVar, v, z);
        this.f = false;
    }

    @Override // defpackage.cqmf
    public final void g(dbsb dbsbVar) {
        cqiz<V> cqizVar = this.l;
        if (cqizVar != null) {
            dbsbVar.h("expressionValue", cqizVar == this.j);
        } else {
            dbsbVar.b("expressionValue", "<not evaluated>");
        }
        dbsbVar.b("thenBinding", this.j);
        dbsbVar.b("elseBinding", this.k);
    }
}
