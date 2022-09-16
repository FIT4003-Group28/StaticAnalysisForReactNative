package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: zsd  reason: default package */
/* loaded from: classes7.dex */
public class zsd implements View.OnAttachStateChangeListener, zec, cqfc {
    private static final cqrp a = cqrp.d(30.0d);
    private static final cqrp b = cqrp.d(2.0d);
    private final Context c;
    private final cjqq d;
    private final zsc e;
    private final Set<zwo> f;
    private final cjtd g;
    private boolean h;
    private final dpfx i;
    private final boolean j;
    private final cprx<zwh> k;
    private final cpru<zwh> l;
    private final zwd m;
    private final List<zwn> n;
    private final cpsm o;
    private final cprj p;

    public zsd(Application application, cjqq cjqqVar, dpfx dpfxVar, boolean z) {
        this((Context) application, cjqqVar, dpfxVar, z);
    }

    @Override // defpackage.cqfc
    public void a(View view, boolean z) {
        g();
    }

    @Override // defpackage.zec
    public acmy<zwg, zwh> b() {
        dpfw dpfwVar;
        acmx a2 = acmy.a();
        a2.a = this.k;
        a2.b = this.l;
        a2.c = this.m;
        for (zwn zwnVar : this.n) {
            String concat = String.valueOf(zwnVar.f).concat("_renderer");
            a2.c(concat, zwc.a(this.c, this.j));
            a2.d(concat, zwnVar);
        }
        a2.d = a.e(this.c);
        a2.e = this.o;
        Context context = this.c;
        dpfx dpfxVar = this.i;
        if ((dpfxVar.a & 4) != 0) {
            dpfwVar = dpfxVar.d;
            if (dpfwVar == null) {
                dpfwVar = dpfw.c;
            }
        } else {
            dpfwVar = null;
        }
        a2.b(new zvy(context, dpfwVar), "traffic_trend_axis_range_highlighter");
        a2.j = this.p;
        a2.h = 0;
        return a2.a();
    }

    @Override // defpackage.zec
    public CharSequence c() {
        return this.c.getString(R.string.ACCESSIBILITY_TRAFFIC_TREND_BAR_CHART);
    }

    @Override // defpackage.zec
    public View.OnAttachStateChangeListener d() {
        return this;
    }

    @Override // defpackage.zec
    public cqfc e() {
        return this;
    }

    @Override // defpackage.zec
    public cjtd f() {
        return this.g;
    }

    public void g() {
        zwf zwfVar;
        if (!this.j) {
            return;
        }
        for (zwo zwoVar : this.f) {
            zsc zscVar = this.e;
            if (zwoVar.l().isEmpty()) {
                zwfVar = zwf.HISTORICAL_ONLY;
            } else {
                zwfVar = ((zwn) zwoVar.l().get(0).a.g(zwn.c)).d;
            }
            if (zwfVar == zwf.HISTORICAL_ONLY && zwoVar.getVisibility() == 0) {
                zwoVar.getLocationOnScreen(zscVar.b);
                int[] iArr = zscVar.b;
                int i = iArr[0];
                int i2 = iArr[1];
                if (i >= 0 && i2 >= 0) {
                    int width = zwoVar.getWidth();
                    float scaleX = zwoVar.getScaleX();
                    int height = (int) (i2 + (zwoVar.getHeight() * zwoVar.getScaleY()));
                    ((WindowManager) zwoVar.getContext().getSystemService("window")).getDefaultDisplay().getSize(zscVar.c);
                    if (((int) (i + (width * scaleX))) <= zscVar.c.x && height + zsc.a.a(zwoVar.getContext()) <= zscVar.c.y) {
                        zwoVar.setTransitionMs(1500);
                        zwoVar.setState(zwf.HISTORICAL_AND_REALTIME);
                        zwoVar.m(true);
                        if (!this.h) {
                            this.h = true;
                            cjqp g = this.d.g();
                            cjta c = cjtd.c(this.g);
                            c.d = dtxn.cS;
                            g.d(c.a());
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (!(view instanceof zwo)) {
            return;
        }
        this.f.add((zwo) view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f.remove(view);
    }

    public zsd(Context context, cjqq cjqqVar, dpfx dpfxVar, boolean z) {
        double d;
        dpfw dpfwVar;
        this.e = new zsc();
        this.f = new HashSet();
        this.c = context;
        this.d = cjqqVar;
        cjta b2 = cjtd.b();
        b2.d = dtxn.cR;
        b2.g(dpfxVar.b);
        this.g = b2.a();
        this.h = false;
        this.i = dpfxVar;
        this.j = z;
        ArrayList f = dchl.f(dpfxVar.c.size());
        for (dpfu dpfuVar : dpfxVar.c) {
            f.add(new zwh(dpfuVar));
        }
        this.k = new cprs(f);
        this.l = new zwe(context);
        zwd zwdVar = new zwd(context);
        zwdVar.a = zwd.a(context);
        this.m = zwdVar;
        List<zwn> a2 = zwn.a(context, dpfxVar);
        this.n = a2;
        for (zwn zwnVar : a2) {
            if (!z) {
                zwnVar.d = zwf.HISTORICAL_AND_REALTIME;
            }
        }
        this.o = cpsm.d(b.e(context));
        if ((dpfxVar.a & 4) != 0) {
            d = Math.max((double) dcyn.a, (dpfxVar.d == null ? dpfw.c : dpfwVar).b);
        } else {
            d = 0.0d;
        }
        for (dpfp dpfpVar : dpfxVar.e) {
            for (dpfn dpfnVar : dpfpVar.a) {
                d = Math.max(d, dpfnVar.b);
            }
        }
        this.p = cprk.a(Double.valueOf((double) dcyn.a), Double.valueOf(d));
    }
}
