package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cryx  reason: default package */
/* loaded from: classes5.dex */
public final class cryx {
    public final File a;
    public final File b;
    public final File c;
    public final int d;
    private final File e;

    public cryx(int i, File file, File file2, File file3, File file4) {
        this.d = i;
        this.a = file;
        this.e = file2;
        this.b = file3;
        this.c = file4;
    }

    public static long f(File file) {
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }

    public final long a() {
        return f(new File(this.e, "base.art"));
    }

    public final long b() {
        return f(new File(this.e, "base.odex"));
    }

    public final long c() {
        return f(new File(this.e, "base.vdex"));
    }

    public final long d() {
        return f(this.b);
    }

    public final long e() {
        return f(this.c);
    }
}
