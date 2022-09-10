package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bzmf  reason: default package */
/* loaded from: classes.dex */
public final class bzmf {
    public final bzme a;
    public final ckcw b;
    private final cqat c;
    private final bvjj d;
    private final axxg e;

    public bzmf(cqat cqatVar, bvjj bvjjVar, bzme bzmeVar, axxg axxgVar, ckcw ckcwVar) {
        this.c = cqatVar;
        this.d = bvjjVar;
        this.a = bzmeVar;
        this.e = axxgVar;
        this.b = ckcwVar;
    }

    private final synchronized void m(bzof bzofVar) {
        this.d.al(bvjk.dC, bzofVar.bK());
    }

    private final synchronized bzog n() {
        return (bzog) this.d.L(bvjk.dC, (dssr) bzog.c.cu(7), bzog.c);
    }

    private final void o(List<azyh> list) {
        ArrayList arrayList = new ArrayList();
        for (azyh azyhVar : list) {
            arrayList.add(dspd.x(azxm.f.f(azyhVar)));
        }
        synchronized (this) {
            bzog n = n();
            dsqp dsqpVar = (dsqp) n.cu(5);
            dsqpVar.bC(n);
            bzof bzofVar = (bzof) dsqpVar;
            if (bzofVar.c) {
                bzofVar.bF();
                bzofVar.c = false;
            }
            bzog bzogVar = bzog.c;
            ((bzog) bzofVar.b).b = bzog.ck();
            bzofVar.a(arrayList);
            m(bzofVar);
        }
    }

    private final synchronized void p(final azyh azyhVar) {
        axxg axxgVar = this.e;
        ((azpl) axxgVar).f.a(Arrays.asList(azyhVar));
        final azpl azplVar = (azpl) axxgVar;
        ((azpl) axxgVar).c.b(new Runnable(azplVar, azyhVar) { // from class: azph
            private final azpl a;
            private final azyh b;

            {
                this.a = azplVar;
                this.b = azyhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azpl azplVar2 = this.a;
                azplVar2.e.b(this.b);
            }
        });
    }

    private final synchronized List<azyh> q() {
        k();
        if (this.a.a()) {
            return i();
        }
        return h();
    }

    private final synchronized void r(dqkc dqkcVar, bzmk bzmkVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE || !(bzmkVar == bzmk.VISIBLE || bzmkVar == bzmk.REPRESSED)) {
            return;
        }
        dqjz bZ = dqkd.f.bZ();
        int i = 0;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkd dqkdVar = (dqkd) bZ.b;
        dqkdVar.b = dqkcVar.bl;
        boolean z = true;
        int i2 = dqkdVar.a | 1;
        dqkdVar.a = i2;
        dqkdVar.a = i2 | 2;
        dqkdVar.c = 0L;
        dqkd dqkdVar2 = (dqkd) bZ.b;
        dqkdVar2.d = 1;
        dqkdVar2.a |= 4;
        if (bzmkVar != bzmk.REPRESSED) {
            z = false;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkd dqkdVar3 = (dqkd) bZ.b;
        dqkdVar3.a |= 8;
        dqkdVar3.e = z;
        azyh b = new azyg(bZ.bK()).b();
        if (this.a.a()) {
            p(b);
            return;
        }
        List<azyh> h = h();
        int size = h.size();
        while (true) {
            if (i >= h.size()) {
                break;
            }
            if ((h.get(i).j().a & 2) != 0 && h.get(i).j().c > 0) {
                size = i;
                break;
            }
            i++;
        }
        h.add(size, b);
        o(h);
    }

