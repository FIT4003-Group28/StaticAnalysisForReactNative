package c.e.a.b.e;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.r;
/* loaded from: classes.dex */
public final class a implements a.d.e {
    public static final a k;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4570b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4571c = false;

    /* renamed from: d  reason: collision with root package name */
    private final String f4572d = null;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4573e = false;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f4576h = false;

    /* renamed from: f  reason: collision with root package name */
    private final String f4574f = null;

    /* renamed from: g  reason: collision with root package name */
    private final String f4575g = null;
    private final Long i = null;
    private final Long j = null;

    /* renamed from: c.e.a.b.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0098a {
    }

    static {
        new C0098a();
        k = new a(false, false, null, false, null, null, false, null, null);
    }

    private a(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    public final Long a() {
        return this.i;
    }

    public final String b() {
        return this.f4574f;
    }

    public final String c() {
        return this.f4575g;
    }

    public final Long d() {
        return this.j;
    }

    public final String e() {
        return this.f4572d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4570b == aVar.f4570b && this.f4571c == aVar.f4571c && r.a(this.f4572d, aVar.f4572d) && this.f4573e == aVar.f4573e && this.f4576h == aVar.f4576h && r.a(this.f4574f, aVar.f4574f) && r.a(this.f4575g, aVar.f4575g) && r.a(this.i, aVar.i) && r.a(this.j, aVar.j);
    }

    public final boolean f() {
        return this.f4573e;
    }

    public final boolean g() {
        return this.f4571c;
    }

    public final boolean h() {
        return this.f4570b;
    }

    public final int hashCode() {
        return r.a(Boolean.valueOf(this.f4570b), Boolean.valueOf(this.f4571c), this.f4572d, Boolean.valueOf(this.f4573e), Boolean.valueOf(this.f4576h), this.f4574f, this.f4575g, this.i, this.j);
    }

    public final boolean i() {
        return this.f4576h;
    }
}
