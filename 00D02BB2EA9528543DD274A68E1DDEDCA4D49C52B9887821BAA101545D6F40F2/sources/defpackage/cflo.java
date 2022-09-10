package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cflo  reason: default package */
/* loaded from: classes4.dex */
public final class cflo implements cfll {
    public final cflq a;
    public final CopyOnWriteArraySet<cflk> b = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<Long, cfln> c = new ConcurrentHashMap<>();
    private final dcxg d;
    private final Executor e;
    private final burh f;

    public cflo(Executor executor, burh burhVar, btvo btvoVar, cflq cflqVar) {
        this.e = executor;
        this.f = burhVar;
        this.a = cflqVar;
        int i = btvoVar.getUgcParameters().aK().a;
        dcxc a = dcxg.a();
        a.a = Math.max(0, Math.min(30, i));
        a.b = Math.max(0, Math.min(30, i));
        this.d = a.a();
    }

    public static dcdc<Long> f(difr difrVar) {
        difq difqVar = difrVar.b;
        if (difqVar == null) {
            difqVar = difq.b;
        }
        dsrj<drld> dsrjVar = difqVar.a;
        dccx F = dcdc.F();
        for (drld drldVar : dsrjVar) {
            F.g(Long.valueOf(drldVar.b));
        }
        return F.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set<defpackage.dcvf> h(java.lang.Iterable<defpackage.akqs> r30) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cflo.h(java.lang.Iterable):java.util.Set");
    }

    private final cfln i(long j) {
        cfln cflnVar = this.c.get(Long.valueOf(j));
        return cflnVar != null ? cflnVar : cfln.DEFAULT;
    }

    @Override // defpackage.cfll
    public final dcdc<Long> a(Iterable<akqs> iterable) {
        Set<dcvf> h = h(iterable);
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (dcvf dcvfVar : h) {
            cfln i = i(dcvfVar.b);
            if (i.equals(cfln.DEFAULT)) {
                F.g(Long.valueOf(dcvfVar.b));
            }
            if (!i.equals(cfln.CURRENTLY_STORED)) {
                F2.g(Long.valueOf(dcvfVar.b));
            }
        }
        dcdc<Long> f = F.f();
        if (f.size() > 50.0d) {
            Iterator<cflk> it = this.b.iterator();
            while (it.hasNext()) {
                dcdc.e();
                btzy btzyVar = btzy.a;
                it.next().y();
            }
            return dcdc.e();
        }
        if (!f.isEmpty()) {
            difo difoVar = (difo) difr.d.bZ();
            dccx F3 = dcdc.F();
            for (Long l : f) {
                drlc bZ = drld.c.bZ();
                long longValue = l.longValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drld drldVar = (drld) bZ.b;
                drldVar.a = 1 | drldVar.a;
                drldVar.b = longValue;
                F3.g(bZ.bK());
            }
            dcdc f2 = F3.f();
            difp bZ2 = difq.b.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            difq difqVar = (difq) bZ2.b;
            dsrj<drld> dsrjVar = difqVar.a;
            if (!dsrjVar.a()) {
                difqVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(f2, difqVar.a);
            if (difoVar.c) {
                difoVar.bF();
                difoVar.c = false;
            }
            difr difrVar = (difr) difoVar.b;
            difq bK = bZ2.bK();
            bK.getClass();
            difrVar.b = bK;
            difrVar.a |= 4;
            if (difoVar.c) {
                difoVar.bF();
                difoVar.c = false;
            }
            difr difrVar2 = (difr) difoVar.b;
            difrVar2.a |= 8;
            difrVar2.c = true;
            difr difrVar3 = (difr) difoVar.bK();
            this.f.b(difrVar3, new cflm(this), this.e);
            g(f(difrVar3), cfln.CURRENTLY_REQUESTED);
        }
        return F2.f();
    }

    @Override // defpackage.cfll
    public final boolean b(Iterable<akqs> iterable) {
        int i = 0;
        for (dcvf dcvfVar : h(iterable)) {
            if (i(dcvfVar.b).equals(cfln.DEFAULT)) {
                i++;
            }
        }
        return ((double) i) <= 50.0d;
    }

    @Override // defpackage.cfll
    public final void c(cflk cflkVar) {
        this.b.add(cflkVar);
    }

    @Override // defpackage.cfll
    public final void d(cflk cflkVar) {
        this.b.remove(cflkVar);
    }

    @Override // defpackage.cfll
    public final cflq e() {
        return this.a;
    }

    public final void g(List<Long> list, cfln cflnVar) {
        for (Long l : list) {
            this.c.put(Long.valueOf(l.longValue()), cflnVar);
        }
    }
}
