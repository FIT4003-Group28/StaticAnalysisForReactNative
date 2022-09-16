package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azsl  reason: default package */
/* loaded from: classes3.dex */
final class azsl implements degu<ilo> {
    final /* synthetic */ bxmh a;
    final /* synthetic */ dnqh b;
    final /* synthetic */ azsu c;

    public azsl(azsu azsuVar, bxmh bxmhVar, dnqh dnqhVar) {
        this.c = azsuVar;
        this.a = bxmhVar;
        this.b = dnqhVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckco) this.c.a.a(ckdc.a)).a(0);
        this.c.bs(izr.EDIT);
        this.c.bn(this.a, this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi ilo iloVar) {
        final ilo iloVar2 = iloVar;
        if (!this.c.aD) {
            return;
        }
        dbsk.s(iloVar2);
        this.c.bs(izr.EDIT);
        this.c.an = false;
        dpwn dpwnVar = iloVar2.h().bf;
        if (dpwnVar == null) {
            dpwnVar = dpwn.b;
        }
        if (!dpwnVar.a) {
            this.c.bn(this.a, this.b);
            return;
        }
        if (this.c.aP != null) {
            dbsk.s(iloVar2);
            if (iloVar2.aj() != null) {
                azsu azsuVar = this.c;
                if (azsuVar.ah.a(azsuVar.aU()).e) {
                    akpm akpmVar = this.c.aP;
                    dbsk.s(akpmVar);
                    dbsk.s(iloVar2);
                    akqq aj = iloVar2.aj();
                    dbsk.s(aj);
                    alao.c(akpmVar, aj, 16.0f);
                    if (this.c.bb.N()) {
                        gfq.l(this.c);
                        return;
                    }
                    azrs g = azrs.g(this.c);
                    if (g != null) {
                        akqq aj2 = iloVar2.aj();
                        if (aj2 != null) {
                            g.a(aj2);
                        }
                        g.c(2);
                        return;
                    }
                    aneb z = anee.z();
                    azsu azsuVar2 = this.c;
                    z.r(azsuVar2.ai.a(azsuVar2.aU(), batf.POINT_PICKER_TITLE));
                    z.q(this.c.J().getString(R.string.CHOOSE_ON_MAP_HOME_WORK_SUBTITLE));
                    andx andxVar = (andx) z;
                    andxVar.b = this.c.J().getString(R.string.SAVE);
                    andxVar.c = iloVar2.aj();
                    z.g(batg.b(this.c.aU()).a(1));
                    z.c(batg.b(this.c.aU()).a(2));
                    z.e(batg.b(this.c.aU()).a(3));
                    azsu azsuVar3 = this.c;
                    dvko a = azsuVar3.ah.a(azsuVar3.aU());
                    if (a.i) {
                        z.o(true);
                        azsu azsuVar4 = this.c;
                        andxVar.d = azsuVar4.ai.a(azsuVar4.aU(), batf.DROPPED_PIN_CALLOUT);
                    }
                    if (a.g) {
                        z.f(true);
                        azsu azsuVar5 = this.c;
                        andxVar.e = azsuVar5.ai.a(azsuVar5.aU(), batf.NO_MOVE_SAVE_WARNING);
                    }
                    z.p(a.h);
                    z.s(new azta());
                    Integer aX = this.c.aX();
                    if (aX != null) {
                        z.k(aX.intValue());
                    }
                    this.c.aZ(azsd.i(this.c.aU(), z.a(), dtxo.e, null, null, true, false, this.c.c));
                    return;
                }
            }
        }
        if (this.c.aU().equals(dndr.NICKNAME)) {
            this.c.bn(this.a, this.b);
            return;
        }
        this.c.bo(this.a, this.b, true, false);
        azsu azsuVar6 = this.c;
        azsuVar6.an = true;
        final gga ggaVar = azsuVar6.aE;
        dbsk.s(ggaVar);
        final azsu azsuVar7 = this.c;
        gcz a2 = azsuVar7.d.a();
        a2.j();
        a2.i(R.string.CONFIRM_VAGUE_ALIAS_DIALOG_TITLE);
        a2.i = cjtd.a(dtxj.al);
        a2.g(new gdd(azsuVar7, ggaVar) { // from class: azsi
            private final azsu a;
            private final Context b;

            {
                this.a = azsuVar7;
                this.b = ggaVar;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.bq(this.b);
            }
        });
        final gde a3 = a2.a();
        axvh l = axvh.l(ggaVar.getString(R.string.CONFIRM_ALIAS_EDIT_BUTTON), cjtd.a(dtxj.an), new axvg(azsuVar7, iloVar2, a3) { // from class: azsj
            private final azsu a;
            private final ilo b;
            private final qy c;

            {
                this.a = azsuVar7;
                this.b = iloVar2;
                this.c = a3;
            }

            @Override // defpackage.axvg
            public final void a() {
                bxqh bxqhVar;
                azsu azsuVar8 = this.a;
                ilo iloVar3 = this.b;
                qy qyVar = this.c;
                if (azsuVar8.aD) {
                    String y = iloVar3.y();
                    if (!dbsj.d(y) && (bxqhVar = azsuVar8.be) != null) {
                        bxqhVar.I(y);
                        cqkx.p(bxqhVar);
                    }
                    qyVar.dismiss();
                }
            }
        });
        axvh l2 = axvh.l(ggaVar.getString(R.string.SKIP_BUTTON), cjtd.a(dtxj.am), new axvg(azsuVar7, a3, ggaVar) { // from class: azsk
            private final azsu a;
            private final qy b;
            private final Context c;

            {
                this.a = azsuVar7;
                this.b = a3;
                this.c = ggaVar;
            }

            @Override // defpackage.axvg
            public final void a() {
                azsu azsuVar8 = this.a;
                qy qyVar = this.b;
                Context context = this.c;
                if (azsuVar8.aD) {
                    qyVar.dismiss();
                    azsuVar8.bq(context);
                }
            }
        });
        String string = ggaVar.getString(R.string.CONFIRM_VAGUE_ALIAS_DIALOG_MESSAGE);
        cqkf e = azsuVar7.e.e(new axuz());
        e.e(new axvi(iloVar2, l, l2, string));
        View c = e.c();
        qw qwVar = ((qy) a3).a;
        qwVar.g = c;
        qwVar.h = true;
        a3.show();
    }
}
