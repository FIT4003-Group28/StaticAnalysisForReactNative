package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: abbs  reason: default package */
/* loaded from: classes2.dex */
public final class abbs extends cqiw<abdq> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abdq abdqVar, Context context, cqiv cqivVar) {
        dcha<String, abdw> b = abdqVar.b();
        for (final String str : b.J()) {
            if (!str.isEmpty()) {
                cqivVar.a(new abct(), new abdv(str) { // from class: abbr
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // defpackage.abdv
                    public CharSequence a() {
                        String str2 = this.a;
                        int i2 = abbs.a;
                        return str2;
                    }
                });
            }
            for (abdw abdwVar : b.c(str)) {
                cqivVar.a(new abcu(), abdwVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abdq> a() {
        return cqgr.gd(cqgr.dB(cqrp.d(16.0d)), cqgr.dr(1), cqgr.gq(cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(16.0d)), cqgr.dQ(abcc.a()), cqgr.dF(abcc.a()), cqgr.eB(true), cqmn.a(cqgr.fe(irn.e), cqgr.fh(cqrp.f(14.0d)), cqgr.eU(irg.J()), cqgr.eN(5)), cqgr.eM(abbq.a)), cqgr.gd(cqgr.dr(1), cqgr.ck(C())));
    }
}
