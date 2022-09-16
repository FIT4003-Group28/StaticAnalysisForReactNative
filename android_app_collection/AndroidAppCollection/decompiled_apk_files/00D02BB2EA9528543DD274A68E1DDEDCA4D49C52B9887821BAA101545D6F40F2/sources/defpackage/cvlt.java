package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cvlt  reason: default package */
/* loaded from: classes5.dex */
public final class cvlt implements cvlp {
    static final List<drwv> a = Arrays.asList(drwv.SHOWN, drwv.SHOWN_REPLACED, drwv.SHOWN_FORCED);
    @dzsi
    public final drwv b;
    public final cvjs c;
    @dzsi
    public final int j;
    @dzsi
    public final int k;
    public final cvlr p;
    private final cvmv q;
    private final cvmt r;
    private final cvor s;
    private final pbk y;
    @dzsi
    public String d = null;
    @dzsi
    public int l = 0;
    public final List<drwx> e = new ArrayList();
    @dzsi
    public int m = 0;
    @dzsi
    public int n = 0;
    @dzsi
    public cvtm f = null;
    @dzsi
    public String g = null;
    @dzsi
    private String t = null;
    @dzsi
    private drus u = null;
    @dzsi
    public cvoo h = null;
    private final List<drty> v = new ArrayList();
    @dzsi
    private cvlq x = null;
    @dzsi
    public int o = 0;
    @dzsi
    public drwt i = null;
    private Long w = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));

    public cvlt(cvlr cvlrVar, drwv drwvVar, int i, int i2, cvjs cvjsVar, cvmv cvmvVar, cvmt cvmtVar, cvor cvorVar, pbk pbkVar) {
        this.p = cvlrVar;
        this.b = drwvVar;
        this.j = i;
        this.k = i2;
        this.c = cvjsVar;
        this.q = cvmvVar;
        this.r = cvmtVar;
        this.s = cvorVar;
        this.y = pbkVar;
    }

    @Override // defpackage.cvlp
    public final void a() {
        this.y.a(new Runnable(this) { // from class: cvls
            private final cvlt a;

            {
                this.a = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:103:0x01f1  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x02e7  */
            /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1102
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cvls.run():void");
            }
        });
    }

    @Override // defpackage.cvlp
    public final void b(String str) {
        this.d = str;
    }

    @Override // defpackage.cvlp
    public final void c(@dzsi String str) {
        cvoo cvooVar;
        Iterator<cvoo> it = this.s.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                cvooVar = null;
                break;
            }
            cvooVar = it.next();
            if (cvooVar.a().equals(str)) {
                break;
            }
        }
        this.h = cvooVar;
    }

    @Override // defpackage.cvlp
    public final void d(cvkj cvkjVar) {
        List<drty> list = this.v;
        drtx bZ = drty.g.bZ();
        String a2 = cvkjVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar = (drty) bZ.b;
        a2.getClass();
        drtyVar.a |= 1;
        drtyVar.b = a2;
        long longValue = cvkjVar.b().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar2 = (drty) bZ.b;
        drtyVar2.a |= 2;
        drtyVar2.c = longValue;
        long longValue2 = cvkjVar.f().longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar3 = (drty) bZ.b;
        drtyVar3.a |= 4;
        drtyVar3.d = longValue2;
        String j = cvkjVar.j();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar4 = (drty) bZ.b;
        j.getClass();
        drtyVar4.a |= 8;
        drtyVar4.e = j;
        dsbw dsbwVar = cvkjVar.d().n;
        if (dsbwVar == null) {
            dsbwVar = dsbw.b;
        }
        String str = dsbwVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar5 = (drty) bZ.b;
        str.getClass();
        drtyVar5.a |= 16;
        drtyVar5.f = str;
        list.add(bZ.bK());
    }

    @Override // defpackage.cvlp
    public final void e(List<cvkj> list) {
        for (cvkj cvkjVar : list) {
            d(cvkjVar);
        }
    }

    @Override // defpackage.cvlp
    public final void f(cvtm cvtmVar) {
        this.f = cvtmVar;
    }

    @Override // defpackage.cvlp
    public final void g(drwt drwtVar) {
        this.i = drwtVar;
    }

    @Override // defpackage.cvlp
    public final void h(drus drusVar) {
        this.u = drusVar;
    }

    @Override // defpackage.cvlp
    public final void i(@dzsi cvkc cvkcVar) {
        if (cvkcVar != null) {
            this.g = cvkcVar.b();
            this.t = cvkcVar.c();
        }
    }

    @Override // defpackage.cvlp
    public final void j(@dzsi String str) {
        this.g = str;
    }

    @Override // defpackage.cvlp
    public final void k(@dzsi dscr dscrVar) {
        dsch dschVar;
        dsch dschVar2;
        if (dscrVar == null || TextUtils.isEmpty(dscrVar.c)) {
            return;
        }
        List<drty> list = this.v;
        drtx bZ = drty.g.bZ();
        String str = dscrVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar = (drty) bZ.b;
        str.getClass();
        int i = drtyVar.a | 1;
        drtyVar.a = i;
        drtyVar.b = str;
        long j = dscrVar.g;
        int i2 = i | 2;
        drtyVar.a = i2;
        drtyVar.c = j;
        long j2 = dscrVar.d;
        drtyVar.a = i2 | 4;
        drtyVar.d = j2;
        if (dscrVar.a == 12) {
            dschVar = (dsch) dscrVar.b;
        } else {
            dschVar = dsch.v;
        }
        String str2 = dschVar.m;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar2 = (drty) bZ.b;
        str2.getClass();
        drtyVar2.a |= 8;
        drtyVar2.e = str2;
        if (dscrVar.a == 12) {
            dschVar2 = (dsch) dscrVar.b;
        } else {
            dschVar2 = dsch.v;
        }
        dsbw dsbwVar = dschVar2.n;
        if (dsbwVar == null) {
            dsbwVar = dsbw.b;
        }
        String str3 = dsbwVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drty drtyVar3 = (drty) bZ.b;
        str3.getClass();
        drtyVar3.a |= 16;
        drtyVar3.f = str3;
        list.add(bZ.bK());
    }

    @Override // defpackage.cvlp
    public final void l(List<dscr> list) {
        for (dscr dscrVar : list) {
            k(dscrVar);
        }
    }

    @Override // defpackage.cvlp
    public final void m(String str) {
        this.t = str;
    }

    @Override // defpackage.cvlp
    public final void n(String str) {
        List<drwx> list = this.e;
        drww bZ = drwx.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drwx drwxVar = (drwx) bZ.b;
        str.getClass();
        drwxVar.a = 1;
        drwxVar.b = str;
        list.add(bZ.bK());
    }

    @Override // defpackage.cvlp
    public final void o(long j) {
        this.w = Long.valueOf(j);
    }

    @Override // defpackage.cvlp
    public final void p(@dzsi cvlq cvlqVar) {
        this.x = cvlqVar;
    }

    @Override // defpackage.cvlp
    public final void q(List<dsbc> list) {
        for (dsbc dsbcVar : list) {
            List<drty> list2 = this.v;
            drtx bZ = drty.g.bZ();
            String str = dsbcVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drty drtyVar = (drty) bZ.b;
            str.getClass();
            int i = drtyVar.a | 1;
            drtyVar.a = i;
            drtyVar.b = str;
            long j = dsbcVar.c;
            int i2 = i | 2;
            drtyVar.a = i2;
            drtyVar.c = j;
            long j2 = dsbcVar.d;
            drtyVar.a = i2 | 4;
            drtyVar.d = j2;
            list2.add(bZ.bK());
        }
    }

    @Override // defpackage.cvlp
    public final void r(int i) {
        this.l = i;
    }

    @Override // defpackage.cvlp
    public final void s(int i) {
        this.m = 2;
    }

    @Override // defpackage.cvlp
    public final void t(int i) {
        this.n = i;
    }

    @Override // defpackage.cvlp
    public final void u(int i) {
        this.o = i;
    }

    @Override // defpackage.cvlp
    public final void v(int i) {
        List<drwx> list = this.e;
        drww bZ = drwx.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drwx drwxVar = (drwx) bZ.b;
        drwxVar.b = 1;
        drwxVar.a = 2;
        list.add(bZ.bK());
    }

    public final drtz w() {
        drtw bZ = drtz.k.bZ();
        List<drty> list = this.v;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtz drtzVar = (drtz) bZ.b;
        dsrj<drty> dsrjVar = drtzVar.b;
        if (!dsrjVar.a()) {
            drtzVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, drtzVar.b);
        String a2 = this.c.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtz drtzVar2 = (drtz) bZ.b;
        a2.getClass();
        drtzVar2.a |= 1;
        drtzVar2.c = a2;
        cvmv cvmvVar = this.q;
        drwo bZ2 = drwp.f.bZ();
        cvnm cvnmVar = (cvnm) cvmvVar;
        String packageName = cvnmVar.a.getApplicationContext().getPackageName();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drwp drwpVar = (drwp) bZ2.b;
        packageName.getClass();
        drwpVar.a |= 4;
        drwpVar.d = packageName;
        drut bZ3 = druu.f.bZ();
        String packageName2 = cvnmVar.a.getApplicationContext().getPackageName();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        druu druuVar = (druu) bZ3.b;
        packageName2.getClass();
        druuVar.a |= 8;
        druuVar.d = packageName2;
        String b = cvnmVar.c.b();
        if (!TextUtils.isEmpty(b)) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            druu druuVar2 = (druu) bZ3.b;
            b.getClass();
            druuVar2.a |= 1;
            druuVar2.b = b;
        }
        long d = cvnm.d(cvnmVar.a);
        if (d != -1) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            druu druuVar3 = (druu) bZ3.b;
            druuVar3.a |= 4;
            druuVar3.c = d;
        }
        long c = cvnm.c(cvnmVar.a);
        if (c != -1) {
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            druu druuVar4 = (druu) bZ3.b;
            druuVar4.a |= 16;
            druuVar4.e = c;
        }
        drwm bZ4 = drwn.d.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drwn drwnVar = (drwn) bZ4.b;
        int i = 3;
        drwnVar.b = 3;
        drwnVar.a |= 1;
        druj bZ5 = druk.c.bZ();
        druu bK = bZ3.bK();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        druk drukVar = (druk) bZ5.b;
        bK.getClass();
        drukVar.b = bK;
        drukVar.a = 2;
        druk bK2 = bZ5.bK();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drwn drwnVar2 = (drwn) bZ4.b;
        bK2.getClass();
        drwnVar2.c = bK2;
        drwnVar2.a |= 2;
        drwn bK3 = bZ4.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drwp drwpVar2 = (drwp) bZ2.b;
        bK3.getClass();
        drwpVar2.c = bK3;
        drwpVar2.b = 1;
        if (cvnmVar.b.b() != null && !cvnmVar.b.b().isEmpty()) {
            List<String> b2 = cvnmVar.b.b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drwp drwpVar3 = (drwp) bZ2.b;
            dsrj<String> dsrjVar2 = drwpVar3.e;
            if (!dsrjVar2.a()) {
                drwpVar3.e = dsqw.cl(dsrjVar2);
            }
            dsod.bv(b2, drwpVar3.e);
        }
        drwp bK4 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtz drtzVar3 = (drtz) bZ.b;
        bK4.getClass();
        drtzVar3.f = bK4;
        drtzVar3.a |= 8;
        cvmt cvmtVar = this.r;
        drvo bZ6 = drwb.p.bZ();
        cvni cvniVar = (cvni) cvmtVar;
        float f = cvniVar.a.getResources().getDisplayMetrics().density;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drwb drwbVar = (drwb) bZ6.b;
        drwbVar.a |= 1;
        drwbVar.b = f;
        String c2 = cvniVar.c();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drwb drwbVar2 = (drwb) bZ6.b;
        c2.getClass();
        drwbVar2.a |= 8;
        drwbVar2.e = c2;
        int i2 = Build.VERSION.SDK_INT;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drwb drwbVar3 = (drwb) bZ6.b;
        drwbVar3.a |= 128;
        drwbVar3.i = i2;
        drwb drwbVar4 = (drwb) bZ6.b;
        drwbVar4.c = 3;
        int i3 = drwbVar4.a | 2;
        drwbVar4.a = i3;
        drwbVar4.a = i3 | 4;
        drwbVar4.d = "344133785";
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar5 = (drwb) bZ6.b;
            str.getClass();
            drwbVar5.a |= 16;
            drwbVar5.f = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar6 = (drwb) bZ6.b;
            str2.getClass();
            drwbVar6.a |= 32;
            drwbVar6.g = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar7 = (drwb) bZ6.b;
            str3.getClass();
            drwbVar7.a |= 64;
            drwbVar7.h = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar8 = (drwb) bZ6.b;
            str4.getClass();
            drwbVar8.a |= 256;
            drwbVar8.j = str4;
        }
        for (cvoo cvooVar : cvniVar.b.c()) {
            drtv d2 = cvooVar.d();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar9 = (drwb) bZ6.b;
            d2.getClass();
            dsrj<drtv> dsrjVar3 = drwbVar9.k;
            if (!dsrjVar3.a()) {
                drwbVar9.k = dsqw.cl(dsrjVar3);
            }
            drwbVar9.k.add(d2);
        }
        for (cvoq cvoqVar : cvniVar.b.d()) {
            drtq bZ7 = drts.d.bZ();
            String a3 = cvoqVar.a();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drts drtsVar = (drts) bZ7.b;
            a3.getClass();
            drtsVar.a |= 1;
            drtsVar.b = a3;
            int i4 = cvoqVar.b() ? 3 : 2;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            drts drtsVar2 = (drts) bZ7.b;
            drtsVar2.c = i4 - 1;
            drtsVar2.a |= 2;
            drts bK5 = bZ7.bK();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar10 = (drwb) bZ6.b;
            bK5.getClass();
            dsrj<drts> dsrjVar4 = drwbVar10.l;
            if (!dsrjVar4.a()) {
                drwbVar10.l = dsqw.cl(dsrjVar4);
            }
            drwbVar10.l.add(bK5);
        }
        int i5 = in.a(cvniVar.a).f() ? 2 : 3;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drwb drwbVar11 = (drwb) bZ6.b;
        drwbVar11.m = i5 - 1;
        drwbVar11.a |= 1024;
        String d3 = cvniVar.d();
        if (!TextUtils.isEmpty(d3)) {
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            drwb drwbVar12 = (drwb) bZ6.b;
            d3.getClass();
            drwbVar12.a |= 2048;
            drwbVar12.n = d3;
        }
        drwa a4 = ((cvmu) ((dbsu) cvniVar.c).a).a();
        dsqp dsqpVar = (dsqp) a4.cu(5);
        dsqpVar.bC(a4);
        drvt drvtVar = (drvt) dsqpVar;
        if (dxxk.a.a().d()) {
            dbsg<cvms> a5 = cvniVar.d.a();
            if (a5.a()) {
                cvms cvmsVar = cvms.FILTER_ALL;
                int ordinal = a5.b().ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 4;
                    } else if (ordinal != 3) {
                        throw new AssertionError("Invalid enum value.");
                    } else {
                        i = 5;
                    }
                }
                if (drvtVar.c) {
                    drvtVar.bF();
                    drvtVar.c = false;
                }
                drwa drwaVar = (drwa) drvtVar.b;
                drwa drwaVar2 = drwa.f;
                drwaVar.e = i - 1;
                drwaVar.a |= 8;
            }
        }
        drwa bK6 = drvtVar.bK();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drwb drwbVar13 = (drwb) bZ6.b;
        bK6.getClass();
        drwbVar13.o = bK6;
        drwbVar13.a |= 4096;
        drvm bZ8 = drwc.f.bZ();
        String b3 = cvniVar.b();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drwc drwcVar = (drwc) bZ8.b;
        b3.getClass();
        drwcVar.a |= 1;
        drwcVar.d = b3;
        String id = TimeZone.getDefault().getID();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        drwc drwcVar2 = (drwc) bZ8.b;
        id.getClass();
        drwcVar2.b = 4;
        drwcVar2.c = id;
        drwb bK7 = bZ6.bK();
        bK7.getClass();
        drwcVar2.e = bK7;
        drwcVar2.a |= 8;
        drwc bK8 = bZ8.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtz drtzVar4 = (drtz) bZ.b;
        bK8.getClass();
        drtzVar4.e = bK8;
        drtzVar4.a |= 4;
        long longValue = this.w.longValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drtz drtzVar5 = (drtz) bZ.b;
        drtzVar5.a |= 64;
        drtzVar5.h = longValue;
        if (this.u != null) {
            drul bZ9 = drum.c.bZ();
            drus drusVar = this.u;
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            drum drumVar = (drum) bZ9.b;
            drusVar.getClass();
            drumVar.b = drusVar;
            drumVar.a |= 1;
            drum bK9 = bZ9.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drtz drtzVar6 = (drtz) bZ.b;
            bK9.getClass();
            drtzVar6.g = bK9;
            drtzVar6.a |= 16;
        }
        if (!TextUtils.isEmpty(this.t)) {
            String str5 = this.t;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drtz drtzVar7 = (drtz) bZ.b;
            str5.getClass();
            drtzVar7.a |= 2;
            drtzVar7.d = str5;
        }
        cvlq cvlqVar = this.x;
        if (cvlqVar != null) {
            Long l = cvlqVar.a;
            long longValue2 = l.longValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drtz drtzVar8 = (drtz) bZ.b;
            drtzVar8.a |= 128;
            drtzVar8.i = longValue2;
            if (this.b == drwv.SHOWN || this.b == drwv.SHOWN_REPLACED || this.b == drwv.REMOVED || this.j == 4) {
                long longValue3 = this.x.b == drvb.SCHEDULED_RECEIVER ? this.w.longValue() - this.x.h.longValue() : this.w.longValue() - l.longValue();
                druz bZ10 = drvc.i.bZ();
                long millis = TimeUnit.MICROSECONDS.toMillis(longValue3);
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar = (drvc) bZ10.b;
                drvcVar.a = 1 | drvcVar.a;
                drvcVar.b = millis;
                long longValue4 = this.x.c.longValue();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar2 = (drvc) bZ10.b;
                drvcVar2.a = 2 | drvcVar2.a;
                drvcVar2.c = longValue4;
                long longValue5 = this.x.d.longValue();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar3 = (drvc) bZ10.b;
                drvcVar3.a |= 4;
                drvcVar3.d = longValue5;
                long longValue6 = this.x.e.longValue();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar4 = (drvc) bZ10.b;
                drvcVar4.a |= 8;
                drvcVar4.e = longValue6;
                long longValue7 = this.x.f.longValue();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar5 = (drvc) bZ10.b;
                drvcVar5.a |= 16;
                drvcVar5.f = longValue7;
                long longValue8 = this.x.g.longValue();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                drvc drvcVar6 = (drvc) bZ10.b;
                int i6 = drvcVar6.a | 32;
                drvcVar6.a = i6;
                drvcVar6.g = longValue8;
                drvcVar6.h = this.x.b.h;
                drvcVar6.a = i6 | 64;
                drvc bK10 = bZ10.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drtz drtzVar9 = (drtz) bZ.b;
                bK10.getClass();
                drtzVar9.j = bK10;
                drtzVar9.a |= 256;
            }
        }
        return bZ.bK();
    }
}
