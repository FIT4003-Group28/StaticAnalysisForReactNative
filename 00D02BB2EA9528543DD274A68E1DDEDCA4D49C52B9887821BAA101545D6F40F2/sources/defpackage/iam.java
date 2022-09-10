package defpackage;

import android.content.Context;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: iam  reason: default package */
/* loaded from: classes6.dex */
final class iam extends cqiw<iao> {
    public static final /* synthetic */ int b = 0;
    public final cqjb<iao, cqtv> a;
    private final cqjb<iao, cqtv> c;
    private final iaq d;

    public iam(iaq iaqVar) {
        super(iaqVar);
        this.a = iad.a;
        this.c = new cqjb(this) { // from class: iae
            private final iam a;

            {
                this.a = this;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                iam iamVar = this.a;
                iao iaoVar = (iao) cqkpVar;
                Integer d = iam.d(iaoVar);
                if (d == null) {
                    return cqrp.c(dcyn.a);
                }
                cqtv a = iamVar.a.a(iaoVar, context);
                return a == null ? cqrp.c(dcyn.a) : cqsg.f(cqsg.d(a, cqrp.c(d.intValue())), Float.valueOf(-1.0f));
            }
        };
        this.d = iaqVar;
    }

    @dzsi
    public static Integer d(iao iaoVar) {
        hxy e = iaoVar.e();
        if (e != null) {
            return e.e();
        }
        return null;
    }

    @Override // defpackage.cqiw
    public final cqmj<iao> a() {
        cqmp eU;
        ArrayList arrayList = new ArrayList(3);
        cqss a = this.d.a();
        if (a != null) {
            cqsr.b(a, new int[]{-16842913}, arrayList);
        }
        cqss b2 = this.d.b();
        if (b2 != null) {
            cqsr.b(b2, new int[]{16842913}, arrayList);
        }
        cqmp[] cqmpVarArr = new cqmp[9];
        cqmpVarArr[0] = cqgr.dr(0);
        cqmpVarArr[1] = cqgr.bw(1);
        cqmpVarArr[2] = cqgr.aJ(1);
        cqmpVarArr[3] = cqgr.cd(-2);
        cqmpVarArr[4] = cqgr.bp(-2);
        cqmpVarArr[5] = cqgr.aS(iaf.a);
        cqmpVarArr[6] = iue.c(iag.a);
        cqmp[] cqmpVarArr2 = new cqmp[8];
        cqmpVarArr2[0] = cqgr.cd(-2);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.eM(iah.a);
        cqmpVarArr2[3] = cqgr.cB(1);
        cqmpVarArr2[4] = cqgr.V(iai.a);
        cqmpVarArr2[5] = cqgr.bw(1);
        cqmpVarArr2[6] = cqgr.aJ(1);
        if (this.d.a() != null || this.d.b() != null) {
            eU = cqgr.eU(cqsr.a(arrayList));
        } else {
            eU = cqmp.e;
        }
        cqmpVarArr2[7] = eU;
        cqmj gq = cqgr.gq(cqmpVarArr2);
        gq.e(this.d.c());
        cqmpVarArr[7] = gq;
        cqmpVarArr[8] = cqgr.fY(cqic.f(iaj.a, new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388661), cqgr.bS(this.a), cqgr.bH(this.c), cqgr.bX(iak.a), cqgr.fR(new hxx(this.d.d()), ial.a, new cqmp[0]));
        return cqgr.gd(cqmpVarArr);
    }
}
