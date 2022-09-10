package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: almu  reason: default package */
/* loaded from: classes.dex */
public final class almu implements akto {
    public dbsz<amko> a = almt.a;
    @dzsi
    public akxa b = null;
    public int c = 0;
    public boolean d = false;
    public final List<Runnable> e = dchl.a();
    private final bnsn f;
    private final akor g;
    private final aksp h;
    private final aktz i;
    private final akty j;
    private final akvz k;
    private final akvl l;
    private final alms m;
    private final alop n;

    public almu(akor akorVar, bnsn bnsnVar, alms almsVar, aksp akspVar, aktz aktzVar, akty aktyVar, akvz akvzVar, alop alopVar, akvl akvlVar) {
        this.f = bnsnVar;
        this.m = almsVar;
        this.h = akspVar;
        this.i = aktzVar;
        this.j = aktyVar;
        this.k = akvzVar;
        this.n = alopVar;
        this.l = akvlVar;
        this.g = akorVar;
    }

    @Override // defpackage.akto
    public final <ProtoT extends dssk> akti a(ProtoT protot, dmti dmtiVar) {
        alrk alrkVar = ((alrv) this.k).i;
        akty aktyVar = this.j;
        if (protot instanceof dmpn) {
            dmpn dmpnVar = (dmpn) protot;
            if ((dmpnVar.a & 4) != 0) {
                allu x = ((alom) aktyVar).x(dmpnVar, dmtiVar, alrkVar);
                this.j.f(x);
                return x;
            }
        }
        String valueOf = String.valueOf(protot.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Could not create a point label from ");
        sb.append(valueOf);
        sb.append(" type.");
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // defpackage.akto
    public final aksp b() {
        return this.h;
    }

    @Override // defpackage.akto
    public final aktz c() {
        return this.i;
    }

    @Override // defpackage.akto
    public final akty d() {
        return this.j;
    }

    @Override // defpackage.akto
    public final akvz e() {
        return this.k;
    }

    @Override // defpackage.akto
    public final void f(aktl aktlVar) {
        this.m.a(aktlVar);
    }

    @Override // defpackage.akto
    public final void g(aktm aktmVar) {
        this.m.b(aktmVar);
    }

    @Override // defpackage.akto
    public final aktm h() {
        return this.m.b;
    }

    @Override // defpackage.akto
    public final void i(int[] iArr) {
        this.m.c(iArr);
    }

    @Override // defpackage.akto
    public final void j(aktn aktnVar, akra akraVar) {
        bnul bnulVar = this.f.l;
        if (bnulVar != null) {
            if (aktnVar != aktn.TAP) {
                ((almp) bnulVar).n.a(new almn(aktn.LONG_PRESS, akraVar, false));
                return;
            } else {
                ((almp) bnulVar).b(akraVar);
                return;
            }
        }
        bvoo.i(new RuntimeException("GoogleMap.pick called with a null picker"));
    }

    @Override // defpackage.akto
    public final akvl k() {
        return this.l;
    }

    @Override // defpackage.akto
    public final boolean l() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    @Override // defpackage.akto
    public final alop m() {
        return this.n;
    }

    @Override // defpackage.akto
    public final allx n() {
        return new allx(this.g.a().ab());
    }

    public final void o(dmyo dmyoVar) {
        dcdc dcdcVar;
        dcdc r;
        dbsk.l(this.k != null);
        synchronized (this) {
            akvz akvzVar = this.k;
            dcdcVar = null;
            if (akvzVar != null && this.d) {
                int i = this.c;
                synchronized (((alrv) akvzVar).q) {
                    ((alrv) akvzVar).l = dmyoVar;
                    alwn a = alwn.a(dmyoVar);
                    if (((alrv) akvzVar).e.f(i, a)) {
                        ((alrv) akvzVar).n = i;
                        ((alrv) akvzVar).o = ((alrv) akvzVar).e.h(i, a);
                    }
                    if (((alrv) akvzVar).e.g(i)) {
                        ((alrv) akvzVar).p = ((alrv) akvzVar).e.i(i);
                    } else {
                        ((alrv) akvzVar).p = null;
                    }
                }
                synchronized (((alrv) akvzVar).m) {
                    r = dcdc.r(((alrv) akvzVar).m);
                }
                int size = r.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((akvy) r.get(i2)).q(dmyoVar);
                }
                dccx dccxVar = new dccx();
                dccxVar.i(this.e);
                dcdcVar = dccxVar.f();
                this.e.clear();
            }
        }
        if (dcdcVar != null) {
            int size2 = dcdcVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((Runnable) dcdcVar.get(i3)).run();
            }
        }
    }
}
