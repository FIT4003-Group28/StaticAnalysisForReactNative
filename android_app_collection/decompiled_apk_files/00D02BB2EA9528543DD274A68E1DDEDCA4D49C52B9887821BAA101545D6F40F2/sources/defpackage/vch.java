package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vch  reason: default package */
/* loaded from: classes7.dex */
public class vch extends cqiw<zcr> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zcr zcrVar, Context context, cqiv cqivVar) {
        zcr zcrVar2 = zcrVar;
        dcdc<zfq> a = zcrVar2.a();
        int i2 = 0;
        while (i2 < a.size()) {
            cqivVar.a(new vkc(), a.get(i2));
            cqivVar.a(i2 == a.size() + (-1) ? new vce() : new vcf(), zcrVar2);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zcr> a() {
        return cqgr.gd(cqgr.dr(1), cqgr.x(ibo.i()), cqgr.ck(C()), cqjv.k(Boolean.valueOf(e()), cqgr.dB(cqrp.d(8.0d)), cqgr.dB(cqrp.d(dcyn.a))));
    }

    protected boolean e() {
        return false;
    }
}
