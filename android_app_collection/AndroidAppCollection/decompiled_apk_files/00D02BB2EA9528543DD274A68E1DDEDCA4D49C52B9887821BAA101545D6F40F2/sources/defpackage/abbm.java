package defpackage;
/* compiled from: PG */
/* renamed from: abbm  reason: default package */
/* loaded from: classes2.dex */
public final class abbm implements abbl {
    private final abam b;
    private final abbh c;
    private String d = "";
    private boolean e = false;
    private Runnable f = deic.a;
    @dzsi
    private abbg g = null;
    @dzsi
    private ditt h = null;
    @dzsi
    private abbe i = null;
    private boolean j = false;
    public boolean a = false;
    private boolean k = false;
    private boolean l = false;

    public abbm(abam abamVar, abbh abbhVar) {
        this.b = abamVar;
        this.c = abbhVar;
    }

    private static diwb g(ditt dittVar) {
        diug diugVar = (diug) diwb.U.bZ();
        String str = dittVar.c;
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar = (diwb) diugVar.b;
        str.getClass();
        int i = diwbVar.a | 1;
        diwbVar.a = i;
        diwbVar.c = str;
        dittVar.getClass();
        diwbVar.e = dittVar;
        diwbVar.a = i | 4;
        return (diwb) diugVar.bK();
    }

    @Override // defpackage.abbl
    public final void a(abbk abbkVar) {
        this.d = abbkVar.a();
        this.e = abbkVar.b();
        this.f = abbkVar.c();
        ditt f = this.b.f(this.d);
        this.h = f;
        if (f != null) {
            abbe g = abbe.g(g(f));
            this.i = g;
            abbg a = this.c.a(g, this.f);
            this.g = a;
            a.a();
        }
    }

    @Override // defpackage.abbl
    public final void b() {
        this.b.g();
        abbg abbgVar = this.g;
        if (abbgVar != null) {
            abbgVar.c();
            this.g = null;
        }
    }

    @Override // defpackage.abbl
    public final void c(diwb diwbVar) {
        ditt dittVar = this.h;
        boolean z = false;
        if (dittVar != null) {
            long j = dittVar.m;
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            if (j == dittVar2.m) {
                dsqp dsqpVar = (dsqp) diwbVar.cu(5);
                dsqpVar.bC(diwbVar);
                diug diugVar = (diug) dsqpVar;
                if (diugVar.c) {
                    diugVar.bF();
                    diugVar.c = false;
                }
                diwb diwbVar2 = (diwb) diugVar.b;
                dittVar.getClass();
                diwbVar2.e = dittVar;
                diwbVar2.a |= 4;
                diwbVar = (diwb) diugVar.bK();
            }
        }
        abbe g = abbe.g(diwbVar);
        abbe abbeVar = this.i;
        if (abbeVar == null || !g.equals(abbeVar)) {
            abbg abbgVar = this.g;
            if (abbgVar != null) {
                abbgVar.c();
            }
            abbg a = this.c.a(g, this.f);
            this.g = a;
            a.a();
        }
        this.j = true;
        if ((diwbVar.a & 16) != 0) {
            z = true;
        }
        this.l = z;
        f();
    }

    @Override // defpackage.abbl
    public final void d(ditt dittVar) {
        c(g(dittVar));
    }

    @Override // defpackage.abbl
    public final void e() {
        abbg abbgVar = this.g;
        if (abbgVar != null) {
            abbgVar.b();
        }
    }

    public final void f() {
        if ((this.l || (!this.e && !this.k)) && this.j && this.a) {
            this.k = true;
            abbg abbgVar = this.g;
            dbsk.s(abbgVar);
            abbgVar.b();
        }
    }
}
