package c.d.d.g;
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private static d f2823a;

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f2823a == null) {
                f2823a = new d();
            }
            dVar = f2823a;
        }
        return dVar;
    }

    @Override // c.d.d.g.c
    public void a(b bVar) {
    }
}
