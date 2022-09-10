package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btic  reason: default package */
/* loaded from: classes4.dex */
public final class btic implements btjs {
    public final Context a;
    public final btht b;
    public final cjqy c;
    private final Preference d;

    public btic(Context context, btht bthtVar, akfa akfaVar, cjqy cjqyVar) {
        this.b = bthtVar;
        this.c = cjqyVar;
        this.a = context;
        Preference a = bvjo.a(context);
        this.d = a;
        a.t(R.string.SETTINGS_ITEM_DELETE_ALL_LOCATION_HISTORY_TITLE);
        a.k(context.getString(R.string.SETTINGS_ITEM_DELETE_ALL_LOCATION_HISTORY_DESCRIPTION_REVISED, dbsj.e(akfaVar.o())));
        a.o = new btib(this);
    }

    @Override // defpackage.btjs
    public final void a(PreferenceGroup preferenceGroup) {
        preferenceGroup.aj(this.d);
    }

    @Override // defpackage.btjs
    public final Preference b() {
        return this.d;
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
