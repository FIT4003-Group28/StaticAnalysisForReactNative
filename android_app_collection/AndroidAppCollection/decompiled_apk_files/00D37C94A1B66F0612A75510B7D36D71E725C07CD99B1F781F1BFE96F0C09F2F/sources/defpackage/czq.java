package defpackage;
/* compiled from: PG */
/* renamed from: czq  reason: default package */
/* loaded from: classes3.dex */
public final class czq {
    public static volatile czp a;

    private czq() {
    }

    public static void a(int i, String str, String str2) {
        c().a(i, str, str2);
    }

    public static void b(String str, String str2) {
        c().b(2, str, str2);
    }

    private static czp c() {
        if (a == null) {
            synchronized (czq.class) {
                if (a == null) {
                    a = new czx();
                }
            }
        }
        return a;
    }
}
