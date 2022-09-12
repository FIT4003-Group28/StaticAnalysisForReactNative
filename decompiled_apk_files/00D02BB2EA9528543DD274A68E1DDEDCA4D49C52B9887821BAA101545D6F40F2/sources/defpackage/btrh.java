package defpackage;
/* compiled from: PG */
/* renamed from: btrh  reason: default package */
/* loaded from: classes.dex */
public class btrh<T> extends btrs {
    protected final T a;
    private final Class<?> d;

    public btrh(Class<?> cls, T t) {
        this(cls, t, bvrj.CURRENT);
    }

    @Override // defpackage.btrs
    public final Class<?> d() {
        return this.d;
    }

    public btrh(Class<?> cls, T t, bvrj bvrjVar) {
        super(t, bvrjVar);
        this.a = t;
        this.d = cls;
    }
}
