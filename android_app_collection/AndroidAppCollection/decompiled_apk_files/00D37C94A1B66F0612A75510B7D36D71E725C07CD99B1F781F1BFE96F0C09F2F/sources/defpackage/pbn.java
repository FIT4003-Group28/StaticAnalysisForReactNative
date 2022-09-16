package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pbn  reason: default package */
/* loaded from: classes4.dex */
public final class pbn {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public pbn(Uri uri) {
        this(uri, 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        String str = this.f;
        int i = this.g;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public pbn(Uri uri, int i) {
        this(uri, 0L, 0L, -1L, null, i);
    }

    public pbn(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, j, j2, j3, str, i, null);
    }

    public pbn(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public pbn(Uri uri, long j, long j2, long j3, String str, int i, byte[] bArr) {
        boolean z = false;
        pce.b(j >= 0);
        pce.b(j2 >= 0);
        pce.b((j3 > 0 || j3 == -1) ? true : z);
        this.a = uri;
        this.b = null;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }
}
