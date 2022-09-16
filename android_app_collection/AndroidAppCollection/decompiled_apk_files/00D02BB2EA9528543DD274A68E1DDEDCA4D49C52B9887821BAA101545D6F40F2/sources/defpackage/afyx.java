package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: afyx  reason: default package */
/* loaded from: classes2.dex */
final class afyx implements crzp<btlu> {
    final /* synthetic */ afyy a;

    public afyx(afyy afyyVar) {
        this.a = afyyVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        afyy afyyVar = this.a;
        btlu btluVar = afyyVar.h;
        afyyVar.h = crzmVar.l();
        if (!dbsd.a(btluVar, this.a.h)) {
            afyy afyyVar2 = this.a;
            btlu btluVar2 = afyyVar2.h;
            if (btlu.i(btluVar) == btlt.GOOGLE && btlu.i(btluVar2) == btlt.GOOGLE) {
                afyy.a = Long.MIN_VALUE;
            }
            if (btlu.i(btluVar2) == btlt.GOOGLE) {
                if (afyyVar2.d.f(btluVar2)) {
                    duwi d = afyyVar2.b.getLocalStreamParameters().d();
                    if (d.a) {
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(afyyVar2.c.e());
                        if (seconds >= afyy.a + d.b) {
                            afyy.a = seconds;
                            afyyVar2.e(null);
                        }
                    }
                } else if (afyyVar2.e.f()) {
                    afyyVar2.g.k(btluVar2, true);
                } else {
                    agbr agbrVar = afyyVar2.g;
                    dbsk.s(btluVar2);
                    agbrVar.g(btluVar2);
                }
            }
            afyyVar2.g.l();
        }
    }
}
