package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xjn  reason: default package */
/* loaded from: classes7.dex */
public final class xjn implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ cqjb a;

    public xjn(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        eapr eaprVar = (eapr) this.a.a(cqkpVar, context);
        if (eaprVar == null) {
            return null;
        }
        return context.getString(R.string.TRANSIT_UPCOMING_DEPARTURE_TIME_CONTENT_DESCRIPTION, bvtb.k(context, eaow.e(eaprVar.Tf()).g(), eaprVar.v().s()));
    }
}
