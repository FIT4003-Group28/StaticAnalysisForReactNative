package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ncm  reason: default package */
/* loaded from: classes7.dex */
public final class ncm {
    private final broq c;
    private final cqat d;
    private final ahjq e;
    private final akox f;
    private final bgdt g;
    private final befw h;
    private final bgea i;
    private final ckcw j;
    private final koc k;
    private final buxk m;
    public final HashMap<bttu, amvh> a = new HashMap<>();
    public final HashMap<amvh, ktg> b = new HashMap<>();
    private final begr l = new nck(this);

    public ncm(broq broqVar, cqat cqatVar, buxk buxkVar, ahjq ahjqVar, akox akoxVar, befw befwVar, bgdt bgdtVar, bgea bgeaVar, ckcw ckcwVar, koc kocVar) {
        dbsk.s(broqVar);
        this.c = broqVar;
        dbsk.s(cqatVar);
        this.d = cqatVar;
        dbsk.s(buxkVar);
        this.m = buxkVar;
        dbsk.s(ahjqVar);
        this.e = ahjqVar;
        dbsk.s(akoxVar);
        this.f = akoxVar;
        dbsk.s(befwVar);
        this.h = befwVar;
        dbsk.s(bgdtVar);
        this.g = bgdtVar;
        this.i = bgeaVar;
        this.j = ckcwVar;
        this.k = kocVar;
    }

