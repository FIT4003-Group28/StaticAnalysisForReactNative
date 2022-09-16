package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfnr  reason: default package */
/* loaded from: classes4.dex */
public class cfnr {
    public static final /* synthetic */ int c = 0;
    private static final dcdc<dbsi<dgox, diem>> d = dcdc.j(dbsi.a(dgox.VERY_DISSATISFIED, diem.VERY_SAD_FACE), dbsi.a(dgox.DISSATISFIED, diem.SAD_FACE), dbsi.a(dgox.NEUTRAL, diem.NEUTRAL_FACE), dbsi.a(dgox.SATISFIED, diem.HAPPY_FACE), dbsi.a(dgox.VERY_SATISFIED, diem.VERY_HAPPY_FACE));
    private static final EnumMap<dqvj, dgpc> e;
    public final cfnq a;
    public final ckcw b;
    private final Executor f;
    private final Handler g;
    private final Resources h;
    private final btvo i;
    private final buqz j;
    private final bvax k;

    static {
        EnumMap<dqvj, dgpc> enumMap = new EnumMap<>(dqvj.class);
        e = enumMap;
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.DRIVE, (dqvj) dgpc.DRIVE);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.BICYCLE, (dqvj) dgpc.BICYCLE);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.WALK, (dqvj) dgpc.WALK);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.TRANSIT, (dqvj) dgpc.TRANSIT);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.FLY, (dqvj) dgpc.FLY);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.TWO_WHEELER, (dqvj) dgpc.TWO_WHEELER);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.MIXED, (dqvj) dgpc.MIXED);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.TAXI, (dqvj) dgpc.TAXI);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.BIKESHARING, (dqvj) dgpc.BIKESHARING);
        enumMap.put((EnumMap<dqvj, dgpc>) dqvj.TAXICAB, (dqvj) dgpc.TAXICAB);
    }

    public cfnr(cfnq cfnqVar, Handler handler, ckcw ckcwVar, Resources resources, buqz buqzVar, bvax bvaxVar, btvo btvoVar, Executor executor) {
        this.a = cfnqVar;
        this.g = handler;
        this.b = ckcwVar;
        this.h = resources;
        this.j = buqzVar;
        this.k = bvaxVar;
        this.i = btvoVar;
        this.f = executor;
    }

    public static boolean f(btvo btvoVar) {
        return btvoVar.getUgcParameters().az();
    }

    public static boolean g(dqvj dqvjVar) {
        return dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TWO_WHEELER;
    }

    public static boolean h(dier dierVar) {
        cfnq cfnqVar = cfnq.ARRIVAL_CARD;
        dieq dieqVar = dierVar.b;
        if (dieqVar == null) {
            dieqVar = dieq.f;
        }
        int a = diep.a(dieqVar.b);
        int i = a - 1;
        if (a != 0) {
            return i == 0 || i == 1;
        }
        throw null;
    }

    public static final dcdc<cfgf> i(dlno dlnoVar, final dier dierVar, final dspd dspdVar) {
        return dcbg.b(dlnoVar.c).o(new dbsl(dierVar) { // from class: cfno
            private final dier a;

            {
                this.a = dierVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dier dierVar2 = this.a;
                dlnm dlnmVar = (dlnm) obj;
                int i = cfnr.c;
                dieq dieqVar = dierVar2.b;
                if (dieqVar == null) {
                    dieqVar = dieq.f;
                }
                return dieqVar.d.equals(dlnmVar.f);
            }
        }).s(new dbrn(dspdVar) { // from class: cfnp
            private final dspd a;

            {
                this.a = dspdVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dspd dspdVar2 = this.a;
                dlnm dlnmVar = (dlnm) obj;
                int i = cfnr.c;
                cfge bZ = cfgf.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf cfgfVar = (cfgf) bZ.b;
                dlnmVar.getClass();
                cfgfVar.b = dlnmVar;
                cfgfVar.a |= 1;
                cfga bZ2 = cfgd.h.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ2.b;
                dspdVar2.getClass();
                cfgdVar.a |= 1;
                cfgdVar.b = dspdVar2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf cfgfVar2 = (cfgf) bZ.b;
                cfgd bK = bZ2.bK();
                bK.getClass();
                cfgfVar2.c = bK;
                cfgfVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgf.b((cfgf) bZ.b);
                return bZ.bK();
            }
        }).z();
    }

    public static final dddi j(dier dierVar) {
        dddh bZ = dddi.f.bZ();
        dlno dlnoVar = dierVar.c;
        if (dlnoVar == null) {
            dlnoVar = dlno.f;
        }
        dspd dspdVar = dlnoVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar = (dddi) bZ.b;
        dspdVar.getClass();
        dddiVar.a |= 4;
        dddiVar.d = dspdVar;
        dieq dieqVar = dierVar.b;
        if (dieqVar == null) {
            dieqVar = dieq.f;
        }
        dspd dspdVar2 = dieqVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddi dddiVar2 = (dddi) bZ.b;
        dspdVar2.getClass();
        dddiVar2.a |= 8;
        dddiVar2.e = dspdVar2;
        return bZ.bK();
    }

    public final void a(@dzsi String str, String str2, @dzsi String str3, @dzsi dpum dpumVar, @dzsi String str4, @dzsi final Long l, final boolean z, @dzsi final dqvj dqvjVar, @dzsi final String str5, final bvqg<dier> bvqgVar) {
        if (c()) {
            ((ckhe) this.b.a(ckkp.c)).a();
            d(str, str2, str3, dpumVar, (!this.i.getUgcParameters().bb() || this.a != cfnq.ARRIVAL_CARD) ? null : str4, l, z, dqvjVar, str5, new bvqg(this, bvqgVar) { // from class: cfnm
                private final cfnr a;
                private final bvqg b;

                {
                    this.a = this;
                    this.b = bvqgVar;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    ((ckhe) this.a.b.a(ckkp.c)).c();
                    this.b.NU((dier) obj);
                }
            }, true);
            this.g.postDelayed(new Runnable(this, bvqgVar, l, z, dqvjVar, str5) { // from class: cfnn
                private final cfnr a;
                private final bvqg b;
                private final Long c;
                private final boolean d;
                private final dqvj e;
                private final String f;

                {
                    this.a = this;
                    this.b = bvqgVar;
                    this.c = l;
                    this.d = z;
                    this.e = dqvjVar;
                    this.f = str5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.b.NU(this.a.b(this.c, this.d, this.e, this.f));
                }
            }, this.i.getUgcParameters().aW());
            return;
        }
        bvqgVar.NU(b(l, z, dqvjVar, str5));
    }

    public final dier b(@dzsi Long l, boolean z, @dzsi dqvj dqvjVar, @dzsi String str) {
        dgpf bZ = dgpg.k.bZ();
        if (l != null) {
            long longValue = l.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar = (dgpg) bZ.b;
            int i = dgpgVar.a | 32768;
            dgpgVar.a = i;
            dgpgVar.g = longValue;
            dgpgVar.a = 65536 | i;
            dgpgVar.h = z;
        }
        ddxz e2 = cjra.e(str);
        if (e2 != null) {
            ddyb ddybVar = e2.b;
            if (ddybVar == null) {
                ddybVar = ddyb.e;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgpg dgpgVar2 = (dgpg) bZ.b;
            ddybVar.getClass();
            dgpgVar2.c = ddybVar;
            dgpgVar2.a |= 32;
        }
        if (dqvjVar != null) {
            EnumMap<dqvj, dgpc> enumMap = e;
            if (enumMap.get(dqvjVar) != null) {
                dgpc dgpcVar = enumMap.get(dqvjVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dgpg dgpgVar3 = (dgpg) bZ.b;
                dgpgVar3.b = dgpcVar.k;
                dgpgVar3.a |= 4;
            }
        }
        dccx F = dcdc.F();
        dcdc<dbsi<dgox, diem>> dcdcVar = d;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dbsi<dgox, diem> dbsiVar = dcdcVar.get(i2);
            diek bZ2 = dien.d.bZ();
            dspd b = dgmr.b(dbsiVar.a);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dien dienVar = (dien) bZ2.b;
            b.getClass();
            int i3 = dienVar.a | 1;
            dienVar.a = i3;
            dienVar.b = b;
            dienVar.c = dbsiVar.b.g;
            dienVar.a = i3 | 2;
            F.g(bZ2.bK());
        }
        dieb bZ3 = dier.d.bZ();
        diec bZ4 = dieq.f.bZ();
        dspd d2 = dgmr.d(69);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dieq dieqVar = (dieq) bZ4.b;
        d2.getClass();
        dieqVar.a |= 1;
        dieqVar.d = d2;
        diej bZ5 = dieo.d.bZ();
        String string = this.h.getString(R.string.NAVIGATION_SENTIMENT_SURVEY_TITLE);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dieo dieoVar = (dieo) bZ5.b;
        string.getClass();
        dieoVar.a |= 1;
        dieoVar.b = string;
        dcdc f = F.f();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dieo dieoVar2 = (dieo) bZ5.b;
        dsrj<dien> dsrjVar = dieoVar2.c;
        if (!dsrjVar.a()) {
            dieoVar2.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(f, dieoVar2.c);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dieq dieqVar2 = (dieq) bZ4.b;
        dieo bK = bZ5.bK();
        bK.getClass();
        dieqVar2.c = bK;
        dieqVar2.b = 4;
        dspd a = dgmr.a(bZ.bK());
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dieq dieqVar3 = (dieq) bZ4.b;
        a.getClass();
        dieqVar3.a |= 16;
        dieqVar3.e = a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dier dierVar = (dier) bZ3.b;
        dieq bK2 = bZ4.bK();
        bK2.getClass();
        dierVar.b = bK2;
        dierVar.a |= 1;
        dlnn bZ6 = dlno.f.bZ();
        dspd dspdVar = this.a.d;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dlno dlnoVar = (dlno) bZ6.b;
        dspdVar.getClass();
        dlnoVar.a |= 1;
        dlnoVar.b = dspdVar;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dier dierVar2 = (dier) bZ3.b;
        dlno bK3 = bZ6.bK();
        bK3.getClass();
        dierVar2.c = bK3;
        dierVar2.a |= 2;
        return bZ3.bK();
    }

    public final boolean c() {
        return this.i.getUgcParameters().aV() && this.a == cfnq.ARRIVAL_CARD;
    }

    public final void d(@dzsi String str, String str2, @dzsi String str3, @dzsi dpum dpumVar, @dzsi String str4, @dzsi Long l, boolean z, @dzsi dqvj dqvjVar, @dzsi String str5, bvqg<dier> bvqgVar, boolean z2) {
        didl bZ = diea.c.bZ();
        cfnq cfnqVar = cfnq.ARRIVAL_CARD;
        int ordinal = this.a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    throw new IllegalStateException("Cargo arrival card does not support fetching questions.");
                }
            } else if (dpumVar == null) {
                return;
            } else {
                didm bZ2 = didn.h.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                didn didnVar = (didn) bZ2.b;
                str2.getClass();
                int i = didnVar.a | 1;
                didnVar.a = i;
                didnVar.b = str2;
                dpumVar.getClass();
                didnVar.e = dpumVar;
                didnVar.a = i | 8;
                if (l != null) {
                    long longValue = l.longValue();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    didn didnVar2 = (didn) bZ2.b;
                    int i2 = didnVar2.a | 2;
                    didnVar2.a = i2;
                    didnVar2.c = longValue;
                    didnVar2.a = i2 | 4;
                    didnVar2.d = z;
                }
                if (dqvjVar != null) {
                    didn didnVar3 = (didn) bZ2.b;
                    didnVar3.f = dqvjVar.k;
                    didnVar3.a |= 16;
                }
                if (!dbsj.d(str5)) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    didn didnVar4 = (didn) bZ2.b;
                    str5.getClass();
                    didnVar4.a |= 32;
                    didnVar4.g = str5;
                }
                didn bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                diea dieaVar = (diea) bZ.b;
                bK.getClass();
                dieaVar.b = bK;
                dieaVar.a = 3;
            }
        } else if (str == null || dpumVar == null) {
            return;
        } else {
            didj bZ3 = didk.l.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            didk didkVar = (didk) bZ3.b;
            str.getClass();
            int i3 = didkVar.a | 1;
            didkVar.a = i3;
            didkVar.b = str;
            str2.getClass();
            int i4 = i3 | 2;
            didkVar.a = i4;
            didkVar.c = str2;
            dpumVar.getClass();
            didkVar.g = dpumVar;
            int i5 = i4 | 32;
            didkVar.a = i5;
            if (str3 != null) {
                str3.getClass();
                i5 |= 4;
                didkVar.a = i5;
                didkVar.d = str3;
            }
            if (str4 != null) {
                str4.getClass();
                didkVar.a = i5 | 64;
                didkVar.h = str4;
            }
            if (l != null) {
                long longValue2 = l.longValue();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                didk didkVar2 = (didk) bZ3.b;
                int i6 = didkVar2.a | 8;
                didkVar2.a = i6;
                didkVar2.e = longValue2;
                didkVar2.a = i6 | 16;
                didkVar2.f = z;
            }
            if (dqvjVar != null) {
                didk didkVar3 = (didk) bZ3.b;
                didkVar3.i = dqvjVar.k;
                didkVar3.a |= 256;
            }
            if (!dbsj.d(str5)) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                didk didkVar4 = (didk) bZ3.b;
                str5.getClass();
                didkVar4.a |= 512;
                didkVar4.j = str5;
            }
            if (z2) {
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                didk didkVar5 = (didk) bZ3.b;
                didkVar5.a |= 1024;
                didkVar5.k = true;
            }
            didk bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            diea dieaVar2 = (diea) bZ.b;
            bK2.getClass();
            dieaVar2.b = bK2;
            dieaVar2.a = 1;
        }
        this.j.b(bZ.bK(), cedl.a(bvqgVar), this.f);
    }

    public final void e(dspd dspdVar, dier dierVar) {
        dkfc bZ = dkfh.k.bZ();
        dieq dieqVar = dierVar.b;
        if (dieqVar == null) {
            dieqVar = dieq.f;
        }
        dspd dspdVar2 = dieqVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar = (dkfh) bZ.b;
        dspdVar2.getClass();
        int i = dkfhVar.a | 1;
        dkfhVar.a = i;
        dkfhVar.b = dspdVar2;
        dspdVar.getClass();
        dkfhVar.a = i | 4;
        dkfhVar.d = dspdVar;
        dlno dlnoVar = dierVar.c;
        if (dlnoVar == null) {
            dlnoVar = dlno.f;
        }
        dspd dspdVar3 = dlnoVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar2 = (dkfh) bZ.b;
        dspdVar3.getClass();
        dkfhVar2.a |= 2;
        dkfhVar2.c = dspdVar3;
        dieq dieqVar2 = dierVar.b;
        if (dieqVar2 == null) {
            dieqVar2 = dieq.f;
        }
        dspd dspdVar4 = dieqVar2.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfh dkfhVar3 = (dkfh) bZ.b;
        dspdVar4.getClass();
        dkfhVar3.a |= 64;
        dkfhVar3.j = dspdVar4;
        this.k.b(bZ.bK(), cedl.b(), this.f);
    }
}
