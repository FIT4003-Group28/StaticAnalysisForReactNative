package defpackage;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: kkj  reason: default package */
/* loaded from: classes3.dex */
public final class kkj implements wkp, kku {
    public final kkv a;
    public final xiw b;
    CountDownTimer c;
    public long d;
    public boolean e;
    private final yzm f;
    private final wkt g;
    private final wwd h;
    private final wvx i;
    private final ezh j;
    private final acti k;
    private xcb l;
    private xdu m;
    private xci n;
    private wqw o;

    public kkj(kkv kkvVar, yzm yzmVar, xiw xiwVar, wkt wktVar, wwd wwdVar, wvx wvxVar, ezh ezhVar, acti actiVar) {
        kkvVar.getClass();
        this.a = kkvVar;
        yzmVar.getClass();
        this.f = yzmVar;
        xiwVar.getClass();
        this.b = xiwVar;
        wktVar.getClass();
        this.g = wktVar;
        wwdVar.getClass();
        this.h = wwdVar;
        wvxVar.getClass();
        this.i = wvxVar;
        ezhVar.getClass();
        this.j = ezhVar;
        actiVar.getClass();
        this.k = actiVar;
        f();
    }

    private final void f() {
        b();
        this.d = 0L;
        this.a.setVisibility(8);
        this.a.d();
        this.o = null;
        this.f.j(false);
    }

    private final void g() {
        this.l = null;
        this.n = null;
        this.m = null;
    }

    private final void h(int i) {
        xci xciVar = this.n;
        if (xciVar != null) {
            this.g.e(this.l, this.m, xciVar, i);
            this.g.u(this.n);
        }
        xdu xduVar = this.m;
        if (xduVar != null) {
            this.g.l(this.l, xduVar);
            this.g.p(this.l, this.m);
        }
        g();
    }

    public final void a(wzq wzqVar) {
        if (this.o != null) {
            h(xci.a(wzqVar));
            this.o.d(wzqVar);
        }
        f();
    }

    public final void b() {
        CountDownTimer countDownTimer = this.c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.c = null;
        }
    }

    @Override // defpackage.wkp
    public final void c() {
        h(4);
        f();
    }

    public final void d() {
        this.c = new kki(this, this.d).start();
    }

    @Override // defpackage.wkp
    public final boolean e(wqw wqwVar) {
        if (wqwVar.a().i() == null) {
            return false;
        }
        apax i = wqwVar.a().i();
        this.l = xcb.a(wqwVar.c(), wqwVar.b());
        xdu b = this.h.b();
        this.m = b;
        this.n = this.i.e(b, i);
        this.g.o(this.l, this.m);
        this.g.f(this.l, this.m, this.n);
        f();
        this.o = wqwVar;
        int d = apdw.d(i.f);
        if (d == 0 || d != 2 || !this.j.g().j()) {
            aunb aunbVar = i.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                this.e = i.g;
                this.d = TimeUnit.SECONDS.toMillis(i.d);
                d();
                if ((i.b & 64) != 0) {
                    kkv kkvVar = this.a;
                    apay apayVar = i.h;
                    if (apayVar == null) {
                        apayVar = apay.a;
                    }
                    kkvVar.k = apayVar;
                }
                aunb aunbVar2 = i.e;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                aqtb aqtbVar = (aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer);
                ampq ampqVar = this.n.i;
                this.f.j(true);
                ajrs ajrsVar = new ajrs();
                ajrsVar.g(new HashMap());
                ajrsVar.a(this.k);
                if (ampqVar.h()) {
                    aopa createBuilder = asjj.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    asjjVar.t = (asit) ampqVar.c();
                    asjjVar.c |= 1024;
                    ajrsVar.c = (asjj) createBuilder.mo39build();
                }
                kkv kkvVar2 = this.a;
                if (kkvVar2.f == null) {
                    kkvVar2.f = (ViewGroup) LayoutInflater.from(kkvVar2.getContext()).inflate(R.layout.ad_endcap_elements_overlay, kkvVar2);
                    kkvVar2.g = (ViewGroup) kkvVar2.f.findViewById(R.id.ad_endcap_elements_overlay);
                    kkvVar2.h = kkvVar2.f.findViewById(R.id.skip_ad_button);
                    ((RelativeLayout.LayoutParams) kkvVar2.h.getLayoutParams()).bottomMargin += kkvVar2.c;
                    kkvVar2.h.setOnClickListener(new kks(kkvVar2));
                    kkvVar2.h.setOnTouchListener(new kkt(kkvVar2));
                }
                kkvVar2.e = aqtbVar;
                ajin ajinVar = (ajin) kkvVar2.a.get();
                ajhh.a(kkvVar2.e);
                ajin ajinVar2 = (ajin) kkvVar2.a.get();
                kkvVar2.l = ajhh.a(kkvVar2.e);
                kkvVar2.g.addView(kkvVar2.b.a(), 0);
                kkvVar2.b.oK(ajrsVar, kkvVar2.l);
                kkvVar2.f.setVisibility(0);
                kkvVar2.g.setVisibility(0);
                kkvVar2.h.setVisibility(0);
                kkvVar2.e();
                this.g.i(this.l, this.m);
                this.g.b(this.l, this.m, this.n);
                return true;
            }
            this.g.u(this.n);
            this.g.p(this.l, this.m);
            g();
            return false;
        }
        this.g.i(this.l, this.m);
        this.g.b(this.l, this.m, this.n);
        a(wzq.AUTO_SKIPPED_ON_ENTER);
        return false;
    }
}
