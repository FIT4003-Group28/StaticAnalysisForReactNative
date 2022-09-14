package c.d.b.b;

import c.d.b.b.d;
/* loaded from: classes.dex */
public class b implements h {

    /* loaded from: classes.dex */
    class a implements g {
        a(b bVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d.a aVar, d.a aVar2) {
            long c2 = aVar.c();
            long c3 = aVar2.c();
            if (c2 < c3) {
                return -1;
            }
            return c3 == c2 ? 0 : 1;
        }
    }

    @Override // c.d.b.b.h
    public g get() {
        return new a(this);
    }
}
