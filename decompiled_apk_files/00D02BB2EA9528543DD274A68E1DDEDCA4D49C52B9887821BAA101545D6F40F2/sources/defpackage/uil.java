package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uil  reason: default package */
/* loaded from: classes7.dex */
public class uil implements uik {
    private static final cqtv a = ibn.d();
    private final Activity b;
    private final uic c;
    private int d;

    public uil(Activity activity, uic uicVar) {
        this.b = activity;
        this.c = uicVar;
    }

    @Override // defpackage.uik
    public Integer a() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.uik
    public bwob b() {
        return this.c.b();
    }

    public void c(int i) {
        this.d = i;
        this.c.b().C(i + a.e(this.b));
        d();
    }

    public void d() {
        cqkx.p(this);
    }
}
