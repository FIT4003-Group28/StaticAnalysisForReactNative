package defpackage;

import android.content.res.Resources;
import com.google.ar.core.ImageMetadata;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cabd  reason: default package */
/* loaded from: classes4.dex */
public class cabd implements cafc {
    private final Map<dkcp, cabh> a = new EnumMap(dkcp.class);
    private final cabi b;
    private final cafb c;
    private final cqqw d;
    private final Map<dkcp, cavf<?>> e;
    private final caek f;
    @dzsi
    private final cacc g;
    private final boolean h;
    private final cabc i;
    @dzsi
    private dkcp j;

    public cabd(dzsj<cael> dzsjVar, cabi cabiVar, cacd cacdVar, cbqg cbqgVar, cafb cafbVar, cqqw cqqwVar, Map<dkcp, cavf<?>> map, cabc cabcVar) {
        this.b = cabiVar;
        this.c = cafbVar;
        this.h = cbqgVar.a();
        this.d = cqqwVar;
        this.e = map;
        this.i = cabcVar;
        cael a = dzsjVar.a();
        dzsj<cady> dzsjVar2 = a.a;
        dzsj<cabt> dzsjVar3 = a.b;
        dzsj<caeo> dzsjVar4 = a.c;
        dzsj<caeq> dzsjVar5 = a.d;
        dzsj<caez> dzsjVar6 = a.e;
        dzsj<blpp> dzsjVar7 = a.f;
        dzsj<cjnx> dzsjVar8 = a.g;
        dzsj<bsvm> dzsjVar9 = a.h;
        dzsj<caym> dzsjVar10 = a.i;
        Resources a2 = a.j.a();
        cael.a(a2, 10);
        btrm a3 = a.k.a();
        cael.a(a3, 11);
        bvrb a4 = a.l.a();
        cael.a(a4, 12);
        bvjj a5 = a.m.a();
        cael.a(a5, 13);
        cabg a6 = a.n.a();
        cael.a(a6, 14);
        btvo a7 = a.o.a();
        cael.a(a7, 15);
        cbqg a8 = a.p.a();
        cael.a(a8, 16);
        gga a9 = a.q.a();
        cael.a(a9, 17);
        cafi a10 = a.r.a();
        cael.a(a10, 18);
        chnm a11 = a.s.a();
        cael.a(a11, 19);
        cael.a(cqqwVar, 20);
        cael.a(cabcVar, 21);
        this.f = new caek(dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, dzsjVar7, dzsjVar8, dzsjVar9, dzsjVar10, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, cqqwVar, cabcVar);
        gga a12 = cacdVar.a.a();
        cacd.a(a12, 1);
        cafi a13 = cacdVar.b.a();
        cacd.a(a13, 2);
        cqhn a14 = cacdVar.c.a();
        cacd.a(a14, 3);
        caui a15 = cacdVar.d.a();
        cacd.a(a15, 4);
        dzsj<caez> dzsjVar11 = cacdVar.e;
        btvo a16 = cacdVar.f.a();
        cacd.a(a16, 6);
        cacd.a(cqqwVar, 7);
        cacd.a(cabcVar, 8);
        this.g = new cacc(a12, a13, a14, a15, dzsjVar11, a16, cqqwVar, cabcVar);
        this.j = null;
    }

