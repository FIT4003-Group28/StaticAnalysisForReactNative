package defpackage;

import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
import com.google.android.apps.gmm.map.model.directions.LaneTurn;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: atnu  reason: default package */
/* loaded from: classes2.dex */
public final class atnu {
    public static dcdc<atno[]> a(List<LaneGuidance> list, int i) {
        boolean z;
        Iterator<LaneGuidance> it;
        atno[][] atnoVarArr;
        Iterator<LaneGuidance> it2;
        int i2;
        ArrayList a = dchl.a();
        Iterator<LaneGuidance> it3 = ((i <= 0 || list.size() <= i) ? list : atnp.c(list, i)).iterator();
        while (it3.hasNext()) {
            LaneGuidance next = it3.next();
            int i3 = 0;
            if (next == atnp.d) {
                atnoVarArr = (atno[][]) Array.newInstance(atno.class, 1, 1);
                atnoVarArr[0][0] = new atno(ateb.DOTS, false, false);
                it = it3;
            } else {
                int i4 = next.b;
                boolean z2 = i4 == 1 || i4 == 2;
                Iterator<LaneTurn> it4 = next.a.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (it4.next().a != doym.U_TURN) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                int i5 = 0;
                boolean z3 = true;
                int i6 = 0;
                for (LaneTurn laneTurn : next.a) {
                    if (laneTurn.a != doym.MERGE) {
                        if (laneTurn.a == doym.U_TURN && !z) {
                            if (z3 && z2) {
                                z = true;
                                z3 = true;
                            }
                        }
                        int intValue = atnp.b.get(laneTurn.a).intValue();
                        if (!laneTurn.b) {
                            intValue = 6 - intValue;
                        }
                        i5 |= 1 << intValue;
                        if (true == z3) {
                            i6 = intValue;
                        }
                        z3 = false;
                    } else {
                        bvoo.h("Merge turns should never happen!", new Object[0]);
                    }
                }
                int[] iArr = atnp.a[i5];
                int length = iArr.length;
                atno[][] atnoVarArr2 = new atno[length];
                if (i5 == 0) {
                    bvoo.h("Guidance resulted in empty turnMask: %s", next.toString());
                    atnoVarArr2[0] = atnp.e();
                    it = it3;
                } else {
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        int i9 = iArr[i7];
                        if (!z2 || (i9 & (7 << (i6 * 3))) != 0) {
                            for (int i10 = 0; i10 < 7; i10++) {
                                if ((i9 & (7 << (i10 * 3))) != 0) {
                                    i3++;
                                }
                            }
                            if (i3 == 0) {
                                bvoo.h("Invalid turn at index %d, attempt=0%o, turnMask=0x%x", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i5));
                                atnoVarArr2[i8] = atnp.e();
                                i8++;
                            } else {
                                atno[] atnoVarArr3 = new atno[i3];
                                atnoVarArr2[i8] = atnoVarArr3;
                                if ((i9 & (7 << (i6 * 3))) != 0) {
                                    it2 = it3;
                                    atnoVarArr3[0] = atnp.d(i6, i9, next.b == 1, z);
                                    i2 = 1;
                                } else {
                                    it2 = it3;
                                    i2 = 0;
                                }
                                for (int i11 = 0; i11 < 7; i11++) {
                                    if (i11 != i6 && (i9 & (7 << (i11 * 3))) != 0) {
                                        atnoVarArr2[i8][i2] = atnp.d(i11, i9, false, false);
                                        i2++;
                                    }
                                }
                                if (i3 != i2) {
                                    bvoo.h("Turn size counter out-of-sync: %d vs %d", Integer.valueOf(i3), Integer.valueOf(i2));
                                }
                                i8++;
                                i7++;
                                it3 = it2;
                                i3 = 0;
                            }
                        }
                        it2 = it3;
                        i7++;
                        it3 = it2;
                        i3 = 0;
                    }
                    it = it3;
                    if (i8 != length) {
                        atnoVarArr = (atno[][]) Arrays.copyOf(atnoVarArr2, i8);
                    }
                }
                atnoVarArr = atnoVarArr2;
            }
            a.add(atnoVarArr[0]);
            it3 = it;
        }
        return dcdc.r(a);
    }
}
