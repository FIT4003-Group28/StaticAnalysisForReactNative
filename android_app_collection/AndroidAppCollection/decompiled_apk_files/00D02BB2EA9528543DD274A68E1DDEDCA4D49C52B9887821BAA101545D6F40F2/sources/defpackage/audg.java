package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: audg  reason: default package */
/* loaded from: classes2.dex */
public final class audg extends cqiw<audo> {
    public static final cqtv a;
    public static final cqtv b;
    public static final cqrp c;
    public static final cqrp d;
    public static final cqrp e;
    public static final cqrp f;
    public static final cqrp g;
    public static final cqrp h;
    private static final cqrp i;
    private static final cqrp j;
    private static final cqrp k;
    private static final cqrp l;

    static {
        cqrp d2 = cqrp.d(2.0d);
        i = d2;
        cqrp d3 = cqrp.d(3.0d);
        j = d3;
        a = cqsg.g(audm.a, cqsg.d(d2, d2));
        b = cqsg.g(audm.a, cqsg.d(d3, d3));
        c = cqrp.d(28.0d);
        d = cqrp.d(24.0d);
        e = cqrp.d(27.0d);
        f = cqrp.d(22.0d);
        k = cqrp.d(13.0d);
        g = cqrp.d(14.0d);
        h = cqrp.d(2.0d);
        l = cqrp.d(5.0d);
    }

    public static CharSequence e(audo audoVar, Context context) {
        String string = context.getResources().getString(R.string.SPEED_LIMIT_CONTENT_DESCRIPTION);
        if (!audoVar.b().a()) {
            return string;
        }
        String quantityString = context.getResources().getQuantityString(audoVar.f().intValue(), audoVar.b().b().intValue());
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(quantityString).length());
        sb.append(string);
        sb.append(" ");
        sb.append(quantityString);
        return String.format(sb.toString(), audoVar.b().b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<audo> a() {
        cqlc cqlcVar = audb.a;
        cqrp cqrpVar = i;
        cqmn a2 = cqmn.a(cqgr.dQ(cqrpVar), cqgr.dU(cqrpVar), cqgr.dB(cqrpVar));
        cqrp cqrpVar2 = j;
        return cqgr.gj(cqgr.U(aucw.a), cqgr.bw(8388611), cqgr.ce(audm.a), cqgr.bp(-2), cqjv.n(cqlcVar, a2, cqmn.a(cqgr.dQ(cqrpVar2), cqgr.dU(cqrpVar2), cqgr.dB(cqrpVar2))), cqgr.fY(cqgr.cg(audc.a), cqjv.l(audd.a, cqgr.bp(-1), cqgr.bq(b)), cqgr.bY(cqjd.c()), cqgr.y(auda.a)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.c()), cqgr.dE(aude.a), cqgr.fi(audf.a), cqgr.fj(1), cqgr.eU(ire.i()), cqgr.aW(2), cqgr.eM(aucx.a)), cqgr.gq(cqgr.aF(aucy.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bY(cqjd.j(), cqjd.s()), cqgr.dB(l), cqgr.fh(k), cqgr.fj(1), cqgr.eU(ire.i()), cqgr.aW(2), cqgr.eM(aucz.a)));
    }
}
