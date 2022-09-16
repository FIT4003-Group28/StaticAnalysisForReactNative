package defpackage;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitControllerLoggingRelativeLayout;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.material.button.MaterialButton;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxwe  reason: default package */
/* loaded from: classes5.dex */
public final class cxwe {
    public final Activity a;
    public final PeopleKitControllerLoggingRelativeLayout b;
    public final MaterialButton c;
    public final PeopleKitSelectionModel d;
    public final PeopleKitConfig e;
    public final cxqo f;
    public final cxua g;
    public final cxpn h;
    public final cxwi i;
    public final PeopleKitVisualElementPath j;
    public RelativeLayout k;
    public cxwd l;
    public boolean m;
    public boolean n;
    public boolean o;
    private boolean p = true;
    private boolean q = false;
    private cxsq r = cxsq.b();

    public cxwe(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxov cxovVar, PeopleKitVisualElementPath peopleKitVisualElementPath, boolean z, int i) {
        this.a = activity;
        this.d = peopleKitSelectionModel;
        this.f = cxqoVar;
        this.e = peopleKitConfig;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.y));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.j = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        PeopleKitControllerLoggingRelativeLayout peopleKitControllerLoggingRelativeLayout = (PeopleKitControllerLoggingRelativeLayout) LayoutInflater.from(activity).inflate(R.layout.peoplekit_maximized_view, (ViewGroup) null);
        this.b = peopleKitControllerLoggingRelativeLayout;
        peopleKitControllerLoggingRelativeLayout.setUp(cxqoVar, peopleKitVisualElementPath2);
        MaterialButton materialButton = (MaterialButton) peopleKitControllerLoggingRelativeLayout.findViewById(R.id.peoplekit_maxview_send_button_action_bar);
        this.c = materialButton;
        cxpn cxpnVar = new cxpn(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, cxovVar, peopleKitVisualElementPath2);
        this.h = cxpnVar;
        cxua cxuaVar = new cxua(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, peopleKitVisualElementPath2, i);
        this.g = cxuaVar;
        cxuaVar.d.h = cxovVar;
        if (z) {
            cxuaVar.e.c(cxuaVar.g);
        }
        cxpnVar.a.addOnLayoutChangeListener(new cxvu(this));
        cxwi cxwiVar = new cxwi(activity, peopleKitConfig, peopleKitSelectionModel, cxovVar, peopleKitDataLayer, cxqoVar, peopleKitVisualElementPath2);
        this.i = cxwiVar;
        if (peopleKitConfig.h()) {
            cxwiVar.b.findViewById(R.id.peoplekit_send_button).setVisibility(8);
            materialButton.setOnClickListener(new cxvv(this, peopleKitDataLayer, peopleKitSelectionModel, cxovVar, activity, cxqoVar));
        }
        x();
    }

    private final void w() {
        if (Build.VERSION.SDK_INT >= 23) {
            Window window = this.a.getWindow();
            View decorView = window.getDecorView();
            if (this.r.b != R.color.google_white) {
                decorView.setSystemUiVisibility(0);
                window.addFlags(0);
                return;
            }
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8208);
            window.addFlags(Integer.MIN_VALUE);
        }
    }

    private final void x() {
        this.b.setBackgroundColor(akm.c(this.a, this.r.a));
        this.b.findViewById(R.id.peoplekit_maxview_app_bar_layout).setBackgroundColor(akm.c(this.a, this.r.d));
        this.b.findViewById(R.id.peoplekit_maxview_messagebar).setBackgroundColor(akm.c(this.a, this.r.a));
        this.b.findViewById(R.id.peoplekit_maxview_top_container).setBackgroundColor(akm.c(this.a, this.r.a));
        int c = akm.c(this.a, this.r.i);
        ((AppCompatTextView) this.b.findViewById(R.id.peoplekit_maxview_action_bar_title)).setTextColor(c);
        ((AppCompatTextView) this.b.findViewById(R.id.peoplekit_maxview_action_bar_subtitle)).setTextColor(c);
        int i = this.r.o;
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.b.findViewById(R.id.peoplekit_maxview_close_button);
        Drawable b = ks.b(appCompatImageView.getDrawable());
        b.mutate().setTint(akm.c(this.a, i));
        appCompatImageView.setImageDrawable(b);
        this.c.setBackgroundTintList(ColorStateList.valueOf(akm.c(this.a, this.r.s)));
        this.c.setTextColor(akm.c(this.a, this.r.q));
        c();
        w();
    }

    public final void a() {
        this.g.c();
    }

    public final void b() {
        cxpn cxpnVar = this.h;
        cxpnVar.c.setMaxHeight(this.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_maxview_autocomplete_max_height));
        ((RelativeLayout) this.b.findViewById(R.id.peoplekit_maxview_autocomplete)).addView(this.h.a);
        RelativeLayout relativeLayout = (RelativeLayout) this.b.findViewById(R.id.peoplekit_maxview_listview);
        relativeLayout.addView(this.g.b);
        if (this.o) {
            relativeLayout.setVisibility(8);
        }
        this.h.o = new cxvw(this, relativeLayout);
        this.g.l = new cxvx(this);
        ((RecyclerView) this.g.b.findViewById(R.id.peoplekit_top_suggestions_recyclerview)).i(new cxvy(this, this.b.findViewById(R.id.peoplekit_maxview_top_container), this.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_maxview_elevation)));
        RelativeLayout relativeLayout2 = (RelativeLayout) this.b.findViewById(R.id.peoplekit_maxview_messagebar);
        this.k = relativeLayout2;
        relativeLayout2.addView(this.i.b);
        if (this.d.g() != 0) {
            if (this.e.h()) {
                this.c.setVisibility(0);
            } else {
                e(true);
            }
        }
        this.d.i(new cxvz(this));
        this.b.findViewById(R.id.peoplekit_maxview_close_button).setOnClickListener(new cxwa(this));
        c();
        w();
    }

    public final void c() {
        Window window = this.a.getWindow();
        window.setStatusBarColor(akm.c(this.a, this.r.b));
        window.setNavigationBarColor(akm.c(this.a, this.r.b));
    }

    public final void d(List<ChipInfo> list) {
        cxpn cxpnVar = this.h;
        for (int i = 0; i < list.size(); i++) {
            ChipInfo chipInfo = list.get(i);
            cxpnVar.h(chipInfo.a, chipInfo.b);
        }
        cxpnVar.f();
        cxpnVar.j();
    }

    public final void e(boolean z) {
        if (!this.p) {
            return;
        }
        if (z) {
            if (this.q) {
                return;
            }
            this.k.animate().translationY(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).setListener(new cxwb(this)).start();
            this.k.setVisibility(0);
            this.q = true;
        } else if (!this.q) {
        } else {
            if (this.i.b.hasFocus()) {
                ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            }
            this.k.animate().translationY(this.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_maxview_message_bar_translation)).setDuration(100L).setInterpolator(new DecelerateInterpolator()).setListener(new cxwc(this)).start();
            this.q = false;
        }
    }

    public final void f() {
        this.h.i();
    }

    public final void g(String str) {
        ((AppCompatTextView) this.b.findViewById(R.id.peoplekit_maxview_action_bar_title)).setText(str);
    }

    public final void h(String str) {
        this.b.findViewById(R.id.peoplekit_maxview_app_bar_layout).getLayoutParams().height = this.a.getResources().getDimensionPixelSize(R.dimen.peoplekit_maxview_action_bar_height_with_subtitle);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.b.findViewById(R.id.peoplekit_maxview_action_bar_subtitle);
        appCompatTextView.setText((CharSequence) null);
        appCompatTextView.setVisibility(0);
    }

    public final void i() {
        if (this.e.h()) {
            this.p = false;
        } else {
            this.i.a();
        }
    }

    public final void j(String str) {
        if (this.e.h()) {
            this.c.setText(str);
        } else {
            this.i.b(str);
        }
    }

    public final void k(String str) {
        this.h.g.c.k = null;
    }

    public final void l(String str) {
        this.h.g.c.l = null;
    }

    public final void m(String str) {
        this.h.o(null);
    }

    public final void n(String str) {
        this.h.g.k = null;
    }

    public final void o(cxsq cxsqVar) {
        if (!this.r.equals(cxsqVar)) {
            this.r = cxsqVar;
            x();
            this.h.p(cxsqVar);
            cxua cxuaVar = this.g;
            if (!cxuaVar.k.equals(cxsqVar)) {
                cxuaVar.k = cxsqVar;
                cxuo cxuoVar = cxuaVar.d;
                if (!cxuoVar.n.equals(cxsqVar)) {
                    cxuoVar.n = cxsqVar;
                    cxuoVar.s();
                }
                cxuaVar.d();
            }
            this.i.c(cxsqVar);
        }
    }

    public final void p(boolean z) {
        this.h.q(false);
    }

    public final void q(boolean z) {
        this.g.d.k = z;
        this.h.g.c.n = z;
    }

    public final void r(String str) {
        this.i.e(null);
    }

    public final void s(String str) {
        this.i.f(null);
    }

    public final void t(String str) {
        this.i.g(null);
    }

    public final void u() {
        this.g.h = true;
    }

    public final void v(int i, int[] iArr) {
        this.g.e.f(i, iArr);
        this.h.k.f(i, iArr);
    }
}
