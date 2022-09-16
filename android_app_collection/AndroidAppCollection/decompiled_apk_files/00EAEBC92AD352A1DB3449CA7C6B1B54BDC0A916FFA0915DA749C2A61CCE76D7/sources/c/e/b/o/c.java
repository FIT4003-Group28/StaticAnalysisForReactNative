package c.e.b.o;

import com.google.android.gms.common.internal.r;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f4880a;

    public c(String str) {
        this.f4880a = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return r.a(this.f4880a, ((c) obj).f4880a);
    }

    public int hashCode() {
        return r.a(this.f4880a);
    }

    public String toString() {
        r.a a2 = r.a(this);
        a2.a("token", this.f4880a);
        return a2.toString();
    }
}
