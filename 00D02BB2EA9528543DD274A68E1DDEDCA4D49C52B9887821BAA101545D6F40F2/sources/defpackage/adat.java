package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adat  reason: default package */
/* loaded from: classes.dex */
public final class adat implements adab<adax> {
    @dzsi
    private final adba a;

    public adat(acyr acyrVar, adbb adbbVar, dktk dktkVar, absg absgVar) {
        dkur a = acyrVar.a();
        adba adbaVar = null;
        if (dktkVar.ordinal() == 1) {
            dktp dktpVar = a.v;
            int a2 = dkto.a((dktpVar == null ? dktp.e : dktpVar).b);
            if (a2 != 0 && a2 == 4) {
                achc achcVar = achc.HOME_SCREEN_EXPLORE_TAB_FEEDBACK_CARD;
                gga a3 = adbbVar.a.a();
                adbb.a(a3, 1);
                dxio a4 = ((dxjh) adbbVar.b).a();
                adbb.a(a4, 2);
                dzsj<adaf> dzsjVar = adbbVar.c;
                adbb.a(achcVar, 4);
                adbb.a(absgVar, 5);
                adbaVar = new adba(a3, a4, dzsjVar, achcVar, absgVar);
            }
        }
        this.a = adbaVar;
    }

    @Override // defpackage.aczy
    public final List<cqix<adax>> a(List<cqix<?>> list) {
        if (this.a == null || list.isEmpty()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adaw(), this.a));
    }

    @Override // defpackage.aczy
    public final boolean b() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean d() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> g() {
        return dcmr.a;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> h() {
        return dcmr.a;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
    }
}
