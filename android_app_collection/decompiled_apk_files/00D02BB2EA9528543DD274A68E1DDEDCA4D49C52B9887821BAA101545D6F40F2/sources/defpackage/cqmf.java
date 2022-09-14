package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmf  reason: default package */
/* loaded from: classes.dex */
public abstract class cqmf<V extends cqkp> implements cqiz<V> {
    public final cqku b;
    public final cqkv c;
    public final StackTraceElement[] d;
    public final cqjz<V> e;
    boolean f = true;

    public cqmf(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr) {
        this.b = cqkuVar;
        this.e = cqjzVar;
        this.c = cqkvVar;
        this.d = stackTraceElementArr;
    }

    private final boolean e(cqkv cqkvVar, boolean z) {
        if (cqkvVar.b(this.b, this.e)) {
            return true;
        }
        if (!z) {
            return false;
        }
        return cqkvVar.a(this.b, null, this.e);
    }

    @Override // defpackage.cqiz
    public void a(@dzsi cqkv cqkvVar, boolean z) {
        if (cqkvVar != null && !e(cqkvVar, z)) {
            e(this.c, z);
        }
        c();
    }

    @Override // defpackage.cqiz
    public final void b(cqkv cqkvVar, V v, boolean z) {
        cqgx.b(this.e.c.getContext());
        f(cqkvVar, v, z);
        cqgx.c();
    }

    @Override // defpackage.cqiz
    public void c() {
        this.f = true;
    }

    @Override // defpackage.cqiz
    public final boolean d() {
        return this.f;
    }

    protected abstract void f(cqkv cqkvVar, V v, boolean z);

    public abstract void g(dbsb dbsbVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        cqku cqkuVar = this.b;
        if (!(cqkuVar instanceof cqkt) || !((cqkt) cqkuVar).b()) {
            throw new cqme(this);
        }
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("propertyType", this.b);
        b.b("layout", this.e.f);
        b.b("view", this.e.c);
        g(b);
        return b.toString();
    }
}
