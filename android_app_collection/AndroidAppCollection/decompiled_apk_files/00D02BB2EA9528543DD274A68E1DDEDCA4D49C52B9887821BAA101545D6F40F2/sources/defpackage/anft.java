package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.IconCompat;
import com.google.android.apps.gmm.mapsactivity.webview.AutoValue_TransparentWebViewConfig;
import com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig;
import com.google.android.apps.maps.R;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anft  reason: default package */
/* loaded from: classes2.dex */
public final class anft extends itb implements anhg {
    private static final dcqe h = dcqe.c("anft");
    private final dxio<apkr> A;
    private final dxio<buvy> B;
    private final dxio<aokw> C;
    private final dxio<apkm> D;
    private final dzsj<dbsg<Uri>> E;
    private boolean F;
    private final cjqv G = new anfl(this);
    public final gga a;
    public final gfq b;
    public final cjqy c;
    public final cqat d;
    public final dxio<aour> e;
    public final dxio<angv> f;
    public final dzsj<Boolean> g;
    private final eeu i;
    private final bwqv j;
    private final btvo k;
    private final bvrb o;
    private final cjnx p;
    private final anhk q;
    private final dxio<angw> r;
    private final dxio<angy> s;
    private final dxio<anki> t;
    private final dxio<akfa> u;
    private final dxio<angz> v;
    private final dxio<aohx> w;
    private final dxio<bzmm> x;
    private final dxio<bzqa> y;
    private final dxio<ania> z;

    public anft(cqat cqatVar, gga ggaVar, eeu eeuVar, gfq gfqVar, bwqv bwqvVar, btvo btvoVar, cjqy cjqyVar, bvrb bvrbVar, cjnx cjnxVar, anhk anhkVar, dxio<aour> dxioVar, dxio<angv> dxioVar2, dxio<angw> dxioVar3, dxio<angy> dxioVar4, dxio<anki> dxioVar5, dxio<akfa> dxioVar6, dxio<angz> dxioVar7, dxio<aohx> dxioVar8, dxio<bzmm> dxioVar9, dxio<bzqa> dxioVar10, dxio<ania> dxioVar11, dxio<apkr> dxioVar12, dxio<buvy> dxioVar13, dxio<aokw> dxioVar14, dxio<apkm> dxioVar15, dzsj<Boolean> dzsjVar, dzsj<dbsg<Uri>> dzsjVar2) {
        this.d = cqatVar;
        this.a = ggaVar;
        this.i = eeuVar;
        this.b = gfqVar;
        this.j = bwqvVar;
        this.k = btvoVar;
        this.c = cjqyVar;
        this.o = bvrbVar;
        this.q = anhkVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.r = dxioVar3;
        this.s = dxioVar4;
        this.t = dxioVar5;
        this.u = dxioVar6;
        this.v = dxioVar7;
        this.w = dxioVar8;
        this.x = dxioVar9;
        this.y = dxioVar10;
        this.p = cjnxVar;
        this.z = dxioVar11;
        this.A = dxioVar12;
        this.B = dxioVar13;
        this.C = dxioVar14;
        this.D = dxioVar15;
        this.g = dzsjVar;
        this.E = dzsjVar2;
    }

    private final void K(dixa dixaVar, gfw gfwVar, Object obj) {
        this.B.a().b(dixaVar, new anfn(this, gfwVar, obj), this.o.h());
    }

    private final void L(eapg eapgVar, dbsg<String> dbsgVar) {
        anhq j = anhy.m(eapgVar).j();
        j.j(dbsgVar);
        D(j.k());
    }

