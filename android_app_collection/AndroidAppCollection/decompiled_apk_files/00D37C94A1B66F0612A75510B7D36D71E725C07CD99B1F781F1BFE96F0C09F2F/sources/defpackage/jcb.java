package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: jcb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jcb implements Runnable {
    public final /* synthetic */ jcq a;

    public /* synthetic */ jcb(jcq jcqVar) {
        this.a = jcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jcq jcqVar = this.a;
        ylr.b();
        if (jcqVar.h) {
            return;
        }
        final acvg b = ((acvh) jcqVar.e.get()).b(asny.LATENCY_ACTION_DOWNLOADS_COMPATIBILITY_LAYER);
        final aagh c = ((aagi) jcqVar.c.get()).c();
        final aahb c2 = ((aagu) c).c();
        final agvx a = ((agrf) jcqVar.b.get()).a();
        if (((fbt) jcqVar.f.get()).a()) {
            final Set<aajj> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            jcqVar.a(new jbg() { // from class: jbm
                @Override // defpackage.jbg
                public final void a(Object obj) {
                    agvx agvxVar = agvx.this;
                    Set set = newSetFromMap;
                    aajl aajlVar = c;
                    amvn amvnVar = jcq.a;
                    amzs it = ((jba) obj).v(agvxVar).iterator();
                    while (it.hasNext()) {
                        set.add(((abga) it.next()).a(aajlVar));
                    }
                }
            });
            newSetFromMap.getClass();
            for (aajj aajjVar : newSetFromMap) {
                if (aajjVar != null) {
                    c2.d(aajjVar);
                }
            }
        } else {
            jcqVar.a(new jbg() { // from class: jbl
                @Override // defpackage.jbg
                public final void a(Object obj) {
                    agvx agvxVar = agvx.this;
                    aajs aajsVar = c2;
                    amvn amvnVar = jcq.a;
                    amzs it = ((jba) obj).v(agvxVar).iterator();
                    while (it.hasNext()) {
                        aajsVar.j((abga) it.next());
                    }
                }
            });
        }
        b.c("c_g");
        ayqi.c((AtomicReference) c2.b().q(ick.h).C().R(new aypv() { // from class: jbw
            @Override // defpackage.aypv
            public final void a() {
                acvg acvgVar = acvg.this;
                amvn amvnVar = jcq.a;
                acvgVar.c("c_c");
            }
        }));
        jcqVar.h = true;
    }
}
