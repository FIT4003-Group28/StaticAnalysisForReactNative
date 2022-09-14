package c.a.a;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<c.a.a.v.l.d>> f2221c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, h> f2222d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, c.a.a.v.c> f2223e;

    /* renamed from: f  reason: collision with root package name */
    private List<c.a.a.v.h> f2224f;

    /* renamed from: g  reason: collision with root package name */
    private a.e.h<c.a.a.v.d> f2225g;

    /* renamed from: h  reason: collision with root package name */
    private a.e.d<c.a.a.v.l.d> f2226h;
    private List<c.a.a.v.l.d> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;

    /* renamed from: a  reason: collision with root package name */
    private final o f2219a = new o();

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<String> f2220b = new HashSet<>();
    private int o = 0;

    public Rect a() {
        return this.j;
    }

    public c.a.a.v.l.d a(long j) {
        return this.f2226h.c(j);
    }

    public void a(int i) {
        this.o += i;
    }

    public void a(Rect rect, float f2, float f3, float f4, List<c.a.a.v.l.d> list, a.e.d<c.a.a.v.l.d> dVar, Map<String, List<c.a.a.v.l.d>> map, Map<String, h> map2, a.e.h<c.a.a.v.d> hVar, Map<String, c.a.a.v.c> map3, List<c.a.a.v.h> list2) {
        this.j = rect;
        this.k = f2;
        this.l = f3;
        this.m = f4;
        this.i = list;
        this.f2226h = dVar;
        this.f2221c = map;
        this.f2222d = map2;
        this.f2225g = hVar;
        this.f2223e = map3;
        this.f2224f = list2;
    }

    public void a(String str) {
        c.a.a.y.d.b(str);
        this.f2220b.add(str);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public a.e.h<c.a.a.v.d> b() {
        return this.f2225g;
    }

    public c.a.a.v.h b(String str) {
        this.f2224f.size();
        for (int i = 0; i < this.f2224f.size(); i++) {
            c.a.a.v.h hVar = this.f2224f.get(i);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public void b(boolean z) {
        this.f2219a.a(z);
    }

    public float c() {
        return (d() / this.m) * 1000.0f;
    }

    public List<c.a.a.v.l.d> c(String str) {
        return this.f2221c.get(str);
    }

    public float d() {
        return this.l - this.k;
    }

    public float e() {
        return this.l;
    }

    public Map<String, c.a.a.v.c> f() {
        return this.f2223e;
    }

    public float g() {
        return this.m;
    }

    public Map<String, h> h() {
        return this.f2222d;
    }

    public List<c.a.a.v.l.d> i() {
        return this.i;
    }

    public int j() {
        return this.o;
    }

    public o k() {
        return this.f2219a;
    }

    public float l() {
        return this.k;
    }

    public boolean m() {
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (c.a.a.v.l.d dVar : this.i) {
            sb.append(dVar.a("\t"));
        }
        return sb.toString();
    }
}
