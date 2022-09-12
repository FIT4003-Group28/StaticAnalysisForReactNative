package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xjp  reason: default package */
/* loaded from: classes7.dex */
final class xjp implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ cqjb a;

    public xjp(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        eapq eapqVar = (eapq) this.a.a(cqkpVar, context);
        if (eapqVar == null) {
            return null;
        }
        return context.getResources().getQuantityString(R.plurals.TRANSIT_FREQUENCY_DEPARTURE_CONTENT_DESCRIPTION, (int) eapqVar.h().f(), Integer.valueOf((int) eapqVar.h().f()));
    }
}
