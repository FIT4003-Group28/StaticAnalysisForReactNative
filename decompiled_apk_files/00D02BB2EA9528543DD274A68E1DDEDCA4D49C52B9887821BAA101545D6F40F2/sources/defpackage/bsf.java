package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bsf  reason: default package */
/* loaded from: classes.dex */
final class bsf {
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    public bse f;
    final /* synthetic */ bsh g;

    public bsf(bsh bshVar, String str) {
        this.g = bshVar;
        this.a = str;
        int i = bshVar.b;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < bshVar.b; i2 = 1) {
            sb.append(0);
            this.c[0] = new File(bshVar.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(bshVar.a, sb.toString());
            sb.setLength(length);
        }
    }

    public static final IOException e(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? "unexpected journal line: ".concat(valueOf) : new String("unexpected journal line: "));
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.b;
        int length = jArr.length;
        for (int i = 0; i < length; i = 1) {
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public final File c() {
        return this.c[0];
    }

    public final File d() {
        return this.d[0];
    }
}
