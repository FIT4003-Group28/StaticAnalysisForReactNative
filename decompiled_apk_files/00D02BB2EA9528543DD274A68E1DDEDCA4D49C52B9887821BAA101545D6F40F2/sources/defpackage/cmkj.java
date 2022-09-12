package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmkj  reason: default package */
/* loaded from: classes5.dex */
public final class cmkj {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map<String, String> e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public cmkj(Uri uri, long j, int i, Map<String, String> map, long j2, long j3, String str, int i2) {
        boolean z = false;
        cmmn.a(j + j2 >= 0);
        cmmn.a(j2 >= 0);
        cmmn.a((j3 > 0 || j3 == -1) ? true : z);
        this.a = uri;
        this.b = j;
        this.c = 1;
        this.d = null;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String a(int i) {
        return "GET";
    }

    public final boolean b(int i) {
        return (this.i & i) == i;
    }

    public final cmki c() {
        return new cmki(this);
    }

    public final String toString() {
        String a = a(1);
        String valueOf = String.valueOf(this.a);
        long j = this.f;
        long j2 = this.g;
        String str = this.h;
        int i = this.i;
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + 70 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
