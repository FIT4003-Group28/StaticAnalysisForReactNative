package c.d.d.a;
/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private static c f2800a;

    private c() {
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f2800a == null) {
                f2800a = new c();
            }
            cVar = f2800a;
        }
        return cVar;
    }

    @Override // c.d.d.a.b
    public void a(a aVar) {
    }
}
