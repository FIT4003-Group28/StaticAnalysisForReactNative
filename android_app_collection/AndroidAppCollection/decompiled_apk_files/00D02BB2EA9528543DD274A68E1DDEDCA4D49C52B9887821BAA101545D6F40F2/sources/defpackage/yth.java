package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: yth  reason: default package */
/* loaded from: classes7.dex */
public class yth {
    public final btrm a;
    public final View b;
    public final ytg c = new ytg(this);
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = true;

    public yth(btrm btrmVar, View view) {
        this.a = btrmVar;
        this.b = view;
    }

    public final void a(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        if (z) {
            return;
        }
        e();
    }

    public final ViewPropertyAnimator b() {
        return this.b.animate().translationY(0.0f).setDuration(250L).setInterpolator(irf.b).withStartAction(new Runnable(this) { // from class: ytd
            private final yth a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.setVisibility(0);
            }
        });
    }

    public final void c() {
        if (!this.e || this.f || !this.g) {
            return;
        }
        this.f = true;
        d();
        b().setStartDelay(400L).start();
    }

    public final void d() {
        this.b.clearAnimation();
    }

    public final void e() {
        if (!this.e || !this.f) {
            return;
        }
        this.f = false;
        d();
        this.b.animate().translationY(this.b.getHeight()).setDuration(200L).setInterpolator(irf.c).withEndAction(new Runnable(this) { // from class: yte
            private final yth a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.setVisibility(4);
            }
        }).setStartDelay(0L).start();
    }

    public final void f() {
        this.f = false;
        View view = this.b;
        view.setTranslationY(view.getHeight());
        this.b.setVisibility(4);
    }
}
