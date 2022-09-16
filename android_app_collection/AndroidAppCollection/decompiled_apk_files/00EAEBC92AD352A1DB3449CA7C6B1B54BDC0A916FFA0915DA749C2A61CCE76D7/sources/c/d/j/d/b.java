package c.d.j.d;
/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    static class a implements r<c.d.b.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f3183a;

        a(n nVar) {
            this.f3183a = nVar;
        }

        @Override // c.d.j.d.r
        public void a() {
            this.f3183a.d();
        }

        @Override // c.d.j.d.r
        public void a(c.d.b.a.d dVar) {
            this.f3183a.a(dVar);
        }

        @Override // c.d.j.d.r
        public void b() {
            this.f3183a.g();
        }
    }

    public static o<c.d.b.a.d, c.d.j.k.b> a(h<c.d.b.a.d, c.d.j.k.b> hVar, n nVar) {
        nVar.a(hVar);
        return new o<>(hVar, new a(nVar));
    }
}
