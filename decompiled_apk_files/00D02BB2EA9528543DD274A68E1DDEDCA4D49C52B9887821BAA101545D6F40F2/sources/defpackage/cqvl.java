package defpackage;
/* compiled from: PG */
/* renamed from: cqvl  reason: default package */
/* loaded from: classes.dex */
public final class cqvl {
    public static boolean a(Object obj) {
        return !b(obj);
    }

    public static boolean b(Object obj) {
        if (obj instanceof cqur) {
            return ((cqur) obj).NJ();
        }
        return obj instanceof cqtu;
    }

    public static boolean c(Object... objArr) {
        for (Object obj : objArr) {
            if (b(obj)) {
                return true;
            }
        }
        return false;
    }
}