    public void a(dwul dwulVar) {
        int i;
        cabd cabdVar = this;
        dwul dwulVar2 = dwulVar;
        cabdVar.j = null;
        cabdVar.a.clear();
        int i2 = 0;
        while (i2 < dwulVar2.d.size()) {
            dkcq dkcqVar = dwulVar2.d.get(i2);
            int i3 = 1;
            boolean z = true;
            if ((dkcqVar.a & 1) != 0) {
                dkcp b = dkcp.b(dkcqVar.b);
                if (b == null) {
                    b = dkcp.UNKNOWN_TAB_TYPE;
                }
                if (dkcqVar.d) {
                    cabdVar.j = b;
                }
                int i4 = 2;
                if (b == dkcp.CONTRIBUTE) {
                    dori doriVar = dwulVar2.b;
                    if (doriVar == null) {
                        doriVar = dori.l;
                    }
                    if ((doriVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                        dori doriVar2 = dwulVar2.b;
                        if (doriVar2 == null) {
                            doriVar2 = dori.l;
                        }
                        dqwa dqwaVar = doriVar2.j;
                        if (dqwaVar == null) {
                            dqwaVar = dqwa.g;
                        }
                        Iterator<dqvu> it = dqwaVar.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            dqvu next = it.next();
                            int a = dqvt.a(next.b);
                            if (a != 0 && a == 2) {
                                caek caekVar = cabdVar.f;
                                if (next.e <= 0) {
                                    z = false;
                                }
                                caekVar.U(z);
                            }
                        }
                    }
                } else if (b == dkcp.QA) {
                    cacc caccVar = cabdVar.g;
                    caccVar.c.clear();
                    caccVar.h = "";
                    HashMap hashMap = new HashMap();
                    dcdc<cauj> dcdcVar = caccVar.e;
                    int size = dcdcVar.size();
                    int i5 = 0;
                    while (i5 < size) {
                        cauj caujVar = dcdcVar.get(i5);
                        EnumMap<cauj, cauh> enumMap = caccVar.c;
                        caui cauiVar = caccVar.b;
                        dori doriVar3 = dwulVar2.b;
                        if (doriVar3 == null) {
                            doriVar3 = dori.l;
                        }
                        bvev a2 = cauiVar.a.a();
                        caui.a(a2, i3);
                        Executor a3 = cauiVar.b.a();
                        caui.a(a3, i4);
                        cauv a4 = cauiVar.c.a();
                        caui.a(a4, 3);
                        caui.a(caccVar, 4);
                        caui.a(caujVar, 5);
                        caui.a(doriVar3, 6);
                        caui.a(hashMap, 7);
                        enumMap.put((EnumMap<cauj, cauh>) caujVar, (cauj) new cauh(a2, a3, a4, caccVar, caujVar, doriVar3, hashMap));
                        i5++;
                        i3 = 1;
                        i4 = 2;
                    }
                    caccVar.f = caccVar.c.get(cauj.QUESTIONS_AND_ANSWERS);
                    dori doriVar4 = dwulVar2.b;
                    if (doriVar4 == null) {
                        doriVar4 = dori.l;
                    }
                    caccVar.g = new cacb(caccVar, doriVar4);
                } else {
                    Map<dkcp, cabh> map = cabdVar.a;
                    cabi cabiVar = cabdVar.b;
                    cafb cafbVar = cabdVar.c;
                    cqqw cqqwVar = cabdVar.d;
                    cavf<?> cavfVar = cabdVar.e.get(b);
                    dori doriVar5 = dwulVar2.b;
                    if (doriVar5 == null) {
                        doriVar5 = dori.l;
                    }
                    boolean z2 = doriVar5.g;
                    cabc cabcVar = cabdVar.i;
                    bvjj a5 = cabiVar.a.a();
                    cabi.a(a5, 1);
                    cafi a6 = cabiVar.b.a();
                    cabi.a(a6, 2);
                    dxio a7 = ((dxjh) cabiVar.c).a();
                    cabi.a(a7, 3);
                    dzsj<cagk> dzsjVar = cabiVar.d;
                    cavc a8 = cabiVar.e.a();
                    cabi.a(a8, 5);
                    cave a9 = cabiVar.f.a();
                    cabi.a(a9, 6);
                    dzsj<caez> dzsjVar2 = cabiVar.g;
                    dxio a10 = ((dxjh) cabiVar.h).a();
                    i = i2;
                    cabi.a(a10, 8);
                    btvo a11 = cabiVar.i.a();
                    cabi.a(a11, 9);
                    cbqg a12 = cabiVar.j.a();
                    cabi.a(a12, 10);
                    gga a13 = cabiVar.k.a();
                    cabi.a(a13, 11);
                    cbea a14 = cabiVar.l.a();
                    cabi.a(a14, 12);
                    cabi.a(b, 13);
                    cabi.a(cafbVar, 14);
                    cabi.a(cqqwVar, 15);
                    cabi.a(cabcVar, 18);
                    map.put(b, new cabh(a5, a6, a7, dzsjVar, a8, a9, dzsjVar2, a10, a11, a12, a13, a14, b, cafbVar, cqqwVar, cavfVar, z2, cabcVar));
                    i2 = i + 1;
                    cabdVar = this;
                    dwulVar2 = dwulVar;
                }
            }
            i = i2;
            i2 = i + 1;
            cabdVar = this;
            dwulVar2 = dwulVar;
        }
        cqkx.p(this);
    }

