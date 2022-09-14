package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crrx  reason: default package */
/* loaded from: classes5.dex */
public abstract class crrx implements amcn {
    public final btwd h;
    final bvrb i;
    public final amco j;
    public boolean l;
    public int m;
    public int n;
    private final crrw a = new crrw(this);
    public boolean k = true;
    private boolean b = true;

    public crrx(btwd btwdVar, bvrb bvrbVar, amco amcoVar) {
        this.i = bvrbVar;
        this.j = amcoVar;
        this.h = btwdVar;
    }

    @Override // defpackage.amcn
    public void b(alyh alyhVar, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
    }

    @Override // defpackage.amcn
    public void c(alyh alyhVar, int i) {
    }

    public void d() {
        throw null;
    }

    public synchronized void e() {
        this.k = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f();

    @dzsi
    protected abstract alyh j();

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void k() {
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void l(long j) {
        if (this.k && this.b && !this.l && this.m <= 0) {
            if (j <= 4) {
                j = this.j.B();
                if (j == 0) {
                    this.n = 0;
                    int o = this.h.o();
                    for (int i = 0; i < o; i++) {
                        alyh j2 = j();
                        if (j2 == null) {
                            this.b = false;
                            return;
                        }
                        this.j.F(j2, this.a, 6);
                        this.m++;
                    }
                    return;
                }
            }
            this.i.a(new Runnable(this) { // from class: crru
                private final crrx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    crrx crrxVar = this.a;
                    crrxVar.l = false;
                    crrxVar.l(0L);
                }
            }, bvrj.NAVIGATION_INTERNAL, j);
            this.l = true;
        }
    }

    @Override // defpackage.amcn
    public final synchronized void m() {
        if (this.k) {
            this.i.b(new Runnable(this) { // from class: crrt
                private final crrx a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            }, bvrj.NAVIGATION_INTERNAL);
        }
    }
}
