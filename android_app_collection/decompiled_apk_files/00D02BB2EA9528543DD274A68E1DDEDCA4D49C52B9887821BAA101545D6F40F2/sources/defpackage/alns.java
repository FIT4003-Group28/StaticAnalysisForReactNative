package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alns  reason: default package */
/* loaded from: classes.dex */
public final class alns implements akvy {
    static final akqn a;
    public static final akra b;
    public static final dmrt c;
    public static final aktw k;
    public final akvz d;
    public final amlm e;
    public final boolean f;
    public final boolean g;
    public dmyo h;
    public final aloc j;
    private final Map<dmqx, akuh> l = dcjz.d();
    public final Map<Bitmap, akuh> i = dcjz.d();

    static {
        akqu akquVar = new akqu();
        a = akquVar;
        b = new akra();
        dmrs dmrsVar = (dmrs) dmrt.k.bZ();
        dmos bZ = dmot.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmot dmotVar = (dmot) bZ.b;
        dmotVar.a |= 1;
        dmotVar.b = 14;
        dmmn bZ2 = dmmo.b.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmmo dmmoVar = (dmmo) bZ2.b;
        dsrf dsrfVar = dmmoVar.a;
        if (!dsrfVar.a()) {
            dmmoVar.a = dsqw.cg(dsrfVar);
        }
        dmmoVar.a.h(10);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmot dmotVar2 = (dmot) bZ.b;
        dmmo bK = bZ2.bK();
        bK.getClass();
        dmotVar2.d = bK;
        dmotVar2.a |= 4;
        if (dmrsVar.c) {
            dmrsVar.bF();
            dmrsVar.c = false;
        }
        dmrt dmrtVar = (dmrt) dmrsVar.b;
        dmot bK2 = bZ.bK();
        bK2.getClass();
        dmrtVar.c = bK2;
        dmrtVar.a |= 2;
        c = (dmrt) dmrsVar.bK();
        k = new aktw(dmpn.r, -1, akquVar, true);
    }

    public alns(akvz akvzVar, amlm amlmVar, aloc alocVar, boolean z, boolean z2, boolean z3) {
        this.d = akvzVar;
        this.e = amlmVar;
        this.j = alocVar;
        this.f = z;
        this.g = z2;
        this.h = z3 ? dmyo.ROADMAP_DARK : dmyo.ROADMAP;
    }

    public static boolean b(dmpn dmpnVar) {
        Object b2;
        dsqv<dmpn, dnay> dsqvVar = dmnl.z;
        dmpnVar.f(dsqvVar);
        Object l = dmpnVar.V.l(dsqvVar.d);
        if (l == null) {
            b2 = dsqvVar.b;
        } else {
            b2 = dsqvVar.b(l);
        }
        dniu dniuVar = ((dnay) b2).b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        int a2 = dnir.a(dniuVar.h);
        return a2 != 0 && a2 == 2;
    }

    public static dmpv d(dmpv dmpvVar) {
        dsqp dsqpVar = (dsqp) dmpvVar.cu(5);
        dsqpVar.bC(dmpvVar);
        dmpq dmpqVar = (dmpq) dsqpVar;
        if (dmpqVar.c) {
            dmpqVar.bF();
            dmpqVar.c = false;
        }
        dmpv dmpvVar2 = (dmpv) dmpqVar.b;
        dmpv dmpvVar3 = dmpv.s;
        dmpvVar2.a |= 1;
        dmpvVar2.b = -4251373;
        return dmpqVar.bK();
    }

    public static dmpv e(dmpv dmpvVar) {
        dsqp dsqpVar = (dsqp) dmpvVar.cu(5);
        dsqpVar.bC(dmpvVar);
        dmpq dmpqVar = (dmpq) dsqpVar;
        if (dmpqVar.c) {
            dmpqVar.bF();
            dmpqVar.c = false;
        }
        dmpv dmpvVar2 = (dmpv) dmpqVar.b;
        dmpv dmpvVar3 = dmpv.s;
        dmpvVar2.a |= 1;
        dmpvVar2.b = -1945278;
        return dmpqVar.bK();
    }

    public static dmph f(dmpd dmpdVar, int i) {
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.c(dmpdVar);
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.e = i;
        dmphVar.a |= 4;
        return (dmph) dmpeVar.bK();
    }

    public final akuh a(dmqx dmqxVar) {
        if (!this.l.containsKey(dmqxVar)) {
            this.l.put(dmqxVar, this.d.c(dmqxVar));
        }
        return this.l.get(dmqxVar);
    }

