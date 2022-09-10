package defpackage;
/* compiled from: PG */
/* renamed from: vsw  reason: default package */
/* loaded from: classes7.dex */
final class vsw implements vud {
    final /* synthetic */ vsx a;

    public vsw(vsx vsxVar) {
        this.a = vsxVar;
    }

    @Override // defpackage.vud
    public final void a(dozz dozzVar, dbsg<cjqm> dbsgVar) {
        dozs dozsVar;
        doud doudVar;
        if (dozzVar.b == 22) {
            dozsVar = (dozs) dozzVar.c;
        } else {
            dozsVar = dozs.q;
        }
        dozr dozrVar = dozsVar.l;
        if (dozrVar == null) {
            dozrVar = dozr.e;
        }
        if (dozrVar.b == 1) {
            doudVar = (doud) dozrVar.c;
        } else {
            doudVar = doud.c;
        }
        alav a = alav.a(dozzVar, akrk.g(doudVar), dbsgVar);
        if (a != null) {
            this.a.c.b.b(new alho(a, null));
        }
    }
}
