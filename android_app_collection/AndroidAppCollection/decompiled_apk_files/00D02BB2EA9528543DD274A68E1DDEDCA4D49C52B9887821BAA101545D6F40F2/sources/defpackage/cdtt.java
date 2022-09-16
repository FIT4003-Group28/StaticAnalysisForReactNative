package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: cdtt  reason: default package */
/* loaded from: classes4.dex */
final class cdtt extends cqiw<cdtu> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cdtu> a() {
        cqtv g = cqsg.g(cqsz.c(), cqrp.d(40.0d));
        return jgn.a(jgn.b(cqrp.d(5.0d)), cqjv.p(cdtl.a, cqmn.a(cqgr.ce(g), cqgr.bq(g)), cqmn.a(cqgr.cg(cdtm.a), cqgr.bq(cqrp.d(280.0d)))), cqgr.bG(cqrp.d(8.0d)), cqgr.cW(cqgr.q(cdtn.a)), iue.c(cdto.a), WebImageView.a(cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(cdtp.a), cqgr.V(cdtq.a)), cqgr.fY(cqgr.aF(new cqlc() { // from class: cdtr
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cdtu cdtuVar = (cdtu) cqkpVar;
                boolean z = true;
                if (cdtuVar.e().intValue() >= 5 && !cqjv.v(cdtuVar.h(6)).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.z(ibm.e()), cqgr.cd(-1), cqgr.bp(-1), cqgr.gq(cqgr.eM(new cqlc() { // from class: cdts
            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((cdtu) cqkpVar).h(6);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), ibq.c(), cqgr.eU(ibm.b()), cqgr.aJ(17))));
    }
}
