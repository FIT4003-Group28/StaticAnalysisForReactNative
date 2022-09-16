package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cvni  reason: default package */
/* loaded from: classes5.dex */
public final class cvni implements cvmt {
    public final Context a;
    public final cvor b;
    public final dbsg<cvmu> c;
    public final cvng d;
    private final cvjs e;
    private final dbsg<pbe> f;
    private final cvmx g;

    public cvni(Context context, cvjs cvjsVar, dbsg dbsgVar, cvor cvorVar, dbsg dbsgVar2, cvmx cvmxVar, cvng cvngVar) {
        this.a = context;
        this.e = cvjsVar;
        this.f = dbsgVar;
        this.b = cvorVar;
        this.c = dbsgVar2;
        this.g = cvmxVar;
        this.d = cvngVar;
    }

    @Override // defpackage.cvmt
    public final dsau a() {
        dsdd bK;
        dsal bZ = dsat.r.bZ();
        float f = this.a.getResources().getDisplayMetrics().density;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar = (dsat) bZ.b;
        dsatVar.a |= 1;
        dsatVar.b = f;
        String c = c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar2 = (dsat) bZ.b;
        c.getClass();
        dsatVar2.a |= 8;
        dsatVar2.e = c;
        int i = Build.VERSION.SDK_INT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar3 = (dsat) bZ.b;
        dsatVar3.a |= 128;
        dsatVar3.i = i;
        String f2 = this.e.f();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar4 = (dsat) bZ.b;
        f2.getClass();
        dsatVar4.a |= 512;
        dsatVar4.k = f2;
        dsat dsatVar5 = (dsat) bZ.b;
        int i2 = 3;
        dsatVar5.c = 3;
        int i3 = dsatVar5.a | 2;
        dsatVar5.a = i3;
        dsatVar5.a = i3 | 4;
        dsatVar5.d = "344133785";
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar6 = (dsat) bZ.b;
            str.getClass();
            dsatVar6.a |= 16;
            dsatVar6.f = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar7 = (dsat) bZ.b;
            str2.getClass();
            dsatVar7.a |= 32;
            dsatVar7.g = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar8 = (dsat) bZ.b;
            str3.getClass();
            dsatVar8.a |= 64;
            dsatVar8.h = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar9 = (dsat) bZ.b;
            str4.getClass();
            dsatVar9.a |= 256;
            dsatVar9.j = str4;
        }
        for (cvoo cvooVar : this.b.c()) {
            dsam bZ2 = dsao.e.bZ();
            String a = cvooVar.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsao dsaoVar = (dsao) bZ2.b;
            a.getClass();
            dsaoVar.a |= 1;
            dsaoVar.b = a;
            int c2 = cvooVar.c();
            int i4 = c2 - 1;
            cvms cvmsVar = cvms.FILTER_ALL;
            if (c2 == 0) {
                throw null;
            }
            int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? 1 : 2 : 5 : 4 : 3;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dsao dsaoVar2 = (dsao) bZ2.b;
            dsaoVar2.d = i5 - 1;
            dsaoVar2.a |= 4;
            if (!TextUtils.isEmpty(cvooVar.b())) {
                String b = cvooVar.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dsao dsaoVar3 = (dsao) bZ2.b;
                b.getClass();
                dsaoVar3.a |= 2;
                dsaoVar3.c = b;
            }
            dsao bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar10 = (dsat) bZ.b;
            bK2.getClass();
            dsrj<dsao> dsrjVar = dsatVar10.l;
            if (!dsrjVar.a()) {
                dsatVar10.l = dsqw.cl(dsrjVar);
            }
            dsatVar10.l.add(bK2);
        }
        for (cvoq cvoqVar : this.b.d()) {
            dsap bZ3 = dsar.d.bZ();
            String a2 = cvoqVar.a();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dsar dsarVar = (dsar) bZ3.b;
            a2.getClass();
            dsarVar.a |= 1;
            dsarVar.b = a2;
            int i6 = cvoqVar.b() ? 3 : 2;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dsar dsarVar2 = (dsar) bZ3.b;
            dsarVar2.c = i6 - 1;
            dsarVar2.a |= 2;
            dsar bK3 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar11 = (dsat) bZ.b;
            bK3.getClass();
            dsrj<dsar> dsrjVar2 = dsatVar11.m;
            if (!dsrjVar2.a()) {
                dsatVar11.m = dsqw.cl(dsrjVar2);
            }
            dsatVar11.m.add(bK3);
        }
        if (in.a(this.a).f()) {
            i2 = 2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar12 = (dsat) bZ.b;
        dsatVar12.n = i2 - 1;
        dsatVar12.a |= 1024;
        String d = d();
        if (!TextUtils.isEmpty(d)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsat dsatVar13 = (dsat) bZ.b;
            d.getClass();
            dsatVar13.a |= 2048;
            dsatVar13.o = d;
        }
        Set<drtm> a3 = this.g.a.a();
        if (a3.isEmpty()) {
            bK = dsdd.b;
        } else {
            ArrayList<Integer> arrayList = new ArrayList(a3.size());
            for (drtm drtmVar : a3) {
                arrayList.add(Integer.valueOf(drtmVar.d));
            }
            dsdc bZ4 = dsdd.b.bZ();
            int i7 = 1;
            for (Integer num : arrayList) {
                i7 = Math.max((num.intValue() / 64) + 1, i7);
            }
            ArrayList arrayList2 = new ArrayList(i7);
            arrayList2.addAll(Collections.nCopies(i7, 0L));
            for (Integer num2 : arrayList) {
                int intValue = num2.intValue();
                int i8 = intValue / 64;
                arrayList2.set(i8, Long.valueOf((1 << (intValue % 64)) | ((Long) arrayList2.get(i8)).longValue()));
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dsdd dsddVar = (dsdd) bZ4.b;
            dsri dsriVar = dsddVar.a;
            if (!dsriVar.a()) {
                dsddVar.a = dsqw.ci(dsriVar);
            }
            dsod.bv(arrayList2, dsddVar.a);
            bK = bZ4.bK();
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar14 = (dsat) bZ.b;
        bK.getClass();
        dsatVar14.p = bK;
        dsatVar14.a |= 4096;
        cvmx cvmxVar = this.g;
        dsdm bZ5 = dsdp.c.bZ();
        if (dxxw.b()) {
            dsdn bZ6 = dsdo.c.bZ();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dsdo dsdoVar = (dsdo) bZ6.b;
            dsdoVar.a |= 2;
            dsdoVar.b = true;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dsdp dsdpVar = (dsdp) bZ5.b;
            dsdo bK4 = bZ6.bK();
            bK4.getClass();
            dsdpVar.b = bK4;
            dsdpVar.a |= 1;
        }
        for (dsdp dsdpVar2 : (Set) ((dxjd) cvmxVar.b).a) {
            bZ5.bC(dsdpVar2);
        }
        dsdp bK5 = bZ5.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsat dsatVar15 = (dsat) bZ.b;
        bK5.getClass();
        dsatVar15.q = bK5;
        dsatVar15.a |= 8192;
        dsaj bZ7 = dsau.g.bZ();
        String b2 = b();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dsau dsauVar = (dsau) bZ7.b;
        b2.getClass();
        dsauVar.a |= 1;
        dsauVar.b = b2;
        String id = TimeZone.getDefault().getID();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dsau dsauVar2 = (dsau) bZ7.b;
        id.getClass();
        dsauVar2.a |= 4;
        dsauVar2.d = id;
        dsat bK6 = bZ.bK();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dsau dsauVar3 = (dsau) bZ7.b;
        bK6.getClass();
        dsauVar3.e = bK6;
        dsauVar3.a |= 8;
        if (this.f.a()) {
            pbe b3 = this.f.b();
            dlgq bZ8 = dlgr.e.bZ();
            dlgp a4 = b3.a.a();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dlgr dlgrVar = (dlgr) bZ8.b;
            a4.getClass();
            dlgrVar.b = a4;
            dlgrVar.a |= 1;
            String b4 = b3.b.b();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dlgr dlgrVar2 = (dlgr) bZ8.b;
            b4.getClass();
            int i9 = dlgrVar2.a | 2;
            dlgrVar2.a = i9;
            dlgrVar2.c = b4;
            dlgrVar2.a = i9 | 4;
            dlgrVar2.d = false;
            dsoj bZ9 = dsok.c.bZ();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            ((dsok) bZ9.b).a = "type.googleapis.com/gmm.notifications.GmmClientGunsExtension";
            dspd bR = bZ8.bK().bR();
            if (bZ9.c) {
                bZ9.bF();
                bZ9.c = false;
            }
            bR.getClass();
            ((dsok) bZ9.b).b = bR;
            dsok bK7 = bZ9.bK();
            if (bK7 != null) {
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dsau dsauVar4 = (dsau) bZ7.b;
                bK7.getClass();
                dsauVar4.f = bK7;
                dsauVar4.a |= 16;
            }
            this.f.b();
            if (!TextUtils.isEmpty(null)) {
                if (bZ7.c) {
                    bZ7.bF();
                    bZ7.c = false;
                }
                dsau dsauVar5 = (dsau) bZ7.b;
                throw null;
            }
        }
        return bZ7.bK();
    }

    public final String c() {
        try {
            String str = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionName;
            return !TextUtils.isEmpty(str) ? str : "unknown";
        } catch (PackageManager.NameNotFoundException unused) {
            cvlw.e("RenderContextHelperImpl", "Failed to get app version.", new Object[0]);
            return "unknown";
        }
    }

    @dzsi
    public final String d() {
        try {
            return cpke.b(this.a.getContentResolver(), "device_country");
        } catch (SecurityException unused) {
            cvlw.e("RenderContextHelperImpl", "Exception reading GServices 'device_country' key.", new Object[0]);
            return null;
        }
    }

    public final String b() {
        if (!cvpo.a()) {
            return this.a.getResources().getConfiguration().locale.toLanguageTag();
        }
        return this.a.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }
}
