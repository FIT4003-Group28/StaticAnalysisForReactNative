package f;

import f.c.a.b;
/* loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f10119f;

    /* renamed from: b  reason: collision with root package name */
    private final int f10120b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10121c;

    /* renamed from: d  reason: collision with root package name */
    private final int f10122d;

    /* renamed from: e  reason: collision with root package name */
    private final int f10123e;

    /* renamed from: f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0202a {
        private C0202a() {
        }

        public /* synthetic */ C0202a(f.c.a.a aVar) {
            this();
        }
    }

    static {
        new C0202a(null);
        f10119f = new a(1, 3, 50);
    }

    public a(int i, int i2, int i3) {
        this.f10121c = i;
        this.f10122d = i2;
        this.f10123e = i3;
        this.f10120b = a(this.f10121c, this.f10122d, this.f10123e);
    }

    private final int a(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        b.b(aVar, "other");
        return this.f10120b - aVar.f10120b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        return aVar != null && this.f10120b == aVar.f10120b;
    }

    public int hashCode() {
        return this.f10120b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10121c);
        sb.append('.');
        sb.append(this.f10122d);
        sb.append('.');
        sb.append(this.f10123e);
        return sb.toString();
    }
}
