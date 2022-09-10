package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wma  reason: default package */
/* loaded from: classes7.dex */
public final class wma implements cqjb {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        eapq af = ((xkc) cqkpVar).af();
        if (af == null) {
            return "";
        }
        int abs = (int) Math.abs(af.h().f());
        int v = xjz.v(af) - 1;
        return v != 0 ? v != 1 ? v != 2 ? "" : context.getResources().getQuantityString(R.plurals.TRANSIT_UPCOMING_DEPARTURE_MINUTES, abs, Integer.valueOf(abs)) : context.getString(R.string.TRANSIT_UPCOMING_DEPARTURE_NOW_STANDALONE) : context.getResources().getQuantityString(R.plurals.TRANSIT_PAST_DEPARTURE_MINUTES, abs, Integer.valueOf(abs));
    }
}
