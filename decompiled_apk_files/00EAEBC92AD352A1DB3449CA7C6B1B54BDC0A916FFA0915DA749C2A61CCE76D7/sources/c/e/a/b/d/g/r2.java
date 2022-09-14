package c.e.a.b.d.g;

import android.content.Context;
import android.net.Uri;
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    final Uri f4382a;

    /* renamed from: b  reason: collision with root package name */
    final String f4383b;

    /* renamed from: c  reason: collision with root package name */
    final String f4384c;

    public r2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private r2(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, v2<Context, Boolean> v2Var) {
        this.f4382a = uri;
        this.f4383b = str2;
        this.f4384c = str3;
    }

    public final k2<Double> a(String str, double d2) {
        k2<Double> b2;
        b2 = k2.b(this, str, -3.0d, true);
        return b2;
    }

    public final k2<Long> a(String str, long j) {
        k2<Long> b2;
        b2 = k2.b(this, str, j, true);
        return b2;
    }

    public final k2<String> a(String str, String str2) {
        k2<String> b2;
        b2 = k2.b(this, str, str2, true);
        return b2;
    }

    public final k2<Boolean> a(String str, boolean z) {
        k2<Boolean> b2;
        b2 = k2.b(this, str, z, true);
        return b2;
    }
}
