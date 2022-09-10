package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abar  reason: default package */
/* loaded from: classes.dex */
public final class abar implements abam {
    public final abao a;
    private final abai b;
    private final akox c;
    private final Runnable d;
    private final abap e;
    private final Map<String, abah> f = new HashMap();
    private boolean g = false;
    private String h = "";
    private dcvu i;
    private float j;

    public abar(abai abaiVar, abat abatVar, akox akoxVar, btrm btrmVar, bvrb bvrbVar) {
        this.b = abaiVar;
        this.a = new abao(abatVar);
        this.c = akoxVar;
        akqs a = alao.a(akoxVar);
        this.i = a != null ? a.f() : dcvu.c();
        this.j = akoxVar.k().k();
        this.e = new abap(this, btrmVar);
        this.d = new abaq(new Runnable(this) { // from class: aban
            private final abar a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        }, bvrbVar);
    }

    @Override // defpackage.abam
    public final synchronized void a(List<ditt> list) {
        HashSet hashSet = new HashSet();
        for (ditt dittVar : list) {
            String str = dittVar.c;
            hashSet.add(str);
            if (this.f.containsKey(str)) {
                abah abahVar = this.f.get(str);
                dbsk.s(abahVar);
                if (abahVar.a.m != dittVar.m) {
                    abahVar.c();
                }
            }
            abai abaiVar = this.b;
            abao abaoVar = this.a;
            abai.a(dittVar, 1);
            abai.a(abaoVar, 2);
            alay a = abaiVar.a.a();
            abai.a(a, 3);
            dxio a2 = ((dxjh) abaiVar.b).a();
            abai.a(a2, 4);
            cqat a3 = abaiVar.c.a();
            abai.a(a3, 5);
            bvrb a4 = abaiVar.d.a();
            abai.a(a4, 6);
            abba a5 = abaiVar.e.a();
            abai.a(a5, 7);
            abah abahVar2 = new abah(dittVar, abaoVar, a, a2, a3, a4, a5);
            i(abahVar2);
            this.f.put(str, abahVar2);
        }
        Iterator<Map.Entry<String, abah>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, abah> next = it.next();
            abah value = next.getValue();
            if (!hashSet.contains(next.getKey())) {
                value.c();
                it.remove();
            }
        }
    }

    @Override // defpackage.abam
    public final synchronized void b() {
        if (this.g) {
            return;
        }
        abap abapVar = this.e;
        if (!abapVar.b) {
            btrm btrmVar = abapVar.a;
            dceq a = dcet.a();
            a.b(alhj.class, new abas(alhj.class, abapVar, bvrj.UI_THREAD));
            btrmVar.g(abapVar, a.a());
            abapVar.b = true;
        }
        this.c.j().k(this.d);
        this.g = true;
        h();
    }

    @Override // defpackage.abam
    public final synchronized void c() {
        if (!this.g) {
            return;
        }
        this.e.a();
        this.c.j().l(this.d);
        this.g = false;
        for (abah abahVar : this.f.values()) {
            abahVar.b();
        }
    }

    @Override // defpackage.abam
    public final synchronized boolean d() {
        return this.g;
    }

    @Override // defpackage.abam
    public final synchronized void e() {
        this.e.a();
        this.c.j().l(this.d);
        for (abah abahVar : this.f.values()) {
            abahVar.c();
        }
        this.f.clear();
        this.h = "";
    }

    @Override // defpackage.abam
    @dzsi
    public final synchronized ditt f(String str) {
        if (!this.h.isEmpty()) {
            g();
        }
        this.h = str;
        abah abahVar = this.f.get(str);
        if (abahVar != null) {
            i(abahVar);
            return abahVar.a;
        }
        return null;
    }

    @Override // defpackage.abam
    public final synchronized void g() {
        abah abahVar = !this.h.isEmpty() ? this.f.get(this.h) : null;
        this.h = "";
        if (abahVar != null) {
            i(abahVar);
        }
    }

    public final synchronized void h() {
        akqs a = alao.a(this.c);
        this.i = a != null ? a.f() : dcvu.c();
        this.j = this.c.k().k();
        for (abah abahVar : this.f.values()) {
            i(abahVar);
        }
    }

    private final void i(abah abahVar) {
        if (!this.g || abahVar.a.c.equals(this.h) || abahVar.c > this.j || !abahVar.b.s(this.i)) {
            abahVar.b();
        } else {
            abahVar.a();
        }
    }
}
