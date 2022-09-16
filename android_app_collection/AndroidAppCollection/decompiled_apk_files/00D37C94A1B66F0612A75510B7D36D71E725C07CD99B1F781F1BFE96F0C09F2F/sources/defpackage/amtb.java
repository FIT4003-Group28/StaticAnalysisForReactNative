package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: amtb  reason: default package */
/* loaded from: classes.dex */
public final class amtb extends amtk implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;
    private final Queue b;

    private amtb(int i) {
        aqxo.s(i >= 0, "maxSize (%s) must >= 0", i);
        this.b = new ArrayDeque(i);
        this.a = i;
    }

    public static amtb a(int i) {
        return new amtb(i);
    }

    @Override // defpackage.amtg, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.a == 0) {
            return true;
        }
        if (size() == this.a) {
            this.b.remove();
        }
        this.b.add(obj);
        return true;
    }

    @Override // defpackage.amtg, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.a) {
            return arey.n(this, collection.iterator());
        }
        clear();
        int i = size - this.a;
        collection.getClass();
        aqxo.q(i >= 0, "number to skip cannot be negative");
        return arey.u(this, new amvx(collection, i));
    }

    @Override // defpackage.amtk, defpackage.amtg
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // defpackage.amtk
    protected final Queue c() {
        return this.b;
    }

    @Override // defpackage.amtg, defpackage.amtj
    protected final /* bridge */ /* synthetic */ Object g() {
        return this.b;
    }

    @Override // defpackage.amtk, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
