package defpackage;
/* compiled from: PG */
/* renamed from: ejb  reason: default package */
/* loaded from: classes.dex */
final class ejb {
    public static void a(Class<?> cls, String str) {
        StringBuilder sb;
        Throwable b;
        StringBuilder sb2 = new StringBuilder(str.length() + 14);
        sb2.append("Prewarm ");
        sb2.append(str);
        sb2.append(" class");
        sb2.toString();
        try {
            b = b(cls.getName());
        } catch (Throwable th) {
            try {
                StringBuilder sb3 = new StringBuilder(str.length() + 22);
                sb3.append("Prewarm ");
                sb3.append(str);
                sb3.append(" class error: ");
                sb3.toString();
                bvoo.j(th);
                sb = new StringBuilder(str.length() + 14);
            } catch (Throwable th2) {
                StringBuilder sb4 = new StringBuilder(str.length() + 14);
                sb4.append("Prewarm ");
                sb4.append(str);
                sb4.append(" class");
                sb4.toString();
                throw th2;
            }
        }
        if (b != null) {
            throw b;
        }
        sb = new StringBuilder(str.length() + 14);
        sb.append("Prewarm ");
        sb.append(str);
        sb.append(" class");
        sb.toString();
    }

    @dzsi
    private static Throwable b(String str) {
        try {
            Class.forName(str);
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (ExceptionInInitializerError e2) {
            return e2;
        }
    }
}
