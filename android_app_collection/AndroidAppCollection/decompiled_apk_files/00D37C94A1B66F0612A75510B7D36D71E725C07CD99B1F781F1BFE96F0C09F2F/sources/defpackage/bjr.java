package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: bjr  reason: default package */
/* loaded from: classes2.dex */
public abstract class bjr extends dp implements bka, bjy, bjz, bit {
    public bkb a;
    public RecyclerView b;
    private boolean d;
    private boolean e;
    private final bjn c = new bjn(this);
    private int ae = R.layout.preference_list_fragment;
    private final Handler af = new bjl(this);
    private final Runnable ag = new bjm(this);

    @Override // defpackage.dp
    public void Z(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen o;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (o = o()) != null) {
            o.v(bundle2);
        }
        if (this.d) {
            q();
        }
        this.e = true;
    }

    public void aE(PreferenceScreen preferenceScreen) {
        bkb bkbVar = this.a;
        PreferenceScreen preferenceScreen2 = bkbVar.b;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.B();
            }
            bkbVar.b = preferenceScreen;
            if (preferenceScreen == null) {
                return;
            }
            this.d = true;
            if (!this.e || this.af.hasMessages(1)) {
                return;
            }
            this.af.obtainMessage(1).sendToTarget();
        }
    }

    @Override // defpackage.bka
    public boolean aF(Preference preference) {
        if (preference.u != null) {
            if ((rb() instanceof bjp) && ((bjp) rb()).b(preference)) {
                return true;
            }
            if ((mJ() instanceof bjp) && ((bjp) mJ()).b(preference)) {
                return true;
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            eo F = F();
            Bundle q = preference.q();
            dy i = F.i();
            mK().getClassLoader();
            dp c = i.c(preference.u);
            c.ae(q);
            c.aD(this);
            ex l = F.l();
            l.y(((View) this.O.getParent()).getId(), c);
            l.s();
            l.a();
            return true;
        }
        return false;
    }

    public abstract void aG();

    @Override // defpackage.bjz
    public final void aH() {
        if ((!(rb() instanceof bjq) || !((bjq) rb()).a()) && (mJ() instanceof bjq)) {
            ((bjq) mJ()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public xo d(PreferenceScreen preferenceScreen) {
        return new bjw(preferenceScreen);
    }

    @Override // defpackage.dp
    public void mQ(Bundle bundle) {
        super.mQ(bundle);
        TypedValue typedValue = new TypedValue();
        rb().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        rb().getTheme().applyStyle(i, false);
        bkb bkbVar = new bkb(rb());
        this.a = bkbVar;
        bkbVar.e = this;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        aG();
    }

    @Override // defpackage.dp
    public final void mR() {
        this.af.removeCallbacks(this.ag);
        this.af.removeMessages(1);
        if (this.d) {
            this.b.ad(null);
            PreferenceScreen o = o();
            if (o != null) {
                o.B();
            }
        }
        this.b = null;
        super.mR();
    }

    @Override // defpackage.dp
    public void mS() {
        super.mS();
        bkb bkbVar = this.a;
        bkbVar.c = this;
        bkbVar.d = this;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = rb().obtainStyledAttributes(null, bkf.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ae = obtainStyledAttributes.getResourceId(0, this.ae);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(rb());
        View inflate = cloneInContext.inflate(this.ae, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView n = n(cloneInContext, viewGroup2, bundle);
        if (n != null) {
            this.b = n;
            n.aC(this.c);
            s(drawable);
            if (dimensionPixelSize != -1) {
                bjn bjnVar = this.c;
                bjnVar.b = dimensionPixelSize;
                bjnVar.d.b.N();
            }
            this.c.c = z;
            if (this.b.getParent() == null) {
                viewGroup2.addView(this.b);
            }
            this.af.post(this.ag);
            return inflate;
        }
        throw new RuntimeException("Could not create RecyclerView");
    }

    @Override // defpackage.dp
    public void my() {
        super.my();
        bkb bkbVar = this.a;
        bkbVar.c = null;
        bkbVar.d = null;
    }

    public RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (!rb().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
            rb();
            recyclerView2.ag(new LinearLayoutManager());
            recyclerView2.ac(new bkd(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    public final PreferenceScreen o() {
        return this.a.b;
    }

    @Override // defpackage.bit
    public final Preference ov(CharSequence charSequence) {
        bkb bkbVar = this.a;
        if (bkbVar == null) {
            return null;
        }
        return bkbVar.d(charSequence);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        PreferenceScreen o = o();
        if (o != null) {
            Bundle bundle2 = new Bundle();
            o.w(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final void p(int i) {
        bkb bkbVar = this.a;
        if (bkbVar != null) {
            Context rb = rb();
            PreferenceScreen o = o();
            bkbVar.f(true);
            int i2 = bjx.a;
            Object[] objArr = new Object[2];
            String[] strArr = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
            XmlResourceParser xml = rb.getResources().getXml(i);
            try {
                Preference a = bjx.a(xml, o, rb, objArr, bkbVar, strArr);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) a;
                preferenceScreen.A(bkbVar);
                bkbVar.f(false);
                aE(preferenceScreen);
                return;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        PreferenceScreen o = o();
        if (o != null) {
            this.b.ad(d(o));
            o.z();
        }
    }

    @Override // defpackage.bjy
    public void r(Preference preference) {
        dh bjcVar;
        if (!(rb() instanceof bjo) || !((bjo) rb()).a(preference)) {
            if (((mJ() instanceof bjo) && ((bjo) mJ()).a(preference)) || F().f("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (preference instanceof EditTextPreference) {
                String str = preference.s;
                bjcVar = new biw();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                bjcVar.ae(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.s;
                bjcVar = new bja();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                bjcVar.ae(bundle2);
            } else if (preference instanceof MultiSelectListPreference) {
                String str3 = preference.s;
                bjcVar = new bjc();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                bjcVar.ae(bundle3);
            } else {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            bjcVar.aD(this);
            bjcVar.qv(F(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }

    public final void s(Drawable drawable) {
        bjn bjnVar = this.c;
        if (drawable != null) {
            bjnVar.b = drawable.getIntrinsicHeight();
        } else {
            bjnVar.b = 0;
        }
        bjnVar.a = drawable;
        bjnVar.d.b.N();
    }
}
