package defpackage;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bybt  reason: default package */
/* loaded from: classes4.dex */
public final class bybt implements bxzv {
    public static final /* synthetic */ int g = 0;
    private static final long h = TimeUnit.SECONDS.toMillis(20);
    private static final long i = TimeUnit.SECONDS.toMillis(10);
    public final Map<bybs, byax> a;
    @dzsi
    public byax b;
    public final bybn c;
    public final bybo d;
    private final byaw j;
    private final aou l;
    private boolean k = false;
    public final Runnable e = new bybq(this);
    public final Runnable f = new bybr(this);

    public bybt(rb rbVar, byaw byawVar, bybn bybnVar, bybo byboVar) {
        e eVar = new e() { // from class: com.google.android.apps.gmm.taxi.maprender.TaxiRenderer$3
            @Override // defpackage.f
            public final void a(m mVar) {
            }

            @Override // defpackage.f
            public final void b(m mVar) {
            }

            @Override // defpackage.f
            public final void c(m mVar) {
            }

            @Override // defpackage.f
            public final void d(m mVar) {
            }

            @Override // defpackage.f
            public final void e(m mVar) {
            }

            @Override // defpackage.f
            public final void f(m mVar) {
                bybt.this.c();
                bybt bybtVar = bybt.this;
                bybtVar.d.a(bybtVar.e, 0L);
                bybt bybtVar2 = bybt.this;
                bybtVar2.d.a(bybtVar2.f, 0L);
            }
        };
        this.l = eVar;
        this.a = new dzqz();
        this.j = byawVar;
        this.c = bybnVar;
        this.d = byboVar;
        rbVar.g.a(eVar);
    }

    @Override // defpackage.bxzv
    public final void a(byaa byaaVar, @dzsi String str) {
        dbsk.l(1 == (byaaVar.a & 1));
        byau byauVar = new byau(byaaVar.b);
        byax byaxVar = this.a.get(byauVar);
        bxzz bxzzVar = byaaVar.c;
        if (bxzzVar == null) {
            bxzzVar = bxzz.d;
        }
        dgrt dgrtVar = bxzzVar.b;
        if (dgrtVar == null) {
            dgrtVar = dgrt.d;
        }
        akqs d = akqs.d(dgrtVar);
        if (byaxVar == null && (byaaVar.a & 2) != 0) {
            byaw byawVar = this.j;
            bxzz bxzzVar2 = byaaVar.c;
            if (bxzzVar2 == null) {
                bxzzVar2 = bxzz.d;
            }
            int i2 = bxzzVar2.c;
            byax a = byawVar.a.a();
            dbsk.b(i2 >= 0, "Number of cars should >= 0");
            bycb bycbVar = a.a;
            bycb.a(d, 1);
            byce a2 = bycbVar.a.a();
            bycb.a(a2, 2);
            bycc a3 = bycbVar.b.a();
            bycb.a(a3, 3);
            bqxt a4 = bycbVar.c.a();
            bycb.a(a4, 4);
            Random a5 = bycbVar.d.a();
            bycb.a(a5, 5);
            bvrb a6 = bycbVar.e.a();
            bycb.a(a6, 6);
            a.c = new byca(d, a2, a3, a4, a5, a6);
            dccx F = dcdc.F();
            for (int i3 = 0; i3 < i2; i3++) {
                byay byayVar = new byay(new akqq(), str);
                F.g(byayVar);
                a.b(byayVar);
            }
            a.b = F.f();
            bybk bybkVar = byawVar.b;
            bybk.a(a, 1);
            bvrb a7 = bybkVar.a.a();
            bybk.a(a7, 2);
            Random a8 = bybkVar.b.a();
            bybk.a(a8, 3);
            final bybj bybjVar = new bybj(a, a7, a8);
            if (!bybjVar.b) {
                bybjVar.b = true;
                bybjVar.a.a(new Runnable(bybjVar) { // from class: bybh
                    private final bybj a;

                    {
                        this.a = bybjVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, bvrj.UI_THREAD, 1000L);
            }
            this.a.put(byauVar, a);
            byaxVar = a;
        }
        c();
        this.b = byaxVar;
        if (byaxVar != null) {
            bybn bybnVar = this.c;
            if (!bybnVar.c.contains(byaxVar)) {
                if (bybnVar.c.isEmpty()) {
                    bybnVar.a.h = new bybl(bybnVar);
                }
                bybnVar.c.add(byaxVar);
                bybm bybmVar = new bybm(bybnVar, byaxVar);
                bvrj.UI_THREAD.c();
                byaxVar.d = bybmVar;
                bybnVar.a(byaxVar);
            }
        }
        this.d.b(this.e);
    }

    @Override // defpackage.bxzv
    public final void b(@dzsi byaa byaaVar, @dzsi String str, akqq akqqVar, CharSequence charSequence) {
        if (byaaVar != null) {
            a(byaaVar, str);
        }
        this.k = true;
        bybn bybnVar = this.c;
        if (bybnVar.e == null) {
            bybnVar.e = bybnVar.b.a(akqqVar, charSequence.toString());
            bybnVar.e.a();
        }
    }

    @Override // defpackage.bxzv
    public final void c() {
        if (this.k) {
            this.k = false;
            bybn bybnVar = this.c;
            bycg bycgVar = bybnVar.e;
            if (bycgVar != null) {
                bycgVar.b();
                bybnVar.e = null;
            }
        }
        byax byaxVar = this.b;
        if (byaxVar != null) {
            bybn bybnVar2 = this.c;
            bybnVar2.c.remove(byaxVar);
            bvrj.UI_THREAD.c();
            byaxVar.d = null;
            if (bybnVar2.d.containsKey(byaxVar)) {
                for (byay byayVar : bybnVar2.d.get(byaxVar)) {
                    if (byayVar.d != null) {
                        byayVar.a();
                    }
                }
                bybnVar2.d.remove(byaxVar);
            }
            if (bybnVar2.c.isEmpty()) {
                bybnVar2.a.h = null;
            }
            this.b = null;
        }
        this.d.a(this.f, h);
        this.d.a(this.e, i);
    }

    @Override // defpackage.bxzv
    public final boolean d() {
        byax byaxVar = this.b;
        if (byaxVar != null) {
            if (byaxVar.e()) {
                return true;
            }
            bybn bybnVar = this.c;
            if (bybnVar.c.contains(this.b)) {
                return true;
            }
        }
        return false;
    }
}
