package defpackage;

import com.google.android.exoplayer2.source.TrackGroup;
/* compiled from: PG */
/* renamed from: cmiv  reason: default package */
/* loaded from: classes5.dex */
public final class cmiv extends cmix {
    public final cmiu a;

    public cmiv(TrackGroup trackGroup, int[] iArr, cmiu cmiuVar) {
        super(trackGroup, iArr);
        this.a = cmiuVar;
    }

    public static void b(long[][][] jArr, int i, long[][] jArr2, int[] iArr) {
        long j = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= jArr.length) {
                break;
            }
            long[] jArr3 = jArr[i2][i];
            long j2 = jArr2[i2][iArr[i2]];
            jArr3[1] = j2;
            j += j2;
            i2++;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i][0] = j;
        }
    }

    @Override // defpackage.cmjm
    public final int a() {
        return 0;
    }
}
