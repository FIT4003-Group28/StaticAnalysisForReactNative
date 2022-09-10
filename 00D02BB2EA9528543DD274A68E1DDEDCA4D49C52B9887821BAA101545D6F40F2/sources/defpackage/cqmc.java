package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmc  reason: default package */
/* loaded from: classes.dex */
public abstract class cqmc<V extends cqkp> extends cqmf<V> {
    @dzsi
    private Object g;

    /* JADX INFO: Access modifiers changed from: protected */
    public cqmc(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr) {
        super(cqkuVar, cqjzVar, cqkvVar, stackTraceElementArr);
    }

    @Override // defpackage.cqmf, defpackage.cqiz
    public final void c() {
        super.c();
        this.g = null;
    }

    @dzsi
    protected abstract Object e(V v);

    @Override // defpackage.cqmf
    protected final void f(cqkv cqkvVar, V v, boolean z) {
        boolean z2 = true;
        if (!this.f && !z) {
            z2 = false;
        }
        Object e = e(v);
        if (z2) {
            this.g = e;
        } else if (dbsd.a(e, this.g)) {
            return;
        } else {
            this.g = e;
        }
        if (!cqkvVar.a(this.b, this.g, this.e) && !this.c.a(this.b, this.g, this.e)) {
            h();
        }
        this.f = false;
    }

    @Override // defpackage.cqmf
    public final void g(dbsb dbsbVar) {
        dbsbVar.b("propertyValue", this.g);
    }
}
