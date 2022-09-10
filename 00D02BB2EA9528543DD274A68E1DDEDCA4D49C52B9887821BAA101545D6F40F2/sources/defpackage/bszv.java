package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bszv  reason: default package */
/* loaded from: classes4.dex */
public abstract class bszv extends aup implements cjsf, btsv, ggc, gfv {
    public static final dcqe aS = dcqe.c("bszv");
    public Context aT;
    public ckcw aU;
    public efg aV;
    public cjqq aW;
    public gcp aY;
    private boolean ae;
    private boolean af;
    private boolean ag;
    @dzsi
    private cjqp ah;
    @dzsi
    private btta ai;
    @dzsi
    private View ak;
    @dzsi
    private ProgressBar al;
    @dzsi
    private FrameLayout am;
    private final dbty<cjsz> ad = dbud.a(new dbty(this) { // from class: bszt
        private final bszv a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return new cjsz(this.a.aR());
        }
    });
    public boolean aX = false;
    private boolean aj = false;

    public static void ba(gga ggaVar, fd fdVar) {
        ggaVar.C(fdVar, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
    }

    @Override // defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        throw null;
    }

    public gfu Nx() {
        return gfu.ACTIVITY_FRAGMENT;
    }

    public fd Ny() {
        return this;
    }

    @Override // defpackage.gfv
    public final void Nz(@dzsi gfw gfwVar) {
        throw null;
    }

    @Override // defpackage.aup, defpackage.fd
    public void Qe() {
        cjqp cjqpVar = this.ah;
        if (cjqpVar != null) {
            cjqpVar.f();
            View view = this.P;
            if (view != null) {
                this.aW.h(view);
            }
            this.aW.l(cjqpVar);
            this.ah = null;
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        w();
        super.Qi(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public jib aJ() {
        return jib.g(J(), aQ());
    }

    @Override // defpackage.ggg
    public List aO() {
        return dcdc.e();
    }

    @Override // defpackage.cjsf
    public final cjtg aP() {
        return this.ad.a();
    }

    protected abstract String aQ();

    public ddho aR() {
        return dtyb.cL;
    }

    public final void aY(boolean z) {
        View view = this.ak;
        dbsk.s(view);
        if (z == this.aj) {
            return;
        }
        this.aj = z;
        ProgressBar progressBar = this.al;
        FrameLayout frameLayout = this.am;
        dbsk.s(frameLayout);
        if (progressBar == null) {
            progressBar = new ProgressBar(this.aT);
            int a = jmj.a(this.aT, 48);
            progressBar.setLayoutParams(new FrameLayout.LayoutParams(a, a, 17));
            frameLayout.addView(progressBar);
            this.al = progressBar;
        }
        if (z) {
            view.setVisibility(4);
            progressBar.setVisibility(0);
            return;
        }
        view.setVisibility(0);
        progressBar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public egj aZ() {
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.f(this.af);
        egjVar.L(3);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egf a = egf.a();
        a.a = this.ag;
        a.t = this.ae;
        egjVar.A(a);
        return egjVar;
    }

    @Override // defpackage.fd
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        RecyclerView recyclerView;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.am = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundResource(R.color.mod_daynight_white);
        TypedArray obtainStyledAttributes = H().obtainStyledAttributes(null, avf.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.d = obtainStyledAttributes.getResourceId(0, this.d);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(H());
        View inflate = cloneInContext.inflate(this.d, (ViewGroup) frameLayout, false);
        View findViewById = inflate.findViewById(16908351);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!H().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate((int) R.layout.preference_recyclerview, viewGroup2, false);
            H();
            recyclerView.setLayoutManager(new aag());
            recyclerView.setAccessibilityDelegateCompat(new avd(recyclerView));
        }
        if (recyclerView != null) {
            this.c = recyclerView;
            recyclerView.g(this.a);
            auk aukVar = this.a;
            if (drawable != null) {
                aukVar.b = drawable.getIntrinsicHeight();
            } else {
                aukVar.b = 0;
            }
            aukVar.a = drawable;
            aukVar.d.c.U();
            if (dimensionPixelSize != -1) {
                auk aukVar2 = this.a;
                aukVar2.b = dimensionPixelSize;
                aukVar2.d.c.U();
            }
            this.a.c = z;
            if (this.c.getParent() == null) {
                viewGroup2.addView(this.c);
            }
            this.f.post(this.g);
            frameLayout.addView(inflate);
            this.ak = inflate;
            hxg hxgVar = new hxg(H());
            hxgVar.setToolbarProperties(aJ());
            hxgVar.setContentView(frameLayout);
            View findViewById2 = hxgVar.findViewById(16908298);
            if (findViewById2 != null) {
                findViewById2.setPadding(0, 0, 0, 0);
            }
            cjqp j = this.aW.j(aP());
            this.ah = j;
            this.aW.i(j, hxgVar);
            return hxgVar;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }

    @Override // defpackage.fd
    public void am() {
        super.am();
        this.ai = null;
    }

    public final gga bb() {
        return (gga) J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bc(int i) {
        View view = this.P;
        if (view != null) {
            view.setContentDescription(J().getString(i));
        }
    }

    @Override // defpackage.ggc
    public final dbsg<cjqp> bd() {
        return dbsg.j(this.ah);
    }

    @Override // defpackage.btsv
    public final btta be() {
        if (this.ai == null) {
            this.ai = btsx.a(btta.class, this);
        }
        return this.ai;
    }

    @Override // defpackage.btsv
    public final boolean bf() {
        return this.ai != null;
    }

    @Override // defpackage.aup, defpackage.ava
    public boolean g(Preference preference) {
        this.aU.b(ckgx.SETTINGS, new bszu(this, preference));
        ((ckcn) this.aU.a(ckjx.a)).a();
        if (preference.s != null) {
            if (((H() instanceof aum) && ((aum) H()).a()) || ((J() instanceof aum) && ((aum) J()).a())) {
                return true;
            }
            gn Q = Q();
            Bundle q = preference.q();
            fd c = Q.al().c(K().getClassLoader(), preference.s);
            c.B(q);
            c.F(this, 0);
            gz b = Q.b();
            b.E(((View) this.P.getParent()).getId(), c);
            b.z(null);
            b.f();
            return true;
        }
        return false;
    }

    @Override // defpackage.aup, defpackage.auy
    public final void i(Preference preference) {
        ex atxVar;
        if (!(preference instanceof btkz)) {
            if ((H() instanceof aul) && ((aul) H()).a()) {
                return;
            }
            if (((J() instanceof aul) && ((aul) J()).a()) || Q().H("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (preference instanceof EditTextPreference) {
                String str = preference.q;
                atxVar = new atp();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                atxVar.B(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.q;
                atxVar = new atu();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                atxVar.B(bundle2);
            } else if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            } else {
                String str3 = preference.q;
                atxVar = new atx();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                atxVar.B(bundle3);
            }
            atxVar.F(this, 0);
            atxVar.e(Q(), "androidx.preference.PreferenceFragment.DIALOG");
            return;
        }
        btkz btkzVar = (btkz) preference;
        aug m = btkzVar.m();
        Bundle bundle4 = m.o;
        if (bundle4 == null) {
            bundle4 = new Bundle(1);
            m.B(bundle4);
        }
        bundle4.putString("key", btkzVar.D());
        m.F(this, 0);
        gn gnVar = this.A;
        dbsk.s(gnVar);
        m.e(gnVar, null);
    }

    @Override // defpackage.aup, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        int i;
        super.l(bundle);
        if (bundle != null && bundle.containsKey("ue3ActivationId") && (i = bundle.getInt("ue3ActivationId")) != 0) {
            aP().b(i);
        }
        if (bundle == null) {
            bundle = this.o;
        }
        boolean z = true;
        this.ae = bundle != null && bundle.getBoolean("allowNightMode", false);
        this.af = bundle == null || bundle.getBoolean("allowSideInfoSheet", true);
        if (bundle == null || !bundle.getBoolean("keepScreenAwake", false)) {
            z = false;
        }
        this.ag = z;
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ff J;
        super.onConfigurationChanged(configuration);
        if (this.aY.a.a() && (J = J()) != null) {
            try {
                gz b = J.g().b();
                b.t(this);
                b.r();
                gz b2 = J.g().b();
                b2.A(this);
                b2.r();
            } catch (RuntimeException e) {
                throw new gco(dbsj.e(e.getMessage()), e);
            }
        }
    }

    @Override // defpackage.aup, defpackage.fd
    public void s() {
        super.s();
        this.aX = true;
        cjqg.p(this.P, this, aR());
        this.aV.a(aZ().a());
    }

    @Override // defpackage.fd
    public void t(Bundle bundle) {
        PreferenceScreen d = d();
        if (d != null) {
            Bundle bundle2 = new Bundle();
            d.Z(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
        Integer c = aP().c();
        if (c != null) {
            bundle.putInt("ue3ActivationId", c.intValue());
        }
        bundle.putBoolean("allowNightMode", this.ae);
        bundle.putBoolean("allowSideInfoSheet", this.af);
        bundle.putBoolean("keepScreenAwake", this.ag);
    }

    @Override // defpackage.aup, defpackage.fd
    public void u() {
        this.aX = false;
        super.u();
    }

    protected void w() {
        dxix.a(this);
    }
}
