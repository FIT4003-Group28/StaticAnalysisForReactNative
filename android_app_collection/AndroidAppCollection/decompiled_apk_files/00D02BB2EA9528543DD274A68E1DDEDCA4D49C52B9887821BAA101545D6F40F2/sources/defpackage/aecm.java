package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aecm  reason: default package */
/* loaded from: classes.dex */
public final class aecm {
    public final aedf b;
    public final aedc c;
    public final aedh d;
    public final aedr e;
    public final aedj f;
    public final aecy g;
    public final afzs h;
    public final acyr i;
    public final acyp j;
    private final cqat o;
    private final bvjj p;
    public final List<aecg> a = new ArrayList();
    public dcdc<aecl> k = dcdc.e();
    public dcdc<aeck> l = dcdc.e();
    public boolean m = false;
    public boolean n = false;

    public aecm(cqat cqatVar, bvjj bvjjVar, aedf aedfVar, aedc aedcVar, aedh aedhVar, aedr aedrVar, aedj aedjVar, afzs afzsVar, acyr acyrVar, acyp acypVar, aecy aecyVar) {
        this.o = cqatVar;
        this.p = bvjjVar;
        this.b = aedfVar;
        this.c = aedcVar;
        this.d = aedhVar;
        this.e = aedrVar;
        this.f = aedjVar;
        this.h = afzsVar;
        this.i = acyrVar;
        this.j = acypVar;
        this.g = aecyVar;
        aecyVar.i(new aedt(this) { // from class: aecj
            private final aecm a;

            {
                this.a = this;
            }

            @Override // defpackage.aedt
            public final void a(dktk dktkVar, boolean z, cjqm cjqmVar) {
                aecm aecmVar = this.a;
                if (aecmVar.m) {
                    aecmVar.c(dktkVar);
                }
            }
        });
    }

    @dzsi
    public static aecg d(Iterable<aecg> iterable) {
        for (aecg aecgVar : iterable) {
            int a = aecp.a(aecgVar.e);
            if (a != 0 && a == 3) {
                return aecgVar;
            }
        }
        return null;
    }

    public static int e(aeck aeckVar, String str) {
        String valueOf = String.valueOf(aeckVar.a());
        String valueOf2 = String.valueOf(str);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }

    private final aeci j() {
        return (aeci) this.p.L(bvjk.P, (dssr) aeci.b.cu(7), aeci.b);
    }

    private final void k(aech aechVar) {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.o.b());
        int i = 0;
        while (i < ((aeci) aechVar.b).a.size()) {
            if (seconds > ((aeci) aechVar.b).a.get(i).d) {
                if (aechVar.c) {
                    aechVar.bF();
                    aechVar.c = false;
                }
                aeci aeciVar = (aeci) aechVar.b;
                aeciVar.b();
                aeciVar.a.remove(i);
                i--;
            }
            i++;
        }
    }

    private static boolean l(Iterable<aecg> iterable, aecg aecgVar) {
        for (aecg aecgVar2 : iterable) {
            dktk b = dktk.b(aecgVar2.b);
            if (b == null) {
                b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
            dktk b2 = dktk.b(aecgVar.b);
            if (b2 == null) {
                b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
            if (b.equals(b2) && aecgVar2.c == aecgVar.c) {
                return true;
            }
        }
        return false;
    }

    public final dktk a() {
        return this.g.f();
    }

    public final void b(dktk dktkVar, boolean z) {
        if (this.g.e(dktkVar)) {
            this.g.o(dktkVar, z);
        }
    }

    public final void c(dktk dktkVar) {
        for (aecg aecgVar : this.a) {
            if (i(aecgVar, dktkVar)) {
                aeci j = j();
                dsqp dsqpVar = (dsqp) j.cu(5);
                dsqpVar.bC(j);
                aech aechVar = (aech) dsqpVar;
                k(aechVar);
                Iterator<aecg> it = this.a.iterator();
                while (it.hasNext()) {
                    aecg next = it.next();
                    if (i(next, dktkVar)) {
                        aechVar.a(next);
                        it.remove();
                        dktk b = dktk.b(next.b);
                        if (b == null) {
                            b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                        }
                        int a = aecp.a(next.e);
                        int i = 1;
                        if (a == 0) {
                            a = 1;
                        }
                        if (!f(b, a)) {
                            dktk b2 = dktk.b(next.b);
                            if (b2 == null) {
                                b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
                            }
                            int a2 = aecp.a(next.e);
                            if (a2 != 0) {
                                i = a2;
                            }
                            g(b2, i, false);
                        }
                    }
                }
                this.p.al(bvjk.P, aechVar.bK());
                return;
            }
        }
    }

    public final boolean f(dktk dktkVar, int i) {
        for (aecg aecgVar : this.a) {
            int a = aecp.a(aecgVar.e);
            if (a == 0) {
                a = 1;
            }
            if (a == i && i(aecgVar, dktkVar)) {
                return true;
            }
        }
        return false;
    }

    public final void g(dktk dktkVar, int i, boolean z) {
        int i2 = i - 1;
        if ((i2 == 0 || i2 == 1) && this.g.e(dktkVar)) {
            this.g.o(dktkVar, z);
        }
    }

    public final void h(aeck aeckVar, int i, dktk dktkVar, String str, int i2) {
        if (this.g.e(dktkVar)) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.o.b());
            aecf bZ = aecg.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aecg aecgVar = (aecg) bZ.b;
            aecgVar.e = i - 1;
            int i3 = aecgVar.a | 8;
            aecgVar.a = i3;
            aecgVar.b = dktkVar.o;
            aecgVar.a = i3 | 1;
            int e = e(aeckVar, str);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            aecg aecgVar2 = (aecg) bZ.b;
            int i4 = aecgVar2.a | 2;
            aecgVar2.a = i4;
            aecgVar2.c = e;
            aecgVar2.a = i4 | 4;
            aecgVar2.d = seconds + i2;
            aecg bK = bZ.bK();
            if (l(j().a, bK) || l(this.a, bK)) {
                return;
            }
            if (i == 3 && d(this.a) != null) {
                return;
            }
            if (dktkVar != a() || !this.m) {
                this.a.add(bK);
                g(dktkVar, i, true);
                return;
            }
            aeci j = j();
            dsqp dsqpVar = (dsqp) j.cu(5);
            dsqpVar.bC(j);
            aech aechVar = (aech) dsqpVar;
            k(aechVar);
            aechVar.a(bK);
            this.p.al(bvjk.P, aechVar.bK());
        }
    }

    private static boolean i(aecg aecgVar, dktk dktkVar) {
        int a = aecp.a(aecgVar.e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0 || i == 1) {
            dktk b = dktk.b(aecgVar.b);
            if (b == null) {
                b = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
            }
            return b.equals(dktkVar);
        }
        dktk b2 = dktk.b(aecgVar.b);
        if (b2 == null) {
            b2 = dktk.UNKNOWN_ASSISTIVE_TAB_TYPE;
        }
        return !b2.equals(dktkVar);
    }
}
