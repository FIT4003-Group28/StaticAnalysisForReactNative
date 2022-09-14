package c.a.a.v.l;

import c.a.a.v.j.j;
import c.a.a.v.j.k;
import c.a.a.v.j.l;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<c.a.a.v.k.b> f2589a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.e f2590b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2591c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2592d;

    /* renamed from: e  reason: collision with root package name */
    private final a f2593e;

    /* renamed from: f  reason: collision with root package name */
    private final long f2594f;

    /* renamed from: g  reason: collision with root package name */
    private final String f2595g;

    /* renamed from: h  reason: collision with root package name */
    private final List<c.a.a.v.k.g> f2596h;
    private final l i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final j q;
    private final k r;
    private final c.a.a.v.j.b s;
    private final List<c.a.a.z.a<Float>> t;
    private final b u;
    private final boolean v;

    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        UNKNOWN
    }

    public d(List<c.a.a.v.k.b> list, c.a.a.e eVar, String str, long j, a aVar, long j2, String str2, List<c.a.a.v.k.g> list2, l lVar, int i, int i2, int i3, float f2, float f3, int i4, int i5, j jVar, k kVar, List<c.a.a.z.a<Float>> list3, b bVar, c.a.a.v.j.b bVar2, boolean z) {
        this.f2589a = list;
        this.f2590b = eVar;
        this.f2591c = str;
        this.f2592d = j;
        this.f2593e = aVar;
        this.f2594f = j2;
        this.f2595g = str2;
        this.f2596h = list2;
        this.i = lVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f2;
        this.n = f3;
        this.o = i4;
        this.p = i5;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
        this.v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.a.a.e a() {
        return this.f2590b;
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g());
        sb.append("\n");
        d a2 = this.f2590b.a(h());
        if (a2 != null) {
            String str2 = "\t\tParents: ";
            while (true) {
                sb.append(str2);
                sb.append(a2.g());
                a2 = this.f2590b.a(a2.h());
                if (a2 == null) {
                    break;
                }
                str2 = "->";
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(e().size());
            sb.append("\n");
        }
        if (o() != 0 && n() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(o()), Integer.valueOf(n()), Integer.valueOf(m())));
        }
        if (!this.f2589a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (c.a.a.v.k.b bVar : this.f2589a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public long b() {
        return this.f2592d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c.a.a.z.a<Float>> c() {
        return this.t;
    }

    public a d() {
        return this.f2593e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c.a.a.v.k.g> e() {
        return this.f2596h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.f2591c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.f2594f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return this.f2595g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c.a.a.v.k.b> l() {
        return this.f2589a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.n / this.f2590b.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k r() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.a.a.v.j.b s() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.m;
    }

    public String toString() {
        return a("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l u() {
        return this.i;
    }

    public boolean v() {
        return this.v;
    }
}
