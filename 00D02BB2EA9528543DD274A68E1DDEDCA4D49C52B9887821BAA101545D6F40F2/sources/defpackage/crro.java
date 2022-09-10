package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: crro  reason: default package */
/* loaded from: classes5.dex */
public final class crro extends crrx implements amyk {
    public final crrs a;
    public final EnumSet<dqvj> b;
    @dzsi
    public final String c;
    public final amyl d;
    public amub e;
    public boolean f;
    public int g;
    private final btrm o;
    private final int p;
    private final boolean q;
    private amuo r;
    private int s;

    public crro(btrm btrmVar, btwd btwdVar, bvrb bvrbVar, amyl amylVar, crrs crrsVar, amco amcoVar, EnumSet<dqvj> enumSet, @dzsi String str) {
        super(btwdVar, bvrbVar, amcoVar);
        this.a = crrsVar;
        this.o = btrmVar;
        this.b = enumSet;
        this.c = str;
        this.p = btwdVar.q();
        this.d = amylVar;
        boolean z = true;
        this.q = amcoVar.m() == akry.BASE;
        this.f = amylVar.d() <= 0 ? false : z;
    }

    @Override // defpackage.amyk
    public final void a() {
        dbsk.l(this.q);
        this.i.b(new Runnable(this) { // from class: crrn
            private final crro a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crro crroVar = this.a;
                boolean z = crroVar.d.d() > 0;
                if (crroVar.f != z) {
                    crroVar.f = z;
                    if (z) {
                        crroVar.f();
                    } else {
                        crroVar.i();
                    }
                }
            }
        }, bvrj.NAVIGATION_INTERNAL);
    }

    @Override // defpackage.crrx, defpackage.amcn
    public final /* bridge */ /* synthetic */ void b(alyh alyhVar, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
    }

    @Override // defpackage.crrx, defpackage.amcn
    public final /* bridge */ /* synthetic */ void c(alyh alyhVar, int i) {
    }

    @Override // defpackage.crrx
    public final void d() {
        this.j.h(this);
        btrm btrmVar = this.o;
        dceq a = dcet.a();
        a.b(crmi.class, new crrq(0, crmi.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crmj.class, new crrq(1, crmj.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crml.class, new crrq(2, crml.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crmn.class, new crrq(3, crmn.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crmh.class, new crrq(4, crmh.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crmk.class, new crrq(5, crmk.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
        if (this.q) {
            this.d.a(this);
        }
    }

    @Override // defpackage.crrx
    public final synchronized void e() {
        if (this.q) {
            this.d.b(this);
        }
        this.o.a(this);
        super.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.crrx
    public final void f() {
        if (this.e == null || this.r == null) {
            return;
        }
        this.a.a();
        this.a.c(this.e);
        this.a.d(this.r, this.s);
        h(this.p * 5);
    }

    public final void g(cray crayVar) {
        this.g = crayVar.e;
        amuo amuoVar = crayVar.b;
        int i = crayVar.d;
        if (amuoVar == null || i < 0) {
            return;
        }
        this.r = amuoVar;
        this.s = i;
        this.a.d(amuoVar, i);
        h(this.p);
    }

    public final void h(long j) {
        if (this.f || !this.q) {
            k();
            l(j);
        }
    }

    public final void i() {
        this.a.a();
    }

    @Override // defpackage.crrx
    @dzsi
    protected final alyh j() {
        return this.a.b();
    }
}
