package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: bmoj  reason: default package */
/* loaded from: classes3.dex */
public final class bmoj<V extends cqkp, T> extends cqmt<V> {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public bmoj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cqmt
    protected final cqmr<V> a(cqjz<V> cqjzVar) {
        return new bmoi(this, cqjzVar.c, cqjzVar);
    }
}
