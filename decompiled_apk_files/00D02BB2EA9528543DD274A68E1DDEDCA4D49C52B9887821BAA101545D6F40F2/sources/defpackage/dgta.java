package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dgta  reason: default package */
/* loaded from: classes6.dex */
public final class dgta extends dgtc implements Iterable<dgtc> {
    private final List<dgtc> a = new ArrayList();

    public final void a(dgtc dgtcVar) {
        this.a.add(dgtcVar);
    }

    public final dgtc b(int i) {
        return this.a.get(i);
    }

    @Override // defpackage.dgtc
    public final String c() {
        if (this.a.size() == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.dgtc
    public final int d() {
        if (this.a.size() == 1) {
            return this.a.get(0).d();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof dgta) && ((dgta) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<dgtc> iterator() {
        return this.a.iterator();
    }
}
