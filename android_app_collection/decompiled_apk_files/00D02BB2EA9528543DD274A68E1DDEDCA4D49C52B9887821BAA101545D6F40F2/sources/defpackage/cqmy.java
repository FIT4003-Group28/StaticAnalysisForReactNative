package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmy  reason: default package */
/* loaded from: classes.dex */
public final class cqmy<V extends cqkp> extends cqmf<V> {
    private final Object g;

    public cqmy(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr, Object obj) {
        super(cqkuVar, cqjzVar, cqkvVar, stackTraceElementArr);
        this.g = obj;
    }

    @Override // defpackage.cqmf
    protected final void f(cqkv cqkvVar, V v, boolean z) {
        if (this.f || z) {
            if (!cqkvVar.a(this.b, this.g, this.e) && !this.c.a(this.b, this.g, this.e)) {
                h();
            }
            this.f = false;
        }
    }

    @Override // defpackage.cqmf
    public final void g(dbsb dbsbVar) {
        dbsbVar.b("propertyValue", this.g);
    }
}
