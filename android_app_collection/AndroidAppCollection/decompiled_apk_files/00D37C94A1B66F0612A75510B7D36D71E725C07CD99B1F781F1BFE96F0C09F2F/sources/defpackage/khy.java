package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import j$.util.Collection;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: khy  reason: default package */
/* loaded from: classes3.dex */
public final class khy implements ffo {
    final aiby e;
    final ffm f;
    final ffn g;
    final ffl h;
    public final boolean i;
    public InlineTimeBarWrapper j;
    private aibt k;
    private khx m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private final Set l = new HashSet();
    public final Set a = new HashSet();
    public Set b = amyg.a;
    public Set c = amyg.a;
    public Set d = amyg.a;

    public khy(axxu axxuVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ayqi.c((AtomicReference) axxuVar.a.a.V(axxk.r).B().an(false).S(new ldk(atomicBoolean, 1)));
        this.i = atomicBoolean.get();
        this.e = new aiby() { // from class: kht
            @Override // defpackage.aiby
            public final void nt(int i, long j) {
                for (aiby aibyVar : khy.this.a) {
                    aibyVar.nt(i, j);
                }
            }
        };
        this.f = new khw(this);
        this.g = new ffn() { // from class: khr
            @Override // defpackage.ffn
            public final void a(MotionEvent motionEvent) {
                khy khyVar = khy.this;
                if (!khyVar.c.isEmpty()) {
                    ((ffn) khyVar.c.iterator().next()).a(motionEvent);
                }
            }
        };
        this.h = new ffl() { // from class: khl
            @Override // defpackage.ffl
            public final void a() {
                for (ffl fflVar : khy.this.d) {
                    fflVar.a();
                }
            }
        };
    }

    private final long D(Function function, String str) {
        khx khxVar = this.m;
        if (khxVar == null) {
            zep.m("WatchWhileTimeBarController", String.format("%s: no active timebar", str));
            return 0L;
        }
        return ((Long) function.apply(khxVar.a)).longValue();
    }

    private final void E(Consumer consumer, String str) {
        khx khxVar = this.m;
        if (khxVar == null) {
            zep.m("WatchWhileTimeBarController", String.format("%s: no active timebar", str));
        } else {
            consumer.accept(khxVar.a);
        }
    }

