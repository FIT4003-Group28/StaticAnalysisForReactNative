package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    final a.e.g<RecyclerView.d0, a> f2139a = new a.e.g<>();

    /* renamed from: b  reason: collision with root package name */
    final a.e.d<RecyclerView.d0> f2140b = new a.e.d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static androidx.core.util.e<a> f2141d = new Pools$SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f2142a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.l.c f2143b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.l.c f2144c;

        private a() {
        }

        static void a() {
            do {
            } while (f2141d.a() != null);
        }

        static void a(a aVar) {
            aVar.f2142a = 0;
            aVar.f2143b = null;
            aVar.f2144c = null;
            f2141d.a(aVar);
        }

        static a b() {
            a a2 = f2141d.a();
            return a2 == null ? new a() : a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c a(RecyclerView.d0 d0Var, int i) {
        a d2;
        RecyclerView.l.c cVar;
        int a2 = this.f2139a.a(d0Var);
        if (a2 >= 0 && (d2 = this.f2139a.d(a2)) != null) {
            int i2 = d2.f2142a;
            if ((i2 & i) != 0) {
                d2.f2142a = (~i) & i2;
                if (i == 4) {
                    cVar = d2.f2143b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = d2.f2144c;
                }
                if ((d2.f2142a & 12) == 0) {
                    this.f2139a.c(a2);
                    a.a(d2);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.d0 a(long j) {
        return this.f2140b.c(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f2139a.clear();
        this.f2140b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j, RecyclerView.d0 d0Var) {
        this.f2140b.c(j, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var) {
        a aVar = this.f2139a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f2139a.put(d0Var, aVar);
        }
        aVar.f2142a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f2139a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f2139a.put(d0Var, aVar);
        }
        aVar.f2142a |= 2;
        aVar.f2143b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.f2139a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 b2 = this.f2139a.b(size);
            a c2 = this.f2139a.c(size);
            int i = c2.f2142a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = c2.f2143b;
                    if (cVar != null) {
                        cVar2 = c2.f2144c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.c(b2, c2.f2143b, c2.f2144c);
                        } else if ((i & 4) != 0) {
                            cVar = c2.f2143b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        a.a(c2);
                    }
                    bVar.a(b2, c2.f2143b, c2.f2144c);
                    a.a(c2);
                }
                bVar.b(b2, cVar, cVar2);
                a.a(c2);
            }
            bVar.a(b2);
            a.a(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f2139a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f2139a.put(d0Var, aVar);
        }
        aVar.f2144c = cVar;
        aVar.f2142a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(RecyclerView.d0 d0Var) {
        a aVar = this.f2139a.get(d0Var);
        return (aVar == null || (aVar.f2142a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.f2139a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f2139a.put(d0Var, aVar);
        }
        aVar.f2143b = cVar;
        aVar.f2142a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(RecyclerView.d0 d0Var) {
        a aVar = this.f2139a.get(d0Var);
        return (aVar == null || (aVar.f2142a & 4) == 0) ? false : true;
    }

    public void d(RecyclerView.d0 d0Var) {
        g(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c e(RecyclerView.d0 d0Var) {
        return a(d0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.l.c f(RecyclerView.d0 d0Var) {
        return a(d0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(RecyclerView.d0 d0Var) {
        a aVar = this.f2139a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2142a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(RecyclerView.d0 d0Var) {
        int b2 = this.f2140b.b() - 1;
        while (true) {
            if (b2 < 0) {
                break;
            } else if (d0Var == this.f2140b.c(b2)) {
                this.f2140b.b(b2);
                break;
            } else {
                b2--;
            }
        }
        a remove = this.f2139a.remove(d0Var);
        if (remove != null) {
            a.a(remove);
        }
    }
}
