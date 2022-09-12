package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: bsqz  reason: default package */
/* loaded from: classes4.dex */
public class bsqz<T extends cqkp> implements bssn<T> {
    private final T a;
    private boolean b;

    public bsqz(T t, boolean z) {
        this.a = t;
        this.b = z;
    }

    @Override // defpackage.bssn
    public T a() {
        return this.a;
    }

    @Override // defpackage.bssn
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    public void c(boolean z) {
        this.b = z;
    }
}
