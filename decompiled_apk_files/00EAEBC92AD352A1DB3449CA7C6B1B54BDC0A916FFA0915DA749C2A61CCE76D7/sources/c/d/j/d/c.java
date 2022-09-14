package c.d.j.d;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
/* loaded from: classes.dex */
public class c implements c.d.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final String f3184a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.e.e f3185b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.e.f f3186c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.j.e.b f3187d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.b.a.d f3188e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3189f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3190g;

    public c(String str, c.d.j.e.e eVar, c.d.j.e.f fVar, c.d.j.e.b bVar, c.d.b.a.d dVar, String str2, Object obj) {
        c.d.d.d.i.a(str);
        this.f3184a = str;
        this.f3185b = eVar;
        this.f3186c = fVar;
        this.f3187d = bVar;
        this.f3188e = dVar;
        this.f3189f = str2;
        this.f3190g = c.d.d.k.b.a(Integer.valueOf(str.hashCode()), Integer.valueOf(eVar != null ? eVar.hashCode() : 0), Integer.valueOf(fVar.hashCode()), this.f3187d, this.f3188e, str2);
        RealtimeSinceBootClock.get().now();
    }

    @Override // c.d.b.a.d
    public String a() {
        return this.f3184a;
    }

    @Override // c.d.b.a.d
    public boolean a(Uri uri) {
        return a().contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3190g == cVar.f3190g && this.f3184a.equals(cVar.f3184a) && c.d.d.d.h.a(this.f3185b, cVar.f3185b) && c.d.d.d.h.a(this.f3186c, cVar.f3186c) && c.d.d.d.h.a(this.f3187d, cVar.f3187d) && c.d.d.d.h.a(this.f3188e, cVar.f3188e) && c.d.d.d.h.a(this.f3189f, cVar.f3189f);
    }

    public int hashCode() {
        return this.f3190g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f3184a, this.f3185b, this.f3186c, this.f3187d, this.f3188e, this.f3189f, Integer.valueOf(this.f3190g));
    }
}
