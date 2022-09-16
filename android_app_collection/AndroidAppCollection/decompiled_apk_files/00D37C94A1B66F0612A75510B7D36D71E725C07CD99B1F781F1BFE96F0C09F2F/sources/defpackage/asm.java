package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: asm  reason: default package */
/* loaded from: classes2.dex */
public final class asm {
    public static final asm a = new asm(new asl[0]);
    private static final asl c;
    public final long b = 0;
    private final asl[] d;

    static {
        asl aslVar = new asl(-1, new int[0], new Uri[0], new long[0]);
        int[] iArr = aslVar.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aslVar.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        c = new asl(0, copyOf, (Uri[]) Arrays.copyOf(aslVar.c, 0), copyOf2);
    }

    private asm(asl[] aslVarArr) {
        this.d = aslVarArr;
    }

    public final asl a(int i) {
        return i < 0 ? c : this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asm asmVar = (asm) obj;
            if (pxi.M(null, null) && Arrays.equals(this.d, asmVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
