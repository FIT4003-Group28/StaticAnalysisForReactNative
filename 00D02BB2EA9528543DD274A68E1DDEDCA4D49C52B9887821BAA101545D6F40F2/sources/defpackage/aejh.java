package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aejh  reason: default package */
/* loaded from: classes2.dex */
public final class aejh extends gec {
    @dzsi
    public aekn ad;
    public boolean ae;
    public boolean af;
    public int ag;
    public View ah;
    public View ai;
    public View aj;
    public cqkj ak;
    public aeko al;
    private View am;

    public static void aP(View view, float f) {
        view.clearAnimation();
        view.animate().alpha(f).setInterpolator(irf.a).setListener(new aejd(view)).start();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    public final void aQ() {
        if (J() == null) {
            return;
        }
        f();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        dqtl dqtlVar = (dqtl) bvrs.e(this.o, dqtl.class, (dssr) dqtl.e.cu(7));
        dbsk.s(dqtlVar);
        aeko aekoVar = this.al;
        aejf aejfVar = new aejf(this);
        Activity activity = (Activity) ((dxjd) aekoVar.a).a;
        aeko.a(activity, 1);
        btvo a = aekoVar.b.a();
        aeko.a(a, 2);
        cqhn a2 = aekoVar.c.a();
        aeko.a(a2, 3);
        bvjj a3 = aekoVar.d.a();
        aeko.a(a3, 4);
        aeko.a(dqtlVar, 5);
        aeko.a(aejfVar, 6);
        this.ad = new aekn(activity, a, a2, a3, dqtlVar, aejfVar);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.ae) {
            aQ();
        }
    }

    @Override // defpackage.czwf, defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        czwe czweVar = new czwe(J(), this.b);
        cqkf c = this.ak.c(new guh(), null);
        c.e(this.ad);
        View c2 = c.c();
        if (c2 != null) {
            this.ag = jmj.a(H(), 10);
            View findViewById = c2.findViewById(guh.a);
            this.ah = findViewById;
            if (findViewById != null) {
                findViewById.setAlpha(0.0f);
                View view = this.ah;
                dbsk.s(view);
                View findViewById2 = view.findViewById(R.id.title);
                this.ai = findViewById2;
                if (findViewById2 != null) {
                    findViewById2.setAlpha(0.0f);
                }
                View view2 = this.ah;
                dbsk.s(view2);
                View findViewById3 = view2.findViewById(R.id.nav_button);
                this.aj = findViewById3;
                if (findViewById3 != null) {
                    findViewById3.setAlpha(0.0f);
                }
            }
            View findViewById4 = c2.findViewById(guh.b);
            dbsk.s(findViewById4);
            this.am = findViewById4;
        }
        czweVar.setContentView(c2);
        View findViewById5 = czweVar.findViewById(R.id.design_bottom_sheet);
        if (findViewById5 != null) {
            findViewById5.setImportantForAccessibility(2);
            View findViewById6 = czweVar.findViewById(R.id.coordinator);
            if (findViewById6 != null) {
                findViewById6.setImportantForAccessibility(2);
            }
            findViewById5.getLayoutParams().height = -1;
            if (findViewById5.getLayoutParams() instanceof ajl) {
                ajl ajlVar = (ajl) findViewById5.getLayoutParams();
                aejg aejgVar = new aejg();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                J().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                double d = displayMetrics.heightPixels;
                Double.isNaN(d);
                int round = (int) Math.round(d * 0.5d);
                aejgVar.s(round);
                aejgVar.y(4);
                aejgVar.v(false);
                aejgVar.x(new aejc(this, aejgVar, round));
                View view3 = this.am;
                if (view3 != null) {
                    od.c(view3, new aeje(aejgVar));
                }
                ajlVar.a(aejgVar);
            }
        }
        return czweVar;
    }
}
