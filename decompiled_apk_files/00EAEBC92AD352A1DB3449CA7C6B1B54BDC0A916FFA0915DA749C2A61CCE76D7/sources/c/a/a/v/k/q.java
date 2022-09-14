package c.a.a.v.k;

import c.a.a.t.b.t;
/* loaded from: classes.dex */
public class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2567a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2568b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.b f2569c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.j.b f2570d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.v.j.b f2571e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2572f;

    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public q(String str, a aVar, c.a.a.v.j.b bVar, c.a.a.v.j.b bVar2, c.a.a.v.j.b bVar3, boolean z) {
        this.f2567a = str;
        this.f2568b = aVar;
        this.f2569c = bVar;
        this.f2570d = bVar2;
        this.f2571e = bVar3;
        this.f2572f = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new t(aVar, this);
    }

    public c.a.a.v.j.b a() {
        return this.f2570d;
    }

    public String b() {
        return this.f2567a;
    }

    public c.a.a.v.j.b c() {
        return this.f2571e;
    }

    public c.a.a.v.j.b d() {
        return this.f2569c;
    }

    public a e() {
        return this.f2568b;
    }

    public boolean f() {
        return this.f2572f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f2569c + ", end: " + this.f2570d + ", offset: " + this.f2571e + "}";
    }
}