    private final void M(anhy anhyVar) {
        eapg g;
        if (!this.i.b()) {
            bvoo.h("unexpected call, activity is not started", new Object[0]);
        } else if (this.k.getMapsActivitiesParameters().h) {
            dbsk.l(this.k.getMapsActivitiesParameters().h);
            if (anhyVar.k() != 2) {
                dbsk.l(this.k.getMapsActivitiesParameters().h);
                int g2 = this.b.g(gfs.TIMELINE);
                int f = this.b.f(aovt.class);
                if (g2 < 0) {
                    g2 = f;
                }
                if (g2 >= 0) {
                    this.a.g().h(this.b.h(g2), 1);
                }
            }
            dbsg<TransparentWebViewConfig> J = J(dbsg.i(anhyVar), false);
            dbsk.l(J.a());
            this.a.D(apmg.g(J.b()));
        } else {
            int f2 = this.b.f(aovt.class);
            if (f2 < 0 || anhyVar.k() == 2) {
                aovt aovtVar = new aovt();
                Bundle bundle = new Bundle();
                dsuv.d(bundle, "params", anhyVar.r());
                aovtVar.B(bundle);
                H(aovtVar);
                return;
            }
            this.a.g().h(this.b.h(f2), 0);
            fd d = this.b.d();
            if (!(d instanceof aovt)) {
                if (d == null) {
                    return;
                }
                eapg g3 = anhyVar.g();
                if (g3 == null) {
                    bvoo.h("Start day is not expected to be null, params = %s", anhyVar);
                    return;
                } else {
                    ((anuv) d).q(aogb.f(g3));
                    return;
                }
            }
            aovt aovtVar2 = (aovt) d;
            aovtVar2.aB = anhyVar;
            aovtVar2.aC = dbsg.j(anhyVar.e());
            aovtVar2.b(aovt.w(anhyVar.a()));
            aovtVar2.ay.Z(aovt.w(anhyVar.a()).ordinal());
            cqhn cqhnVar = aovtVar2.g;
            cqkx.p(aovtVar2.ay);
            if (aovtVar2.aQ != aowo.DAY || (g = anhyVar.g()) == null) {
                return;
            }
            aovtVar2.az.k(aogb.f(g));
        }
    }

