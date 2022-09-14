package c.a.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class m<V> {

    /* renamed from: a  reason: collision with root package name */
    private final V f2287a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f2288b;

    public m(V v) {
        this.f2287a = v;
        this.f2288b = null;
    }

    public m(Throwable th) {
        this.f2288b = th;
        this.f2287a = null;
    }

    public Throwable a() {
        return this.f2288b;
    }

    public V b() {
        return this.f2287a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (b() != null && b().equals(mVar.b())) {
            return true;
        }
        if (a() != null && mVar.a() != null) {
            return a().toString().equals(a().toString());
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }
}