    public void b() {
        this.j = null;
        this.a.clear();
        cqkx.p(this);
    }

    public void c(dkcp dkcpVar) {
        this.j = dkcpVar;
        cqkx.p(this);
    }

    @Override // defpackage.cafc
    public Boolean d() {
        return Boolean.valueOf(this.j == dkcp.CONTRIBUTE);
    }

    @Override // defpackage.cafc
    public Boolean e() {
        boolean z = false;
        if (this.j == dkcp.REVIEW && x() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafc
    public Boolean f() {
        boolean z = false;
        if (this.j == dkcp.PHOTO && w() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafc
    public Boolean g() {
        boolean z = false;
        if (this.j == dkcp.EDIT && v() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafc
    public Boolean h() {
        boolean z = false;
        if (this.j == dkcp.PUBLIC_LIST && u() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafc
    public Boolean i() {
        boolean z = false;
        if (this.h && this.j == dkcp.EVENTS && t() != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafc
    public Boolean j() {
        return Boolean.valueOf(this.j == dkcp.QA);
    }

    @Override // defpackage.cafc
    /* renamed from: k */
    public caek y() {
        return this.f;
    }

    @Override // defpackage.cafc
    @dzsi
    /* renamed from: l */
    public cabh x() {
        return this.a.get(dkcp.REVIEW);
    }

    @Override // defpackage.cafc
    @dzsi
    /* renamed from: m */
    public cabh u() {
        return this.a.get(dkcp.PUBLIC_LIST);
    }

    @Override // defpackage.cafc
    @dzsi
    /* renamed from: n */
    public cabh w() {
        return this.a.get(dkcp.PHOTO);
    }

    @Override // defpackage.cafc
    @dzsi
    /* renamed from: o */
    public cabh v() {
        return this.a.get(dkcp.EDIT);
    }

    @Override // defpackage.cafc
    @dzsi
    /* renamed from: p */
    public cabh t() {
        return this.a.get(dkcp.EVENTS);
    }

    @Override // defpackage.cafc
    @dzsi
    public caft q() {
        return this.g;
    }

    @Override // defpackage.cafc
    public Boolean r() {
        if (d().booleanValue()) {
            return this.f.a();
        }
        if (!j().booleanValue()) {
            if (f().booleanValue()) {
                cabh w = w();
                dbsk.s(w);
                return w.g();
            } else if (e().booleanValue()) {
                cabh x = x();
                dbsk.s(x);
                return x.g();
            } else if (g().booleanValue()) {
                cabh v = v();
                dbsk.s(v);
                return v.g();
            } else if (h().booleanValue()) {
                cabh u = u();
                dbsk.s(u);
                return u.g();
            } else if (i().booleanValue()) {
                cabh t = t();
                dbsk.s(t);
                return t.g();
            } else {
                return false;
            }
        }
        return this.g.v();
    }

    public void s(cqtv cqtvVar) {
        this.f.Y(cqtvVar);
        cacc caccVar = this.g;
        caccVar.d = cqtvVar;
        cqkx.p(caccVar);
        for (Map.Entry<dkcp, cabh> entry : this.a.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().i(cqtvVar);
            }
        }
    }
}