    private final void N(anhy anhyVar) {
        anhu anhuVar = anhu.NO;
        anhw anhwVar = anhw.NOTHING;
        switch (anhyVar.a().ordinal()) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                M(anhyVar);
                return;
            case 2:
                anhq j = anhyVar.j();
                j.e(anhu.NO);
                M(j.k());
                if (this.k.getMapsActivitiesParameters().h) {
                    return;
                }
                eapd e = anhyVar.e();
                eapg g = anhyVar.g();
                dbsk.s(e);
                dbsk.s(g);
                this.A.a().b(new anfr(aoha.c(aogb.f(g), TimeUnit.MILLISECONDS.toSeconds(e.a)), anhyVar.c()));
                return;
            default:
                return;
        }
    }

    public static void j(Activity activity, aoge aogeVar) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        gga L = gga.L(activity);
        Bundle bundle = new Bundle();
        rD.c(bundle, "day-details", aogeVar);
        aobw aobwVar = new aobw();
        aobwVar.B(bundle);
        L.D(aobwVar);
    }

    @Override // defpackage.anhg
    public final boolean B() {
        return this.F;
    }

    @Override // defpackage.anhg
    public final void C() {
        D(anhy.l());
    }

    @Override // defpackage.anhg
    public final void D(anhy anhyVar) {
        bvmn bvmnVar = bvmo.a;
        btlu j = this.u.a().j();
        if (!j.m()) {
            if (anhyVar.d() == anhu.FORCE || j.o()) {
                bwqv bwqvVar = this.j;
                anhq j2 = anhyVar.j();
                j2.d(anhu.NO);
                H(akef.g(bwqvVar, new anfs(j2.k())));
                return;
            } else if (!this.k.getEnableFeatureParameters().aa) {
                return;
            } else {
                this.p.n("Starting Timeline");
                anhw anhwVar = anhw.NOTHING;
                switch (anhyVar.a().ordinal()) {
                    case 0:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        I(anhyVar);
                        return;
                    case 1:
                    case 2:
                        if (anhyVar.g() != null || anhyVar.e() != null) {
                            if (anhyVar.g() != null) {
                                I(anhyVar);
                                return;
                            }
                        } else {
                            anhq j3 = anhyVar.j();
                            j3.b(aogc.j(this.d));
                            I(j3.k());
                            return;
                        }
                        break;
                }
                if (this.k.getMapsActivitiesParameters().h) {
                    I(anhyVar);
                    return;
                }
                final eapd e = anhyVar.e();
                dbsk.s(e);
                final anfo anfoVar = new anfo(this, anhyVar, anhyVar.f(), e);
                this.o.b(new Runnable(this, e, anfoVar) { // from class: anfj
                    private final anft a;
                    private final eapd b;
                    private final anfo c;

                    {
                        this.a = this;
                        this.b = e;
                        this.c = anfoVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        anft anftVar = this.a;
                        eapd eapdVar = this.b;
                        anfo anfoVar2 = this.c;
                        anftVar.a.D(new anzy());
                        aour a = anftVar.e.a();
                        long j4 = eapdVar.a;
                        eapg eapgVar = new eapg(j4, eaou.b);
                        ArrayList arrayList = new ArrayList(3);
                        int i2 = -1;
                        while (true) {
                            if (i2 > 1) {
                                break;
                            }
                            arrayList.add(aogb.f(eapgVar.p(i2)));
                            i2++;
                        }
                        int i3 = -1;
                        for (i = 1; i3 <= i; i = 1) {
                            aogb f = aogb.f(eapgVar.p(i3));
                            a.a.c(f, dbpy.a).c(new aouq(arrayList, j4, anfoVar2, f));
                            i3++;
                        }
                    }
                }, bvrj.UI_THREAD);
                return;
            }
        }
        bwqv bwqvVar2 = this.j;
        afdr i = afdt.i();
        i.c(new anfs(anhyVar));
        i.g(R.string.TIMELINE);
        i.b(R.string.TIMELINE_INCOGNITO_PROMO_BODY);
        H(afaw.aR(bwqvVar2, i.a()));
    }

    @Override // defpackage.anhg
    public final void E() {
        fd d = this.b.d();
        if (d instanceof aomr) {
            aomr aomrVar = (aomr) d;
            aomh d2 = aomrVar.a.d();
            if (d2 == null) {
                return;
            }
            d2.g();
            cqhn cqhnVar = aomrVar.am;
            cqkx.p(d2);
        }
    }

    @Override // defpackage.anhg
    public final void F(ilo iloVar) {
        dbsk.l(this.k.getMapsActivitiesParameters().h);
        String c = bkkc.c(iloVar.ai());
        anhq p = anhy.p();
        p.g(anhw.EXPERIENCES_IN_PLACE);
        ((angm) p).c = c;
        D(p.k());
    }

    @Override // defpackage.anhg
    public final void G(drqz drqzVar, dbsg<String> dbsgVar) {
        int i;
        drqb drqbVar;
        drqf drqfVar;
        drqx drqxVar;
        drqt drqtVar;
        dnvy bZ = dnwb.i.bZ();
        drpv drpvVar = drqzVar.c;
        if (drpvVar == null) {
            drpvVar = drpv.d;
        }
        int i2 = 0;
        if ((drpvVar.a & 1) != 0) {
            drpv drpvVar2 = drqzVar.c;
            if (drpvVar2 == null) {
                drpvVar2 = drpv.d;
            }
            String str = drpvVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnwb dnwbVar = (dnwb) bZ.b;
            str.getClass();
            dnwbVar.a |= 1;
            dnwbVar.b = str;
        }
        drpv drpvVar3 = drqzVar.c;
        if (drpvVar3 == null) {
            drpvVar3 = drpv.d;
        }
        if ((drpvVar3.a & 2) != 0) {
            drpv drpvVar4 = drqzVar.c;
            if (drpvVar4 == null) {
                drpvVar4 = drpv.d;
            }
            String str2 = drpvVar4.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnwb dnwbVar2 = (dnwb) bZ.b;
            str2.getClass();
            dnwbVar2.a |= 2;
            dnwbVar2.c = str2;
        }
        if (this.q.d(bZ.bK())) {
            p();
        }
        anhu anhuVar = anhu.NO;
        anhw anhwVar = anhw.NOTHING;
        drqy drqyVar = drqzVar.b;
        if (drqyVar == null) {
            drqyVar = drqy.c;
        }
        switch (drqyVar.a) {
            case 0:
                i = 8;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0) {
                drqy drqyVar2 = drqzVar.b;
                if (drqyVar2 == null) {
                    drqyVar2 = drqy.c;
                }
                if (drqyVar2.a == 1) {
                    drqbVar = (drqb) drqyVar2.b;
                } else {
                    drqbVar = drqb.d;
                }
                int i4 = drqbVar.a;
                if ((i4 & 1) != 0) {
                    L(eapg.c(drqbVar.b), dbsgVar);
                    return;
                } else if ((i4 & 2) != 0) {
                    drqa drqaVar = drqbVar.c;
                    if (drqaVar == null) {
                        drqaVar = drqa.d;
                    }
                    anhq j = anhy.n(drqaVar.b, eaou.k((int) TimeUnit.MINUTES.toMillis(drqaVar.c)).d, dbpy.a).j();
                    j.j(dbsgVar);
                    D(j.k());
                    return;
                } else {
                    C();
                    return;
                }
            } else if (i3 == 1) {
                drqy drqyVar3 = drqzVar.b;
                if (drqyVar3 == null) {
                    drqyVar3 = drqy.c;
                }
                if (drqyVar3.a == 2) {
                    drqfVar = (drqf) drqyVar3.b;
                } else {
                    drqfVar = drqf.b;
                }
                L(eapg.c(drqfVar.a), dbsgVar);
                return;
            } else if (i3 == 2) {
                drqy drqyVar4 = drqzVar.b;
                if (drqyVar4 == null) {
                    drqyVar4 = drqy.c;
                }
                if (drqyVar4.a == 3) {
                    drqxVar = (drqx) drqyVar4.b;
                } else {
                    drqxVar = drqx.b;
                }
                L(eapg.c(drqxVar.a), dbsgVar);
                return;
            } else if (i3 == 3) {
                m();
                return;
            } else if (i3 == 4) {
                drqy drqyVar5 = drqzVar.b;
                if (drqyVar5 == null) {
                    drqyVar5 = drqy.c;
                }
                if (drqyVar5.a == 5) {
                    drqtVar = (drqt) drqyVar5.b;
                } else {
                    drqtVar = drqt.c;
                }
                int i5 = drqtVar.a;
                if (i5 == 0) {
                    i2 = 6;
                } else if (i5 == 1) {
                    i2 = 1;
                } else if (i5 == 2) {
                    i2 = 2;
                } else if (i5 == 3) {
                    i2 = 3;
                } else if (i5 == 4) {
                    i2 = 4;
                } else if (i5 == 5) {
                    i2 = 5;
                }
                int i6 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i6 == 0) {
                    anhq p = anhy.p();
                    p.g(anhw.VISITED_PLACES);
                    ((angm) p).d = dbsgVar;
                    D(p.k());
                    return;
                } else if (i6 == 1) {
                    anhq p2 = anhy.p();
                    p2.g(anhw.VISITED_CITIES);
                    ((angm) p2).d = dbsgVar;
                    D(p2.k());
                    return;
                } else if (i6 == 2) {
                    anhq p3 = anhy.p();
                    p3.g(anhw.VISITED_COUNTRIES);
                    ((angm) p3).d = dbsgVar;
                    D(p3.k());
                    return;
                } else if (i6 != 3) {
                    return;
                } else {
                    if (this.k.getMapsActivitiesParameters().h) {
                        anhq p4 = anhy.p();
                        p4.g(anhw.TRIPS);
                        ((angm) p4).d = dbsgVar;
                        D(p4.k());
                        return;
                    }
                    C();
                    return;
                }
            } else {
                anhq j2 = anhy.l().j();
                j2.j(dbsgVar);
                D(j2.k());
                return;
            }
        }
        throw null;
    }

    public final void H(final ges gesVar) {
        this.o.b(new Runnable(this, gesVar) { // from class: anfk
            private final anft a;
            private final ges b;

            {
                this.a = this;
                this.b = gesVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                anft anftVar = this.a;
                ges gesVar2 = this.b;
                anftVar.a.D(gesVar2);
                if (!anftVar.g.a().booleanValue() || !(gesVar2 instanceof aovt)) {
                    return;
                }
                dbsg<TransparentWebViewConfig> J = anftVar.J(dbpy.a, true);
                if (!J.a()) {
                    return;
                }
                apmg g = apmg.g(J.b());
                gz b = gesVar2.R().b();
                b.y(g, g.G);
                b.g();
            }
        }, bvrj.UI_THREAD);
    }

    final void I(anhy anhyVar) {
        if (anhyVar.b() != anhu.NO) {
            aohx a = this.w.a();
            a.a = anhyVar;
            if (this.x.a().a(a)) {
                this.F = true;
                return;
            } else {
                N(anhyVar);
                return;
            }
        }
        N(anhyVar);
    }

    public final dbsg<TransparentWebViewConfig> J(dbsg<anhy> dbsgVar, boolean z) {
        eaou f;
        dbsg<Uri> a = this.E.a();
        if (!a.a()) {
            return dbpy.a;
        }
        Uri b = a.b();
        if (dbsgVar.a()) {
            anhy b2 = dbsgVar.b();
            drpx bZ = drqy.c.bZ();
            anhu anhuVar = anhu.NO;
            anhw anhwVar = anhw.NOTHING;
            int i = 3;
            switch (b2.a().ordinal()) {
                case 0:
                    bvoo.h("StartTimelineParams with target NOTHING is not supported ", new Object[0]);
                    break;
                case 1:
                case 2:
                    drpy bZ2 = drqb.d.bZ();
                    if (b2.e() != null) {
                        eapd e = b2.e();
                        dbsk.s(e);
                        long j = e.a;
                        drpz bZ3 = drqa.d.bZ();
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        drqa drqaVar = (drqa) bZ3.b;
                        drqaVar.a |= 1;
                        drqaVar.b = j;
                        if (b2.f() != null) {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            dbsk.s(b2.f());
                            int minutes = (int) timeUnit.toMinutes(f.b(j));
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            drqa drqaVar2 = (drqa) bZ3.b;
                            drqaVar2.a |= 2;
                            drqaVar2.c = minutes;
                        }
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        drqb drqbVar = (drqb) bZ2.b;
                        drqa bK = bZ3.bK();
                        bK.getClass();
                        drqbVar.c = bK;
                        drqbVar.a |= 2;
                    } else if (b2.g() != null) {
                        eapg eapgVar = new eapg(0L);
                        eapg g = b2.g();
                        dbsk.s(g);
                        if (!eapgVar.equals(g)) {
                            eapg g2 = b2.g();
                            dbsk.s(g2);
                            String eapgVar2 = g2.toString();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            drqb drqbVar2 = (drqb) bZ2.b;
                            eapgVar2.getClass();
                            drqbVar2.a |= 1;
                            drqbVar2.b = eapgVar2;
                        }
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar = (drqy) bZ.b;
                    drqb bK2 = bZ2.bK();
                    bK2.getClass();
                    drqyVar.b = bK2;
                    drqyVar.a = 1;
                    break;
                case 3:
                    drqi bZ4 = drqt.c.bZ();
                    drqq drqqVar = drqq.a;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    drqt drqtVar = (drqt) bZ4.b;
                    drqqVar.getClass();
                    drqtVar.b = drqqVar;
                    drqtVar.a = 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar2 = (drqy) bZ.b;
                    drqt bK3 = bZ4.bK();
                    bK3.getClass();
                    drqyVar2.b = bK3;
                    drqyVar2.a = 5;
                    break;
                case 4:
                    drqi bZ5 = drqt.c.bZ();
                    drqk drqkVar = drqk.a;
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    drqt drqtVar2 = (drqt) bZ5.b;
                    drqkVar.getClass();
                    drqtVar2.b = drqkVar;
                    drqtVar2.a = 2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar3 = (drqy) bZ.b;
                    drqt bK4 = bZ5.bK();
                    bK4.getClass();
                    drqyVar3.b = bK4;
                    drqyVar3.a = 5;
                    break;
                case 5:
                    drqi bZ6 = drqt.c.bZ();
                    drqm drqmVar = drqm.a;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    drqt drqtVar3 = (drqt) bZ6.b;
                    drqmVar.getClass();
                    drqtVar3.b = drqmVar;
                    drqtVar3.a = 3;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar4 = (drqy) bZ.b;
                    drqt bK5 = bZ6.bK();
                    bK5.getClass();
                    drqyVar4.b = bK5;
                    drqyVar4.a = 5;
                    break;
                case 6:
                    drqi bZ7 = drqt.c.bZ();
                    drqs drqsVar = drqs.a;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    drqt drqtVar4 = (drqt) bZ7.b;
                    drqsVar.getClass();
                    drqtVar4.b = drqsVar;
                    drqtVar4.a = 4;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar5 = (drqy) bZ.b;
                    drqt bK6 = bZ7.bK();
                    bK6.getClass();
                    drqyVar5.b = bK6;
                    drqyVar5.a = 5;
                    break;
                case 7:
                    drqc bZ8 = drqd.c.bZ();
                    String h2 = b2.h();
                    dbsk.s(h2);
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    drqd drqdVar = (drqd) bZ8.b;
                    h2.getClass();
                    drqdVar.a |= 1;
                    drqdVar.b = h2;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drqy drqyVar6 = (drqy) bZ.b;
                    drqd bK7 = bZ8.bK();
                    bK7.getClass();
                    drqyVar6.b = bK7;
                    drqyVar6.a = 6;
                    break;
            }
            drpt bZ9 = drqz.e.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            drqz drqzVar = (drqz) bZ9.b;
            drqy bK8 = bZ.bK();
            bK8.getClass();
            drqzVar.b = bK8;
            drqzVar.a |= 1;
            int ordinal = b2.c().ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal == 1) {
                i = 2;
            } else if (ordinal != 2) {
                throw new AssertionError();
            }
            if (i != 0) {
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                drqz drqzVar2 = (drqz) bZ9.b;
                drqzVar2.d = i - 1;
                drqzVar2.a = 4 | drqzVar2.a;
            }
            Uri.Builder appendQueryParameter = b.buildUpon().appendQueryParameter("bpb", ddae.e.h().i(bZ9.bK().bS()));
            if (b2.i().a()) {
                appendQueryParameter.appendQueryParameter("ved", b2.i().b());
            }
            b = appendQueryParameter.build();
        }
        int i2 = this.k.getMapsActivitiesParameters().k;
        aplh aplhVar = new aplh();
        aplhVar.a(true);
        aplhVar.b(true);
        String uri = b.toString();
        if (uri == null) {
            throw new NullPointerException("Null url");
        }
        aplhVar.a = uri;
        dszg dszgVar = dszg.TIMELINE;
        if (dszgVar == null) {
            throw new NullPointerException("Null feature");
        }
        aplhVar.b = dszgVar;
        aplhVar.c = dbsg.i(gfs.TIMELINE);
        aplhVar.a(false);
        aplhVar.b(false);
        aplhVar.f = Boolean.valueOf(z);
        aplhVar.g = dbsg.i(ckpa.ONE_TIMELINE_FRAGMENT_CREATE_TO_DESTROY);
        aplhVar.h = Integer.valueOf(i2);
        String str = aplhVar.a == null ? " url" : "";
        if (aplhVar.b == null) {
            str = str.concat(" feature");
        }
        if (aplhVar.d == null) {
            str = String.valueOf(str).concat(" mapInteractionEnabled");
        }
        if (aplhVar.e == null) {
            str = String.valueOf(str).concat(" showOverlays");
        }
        if (aplhVar.f == null) {
            str = String.valueOf(str).concat(" darkLaunch");
        }
        if (aplhVar.h == null) {
            str = String.valueOf(str).concat(" timeoutMs");
        }
        if (str.isEmpty()) {
            return dbsg.i(new AutoValue_TransparentWebViewConfig(aplhVar.a, aplhVar.b, aplhVar.c, aplhVar.d.booleanValue(), aplhVar.e.booleanValue(), aplhVar.f.booleanValue(), aplhVar.g, aplhVar.h.intValue()));
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    @Override // defpackage.itb
    public final void Ns() {
        List<jg> emptyList;
        Bitmap decodeStream;
        IconCompat c;
        super.Ns();
        this.c.z(this.G);
        apkm a = this.D.a();
        Activity activity = a.a;
        if (Build.VERSION.SDK_INT < 30) {
            if (Build.VERSION.SDK_INT >= 25) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((ShortcutManager) activity.getSystemService(ShortcutManager.class)).getPinnedShortcuts());
                emptyList = jg.b(activity, arrayList);
            } else {
                emptyList = Collections.emptyList();
            }
        } else {
            emptyList = jg.b(activity, ((ShortcutManager) activity.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        dccx F = dcdc.F();
        for (jg jgVar : emptyList) {
            if (jgVar.b.startsWith("timeline_shortcut_")) {
                F.g(jgVar);
            }
        }
        dcdc f = F.f();
        if (f.isEmpty()) {
            return;
        }
        dccx F2 = dcdc.F();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            F2.g(a.b(((jg) f.get(i)).b));
        }
        Activity activity2 = a.a;
        dcdc<jg> f2 = F2.f();
        if (Build.VERSION.SDK_INT <= 29) {
            ArrayList arrayList2 = new ArrayList(f2);
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                jg jgVar2 = (jg) arrayList2.get(i2);
                IconCompat iconCompat = jgVar2.h;
                if (iconCompat != null) {
                    int i3 = iconCompat.a;
                    if (i3 != 6) {
                        if (i3 == 4) {
                            i3 = 4;
                        }
                    }
                    InputStream k = iconCompat.k(activity2);
                    if (k != null && (decodeStream = BitmapFactory.decodeStream(k)) != null) {
                        if (i3 == 6) {
                            c = IconCompat.d(decodeStream);
                        } else {
                            c = IconCompat.c(decodeStream);
                        }
                        jgVar2.h = c;
                    }
                }
                f2.remove(jgVar2);
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList3 = new ArrayList();
            for (jg jgVar3 : f2) {
                arrayList3.add(jgVar3.a());
            }
            if (!((ShortcutManager) activity2.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList3)) {
                return;
            }
        }
        if (jk.a == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    jk.a = (ji) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, jk.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, activity2);
                } catch (Exception unused) {
                }
            }
            if (jk.a == null) {
                jk.a = new jh();
            }
        }
        jk.a.a();
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.s.a().a(this.t.a());
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.c.A(this.G);
        this.C.a().c();
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        this.s.a().b(this.t.a());
    }

    @Override // defpackage.anhg
    public final void e(aoha aohaVar) {
        fd d = this.b.d();
        if (d instanceof aomr) {
            ((aomr) d).g(aohaVar);
            return;
        }
        aomr aomrVar = new aomr();
        Bundle bundle = new Bundle();
        bundle.putSerializable("selected-segment", aohaVar);
        aomrVar.B(bundle);
        H(aomrVar);
    }

    @Override // defpackage.anhg
    public final void f(aoha aohaVar) {
        this.A.a().b(new anfr(aohaVar, anhu.NO));
    }

    @Override // defpackage.anhg
    public final void i(aoge aogeVar) {
        if (this.z.a().a()) {
            j(this.a, aogeVar);
        } else {
            this.y.a().a(new int[]{bzqb.WEB_AND_APP_ACTIVITY.d}, new anfp(aogeVar), "timeline");
        }
    }

    @Override // defpackage.anhg
    public final void k(dbsg<dvay> dbsgVar, aogb aogbVar, dbsg<anho> dbsgVar2, dbsg<String> dbsgVar3, dbsg<gfw> dbsgVar4) {
        this.A.a().b(new anfq(dbsgVar, aogbVar, dbsgVar2, dbsgVar3, dbsgVar4));
    }

    @Override // defpackage.anhg
    public final void l() {
        bszv.ba(this.a, new btki());
    }

    @Override // defpackage.anhg
    public final void m() {
        bszv.ba(this.a, btki.aU(2));
    }

    @Override // defpackage.anhg
    public final void n() {
        this.v.a().b();
    }

    @Override // defpackage.anhg
    public final void o() {
        this.v.a().a(aogm.b);
    }

    @Override // defpackage.anhg
    public final void p() {
        this.f.a().b();
        this.r.a().b();
    }

    @Override // defpackage.anhg
    public final void q() {
        this.f.a().i();
        this.r.a().b();
    }

    @Override // defpackage.anhg
    public final void r(dwfl dwflVar, gfw gfwVar) {
        aoit aoitVar = new aoit();
        Bundle bundle = new Bundle();
        bundle.putByteArray("photo", dwflVar.bS());
        aoitVar.B(bundle);
        gfwVar.aZ(aoitVar);
    }

    @Override // defpackage.anhg
    public final void s(dwfl dwflVar, gfw gfwVar) {
        diwy bZ = dixa.e.bZ();
        String str = dwflVar.q;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dixa dixaVar = (dixa) bZ.b;
        str.getClass();
        dixaVar.a |= 1;
        dixaVar.b = str;
        dixa dixaVar2 = (dixa) bZ.b;
        dixaVar2.d = 1;
        dixaVar2.a |= 4;
        K(bZ.bK(), gfwVar, new angg(dwflVar.q));
    }

    @Override // defpackage.anhg
    public final void t(anhd anhdVar, String str, gfw gfwVar) {
        anhu anhuVar = anhu.NO;
        anhw anhwVar = anhw.NOTHING;
        int b = anhdVar.b();
        int i = b - 1;
        if (b != 0) {
            if (i != 0) {
                return;
            }
            diwy bZ = dixa.e.bZ();
            String str2 = anhdVar.a().q;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dixa dixaVar = (dixa) bZ.b;
            str2.getClass();
            int i2 = dixaVar.a | 1;
            dixaVar.a = i2;
            dixaVar.b = str2;
            str.getClass();
            dixaVar.a = i2 | 2;
            dixaVar.c = str;
            dixa dixaVar2 = (dixa) bZ.b;
            dixaVar2.d = 2;
            dixaVar2.a |= 4;
            K(bZ.bK(), gfwVar, new anhb());
            return;
        }
        throw null;
    }
}
