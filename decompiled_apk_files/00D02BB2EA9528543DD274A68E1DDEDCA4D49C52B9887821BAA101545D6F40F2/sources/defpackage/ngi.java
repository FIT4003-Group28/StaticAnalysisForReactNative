package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: ngi  reason: default package */
/* loaded from: classes7.dex */
public class ngi<T extends cqkp> implements nfv<T> {
    private final T a;
    private final boolean b;

    public ngi(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    @Override // defpackage.nfv
    public T a() {
        return this.a;
    }

    @Override // defpackage.nfv
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }
}
