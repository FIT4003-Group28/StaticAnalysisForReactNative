package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
public final class kg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[Catch: NumberFormatException -> 0x00c7, LOOP:3: B:29:0x0074->B:48:0x00a4, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a9 A[Catch: NumberFormatException -> 0x00c7, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc A[Catch: NumberFormatException -> 0x00c7, TryCatch #0 {NumberFormatException -> 0x00c7, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0074, B:31:0x007a, B:35:0x0086, B:48:0x00a4, B:39:0x008f, B:43:0x0099, B:50:0x00a9, B:51:0x00b6, B:54:0x00bc, B:56:0x00c0), top: B:71:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kf[] a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg.a(java.lang.String):kf[]");
    }

    public static kf[] b(kf[] kfVarArr) {
        if (kfVarArr == null) {
            return null;
        }
        kf[] kfVarArr2 = new kf[kfVarArr.length];
        for (int i = 0; i < kfVarArr.length; i++) {
            kfVarArr2[i] = new kf(kfVarArr[i]);
        }
        return kfVarArr2;
    }

    public static boolean c(kf[] kfVarArr, kf[] kfVarArr2) {
        if (kfVarArr == null || kfVarArr2 == null || kfVarArr.length != kfVarArr2.length) {
            return false;
        }
        for (int i = 0; i < kfVarArr.length; i++) {
            kf kfVar = kfVarArr[i];
            char c = kfVar.a;
            kf kfVar2 = kfVarArr2[i];
            if (c != kfVar2.a || kfVar.b.length != kfVar2.b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float[] d(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    private static void e(ArrayList<kf> arrayList, char c, float[] fArr) {
        arrayList.add(new kf(c, fArr));
    }
}
