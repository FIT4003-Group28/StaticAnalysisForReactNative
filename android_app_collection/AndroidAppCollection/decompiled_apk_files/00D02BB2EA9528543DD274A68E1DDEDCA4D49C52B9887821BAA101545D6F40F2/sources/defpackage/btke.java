package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btke  reason: default package */
/* loaded from: classes4.dex */
public final class btke implements btjs {
    public final bvjj a;
    public final cjqy b;
    public final bsvn c;
    public final akfa d;
    private final SwitchPreferenceCompat e;

    public btke(Context context, bvjj bvjjVar, cjqy cjqyVar, bsvn bsvnVar, akfa akfaVar) {
        this.a = bvjjVar;
        this.b = cjqyVar;
        this.c = bsvnVar;
        this.d = akfaVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.e = switchPreferenceCompat;
        switchPreferenceCompat.ae();
        switchPreferenceCompat.t(R.string.PUBLIC_PROFILE_SETTING_PRIMARY);
        switchPreferenceCompat.x(R.string.PUBLIC_PROFILE_SETTING_SUBSTRING);
        switchPreferenceCompat.n = new btkd(this);
        f();
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.e);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.e;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.c.a();
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
        dceq a = dcet.a();
        a.b(btat.class, new btkf(btat.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
        btrmVar.a(this);
    }

    public final void f() {
        this.e.m(this.a.o(bvjk.hL, this.d.j(), true));
    }
}
