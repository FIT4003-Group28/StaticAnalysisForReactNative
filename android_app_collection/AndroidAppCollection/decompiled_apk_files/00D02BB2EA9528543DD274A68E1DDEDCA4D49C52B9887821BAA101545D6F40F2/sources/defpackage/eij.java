package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eij  reason: default package */
/* loaded from: classes6.dex */
public final class eij implements View.OnAttachStateChangeListener {
    private final LottieAnimationView c;
    @dzsi
    private final gce d;
    private final Executor e;
    private crzp<Boolean> f;
    @dzsi
    public eik b = null;
    public boolean a = true;
    private String g = "";

    public eij(LottieAnimationView lottieAnimationView) {
        this.c = lottieAnimationView;
        gce gceVar = null;
        gch gchVar = (gch) btsr.a(gch.class);
        if (gchVar != null && gchVar.sD().a()) {
            gceVar = gchVar.sC();
        }
        this.d = gceVar;
        this.e = ((bvrk) btsr.a(bvrk.class)).sU();
    }

    private final boolean d() {
        eik eikVar = this.b;
        return eikVar != null && this.c.isAttachedToWindow() && eikVar.c();
    }

    public final void a(final eik eikVar) {
        String d = eikVar.d();
        if (!dbsj.d(d)) {
            if (this.c.c() && this.g.equals(d)) {
                return;
            }
            this.g = d;
        } else {
            this.g = "";
        }
        this.b = eikVar;
        eikVar.a(new Runnable(this, eikVar) { // from class: eig
            private final eij a;
            private final eik b;

            {
                this.a = this;
                this.b = eikVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b);
            }
        }, this.c.getResources());
    }

    public final void b(final eik eikVar) {
        if (!bvrj.UI_THREAD.b()) {
            this.c.post(new Runnable(this, eikVar) { // from class: eii
                private final eij a;
                private final eik b;

                {
                    this.a = this;
                    this.b = eikVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(this.b);
                }
            });
        } else if (this.b != eikVar || eikVar.b().isEmpty() || !eikVar.c()) {
        } else {
            this.c.setAnimationFromJson(eikVar.b(), this.g);
            c();
        }
    }

    public final void c() {
        if (this.b == null) {
            return;
        }
        if (this.c.c()) {
            if (d()) {
                return;
            }
            this.c.e();
        } else if (!this.a || !d()) {
        } else {
            this.c.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        c();
        gce gceVar = this.d;
        if (gceVar != null) {
            if (this.f == null) {
                this.f = new crzp(this) { // from class: eih
                    private final eij a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.crzp
                    public final void On(crzm crzmVar) {
                        eij eijVar = this.a;
                        eik eikVar = eijVar.b;
                        if (eikVar != null) {
                            eijVar.a(eikVar);
                        }
                    }
                };
            }
            gceVar.g().a(this.f, this.e);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        c();
        gce gceVar = this.d;
        if (gceVar == null || this.f == null) {
            return;
        }
        gceVar.g().c(this.f);
    }
}