    public final void a(ldm ldmVar, ksu ksuVar, boolean z) {
        dhjx bK;
        amvh amvhVar = ldmVar.h;
        if (akqi.d(amvhVar.d)) {
            ((ckco) this.j.a(ckee.ai)).a(ncl.a(1));
            amvh amvhVar2 = ldmVar.h;
            akqi akqiVar = amvhVar2.d;
            dbsk.s(akqiVar);
            if (this.b.put(amvhVar2, new ktg(ldmVar, ksuVar, this.d)) != null) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.j(akqiVar);
            ilyVar.u = ldmVar.a;
            ilo d = ilyVar.d();
            befu p = befv.p();
            p.j(bwrs.a(d));
            p.f(d.j());
            dnyf bZ = dnyh.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnyh dnyhVar = (dnyh) bZ.b;
            dnyhVar.b = 2;
            dnyhVar.a = 2 | dnyhVar.a;
            this.k.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnyh dnyhVar2 = (dnyh) bZ.b;
            dnyhVar2.a |= 16;
            dnyhVar2.c = false;
            ((befp) p).f = bZ.bK();
            this.k.a();
            bttu f = this.h.f(this.l, p.m());
            if (f != null) {
                this.a.put(f, amvhVar2);
            } else if (ksuVar == null) {
            } else {
                ksuVar.a(ldmVar);
            }
        } else if (!z || amvhVar.e == null) {
            akqq akqqVar = ldmVar.h.e;
            if (akqqVar == null || (ldmVar.a != null && !akqqVar.a().equals(ldmVar.a))) {
                ((ckco) this.j.a(ckee.ai)).a(ncl.a(4));
                String str = ldmVar.a;
                dbsk.s(str);
                ncj ncjVar = new ncj(ksuVar, ldmVar);
                ncr ncrVar = new ncr(this.c, this.f, this.e, 1, true);
                akqq o = ldmVar.o();
                dspd B = ldmVar.h.B();
                dspd C = ldmVar.h.C();
                dbsk.s(str);
                dbsk.s(C);
                brln brlnVar = ncrVar.g;
                if (brlnVar != null) {
                    dbsk.s(brlnVar);
                    kcz<dcdc<ldm>> kczVar = ncrVar.h;
                    dbsk.s(kczVar);
                    ncrVar.g = null;
                    ncrVar.h = null;
                    ncrVar.b.b(brlnVar);
                    kczVar.b();
                    if (ncrVar.g != null) {
                        throw new RuntimeException("Tried to start a search while it was being canceled.");
                    }
                }
                dbsk.s(C);
                dwim bZ2 = dwir.R.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar = (dwir) bZ2.b;
                str.getClass();
                dwirVar.a |= 1;
                dwirVar.c = str;
                if (!C.u()) {
                    try {
                        bZ2.bD(C);
                    } catch (dsrm unused) {
                        bvoo.h("Failed to merge search request template", new Object[0]);
                    }
                } else if (!B.u()) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dwir dwirVar2 = (dwir) bZ2.b;
                    B.getClass();
                    dwirVar2.a |= 8192;
                    dwirVar2.k = B;
                }
                dhjx aa = ncrVar.c.aa();
                if (o != null) {
                    dhjw bZ3 = dhjx.f.bZ();
                    dhjy bZ4 = dhjz.e.bZ();
                    double d2 = o.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dhjz dhjzVar = (dhjz) bZ4.b;
                    int i = dhjzVar.a | 2;
                    dhjzVar.a = i;
                    dhjzVar.c = d2;
                    double d3 = o.b;
                    dhjzVar.a = i | 1;
                    dhjzVar.b = d3;
                    dhjz dhjzVar2 = aa.b;
                    if (dhjzVar2 == null) {
                        dhjzVar2 = dhjz.e;
                    }
                    double d4 = dhjzVar2.d;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dhjz dhjzVar3 = (dhjz) bZ4.b;
                    dhjzVar3.a |= 4;
                    dhjzVar3.d = d4;
                    dhjz bK2 = bZ4.bK();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dhjx dhjxVar = (dhjx) bZ3.b;
                    bK2.getClass();
                    dhjxVar.b = bK2;
                    dhjxVar.a |= 1;
                    dhka bZ5 = dhkb.e.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dhkb dhkbVar = (dhkb) bZ5.b;
                    int i2 = dhkbVar.a | 1;
                    dhkbVar.a = i2;
                    dhkbVar.b = 0.0f;
                    int i3 = i2 | 2;
                    dhkbVar.a = i3;
                    dhkbVar.c = 0.0f;
                    dhkbVar.a = i3 | 4;
                    dhkbVar.d = 0.0f;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dhjx dhjxVar2 = (dhjx) bZ3.b;
                    dhkb bK3 = bZ5.bK();
                    bK3.getClass();
                    dhjxVar2.c = bK3;
                    dhjxVar2.a |= 2;
                    dhkd dhkdVar = aa.d;
                    if (dhkdVar == null) {
                        dhkdVar = dhkd.d;
                    }
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dhjx dhjxVar3 = (dhjx) bZ3.b;
                    dhkdVar.getClass();
                    dhjxVar3.d = dhkdVar;
                    int i4 = dhjxVar3.a | 4;
                    dhjxVar3.a = i4;
                    dhjxVar3.a = i4 | 8;
                    dhjxVar3.e = 30.0f;
                    bK = bZ3.bK();
                } else {
                    dhjz dhjzVar4 = aa.b;
                    if (dhjzVar4 == null) {
                        dhjzVar4 = dhjz.e;
                    }
                    if (dhjzVar4.c == dcyn.a) {
                        dhjz dhjzVar5 = aa.b;
                        if (dhjzVar5 == null) {
                            dhjzVar5 = dhjz.e;
                        }
                        if (dhjzVar5.b == dcyn.a) {
                            bvoo.j(new IllegalArgumentException());
                        }
                    }
                    dhjw ca = dhjx.f.ca(aa);
                    dhkb dhkbVar2 = aa.c;
                    if (dhkbVar2 == null) {
                        dhkbVar2 = dhkb.e;
                    }
                    dhka ca2 = dhkb.e.ca(dhkbVar2);
                    if (ca2.c) {
                        ca2.bF();
                        ca2.c = false;
                    }
                    dhkb dhkbVar3 = (dhkb) ca2.b;
                    dhkbVar3.a |= 2;
                    dhkbVar3.c = 0.0f;
                    dhkb bK4 = ca2.bK();
                    if (ca.c) {
                        ca.bF();
                        ca.c = false;
                    }
                    dhjx dhjxVar4 = (dhjx) ca.b;
                    bK4.getClass();
                    dhjxVar4.c = bK4;
                    dhjxVar4.a |= 2;
                    bK = ca.bK();
                }
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar3 = (dwir) bZ2.b;
                bK.getClass();
                dwirVar3.d = bK;
                dwirVar3.a |= 2;
                GmmLocation a = ncrVar.d.a();
                if (a != null) {
                    dtaq a2 = a.a();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dwir dwirVar4 = (dwir) bZ2.b;
                    a2.getClass();
                    dwirVar4.j = a2;
                    dwirVar4.a |= 4096;
                }
                dnyc bZ6 = dnzj.Z.bZ();
                dnnn a3 = aehr.a();
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dnzj dnzjVar = (dnzj) bZ6.b;
                a3.getClass();
                dnzjVar.d = a3;
                dnzjVar.a |= 1;
                dnzj.h(dnzjVar);
                dnyf bZ7 = dnyh.d.bZ();
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dnyh dnyhVar3 = (dnyh) bZ7.b;
                dnyhVar3.b = 4;
                dnyhVar3.a |= 2;
                dnyh.b(dnyhVar3);
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dnyh dnyhVar4 = (dnyh) bZ7.b;
                dnyhVar4.a |= 16;
                dnyhVar4.c = true;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dnzj dnzjVar2 = (dnzj) bZ6.b;
                dnyh bK5 = bZ7.bK();
                bK5.getClass();
                dnzjVar2.G = bK5;
                dnzjVar2.b |= 2097152;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dnzj dnzjVar3 = (dnzj) bZ6.b;
                dnzjVar3.a |= 64;
                dnzjVar3.i = true;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar5 = (dwir) bZ2.b;
                dnzj bK6 = bZ6.bK();
                bK6.getClass();
                dwirVar5.t = bK6;
                dwirVar5.a |= 67108864;
                int i5 = ncrVar.e;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwir dwirVar6 = (dwir) bZ2.b;
                dwirVar6.a |= 16;
                dwirVar6.g = i5;
                iqy iqyVar = new iqy();
                iqyVar.p = 1;
                brln brlnVar2 = new brln(bZ2.bK(), iqyVar);
                brlnVar2.f = ncrVar.i;
                ncrVar.g = brlnVar2;
                ncrVar.h = ncjVar;
                if (!ncrVar.f) {
                    brlnVar2.g = 2;
                }
                ncrVar.b.a(brlnVar2);
                return;
            }
            ((ckco) this.j.a(ckee.ai)).a(ncl.a(3));
            akqq akqqVar2 = ldmVar.h.e;
            dbsk.s(akqqVar2);
            dwhe bZ8 = dwhf.i.bZ();
            dhjy bZ9 = dhjz.e.bZ();
            double d5 = akqqVar2.a;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            dhjz dhjzVar6 = (dhjz) bZ9.b;
            int i6 = dhjzVar6.a | 2;
            dhjzVar6.a = i6;
            dhjzVar6.c = d5;
            double d6 = akqqVar2.b;
            dhjzVar6.a = i6 | 1;
            dhjzVar6.b = d6;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dwhf dwhfVar = (dwhf) bZ8.b;
            dhjz bK7 = bZ9.bK();
            bK7.getClass();
            dwhfVar.b = bK7;
            dwhfVar.a |= 1;
            dhjw ca3 = dhjx.f.ca(this.f.aa());
            dhjy bZ10 = dhjz.e.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            dhjz dhjzVar7 = (dhjz) bZ10.b;
            int i7 = dhjzVar7.a | 4;
            dhjzVar7.a = i7;
            dhjzVar7.d = 6000.0d;
            double d7 = akqqVar2.b;
            int i8 = i7 | 1;
            dhjzVar7.a = i8;
            dhjzVar7.b = d7;
            double d8 = akqqVar2.a;
            dhjzVar7.a = i8 | 2;
            dhjzVar7.c = d8;
            if (ca3.c) {
                ca3.bF();
                ca3.c = false;
            }
            dhjx dhjxVar5 = (dhjx) ca3.b;
            dhjz bK8 = bZ10.bK();
            bK8.getClass();
            dhjxVar5.b = bK8;
            dhjxVar5.a |= 1;
            dhka bZ11 = dhkb.e.bZ();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dhkb dhkbVar4 = (dhkb) bZ11.b;
            int i9 = 1 | dhkbVar4.a;
            dhkbVar4.a = i9;
            dhkbVar4.b = 0.0f;
            int i10 = i9 | 2;
            dhkbVar4.a = i10;
            dhkbVar4.c = 0.0f;
            dhkbVar4.a = i10 | 4;
            dhkbVar4.d = 0.0f;
            if (ca3.c) {
                ca3.bF();
                ca3.c = false;
            }
            dhjx dhjxVar6 = (dhjx) ca3.b;
            dhkb bK9 = bZ11.bK();
            bK9.getClass();
            dhjxVar6.c = bK9;
            dhjxVar6.a |= 2;
            dhjx bK10 = ca3.bK();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dwhf dwhfVar2 = (dwhf) bZ8.b;
            bK10.getClass();
            dwhfVar2.c = bK10;
            dwhfVar2.a |= 2;
            this.m.a(bZ8.bK(), new nch(ldmVar, ksuVar), bvrj.UI_THREAD);
        } else {
            ((ckco) this.j.a(ckee.ai)).a(ncl.a(2));
            amvh amvhVar3 = ldmVar.h;
            akqq akqqVar3 = amvhVar3.e;
            akqq akqqVar4 = amvhVar3.B;
            dbsk.s(akqqVar3);
            this.g.a(this.i.a(akqqVar3).bK(), new nci(new ktg(ldmVar, ksuVar, this.d), akqqVar4));
        }
    }
}
