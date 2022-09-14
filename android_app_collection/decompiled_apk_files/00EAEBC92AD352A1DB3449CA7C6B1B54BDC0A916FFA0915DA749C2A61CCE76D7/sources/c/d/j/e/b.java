package c.d.j.e;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
/* loaded from: classes.dex */
public class b {
    private static final b j = b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f3246a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3247b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3248c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3249d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3250e;

    /* renamed from: f  reason: collision with root package name */
    public final Bitmap.Config f3251f;

    /* renamed from: g  reason: collision with root package name */
    public final c.d.j.i.c f3252g;

    /* renamed from: h  reason: collision with root package name */
    public final c.d.j.r.a f3253h;
    public final ColorSpace i;

    public b(c cVar) {
        this.f3246a = cVar.i();
        this.f3247b = cVar.g();
        this.f3248c = cVar.j();
        this.f3249d = cVar.f();
        this.f3250e = cVar.h();
        this.f3251f = cVar.b();
        this.f3252g = cVar.e();
        this.f3253h = cVar.c();
        this.i = cVar.d();
    }

    public static b a() {
        return j;
    }

    public static c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3247b == bVar.f3247b && this.f3248c == bVar.f3248c && this.f3249d == bVar.f3249d && this.f3250e == bVar.f3250e && this.f3251f == bVar.f3251f && this.f3252g == bVar.f3252g && this.f3253h == bVar.f3253h && this.i == bVar.i;
    }

    public int hashCode() {
        int ordinal = ((((((((((this.f3246a * 31) + (this.f3247b ? 1 : 0)) * 31) + (this.f3248c ? 1 : 0)) * 31) + (this.f3249d ? 1 : 0)) * 31) + (this.f3250e ? 1 : 0)) * 31) + this.f3251f.ordinal()) * 31;
        c.d.j.i.c cVar = this.f3252g;
        int i = 0;
        int hashCode = (ordinal + (cVar != null ? cVar.hashCode() : 0)) * 31;
        c.d.j.r.a aVar = this.f3253h;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.i;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", Integer.valueOf(this.f3246a), Boolean.valueOf(this.f3247b), Boolean.valueOf(this.f3248c), Boolean.valueOf(this.f3249d), Boolean.valueOf(this.f3250e), this.f3251f.name(), this.f3252g, this.f3253h, this.i);
    }
}