    private final void F(final Consumer consumer) {
        Collection.EL.stream(this.l).forEach(new Consumer() { // from class: khq
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                Consumer.this.accept(((khx) obj).a);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return consumer2.getClass();
            }
        });
    }

    @Override // defpackage.ffo
    public final void A(int i) {
        this.n = i;
        F(new khu(i, 1));
    }

    @Override // defpackage.ffo
    public final long c() {
        return D(jsa.e, "getScrubberPositionTimeMillis");
    }

    public final View f(ViewStub viewStub, Predicate predicate) {
        aqxo.z(this.i, "wrong arm");
        InlineTimeBarWrapper inlineTimeBarWrapper = (InlineTimeBarWrapper) viewStub.inflate();
        inlineTimeBarWrapper.setVisibility(0);
        o(inlineTimeBarWrapper.a, predicate);
        return inlineTimeBarWrapper;
    }

    @Override // defpackage.ffo
    public final void g(View view) {
        E(new kho(view, 1), "addExcludeTouchView");
        this.q = true;
    }

    @Override // defpackage.ffo
    public final void h() {
        E(fyb.t, "dismissScrub");
    }

    @Override // defpackage.ffo
    public final void i(final Rect rect) {
        E(new Consumer() { // from class: khn
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((ffo) obj).i(rect);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        }, "getScrubberBounds");
    }

    @Override // defpackage.ffo
    public final void j(final Point point) {
        E(new Consumer() { // from class: khm
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((ffo) obj).j(point);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        }, "getSeekTimePosition");
    }

    @Override // defpackage.aibw
    public final long kH() {
        return D(jsa.f, "getDisplayCurrentTimeMillis");
    }

    @Override // defpackage.aibw
    public final long kI() {
        return D(jsa.h, "getRelativeBufferedTimeMillis");
    }

    @Override // defpackage.aibw
    public final long kJ() {
        return D(jsa.i, "getRelativeTotalTimeMillis");
    }

    @Override // defpackage.aibw
    public final boolean kM() {
        jsa jsaVar = jsa.j;
        khx khxVar = this.m;
        if (khxVar == null) {
            zep.m("WatchWhileTimeBarController", String.format("%s: no active timebar", "isScrubbing"));
            return false;
        }
        return ((Boolean) jsaVar.apply(khxVar.a)).booleanValue();
    }

    @Override // defpackage.aibw
    public final void kN() {
        E(new fyb(19), "setScrubbing");
    }

    @Override // defpackage.aibw
    public final long kO() {
        return D(jsa.g, "getDisplayScrubberTimeMillis");
    }

    @Override // defpackage.aibz
    public final void kP(aiby aibyVar) {
        this.a.add(aibyVar);
    }

    @Override // defpackage.ffo
    public final void l() {
        E(khv.a, "maybeCompleteScrub");
    }

    @Override // defpackage.ffo
    public final void m(int i) {
        E(new khu(i), "maybeMoveScrub");
    }

    @Override // defpackage.ffo
    public final void n(int i) {
        E(new khu(i, 2), "maybeStartScrub");
    }

    public final void o(ffo ffoVar, Predicate predicate) {
        aqxo.z(this.i || this.l.isEmpty(), "there can only be one (reparented timebar)");
        aqxo.z(!this.q, "cannot add timebar after finalization");
        this.l.add(new khx(ffoVar, predicate));
        aibt aibtVar = this.k;
        if (aibtVar == null) {
            this.k = (aibt) ((aibs) ffoVar).r;
        } else {
            ffoVar.y(aibtVar);
        }
        ffoVar.kP(this.e);
        ffh ffhVar = (ffh) ffoVar;
        ffhVar.q = this.f;
        ffoVar.r(this.g);
        ffhVar.p = ampq.j(this.h);
        ffoVar.A(this.n);
        ffoVar.w(this.o);
        ffoVar.setClickable(this.p);
    }

    @Override // defpackage.ffo
    public final void p(boolean z) {
        E(new kgs(z, 2), "revealScrubber");
    }

    @Override // defpackage.aibz
    public final void q(aiby aibyVar) {
        this.a.remove(aibyVar);
    }

    @Override // defpackage.ffo
    public final void r(ffn ffnVar) {
        this.c = amvn.r(ffnVar);
    }

    @Override // defpackage.ffo
    public final void s(boolean z) {
        F(new kgs(z, 4));
    }

    @Override // defpackage.aibw
    public final void sendAccessibilityEvent(int i) {
        E(new khv(), "sendAccessibilityEvent");
    }

    @Override // defpackage.aibw
    public final void setAlpha(float f) {
        E(new kmf(f, 1), "setAlpha");
    }

    @Override // defpackage.ffo
    public final void setClickable(boolean z) {
        this.p = z;
        F(new kgs(z, 3));
    }

    @Override // defpackage.ffo
    public final void setVisibility(int i) {
        throw null;
    }

    @Override // defpackage.ffo
    public final void t(View view) {
        F(new kho(view));
        this.q = true;
    }

    @Override // defpackage.ffo
    public final void u(int i) {
        E(new khu(i, 3), "setScrubberMode");
    }

    @Override // defpackage.ffo
    public final void v(ffm ffmVar) {
        this.b = amvn.r(ffmVar);
    }

    @Override // defpackage.ffo
    public final void w(int i) {
        this.o = i;
        F(new khu(i, 4));
    }

    @Override // defpackage.ffo
    public final void x(final boolean z, final boolean z2) {
        E(new Consumer() { // from class: khs
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((ffo) obj).x(z, z2);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        }, "setVisible");
    }

    @Override // defpackage.aibw
    public final /* bridge */ /* synthetic */ void y(aibx aibxVar) {
        final aibt aibtVar = (aibt) aibxVar;
        this.k = aibtVar;
        F(new Consumer() { // from class: khp
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((ffo) obj).y(aibt.this);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    public final void z(ezx ezxVar) {
        khx khxVar;
        Iterator it = this.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                khxVar = null;
                break;
            }
            khxVar = (khx) it.next();
            if (khxVar.b.test(ezxVar)) {
                break;
            }
        }
        if (this.m == khxVar) {
            return;
        }
        for (khx khxVar2 : this.l) {
            if (khxVar2 != khxVar) {
                khxVar2.a.setVisibility(8);
            }
        }
        this.m = khxVar;
        if (khxVar == null) {
            return;
        }
        khxVar.a.setVisibility(0);
    }
}
