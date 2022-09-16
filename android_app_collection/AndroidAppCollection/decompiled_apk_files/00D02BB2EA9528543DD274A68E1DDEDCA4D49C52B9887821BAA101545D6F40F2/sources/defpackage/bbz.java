package defpackage;
/* compiled from: PG */
/* renamed from: bbz  reason: default package */
/* loaded from: classes3.dex */
public abstract class bbz {
    private static bbz a;

    public static synchronized void d(bbz bbzVar) {
        synchronized (bbz.class) {
            a = bbzVar;
        }
    }

    public static synchronized bbz e() {
        bbz bbzVar;
        synchronized (bbz.class) {
            if (a == null) {
                a = new bby(3);
            }
            bbzVar = a;
        }
        return bbzVar;
    }

    public static void f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        sb.toString();
    }

    public abstract void a(Throwable... thArr);

    public abstract void b(Throwable... thArr);

    public abstract void c(Throwable... thArr);
}
