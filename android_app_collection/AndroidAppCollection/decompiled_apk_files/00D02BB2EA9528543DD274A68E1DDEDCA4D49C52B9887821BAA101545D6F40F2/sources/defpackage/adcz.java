package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: adcz  reason: default package */
/* loaded from: classes2.dex */
public final class adcz extends cqiw<adda> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqsv.f(6.0d, 6.0d, 86.0d, 13.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, adda addaVar, Context context, cqiv cqivVar) {
        List<? extends adfr> a2 = addaVar.a();
        int size = a2.size();
        int i2 = (size + 2) / 3;
        int i3 = 0;
        while (i3 < i2) {
            cqivVar.c(new gvb());
            int i4 = i3 * 3;
            i3++;
            cqivVar.c(new adct(dcdc.r(a2.subList(i4, i3 == i2 ? size : i4 + 3))));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<adda> a() {
        cqtv cqtvVar = b;
        cqlc cqlcVar = adcn.a;
        final cqlc cqlcVar2 = adco.a;
        final cqlc cqlcVar3 = adcp.a;
        return cqqx.E(cqgr.cd(-1), cqgr.bp(-2), cqqx.d(irg.a()), aczp.a(adcm.a), cqqx.B(true), cqgr.bR(cqtvVar), cqgr.bG(cqtvVar), cqgr.bU(0), cqgr.bD(cqrp.d(10.0d)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dr(0), cqgr.aJ(48), cqgr.gd(cqgr.ca(Float.valueOf(1.0f)), cqgr.bp(-2), cqgr.dU(cqrp.d(20.0d)), cqgr.dB(cqrp.d(16.0d)), cqgr.dr(1), cqgr.gd(cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), cqgr.gq(cqgr.eN(5), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), irn.l(), cqgr.l(true), irn.x(), cqgr.eM(cqlcVar)))), cqgr.gd(cqic.c(new cqlc(cqlcVar2, cqlcVar3) { // from class: adcr
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar2;
                this.b = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                adda addaVar = (adda) cqkpVar;
                int i = adcz.a;
                boolean z = false;
                if (cqjv.v((jic) cqlcVar4.a(addaVar)).booleanValue() && cqjv.v((CharSequence) cqlcVar5.a(addaVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.ca(Float.valueOf(0.0f)), cqgr.cd(-2), cqgr.bp(-1), cqgr.dQ(cqrp.d(16.0d)), cqgr.dr(0), cqgr.aJ(16), WebImageView.a(cqic.c(cqjv.x(cqlcVar2), new cqmp[0]), irn.A(), WebImageView.l(cqlcVar2)), cqgr.gq(cqic.c(cqjv.x(cqlcVar3), new cqmp[0]), cqgr.dT(new cqlc(cqlcVar2) { // from class: adcs
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i = adcz.a;
                return cqrp.d(cqjv.v((jic) this.a.a((adda) cqkpVar)).booleanValue() ? dcyn.a : 5.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eN(5), irn.E(), irn.m(), irn.v(), cqgr.eM(cqlcVar3)))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(1), cqgr.dr(1), iue.c(adcq.a), cqgr.ck(C()))));
    }
}
