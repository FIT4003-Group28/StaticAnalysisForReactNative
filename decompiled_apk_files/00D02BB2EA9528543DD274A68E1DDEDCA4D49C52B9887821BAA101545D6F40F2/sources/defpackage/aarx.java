package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aarx  reason: default package */
/* loaded from: classes2.dex */
public final class aarx extends cqiw<aawo> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, aawo aawoVar, Context context) {
        aawo aawoVar2 = aawoVar;
        cqiv cqivVar = new cqiv();
        if (aawoVar2.a().size() == 1) {
            cqivVar.f(new aaun(), aawoVar2.a());
        } else {
            boolean z = false;
            for (aawu aawuVar : aawoVar2.a()) {
                if (z) {
                    cqivVar.a(new hsd(), hsd.d(cqrp.d(4.0d)));
                }
                cqivVar.a(new aauj(), aawuVar);
                z = true;
            }
        }
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aawo> a() {
        return cqgr.gd(cqgr.aI(aart.a), cqgr.cd(-1), iue.c(aaru.a), cqgr.cd(-1), cqgr.bV(cqrp.d(8.0d)), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(20.0d)), cqgr.dQ(aahw.a(20)), cqgr.dF(aahw.a(20)), cqgr.dr(1), cqgr.P(false), cqgr.L(false), aahw.b(), cqgr.aW(2), cqgr.dr(1), cqgr.gq(aahw.g(), cqgr.eL(Integer.valueOf(aaai.EXPERIENCE_SHEET_ARTIST_TITLE))), cqgr.gm(cqgr.bq(cqrp.d(8.0d))), cqgr.gd(cqgr.aI(aarv.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C())), cqgr.ga(cqgr.aF(aarw.a), cqgr.eh(false), cqgr.ep(false), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C()))));
    }
}
