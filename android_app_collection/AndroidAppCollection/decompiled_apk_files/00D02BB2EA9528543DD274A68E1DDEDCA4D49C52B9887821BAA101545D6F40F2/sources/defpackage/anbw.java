package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: anbw  reason: default package */
/* loaded from: classes2.dex */
public final class anbw implements Runnable {
    final /* synthetic */ anbx a;
    private final WeakReference<akzh> b;
    private final dcdc<Integer> c;
    private float d;
    private int e = -1;

    public anbw(anbx anbxVar, WeakReference<akzh> weakReference, dkjo dkjoVar) {
        this.a = anbxVar;
        this.b = weakReference;
        this.c = dcdc.q(dcft.o(dkjoVar.g, anbv.a));
        akzh akzhVar = weakReference.get();
        dbsk.s(akzhVar);
        this.d = akzhVar.k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        akzh akzhVar;
        aktd aktdVar;
        if (!this.c.isEmpty() && (akzhVar = this.b.get()) != null) {
            this.a.d.a().b(this);
            float k = akzhVar.k();
            if (k == this.d) {
                return;
            }
            int i = -1;
            int size = this.c.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (this.c.get(size).intValue() <= k) {
                    i = size;
                    break;
                }
                size--;
            }
            if (i != this.e) {
                synchronized (this.a.j) {
                    for (anbn anbnVar : this.a.j.values()) {
                        if (anbnVar.g && (aktdVar = anbnVar.f) != null) {
                            dbsg<dmpn> d = anbnVar.d();
                            if (d.a()) {
                                dmpn b = d.b();
                                if (!b.equals(aktdVar.k())) {
                                    anbnVar.d.a().e(aktdVar);
                                    anbnVar.f = anbnVar.a(b);
                                }
                            }
                        }
                    }
                }
                this.e = i;
            }
            this.d = k;
        }
    }
}
