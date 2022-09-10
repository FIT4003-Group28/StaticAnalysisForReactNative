package defpackage;

import com.google.android.apps.gmm.map.ui.CompassButtonView;
/* compiled from: PG */
/* renamed from: amzr  reason: default package */
/* loaded from: classes.dex */
public final class amzr implements Runnable {
    final /* synthetic */ CompassButtonView a;
    private final akpq b;
    private final akzh c;
    private float d;
    private float e;

    public amzr(CompassButtonView compassButtonView, akzh akzhVar, akpq akpqVar) {
        this.a = compassButtonView;
        this.c = akzhVar;
        alad p = akzhVar.p();
        this.d = p.m;
        this.e = p.l;
        this.b = akpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this);
        alad p = this.c.p();
        final float f = p.m;
        final float f2 = p.l;
        if (Math.abs(f - this.d) >= 0.01f || Math.abs(f2 - this.e) >= 0.01f) {
            this.d = f;
            this.e = f2;
            this.a.post(new Runnable(this, f, f2) { // from class: amzq
                private final amzr a;
                private final float b;
                private final float c;

                {
                    this.a = this;
                    this.b = f;
                    this.c = f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    amzr amzrVar = this.a;
                    float f3 = this.b;
                    float f4 = this.c;
                    CompassButtonView compassButtonView = amzrVar.a;
                    cqtv cqtvVar = CompassButtonView.a;
                    compassButtonView.g(f3, f4);
                }
            });
        }
    }
}
