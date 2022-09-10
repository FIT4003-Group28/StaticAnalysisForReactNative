package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* compiled from: PG */
/* renamed from: xix  reason: default package */
/* loaded from: classes7.dex */
public class xix implements xiv {
    @dzsi
    private final zcv a;

    public xix(eeu eeuVar, dxio<qbt> dxioVar, zrt zrtVar, GmmNotice gmmNotice, List<GmmNotice> list, @dzsi CharSequence charSequence, @dzsi cjtd cjtdVar) {
        zrs a;
        xiw xiwVar = new xiw(eeuVar, dxioVar, list, charSequence, null, qda.PRESERVED);
        if (list.size() <= 1) {
            a = zrtVar.a(gmmNotice, false, 0, cjtdVar, xiwVar);
        } else {
            a = zrtVar.a(gmmNotice, true, list.size() - 1, cjtdVar, xiwVar);
        }
        this.a = a;
    }

    @Override // defpackage.xiv
    @dzsi
    public zcv a() {
        return this.a;
    }

    public xix(eeu eeuVar, dxio<qbt> dxioVar, btvo btvoVar, zrt zrtVar, List<GmmNotice> list, @dzsi CharSequence charSequence, @dzsi cjtd cjtdVar, @dzsi dbsl<zcv> dbslVar) {
        qda qdaVar;
        boolean z = btvoVar.getTransitPagesParameters().H;
        dcdc r = dcdc.r(list);
        if (z) {
            qdaVar = qda.DESCENDING_IMPORTANCE;
        } else {
            qdaVar = qda.DESCENDING_SEVERITY;
        }
        this.a = zru.a(zrtVar, list, cjtdVar, new xiw(eeuVar, dxioVar, r, charSequence, dbslVar, qdaVar), z);
    }
}
