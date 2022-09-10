package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: atdu  reason: default package */
/* loaded from: classes2.dex */
final class atdu implements atdt {
    @dzsi
    private akqq a;
    private boolean b;
    private dbsg<Boolean> c = dbpy.a;

    @Override // defpackage.atdt
    public final void a(atlq atlqVar) {
        crqf crqfVar = atlqVar.m;
        dbsk.s(crqfVar);
        amub amubVar = crqfVar.g().a;
        boolean z = false;
        if (!amubVar.j().n() || !amubVar.l().n()) {
            this.b = false;
            return;
        }
        akqq akqqVar = amubVar.l().e;
        dbsk.s(akqqVar);
        akqq akqqVar2 = amubVar.j().e;
        dbsk.s(akqqVar2);
        if (akqo.e(akqqVar2, akqqVar) > 5000.0d) {
            z = true;
        }
        this.b = z;
        this.a = akqqVar;
    }

    @Override // defpackage.atdt
    public final void b(atlq atlqVar) {
        GmmLocation gmmLocation;
        crqf crqfVar = atlqVar.m;
        if ((this.c.a() && this.c.b().booleanValue()) || crqfVar == null || (gmmLocation = crqfVar.a) == null) {
            return;
        }
        akqq B = gmmLocation.B();
        akqq akqqVar = this.a;
        dbsk.s(akqqVar);
        this.c = dbsg.i(Boolean.valueOf(akqo.e(B, akqqVar) < 5000.0d));
    }

    @Override // defpackage.atdt
    public final dvum c() {
        return dvum.AFTER_NAVIGATION_COMPLETE;
    }

    @Override // defpackage.atdt
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.atdt
    public final boolean e() {
        return this.b && this.c.c(true).booleanValue();
    }
}
