package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: zru  reason: default package */
/* loaded from: classes7.dex */
public final class zru {
    @dzsi
    public static zcv a(zrt zrtVar, @dzsi List<GmmNotice> list, @dzsi cjtd cjtdVar, @dzsi cqkn<zcv> cqknVar, boolean z) {
        GmmNotice gmmNotice = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            gmmNotice = alca.t(list);
        }
        if (gmmNotice == null) {
            gmmNotice = alca.w(list);
            dbsk.s(gmmNotice);
        }
        return zrtVar.a(gmmNotice, list.size() > 1, list.size() - 1, cjtdVar, cqknVar);
    }
}