    public final synchronized void a(dqkc dqkcVar, bzmk bzmkVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE || !(bzmkVar == bzmk.VISIBLE || bzmkVar == bzmk.REPRESSED)) {
            return;
        }
        k();
        dqjz bZ = dqkd.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkd dqkdVar = (dqkd) bZ.b;
        dqkdVar.b = dqkcVar.bl;
        boolean z = true;
        dqkdVar.a |= 1;
        long b = this.c.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkd dqkdVar2 = (dqkd) bZ.b;
        dqkdVar2.a |= 2;
        dqkdVar2.c = b;
        dqkd dqkdVar3 = (dqkd) bZ.b;
        dqkdVar3.d = 1;
        dqkdVar3.a |= 4;
        if (bzmkVar != bzmk.REPRESSED) {
            z = false;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dqkd dqkdVar4 = (dqkd) bZ.b;
        dqkdVar4.a |= 8;
        dqkdVar4.e = z;
        azyh b2 = new azyg(bZ.bK()).b();
        if (!this.a.a()) {
            dspd x = dspd.x(azxm.f.f(b2));
            synchronized (this) {
                bzog n = n();
                dsqp dsqpVar = (dsqp) n.cu(5);
                dsqpVar.bC(n);
                bzof bzofVar = (bzof) dsqpVar;
                if (bzofVar.c) {
                    bzofVar.bF();
                    bzofVar.c = false;
                }
                bzog bzogVar = (bzog) bzofVar.b;
                bzog bzogVar2 = bzog.c;
                x.getClass();
                bzogVar.b();
                bzogVar.b.add(x);
                m(bzofVar);
            }
            return;
        }
        p(b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(dqkc dqkcVar) {
        r(dqkcVar, bzmk.VISIBLE);
    }

    public final synchronized void c() {
        dqkc[] values;
        bvjk bvjkVar;
        for (dqkc dqkcVar : dqkc.values()) {
            int ordinal = dqkcVar.ordinal();
            if (ordinal == 1) {
                bvjkVar = bvjk.dq;
            } else if (ordinal == 2) {
                bvjkVar = bvjk.dz;
            } else if (ordinal == 6) {
                bvjkVar = bvjk.dr;
            } else if (ordinal == 7) {
                bvjkVar = bvjk.dv;
            } else if (ordinal == 13) {
                bvjkVar = bvjk.dB;
            } else if (ordinal == 14) {
                bvjkVar = bvjk.ai;
            } else if (ordinal == 19) {
                bvjkVar = bvjk.by;
            } else if (ordinal != 36) {
                bvjkVar = ordinal != 39 ? null : bvjk.aY;
            } else {
                bvjkVar = bvjk.aZ;
            }
            if (bvjkVar != null && this.d.m(bvjkVar, false)) {
                int f = f(dqkc.PULL_UP);
                if (bvjkVar.equals(bvjk.dv) && f < 2) {
                    for (int i = 0; i < 2 - f; i++) {
                        r(dqkc.PULL_UP, bzmk.VISIBLE);
                    }
                }
                if (d(dqkcVar) != bzmk.VISIBLE) {
                    r(dqkcVar, bzmk.VISIBLE);
                }
                this.d.P(bvjkVar);
            }
        }
        if (this.d.i(bvjk.dw)) {
            this.d.P(bvjk.dw);
        }
        if (this.d.i(bvjk.du)) {
            this.d.P(bvjk.du);
        }
        if (this.d.i(bvjk.ex)) {
            this.d.P(bvjk.ex);
        }
        if (this.d.i(bvjk.dy)) {
            this.d.P(bvjk.dy);
        }
        if (this.d.i(bvjk.aX)) {
            this.d.P(bvjk.aX);
        }
        if (this.d.i(bvjk.ba)) {
            this.d.P(bvjk.ba);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized bzmk d(dqkc dqkcVar) {
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return bzmk.NONE;
        }
        bzmk bzmkVar = bzmk.NONE;
        Iterator<azyh> it = q().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            azyh next = it.next();
            dqkc b = dqkc.b(next.j().b);
            if (b == null) {
                b = dqkc.UNKNOWN_TUTORIAL_TYPE;
            }
            if (b == dqkcVar) {
                if (!next.j().e) {
                    bzmkVar = bzmk.VISIBLE;
                    break;
                }
                bzmkVar = bzmk.REPRESSED;
            }
        }
        return bzmkVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long e(dqkc dqkcVar) {
        azyh azyhVar;
        dqkc b;
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return -1L;
        }
        List<azyh> q = q();
        int size = q.size();
        do {
            size--;
            if (size < 0) {
                return -1L;
            }
            azyhVar = q.get(size);
            b = dqkc.b(azyhVar.j().b);
            if (b == null) {
                b = dqkc.UNKNOWN_TUTORIAL_TYPE;
                continue;
            }
        } while (b != dqkcVar);
        return azyhVar.j().c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int f(dqkc dqkcVar) {
        int i = 0;
        if (dqkcVar == dqkc.UNKNOWN_TUTORIAL_TYPE) {
            return 0;
        }
        for (azyh azyhVar : q()) {
            dqkc b = dqkc.b(azyhVar.j().b);
            if (b == null) {
                b = dqkc.UNKNOWN_TUTORIAL_TYPE;
            }
            if (b == dqkcVar) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long g() {
        List<azyh> q = q();
        int size = q.size() - 1;
        if (size >= 0) {
            return q.get(size).j().c;
        }
        return -1L;
    }

    public final List<azyh> h() {
        ArrayList arrayList = new ArrayList();
        for (dspd dspdVar : n().b) {
            arrayList.add(((azyc) azxm.f).c(dspdVar.G()).b());
        }
        return arrayList;
    }

    public final synchronized List<azyh> i() {
        dccx dccxVar;
        azpp azppVar = ((azpl) this.e).f;
        dccxVar = new dccx();
        for (dspd dspdVar : azppVar.b().b) {
            dccxVar.g(((azyc) azxm.f).c(dspdVar.G()).b());
        }
        return dccxVar.f();
    }

    public final synchronized void j() {
        if (n().a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dqkd dqkdVar : n().a) {
            arrayList.add(dspd.x(azxm.f.f(new azyg(dqkdVar).b())));
        }
        synchronized (this) {
            bzog n = n();
            dsqp dsqpVar = (dsqp) n.cu(5);
            dsqpVar.bC(n);
            bzof bzofVar = (bzof) dsqpVar;
            if (bzofVar.c) {
                bzofVar.bF();
                bzofVar.c = false;
            }
            ((bzog) bzofVar.b).a = bzog.ck();
            bzofVar.a(arrayList);
            m(bzofVar);
        }
    }

    public final synchronized void k() {
        int a = bzoj.a(((azpl) this.e).f.b().c);
        if (a == 0) {
            a = 1;
        }
        if (!this.a.a() || (a != 2 && a != 1)) {
            if (this.a.a() || a != 3) {
                return;
            }
            List<azyh> i = i();
            i.size();
            o(i);
            this.e.a(2);
            return;
        }
        HashMap hashMap = new HashMap();
        for (azyh azyhVar : i()) {
            domf domfVar = azyhVar.g().b;
            if (domfVar == null) {
                domfVar = domf.d;
            }
            if (hashMap.containsKey(domfVar)) {
                ((AtomicInteger) hashMap.get(domfVar)).incrementAndGet();
            } else {
                hashMap.put(domfVar, new AtomicInteger(1));
            }
        }
        final ArrayList arrayList = new ArrayList();
        for (azyh azyhVar2 : h()) {
            domf domfVar2 = azyhVar2.g().b;
            if (domfVar2 == null) {
                domfVar2 = domf.d;
            }
            if (hashMap.containsKey(domfVar2)) {
                if (((AtomicInteger) hashMap.get(domfVar2)).decrementAndGet() <= 0) {
                    hashMap.remove(domfVar2);
                }
            } else {
                arrayList.add(azyhVar2);
            }
        }
        arrayList.size();
        if (!arrayList.isEmpty()) {
            axxg axxgVar = this.e;
            ((azpl) axxgVar).f.a(arrayList);
            final azpl azplVar = (azpl) axxgVar;
            ((azpl) axxgVar).c.b(new Runnable(azplVar, arrayList) { // from class: azpi
                private final azpl a;
                private final List b;

                {
                    this.a = azplVar;
                    this.b = arrayList;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    azpl azplVar2 = this.a;
                    azplVar2.e.c(this.b);
                }
            });
        }
        this.e.a(3);
    }

    public final synchronized void l() {
        if (this.a.a()) {
            return;
        }
        List<azyh> h = h();
        if (h.isEmpty()) {
            return;
        }
        long j = h.get(h.size() - 1).j().c;
        long b = this.c.b();
        if (j > b && b >= 0) {
            int size = h.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                azyh azyhVar = h.get(size);
                if (azyhVar.j().c <= b) {
                    break;
                }
                azyg i = azyhVar.i();
                i.c(b);
                h.set(size, i.b());
            }
            o(h);
        }
    }
}
