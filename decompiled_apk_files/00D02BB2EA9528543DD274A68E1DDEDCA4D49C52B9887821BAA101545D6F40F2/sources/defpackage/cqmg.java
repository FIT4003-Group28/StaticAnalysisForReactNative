package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmg  reason: default package */
/* loaded from: classes.dex */
public abstract class cqmg<V extends cqkp> implements cqnf<V> {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    public final cqku c;
    public final StackTraceElement[] d = a;

    public cqmg(cqku cqkuVar) {
        this.c = cqkuVar;
    }

    @Override // defpackage.cqnf
    public cqku b() {
        return this.c;
    }

    @Override // defpackage.cqnf
    public boolean c() {
        return false;
    }

    @Override // defpackage.cqnf
    public void d(cqkv cqkvVar, cqjz<V> cqjzVar) {
        throw new IllegalStateException();
    }
}
