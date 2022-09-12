package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmt  reason: default package */
/* loaded from: classes5.dex */
public abstract class cqmt<V extends cqkp> extends cqmg<V> {
    public cqmt() {
        super(new cqms());
    }

    protected abstract cqmr<V> a(cqjz<V> cqjzVar);

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqmq(b(), cqjzVar, cqfb.d, this.d, a(cqjzVar));
    }
}
