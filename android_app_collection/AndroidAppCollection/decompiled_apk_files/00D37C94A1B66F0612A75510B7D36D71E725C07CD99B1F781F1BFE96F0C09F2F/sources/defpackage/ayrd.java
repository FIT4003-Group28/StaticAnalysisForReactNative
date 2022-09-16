package defpackage;
/* compiled from: PG */
/* renamed from: ayrd  reason: default package */
/* loaded from: classes2.dex */
public final class ayrd {
    public static final aypy a = new ayrc();

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void c(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
