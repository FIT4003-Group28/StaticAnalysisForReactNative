package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bibn  reason: default package */
/* loaded from: classes3.dex */
final class bibn extends cqiw<bibp> {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ CharSequence a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bibn(Object[] objArr, CharSequence charSequence, boolean z) {
        super(objArr);
        this.a = charSequence;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bibp> a() {
        cqmp[] cqmpVarArr = new cqmp[9];
        final CharSequence charSequence = this.a;
        cqmpVarArr[0] = cqgr.eM(new cqlc(charSequence) { // from class: biaz
            private final CharSequence a;

            {
                this.a = charSequence;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                CharSequence charSequence2 = this.a;
                return cqjv.v(charSequence2).booleanValue() ? ((bibp) cqkpVar).b() : charSequence2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[1] = this.b ? cqmp.e : cqmn.a(cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END));
        cqmpVarArr[2] = cqgr.dQ(bibo.b);
        cqmpVarArr[3] = ibq.p();
        cqmpVarArr[4] = cqgr.dU(cqrp.d(4.0d));
        cqmpVarArr[5] = cqgr.dB(cqrp.d(4.0d));
        cqmpVarArr[6] = cqgr.eN(5);
        cqmpVarArr[7] = cqgr.aJ(16);
        cqmpVarArr[8] = cqgr.cd(-2);
        cqmj gq = cqgr.gq(cqmpVarArr);
        cqmj gd = cqgr.gd(cqgr.ce(cqsg.g(bibo.a, bibo.b)), cqgr.dQ(ibn.f()), cqgr.dU(cqrp.d(3.0d)), WebImageView.b(bibe.a, cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)));
        cqmp[] cqmpVarArr2 = new cqmp[10];
        cqmpVarArr2[0] = cqgr.aF(cqjv.x(bibf.a));
        cqmpVarArr2[1] = cqgr.dQ(bibo.b);
        cqmpVarArr2[2] = cqgr.dU(cqrp.d(4.0d));
        cqmpVarArr2[3] = cqgr.dB(cqrp.d(4.0d));
        cqmpVarArr2[4] = cqgr.eM(bibg.a);
        cqmpVarArr2[5] = this.b ? cqmp.e : cqmn.a(cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END));
        cqmpVarArr2[6] = cqgr.eN(5);
        cqmpVarArr2[7] = cqgr.aJ(16);
        cqmpVarArr2[8] = cqgr.cd(-1);
        cqmpVarArr2[9] = cqgr.eU(ibm.n());
        cqmj gq2 = cqgr.gq(cqmpVarArr2);
        cqmj gq3 = cqgr.gq(cqgr.aD(Boolean.valueOf(!this.b)), cqgr.eM(bibh.a), cqgr.fj(2), cqgr.cB(1), cqgr.dQ(bibo.b), cqgr.dU(cqrp.d(4.0d)), cqgr.dB(cqrp.d(4.0d)), cqgr.eN(5), cqgr.aJ(16), cqgr.cd(-2), cqgr.eU(ibm.n()));
        cqlc x = cqjv.x(bibi.a);
        cqmn a = cqmn.a(cqgr.eL(Integer.valueOf((int) R.string.ADD_NOTE)), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.ACCESSIBILITY_ADD_NOTE_FOR_LIST), cqiq.h(bibj.a))));
        cqmp[] cqmpVarArr3 = {cqgr.eL(Integer.valueOf((int) R.string.EDIT_NOTE)), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.ACCESSIBILITY_EDIT_NOTE_FOR_LIST), cqiq.h(bibk.a)))};
        final boolean z = this.b;
        return cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.aJ(48), cqgr.dU(ibn.d()), gd, cqgr.gd(cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(16), gq, gq2, gq3, cqgr.gd(cqgr.cH(ibn.d()), cqgr.dr(0), cqgr.bp(-2), cqgr.cd(-1), cqgr.eN(5), bibo.e(cqjv.n(x, a, cqmn.a(cqmpVarArr3)), cqgr.cW(cqgr.q(bibl.a)), iue.c(bibm.a), cqgr.aF(new cqlc(z) { // from class: biba
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                boolean z2 = this.a;
                bibp bibpVar = (bibp) cqkpVar;
                int i = bibn.c;
                boolean z3 = false;
                if (!bibpVar.j().booleanValue() || (!z2 && !cqjv.v(bibpVar.d()).booleanValue())) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), bibo.e(cqgr.eL(Integer.valueOf((int) R.string.VIEW_LIST)), cqgr.cW(cqgr.q(bibb.a)), iue.c(bibc.a), cqgr.U(cqiq.b(Integer.valueOf((int) R.string.ACCESSIBILITY_VIEW_LIST_FOR_LIST), cqiq.h(bibd.a))), cqgr.aG(Boolean.valueOf(this.b))))));
    }
}
