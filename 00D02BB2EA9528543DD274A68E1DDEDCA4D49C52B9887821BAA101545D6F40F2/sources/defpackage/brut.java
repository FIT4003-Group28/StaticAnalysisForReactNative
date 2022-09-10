package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: brut  reason: default package */
/* loaded from: classes4.dex */
public final class brut extends cqiw<brvd> {
    public static final cqrp a = ibn.e();
    public static final cqrp b = cqrp.f(24.0d);
    public static final cqrp c = cqrp.f(24.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, brvd brvdVar, Context context, cqiv cqivVar) {
        brur brurVar;
        brvd brvdVar2 = brvdVar;
        cqtv an = brvdVar2.an();
        int intValue = brvdVar2.ao().intValue();
        cqrp cqrpVar = a;
        cqtv g = cqsg.g(cqsg.f(cqsg.d(an, cqrpVar), Float.valueOf(1.0f / intValue)), cqrpVar);
        List<zef> am = brvdVar2.am();
        if (am.size() == 1) {
            cqivVar.f(new brur(g, an), am);
            return;
        }
        float f = 0.0f;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < am.size(); i3++) {
            int e = cqsg.g(an, g).e(context);
            f += (am.get(i3).j() == null ? g : c).a(context);
            if (i2 == 0) {
                if (f > e) {
                    i2 = i3;
                    z = true;
                } else {
                    i2 = 0;
                }
            }
        }
        if (z) {
            am = am.subList(0, i2);
        }
        for (zef zefVar : am) {
            if (zefVar.j() == null) {
                brurVar = new brur(g, g);
            } else {
                cqrp cqrpVar2 = c;
                brurVar = new brur(cqrpVar2, cqrpVar2);
            }
            cqivVar.a(brurVar, zefVar);
        }
        if (!z) {
            return;
        }
        cqivVar.c(new brus());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brvd> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.ck(C()));
    }
}
