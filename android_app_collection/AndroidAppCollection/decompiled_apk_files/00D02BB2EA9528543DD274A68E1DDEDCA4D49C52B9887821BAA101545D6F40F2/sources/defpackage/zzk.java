package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zzk  reason: default package */
/* loaded from: classes7.dex */
public class zzk {
    transient Set<zzj> a;
    @dzsi
    transient akqq b;
    final List<akqq> c;
    private double d;

    public zzk() {
        this.a = dcnm.c();
        this.c = dchl.a();
        this.d = dcyn.a;
    }

    private final void l() {
        dcdc r = dcdc.r(this.c);
        for (zzj zzjVar : this.a) {
            zzjVar.a(r);
        }
    }

    public final zzm a() {
        zzl bZ = zzm.d.bZ();
        double d = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        zzm zzmVar = (zzm) bZ.b;
        zzmVar.a |= 1;
        zzmVar.c = d;
        for (akqq akqqVar : this.c) {
            duhe o = akqqVar.o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            zzm zzmVar2 = (zzm) bZ.b;
            o.getClass();
            dsrj<duhe> dsrjVar = zzmVar2.b;
            if (!dsrjVar.a()) {
                zzmVar2.b = dsqw.cl(dsrjVar);
            }
            zzmVar2.b.add(o);
        }
        return bZ.bK();
    }

    public final synchronized void b(akqq akqqVar) {
        this.d += akqo.e((akqq) dcft.s(this.c), akqqVar);
        this.c.add(akqqVar);
        l();
    }

    public final synchronized void c(zzj zzjVar) {
        this.a.add(zzjVar);
        zzjVar.a(dcdc.r(this.c));
    }

    public final synchronized void d(zzj zzjVar) {
        this.a.remove(zzjVar);
    }

    public final synchronized void e() {
        if (this.c.size() > 1) {
            this.c.clear();
            this.c.add(this.c.get(0));
            this.d = dcyn.a;
            l();
        }
    }

    public final synchronized void f() {
        if (this.c.size() > 1) {
            double d = this.d;
            List<akqq> list = this.c;
            this.d = d - akqo.e(list.get(list.size() - 2), (akqq) dcft.s(this.c));
            List<akqq> list2 = this.c;
            list2.remove(list2.size() - 1);
            l();
        }
    }

    public final synchronized void g(akqq akqqVar) {
        if (akqqVar.equals(this.b)) {
            return;
        }
        this.b = akqqVar;
        for (zzj zzjVar : this.a) {
            zzjVar.b(this.b);
        }
    }

    public final synchronized int h() {
        akqq akqqVar = this.b;
        if (akqqVar == null) {
            return (int) this.d;
        }
        return (int) (this.d + akqo.e((akqq) dcft.s(this.c), akqqVar));
    }

    public final synchronized akqq i() {
        return this.c.get(0);
    }

    public final synchronized akqq j() {
        return (akqq) dcft.s(this.c);
    }

    public final int k() {
        return this.c.size();
    }

    public zzk(akqq akqqVar) {
        this.a = dcnm.c();
        ArrayList a = dchl.a();
        this.c = a;
        this.d = dcyn.a;
        a.add(akqqVar);
    }

    public zzk(List<akqq> list, double d) {
        this.a = dcnm.c();
        ArrayList a = dchl.a();
        this.c = a;
        this.d = dcyn.a;
        a.addAll(list);
        this.d = d;
    }
}
