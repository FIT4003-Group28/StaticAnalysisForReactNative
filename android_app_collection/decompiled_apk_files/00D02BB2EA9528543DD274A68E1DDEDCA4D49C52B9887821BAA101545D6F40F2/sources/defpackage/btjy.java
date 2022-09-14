package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjy  reason: default package */
/* loaded from: classes4.dex */
public final class btjy implements btjs {
    public final bvjj a;
    public final bsvn b;
    public final SwitchPreferenceCompat c;
    public final akfa d;
    public final axjh e;
    public dbsg<mw<dqfc>> f = dbpy.a;

    public btjy(Context context, akfa akfaVar, bvjj bvjjVar, bsvn bsvnVar, axjh axjhVar) {
        this.a = bvjjVar;
        this.b = bsvnVar;
        this.d = akfaVar;
        this.e = axjhVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.c = switchPreferenceCompat;
        switchPreferenceCompat.ae();
        switchPreferenceCompat.t(R.string.PROFILE_PRIVACY_SETTING_PRIMARY);
        switchPreferenceCompat.x(R.string.PROFILE_PRIVACY_SETTING_SUBSTRING_V2);
        switchPreferenceCompat.n = new btjx(this);
        f();
    }

    public static void g(final Runnable runnable) {
        Handler handler = new Handler();
        runnable.getClass();
        handler.postDelayed(new Runnable(runnable) { // from class: btju
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.run();
            }
        }, 300L);
    }

    public static dqfc h(boolean z) {
        return z ? dqfc.PRIVATE : dqfc.PUBLIC;
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.c);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.c;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.b.a();
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
        dceq a = dcet.a();
        a.b(btat.class, new btjz(btat.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
        btrmVar.a(this);
    }

    public final void f() {
        btlu j = this.d.j();
        boolean z = false;
        int a = dfqg.a(this.a.t(bvjk.hM, this.d.j(), 0));
        if (j == null || a == 1) {
            this.c.y(false);
            return;
        }
        if (a == 4) {
            z = true;
        }
        if (a == 2) {
            z = !this.a.o(bvjk.hL, this.d.j(), true);
        }
        this.c.y(true);
        this.c.m(z);
    }
}
