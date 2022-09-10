package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: iwb  reason: default package */
/* loaded from: classes.dex */
public class iwb implements izd {
    public final bvkx a;
    public final Executor b;
    public AnimatorSet c = new AnimatorSet();
    public boolean d = false;
    private final List<ize> e;
    private final iwa f;

    public iwb(isu isuVar, bvkx bvkxVar, Executor executor) {
        int i;
        if (isuVar.c.isEmpty()) {
            dccx F = dcdc.F();
            int size = isuVar.d.size();
            int i2 = 3;
            if (isuVar.d.size() > 3) {
                i = isuVar.a.nextInt(isuVar.d.size() - 2);
            } else {
                i2 = size;
                i = 0;
            }
            cqss n = ibm.n();
            if (isuVar.e) {
                for (int i3 = 0; i3 < i2; i3++) {
                    F.g(new iss(isuVar.d.get(i + i3), n));
                }
            }
            F.g(new ist(isuVar, n));
            isuVar.c = F.f();
        }
        this.e = isuVar.c;
        this.a = bvkxVar;
        this.b = executor;
        this.f = new iwa(this);
    }

    public static ObjectAnimator e(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
        ofFloat.setInterpolator(irf.a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    public static ObjectAnimator f(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ofFloat.setInterpolator(irf.a);
        ofFloat.setDuration(500L);
        return ofFloat;
    }

    @Override // defpackage.izd
    public List<ize> a() {
        return this.e;
    }

    public void b() {
        this.c.end();
        this.c = new AnimatorSet();
    }

    public void c(boolean z) {
        this.d = true;
    }

    @Override // defpackage.izd
    public cqfc d() {
        return this.f;
    }
}
