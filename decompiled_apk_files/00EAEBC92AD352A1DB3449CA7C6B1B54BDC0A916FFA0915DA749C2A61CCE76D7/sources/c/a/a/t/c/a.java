package c.a.a.t.c;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    private final List<? extends c.a.a.z.a<K>> f2391c;

    /* renamed from: e  reason: collision with root package name */
    protected c.a.a.z.c<A> f2393e;

    /* renamed from: f  reason: collision with root package name */
    private c.a.a.z.a<K> f2394f;

    /* renamed from: g  reason: collision with root package name */
    private c.a.a.z.a<K> f2395g;

    /* renamed from: a  reason: collision with root package name */
    final List<InterfaceC0064a> f2389a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f2390b = false;

    /* renamed from: d  reason: collision with root package name */
    private float f2392d = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f2396h = -1.0f;
    private A i = null;
    private float j = -1.0f;
    private float k = -1.0f;

    /* renamed from: c.a.a.t.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0064a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends c.a.a.z.a<K>> list) {
        this.f2391c = list;
    }

    private float i() {
        if (this.j == -1.0f) {
            this.j = this.f2391c.isEmpty() ? 0.0f : this.f2391c.get(0).d();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c.a.a.z.a<K> a() {
        List<? extends c.a.a.z.a<K>> list;
        c.a.a.z.a<K> aVar = this.f2394f;
        if (aVar == null || !aVar.a(this.f2392d)) {
            c.a.a.z.a<K> aVar2 = this.f2391c.get(list.size() - 1);
            if (this.f2392d < aVar2.d()) {
                for (int size = this.f2391c.size() - 1; size >= 0; size--) {
                    aVar2 = this.f2391c.get(size);
                    if (aVar2.a(this.f2392d)) {
                        break;
                    }
                }
            }
            this.f2394f = aVar2;
            return aVar2;
        }
        return this.f2394f;
    }

    /* renamed from: a */
    abstract A mo103a(c.a.a.z.a<K> aVar, float f2);

    public void a(float f2) {
        if (this.f2391c.isEmpty()) {
            return;
        }
        c.a.a.z.a<K> a2 = a();
        if (f2 < i()) {
            f2 = i();
        } else if (f2 > b()) {
            f2 = b();
        }
        if (f2 == this.f2392d) {
            return;
        }
        this.f2392d = f2;
        c.a.a.z.a<K> a3 = a();
        if (a2 == a3 && a3.g()) {
            return;
        }
        g();
    }

    public void a(InterfaceC0064a interfaceC0064a) {
        this.f2389a.add(interfaceC0064a);
    }

    public void a(c.a.a.z.c<A> cVar) {
        c.a.a.z.c<A> cVar2 = this.f2393e;
        if (cVar2 != null) {
            cVar2.a((a<?, ?>) null);
        }
        this.f2393e = cVar;
        if (cVar != null) {
            cVar.a((a<?, ?>) this);
        }
    }

    float b() {
        float a2;
        if (this.k == -1.0f) {
            if (this.f2391c.isEmpty()) {
                a2 = 1.0f;
            } else {
                List<? extends c.a.a.z.a<K>> list = this.f2391c;
                a2 = list.get(list.size() - 1).a();
            }
            this.k = a2;
        }
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float c() {
        c.a.a.z.a<K> a2 = a();
        if (a2.g()) {
            return 0.0f;
        }
        return a2.f2705d.getInterpolation(d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        if (this.f2390b) {
            return 0.0f;
        }
        c.a.a.z.a<K> a2 = a();
        if (!a2.g()) {
            return (this.f2392d - a2.d()) / (a2.a() - a2.d());
        }
        return 0.0f;
    }

    public float e() {
        return this.f2392d;
    }

    /* renamed from: f */
    public A mo102f() {
        c.a.a.z.a<K> a2 = a();
        float c2 = c();
        if (this.f2393e == null && a2 == this.f2395g && this.f2396h == c2) {
            return this.i;
        }
        this.f2395g = a2;
        this.f2396h = c2;
        A mo103a = mo103a(a2, c2);
        this.i = mo103a;
        return mo103a;
    }

    public void g() {
        for (int i = 0; i < this.f2389a.size(); i++) {
            this.f2389a.get(i).a();
        }
    }

    public void h() {
        this.f2390b = true;
    }
}
