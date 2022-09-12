package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btkl  reason: default package */
/* loaded from: classes4.dex */
public final class btkl implements btjs {
    public final bvjj a;
    public final cjqy b;
    public final bsvn c;
    private final SwitchPreferenceCompat d;

    public btkl(Context context, bvjj bvjjVar, cjqy cjqyVar, bsvn bsvnVar) {
        this.a = bvjjVar;
        this.b = cjqyVar;
        this.c = bsvnVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.d = switchPreferenceCompat;
        switchPreferenceCompat.t(R.string.MAPS_ACTIVITY_TIMELINE_EMAIL_OPT_OUT_TITLE);
        switchPreferenceCompat.x(R.string.MAPS_ACTIVITY_TIMELINE_EMAIL_OPT_OUT_DESCRIPTION);
        switchPreferenceCompat.n = new btkk(this);
        f();
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.d);
    }

    @Override // defpackage.btjs
    public final /* bridge */ /* synthetic */ Preference b() {
        return this.d;
    }

    @Override // defpackage.btjs
    public final void c() {
        this.c.a();
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
        dceq a = dcet.a();
        a.b(btat.class, new btkm(btat.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
        btrmVar.a(this);
    }

    public final void f() {
        this.d.m(!this.a.m(bvjk.dL, false));
    }
}
