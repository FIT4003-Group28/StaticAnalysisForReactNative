package defpackage;

import android.app.Application;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aukz  reason: default package */
/* loaded from: classes2.dex */
public final class aukz implements cvtj {
    private final auoi a;
    private final aulh b;
    private final ault c;
    private final dxio<akfa> d;
    private final dxio<aukk> e;
    private final dxio<aump> f;
    private final dxio<auua> g;
    private final auhn h;
    private final auhs i;
    private final aula j;

    public aukz(auoi auoiVar, aulh aulhVar, ault aultVar, dxio<akfa> dxioVar, dxio<aukk> dxioVar2, dxio<aump> dxioVar3, dxio<auua> dxioVar4, auhn auhnVar, auhs auhsVar, aula aulaVar) {
        this.a = auoiVar;
        this.b = aulhVar;
        this.c = aultVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = dxioVar4;
        this.h = auhnVar;
        this.i = auhsVar;
        this.j = aulaVar;
    }

    private static dlfy d(aumo aumoVar, dlge dlgeVar, String str) {
        dlfy bZ = dlgf.l.bZ();
        dplx d = aumoVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlgf dlgfVar = (dlgf) bZ.b;
        d.getClass();
        dlgfVar.f = d;
        int i = dlgfVar.a | 16;
        dlgfVar.a = i;
        dlgeVar.getClass();
        dlgfVar.j = dlgeVar;
        int i2 = i | 128;
        dlgfVar.a = i2;
        str.getClass();
        dlgfVar.a = i2 | 1;
        dlgfVar.b = str;
        dlgf dlgfVar2 = (dlgf) bZ.b;
        dlgfVar2.h = 4;
        dlgfVar2.a |= 32;
        return bZ;
    }

