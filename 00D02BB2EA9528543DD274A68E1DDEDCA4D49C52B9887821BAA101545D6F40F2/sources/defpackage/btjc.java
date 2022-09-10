package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btjc  reason: default package */
/* loaded from: classes4.dex */
public final class btjc implements btjs {
    public final Context a;
    public final btvo b;
    public final cjqy c;
    public final dxio<bvvw> d;
    private final Preference e;

    public btjc(Context context, dxio<bvvw> dxioVar, btvo btvoVar, akfa akfaVar, cjqy cjqyVar) {
        String string;
        this.a = context;
        this.d = dxioVar;
        this.b = btvoVar;
        this.c = cjqyVar;
        if (dbsj.e(akfaVar.o()).isEmpty()) {
            string = context.getString(R.string.SETTINGS_ITEM_LOCATION_HISTORY_RETENTION_DESCRIPTION);
        } else {
            string = context.getString(R.string.SETTINGS_ITEM_LOCATION_HISTORY_RETENTION_USER_SUMMARY, dbsj.e(akfaVar.o()));
        }
        Preference preference = new Preference(context);
        this.e = preference;
        preference.t(R.string.SETTINGS_ITEM_LOCATION_HISTORY_RETENTION_TITLE);
        preference.k(string);
        preference.o = new btjb(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.e);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.e;
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
