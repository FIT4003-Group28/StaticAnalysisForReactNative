package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btib  reason: default package */
/* loaded from: classes4.dex */
public final class btib implements auc {
    final /* synthetic */ btic a;

    public btib(btic bticVar) {
        this.a = bticVar;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        this.a.c.i(cjtd.a(dtyi.ak));
        btht bthtVar = this.a.b;
        bthq h = bths.h();
        h.g(this.a.a.getString(R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_TITLE));
        h.f(bths.i(this.a.a.getResources(), R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_CONFIRM, R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_EXPLANATION));
        h.b(this.a.a.getString(R.string.MAPS_ACTIVITY_DELETE_ALL_LOCATION_HISTORY_CONFIRMATION));
        h.c(this.a.a.getString(R.string.DELETE_BUTTON));
        h.d(cjtd.a(dtyi.aj));
        ((btha) h).a = dtyi.an;
        h.e(new btia());
        bthtVar.a(h.a());
        return true;
    }
}
