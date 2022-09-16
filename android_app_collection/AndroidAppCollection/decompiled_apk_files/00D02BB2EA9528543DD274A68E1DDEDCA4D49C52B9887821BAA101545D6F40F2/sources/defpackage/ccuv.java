package defpackage;
/* compiled from: PG */
/* renamed from: ccuv  reason: default package */
/* loaded from: classes4.dex */
public abstract class ccuv<T> implements ccuo<T> {
    private final ccup<T> a;
    private final T b;
    private final int c;

    public ccuv(T t, int i, ccup<T> ccupVar) {
        this.a = ccupVar;
        this.b = t;
        this.c = i + 1;
    }

    @Override // defpackage.ccuo
    public Integer b() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.ccuo
    public cqkl c() {
        return this.a.c(this);
    }

    @Override // defpackage.ccuo
    public cqkl d() {
        return this.a.d(this);
    }

    @Override // defpackage.ccuo
    public T e() {
        return this.b;
    }
}
