package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ListView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsas  reason: default package */
/* loaded from: classes4.dex */
public final class bsas extends bsaa {
    @dzsi
    public bsal ag;
    public boolean ah;
    public boolean ai;
    public int aj;
    public View ak;
    public View al;
    public View am;
    public View an;
    public cqkj ao;
    public bsam ap;
    private bsjm aq;
    private int ar;
    private ListView as;

    public static void aU(View view) {
        view.clearAnimation();
        view.animate().alpha(1.0f).setInterpolator(irf.a).setListener(new bsap(view)).start();
    }

    @Override // defpackage.bsaa, defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.ah) {
            aS();
        }
    }

    @Override // defpackage.bsaa, defpackage.czwf, defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        this.aq = (bsjm) this.o.getSerializable("refinements_model");
        this.ar = this.o.getInt("refinement_type");
        czwe czweVar = new czwe(J(), this.b);
        this.ag = this.ap.a(this.aq, this.ar, this);
        cqkf c = this.ao.c(new gux(), null);
        c.e(this.ag);
        View c2 = c.c();
        if (c2 != null) {
            this.aj = jmj.a(H(), 10);
            View findViewById = c2.findViewById(gux.a);
            this.ak = findViewById;
            if (findViewById != null) {
                findViewById.setAlpha(0.0f);
                View view = this.ak;
                dbsk.s(view);
                View findViewById2 = view.findViewById(gux.b);
                this.al = findViewById2;
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View view2 = this.ak;
                dbsk.s(view2);
                View findViewById3 = view2.findViewById(R.id.title);
                this.am = findViewById3;
                if (findViewById3 != null) {
                    findViewById3.setAlpha(0.0f);
                }
                View view3 = this.ak;
                dbsk.s(view3);
                View findViewById4 = view3.findViewById(R.id.nav_button);
                this.an = findViewById4;
                if (findViewById4 != null) {
                    findViewById4.setAlpha(0.0f);
                }
            }
            ListView listView = (ListView) c2.findViewById(gux.c);
            this.as = listView;
            if (listView != null) {
                listView.setOnScrollListener(new bsan(this));
            }
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
                bsar bsarVar = new bsar();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                J().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                double d = displayMetrics.heightPixels;
                Double.isNaN(d);
                int round = (int) Math.round(d * 0.5d);
                bsarVar.s(round);
                bsarVar.y(4);
                bsarVar.v(false);
                bsarVar.x(new bsao(this, bsarVar, round));
                od.c(this.as, new bsaq(bsarVar));
                ((ajl) findViewById5.getLayoutParams()).a(bsarVar);
            }
        }
        return czweVar;
    }
}
