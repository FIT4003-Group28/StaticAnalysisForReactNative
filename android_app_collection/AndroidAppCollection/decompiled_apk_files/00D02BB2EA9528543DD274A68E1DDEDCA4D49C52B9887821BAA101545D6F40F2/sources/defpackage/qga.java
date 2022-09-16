package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: qga  reason: default package */
/* loaded from: classes7.dex */
public final class qga {
    private static final dcqe c = dcqe.c("qga");
    public final Activity a;
    public final qho b;
    private final qgt d;
    private final qgm e;

    public qga(Activity activity, qgt qgtVar, qgm qgmVar, qho qhoVar) {
        this.a = activity;
        this.d = qgtVar;
        this.e = qgmVar;
        this.b = qhoVar;
    }

    public static dcdc<qhu> c(qib qibVar, final akqq akqqVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(qibVar.c());
        }
        dcdc<qhu> d = qibVar.d();
        int size = d.size();
        for (int i = 0; i < size; i++) {
            qhu qhuVar = d.get(i);
            if (akqo.e(akqqVar, qhuVar.a()) < 1000.0d) {
                arrayList.add(qhuVar);
            }
        }
        dcdc<qhu> w = dcdc.w(new Comparator(akqqVar) { // from class: qfz
            private final akqq a;

            {
                this.a = akqqVar;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                akqq akqqVar2 = this.a;
                return Double.compare(akqo.e(akqqVar2, ((qhu) obj).a()), akqo.e(akqqVar2, ((qhu) obj2).a()));
            }
        }, arrayList);
        return w.size() <= 3 ? w : w.subList(0, 3);
    }

    private final void d() {
        if (this.d.d()) {
            this.d.b();
        }
    }

    private final void e() {
        if (this.e.d()) {
            this.e.b();
        }
    }

    public final void a(amte amteVar, int i) {
        dcdc<qhu> d;
        amub b = amteVar.b(i, this.a);
        if (b == null) {
            b();
        } else if (b.h == dqvj.BIKESHARING) {
            amsq b2 = amsr.b(b.d);
            if (b2 == amsq.DOCKED_BIKESHARING) {
                qhy b3 = this.b.b(b.d);
                if (b3 == null) {
                    bvoo.h("unable to parse docked bikesharing result", new Object[0]);
                    b();
                    return;
                }
                d();
                qhq d2 = b3.d();
                dcdc<qhq> e = b3.e();
                qhq f = b3.f();
                dcdc<qhq> g = b3.g();
                if (this.e.e(e, g)) {
                    return;
                }
                if (this.e.d()) {
                    this.e.c(d2, e, f, g);
                } else {
                    this.e.a(d2, e, f, g);
                }
            } else if (b2 != amsq.DOCKLESS_BIKESHARING) {
            } else {
                qib a = this.b.a(b.d);
                if (a == null) {
                    bvoo.h("unable to parse dockless bikesharing result", new Object[0]);
                    b();
                    return;
                }
                e();
                if (amteVar.d() != dqvj.BICYCLE) {
                    akqq akqqVar = amteVar.e().e;
                    if (akqqVar != null) {
                        d = c(a, akqqVar, false);
                    } else {
                        d = dcdc.e();
                    }
                } else {
                    d = a.d();
                }
                qhu c2 = a.c();
                if (this.d.e(c2, d)) {
                    return;
                }
                if (this.d.d()) {
                    this.d.c(c2, d);
                } else {
                    this.d.a(c2, d);
                }
            }
        } else {
            b();
        }
    }

    public final void b() {
        d();
        e();
    }
}
