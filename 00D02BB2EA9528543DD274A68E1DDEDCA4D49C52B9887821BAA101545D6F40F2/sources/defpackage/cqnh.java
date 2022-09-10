package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqnh  reason: default package */
/* loaded from: classes.dex */
public final class cqnh<V extends cqkp> extends cqmd<V> {
    private final cqnx<V, ?> a;
    private final cqkv b;

    public cqnh(cqku cqkuVar, cqnx<V, ?> cqnxVar, cqkv cqkvVar) {
        super(cqkuVar);
        this.a = cqnxVar;
        this.b = cqkvVar;
    }

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqng(this.c, cqjzVar, this.b, this.d, this.a);
    }
}
