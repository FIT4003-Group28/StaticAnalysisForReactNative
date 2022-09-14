package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.car.CarInfo;
/* compiled from: PG */
/* renamed from: cli  reason: default package */
/* loaded from: classes.dex */
public class cli extends cmwh {
    public clm a;
    public ViewGroup b;
    private cmp c;
    private cmv d;

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void Oe(Bundle bundle) {
        super.Oe(bundle);
        clm clmVar = this.a;
        clmVar.b(clmVar.l, bundle);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void Of(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(this.c.b.getClassLoader());
        }
        super.Of(bundle);
        clm clmVar = this.a;
        clmVar.b(clmVar.k, bundle);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void Og(WindowManager.LayoutParams layoutParams) {
        boolean z = true;
        boolean z2 = (layoutParams.flags & Integer.MIN_VALUE) == 0;
        if ((layoutParams.flags & 67108864) != 0) {
            z = false;
        }
        try {
            this.a.b.c.q(z2, z);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public final void Oh(IBinder iBinder) {
        clm clmVar = this.a;
        clmVar.b(clmVar.j, iBinder);
    }

    public final void Oi() {
        ((cnht) this.w).r = 515;
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void e(Bundle bundle) {
        cnia cniaVar;
        super.e(null);
        this.c = new cmp(Ol());
        this.d = new cmv();
        Context context = this.c.b;
        Resources resources = context.getResources();
        try {
            CarInfo b = ((cnic) N()).a.b();
            dbsk.s(b);
            cniaVar = new cnia(b);
        } catch (cmwm | cmwn unused) {
            cniaVar = null;
        }
        if (cmo.b(cml.MULTI_REGION_CAR_UI_ENTRY, context, resources)) {
            this.a = new clm(this.c, D(), this.d, cniaVar, K(), L());
        } else if (cmo.b(cml.MULTI_DISPLAY_CAR_UI_ENTRY, context, resources)) {
            this.a = new clm(this.c, D(), this.d, cniaVar, K());
        } else {
            this.a = new clm(this.c, D(), this.d, cniaVar);
        }
        clm clmVar = this.a;
        boolean z = false;
        this.w.a((View) clmVar.b(clmVar.n, new Object[0]));
        this.b = (ViewGroup) C(this.a.g);
        final int a = cmo.a(cmm.DRAWER_HEADER_HEIGHT, context, resources);
        cmu cmuVar = this.a.b;
        Intent No = No();
        if (No != null && No.getBooleanExtra("assistant_activity", false)) {
            z = true;
        }
        try {
            cmuVar.c.r(z);
        } catch (RemoteException unused2) {
        }
        if (cmo.b(cml.SUPPORTS_WINDOW_INSETS, context, resources)) {
            if (this.a.a.a.contains("APP_BAR_INSET_BEHAVIOR")) {
                return;
            }
            cmuVar.b = new clh(this, a);
            return;
        }
        this.b.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, a) { // from class: clf
            private final cli a;
            private final int b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                cli cliVar = this.a;
                int i = this.b;
                if (cliVar.a.b.a == 2) {
                    return windowInsets.consumeSystemWindowInsets();
                }
                return windowInsets.replaceSystemWindowInsets(0, i, 0, 0);
            }
        });
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void f() {
        super.f();
        clm clmVar = this.a;
        clmVar.b(clmVar.h, new Object[0]);
    }

    @Override // defpackage.cmwh, defpackage.cmwf, defpackage.cmvs, defpackage.cmvt
    public void g() {
        super.g();
        clm clmVar = this.a;
        clmVar.b(clmVar.i, new Object[0]);
    }

    @Override // defpackage.cmvs, defpackage.cmvt
    public void j(boolean z, boolean z2) {
        cmg cmgVar = this.a.c;
        if (!z || getResources().getConfiguration().navigation != 2 || !cmgVar.a()) {
            return;
        }
        cmgVar.c();
    }

    @Override // defpackage.cmwh, defpackage.cmvs, defpackage.cmvt
    public void l(Configuration configuration) {
        super.l(configuration);
        String valueOf = String.valueOf(configuration);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("onConfigurationChanged ");
        sb.append(valueOf);
        sb.toString();
        getResources().getConfiguration().updateFrom(configuration);
        clm clmVar = this.a;
        clmVar.b(clmVar.m, getResources().getConfiguration());
    }

    public void m(View view) {
        this.b.removeAllViews();
        this.b.addView(view);
    }

    public final void n(Intent intent) {
        intent.putExtra("android.intent.extra.PACKAGE_NAME", Ol().getPackageName());
        clm clmVar = this.a;
        clmVar.b(clmVar.o, intent);
    }

    @Override // defpackage.cmwh, defpackage.cmvs, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.d.onCreateView(str, context, attributeSet);
        return onCreateView != null ? onCreateView : super.onCreateView(str, context, attributeSet);
    }
}
