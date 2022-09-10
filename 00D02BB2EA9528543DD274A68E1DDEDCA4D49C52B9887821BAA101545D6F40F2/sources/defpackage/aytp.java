package defpackage;

import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aytp  reason: default package */
/* loaded from: classes3.dex */
public class aytp extends cqiw<ayvg> {
    public static final /* synthetic */ int a = 0;
    private static final cqtv b = cqrp.d(3.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    public static final cqmj<ayvg> e(cqmp<ayvg>... cqmpVarArr) {
        cqss j = ibm.j();
        cqtv cqtvVar = b;
        cqmj<ayvg> gd = cqgr.gd(cqgr.aW(1), cqgr.c(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(ibn.f()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.dr(1), cqgr.V(aytj.a), cqgr.az(true), cqgr.gd(cqgr.dr(0), cqgr.cd(-1), cqgr.bq(cqrp.d(6.0d)), cqgr.x(cqtt.l(j, cqtvVar)), cqgr.fL(Float.valueOf(1.0f)), cqgr.gs(cqgr.cd(0), cqgr.bp(-1), cqgr.cc(aytk.a), cqgr.x(cqtt.l(ibm.L(), cqtvVar)))));
        gd.f(cqmpVarArr);
        return gd;
    }

    private static cqmj<ayvg> f(int i, final cqlc<ayvg, Boolean> cqlcVar) {
        cqlc cqlcVar2 = new cqlc(cqlcVar) { // from class: aytd
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Integer.valueOf(true != ((Boolean) this.a.a((ayvg) cqkpVar)).booleanValue() ? R.string.ACCESSIBILITY_LIST_PROGRESS_BAR_ITEM_STATUS_INCOMPLETE : R.string.ACCESSIBILITY_LIST_PROGRESS_BAR_ITEM_STATUS_COMPLETE);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        Integer valueOf = Integer.valueOf(i);
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.az(true), cqgr.U(cqiq.d(cqlcVar2, cqiq.g(valueOf))), cqgr.gq(cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), cqgr.bY(cqjd.e()), cqgr.eL(valueOf), ibq.f(), cqgr.fh(cqrp.f(16.0d)), cqgr.cd(-1), cqgr.bp(-2), cqgr.cB(1), cqgr.eN(5), ibq.v()), cqgr.gc(cqgr.aI(cqlcVar), cqgr.bY(cqjd.f(), cqjd.t()), cqgr.bp(-2), cqgr.cd(-2), cqgr.eE(cqrt.g(2131232565, ibm.L()))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<ayvg> a() {
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b()), cqgr.gd(cqgr.bY(cqjd.i()), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.g()), cqgr.dr(1), cqgr.dU(cqrp.d(12.0d)), cqgr.gq(cqgr.eL(Integer.valueOf((int) R.string.LIST_PROGRESS_BAR_NOTICE_ONLY_YOU_CAN_SEE_THIS)), cqgr.cd(-2), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.dU(cqrp.d(4.0d)), cqgr.cB(1), ibq.q(), cqgr.eN(5), cqgr.eU(ibm.o())), cqgr.gj(cqgr.cd(-2), cqgr.bp(-2), cqgr.dQ(ibn.f()), cqgr.J(true), cqgr.cW(cqgr.q(ayta.a)), iue.b(cjtd.a(dtxo.I)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.e(), cqjd.t()), cqgr.eL(Integer.valueOf((int) R.string.LIST_PROGRESS_BAR_TITLE)), ibq.f(), cqgr.fh(cqrp.f(16.0d)), ibq.v(), cqgr.dF(cqrp.d(4.0d))), cqgr.gc(cqgr.bY(cqjd.f()), cqgr.ch(ibn.a()), cqgr.aJ(8388613), cqgr.V(aytg.a), cqgr.eG(ayth.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.cW(cqgr.q(ayti.a)), iue.b(cjtd.a(dtxo.I)), cqgr.x(ibq.E()))), e(new cqmp[0]), cqgr.gd(cqgr.aI(aytl.a), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), iuh.b(cqgr.cd(-1)), cqgr.gd(cqgr.dU(cqrp.d(12.0d)), cqgr.dB(ibn.d()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), f(R.string.LIST_PROGRESS_BAR_ITEM_LIST_NAME, aytm.a), f(R.string.LIST_PROGRESS_BAR_ITEM_LIST_Description, aytn.a), f(R.string.LIST_PROGRESS_BAR_ITEM_AT_LEAST_FOUR_PLACES, ayto.a), f(R.string.LIST_PROGRESS_BAR_ITEM_PLACES_NOTES, aytb.a), f(R.string.LIST_PROGRESS_BAR_ITEM_PLACES_PHOTOS, aytc.a), cqgr.gq(cqgr.aF(cqjv.x(ayte.a)), cqgr.cd(-1), cqgr.dr(0), cqgr.aJ(17), cqgr.cH(ibn.a()), cqgr.dU(ibn.d()), cqgr.dB(ibn.f()), cqgr.dF(cqrp.d(24.0d)), cqgr.cO(LinkMovementMethod.getInstance()), cqgr.eM(aytf.a), ibq.q(), cqgr.cp(Float.valueOf(1.3f)), cqgr.eN(5), cqgr.eU(ibm.o()))))), ict.n(false, cqgr.cd(-1), cqgr.bY(cqjd.j())));
    }
}
