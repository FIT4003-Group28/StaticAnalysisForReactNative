package defpackage;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.gmm.base.layout.MainLayout;
import com.google.android.apps.gmm.base.views.map.MapViewContainer;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: gke  reason: default package */
/* loaded from: classes.dex */
public final class gke implements glj {
    private final Activity a;
    private final efa b;
    private final ashf c;

    public gke(Activity activity, efa efaVar, ashf ashfVar) {
        this.a = activity;
        this.b = efaVar;
        this.c = ashfVar;
    }

    private final MainLayout k() {
        return (MainLayout) this.a.findViewById(R.id.mainmap_container);
    }

    @Override // defpackage.glj
    public final void a() {
        EditText H = k().H();
        if (H == null) {
            return;
        }
        H.requestFocus();
        ((InputMethodManager) this.a.getSystemService("input_method")).showSoftInput(H, 1);
        if (this.c.b()) {
            return;
        }
        this.b.c();
    }

    @Override // defpackage.glj
    public final void b() {
        EditText H = k().H();
        if (H == null) {
            return;
        }
        H.clearFocus();
        ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(H.getWindowToken(), 0);
    }

    @Override // defpackage.glj
    public final void c() {
        MapViewContainer mapViewContainer = k().aL;
        if (mapViewContainer != null) {
            mapViewContainer.setRestoreCameraOnDetach(false);
        }
    }

    @Override // defpackage.glj
    public final void d(ddho ddhoVar) {
        k().ar = ddhoVar;
    }

    @Override // defpackage.glj
    public final void e(jkh jkhVar) {
        k().c(jkhVar);
    }

    @Override // defpackage.glj
    public final void f(jkd jkdVar) {
        k().as.h(jkdVar);
    }

    @Override // defpackage.glj
    public final void g(boolean z) {
        if (k() != null) {
            MainLayout k = k();
            int i = 1;
            if (true == z) {
                i = 2;
            }
            k.aM = i;
            k.R();
        }
    }

    @Override // defpackage.glj
    public final boolean h() {
        if (k().I() == null) {
            jjn L = k().as.a().L();
            if (!k().as.a().A(jjn.COLLAPSED) || !L.b()) {
                return false;
            }
            k().as.e.w();
            return true;
        }
        return false;
    }

    @Override // defpackage.glj
    public final void i(jkd jkdVar) {
        k().as.l(jkdVar);
    }

    @Override // defpackage.glj
    public final void j(jkh jkhVar) {
        k().ap(jkhVar);
    }
}
