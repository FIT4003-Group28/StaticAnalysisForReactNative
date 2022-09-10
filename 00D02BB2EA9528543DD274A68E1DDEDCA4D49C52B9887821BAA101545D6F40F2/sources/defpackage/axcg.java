package defpackage;

import android.app.Application;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import com.google.ar.core.ImageMetadata;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: axcg  reason: default package */
/* loaded from: classes.dex */
public final class axcg {
    private static final dvif d;
    private static final dnty e;
    private static final dqgy f;
    private final Application g;
    private final cqat h;
    private final pez i;
    private final abfa j;
    private final anhk k;
    private final djyq l;
    private final bzls m;
    private final akgd n;
    private final btvo o;
    private final afec p;
    private static final dcqe c = dcqe.c("axcg");
    static final long a = TimeUnit.MINUTES.toMillis(5);
    static final long b = TimeUnit.SECONDS.toMillis(30);

    static {
        dvic bZ = dvif.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvif dvifVar = (dvif) bZ.b;
        dvifVar.a |= 2;
        dvifVar.c = 7;
        dvif dvifVar2 = (dvif) bZ.b;
        dvifVar2.a |= 4;
        dvifVar2.d = 1;
        dvif dvifVar3 = (dvif) bZ.b;
        dvifVar3.a |= 8;
        dvifVar3.e = 3;
        dvid bZ2 = dvie.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvie dvieVar = (dvie) bZ2.b;
        dvieVar.a |= 4;
        dvieVar.b = true;
        dvie dvieVar2 = (dvie) bZ2.b;
        dvieVar2.a |= 8;
        dvieVar2.c = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvif dvifVar4 = (dvif) bZ.b;
        dvie bK = bZ2.bK();
        bK.getClass();
        dvifVar4.b = bK;
        dvifVar4.a |= 1;
        d = bZ.bK();
        dntx bZ3 = dnty.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnty dntyVar = (dnty) bZ3.b;
        dntyVar.a |= 1;
        dntyVar.b = true;
        e = bZ3.bK();
        dqgx bZ4 = dqgy.e.bZ();
        dqcx bZ5 = dqcy.a.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dqcy.b((dqcy) bZ5.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqgy dqgyVar = (dqgy) bZ4.b;
        dqcy bK2 = bZ5.bK();
        bK2.getClass();
        dqgyVar.b = bK2;
        dqgyVar.a |= 1;
        f = bZ4.bK();
    }

    public axcg(Application application, cqat cqatVar, pez pezVar, abfa abfaVar, anhk anhkVar, bzls bzlsVar, akgd akgdVar, btvo btvoVar, afec afecVar) {
        this.g = application;
        this.h = cqatVar;
        this.i = pezVar;
        this.j = abfaVar;
        this.k = anhkVar;
        this.m = bzlsVar;
        this.n = akgdVar;
        this.o = btvoVar;
        this.p = afecVar;
        DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
        djyp bZ = djyq.d.bZ();
        bZ.a(doos.PNG);
        bZ.a(doos.JPG);
        dhkc bZ2 = dhkd.d.bZ();
        int i = displayMetrics.widthPixels;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ2.b;
        dhkdVar.a |= 1;
        dhkdVar.b = i;
        int i2 = displayMetrics.heightPixels;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ2.b;
        dhkdVar2.a |= 2;
        dhkdVar2.c = i2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djyq djyqVar = (djyq) bZ.b;
        dhkd bK = bZ2.bK();
        bK.getClass();
        djyqVar.c = bK;
        djyqVar.a |= 1;
        this.l = bZ.bK();
    }

    public static drbj c(Set<awvv<?>> set) {
        awvv<?>[] a2;
        String str = "";
        for (awvv<?> awvvVar : awvv.a()) {
            String valueOf = String.valueOf(str);
            String awvvVar2 = awvvVar.toString();
            boolean contains = set.contains(awvvVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(awvvVar2).length());
            sb.append(valueOf);
            sb.append(awvvVar2);
            sb.append("=");
            sb.append(contains);
            sb.append(" ");
            str = sb.toString();
        }
        drbi bZ = drbj.Z.bZ();
        for (awvv<?> awvvVar3 : set) {
            awwy.a(awvvVar3).g(bZ);
        }
        return bZ.bK();
    }

    private static dopp d(int i, int i2) {
        dopp bZ = dops.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dops dopsVar = (dops) bZ.b;
        int i3 = dopsVar.a | 1;
        dopsVar.a = i3;
        dopsVar.b = i;
        dopsVar.a = i3 | 2;
        dopsVar.c = i2;
        bZ.a(dooj.LOCAL);
        bZ.a(dooj.TIMETABLE);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dops dopsVar2 = (dops) bZ.b;
        dopsVar2.d = 1;
        dopsVar2.a |= 4;
        return bZ;
    }

    public final dviq a(awvx awvxVar, Set<awvv<?>> set) {
        dvhx b2 = b(awvxVar, set);
        drbj c2 = c(set);
        if (b2.c) {
            b2.bF();
            b2.c = false;
        }
        dviq dviqVar = (dviq) b2.b;
        dviq dviqVar2 = dviq.D;
        c2.getClass();
        dviqVar.l = c2;
        dviqVar.a |= 512;
        return b2.bK();
    }

    public final dvhx b(awvx awvxVar, Set<awvv<?>> set) {
        awwt d2 = awvxVar.d();
        dvhy bZ = dvhz.e.bZ();
        dnwj a2 = this.i.a(this.h.b() - a, b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvhz dvhzVar = (dvhz) bZ.b;
        a2.getClass();
        dvhzVar.b = a2;
        dvhzVar.a |= 1;
        if (awvxVar.b().a()) {
            dhjx b2 = awvxVar.b().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvhz dvhzVar2 = (dvhz) bZ.b;
            b2.getClass();
            dvhzVar2.c = b2;
            dvhzVar2.a |= 2;
        }
        if (!d2.s().equals(akqi.a)) {
            String o = d2.s().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvhz dvhzVar3 = (dvhz) bZ.b;
            o.getClass();
            dvhzVar3.a |= 4;
            dvhzVar3.d = o;
        }
        dopo bZ2 = doqb.h.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doqb doqbVar = (doqb) bZ2.b;
        doqbVar.a |= 4;
        doqbVar.e = true;
        int g = d2.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doqb doqbVar2 = (doqb) bZ2.b;
        doqbVar2.a |= 8;
        doqbVar2.f = g;
        dopt bZ3 = dopu.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dopu dopuVar = (dopu) bZ3.b;
        dopuVar.a |= 1;
        dopuVar.b = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doqb doqbVar3 = (doqb) bZ2.b;
        dopu bK = bZ3.bK();
        bK.getClass();
        doqbVar3.g = bK;
        doqbVar3.a |= 16;
        dopp d3 = d(d2.e(), d2.f());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doqb doqbVar4 = (doqb) bZ2.b;
        dops bK2 = d3.bK();
        bK2.getClass();
        doqbVar4.d = bK2;
        doqbVar4.a |= 2;
        if (set.contains(awvv.g)) {
            bzls bzlsVar = this.m;
            dkqz dkqzVar = bzlsVar.a.getNotificationsParameters().m;
            if (dkqzVar == null) {
                dkqzVar = dkqz.ap;
            }
            int a3 = dkqy.a(dkqzVar.al);
            if (a3 == 0) {
                a3 = 2;
            }
            String a4 = bzlsVar.a(a3);
            if (a4 == null) {
                boolean b3 = bzlsVar.b(a3);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                doqb doqbVar5 = (doqb) bZ2.b;
                doqbVar5.b = 13;
                doqbVar5.c = Boolean.valueOf(b3);
            } else {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                doqb doqbVar6 = (doqb) bZ2.b;
                a4.getClass();
                doqbVar6.b = 15;
                doqbVar6.c = a4;
            }
        }
        dvhx bZ4 = dviq.D.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar = (dviq) bZ4.b;
        dvhz bK3 = bZ.bK();
        bK3.getClass();
        dviqVar.e = bK3;
        dviqVar.a |= 2;
        dqpg dqpgVar = dmkz.a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar2 = (dviq) bZ4.b;
        dqpgVar.getClass();
        dviqVar2.t = dqpgVar;
        dviqVar2.a |= 131072;
        boolean l = d2.l();
        dwal bZ5 = dwao.R.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwao dwaoVar = (dwao) bZ5.b;
        dwaoVar.a |= 536870912;
        dwaoVar.A = true;
        dqua bZ6 = dquf.c.bZ();
        bZ6.b(dquc.SVG);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwao dwaoVar2 = (dwao) bZ5.b;
        dquf bK4 = bZ6.bK();
        bK4.getClass();
        dwaoVar2.t = bK4;
        dwaoVar2.a |= ImageMetadata.LENS_APERTURE;
        dowi bZ7 = dowr.m.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dowr dowrVar = (dowr) bZ7.b;
        dowrVar.d = 3;
        dowrVar.a |= 4;
        dper bZ8 = dpev.g.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dpev dpevVar = (dpev) bZ8.b;
        dpevVar.a |= 16;
        dpevVar.c = true;
        dpev dpevVar2 = (dpev) bZ8.b;
        dpevVar2.d = 2;
        dpevVar2.a |= 64;
        dpev dpevVar3 = (dpev) bZ8.b;
        dpevVar3.e = 2;
        dpevVar3.a |= 128;
        int i = l ? 3 : 4;
        dpev dpevVar4 = (dpev) bZ8.b;
        dpevVar4.f = i - 1;
        dpevVar4.a |= 256;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dowr dowrVar2 = (dowr) bZ7.b;
        dpev bK5 = bZ8.bK();
        bK5.getClass();
        dowrVar2.g = bK5;
        dowrVar2.a |= 128;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwao dwaoVar3 = (dwao) bZ5.b;
        dowr bK6 = bZ7.bK();
        bK6.getClass();
        dwaoVar3.g = bK6;
        dwaoVar3.a |= 4;
        dwao bK7 = bZ5.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar3 = (dviq) bZ4.b;
        bK7.getClass();
        dviqVar3.f = bK7;
        dviqVar3.a |= 4;
        doqb bK8 = bZ2.bK();
        bK8.getClass();
        dviqVar3.i = bK8;
        dviqVar3.a |= 64;
        boolean l2 = d2.l();
        boolean m = d2.m();
        dcdc<dnub> c2 = awvxVar.c();
        dntz bZ9 = dnuc.g.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dnuc dnucVar = (dnuc) bZ9.b;
        dnucVar.a |= 1;
        dnucVar.b = 3;
        dopo bZ10 = doqb.h.bZ();
        dopp d4 = d(10, 3);
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        doqb doqbVar7 = (doqb) bZ10.b;
        dops bK9 = d4.bK();
        bK9.getClass();
        doqbVar7.d = bK9;
        doqbVar7.a |= 2;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dnuc dnucVar2 = (dnuc) bZ9.b;
        doqb bK10 = bZ10.bK();
        bK10.getClass();
        dnucVar2.c = bK10;
        dnucVar2.a |= 2;
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dnuc dnucVar3 = (dnuc) bZ9.b;
        int i2 = dnucVar3.a | 16;
        dnucVar3.a = i2;
        dnucVar3.d = l2;
        dnucVar3.a = i2 | 32;
        dnucVar3.e = m;
        dnuc dnucVar4 = (dnuc) bZ9.b;
        dsrj<dnub> dsrjVar = dnucVar4.f;
        if (!dsrjVar.a()) {
            dnucVar4.f = dsqw.cl(dsrjVar);
        }
        dsod.bv(c2, dnucVar4.f);
        dnuc bK11 = bZ9.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar4 = (dviq) bZ4.b;
        bK11.getClass();
        dviqVar4.k = bK11;
        dviqVar4.a |= 256;
        dvif dvifVar = d;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar5 = (dviq) bZ4.b;
        dvifVar.getClass();
        dviqVar5.n = dvifVar;
        dviqVar5.a |= 2048;
        dnty dntyVar = e;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar6 = (dviq) bZ4.b;
        dntyVar.getClass();
        dviqVar6.o = dntyVar;
        dviqVar6.a |= 4096;
        dwfs o2 = cknx.o(false);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar7 = (dviq) bZ4.b;
        dwfv bK12 = o2.bK();
        bK12.getClass();
        dviqVar7.m = bK12;
        dviqVar7.a |= 1024;
        dvim bZ11 = dvin.e.bZ();
        int p = d2.p();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dvin dvinVar = (dvin) bZ11.b;
        int i3 = dvinVar.a | 1;
        dvinVar.a = i3;
        dvinVar.b = p;
        dvinVar.a = i3 | 2;
        dvinVar.c = true;
        boolean z = this.o.getSuggestParameters().b;
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dvin dvinVar2 = (dvin) bZ11.b;
        dvinVar2.a |= 4;
        dvinVar2.d = z;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar8 = (dviq) bZ4.b;
        dvin bK13 = bZ11.bK();
        bK13.getClass();
        dviqVar8.w = bK13;
        dviqVar8.a |= 4194304;
        dvik bZ12 = dvil.c.bZ();
        int q = d2.q();
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        dvil dvilVar = (dvil) bZ12.b;
        dvilVar.a |= 1;
        dvilVar.b = q;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar9 = (dviq) bZ4.b;
        dvil bK14 = bZ12.bK();
        bK14.getClass();
        dviqVar9.x = bK14;
        dviqVar9.a |= 16777216;
        dnwb a5 = this.k.a();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar10 = (dviq) bZ4.b;
        a5.getClass();
        dviqVar10.h = a5;
        dviqVar10.a |= 32;
        dnqg bZ13 = dnqh.p.bZ();
        int i4 = ddda.eC.b;
        if (bZ13.c) {
            bZ13.bF();
            bZ13.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ13.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i4;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar11 = (dviq) bZ4.b;
        dnqh bK15 = bZ13.bK();
        bK15.getClass();
        dviqVar11.g = bK15;
        dviqVar11.a |= 16;
        if (this.j.c()) {
            dvia bZ14 = dvib.c.bZ();
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dvib dvibVar = (dvib) bZ14.b;
            dvibVar.a |= 1;
            dvibVar.b = true;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar12 = (dviq) bZ4.b;
            dvib bK16 = bZ14.bK();
            bK16.getClass();
            dviqVar12.z = bK16;
            dviqVar12.a |= 268435456;
        }
        if (d2.a().isEmpty()) {
            bvoo.h("Must populate surface Ids in PassiveAssistRequest.", new Object[0]);
        }
        dcdc<String> a6 = d2.a();
        int size = a6.size();
        for (int i5 = 0; i5 < size; i5++) {
            String str = a6.get(i5);
            drbw bZ15 = drbx.c.bZ();
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            drbx drbxVar = (drbx) bZ15.b;
            str.getClass();
            drbxVar.a |= 1;
            drbxVar.b = str;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar13 = (dviq) bZ4.b;
            drbx bK17 = bZ15.bK();
            bK17.getClass();
            dsrj<drbx> dsrjVar2 = dviqVar13.d;
            if (!dsrjVar2.a()) {
                dviqVar13.d = dsqw.cl(dsrjVar2);
            }
            dviqVar13.d.add(bK17);
        }
        if (d2.i() != 0) {
            int i6 = d2.i();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar14 = (dviq) bZ4.b;
            dviqVar14.a |= 262144;
            dviqVar14.u = i6;
        }
        if (set.contains(awvv.d)) {
            dqgy dqgyVar = f;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar15 = (dviq) bZ4.b;
            dqgyVar.getClass();
            dviqVar15.v = dqgyVar;
            dviqVar15.a |= ImageMetadata.LENS_APERTURE;
        }
        djyq djyqVar = this.l;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar16 = (dviq) bZ4.b;
        djyqVar.getClass();
        dviqVar16.j = djyqVar;
        dviqVar16.a |= 128;
        if (set.contains(awvv.e)) {
            dvig bZ16 = dvih.d.bZ();
            akqs m2 = akyx.m(awvxVar.b().b());
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            double l3 = akqo.l(m2, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density);
            for (MajorEvent majorEvent : this.n.a()) {
                if (majorEvent.l(m2, l3)) {
                    dpwv m3 = majorEvent.m();
                    if (bZ16.c) {
                        bZ16.bF();
                        bZ16.c = false;
                    }
                    dvih dvihVar = (dvih) bZ16.b;
                    m3.getClass();
                    dsrj<dpwv> dsrjVar3 = dvihVar.b;
                    if (!dsrjVar3.a()) {
                        dvihVar.b = dsqw.cl(dsrjVar3);
                    }
                    dvihVar.b.add(m3);
                }
            }
            int i7 = akga.a;
            if (bZ16.c) {
                bZ16.bF();
                bZ16.c = false;
            }
            dvih dvihVar2 = (dvih) bZ16.b;
            dvihVar2.a |= 1;
            dvihVar2.c = i7;
            dvih bK18 = bZ16.bK();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar17 = (dviq) bZ4.b;
            bK18.getClass();
            dviqVar17.p = bK18;
            dviqVar17.a |= 8192;
        }
        dhya bZ17 = dhyb.c.bZ();
        dhkc bZ18 = dhkd.d.bZ();
        int e2 = akgt.a.e(this.g);
        if (bZ18.c) {
            bZ18.bF();
            bZ18.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ18.b;
        dhkdVar.a = 2 | dhkdVar.a;
        dhkdVar.c = e2;
        Point point = new Point();
        ((WindowManager) this.g.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        int max = Math.max(point.x, point.y);
        if (bZ18.c) {
            bZ18.bF();
            bZ18.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ18.b;
        dhkdVar2.a |= 1;
        dhkdVar2.b = max;
        if (bZ17.c) {
            bZ17.bF();
            bZ17.c = false;
        }
        dhyb dhybVar = (dhyb) bZ17.b;
        dhkd bK19 = bZ18.bK();
        bK19.getClass();
        dhybVar.b = bK19;
        dhybVar.a |= 1;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar18 = (dviq) bZ4.b;
        dhyb bK20 = bZ17.bK();
        bK20.getClass();
        dviqVar18.q = bK20;
        dviqVar18.a |= 16384;
        dpsg bZ19 = dpsh.e.bZ();
        if (bZ19.c) {
            bZ19.bF();
            bZ19.c = false;
        }
        dpsh dpshVar = (dpsh) bZ19.b;
        dpshVar.a |= 4;
        dpshVar.c = true;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar19 = (dviq) bZ4.b;
        dpsh bK21 = bZ19.bK();
        bK21.getClass();
        dviqVar19.s = bK21;
        dviqVar19.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (set.contains(awvv.o) || set.contains(awvv.n)) {
            dqeu bZ20 = dqex.e.bZ();
            if (bZ20.c) {
                bZ20.bF();
                bZ20.c = false;
            }
            dqex dqexVar = (dqex) bZ20.b;
            dqexVar.a |= 1;
            dqexVar.b = true;
            bZ20.a(dqew.PLACE);
            if (this.o.getEnableFeatureParameters().aN) {
                bZ20.a(dqew.EXPERIENCE);
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar20 = (dviq) bZ4.b;
            dqex bK22 = bZ20.bK();
            bK22.getClass();
            dviqVar20.r = bK22;
            dviqVar20.a |= 32768;
        }
        if (set.contains(awvv.s)) {
            dvio bZ21 = dvip.c.bZ();
            dwfv d5 = acem.d(3);
            if (bZ21.c) {
                bZ21.bF();
                bZ21.c = false;
            }
            dvip dvipVar = (dvip) bZ21.b;
            d5.getClass();
            dvipVar.b = d5;
            dvipVar.a |= 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar21 = (dviq) bZ4.b;
            dvip bK23 = bZ21.bK();
            bK23.getClass();
            dviqVar21.y = bK23;
            dviqVar21.a |= 33554432;
        }
        if (set.contains(awvv.A)) {
            dqcm a7 = bizf.a();
            dsqp dsqpVar = (dsqp) a7.cu(5);
            dsqpVar.bC(a7);
            dqck dqckVar = (dqck) dsqpVar;
            if (dqckVar.c) {
                dqckVar.bF();
                dqckVar.c = false;
            }
            dqcm dqcmVar = (dqcm) dqckVar.b;
            dqcm dqcmVar2 = dqcm.e;
            dqcmVar.a |= 32;
            dqcmVar.d = true;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dviq dviqVar22 = (dviq) bZ4.b;
            dqcm bK24 = dqckVar.bK();
            bK24.getClass();
            dviqVar22.A = bK24;
            dviqVar22.a |= 536870912;
        }
        dvii bZ22 = dvij.c.bZ();
        boolean a8 = this.p.a();
        if (bZ22.c) {
            bZ22.bF();
            bZ22.c = false;
        }
        dvij dvijVar = (dvij) bZ22.b;
        dvijVar.a |= 1;
        dvijVar.b = a8;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar23 = (dviq) bZ4.b;
        dvij bK25 = bZ22.bK();
        bK25.getClass();
        dviqVar23.C = bK25;
        dviqVar23.b |= 1;
        dntr bZ23 = dntw.b.bZ();
        dcdc<dntv> r = d2.r();
        if (bZ23.c) {
            bZ23.bF();
            bZ23.c = false;
        }
        dntw dntwVar = (dntw) bZ23.b;
        dsrj<dntv> dsrjVar4 = dntwVar.a;
        if (!dsrjVar4.a()) {
            dntwVar.a = dsqw.cl(dsrjVar4);
        }
        dsod.bv(r, dntwVar.a);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dviq dviqVar24 = (dviq) bZ4.b;
        dntw bK26 = bZ23.bK();
        bK26.getClass();
        dviqVar24.B = bK26;
        dviqVar24.a |= Integer.MIN_VALUE;
        return bZ4;
    }
}
