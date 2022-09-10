package defpackage;

import java.util.Arrays;
/* renamed from: awvz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class awvz {
    public static boolean a(awwb awwbVar, awwb awwbVar2) {
        awvv<?>[] a;
        if (awwbVar == awwbVar2) {
            return true;
        }
        for (awvv<?> awvvVar : awvv.a()) {
            if (!awwbVar.a(awvvVar).equals(awwbVar2.a(awvvVar)) || awwbVar.b(awvvVar) != awwbVar2.b(awvvVar) || awwbVar.c(awvvVar) != awwbVar2.c(awvvVar)) {
                return false;
            }
        }
        return true;
    }

    public static int b(awwb awwbVar) {
        Object[] objArr = new Object[awvv.a().length * 3];
        awvv<?>[] a = awvv.a();
        int length = a.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            awvv<?> awvvVar = a[i];
            int i3 = i2 + 1;
            objArr[i2] = awwbVar.a(awvvVar);
            int i4 = i3 + 1;
            objArr[i3] = Long.valueOf(awwbVar.b(awvvVar));
            objArr[i4] = awwbVar.c(awvvVar);
            i++;
            i2 = i4 + 1;
        }
        return Arrays.hashCode(objArr);
    }
}
