package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: aaah  reason: default package */
/* loaded from: classes2.dex */
public final class aaah extends itb implements aaap {
    private final gga a;
    private final bwqv b;
    private final akpm c;
    private final aaay d;
    private final aacm e;
    private final aagv f;
    private final aaoi g;

    public aaah(gga ggaVar, bwqv bwqvVar, akpm akpmVar, aaay aaayVar, aacm aacmVar, aagv aagvVar, aaoi aaoiVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
        this.c = akpmVar;
        this.d = aaayVar;
        this.e = aacmVar;
        this.f = aagvVar;
        this.g = aaoiVar;
    }

    private final void n(dprx dprxVar, cjqm cjqmVar, aaam aaamVar) {
        dilr o = o(dprxVar);
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.cy.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            doeh bZ2 = doei.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            bK.getClass();
            dnqhVar3.m = bK;
            dnqhVar3.a |= 262144;
        }
        if (o.c) {
            o.bF();
            o.c = false;
        }
        dils dilsVar = (dils) o.b;
        dnqh bK2 = bZ.bK();
        dils dilsVar2 = dils.i;
        bK2.getClass();
        dilsVar.g = bK2;
        dilsVar.a |= 64;
        aaay aaayVar = this.d;
        aabc aabcVar = new aabc();
        Bundle bundle = new Bundle();
        aaayVar.a.c(bundle, aabc.a, new aabb(aaamVar, new aacn(o.bK()), new aaco(), dcdc.e()));
        aabcVar.B(bundle);
        if (aaamVar.c) {
            this.a.F(aabcVar, true);
        } else {
            this.a.D(aabcVar);
        }
    }

    private final dilr o(dprx dprxVar) {
        dilr bZ = dils.i.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dils dilsVar = (dils) bZ.b;
        dprxVar.getClass();
        dilsVar.b = dprxVar;
        dilsVar.a |= 1;
        akpm akpmVar = this.c;
        dhjx Y = akpmVar.Y(akpmVar.n());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dils dilsVar2 = (dils) bZ.b;
        Y.getClass();
        dilsVar2.c = Y;
        dilsVar2.a |= 2;
        djmz bZ2 = djna.b.bZ();
        djnz bZ3 = djoa.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djoa djoaVar = (djoa) bZ3.b;
        djoaVar.a |= 1;
        djoaVar.b = 23;
        bZ2.a(bZ3);
        djnz bZ4 = djoa.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djoa djoaVar2 = (djoa) bZ4.b;
        djoaVar2.a |= 1;
        djoaVar2.b = 33;
        bZ2.a(bZ4);
        djmw bZ5 = djmy.e.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djmy djmyVar = (djmy) bZ5.b;
        djmyVar.c = 2;
        djmyVar.a |= 2;
        djna bK = bZ2.bK();
        bK.getClass();
        djmyVar.d = bK;
        djmyVar.a |= 4;
        djmy bK2 = bZ5.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dils dilsVar3 = (dils) bZ.b;
        bK2.getClass();
        dilsVar3.d = bK2;
        dilsVar3.a |= 4;
        dhya bZ6 = dhyb.c.bZ();
        dhkc bZ7 = dhkd.d.bZ();
        int e = akgt.d.e(this.a);
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ7.b;
        dhkdVar.a = 2 | dhkdVar.a;
        dhkdVar.c = e;
        Point point = new Point();
        ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        int max = Math.max(point.x, point.y);
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ7.b;
        dhkdVar2.a |= 1;
        dhkdVar2.b = max;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dhyb dhybVar = (dhyb) bZ6.b;
        dhkd bK3 = bZ7.bK();
        bK3.getClass();
        dhybVar.b = bK3;
        dhybVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dils dilsVar4 = (dils) bZ.b;
        dhyb bK4 = bZ6.bK();
        bK4.getClass();
        dilsVar4.h = bK4;
        dilsVar4.a |= 128;
        dpsa bZ8 = dpsb.d.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dpsb dpsbVar = (dpsb) bZ8.b;
        dpsbVar.a |= 1;
        dpsbVar.b = true;
        dpsb dpsbVar2 = (dpsb) bZ8.b;
        dpsbVar2.a |= 4;
        dpsbVar2.c = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dils dilsVar5 = (dils) bZ.b;
        dpsb bK5 = bZ8.bK();
        bK5.getClass();
        dilsVar5.f = bK5;
        dilsVar5.a |= 16;
        return bZ;
    }

    @Override // defpackage.aaap
    public final void e(String str, dprx dprxVar, cjqm cjqmVar) {
        aaal bZ = aaam.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aaam aaamVar = (aaam) bZ.b;
        str.getClass();
        aaamVar.a |= 1;
        aaamVar.b = str;
        n(dprxVar, cjqmVar, bZ.bK());
    }

    @Override // defpackage.aaap
    public final void f(dprx dprxVar) {
        aacm aacmVar = this.e;
        final deig d = deig.d();
        aacn aacnVar = new aacn(o(dprxVar).bK());
        aacq b = aacmVar.c.b(aacnVar);
        if (b.a()) {
            deha.q(b.b(), new aacl(d), dege.a);
            return;
        }
        aacu aacuVar = aacmVar.c;
        aacs c = aacu.c(aacnVar.a());
        final aact aactVar = new aact(c);
        aacuVar.b.add(aactVar);
        deha.q(aactVar.b, new aacp(aacuVar, c, aactVar), dege.a);
        aacmVar.d.a(new aacf(aactVar, d) { // from class: aack
            private final aact a;
            private final deig b;

            {
                this.a = aactVar;
                this.b = d;
            }

            @Override // defpackage.aacf
            public final void a(aaco aacoVar) {
                aact aactVar2 = this.a;
                deig deigVar = this.b;
                if (!aacoVar.a()) {
                    return;
                }
                if (aacoVar.a()) {
                    aactVar2.b.j(aacoVar);
                } else {
                    aactVar2.b.k(new RuntimeException("Cache entry set with an unexpected incomplete response."));
                }
                deigVar.j(aacm.a);
            }
        }).a(aacnVar);
    }

    @Override // defpackage.aaap
    public final void i(aaao aaaoVar) {
        this.a.D(this.f.a(aaaoVar, null));
    }

    @Override // defpackage.aaap
    public final void j(aaao aaaoVar, diwb diwbVar) {
        this.a.D(this.f.a(aaaoVar, diwbVar));
    }

    @Override // defpackage.aaap
    public final void k(bwrs<ilo> bwrsVar) {
        gga ggaVar = this.a;
        bwqv bwqvVar = this.b;
        abbn abbnVar = new abbn();
        abbnVar.B(abbn.w(bwqvVar, bwrsVar));
        ggaVar.D(abbnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    @Override // defpackage.aaap
    public final void l(diwb diwbVar, @dzsi Bitmap bitmap) {
        gga ggaVar = this.a;
        aaoi aaoiVar = this.g;
        aaoj aaojVar = new aaoj();
        Bundle bundle = new Bundle();
        diug diugVar = (diug) diwb.U.bZ();
        String str = diwbVar.c;
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar2 = (diwb) diugVar.b;
        str.getClass();
        diwbVar2.a |= 1;
        diwbVar2.c = str;
        diuk diukVar = diwbVar.O;
        if (diukVar == null) {
            diukVar = diuk.b;
        }
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar3 = (diwb) diugVar.b;
        diukVar.getClass();
        diwbVar3.O = diukVar;
        diwbVar3.b |= 4096;
        if ((diwbVar.b & 32) != 0) {
            dijn dijnVar = diwbVar.I;
            if (dijnVar == null) {
                dijnVar = dijn.e;
            }
            if (diugVar.c) {
                diugVar.bF();
                diugVar.c = false;
            }
            diwb diwbVar4 = (diwb) diugVar.b;
            dijnVar.getClass();
            diwbVar4.I = dijnVar;
            diwbVar4.b |= 32;
        }
        ditq bZ = ditt.n.bZ();
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        String str2 = dittVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ditt dittVar2 = (ditt) bZ.b;
        str2.getClass();
        dittVar2.a |= 1;
        dittVar2.b = str2;
        ditt dittVar3 = diwbVar.e;
        if (dittVar3 == null) {
            dittVar3 = ditt.n;
        }
        String str3 = dittVar3.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ditt dittVar4 = (ditt) bZ.b;
        str3.getClass();
        dittVar4.a |= 16;
        dittVar4.f = str3;
        ditt dittVar5 = diwbVar.e;
        if (dittVar5 == null) {
            dittVar5 = ditt.n;
        }
        dspd dspdVar = dittVar5.j;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ditt dittVar6 = (ditt) bZ.b;
        dspdVar.getClass();
        dittVar6.a |= 256;
        dittVar6.j = dspdVar;
        ditt dittVar7 = diwbVar.e;
        if (dittVar7 == null) {
            dittVar7 = ditt.n;
        }
        dpuq dpuqVar = dittVar7.k;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ditt dittVar8 = (ditt) bZ.b;
        dpuqVar.getClass();
        dittVar8.k = dpuqVar;
        dittVar8.a |= 512;
        ditt bK = bZ.bK();
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar5 = (diwb) diugVar.b;
        bK.getClass();
        diwbVar5.e = bK;
        diwbVar5.a |= 4;
        bvrs.l(bundle, (diwb) diugVar.bK());
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            bundle.putString("SCREENSHOT_TOKEN_KEY", aaoiVar.a.m(byteArrayOutputStream.toByteArray()));
            bitmap.recycle();
        } else {
            bundle.putString("SCREENSHOT_TOKEN_KEY", null);
        }
        aaojVar.B(bundle);
        ggaVar.D(aaojVar);
    }

    @Override // defpackage.aaap
    public final void m(String str, dprx dprxVar, cjqm cjqmVar) {
        aaal bZ = aaam.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aaam aaamVar = (aaam) bZ.b;
        str.getClass();
        int i = aaamVar.a | 1;
        aaamVar.a = i;
        aaamVar.b = str;
        aaamVar.a = i | 2;
        aaamVar.c = true;
        n(dprxVar, cjqmVar, bZ.bK());
    }
}
