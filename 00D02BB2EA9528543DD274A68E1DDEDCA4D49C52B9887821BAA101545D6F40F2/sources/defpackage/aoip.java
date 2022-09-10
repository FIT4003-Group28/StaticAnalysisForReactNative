package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoip  reason: default package */
/* loaded from: classes2.dex */
public final class aoip {
    public final dcdc<bcdf> a;
    private final dcdc<bcdh> b;
    private final aoio c;

    public aoip(dcdc<dwfl> dcdcVar, bbut bbutVar, Application application) {
        aoio aoioVar = new aoio(bbutVar);
        this.c = aoioVar;
        dccx F = dcdc.F();
        for (int i = 0; i < dcdcVar.size(); i++) {
            dwfl dwflVar = dcdcVar.get(i);
            cjta b = cjtd.b();
            b.d = dtyi.aT;
            int i2 = dwflVar.a;
            if ((i2 & 2) != 0 && (i2 & 1) != 0) {
                b.b = dwflVar.b;
                b.g(dwflVar.c);
            }
            dhjx dhjxVar = dwflVar.m;
            dhkd dhkdVar = (dhjxVar == null ? dhjx.f : dhjxVar).d;
            float f = (dhkdVar == null ? dhkd.d : dhkdVar).b;
            dhjx dhjxVar2 = dwflVar.m;
            dhkd dhkdVar2 = (dhjxVar2 == null ? dhjx.f : dhjxVar2).d;
            float f2 = (dhkdVar2 == null ? dhkd.d : dhkdVar2).c;
            int a = dwfc.a(dwflVar.f);
            F.g(new aoir(aple.d(dwflVar.h, ckqc.FIFE_SMART_CROP, null), (a != 0 && a == 3 && f > 0.0f && f2 > 0.0f) ? f / f2 : 1.0f, new aoin(aoioVar, dcdcVar, i), b.a(), application));
        }
        dcdc<bcdh> f3 = F.f();
        this.b = f3;
        this.a = bccu.a(f3, null);
    }
}
