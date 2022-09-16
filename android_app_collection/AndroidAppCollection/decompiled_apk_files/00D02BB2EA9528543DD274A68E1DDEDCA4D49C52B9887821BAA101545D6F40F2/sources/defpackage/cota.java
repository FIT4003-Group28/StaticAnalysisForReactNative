package defpackage;
/* compiled from: PG */
/* renamed from: cota  reason: default package */
/* loaded from: classes5.dex */
public final class cota {
    public static String a(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
