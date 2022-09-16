package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: iyw  reason: default package */
/* loaded from: classes7.dex */
public class iyw implements jbx {
    @dzsi
    public ValueAnimator a;
    protected int b;
    @dzsi
    private final cjtd e;
    @dzsi
    private jbw f = null;
    private final cqrp d = cqrp.d(3.0d);
    protected int c = 3;
    private boolean g = true;

    public iyw(int i, int i2, @dzsi cjtd cjtdVar, @dzsi jbw jbwVar) {
        this.e = cjtdVar;
    }

    public static iyv OR() {
        return new iyv();
    }

    private final void a(long j, int i, int i2) {
        bvrj.UI_THREAD.c();
        t();
        this.b = i;
        ValueAnimator v = v(i);
        this.a = v;
        v.setDuration(j);
        this.a.setInterpolator(new LinearInterpolator());
        this.a.addUpdateListener(new iyt(this));
        this.a.addListener(new iyu(this));
        this.c = i2;
        this.a.start();
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final ValueAnimator v(int i) {
        return ValueAnimator.ofInt(i, 1000);
    }

    @Override // defpackage.jbv
    /* renamed from: OS */
    public cqrp u() {
        return this.d;
    }

    public final void OT() {
        int intValue;
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator == null || (intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue()) == this.b) {
            return;
        }
        this.b = intValue;
        jbw jbwVar = this.f;
        if (jbwVar != null) {
            jbwVar.c(intValue, f().intValue());
        }
        cqkx.p(this);
    }

    @Override // defpackage.jbv
    public Integer e() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.jbv
    public Integer f() {
        return 1000;
    }

    @Override // defpackage.jbv
    public Boolean g() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.jbx
    public void h() {
        a(300L, e().intValue(), 2);
    }

    @Override // defpackage.jbx
    public void i() {
        bvrj.UI_THREAD.c();
        int intValue = f().intValue();
        this.b = intValue;
        jbw jbwVar = this.f;
        if (jbwVar != null) {
            jbwVar.c(intValue, f().intValue());
        }
        s();
    }

    @Override // defpackage.jbx
    public void j(long j) {
        a(j, 0, 1);
    }

    @Override // defpackage.jbx
    public void k() {
        bvrj.UI_THREAD.c();
        if (t()) {
            a(300L, e().intValue(), 4);
            jbw jbwVar = this.f;
            if (jbwVar != null) {
                jbwVar.b();
            }
            cqkx.p(this);
        }
    }

    @Override // defpackage.jbv
    public Boolean l() {
        return Boolean.valueOf(this.c == 4);
    }

    @Override // defpackage.jbv
    @dzsi
    public cjtd m() {
        return this.e;
    }

    @Override // defpackage.jbx
    public Boolean n() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jbx
    public void p(boolean z) {
        bvrj.UI_THREAD.c();
        this.g = z;
        cqkx.p(this);
    }

    @Override // defpackage.jbx
    public void q(@dzsi jbw jbwVar) {
        this.f = jbwVar;
    }

    public final void s() {
        if (this.a != null) {
            if (this.c != 4) {
                this.c = 3;
                jbw jbwVar = this.f;
                if (jbwVar != null) {
                    jbwVar.a();
                }
            }
            this.a = null;
            cqkx.p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            return true;
        }
        return false;
    }
}
