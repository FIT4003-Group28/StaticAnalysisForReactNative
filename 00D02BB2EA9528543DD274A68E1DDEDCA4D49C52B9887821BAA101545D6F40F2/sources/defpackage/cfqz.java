package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfqz  reason: default package */
/* loaded from: classes4.dex */
public final class cfqz extends cqiw<cfra> {
    public static final /* synthetic */ int a = 0;

    private static cqjb<cfra, Integer> f(final cfws cfwsVar) {
        return new cqjb(cfwsVar) { // from class: cfqy
            private final cfws a;

            {
                this.a = cfwsVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return Integer.valueOf(true != this.a.equals(((cfra) cqkpVar).a()) ? 8 : 0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cfra> a() {
        cqmp[] cqmpVarArr = {e(), cqic.c(cfqp.a, new cqmp[0])};
        Integer valueOf = Integer.valueOf((int) R.id.tab_content);
        return cqgr.fY(cqgr.x(ibm.b()), cqgr.fY(cqmpVarArr), cqgr.fY(acnp.a(e(), cqgr.aR(valueOf)), jdz.f(cqgr.bp(-1), cqgr.cd(-1), jdx.c(valueOf)), cqic.f(cfqq.a, new cqmp[0])));
    }

    private static cqmj<cfra> e() {
        cqmp[] cqmpVarArr = {cqgr.aI(cfqr.a)};
        cqmj gd = cqgr.gd(cqgr.x(ibm.b()), cqgr.dr(1), cqgr.aJ(1), cqgr.an(cfqt.a));
        gd.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqgr.aF(cfqs.a)};
        cqmj gd2 = cqgr.gd(cqgr.x(ibm.b()), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fP(new cgbe(), cfqu.a, new cqmp[0]), cqgr.fP(new cfxg(), cfqv.a, cqgr.fJ(f(cfws.OFFLINE))), cqgr.fP(new cfxe(), cfqw.a, cqgr.fJ(f(cfws.NEWBIE))), cqgr.fP(new cfxu(), cfqx.a, cqgr.fJ(f(cfws.VETERAN))));
        gd2.f(cqmpVarArr2);
        return cqgr.fY(gd, gd2);
    }
}
