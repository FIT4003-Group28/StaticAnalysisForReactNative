package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asl  reason: default package */
/* loaded from: classes2.dex */
public final class asl {
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] d;
    public final long[] e;
    public final long f;
    public final boolean g;

    public asl(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        ptx.c(iArr.length == uriArr.length);
        this.a = 0L;
        this.b = i;
        this.d = iArr;
        this.c = uriArr;
        this.e = jArr;
        this.f = 0L;
        this.g = false;
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asl aslVar = (asl) obj;
            if (this.b == aslVar.b && Arrays.equals(this.c, aslVar.c) && Arrays.equals(this.d, aslVar.d) && Arrays.equals(this.e, aslVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e)) * 961;
    }
}