    public final void c(dmph dmphVar, boolean z, boolean z2, boolean z3, alno alnoVar, List<dmpd> list) {
        dmpv dmpvVar;
        for (dmpd dmpdVar : dmphVar.b) {
            if (alnoVar.d.e.a(dmpdVar, alnoVar.a, alnoVar.b, alnoVar.c).d() || dmpdVar.b.isEmpty()) {
                if (!alnoVar.a(dmpdVar) || !z3) {
                    list.add(dmpdVar);
                }
            } else if (alnoVar.d.e.a(dmpdVar, alnoVar.a, alnoVar.b, alnoVar.c).c() || !z) {
                list.add(dmpdVar);
            } else {
                alxo a2 = alnoVar.d.e.a(dmpdVar, alnoVar.a, alnoVar.b, alnoVar.c);
                if (a2.b()) {
                    alyf alyfVar = a2.q;
                    dmpq bZ = dmpv.s.bZ();
                    int a3 = alyfVar.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmpv dmpvVar2 = (dmpv) bZ.b;
                    dmpvVar2.a |= 1;
                    dmpvVar2.b = a3;
                    int b2 = alyfVar.b();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmpv dmpvVar3 = (dmpv) bZ.b;
                    dmpvVar3.a |= 2;
                    dmpvVar3.c = b2;
                    dmoa bZ2 = dmob.g.bZ();
                    int c2 = alyfVar.c();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmob dmobVar = (dmob) bZ2.b;
                    dmobVar.a |= 1;
                    dmobVar.b = c2;
                    int e = (int) ((alyfVar.e() * 100.0f) + 0.5f);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmob dmobVar2 = (dmob) bZ2.b;
                    dmobVar2.a |= 4;
                    dmobVar2.d = e;
                    int f = (int) ((alyfVar.f() * 1000.0f) + 0.5f);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmob dmobVar3 = (dmob) bZ2.b;
                    dmobVar3.a |= 8;
                    dmobVar3.e = f;
                    int d = (int) ((alyfVar.d() * 8.0f) + 0.5f);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmob dmobVar4 = (dmob) bZ2.b;
                    dmobVar4.a |= 32;
                    dmobVar4.f = d;
                    int g = alyfVar.g();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmob dmobVar5 = (dmob) bZ2.b;
                    dmobVar5.a |= 2;
                    dmobVar5.c = g;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmpv dmpvVar4 = (dmpv) bZ.b;
                    dmob bK = bZ2.bK();
                    bK.getClass();
                    dmpvVar4.e = bK;
                    dmpvVar4.a |= 4;
                    boolean h = alyfVar.h();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dmpv dmpvVar5 = (dmpv) bZ.b;
                    dmpvVar5.a |= 128;
                    dmpvVar5.j = h;
                    dmpvVar = bZ.bK();
                } else {
                    dmpvVar = dmpv.s;
                }
                dmpv dmpvVar6 = (dmpv) (z2 ? alng.a : alnh.a).a(dmpvVar);
                dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                dmoo dmooVar = (dmoo) dmop.h.bZ();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar = (dmop) dmooVar.b;
                int i = dmopVar.a | 1;
                dmopVar.a = i;
                dmopVar.b = 0;
                dmpvVar6.getClass();
                dmopVar.d = dmpvVar6;
                dmopVar.a = i | 4;
                dmqtVar.a(dmooVar);
                akuh a4 = a((dmqx) dmqtVar.bK());
                dsqp dsqpVar = (dsqp) dmpdVar.cu(5);
                dsqpVar.bC(dmpdVar);
                dmpc dmpcVar = (dmpc) dsqpVar;
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar2 = (dmpd) dmpcVar.b;
                int i2 = dmpdVar2.a & (-5);
                dmpdVar2.a = i2;
                dmpdVar2.d = -1L;
                dmpdVar2.a = i2 & (-9);
                dmpdVar2.e = 0;
                dmpcVar.j(dmqa.d);
                int a5 = a4.a();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar3 = (dmpd) dmpcVar.b;
                dmpdVar3.a |= 2;
                dmpdVar3.c = a5;
                list.add((dmpd) dmpcVar.bK());
            }
            z3 = false;
        }
    }

    @Override // defpackage.akvy
    public final void q(dmyo dmyoVar) {
        synchronized (this) {
            this.h = dmyoVar;
        }
    }
}
