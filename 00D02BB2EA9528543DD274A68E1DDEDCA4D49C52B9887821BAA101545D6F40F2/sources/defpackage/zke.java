package defpackage;

import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: zke  reason: default package */
/* loaded from: classes7.dex */
public class zke extends iyw implements zce, jbw {
    private String d;

    public zke() {
        super(cpnx.a, 3, null, null);
        this.d = "";
    }

    @Override // defpackage.jbw
    public void a() {
        p(false);
    }

    @Override // defpackage.jbw
    public void b() {
        p(false);
    }

    @Override // defpackage.jbw
    public void c(int i, int i2) {
    }

    @Override // defpackage.zce
    public void d(long j) {
        w(j, new eho(0.0f, 0.6f, 0.5f, 0.8f));
    }

    @Override // defpackage.iyw, defpackage.jbx
    public void j(long j) {
        throw null;
    }

    @Override // defpackage.zce
    public String o() {
        return this.d;
    }

    @Override // defpackage.zce
    public void r(String str) {
        if (!this.d.equals(str)) {
            this.d = str;
            cqkx.p(this);
        }
    }

    public void w(long j, Interpolator interpolator) {
        bvrj.UI_THREAD.c();
        t();
        this.b = 0;
        this.a = v(0);
        this.a.setDuration(j);
        this.a.setInterpolator(interpolator);
        this.a.addUpdateListener(new zkb(this));
        this.a.addListener(new zkc(this));
        this.c = 1;
        this.a.start();
        p(true);
        cqkx.p(this);
    }
}
