package defpackage;
/* compiled from: PG */
/* renamed from: na  reason: default package */
/* loaded from: classes.dex */
public final class na<T> extends mz<T> {
    private final Object a;

    public na(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.mz, defpackage.my
    public final T a() {
        T t;
        synchronized (this.a) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // defpackage.mz, defpackage.my
    public final boolean b(T t) {
        boolean b;
        synchronized (this.a) {
            b = super.b(t);
        }
        return b;
    }
}
