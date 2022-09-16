package defpackage;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhyo  reason: default package */
/* loaded from: classes3.dex */
public class bhyo implements bhwz {
    public final ges a;
    @dzsi
    public final dnvu b;
    public final String c;
    public final bwrs<ilo> d;
    public final axwq e;
    public final ff f;
    public final bvrb g;
    public boolean h;
    @dzsi
    dvjr i;
    EditText j;
    public final bvaz k;
    public final bhun l;
    private final jic m;
    private final List<bhwy> n = new ArrayList();
    @dzsi
    private String o;
    private final buom p;

    public bhyo(ff ffVar, bvrb bvrbVar, axwq axwqVar, buom buomVar, bvaz bvazVar, ges gesVar, dnvu dnvuVar, String str, bwrs bwrsVar, bhun bhunVar) {
        this.a = gesVar;
        this.b = dnvuVar;
        this.c = str;
        this.d = bwrsVar;
        this.l = bhunVar;
        this.f = ffVar;
        this.g = bvrbVar;
        this.e = axwqVar;
        this.p = buomVar;
        this.k = bvazVar;
        this.o = dnvuVar != null ? dnvuVar.d : null;
        this.m = new jic(this.o, ckqc.FULLY_QUALIFIED, 0);
        if (dnvuVar != null) {
            dvjo bZ = dvjp.c.bZ();
            String str2 = dnvuVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvjp dvjpVar = (dvjp) bZ.b;
            str2.getClass();
            dvjpVar.a |= 1;
            dvjpVar.b = str2;
            buomVar.a(bZ.bK(), new bhya(this), bvrj.BACKGROUND_THREADPOOL);
        }
        this.h = false;
    }

    @Override // defpackage.bhwz
    public String a() {
        return this.c;
    }

    @Override // defpackage.bhwz
    public jic b() {
        return this.m;
    }

    @Override // defpackage.bhwz
    public List<bhwy> c() {
        dnha dnhaVar;
        dnha dnhaVar2;
        ArrayList arrayList = new ArrayList();
        dvjr dvjrVar = this.i;
        if (dvjrVar != null) {
            dnhaVar = null;
            dnhaVar2 = null;
            for (dnha dnhaVar3 : dvjrVar.c) {
                dnkb dnkbVar = dnkb.UNKNOWN;
                dnkc dnkcVar = dnhaVar3.a;
                if (dnkcVar == null) {
                    dnkcVar = dnkc.h;
                }
                dnkb b = dnkb.b(dnkcVar.b);
                if (b == null) {
                    b = dnkb.UNKNOWN;
                }
                int ordinal = b.ordinal();
                if (ordinal == 1) {
                    arrayList.add(dnhaVar3);
                } else if (ordinal == 2) {
                    dnhaVar2 = dnhaVar3;
                } else if (ordinal == 3) {
                    dnhaVar = dnhaVar3;
                }
            }
        } else {
            dnhaVar = null;
            dnhaVar2 = null;
        }
        this.n.clear();
        this.n.add(new bhyn(this, dnkb.HOME, 2131231654, dnhaVar2));
        this.n.add(new bhyn(this, dnkb.WORK, 2131231777, dnhaVar));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.n.add(new bhyn(this, dnkb.CUSTOM, 2131231285, (dnha) arrayList.get(i)));
        }
        this.n.add(new bhyn(this, dnkb.CUSTOM, 2131231285, null));
        return this.n;
    }

    @Override // defpackage.bhwz
    public cqkl d() {
        this.f.g().e();
        return cqkl.a;
    }

    @Override // defpackage.bhwz
    public Boolean e() {
        dnvu dnvuVar = this.b;
        boolean z = false;
        if (dnvuVar != null && (dnvuVar.a & 4) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhwz
    public Boolean f() {
        boolean z = true;
        if (this.h) {
            return true;
        }
        if (h().booleanValue() || g().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public Boolean g() {
        return Boolean.valueOf(this.b == null);
    }

    public Boolean h() {
        return Boolean.valueOf(this.i != null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dvjt i(dnkb dnkbVar, @dzsi String str) {
        dvjs bZ = dvjt.h.bZ();
        dnjz j = j(dnkbVar, str);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvjt dvjtVar = (dvjt) bZ.b;
        dnkc bK = j.bK();
        bK.getClass();
        dvjtVar.c = bK;
        dvjtVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvjt dvjtVar2 = (dvjt) bZ.b;
        dvjtVar2.b = 1;
        int i = 1 | dvjtVar2.a;
        dvjtVar2.a = i;
        String str2 = this.c;
        str2.getClass();
        dvjtVar2.a = i | 8;
        dvjtVar2.f = str2;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dnjz j(dnkb dnkbVar, @dzsi String str) {
        String i;
        if (this.d.c().aV()) {
            i = this.d.c().B();
        } else {
            i = dbrz.e(", ").j().i(dbsj.f(this.d.c().n()), this.d.c().B(), new Object[0]);
        }
        dnjz bZ = dnkc.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnkc dnkcVar = (dnkc) bZ.b;
        dnkcVar.b = dnkbVar.f;
        int i2 = dnkcVar.a | 1;
        dnkcVar.a = i2;
        i.getClass();
        dnkcVar.a = i2 | 4;
        dnkcVar.d = i;
        dnog bZ2 = dnoh.d.bZ();
        double d = this.d.c().aj().a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnoh dnohVar = (dnoh) bZ2.b;
        dnohVar.a |= 1;
        dnohVar.b = d;
        double d2 = this.d.c().aj().b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnoh dnohVar2 = (dnoh) bZ2.b;
        dnohVar2.a |= 2;
        dnohVar2.c = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnkc dnkcVar2 = (dnkc) bZ.b;
        dnoh bK = bZ2.bK();
        bK.getClass();
        dnkcVar2.g = bK;
        dnkcVar2.a |= 32;
        if (dnkbVar == dnkb.CUSTOM) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnkc dnkcVar3 = (dnkc) bZ.b;
            str.getClass();
            dnkcVar3.a |= 2;
            dnkcVar3.c = str;
        }
        if (akqi.d(this.d.c().ai())) {
            String o = this.d.c().ai().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnkc dnkcVar4 = (dnkc) bZ.b;
            o.getClass();
            dnkcVar4.a |= 8;
            dnkcVar4.e = o;
        }
        return bZ;
    }

    public final void k(@dzsi dvjr dvjrVar, @dzsi bttq bttqVar) {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (dvjrVar == null || bttqVar != null || !this.a.aD) {
            this.g.b(new bhyb(this), bvrj.UI_THREAD);
            return;
        }
        this.i = dvjrVar;
        this.o = dvjrVar.b;
        this.g.b(new bhyc(this), bvrj.UI_THREAD);
    }

    public final void l(@dzsi dvjv dvjvVar, @dzsi bttq bttqVar) {
        int a;
        bvrj.BACKGROUND_THREADPOOL.c();
        this.h = false;
        if (dvjvVar == null || bttqVar != null || !this.a.aD || (a = dnvx.a(dvjvVar.a)) == 0 || a != 2) {
            this.g.b(new bhye(this), bvrj.UI_THREAD);
        } else {
            this.e.s(new bhyg(this));
        }
    }
}
