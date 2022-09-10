package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xjx  reason: default package */
/* loaded from: classes7.dex */
public final class xjx implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ cqjb a;

    public xjx(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        eapq eapqVar = (eapq) this.a.a(cqkpVar, context);
        if (eapqVar == null) {
            return null;
        }
        Resources resources = context.getResources();
        int abs = (int) Math.abs(eapqVar.h().f());
        int v = xjz.v(eapqVar) - 1;
        if (v == 0) {
            return resources.getQuantityString(R.plurals.TRANSIT_PAST_DEPARTURE_RELATIVE_TIME_CONTENT_DESCRIPTION, abs, String.valueOf(abs));
        }
        if (v == 1) {
            return resources.getString(R.string.TRANSIT_UPCOMING_DEPARTURE_RELATIVE_TIME_NOW_CONTENT_DESCRIPTION);
        }
        if (v == 2) {
            return resources.getQuantityString(R.plurals.TRANSIT_UPCOMING_DEPARTURE_RELATIVE_TIME_CONTENT_DESCRIPTION, abs, String.valueOf(abs));
        }
        return null;
    }
}
