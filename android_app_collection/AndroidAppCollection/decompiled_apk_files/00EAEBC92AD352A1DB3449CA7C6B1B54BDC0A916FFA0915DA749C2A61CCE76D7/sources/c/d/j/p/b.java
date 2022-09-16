package c.d.j.p;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f3657a;

    /* renamed from: c.d.j.p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0091b {
    }

    /* loaded from: classes.dex */
    private static final class c implements InterfaceC0091b {
        private c() {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(String str);

        boolean b();
    }

    static {
        new c();
        f3657a = null;
    }

    private b() {
    }

    public static void a() {
        b().a();
    }

    public static void a(String str) {
        b().a(str);
    }

    private static d b() {
        if (f3657a == null) {
            synchronized (b.class) {
                if (f3657a == null) {
                    f3657a = new c.d.j.p.a();
                }
            }
        }
        return f3657a;
    }

    public static boolean c() {
        return b().b();
    }
}
