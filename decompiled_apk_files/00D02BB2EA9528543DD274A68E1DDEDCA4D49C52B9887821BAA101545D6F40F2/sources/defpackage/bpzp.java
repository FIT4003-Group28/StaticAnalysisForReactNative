package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpzp  reason: default package */
/* loaded from: classes4.dex */
public class bpzp implements bqij {
    public final bpzo a;
    public final jkf b;
    public final bpys c;
    public final Activity d;
    public final cqhn e;
    public bopt f;
    public bpyr g;
    public final bomp h;

    public bpzp(bqgw bqgwVar, bpzo bpzoVar, jkf jkfVar, bpys bpysVar, ff ffVar, cqhn cqhnVar, jmx jmxVar) {
        bomp bompVar = new bomp(new bpzm(this));
        this.h = bompVar;
        this.a = bpzoVar;
        this.b = jkfVar;
        this.c = bpysVar;
        this.d = ffVar;
        this.e = cqhnVar;
        this.f = a(ffVar, bqgwVar, jkfVar);
        this.g = bpysVar.a(bqgwVar);
        cqkx.j(this.f, bompVar);
        cqkx.j(this.g, bompVar);
    }

    public static bopt a(Activity activity, bqgw bqgwVar, jkf jkfVar) {
        return new bpzn(activity, bqgwVar.b, activity.getString(R.string.ROAD_NAME), activity.getString(R.string.ROAD_NAME_OPTIONAL_HINT), activity.getString(R.string.ROAD_NAME_OPTIONAL_HINT), activity.getString(R.string.ROAD_NAME), 8193, dtya.ai, cqjg.a(), jkfVar);
    }

    private final dbsg<Spinner> j() {
        LinearLayout linearLayout = (LinearLayout) cqkx.o(this.g);
        return (linearLayout == null || linearLayout.getChildCount() <= 0) ? dbpy.a : dbsg.i((Spinner) linearLayout.getChildAt(0));
    }

    @Override // defpackage.bqij
    public jib b() {
        Activity activity = this.d;
        jhz e = jib.g(activity, activity.getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_TITLE)).e();
        e.x = false;
        e.a = this.d.getString(R.string.MISSING_ROAD_MULTI_SLIDER_TITLE);
        e.F = 1;
        e.k = null;
        e.i = null;
        e.j = null;
        e.C = 2;
        jhm a = jhm.a();
        a.n = true;
        a.h = 2;
        a.d(new View.OnClickListener(this) { // from class: bpzl
            private final bpzp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bpzp bpzpVar = this.a;
                bpzpVar.h();
                ((bqbz) bpzpVar.a).b.b.B(jjn.COLLAPSED);
            }
        });
        a.a = this.d.getString(R.string.MISSING_ROAD_MULTI_SAVE_ROAD_BUTTON_LABEL);
        e.c(a.c());
        return e.b();
    }

    @Override // defpackage.bqij
    public boqs c() {
        return this.f;
    }

    @Override // defpackage.bqij
    public jbg d() {
        return this.g;
    }

    @Override // defpackage.bqij
    public cqkl e() {
        h();
        final bqbz bqbzVar = (bqbz) this.a;
        gcz a = bqbzVar.a.a();
        a.d(R.string.MISSING_ROAD_POLYLINE_REMOVE_ROAD_CONFIRM);
        a.h(R.string.OK_BUTTON, null, new gdd(bqbzVar) { // from class: bqbx
            private final bqbz a;

            {
                this.a = bqbzVar;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.b.j.i();
            }
        });
        a.e(R.string.CANCEL_BUTTON, null, bqby.a);
        a.b();
        return cqkl.a;
    }

    @Override // defpackage.bqij
    public CharSequence f() {
        return this.d.getString(R.string.MISSING_ROAD_MULTI_REMOVE_ROAD_BUTTON_LABEL);
    }

    @Override // defpackage.bqij
    public Boolean g() {
        return Boolean.valueOf(this.b.l().L().equals(jjn.FULLY_EXPANDED));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        jmw.d(this.d, null);
        View o = cqkx.o(this);
        if (o != null) {
            o.findViewById(bqfm.b).clearFocus();
        }
        dbsg<Spinner> j = j();
        if (j.a()) {
            j.b().setImportantForAccessibility(4);
        }
        dbsg<Spinner> j2 = j();
        if (j2.a()) {
            j2.b().setSelection(this.g.Rt().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        dbsg<Spinner> j = j();
        if (j.a()) {
            j.b().setImportantForAccessibility(1);
        }
    }
}
