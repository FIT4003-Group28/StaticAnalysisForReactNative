package c.d.b.a;

import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    final List<d> f2732a;

    public f(List<d> list) {
        c.d.d.d.i.a(list);
        this.f2732a = list;
    }

    @Override // c.d.b.a.d
    public String a() {
        return this.f2732a.get(0).a();
    }

    @Override // c.d.b.a.d
    public boolean a(Uri uri) {
        for (int i = 0; i < this.f2732a.size(); i++) {
            if (this.f2732a.get(i).a(uri)) {
                return true;
            }
        }
        return false;
    }

    public List<d> b() {
        return this.f2732a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f2732a.equals(((f) obj).f2732a);
    }

    public int hashCode() {
        return this.f2732a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f2732a.toString();
    }
}
