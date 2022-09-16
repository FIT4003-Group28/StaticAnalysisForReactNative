package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: PG */
/* renamed from: aouz  reason: default package */
/* loaded from: classes2.dex */
public final class aouz implements angv, angx {
    public static final dcqe a = dcqe.c("aouz");
    public final aoup<aogb, aoge> b;
    private final anhz c;
    private final ConcurrentLinkedQueue<WeakReference<anfu>> d = new ConcurrentLinkedQueue<>();
    private final bvrb e;
    private final cqat f;

    public aouz(bvrb bvrbVar, cqat cqatVar, anhz anhzVar, angy angyVar) {
        this.e = bvrbVar;
        this.f = cqatVar;
        this.c = anhzVar;
        this.b = aoup.c(bvrbVar, 15);
        angyVar.a(this);
    }

    private final void p() {
        Iterator<WeakReference<anfu>> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    @Override // defpackage.angq
    public final void b() {
        this.b.b();
        m();
    }

    @Override // defpackage.angv
    public final angu<aogb, aoge> c(aogb aogbVar, dbsg<String> dbsgVar) {
        angu<aogb, aoge> a2 = this.b.a(aogbVar);
        if (!((aouv) a2).c.e()) {
            o(aogbVar, 2, dbsgVar);
        }
        return a2;
    }

    @Override // defpackage.angv
    public final void d(aogb aogbVar) {
        o(aogbVar, 2, dbpy.a);
    }

    @Override // defpackage.angv
    public final void e() {
        dcdc<angu<aogb, aoge>> i = this.b.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            angu<aogb, aoge> anguVar = i.get(i2);
            if (anguVar.b().e()) {
                d(anguVar.a());
            }
        }
    }

    @Override // defpackage.angv
    public final dcdc<angu<aogb, aoge>> f() {
        dccx dccxVar = new dccx();
        dcdc<angu<aogb, aoge>> i = this.b.i();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            angu<aogb, aoge> anguVar = i.get(i2);
            if (anguVar.b().e()) {
                dccxVar.g(anguVar);
            }
        }
        return dccxVar.f();
    }

    @Override // defpackage.angv
    public final void g(aoge aogeVar) {
        aogb g = aogeVar.g();
        if (!a(g).b().e()) {
            this.b.d(g, aogeVar);
            o(g, 2, dbpy.a);
        }
    }

    @Override // defpackage.angv
    public final void h(aogb aogbVar) {
        this.b.j(aogbVar);
        m();
    }

    @Override // defpackage.angv
    public final void i() {
        aogb aogbVar;
        aogb f = aogb.f(new eapg(this.f.b(), eaou.b));
        dcdc h = dcdc.h(f.j(), f, f.i());
        int size = h.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aogbVar = null;
                break;
            }
            aogbVar = (aogb) h.get(i);
            i++;
            if (a(aogbVar).b().e()) {
                break;
            }
        }
        for (aogb aogbVar2 : dchl.k(this.b.i(), aoux.a)) {
            if (!aogbVar2.equals(aogbVar)) {
                h(aogbVar2);
            }
        }
    }

    @Override // defpackage.angv
    public final void j(anfu anfuVar) {
        p();
        Iterator<WeakReference<anfu>> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().get() == anfuVar) {
                return;
            }
        }
        this.d.add(new WeakReference<>(anfuVar));
    }

    @Override // defpackage.angx
    public final void k(duxy duxyVar, duya duyaVar) {
        if (duxyVar.b != 5 || !((Boolean) duxyVar.c).booleanValue()) {
            if (duxyVar.b != 3) {
                return;
            }
            b();
            return;
        }
        b();
    }

    @Override // defpackage.angx
    public final void l() {
    }

    public final void m() {
        p();
        Iterator<WeakReference<anfu>> it = this.d.iterator();
        while (it.hasNext()) {
            final WeakReference<anfu> next = it.next();
            this.e.b(new Runnable(next) { // from class: aouw
                private final WeakReference a;

                {
                    this.a = next;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    anfu anfuVar = (anfu) this.a.get();
                    if (anfuVar != null) {
                        anfuVar.a.c();
                    }
                }
            }, bvrj.UI_THREAD);
        }
    }

    @Override // defpackage.angq
    /* renamed from: n */
    public final angu<aogb, aoge> a(aogb aogbVar) {
        return this.b.a(aogbVar);
    }

    public final void o(aogb aogbVar, int i, dbsg<String> dbsgVar) {
        if (i == 1) {
            this.b.h(aogbVar);
        } else {
            this.b.g(aogbVar);
        }
        m();
        this.c.a(aogbVar, dbsgVar, new aouy(this, aogbVar));
    }
}
