package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: auuu  reason: default package */
/* loaded from: classes2.dex */
public final class auuu extends aujb {
    private final dxio<apyx> c;
    private final dxio<aqrq> d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auuu(defpackage.auuq r2, defpackage.dxio<defpackage.apyx> r3, defpackage.dxio<defpackage.aqrq> r4) {
        /*
            r1 = this;
            dpyv r0 = defpackage.dpyv.BUSINESS_MESSAGING_MERCHANT_UNRESPONSIVE_SUMMARY
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r0.d(r2)
            aujd r2 = r0.a()
            r1.<init>(r2)
            r1.c = r3
            r1.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auuu.<init>(auuq, dxio, dxio):void");
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        return this.c.a().e();
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, btlu btluVar) {
        String str = Uri.parse(dlfvVar.c).getPathSegments().get(2);
        aqrq a = this.d.a();
        if (btluVar == null) {
            return true;
        }
        boolean z = a.a.E(bvjk.jt, btluVar, dcmr.a).size() > 1;
        if (z) {
            apyx apyxVar = a.c;
            if (!apyxVar.e() || !apyxVar.b.a().getBusinessMessagingParameters().O) {
                a.a(true, true, str);
                return true;
            }
        }
        boolean a2 = true ^ a.b.a(str, btluVar).a();
        a.a(a2, z, str);
        return a2;
    }

    @Override // defpackage.aujb
    public final boolean t() {
        return true;
    }
}
