package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
/* compiled from: PG */
/* renamed from: allw  reason: default package */
/* loaded from: classes.dex */
public final class allw extends alme {
    public static final int[] a = {0, 1350, 2700, 4050};
    public static final int[] b = {667, 2017, 3367, 4717};
    public static final int[] c = {1000, 2350, 3700, 5050};
    private static final Property n = new allu(Float.class);
    private static final Property o = new allv(Float.class);
    public ObjectAnimator d;
    public final allr f;
    public float h;
    public float i;
    private ObjectAnimator p;
    public int g = 0;
    bol j = null;
    public final app e = new app();

    public allw(allr allrVar) {
        this.f = allrVar;
    }

    @Override // defpackage.alme
    public final void a() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.alme
    public final void b() {
        if (this.p == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.p = ofFloat;
            ofFloat.setDuration(5400L);
            this.p.setInterpolator(null);
            this.p.setRepeatCount(-1);
            this.p.addListener(new alls(this));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new allt(this));
        }
        this.g = 0;
        this.m[0] = amxp.x(this.f.c[0], this.k.i);
        this.i = 0.0f;
        this.p.start();
    }
}
