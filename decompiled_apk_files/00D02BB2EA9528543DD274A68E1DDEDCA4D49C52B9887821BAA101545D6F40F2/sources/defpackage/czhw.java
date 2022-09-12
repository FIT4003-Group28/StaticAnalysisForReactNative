package defpackage;
/* compiled from: PG */
/* renamed from: czhw  reason: default package */
/* loaded from: classes.dex */
public final class czhw {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int c(Object obj, int i) {
        return b(obj == null ? 0 : obj.hashCode(), i);
    }
}
