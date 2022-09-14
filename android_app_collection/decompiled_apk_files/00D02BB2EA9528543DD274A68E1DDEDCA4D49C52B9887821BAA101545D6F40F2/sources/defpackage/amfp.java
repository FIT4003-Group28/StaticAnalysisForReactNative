package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: amfp  reason: default package */
/* loaded from: classes.dex */
public abstract class amfp<T> {
    @dzsi
    private Reference<T> a;
    @dzsi
    public Reference<dbrn<bvlw, cqtd>> b;
    final /* synthetic */ amfu c;

    public amfp(amfu amfuVar) {
        this.c = amfuVar;
    }

    @dzsi
    public static final <V> V d(@dzsi Reference<V> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dbrn<bvlw, cqtd> a(T t);

    @dzsi
    protected abstract T b();

    @dzsi
    public T c() {
        T t = (T) d(this.a);
        if (t != null) {
            return t;
        }
        synchronized (this) {
            T t2 = (T) d(this.a);
            if (t2 != null) {
                return t2;
            }
            T b = b();
            if (b == null) {
                return null;
            }
            this.a = new SoftReference(b);
            return b;
        }
    }
}
