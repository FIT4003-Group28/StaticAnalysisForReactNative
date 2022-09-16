package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dcfs  reason: default package */
/* loaded from: classes5.dex */
public final class dcfs<T> extends dcbg<T> {
    private final Iterable<? extends T> a;

    public dcfs(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return dcgh.a(this.a.iterator());
    }

    @Override // defpackage.dcbg
    public final String toString() {
        return this.a.toString();
    }
}
