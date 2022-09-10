package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ozs  reason: default package */
/* loaded from: classes7.dex */
public class ozs implements oxx {
    private final dcdc<oxw> a;
    private final oxw b;

    public ozs(cjzt cjztVar, dtqe dtqeVar) {
        if ((dtqeVar.a & 2) != 0) {
            dtkq dtkqVar = dtqeVar.b;
            oyf.a(dtkqVar == null ? dtkq.f : dtkqVar);
        }
        dccx F = dcdc.F();
        for (dtqd dtqdVar : dtqeVar.c) {
            F.g(new ozr(cjztVar, dtqeVar, dtqdVar, false));
        }
        this.a = F.f();
        dtqd dtqdVar2 = dtqeVar.d;
        this.b = new ozr(cjztVar, dtqeVar, dtqdVar2 == null ? dtqd.i : dtqdVar2, true);
    }

    @Override // defpackage.oxe
    public cjtd a() {
        throw null;
    }

    @Override // defpackage.oxx
    public List<oxw> b() {
        return this.a;
    }

    @Override // defpackage.oxx
    public oxw c() {
        return this.b;
    }
}
