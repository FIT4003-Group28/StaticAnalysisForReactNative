package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: zny  reason: default package */
/* loaded from: classes7.dex */
public final class zny {
    private final Activity a;
    private final cqhn b;
    private final cqhu c;
    private final zok d;
    private final wto e;
    private final vop f;

    public zny(Activity activity, cqhn cqhnVar, cqhu cqhuVar, zok zokVar, vop vopVar, wto wtoVar) {
        this.a = activity;
        this.b = cqhnVar;
        this.c = cqhuVar;
        this.d = zokVar;
        this.f = vopVar;
        this.e = wtoVar;
    }

    @dzsi
    public final znz a(dqvj dqvjVar, vwn vwnVar, vou vouVar, @dzsi zol zolVar, @dzsi cqiw<zdx> cqiwVar) {
        amub w;
        vok vokVar;
        zom zomVar;
        wuv wuvVar;
        int i;
        int i2;
        zol zolVar2;
        amsy amsyVar;
        dzqz dzqzVar;
        zgk zgkVar;
        amte p;
        amub b;
        zol zolVar3 = zolVar;
        amte p2 = vwnVar.p();
        if (p2 == null || (w = vwnVar.w(this.a)) == null) {
            return null;
        }
        amsy amsyVar2 = p2.a;
        if (amsyVar2 == null) {
            bvoo.h("Directions cannot be null: %s", p2);
            return null;
        }
        vop vopVar = this.f;
        vok vokVar2 = vopVar.b.get(dqvjVar);
        if (vokVar2 == null) {
            vol volVar = vopVar.a;
            Activity activity = (Activity) ((dxjd) volVar.a).a;
            vol.a(activity, 1);
            vol.a(volVar.b.a(), 2);
            ahth a = volVar.c.a();
            vol.a(a, 3);
            vog a2 = volVar.d.a();
            vol.a(a2, 4);
            dxio a3 = ((dxjh) volVar.e).a();
            vol.a(a3, 5);
            wts a4 = volVar.f.a();
            vol.a(a4, 6);
            vol.a(dqvjVar, 7);
            vokVar = new vok(activity, a, a2, a3, a4, dqvjVar);
            vnk vnkVar = vopVar.c;
            if (vnkVar != null) {
                vokVar.e(vnkVar);
            }
            zdv zdvVar = vopVar.d;
            if (zdvVar != null && zdvVar.c() == dqvjVar) {
                vokVar.c(zdvVar.b());
            }
            vopVar.b.put(dqvjVar, vokVar);
        } else {
            vokVar = vokVar2;
        }
        amsy i3 = vokVar.i(vokVar.h);
        if (i3 != null) {
            vog vogVar = vokVar.d;
            if (!vogVar.g.containsKey(i3)) {
                voe voeVar = new voe();
                for (int i4 = 0; i4 < i3.n(); i4++) {
                    wuv a5 = vogVar.c.a(i3.m(i4), i4);
                    if (a5 != null) {
                        if (a5.r() == null) {
                            a5 = a5.C(2);
                        }
                        if (voeVar.a(a5) != null) {
                            bvoo.h("Encountered duplicate taxi product. Will overwrite in prod.", new Object[0]);
                        }
                    }
                }
                vogVar.g.put(i3, voeVar);
            }
        }
        zok zokVar = this.d;
        zom zomVar2 = new zom(zokVar.a, zokVar.d, vokVar, zokVar.g, zokVar.h, cqiwVar == null ? new vhk() : cqiwVar);
        if (zolVar3 != null) {
            zomVar2.k(zolVar3);
        }
        int i5 = w.c;
        dzqz dzqzVar2 = new dzqz();
        boolean z = false;
        int i6 = 0;
        while (i6 < amsyVar2.n()) {
            amsy i7 = vokVar.i(vokVar.h);
            if (i7 != null) {
                for (wuv wuvVar2 : vokVar.d.b(i7).c()) {
                    if (wuvVar2.s() == i6) {
                        wuvVar = wuvVar2;
                        break;
                    }
                }
            }
            wuvVar = null;
            if (wuvVar == null) {
                i = i6;
                i2 = i5;
                zgkVar = zolVar3;
                amsyVar = amsyVar2;
            } else if (!wuvVar.e() || zolVar3 != null) {
                boolean z2 = i6 == i5;
                zod zodVar = (zod) dzqzVar2.get(wuvVar.b().c());
                if (zodVar == null) {
                    zoe zoeVar = zokVar.e;
                    Activity activity2 = (Activity) ((dxjd) zoeVar.a).a;
                    zoe.a(activity2, 1);
                    zolVar2 = zolVar3;
                    zoe.a(zoeVar.b.a(), 2);
                    zoe.a(zoeVar.c.a(), 3);
                    zoc a6 = zoeVar.d.a();
                    zoe.a(a6, 4);
                    amsyVar = amsyVar2;
                    zoe.a(zoeVar.e.a(), 5);
                    zoe.a(zoeVar.f.a(), 6);
                    zoe.a(zoeVar.g.a(), 7);
                    zoe.a(vokVar, 8);
                    zoe.a(vouVar, 9);
                    zoe.a(zomVar2, 10);
                    i = i6;
                    dzqzVar = dzqzVar2;
                    i2 = i5;
                    zod zodVar2 = new zod(activity2, a6, vokVar, vouVar, zomVar2);
                    zodVar2.o(wuvVar, z2);
                    zomVar2.a.add(zodVar2);
                    zomVar2.b.add(false);
                    if (z2) {
                        int size = zomVar2.a.size() - 1;
                        if (zomVar2.d != null) {
                            size++;
                        }
                        zomVar2.Z(size);
                    }
                    dzqzVar.put(wuvVar.b().c(), zodVar2);
                    zodVar = zodVar2;
                } else {
                    i = i6;
                    i2 = i5;
                    zolVar2 = zolVar3;
                    amsyVar = amsyVar2;
                    dzqzVar = dzqzVar2;
                    zodVar.o(wuvVar, z2);
                }
                if (z2) {
                    int indexOf = zomVar2.a.indexOf(zodVar);
                    if (zomVar2.d == null) {
                        zomVar2.Z(indexOf);
                    } else {
                        zomVar2.Z(indexOf + 1);
                    }
                }
                zgkVar = zolVar2;
                z = true;
                i6 = i + 1;
                zolVar3 = zgkVar;
                dzqzVar2 = dzqzVar;
                amsyVar2 = amsyVar;
                i5 = i2;
            } else {
                amve m = amsyVar2.m(i6);
                zof zofVar = zokVar.f;
                zqx zqxVar = new zqx(zokVar.a, m);
                dbsk.a(wuvVar.e());
                gga ggaVar = zofVar.a;
                int s = wuvVar.s();
                vnk vnkVar2 = vokVar.h;
                zgk zgkVar2 = new zgk(wuvVar.s(), wuvVar.b().a(), cqgr.fT(new vhd(), new zog(ggaVar, (vnkVar2 == null || (p = vnkVar2.l().d().p()) == null || (b = p.b(s, vokVar.b)) == null) ? null : vokVar.f.a(b), zqxVar, wuvVar)), dtxn.dA, wuvVar.b().b());
                zomVar2.k(zgkVar2);
                zgkVar = zgkVar2;
                i = i6;
                i2 = i5;
                amsyVar = amsyVar2;
                z = true;
            }
            dzqzVar = dzqzVar2;
            i6 = i + 1;
            zolVar3 = zgkVar;
            dzqzVar2 = dzqzVar;
            amsyVar2 = amsyVar;
            i5 = i2;
        }
        if (!z) {
            zomVar = null;
        } else {
            zod l = zomVar2.l();
            if (l != null) {
                l.i().m();
            }
            zomVar2.Y(new zoj(zokVar, zomVar2, vokVar));
            zomVar = zomVar2;
        }
        if (zomVar == null) {
            return null;
        }
        amvh j = w.j();
        vokVar.l = w.l.m(0).S();
        akqq akqqVar = j.e;
        if (akqqVar != null || !j.k()) {
            dehn<GmmLocation> dehnVar = vokVar.j;
            if (dehnVar != null) {
                dehnVar.cancel(true);
                vokVar.j = null;
            }
            if (akqqVar == null) {
                bvoo.h("Received unresolvable waypoint without location", new Object[0]);
            } else {
                vokVar.f(akqqVar);
            }
        } else if (vokVar.j == null) {
            dehn<GmmLocation> a7 = vokVar.c.a();
            vokVar.j = a7;
            deha.q(a7, new voj(vokVar), dege.a);
        }
        vokVar.a();
        znz znzVar = new znz(this.a, zomVar, vokVar, dqvjVar, vwnVar);
        this.e.e(znzVar);
        return znzVar;
    }
}
