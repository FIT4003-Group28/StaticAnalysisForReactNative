package defpackage;
/* compiled from: PG */
/* renamed from: arlg  reason: default package */
/* loaded from: classes2.dex */
public final class arlg {
    public static final dspt a = dsuz.f();
    public final ff b;
    public final btrm c;
    public final czt d;
    public final czc e;
    public final crow f;
    public final arla i;
    public final arlk j;
    private final czj r;
    private final arle s;
    private final dxio<dbsg<arkd>> t;
    public final Object g = new Object();
    public final aou h = new e() { // from class: com.google.android.apps.gmm.navigation.arwalking.service.NavigationServiceObserver$ActivityLifecycleObserver
        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
            synchronized (arlg.this.g) {
                arlg arlgVar = arlg.this;
                arlgVar.n = arlgVar.d.a(czh.WALKING_NAVIGATION, czs.INERTIAL_FOREGROUND);
            }
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
            synchronized (arlg.this.g) {
                czv czvVar = arlg.this.n;
                dbsk.s(czvVar);
                czvVar.c();
                arlg.this.n = null;
            }
        }

        @Override // defpackage.f
        public final void f(m mVar) {
            synchronized (arlg.this.g) {
                arlg arlgVar = arlg.this;
                if (arlgVar.l) {
                    arlgVar.a();
                }
            }
        }
    };
    public boolean k = false;
    public boolean l = false;
    @dzsi
    public czv m = null;
    @dzsi
    public czv n = null;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public arlg(ff ffVar, btrm btrmVar, arkc arkcVar, czj czjVar, arle arleVar, crow crowVar, arla arlaVar, arlk arlkVar, dxio<dbsg<arkd>> dxioVar) {
        this.b = ffVar;
        this.c = btrmVar;
        this.r = czjVar;
        this.s = arleVar;
        this.f = crowVar;
        this.i = arlaVar;
        this.j = arlkVar;
        this.t = dxioVar;
        dbsg<czc> dbsgVar = arkcVar.a;
        dbsk.a(dbsgVar.a());
        this.e = dbsgVar.b();
        this.d = dbsgVar.b().b();
    }

    public final void a() {
        dbsk.l(this.l);
        if (this.k) {
            arlh.b(this.c, this);
            this.k = false;
        }
        this.l = false;
        dbsk.s(this.m);
        this.m.c();
        this.m = null;
    }

    public final void b() {
        if (this.l || !this.p || !this.o) {
            return;
        }
        if (this.q) {
            this.b.g.b(this.h);
            this.q = false;
        }
        czv czvVar = this.n;
        if (czvVar != null) {
            czvVar.c();
            this.n = null;
        }
        if (this.k) {
            arlh.b(this.c, this);
            this.k = false;
        }
        this.j.a();
        this.p = false;
        this.o = false;
        dbsk.m(this.t.a().a(), "Ending an AR navigation session without a launcher present should be impossible, as a launcher was necessary to launch the AR session in the first place.");
        this.t.a().b().e();
        arle arleVar = this.s;
        final czz czzVar = arleVar.e;
        if (czzVar != null) {
            arleVar.d.execute(new Runnable(czzVar) { // from class: arld
                private final czz a;

                {
                    this.a = czzVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    czz czzVar2 = this.a;
                    if (czzVar2.k()) {
                        czzVar2.e();
                    }
                    czzVar2.g();
                }
            });
            arleVar.e = null;
        }
        String b = this.d.b();
        this.r.b(czh.WALKING_NAVIGATION, this.e instanceof dap, b, new arlf(this));
    }
}
