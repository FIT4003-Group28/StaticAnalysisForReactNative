package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjl  reason: default package */
/* loaded from: classes4.dex */
public final class btjl implements btjs {
    public final SwitchPreferenceCompat a;
    public final bvjj b;
    public final cjqy c;
    public final bsvn d;
    public final akfa e;

    public btjl(Context context, bvjj bvjjVar, akfa akfaVar, cjqy cjqyVar, bsvn bsvnVar) {
        this.b = bvjjVar;
        this.e = akfaVar;
        this.c = cjqyVar;
        this.d = bsvnVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.a = switchPreferenceCompat;
        switchPreferenceCompat.t(R.string.SETTINGS_ITEM_PERSONAL_EVENTS_TITLE);
        switchPreferenceCompat.x(R.string.SETTINGS_ITEM_PERSONAL_EVENTS_DESCRIPTION);
        switchPreferenceCompat.n = new btjk(this);
        f(switchPreferenceCompat, bvjjVar, akfaVar);
    }

    public static void f(SwitchPreferenceCompat switchPreferenceCompat, bvjj bvjjVar, akfa akfaVar) {
        switchPreferenceCompat.m(!bvjjVar.o(bvjk.gK, akfaVar.j(), false));
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.a);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.a;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.d.a();
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
        dceq a = dcet.a();
        a.b(btat.class, new btjm(btat.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
        btrmVar.a(this);
    }
}
