package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btii  reason: default package */
/* loaded from: classes4.dex */
public final class btii implements btjs {
    public final btig a;
    public final cjqy b;
    private final Preference c;

    public btii(Context context, btig btigVar, akfa akfaVar, cjqy cjqyVar) {
        this.a = btigVar;
        this.b = cjqyVar;
        Preference a = bvjo.a(context);
        this.c = a;
        a.t(R.string.SETTINGS_ITEM_DELETE_LOCATION_HISTORY_RANGE_TITLE);
        a.k(context.getString(R.string.SETTINGS_ITEM_DELETE_LOCATION_HISTORY_RANGE_DESCRIPTION_REVISED, dbsj.e(akfaVar.o())));
        a.o = new btih(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.c);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.c;
    }

    @Override // defpackage.btjs
    public final void c() {
    }

    @Override // defpackage.btjs
    public final void d(btrm btrmVar) {
    }

    @Override // defpackage.btjs
    public final void e(btrm btrmVar) {
    }
}
