package defpackage;

import android.animation.ObjectAnimator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vqp  reason: default package */
/* loaded from: classes4.dex */
public final class vqp {
    public static final vqp a = new vqp(1, 1);
    private static final vqn h = new vqn();
    public final long b;
    public boolean c;
    public vqk d;
    public ObjectAnimator e;
    public final List f = new CopyOnWriteArrayList();
    public boolean g;

    public vqp(long j, long j2) {
        this.b = j2;
        this.d = new vql(0L, j);
    }

    public static double a(double d, double d2, float f) {
        double d3 = f;
        Double.isNaN(d3);
        return d + ((d2 - d) * d3);
    }

    public final float b(long j) {
        return this.d.a(j);
    }

    public final float c(long j) {
        aqxo.y(this.c);
        aqxo.y(!j());
        aqxo.y(this.d instanceof vql);
        vql vqlVar = (vql) this.d;
        long j2 = vqlVar.a;
        long j3 = j2 + j;
        long j4 = vqlVar.b + j;
        long j5 = 0;
        if (j3 < 0) {
            j5 = -j3;
        } else {
            long j6 = this.b;
            if (j4 > j6) {
                j5 = j6 - j4;
            }
        }
        vql vqlVar2 = new vql(j3 + j5, j4 + j5);
        this.d = vqlVar2;
        float a2 = vqlVar2.a(j2);
        g();
        return a2;
    }

    public final long d(float f) {
        return this.d.b(f);
    }

    public final long e(float f) {
        return this.d.c(f);
    }

    public final void f(vqm vqmVar) {
        this.f.add(vqmVar);
    }

    public final void g() {
        for (vqm vqmVar : this.f) {
            vqmVar.r(this);
        }
    }

    public final void h(vqm vqmVar) {
        this.f.remove(vqmVar);
    }

    public final void i(long j, long j2, boolean z, boolean z2) {
        aqxo.p(j < j2);
        vql vqlVar = new vql(j, j2);
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.e = null;
        }
        aqxo.y(this.d instanceof vql);
        if (z) {
            vql vqlVar2 = (vql) this.d;
            vql vqlVar3 = true != z2 ? vqlVar : vqlVar2;
            if (true == z2) {
                vqlVar2 = vqlVar;
            }
            vqj vqjVar = new vqj(this, vqlVar3, vqlVar2, vqlVar);
            float f = 1.0f;
            float f2 = true != z2 ? 1.0f : 0.0f;
            if (true != z2) {
                f = 0.0f;
            }
            vqjVar.d(f2);
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            this.e = objectAnimator2;
            objectAnimator2.setTarget(vqjVar);
            ObjectAnimator objectAnimator3 = this.e;
            vqn vqnVar = h;
            objectAnimator3.setProperty(vqnVar);
            this.e.setPropertyName(vqnVar.getName());
            this.e.setFloatValues(f);
            this.e.addListener(new vqo(this, vqlVar));
            this.e.setDuration(150L);
            this.e.start();
            this.d = vqjVar;
        } else {
            this.d = vqlVar;
            g();
        }
        boolean z3 = this.c;
        this.c = z2;
        if (z3 != z2) {
            for (vqm vqmVar : this.f) {
                vqmVar.J();
            }
        }
    }

    public final boolean j() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final void k(long j, long j2) {
        aqxo.y(this.c);
        i(j, j2, true, false);
    }

    public final void l(long j, long j2) {
        aqxo.y(!this.c);
        i(j, j2, true, true);
    }
}
