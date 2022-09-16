package c.d.j.n;
/* loaded from: classes.dex */
public class v0 implements j0<c.d.j.k.d> {

    /* renamed from: a  reason: collision with root package name */
    private final w0<c.d.j.k.d>[] f3599a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends n<c.d.j.k.d, c.d.j.k.d> {

        /* renamed from: c  reason: collision with root package name */
        private final k0 f3600c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3601d;

        /* renamed from: e  reason: collision with root package name */
        private final c.d.j.e.e f3602e;

        public a(k<c.d.j.k.d> kVar, k0 k0Var, int i) {
            super(kVar);
            this.f3600c = k0Var;
            this.f3601d = i;
            this.f3602e = this.f3600c.f().l();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.j.k.d dVar, int i) {
            if (dVar != null && (b.b(i) || x0.a(dVar, this.f3602e))) {
                c().a(dVar, i);
            } else if (!b.a(i)) {
            } else {
                c.d.j.k.d.c(dVar);
                if (v0.this.a(this.f3601d + 1, c(), this.f3600c)) {
                    return;
                }
                c().a(null, 1);
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b(Throwable th) {
            if (!v0.this.a(this.f3601d + 1, c(), this.f3600c)) {
                c().a(th);
            }
        }
    }

    public v0(w0<c.d.j.k.d>... w0VarArr) {
        c.d.d.d.i.a(w0VarArr);
        this.f3599a = w0VarArr;
        c.d.d.d.i.a(0, this.f3599a.length);
    }

    private int a(int i, c.d.j.e.e eVar) {
        while (true) {
            w0<c.d.j.k.d>[] w0VarArr = this.f3599a;
            if (i < w0VarArr.length) {
                if (w0VarArr[i].a(eVar)) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, k<c.d.j.k.d> kVar, k0 k0Var) {
        int a2 = a(i, k0Var.f().l());
        if (a2 == -1) {
            return false;
        }
        this.f3599a[a2].a(new a(kVar, k0Var, a2), k0Var);
        return true;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.j.k.d> kVar, k0 k0Var) {
        if (k0Var.f().l() != null && a(0, kVar, k0Var)) {
            return;
        }
        kVar.a(null, 1);
    }
}
