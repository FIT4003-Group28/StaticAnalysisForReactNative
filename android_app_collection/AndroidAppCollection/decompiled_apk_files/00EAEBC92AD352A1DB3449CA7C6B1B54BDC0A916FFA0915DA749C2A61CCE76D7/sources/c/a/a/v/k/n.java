package c.a.a.v.k;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class n implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2542a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f2543b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2544c;

    public n(String str, List<b> list, boolean z) {
        this.f2542a = str;
        this.f2543b = list;
        this.f2544c = z;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.d(gVar, aVar, this);
    }

    public List<b> a() {
        return this.f2543b;
    }

    public String b() {
        return this.f2542a;
    }

    public boolean c() {
        return this.f2544c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f2542a + "' Shapes: " + Arrays.toString(this.f2543b.toArray()) + '}';
    }
}