    @Override // defpackage.cvtj
    public final void a(@dzsi cvkc cvkcVar, cvkj cvkjVar, ib ibVar) {
        cjsa cjsaVar;
        boolean z;
        aulr j;
        dbsg<aule> a = this.b.a(cvkcVar, cvkjVar);
        if (!a.a()) {
            return;
        }
        aule b = a.b();
        aujb a2 = b.a();
        String str = null;
        String c = cvkcVar != null ? cvkcVar.c() : null;
        btlu n = !dbsj.d(c) ? this.d.a().n(c) : null;
        dsch d = cvkjVar.d();
        pas a3 = pek.a(d == null ? dsch.v : d);
        pat bZ = pau.f.bZ();
        String e = dbsj.e(c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pau pauVar = (pau) bZ.b;
        e.getClass();
        pauVar.a |= 1;
        pauVar.b = e;
        long longValue = cvkjVar.b().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pau pauVar2 = (pau) bZ.b;
        pauVar2.a |= 2;
        pauVar2.c = longValue;
        String b2 = b.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        pau pauVar3 = (pau) bZ.b;
        b2.getClass();
        pauVar3.a |= 4;
        pauVar3.d = b2;
        pau pauVar4 = (pau) bZ.b;
        pauVar4.e = 2;
        pauVar4.a |= 8;
        pau bK = bZ.bK();
        if (this.h.a(n, a2.a)) {
            cjsaVar = this.h.b(b.c().b().f(), b.c().a(), b.c().c().d, b.c().c().e, b.g().a() && b.g().b().d());
        } else {
            cjsaVar = null;
        }
        aula aulaVar = this.j;
        String a4 = cvkjVar.a();
        String b3 = cvkcVar == null ? "" : cvkcVar.b();
        aula.a(ibVar, 1);
        aula.a(b, 2);
        aula.a(a4, 3);
        aula.a(b3, 4);
        aula.a(bK, 6);
        dxio a5 = ((dxjh) aulaVar.a).a();
        aula.a(a5, 8);
        aunx a6 = aulaVar.b.a();
        String str2 = b3;
        aula.a(a6, 9);
        auhz a7 = aulaVar.c.a();
        aula.a(a7, 10);
        auso a8 = aulaVar.d.a();
        aula.a(a8, 11);
        ault a9 = aulaVar.e.a();
        aula.a(a9, 12);
        Application a10 = aulaVar.f.a();
        aula.a(a10, 13);
        btlu btluVar = n;
        String str3 = c;
        auky aukyVar = new auky(ibVar, b, a4, str2, n, bK, cjsaVar, a5, a6, a7, a8, a9, a10);
        aukyVar.P(this.a.a(str3, a3, b.f()), str3);
        auhr a11 = this.i.a(a2);
        if (a11 != null) {
            a11.a(aukyVar, bK, a3, b.f());
        }
        if (ako.a()) {
            this.e.a().a(false);
            if (d != null) {
                auir a12 = a2.a();
                int a13 = dsbt.a(d.k);
                if (a13 == 0) {
                    a13 = 1;
                }
                int i = -1;
                int i2 = a13 - 1;
                z = true;
                if (i2 == 1) {
                    i = 1;
                } else if (i2 != 2) {
                    i = i2 != 3 ? i2 != 4 ? 0 : -2 : 2;
                }
                str = a12.b(i);
            } else {
                z = true;
            }
            if (str == null) {
                str = "OtherChannel";
            }
            ibVar.G = str;
        } else {
            z = true;
        }
        auuh c2 = auuh.c(b.c().b().f(), b.c().a());
        aulu e2 = this.c.e(c2);
        if (e2 != null) {
            j = e2.i();
        } else {
            j = aulu.j();
            j.a = c2;
        }
        j.b = cvkjVar.a();
        if (cvkcVar != null) {
            j.c = cvkcVar.b();
        }
        this.c.a(c2, j.a());
        a2.s(btluVar, b.f(), z);
    }

    @Override // defpackage.cvtj
    public final List<cvkg> b(@dzsi cvkc cvkcVar, cvkj cvkjVar, List<cvkg> list) {
        dlfv b;
        aujb d;
        ArrayList arrayList;
        dbsg i;
        dbsg<dlfv> e = aulh.e(cvkjVar);
        if (e.a() && (d = this.b.d((b = e.b()))) != null) {
            String c = cvkcVar != null ? cvkcVar.c() : null;
            btlu n = !dbsj.d(c) ? this.d.a().n(c) : null;
            ArrayList arrayList2 = new ArrayList(list);
            aumq b2 = this.f.a().b(d, null, null, null);
            if (!this.f.a().c(d, arrayList2.size()) || b2 == null) {
                aumo a = this.f.a().a(d.a, null);
                if (a != null) {
                    int size = arrayList2.size();
                    AbstractCollection abstractCollection = arrayList2;
                    if (size < 2) {
                        String a2 = cjrx.a(a.e().b().a);
                        dccx F = dcdc.F();
                        F.i(arrayList2);
                        cvjw m = cvkg.m();
                        m.c(a.a());
                        m.g(a.b());
                        m.b("GMM_ACTION_SURVEY_FEEDBACK");
                        dsoj bZ = dsok.c.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ((dsok) bZ.b).a = "type.googleapis.com/gmm.notifications.GenericNotificationaGMMAction";
                        dlfy bZ2 = dlgf.l.bZ();
                        dplx d2 = a.d();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlgf dlgfVar = (dlgf) bZ2.b;
                        d2.getClass();
                        dlgfVar.f = d2;
                        dlgfVar.a |= 16;
                        dlgf dlgfVar2 = (dlgf) bZ2.b;
                        dlgfVar2.h = 2;
                        int i2 = dlgfVar2.a | 32;
                        dlgfVar2.a = i2;
                        a2.getClass();
                        dlgfVar2.a = i2 | 1;
                        dlgfVar2.b = a2;
                        dspd bR = bZ2.bK().bR();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bR.getClass();
                        ((dsok) bZ.b).b = bR;
                        m.a = bZ.bK();
                        F.g(m.a());
                        abstractCollection = F.f();
                    }
                    arrayList = new ArrayList(abstractCollection);
                } else {
                    arrayList = arrayList2;
                }
            } else {
                String str = b.e;
                aumo a3 = b2.a();
                aumo b3 = b2.b();
                dbsg<ddoz> e2 = this.f.a().e(d);
                if (!e2.a()) {
                    i = dbpy.a;
                } else {
                    dlgb bZ3 = dlge.c.bZ();
                    int a4 = dlgd.a(e2.b().d);
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dlge dlgeVar = (dlge) bZ3.b;
                    int i3 = a4 - 1;
                    if (a4 == 0) {
                        throw null;
                    }
                    dlgeVar.b = i3;
                    dlgeVar.a |= 1;
                    i = dbsg.i(bZ3.bK());
                }
                AbstractCollection abstractCollection2 = arrayList2;
                if (i.a()) {
                    dccx F2 = dcdc.F();
                    int size2 = arrayList2.size() - this.f.a().d(d, arrayList2.size());
                    for (int i4 = 0; i4 < size2; i4++) {
                        F2.g((cvkg) arrayList2.get(i4));
                    }
                    cvjw m2 = cvkg.m();
                    m2.c(a3.a());
                    m2.g(a3.b());
                    m2.b("GMM_ACTION_USEFUL_FEEDBACK");
                    dsoj bZ4 = dsok.c.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ((dsok) bZ4.b).a = "type.googleapis.com/gmm.notifications.GenericNotificationaGMMAction";
                    dlfy d3 = d(a3, (dlge) i.b(), str);
                    if (d3.c) {
                        d3.bF();
                        d3.c = false;
                    }
                    dlgf dlgfVar3 = (dlgf) d3.b;
                    dlgf dlgfVar4 = dlgf.l;
                    dlgfVar3.i = 1;
                    dlgfVar3.a |= 64;
                    dspd bR2 = d3.bK().bR();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    bR2.getClass();
                    ((dsok) bZ4.b).b = bR2;
                    m2.a = bZ4.bK();
                    F2.g(m2.a());
                    cvjw m3 = cvkg.m();
                    m3.c(b3.a());
                    m3.g(b3.b());
                    m3.b("GMM_ACTION_NOT_USEFUL_FEEDBACK");
                    dsoj bZ5 = dsok.c.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    ((dsok) bZ5.b).a = "type.googleapis.com/gmm.notifications.GenericNotificationaGMMAction";
                    dlfy d4 = d(b3, (dlge) i.b(), str);
                    if (d4.c) {
                        d4.bF();
                        d4.c = false;
                    }
                    dlgf dlgfVar5 = (dlgf) d4.b;
                    dlgfVar5.i = 2;
                    dlgfVar5.a |= 64;
                    dspd bR3 = d4.bK().bR();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    bR3.getClass();
                    ((dsok) bZ5.b).b = bR3;
                    m3.a = bZ5.bK();
                    F2.g(m3.a());
                    abstractCollection2 = F2.f();
                }
                arrayList = new ArrayList(abstractCollection2);
            }
            if (this.g.a().a(n, d, arrayList, aukw.a, aukx.a)) {
                autz b4 = this.g.a().b(n, d, dbpy.a, dbsg.i(b.e));
                cvjw m4 = cvkg.m();
                m4.c(b4.a());
                m4.g(b4.b());
                m4.b("GMM_ACTION_OPT_OUT");
                dsoj bZ6 = dsok.c.bZ();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                ((dsok) bZ6.b).a = "type.googleapis.com/gmm.notifications.GenericNotificationaGMMAction";
                dlfy bZ7 = dlgf.l.bZ();
                dplx c2 = b4.c();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dlgf dlgfVar6 = (dlgf) bZ7.b;
                c2.getClass();
                dlgfVar6.f = c2;
                dlgfVar6.a |= 16;
                dlgf dlgfVar7 = (dlgf) bZ7.b;
                dlgfVar7.i = 3;
                dlgfVar7.a |= 64;
                String c3 = b4.e().c("");
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dlgf dlgfVar8 = (dlgf) bZ7.b;
                c3.getClass();
                dlgfVar8.a |= 1;
                dlgfVar8.b = c3;
                int f = b4.f();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dlgf dlgfVar9 = (dlgf) bZ7.b;
                int i5 = f - 1;
                if (f == 0) {
                    throw null;
                }
                dlgfVar9.h = i5;
                dlgfVar9.a |= 32;
                dspd bR4 = bZ7.bK().bR();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                bR4.getClass();
                ((dsok) bZ6.b).b = bR4;
                m4.a = bZ6.bK();
                arrayList.add(m4.a());
            }
            return arrayList;
        }
        return list;
    }

    @Override // defpackage.cvtj
    public final void c() {
    }
}
