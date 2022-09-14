package c.a.a.v.k;
/* loaded from: classes.dex */
public class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2502a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2503b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2504c;

    /* loaded from: classes.dex */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public h(String str, a aVar, boolean z) {
        this.f2502a = str;
        this.f2503b = aVar;
        this.f2504c = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        if (!gVar.c()) {
            c.a.a.y.d.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new c.a.a.t.b.l(this);
    }

    public a a() {
        return this.f2503b;
    }

    public String b() {
        return this.f2502a;
    }

    public boolean c() {
        return this.f2504c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f2503b + '}';
    }
}
