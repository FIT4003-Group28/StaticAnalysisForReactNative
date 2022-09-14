package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: clbj  reason: default package */
/* loaded from: classes5.dex */
public class clbj<O> implements Iterable<O> {
    public final Set<O> b = new HashSet();

    protected final void finalize() {
        if (!this.b.isEmpty()) {
            this.b.size();
            this.b.iterator().next();
        }
        super.finalize();
    }

    @Override // java.lang.Iterable
    public final Iterator<O> iterator() {
        Iterator<O> it;
        synchronized (this.b) {
            it = new ArrayList(this.b).iterator();
        }
        return it;
    }
}
