package c.d.b.a;

import android.net.Uri;
/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final String f2735a;

    public i(String str) {
        c.d.d.d.i.a(str);
        this.f2735a = str;
    }

    @Override // c.d.b.a.d
    public String a() {
        return this.f2735a;
    }

    @Override // c.d.b.a.d
    public boolean a(Uri uri) {
        return this.f2735a.contains(uri.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f2735a.equals(((i) obj).f2735a);
    }

    public int hashCode() {
        return this.f2735a.hashCode();
    }

    public String toString() {
        return this.f2735a;
    }
}
