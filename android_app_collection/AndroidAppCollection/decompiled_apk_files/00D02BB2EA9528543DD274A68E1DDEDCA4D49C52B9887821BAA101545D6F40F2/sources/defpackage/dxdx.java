package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxdx  reason: default package */
/* loaded from: classes6.dex */
public final class dxdx {
    public final String a;
    public final long[] b;
    public boolean c;
    public dxdw d;
    final /* synthetic */ dxdz e;

    public dxdx(dxdz dxdzVar, String str) {
        this.e = dxdzVar;
        this.a = str;
        this.b = new long[dxdzVar.c];
    }

    public static final IOException e(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
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
        File file = this.e.b;
        return new File(file, this.a + ".0");
    }

    public final File d() {
        File file = this.e.b;
        return new File(file, this.a + ".0.tmp");
    }
}
