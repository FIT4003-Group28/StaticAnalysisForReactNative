package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pvi  reason: default package */
/* loaded from: classes4.dex */
public abstract class pvi extends pvn {
    @Override // defpackage.pvn
    public final void a(Object obj) {
        pvh pvhVar = (pvh) obj;
    }

    @Override // defpackage.pvn
    public final pvo b(pke[] pkeVarArr, TrackGroupArray trackGroupArray, ppz ppzVar, pkt pktVar) {
        int length;
        int[] iArr;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int length2 = pkeVarArr.length + 1;
        int[] iArr2 = new int[length2];
        TrackGroup[][] trackGroupArr = new TrackGroup[length2];
        int[][][] iArr3 = new int[length2][];
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = trackGroupArray2.b;
            trackGroupArr[i2] = new TrackGroup[i3];
            iArr3[i2] = new int[i3];
        }
        int length3 = pkeVarArr.length;
        int[] iArr4 = new int[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            iArr4[i4] = pkeVarArr[i4].jE();
        }
        int i5 = 0;
        while (i5 < trackGroupArray2.b) {
            TrackGroup b = trackGroupArray2.b(i5);
            int b2 = pwl.b(b.a(i).l);
            int length4 = pkeVarArr.length;
            int i6 = 0;
            int i7 = 0;
            boolean z = true;
            while (true) {
                length = pkeVarArr.length;
                if (i6 >= length) {
                    break;
                }
                pke pkeVar = pkeVarArr[i6];
                int i8 = 0;
                while (i < b.a) {
                    i8 = Math.max(i8, pku.c(pkeVar.a(b.a(i))));
                    i++;
                }
                boolean z2 = iArr2[i6] == 0;
                if (i8 > i7) {
                    z = z2;
                    i7 = i8;
                    length4 = i6;
                } else if (i8 == i7 && b2 == 5 && !z && z2) {
                    i7 = i8;
                    length4 = i6;
                    z = true;
                }
                i6++;
                i = 0;
            }
            if (length4 == length) {
                iArr = new int[b.a];
            } else {
                pke pkeVar2 = pkeVarArr[length4];
                int[] iArr5 = new int[b.a];
                for (int i9 = 0; i9 < b.a; i9++) {
                    iArr5[i9] = pkeVar2.a(b.a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length4];
            trackGroupArr[length4][i10] = b;
            iArr3[length4][i10] = iArr;
            iArr2[length4] = i10 + 1;
            i5++;
            trackGroupArray2 = trackGroupArray;
            i = 0;
        }
        int length5 = pkeVarArr.length;
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[length5];
        String[] strArr = new String[length5];
        int[] iArr6 = new int[length5];
        int i11 = 0;
        while (true) {
            int length6 = pkeVarArr.length;
            if (i11 < length6) {
                int i12 = iArr2[i11];
                trackGroupArrayArr[i11] = new TrackGroupArray((TrackGroup[]) pxi.X(trackGroupArr[i11], i12));
                iArr3[i11] = (int[][]) pxi.X(iArr3[i11], i12);
                strArr[i11] = pkeVarArr[i11].d();
                iArr6[i11] = pkeVarArr[i11].R();
                i11++;
            } else {
                new TrackGroupArray((TrackGroup[]) pxi.X(trackGroupArr[length6], iArr2[length6]));
                pvh pvhVar = new pvh(iArr6, trackGroupArrayArr);
                Pair f = f(pvhVar, iArr3, iArr4);
                return new pvo((pkf[]) f.first, (pvf[]) f.second, pvhVar);
            }
        }
    }

    protected abstract Pair f(pvh pvhVar, int[][][] iArr, int[] iArr2);
}
