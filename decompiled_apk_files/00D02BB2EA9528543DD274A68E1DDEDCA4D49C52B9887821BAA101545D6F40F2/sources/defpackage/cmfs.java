package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmfs  reason: default package */
/* loaded from: classes5.dex */
public final class cmfs {
    public final int a;
    public final Uri[] b;
    public final int[] c;
    public final long[] d;

    public cmfs() {
        cmmn.a(true);
        this.a = -1;
        this.c = new int[0];
        this.b = new Uri[0];
        this.d = new long[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmfs cmfsVar = (cmfs) obj;
            if (Arrays.equals(this.b, cmfsVar.b) && Arrays.equals(this.c, cmfsVar.c) && Arrays.equals(this.d, cmfsVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) - 31) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
