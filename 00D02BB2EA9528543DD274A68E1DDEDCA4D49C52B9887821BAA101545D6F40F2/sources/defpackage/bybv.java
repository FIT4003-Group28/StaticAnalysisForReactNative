package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bybv  reason: default package */
/* loaded from: classes4.dex */
final class bybv implements Runnable {
    final /* synthetic */ deig a;
    final /* synthetic */ byca b;

    public bybv(byca bycaVar, deig deigVar) {
        this.b = bycaVar;
        this.a = deigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            byca bycaVar = this.b;
            byce byceVar = bycaVar.a;
            akrp akrpVar = bycaVar.f;
            int b = byceVar.a.b();
            if (b == bqxu.Jd) {
                akra akraVar = new akra();
                akrpVar.t(akraVar);
                alyh c = alyh.c(bqxu.Jc, akraVar);
                bqxt bqxtVar = byceVar.a;
                int i = c.b;
                int i2 = c.c;
                Set<Integer> h = bqyf.h(((bqyf) bqxtVar).a.a(), i, i2);
                synchronized (bqxtVar) {
                    ((bqyf) bqxtVar).d.addAll(h);
                }
                h.addAll(bqyf.h(((bqyf) bqxtVar).b.a(), i, i2));
                if (h.isEmpty()) {
                    throw new bycd();
                }
                b = ((Integer) Collections.max(h)).intValue();
            }
            bqxu a = this.b.c.a(b);
            ahqr ahqrVar = new ahqr(new ahqt(a), this.b.b.a);
            List singletonList = Collections.singletonList(this.b.f);
            Set<alyh> a2 = ahqt.a(singletonList);
            ArrayList arrayList = new ArrayList(((dzru) a2).f);
            dzrn it = ((dzru) a2).iterator();
            while (it.hasNext()) {
                bybz bybzVar = new bybz();
                arrayList.add(bybzVar);
                a.a((alyh) it.next(), bybzVar);
            }
            deig deigVar = this.a;
            degy l = deha.l(arrayList);
            bybu bybuVar = new bybu(ahqrVar, singletonList);
            Executor g = this.b.e.g(bvrj.BACKGROUND_THREADPOOL);
            dbsk.s(g);
            deigVar.p(l.b(bybuVar, g));
        } catch (Exception e) {
            this.a.k(e);
        }
    }
}
