package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cssm  reason: default package */
/* loaded from: classes.dex */
public class cssm {
    private static final Runtime a = Runtime.getRuntime();
    public final long n;
    public final long o;
    public final long p;

    public cssm(long j, long j2, long j3) {
        this.n = j;
        this.o = j2;
        this.p = j3;
    }

    public static cssm c() {
        Runtime runtime = a;
        long j = runtime.totalMemory();
        return new cssm(j - runtime.freeMemory(), j, runtime.maxMemory());
    }

    public String toString() {
        long j = this.n;
        long j2 = this.o;
        long j3 = this.p;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedWidthMinor);
        sb.append("dalvikHeapAllocatedB: ");
        sb.append(j);
        sb.append(", dalvikHeapSizeB: ");
        sb.append(j2);
        sb.append(", dalvikMaxHeapSizeB: ");
        sb.append(j3);
        return sb.toString();
    }
}
