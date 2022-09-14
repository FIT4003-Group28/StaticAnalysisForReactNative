package c.d.j.i;

import c.d.d.d.i;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private final c f3373a;

    /* loaded from: classes.dex */
    private static class b implements c {
        private b() {
        }

        @Override // c.d.j.i.g.c
        public int a() {
            return 0;
        }

        @Override // c.d.j.i.g.c
        public List<Integer> b() {
            return Collections.EMPTY_LIST;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a();

        List<Integer> b();
    }

    public g() {
        this(new b());
    }

    public g(c cVar) {
        i.a(cVar);
        this.f3373a = cVar;
    }

    @Override // c.d.j.i.e
    public int a(int i) {
        List<Integer> b2 = this.f3373a.b();
        if (b2 == null || b2.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < b2.size(); i2++) {
            if (b2.get(i2).intValue() > i) {
                return b2.get(i2).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // c.d.j.i.e
    public c.d.j.k.g b(int i) {
        return c.d.j.k.f.a(i, i >= this.f3373a.a(), false);
    }
}
