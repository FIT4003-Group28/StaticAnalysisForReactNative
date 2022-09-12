package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dcga  reason: default package */
/* loaded from: classes.dex */
final class dcga extends dcpd {
    boolean a;
    final /* synthetic */ Object b;

    public dcga(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
