package defpackage;

import java.util.HashSet;
/* compiled from: PG */
/* renamed from: dype  reason: default package */
/* loaded from: classes6.dex */
public abstract class dype<T> {
    private final HashSet<T> a = new HashSet<>();

    public final void a(T t, boolean z) {
        int size = this.a.size();
        if (z) {
            this.a.add(t);
            if (size != 0) {
                return;
            }
            c();
        } else if (!this.a.remove(t) || size != 1) {
        } else {
            d();
        }
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    protected abstract void c();

    protected abstract void d();
}
