package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class e7 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    private int f4127b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f4128c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ c7 f4129d;

    private e7(c7 c7Var) {
        List list;
        this.f4129d = c7Var;
        list = this.f4129d.f4084c;
        this.f4127b = list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e7(c7 c7Var, f7 f7Var) {
        this(c7Var);
    }

    private final Iterator<Map.Entry<K, V>> f() {
        Map map;
        if (this.f4128c == null) {
            map = this.f4129d.f4088g;
            this.f4128c = map.entrySet().iterator();
        }
        return this.f4128c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.f4127b;
        if (i > 0) {
            list = this.f4129d.f4084c;
            if (i <= list.size()) {
                return true;
            }
        }
        return f().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (f().hasNext()) {
            obj = f().next();
        } else {
            list = this.f4129d.f4084c;
            int i = this.f4127b - 1;
            this.f4127b = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
