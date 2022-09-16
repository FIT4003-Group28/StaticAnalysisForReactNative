package defpackage;
/* compiled from: PG */
/* renamed from: cnxi  reason: default package */
/* loaded from: classes5.dex */
public final class cnxi {
    public static <T> boolean a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (!cnvv.a(tArr[i], t)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }
}
