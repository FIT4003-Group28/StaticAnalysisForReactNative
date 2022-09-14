package c.d.j.d;
/* loaded from: classes.dex */
public class m {

    /* loaded from: classes.dex */
    static class a implements r<c.d.b.a.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f3231a;

        a(n nVar) {
            this.f3231a = nVar;
        }

        @Override // c.d.j.d.r
        public void a() {
            this.f3231a.c();
        }

        @Override // c.d.j.d.r
        public void a(c.d.b.a.d dVar) {
            this.f3231a.c(dVar);
        }

        @Override // c.d.j.d.r
        public void b() {
            this.f3231a.b();
        }
    }

    public static o<c.d.b.a.d, c.d.d.g.g> a(h<c.d.b.a.d, c.d.d.g.g> hVar, n nVar) {
        nVar.b(hVar);
        return new o<>(hVar, new a(nVar));
    }
}
