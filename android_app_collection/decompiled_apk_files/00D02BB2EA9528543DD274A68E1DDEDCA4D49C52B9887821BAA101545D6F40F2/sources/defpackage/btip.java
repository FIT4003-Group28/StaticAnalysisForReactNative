package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btip  reason: default package */
/* loaded from: classes4.dex */
public final class btip implements btjs {
    public final bvjj a;
    public final cjqy b;
    public final bsvn c;
    private final SwitchPreferenceCompat d;

    public btip(Context context, bvjj bvjjVar, cjqy cjqyVar, bsvn bsvnVar) {
        this.a = bvjjVar;
        this.b = cjqyVar;
        this.c = bsvnVar;
        SwitchPreferenceCompat switchPreferenceCompat = new SwitchPreferenceCompat(context);
        this.d = switchPreferenceCompat;
        switchPreferenceCompat.t(R.string.MAPS_ACTIVITY_PHOTOS_GOOGLE_PHOTOS);
        switchPreferenceCompat.x(R.string.MAPS_ACTIVITY_PHOTOS_SHOW_GOOGLE_PHOTOS_REVISED);
        switchPreferenceCompat.n = new btio(this);
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
        a.b(btat.class, new btiq(btat.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
        btrmVar.a(this);
    }

    public final void f() {
        this.d.m(!this.a.m(bvjk.dK, false));
    }
}
