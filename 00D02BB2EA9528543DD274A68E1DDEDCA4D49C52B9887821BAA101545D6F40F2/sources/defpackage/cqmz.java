package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmz  reason: default package */
/* loaded from: classes.dex */
public final class cqmz<V extends cqkp> extends cqmg<V> {
    private final Object a;
    private final cqkv b;
    private final boolean f;

    public cqmz(cqku cqkuVar, Object obj, cqkv cqkvVar, boolean z) {
        super(cqkuVar);
        this.a = obj;
        this.b = cqkvVar;
        this.f = z;
    }

    @Override // defpackage.cqmg, defpackage.cqnf
    public final boolean c() {
        return this.f;
    }

    @Override // defpackage.cqmg, defpackage.cqnf
    public final void d(cqkv cqkvVar, cqjz<V> cqjzVar) {
        if (this.f) {
            if (cqkvVar.a(this.c, this.a, cqjzVar)) {
                return;
            }
            this.b.a(this.c, this.a, cqjzVar);
            return;
        }
        super.d(cqkvVar, cqjzVar);
    }

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqmy(this.c, cqjzVar, this.b, this.d, this.a);
    }

    public cqmz(cqku cqkuVar, Object obj, boolean z) {
        this(cqkuVar, obj, cqfb.d, z);
    }
}
