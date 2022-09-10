package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: atym  reason: default package */
/* loaded from: classes2.dex */
public final class atym {
    public final btrm a;
    private final akty g;
    private final akvz h;
    private boolean i;
    public final Object b = new Object();
    public final Map<akti, aryn> c = dcjz.d();
    public final Set<Long> d = dcnm.c();
    final dbsl<dmpn> e = new dbsl(this) { // from class: atyk
        private final atym a;

        {
            this.a = this;
        }

        @Override // defpackage.dbsl
        public final boolean a(Object obj) {
            atym atymVar = this.a;
            dmpn dmpnVar = (dmpn) obj;
            boolean z = false;
            if (dmpnVar != null && !akxf.F(dmpnVar).e) {
                long b = akxf.b(dmpnVar);
                synchronized (atymVar.b) {
                    z = atymVar.d.contains(Long.valueOf(b));
                }
            }
            return z;
        }
    };
    final Map<String, akuh> f = dcjz.d();
    private final akvo<aktd> j = new atyl(this);

    public atym(btrm btrmVar, akty aktyVar, akvz akvzVar) {
        this.a = btrmVar;
        this.g = aktyVar;
        this.h = akvzVar;
    }

    public final void a(@dzsi List<? extends aryn> list) {
        akuh a;
        String e;
        synchronized (this.b) {
            this.d.clear();
            b();
            if (list != null) {
                for (aryn arynVar : list) {
                    akty aktyVar = this.g;
                    if (arynVar.i()) {
                        synchronized (this.b) {
                            e = this.i ? arynVar.e() : arynVar.b();
                        }
                        if (!this.f.containsKey(e)) {
                            Map<String, akuh> map = this.f;
                            akvz akvzVar = this.h;
                            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
                            dmoo dmooVar = (dmoo) dmop.h.bZ();
                            if (dmooVar.c) {
                                dmooVar.bF();
                                dmooVar.c = false;
                            }
                            dmop dmopVar = (dmop) dmooVar.b;
                            dmopVar.a |= 1;
                            dmopVar.b = 0;
                            dmpq bZ = dmpv.s.bZ();
                            dmog dmogVar = (dmog) dmoh.h.bZ();
                            if (dmogVar.c) {
                                dmogVar.bF();
                                dmogVar.c = false;
                            }
                            dmoh dmohVar = (dmoh) dmogVar.b;
                            int i = dmohVar.a | 4;
                            dmohVar.a = i;
                            dmohVar.c = 4;
                            e.getClass();
                            dmohVar.a = i | 1;
                            dmohVar.b = e;
                            bZ.a(dmogVar);
                            if (dmooVar.c) {
                                dmooVar.bF();
                                dmooVar.c = false;
                            }
                            dmop dmopVar2 = (dmop) dmooVar.b;
                            dmpv bK = bZ.bK();
                            bK.getClass();
                            dmopVar2.d = bK;
                            dmopVar2.a |= 4;
                            dmqtVar.a(dmooVar);
                            map.put(e, akvzVar.c((dmqx) dmqtVar.bK()));
                        }
                        a = this.f.get(e);
                    } else {
                        a = this.h.a(arynVar.c());
                    }
                    dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                    dmpe dmpeVar = (dmpe) dmph.f.bZ();
                    dmpeVar.b(a.e());
                    if (dmpeVar.c) {
                        dmpeVar.bF();
                        dmpeVar.c = false;
                    }
                    dmph dmphVar = (dmph) dmpeVar.b;
                    dmphVar.e = 1;
                    dmphVar.a |= 4;
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar = (dmpn) dmpkVar.b;
                    dmph dmphVar2 = (dmph) dmpeVar.bK();
                    dmphVar2.getClass();
                    dmpnVar.b = dmphVar2;
                    dmpnVar.a |= 1;
                    dmlp bZ2 = dmlq.e.bZ();
                    dmls a2 = akxh.a(arynVar.f());
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dmlq dmlqVar = (dmlq) bZ2.b;
                    a2.getClass();
                    dmlqVar.b = a2;
                    dmlqVar.a |= 1;
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                    dmlq bK2 = bZ2.bK();
                    bK2.getClass();
                    dmpnVar2.d = bK2;
                    dmpnVar2.a |= 4;
                    akxf.H(dmpkVar, arynVar.g());
                    akuq j = akxf.j(dmpkVar);
                    if (j.c) {
                        j.bF();
                        j.c = false;
                    }
                    akus akusVar = (akus) j.b;
                    akus akusVar2 = akus.o;
                    akusVar.a |= 8192;
                    akusVar.e = true;
                    dmpkVar.k(akvj.a, j.bK());
                    if (dmpkVar.c) {
                        dmpkVar.bF();
                        dmpkVar.c = false;
                    }
                    dmpn dmpnVar3 = (dmpn) dmpkVar.b;
                    dmpnVar3.a |= 32;
                    dmpnVar3.g = 3;
                    akti c = aktyVar.c((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                    this.g.f(c);
                    this.c.put(c, arynVar);
                    c.Pt(this.j);
                    this.d.add(Long.valueOf(arynVar.g().c));
                }
                this.g.i(this.e);
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            for (akti aktiVar : this.c.keySet()) {
                this.g.g(aktiVar);
                this.g.e(aktiVar);
            }
            this.c.clear();
            this.g.j(this.e);
        }
    }

    public final void c() {
        synchronized (this.b) {
            for (akuh akuhVar : this.f.values()) {
                this.h.j(akuhVar);
            }
            this.f.clear();
        }
    }

    public final void d(boolean z, List<? extends aryn> list) {
        synchronized (this.b) {
            if (this.i != z) {
                this.i = z;
                a(list);
            }
        }
    }
}
