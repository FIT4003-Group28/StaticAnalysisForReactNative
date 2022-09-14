package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class k7 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f4259b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4260c;

    /* renamed from: d  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4261d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ c7 f4262e;

    private k7(c7 c7Var) {
        this.f4262e = c7Var;
        this.f4259b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k7(c7 c7Var, f7 f7Var) {
        this(c7Var);
    }

    private final Iterator<Map.Entry<K, V>> f() {
        Map map;
        if (this.f4261d == null) {
            map = this.f4262e.f4085d;
            this.f4261d = map.entrySet().iterator();
        }
        return this.f4261d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.f4259b + 1;
        list = this.f4262e.f4084c;
        if (i >= list.size()) {
            map = this.f4262e.f4085d;
            if (map.isEmpty() || !f().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f4260c = true;
        int i = this.f4259b + 1;
        this.f4259b = i;
        list = this.f4262e.f4084c;
        if (i < list.size()) {
            list2 = this.f4262e.f4084c;
            next = list2.get(this.f4259b);
        } else {
            next = f().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f4260c) {
            this.f4260c = false;
            this.f4262e.f();
            int i = this.f4259b;
            list = this.f4262e.f4084c;
            if (i >= list.size()) {
                f().remove();
                return;
            }
            c7 c7Var = this.f4262e;
            int i2 = this.f4259b;
            this.f4259b = i2 - 1;
            c7Var.c(i2);
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
