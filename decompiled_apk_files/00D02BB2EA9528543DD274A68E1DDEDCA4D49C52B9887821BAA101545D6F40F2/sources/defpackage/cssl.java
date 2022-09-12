package defpackage;

import android.os.Build;
import android.os.Debug;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: cssl  reason: default package */
/* loaded from: classes5.dex */
public final class cssl extends cssm {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public cssl(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        super(j5, j6, j7);
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j9;
        this.a = j8;
        this.g = j10;
        this.h = j11;
        this.l = j12;
        this.i = j13;
        this.j = j14;
        this.k = j15;
        this.m = j16;
    }

    public static long a(Debug.MemoryInfo memoryInfo, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Method declaredMethod = Debug.MemoryInfo.class.getDeclaredMethod(str, new Class[0]);
                declaredMethod.setAccessible(true);
                return b(((Number) declaredMethod.invoke(memoryInfo, new Object[0])).longValue());
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    public static long b(long j) {
        return j * 1024;
    }

    @Override // defpackage.cssm
    public final String toString() {
        String cssmVar = super.toString();
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        long j5 = this.e;
        long j6 = this.f;
        long j7 = this.g;
        long j8 = this.h;
        long j9 = this.i;
        long j10 = this.j;
        long j11 = this.k;
        long j12 = this.l;
        long j13 = this.m;
        StringBuilder sb = new StringBuilder(String.valueOf(cssmVar).length() + 509);
        sb.append(cssmVar);
        sb.append(", nativeHeapAllocatedB: ");
        sb.append(j);
        sb.append(", otherPrivateDirtyB: ");
        sb.append(j2);
        sb.append(", otherPssB: ");
        sb.append(j3);
        sb.append(", dalvikPrivateDirtyB: ");
        sb.append(j4);
        sb.append(", dalvikPssB: ");
        sb.append(j5);
        sb.append(", totalPssB: ");
        sb.append(j6);
        sb.append(", javaPrivateDirtyB: ");
        sb.append(j7);
        sb.append(", nativePrivateDirtyB: ");
        sb.append(j8);
        sb.append(", otherPrivateCodeB: ");
        sb.append(j9);
        sb.append(", otherPrivateGraphicsB: ");
        sb.append(j10);
        sb.append(", otherPrivateStackB: ");
        sb.append(j11);
        sb.append(", otherPrivateB: ");
        sb.append(j12);
        sb.append(", systemB: ");
        sb.append(j13);
        return sb.toString();
    }
}
