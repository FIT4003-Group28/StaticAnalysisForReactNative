package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: iwr  reason: default package */
/* loaded from: classes6.dex */
public class iwr implements izo {
    public final izn a;
    public int b;
    @dzsi
    public ValueAnimator c;
    public boolean d;
    private final dehq e;
    private final Executor f;
    @dzsi
    private bvpk g;

    public iwr(izn iznVar, dehq dehqVar, Executor executor) {
        this.a = iznVar;
        this.e = dehqVar;
        this.f = executor;
    }

    @Override // defpackage.izo
    public Integer a() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.izo
    public Integer b() {
        return 1000;
    }

    public boolean c() {
        return this.d;
    }

    public void d(long j) {
        bvrj.UI_THREAD.c();
        e();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1000);
        this.c = ofInt;
        ofInt.setDuration(j);
        this.c.setInterpolator(new LinearInterpolator());
        this.c.addUpdateListener(new iwp(this));
        this.c.addListener(new iwq(this));
        this.c.start();
        bvpk a = bvpk.a(new Runnable(this) { // from class: iwo
            private final iwr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                iwr iwrVar = this.a;
                iwrVar.d = true;
                iwrVar.a.a();
                cqkx.p(iwrVar);
            }
        });
        this.g = a;
        this.d = false;
        bvqd.a(this.e.d(a, j, TimeUnit.MILLISECONDS), this.f);
    }

    @Override // defpackage.izo
    public void e() {
        bvrj.UI_THREAD.c();
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        bvpk bvpkVar = this.g;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
    }

    public void f() {
        e();
        this.b = 0;
        this.d = false;
    }

    public void g() {
        f();
        cqkx.p(this);
    }

    public boolean h() {
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isStarted();
    }
}
