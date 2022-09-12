package defpackage;
/* compiled from: PG */
/* renamed from: cpkq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpkq<T> {
    private volatile T a = null;

    protected abstract T a();

    public final T b() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = a();
                }
            }
        }
        return this.a;
    }
}
