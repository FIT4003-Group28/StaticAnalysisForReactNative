package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cmft  reason: default package */
/* loaded from: classes5.dex */
public final class cmft {
    public static final cmft a = new cmft(new long[0]);
    public final int b;
    public final long[] c;
    public final cmfs[] d;
    public final long e = 0;

    private cmft(long[] jArr) {
        this.c = jArr;
        int length = jArr.length;
        this.b = length;
        cmfs[] cmfsVarArr = new cmfs[length];
        for (int i = 0; i < this.b; i++) {
            cmfsVarArr[i] = new cmfs();
        }
        this.d = cmfsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cmft cmftVar = (cmft) obj;
            if (cmny.b(null, null) && this.b == cmftVar.b && Arrays.equals(this.c, cmftVar.c) && Arrays.equals(this.d, cmftVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 29791) + ((int) (-9223372036854775807L))) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append((Object) null);
        sb.append(", adResumePositionUs=");
        sb.append(0L);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.d.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.c[i]);
            sb.append(", ads=[");
            int[] iArr = this.d[i].c;
            sb.append("])");
            if (i < this.d.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
