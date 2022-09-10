package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Map;
/* compiled from: PG */
/* renamed from: acdv  reason: default package */
/* loaded from: classes2.dex */
public final class acdv implements abwr {
    public final dxio<akty> a;
    public final dxio<akvz> b;
    public final akox c;
    public final cjtd d;
    public final cjqy e;
    public final cjqq f;
    public final acdq g;
    public final abwo j;
    private final abwq k;
    private final dbsz<acdl> m;
    public final Object h = new Object();
    public final Map<aced, acdk> i = dcjz.d();
    private final abwp l = new acdu(this);

    public acdv(dxio dxioVar, dxio dxioVar2, abwo abwoVar, cjqy cjqyVar, cjqq cjqqVar, acdr acdrVar, abwq abwqVar, akox akoxVar) {
        dbsz<acdl> dbszVar = new dbsz(this) { // from class: acds
            private final acdv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                acdv acdvVar = this.a;
                acdl acdlVar = (acdl) obj;
                acdvVar.e.j(acdlVar.b(), acdvVar.d);
                abwo abwoVar2 = acdvVar.j;
                aced a = acdlVar.a();
                dccx F = dcdc.F();
                F.g(a.c());
                aksi r = acdvVar.c.l().r();
                for (aced acedVar : acdvVar.i.keySet()) {
                    if (acedVar != a && r.j(acedVar.a())) {
                        F.g(acedVar.c());
                    }
                }
                abwoVar2.b(acei.f(F.f()), 0);
            }
        };
        this.m = dbszVar;
        this.a = dxioVar;
        this.j = abwoVar;
        this.b = dxioVar2;
        this.d = cjtd.a(dtye.r);
        this.e = cjqyVar;
        this.f = cjqqVar;
        acdr.a(dbszVar, 1);
        Application a = acdrVar.a.a();
        acdr.a(a, 2);
        dxio a2 = ((dxjh) acdrVar.b).a();
        acdr.a(a2, 3);
        amfi a3 = acdrVar.c.a();
        acdr.a(a3, 4);
        this.g = new acdq(dbszVar, a, a2, a3);
        this.c = akoxVar;
        this.k = abwqVar;
    }

    public static void d(acdk acdkVar, akty aktyVar, akvz akvzVar) {
        aktd b = acdkVar.b();
        aktyVar.g(b);
        aktyVar.e(b);
        dcdc<akuh> a = acdkVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            akvzVar.j(a.get(i));
        }
    }

    @Override // defpackage.abwr
    public final synchronized void a() {
        this.k.a(this.l);
        c();
    }

    @Override // defpackage.abwr
    public final synchronized void b() {
        this.k.b(this.l);
        synchronized (this.h) {
            for (acdk acdkVar : this.i.values()) {
                if (acdkVar != null) {
                    d(acdkVar, this.a.a(), this.b.a());
                }
            }
            this.i.clear();
        }
    }

    public final void c() {
        synchronized (this.h) {
            HashSet<aced> c = dcnm.c();
            c.addAll(this.i.keySet());
            dcpe listIterator = dcdc.r(((abxw) this.k).b.a.snapshot().values()).listIterator();
            int i = 0;
            while (listIterator.hasNext()) {
                aced acedVar = (aced) listIterator.next();
                if (this.i.containsKey(acedVar)) {
                    c.remove(acedVar);
                } else {
                    this.i.put(acedVar, null);
                    acdq acdqVar = this.g;
                    acdt acdtVar = new acdt(this, acedVar, i);
                    acdqVar.e.m(acdq.a(acedVar.c().a().h, 100, 100, null), new acdo(acdtVar), acdqVar.f);
                }
                i++;
            }
            for (aced acedVar2 : c) {
                acdk acdkVar = this.i.get(acedVar2);
                if (acdkVar != null) {
                    d(acdkVar, this.a.a(), this.b.a());
                }
            }
            this.i.keySet().removeAll(c);
        }
    }
}
