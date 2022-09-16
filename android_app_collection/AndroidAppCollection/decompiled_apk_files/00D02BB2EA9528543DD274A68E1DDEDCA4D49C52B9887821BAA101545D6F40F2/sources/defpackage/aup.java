package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aup  reason: default package */
/* loaded from: classes2.dex */
public abstract class aup extends fd implements ava, auy, auz, atl {
    private boolean ad;
    private boolean ae;
    public avb b;
    public RecyclerView c;
    public Runnable e;
    public final auk a = new auk(this);
    public int d = R.layout.preference_list_fragment;
    public final Handler f = new auh(this);
    public final Runnable g = new aui(this);

    @Override // defpackage.fd
    public void Qe() {
        this.f.removeCallbacks(this.g);
        this.f.removeMessages(1);
        if (this.ad) {
            this.c.setAdapter(null);
            PreferenceScreen d = d();
            if (d != null) {
                d.P();
            }
        }
        this.c = null;
        super.Qe();
    }

    @Override // defpackage.atl
    public final <T extends Preference> T Ri(CharSequence charSequence) {
        avb avbVar = this.b;
        if (avbVar == null) {
            return null;
        }
        return (T) avbVar.f(charSequence);
    }

    @Override // defpackage.fd
    public void ah(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen d;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (d = d()) != null) {
            d.aa(bundle2);
        }
        if (this.ad) {
            h();
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
        this.ae = true;
    }

    public final PreferenceScreen d() {
        return this.b.d;
    }

    public final void e(PreferenceScreen preferenceScreen) {
        avb avbVar = this.b;
        PreferenceScreen preferenceScreen2 = avbVar.d;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.P();
            }
            avbVar.d = preferenceScreen;
            if (preferenceScreen == null) {
                return;
            }
            this.ad = true;
            if (!this.ae || this.f.hasMessages(1)) {
                return;
            }
            this.f.obtainMessage(1).sendToTarget();
        }
    }

    public final void f(int i) {
        avb avbVar = this.b;
        if (avbVar != null) {
            e(avbVar.a(H(), i, d()));
            return;
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    @Override // defpackage.ava
    public boolean g(Preference preference) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        PreferenceScreen d = d();
        if (d != null) {
            this.c.setAdapter(new auw(d));
            d.O();
        }
    }

    @Override // defpackage.auy
    public void i(Preference preference) {
        throw null;
    }

    @Override // defpackage.fd
    public void l(Bundle bundle) {
        super.l(bundle);
        TypedValue typedValue = new TypedValue();
        H().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        H().getTheme().applyStyle(i, false);
        avb avbVar = new avb(H());
        this.b = avbVar;
        avbVar.g = this;
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        p(bundle);
    }

    public abstract void p(Bundle bundle);

    @Override // defpackage.auz
    public final void q() {
        if ((!(H() instanceof aun) || !((aun) H()).a()) && (J() instanceof aun)) {
            ((aun) J()).a();
        }
    }

    @Override // defpackage.fd
    public void s() {
        super.s();
        avb avbVar = this.b;
        avbVar.e = this;
        avbVar.f = this;
    }

    @Override // defpackage.fd
    public void u() {
        super.u();
        avb avbVar = this.b;
        avbVar.e = null;
        avbVar.f = null;
    }
}
