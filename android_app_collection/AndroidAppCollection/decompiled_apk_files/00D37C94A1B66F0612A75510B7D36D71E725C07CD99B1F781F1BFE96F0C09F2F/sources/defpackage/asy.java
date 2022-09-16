package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: asy  reason: default package */
/* loaded from: classes2.dex */
public final class asy {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    @Deprecated
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    public asy(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    public static String f(int i) {
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public final asx a() {
        return new asx(this);
    }

    public final asy b(long j) {
        long j2 = this.h;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return c(j, j3);
    }

    public final asy c(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new asy(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public final asy d(Uri uri) {
        return new asy(uri, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.j, this.k);
    }

    public final String e() {
        return f(this.c);
    }

    public final boolean g(int i) {
        return (this.j & i) == i;
    }

    public final String toString() {
        String e = e();
        String valueOf = String.valueOf(this.a);
        long j = this.g;
        long j2 = this.h;
        String str = this.i;
        int i = this.j;
        int length = e.length();
        StringBuilder sb = new StringBuilder(length + 70 + String.valueOf(valueOf).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(e);
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

    public asy(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j + j2;
        boolean z = false;
        ptx.c(j4 >= 0);
        ptx.c(j2 >= 0);
        ptx.c((j3 > 0 || j3 == -1) ? true : z);
        this.a = uri;
        this.b = j;
        this.c = i;
        byte[] bArr2 = null;
        if (bArr != null && bArr.length != 0) {
            bArr2 = bArr;
        }
        this.d = bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }

    @Deprecated
    public asy(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, j, j2, j3, str, i, null);
    }

    @Deprecated
    public asy(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    @Deprecated
    public asy(Uri uri, long j, long j2, String str, byte[] bArr) {
        this(uri, j, j, j2, str, 4);
    }

    @Deprecated
    public asy(Uri uri, long j, long j2, long j3, String str, int i, byte[] bArr) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, str, i, null);
    }
}
