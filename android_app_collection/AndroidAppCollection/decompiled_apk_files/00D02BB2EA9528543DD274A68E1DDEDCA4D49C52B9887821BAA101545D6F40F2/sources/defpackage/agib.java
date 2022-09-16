package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: agib  reason: default package */
/* loaded from: classes2.dex */
public final class agib extends cqiw<agzj> {
    public static final /* synthetic */ int b = 0;
    public final agia a;

    public agib(agia agiaVar) {
        super(agiaVar);
        this.a = agiaVar;
    }

    public static <T extends cqkp> cqmj<T> e(final cqlc<T, jic> cqlcVar, final cqlc<T, CharSequence> cqlcVar2, final cqlc<T, Boolean> cqlcVar3) {
        return cqgr.gd(cqgr.aF(new cqlc(cqlcVar, cqlcVar2) { // from class: aghx
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                cqlc cqlcVar5 = this.b;
                int i = agib.b;
                boolean z = false;
                if (cqjv.v((jic) cqlcVar4.a(cqkpVar)).booleanValue() && cqjv.v((CharSequence) cqlcVar5.a(cqkpVar)).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.aJ(16), WebImageView.a(cqgr.aF(cqjv.x(cqlcVar)), cqgr.ch(cqrp.d(16.0d)), cqgr.bG(cqrp.d(8.0d)), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), WebImageView.l(cqlcVar)), iue.f(cqgr.aF(cqjv.x(cqlcVar2)), ibq.q(), cqgr.eW(new cqlc(cqlcVar3) { // from class: aghy
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar4 = this.a;
                int i = agib.b;
                return ((Boolean) cqlcVar4.a(cqkpVar)).booleanValue() ? ibm.b() : ibm.o();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eM(cqlcVar2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<agzj> a() {
        cqmp cqmpVar;
        cqmp cqmpVar2;
        cqmp[] cqmpVarArr = new cqmp[11];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dU(cqrp.d(this.a.d()));
        cqmpVarArr[3] = cqgr.dB(cqrp.d(this.a.e()));
        cqmpVarArr[4] = cqgr.dQ(cqrp.d(this.a.f()));
        cqmpVarArr[5] = cqgr.dF(cqrp.d(this.a.g()));
        cqmpVarArr[6] = cqgr.x(irn.G());
        cqmpVarArr[7] = cqgr.cW(cqgr.q(aghq.a));
        cqmpVarArr[8] = iue.c(new cqlc(this) { // from class: aghr
            private final agib a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((agzj) cqkpVar).e(this.a.a.h());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmp[] cqmpVarArr2 = new cqmp[5];
        cqmpVarArr2[0] = cqgr.cd(0);
        cqmpVarArr2[1] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr2[2] = cqgr.dr(1);
        cqmp[] cqmpVarArr3 = new cqmp[9];
        cqmpVarArr3[0] = cqgr.bD(cqrp.d(8.0d));
        cqmpVarArr3[1] = ibq.p();
        cqmpVarArr3[2] = cqgr.eU(ibm.t());
        cqmpVarArr3[3] = cqgr.cp(Float.valueOf(1.2f));
        cqmpVarArr3[4] = cqgr.eN(5);
        cqmpVarArr3[5] = cqgr.cB(Integer.valueOf(this.a.a()));
        if (this.a.b()) {
            cqmpVar = cqgr.cl(Integer.valueOf(this.a.a()));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr3[6] = cqmpVar;
        cqmpVarArr3[7] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr3[8] = cqgr.eM(aghs.a);
        cqmpVarArr2[3] = cqgr.gq(cqmpVarArr3);
        cqmpVarArr2[4] = e(aght.a, aghu.a, cqkz.a(false));
        cqmpVarArr[9] = cqgr.gd(cqmpVarArr2);
        if (this.a.c()) {
            cqmpVar2 = jgn.a(cqic.c(cqjv.x(aghv.a), new cqmp[0]), cqgr.ch(cqrp.d(80.0d)), cqgr.bR(cqrp.d(16.0d)), jgn.b(cqrp.d(8.0d)), WebImageView.a(cqgr.ei(ImageView.ScaleType.CENTER_CROP), WebImageView.l(aghw.a)));
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr[10] = cqmpVar2;
        return cqgr.gd(cqmpVarArr);
    }
}
