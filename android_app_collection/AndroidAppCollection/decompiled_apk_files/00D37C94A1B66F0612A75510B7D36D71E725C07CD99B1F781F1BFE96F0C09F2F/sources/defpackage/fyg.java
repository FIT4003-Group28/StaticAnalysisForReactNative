package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: fyg  reason: default package */
/* loaded from: classes3.dex */
public final class fyg implements View.OnClickListener, fyh {
    public final Context a;
    public final akfb b;
    public FloatingActionButton d;
    public fxz e;
    public fxz f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public fyi i;
    public fyj j;
    public acti k;
    public boolean l;
    private final azqb m;
    private final ajxz n;
    private int p;
    public final fyf c = new fyf();
    private final fqj o = new fqj();

    public fyg(Context context, azqb azqbVar, ajxz ajxzVar, akfb akfbVar) {
        this.a = context;
        this.m = azqbVar;
        this.n = ajxzVar;
        this.b = akfbVar;
    }

    private final void i(fxz fxzVar) {
        this.e = fxzVar;
        b();
        if (fxzVar != null) {
            fyi a = a(fxzVar);
            if (a != null) {
                a.b();
                a.c(this.p);
                if (a instanceof fyj) {
                    fyj fyjVar = (fyj) a;
                    fyf fyfVar = this.c;
                    int a2 = fyfVar.a(fxzVar);
                    fyjVar.f((View) Optional.ofNullable(a2 != -1 ? (gfo) fyfVar.b.get(a2) : null).map(eoo.m).orElse(null));
                }
            }
            final FloatingActionButton floatingActionButton = this.d;
            if (floatingActionButton != null) {
                Optional ofNullable = Optional.ofNullable(this.e);
                Optional map = ofNullable.map(eoo.l).map(eoo.i);
                final ajxz ajxzVar = this.n;
                ajxzVar.getClass();
                Optional map2 = map.map(new Function() { // from class: fyc
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(ajxz.this.a((arhr) obj));
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                });
                if (map2.isPresent()) {
                    map2.ifPresent(new Consumer() { // from class: fya
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            FloatingActionButton.this.setImageResource(((Integer) obj).intValue());
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return consumer.getClass();
                        }
                    });
                } else {
                    floatingActionButton.setImageDrawable(null);
                }
                floatingActionButton.setContentDescription((CharSequence) ofNullable.map(eoo.k).orElse(null));
            }
            g();
            return;
        }
        c(false);
    }

    private static final void j(ObjectAnimator objectAnimator) {
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        objectAnimator.cancel();
    }

    private static final boolean k(fxz fxzVar) {
        return (fxzVar instanceof fxy) || (fxzVar instanceof fyk);
    }

    public final fyi a(fxz fxzVar) {
        if (fxzVar instanceof fxx) {
            return this.i;
        }
        if (!(fxzVar instanceof fxy) && !(fxzVar instanceof fyk)) {
            return null;
        }
        return this.j;
    }

    public final void b() {
        Optional.ofNullable(this.j).ifPresent(fyb.c);
    }

    @Override // defpackage.fyh
    public final void c(boolean z) {
        FloatingActionButton floatingActionButton = this.d;
        if (floatingActionButton == null) {
            return;
        }
        if (!z) {
            j(this.g);
            floatingActionButton.setScaleX(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setVisibility(8);
            return;
        }
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator == null || objectAnimator.isStarted()) {
            return;
        }
        j(this.g);
        if (floatingActionButton.getVisibility() == 8) {
            return;
        }
        objectAnimator.start();
    }

    public final void d() {
        fxz fxzVar = this.f;
        if (fxzVar != null) {
            if (k(fxzVar) && !this.c.b(this.f)) {
                return;
            }
            i(this.f);
            this.f = null;
        }
    }

    public final void e() {
        FloatingActionButton floatingActionButton = this.d;
        if (floatingActionButton != null) {
            floatingActionButton.setTranslationY(0.0f);
            this.d.setScaleX(1.0f);
            this.d.setScaleY(1.0f);
            this.d.setVisibility(8);
        }
    }

    public final void f(fxz fxzVar) {
        if (!this.l) {
            return;
        }
        if (fxzVar != null) {
            if (this.e != fxzVar) {
                if (((Boolean) Optional.ofNullable(this.g).map(eoo.j).orElse(false)).booleanValue() || ((Boolean) Optional.ofNullable(this.h).map(eoo.j).orElse(false)).booleanValue() || (k(fxzVar) && !this.c.b(fxzVar))) {
                    this.f = fxzVar;
                    return;
                }
            } else {
                g();
                return;
            }
        }
        i(fxzVar);
        this.f = null;
    }

    @Override // defpackage.fyh
    public final void g() {
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        j(this.h);
        if (!((Boolean) Optional.ofNullable(this.d).map(eoo.h).orElse(false)).booleanValue()) {
            return;
        }
        c(false);
        objectAnimator.start();
    }

    public final void h(int i, int i2) {
        fyi a;
        this.o.c(i, i2);
        int i3 = this.o.a;
        this.p = i3;
        fxz fxzVar = this.e;
        if (fxzVar == null || (a = a(fxzVar)) == null) {
            return;
        }
        a.c(i3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        fxz fxzVar = this.e;
        if (fxzVar == null || (apzgVar = (apzg) Optional.ofNullable(fxzVar.a()).orElse(fxzVar.b())) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", fxzVar);
        ((aafo) this.m.get()).c(apzgVar, hashMap);
    }
}
