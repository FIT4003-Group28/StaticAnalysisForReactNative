package defpackage;
/* compiled from: PG */
/* renamed from: bpv  reason: default package */
/* loaded from: classes4.dex */
public class bpv<T> {
    private final bpu<T> a;
    protected final T b;

    public bpv() {
        this.a = new bpu<>();
        this.b = null;
    }

    public bpv(T t) {
        this.a = new bpu<>();
        this.b = t;
    }

    public T a(bpu<T> bpuVar) {
        return this.b;
    }

    public final T b(T t) {
        bpu<T> bpuVar = this.a;
        bpuVar.a = t;
        return a(bpuVar);
    }
}
