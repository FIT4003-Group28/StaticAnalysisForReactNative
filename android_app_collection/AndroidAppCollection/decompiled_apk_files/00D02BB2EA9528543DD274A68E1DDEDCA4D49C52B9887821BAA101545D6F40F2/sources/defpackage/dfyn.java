package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dfyn  reason: default package */
/* loaded from: classes6.dex */
public final class dfyn {
    public static List<String> a(String str, int i, int i2, int i3) {
        List<String> b = b(str, i, i3);
        if (i2 <= 0 || b.size() <= i2) {
            return b;
        }
        String[] split = dbtw.b(str, i).split("\n");
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < split.length && i4 < i2; i4++) {
            sb.append(split[i4]);
            sb.append(" ");
        }
        List<String> b2 = b(sb.toString(), i, i3);
        if (b2.size() > i2) {
            b2 = Arrays.asList(split).subList(0, i2);
        }
        if (b2.isEmpty()) {
            return b2;
        }
        int min = Math.min(i2, b2.size()) - 1;
        String str2 = b2.get(min);
        StringBuilder sb2 = new StringBuilder();
        if (str2.length() > 1 && str2.length() == i) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        sb2.append(str2);
        sb2.append((char) 8230);
        b2.set(min, sb2.toString());
        return b2;
    }

    public static List<String> b(String str, int i, int i2) {
        String[] split;
        int length;
        int i3;
        ArrayList arrayList = new ArrayList();
        if (i <= 0 || i2 <= 0 || (length = (split = str.split(" ")).length) == 0) {
            return arrayList;
        }
        if (length == 1) {
            if (str.length() <= i2) {
                arrayList.add(str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, i2);
                sb.append((char) 8230);
                arrayList.add(sb.toString());
            }
            return arrayList;
        }
        int[][] iArr = (int[][]) Array.newInstance(int.class, length, length);
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, length, length);
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            i = Math.max(i, split[i4].length());
        }
        int i5 = 0;
        while (i5 < length) {
            iArr[i5][i5] = i - split[i5].length();
            int i6 = i5 + 1;
            for (int i7 = i6; i7 < length; i7++) {
                int[] iArr5 = iArr[i5];
                iArr5[i7] = (iArr5[i7 - 1] - split[i7].length()) - 1;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = iArr[i8][i9];
                if (i10 < 0) {
                    iArr2[i8][i9] = Integer.MAX_VALUE;
                } else {
                    iArr2[i8][i9] = i10 < 46341 ? i10 * i10 : Integer.MAX_VALUE;
                }
            }
        }
        iArr3[0] = iArr2[0][0];
        for (int i11 = 1; i11 < length; i11++) {
            iArr3[i11] = Integer.MAX_VALUE;
            int i12 = iArr2[0][i11];
            if (i12 != Integer.MAX_VALUE) {
                iArr3[i11] = i12;
                iArr4[i11] = 0;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = iArr3[i13];
                if (i14 != Integer.MAX_VALUE) {
                    int i15 = i13 + 1;
                    int i16 = iArr2[i15][i11];
                    if (i16 != Integer.MAX_VALUE && (i3 = i16 + i14) < iArr3[i11]) {
                        iArr3[i11] = i3;
                        iArr4[i11] = i15;
                    }
                }
            }
        }
        c(iArr4, length, split, arrayList);
        return arrayList;
    }

    private static void c(int[] iArr, int i, String[] strArr, List<String> list) {
        int i2 = i - 1;
        int i3 = iArr[i2];
        if (i3 > 0) {
            c(iArr, i3, strArr, list);
        }
        StringBuilder sb = new StringBuilder();
        for (int i4 = iArr[i2]; i4 < i2; i4++) {
            sb.append(strArr[i4]);
            sb.append(" ");
        }
        sb.append(strArr[i2]);
        list.add(sb.toString());
    }
}
