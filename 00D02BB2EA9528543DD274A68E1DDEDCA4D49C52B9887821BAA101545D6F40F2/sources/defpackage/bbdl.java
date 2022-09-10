package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbdl  reason: default package */
/* loaded from: classes3.dex */
final class bbdl implements begr {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bbdo b;

    public bbdl(bbdo bbdoVar, bwrs bwrsVar) {
        this.b = bbdoVar;
        this.a = bwrsVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        ((ckco) this.b.h.a().a(ckit.c)).a(ckis.a(1));
        bwrs bwrsVar = this.a;
        ilo iloVar2 = (ilo) bwrsVar.c();
        dbsk.s(iloVar2);
        bwrsVar.d(iloVar.f(iloVar2).d());
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        ((ckco) this.b.h.a().a(ckit.c)).a(ckis.a(2));
        this.a.d(iloVar);
        this.b.i(R.string.NET_FAIL_TITLE);
    }
}
