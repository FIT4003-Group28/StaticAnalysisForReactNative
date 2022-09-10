package defpackage;

import android.content.Context;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: bmhf  reason: default package */
/* loaded from: classes3.dex */
public class bmhf extends cqiw<zcv> {
    protected static final cqjb<zcv, CharSequence> a = new bmhe();

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public static CharSequence e(zcv zcvVar, Context context) {
        String f = xiu.f(zcvVar, context);
        String f2 = zcvVar.f();
        String i = zcvVar.i();
        if (TextUtils.isEmpty(f)) {
            return i;
        }
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsv a2 = bvsxVar.a(f);
        a2.i();
        a2.l(zcvVar.h().b(context));
        if (!TextUtils.isEmpty(i) || !TextUtils.isEmpty(f2)) {
            bvsu b = bvsxVar.b("%s %s\n%s");
            b.a(a2, f2, i);
            return b.c();
        }
        return a2.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public cqmj<zcv> a() {
        return cqgr.gq(itj.i(dtyc.eF), cqgr.cd(-1), cqgr.bq(cqrp.d(60.0d)), cqgr.x(irm.n), cqgr.cW(bmhc.a), cqgr.J(true), cqgr.dU(irh.h()), cqgr.dB(irh.h()), cqgr.dQ(irh.c()), cqgr.dF(cqrp.d(24.0d)), cqgr.al(irh.b()), cqgr.aj(bmhd.a), cqgr.ah(cqtt.j(vyt.e, cqrp.d(8.0d))), cqgr.aJ(16), irn.m(), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eK(a), cqgr.eN(5));
    }
}
