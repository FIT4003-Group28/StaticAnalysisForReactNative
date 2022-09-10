package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdpe  reason: default package */
/* loaded from: classes3.dex */
public class bdpe implements bdoq, bdoe {
    public static final dcqe a = dcqe.c("bdpe");
    public final bcan b;
    public final Activity c;
    public final btvo d;
    public final Executor e;
    public final cjqy f;
    public final bbtk g;
    public final bdoc h;
    public final bdmk i;
    private final dxio<afha> j;
    private final axru k;
    private final bdmq l;
    private final jmp m;
    private final bdmb n;
    @dzsi
    private final bdmb o;
    private boolean p;

    public bdpe(ges gesVar, jmo jmoVar, bcpd bcpdVar, bwrs<bcan> bwrsVar, bdmb bdmbVar, @dzsi bdmb bdmbVar2, bdol bdolVar, boolean z, Activity activity, btvo btvoVar, dxio<afha> dxioVar, Executor executor, axru axruVar, cjqy cjqyVar, bbtk bbtkVar, bdod bdodVar, jmq jmqVar, bdml bdmlVar, bdmr bdmrVar, bdpg bdpgVar, bdpi bdpiVar) {
        dcdc e;
        bcan c = bwrsVar.c();
        dbsk.s(c);
        this.b = c;
        this.m = jmq.a(jmoVar);
        this.n = bdmbVar;
        this.o = bdmbVar2;
        this.c = activity;
        this.d = btvoVar;
        this.j = dxioVar;
        this.e = executor;
        this.k = axruVar;
        this.f = cjqyVar;
        this.g = bbtkVar;
        if (z) {
            bdpg.a(gesVar, 1);
            bdpg.a(bwrsVar, 2);
            bcoz a2 = bdpgVar.a.a();
            bdpg.a(a2, 3);
            bdow bdowVar = new bdow(gesVar, bwrsVar, a2);
            bdpi.a(gesVar, 1);
            bdpi.a(bwrsVar, 2);
            bwqv a3 = bdpiVar.a.a();
            bdpi.a(a3, 3);
            e = dcdc.g(bdowVar, new bdpb(gesVar, bwrsVar, a3));
        } else {
            e = dcdc.e();
        }
        bdod.a(bcpdVar, 1);
        bdod.a(bwrsVar, 2);
        bdod.a(bdolVar, 3);
        bdod.a(e, 4);
        bdph a4 = bdodVar.a.a();
        bdod.a(a4, 5);
        dxio a5 = ((dxjh) bdodVar.b).a();
        bdod.a(a5, 6);
        bdod.a(bdodVar.c.a(), 7);
        bdkl a6 = bdodVar.d.a();
        bdod.a(a6, 8);
        bdrt a7 = bdodVar.e.a();
        bdod.a(a7, 9);
        this.h = new bdoc(bcpdVar, bwrsVar, bdolVar, e, a4, a5, a6, a7);
        gga a8 = bdmlVar.a.a();
        bdml.a(a8, 1);
        Executor a9 = bdmlVar.b.a();
        bdml.a(a9, 2);
        this.i = new bdmk(a8, a9);
        bdmr.a(bwrsVar, 1);
        Executor a10 = bdmrVar.a.a();
        bdmr.a(a10, 2);
        bdrt a11 = bdmrVar.b.a();
        bdmr.a(a11, 3);
        this.l = new bdmq(bwrsVar, a10, a11);
    }

    public static dcdc<bbtj> g(Iterable<bbtj> iterable, Iterable<bbtj> iterable2) {
        dccx F = dcdc.F();
        HashSet c = dcnm.c();
        for (bbtj bbtjVar : dcbg.b(iterable).m(iterable2)) {
            bcam c2 = bcam.c(bbtjVar);
            if (!c.contains(c2)) {
                F.g(bbtjVar);
                c.add(c2);
            }
        }
        return F.f();
    }

    @Override // defpackage.bdoe
    public void a(List<bbtj> list) {
        final bdmq bdmqVar = this.l;
        dcbg b = dcbg.b(this.b.l());
        final bbtk bbtkVar = this.g;
        bbtkVar.getClass();
        final dcdc<bbtj> g = g(list, b.s(new dbrn(bbtkVar) { // from class: bdos
            private final bbtk a;

            {
                this.a = bbtkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.b((bbtm) obj);
            }
        }));
        final bdms bdmsVar = new bdms(this) { // from class: bdot
            private final bdpe a;

            {
                this.a = this;
            }

            @Override // defpackage.bdms
            public final void a(dcha dchaVar) {
                bdpe bdpeVar = this.a;
                List c = dchaVar.c(bdmp.NEARBY_PHOTOS);
                bdmk bdmkVar = bdpeVar.i;
                bdmkVar.b.execute(new Runnable(bdmkVar, dchaVar.c(bdmp.NON_NEARBY_PHOTOS), new bdou(bdpeVar, c)) { // from class: bdmi
                    private final bdmk a;
                    private final List b;
                    private final bdms c;

                    {
                        this.a = bdmkVar;
                        this.b = r2;
                        this.c = r3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Calendar calendar;
                        bdmk bdmkVar2 = this.a;
                        List list2 = this.b;
                        bdms bdmsVar2 = this.c;
                        dcdd dcddVar = new dcdd();
                        dcdc w = dcdc.w(bdmkVar2.a, list2);
                        HashMap hashMap = new HashMap();
                        int size = w.size();
                        for (int i = 0; i < size; i++) {
                            bbtj bbtjVar = (bbtj) w.get(i);
                            Long a2 = bdmk.a(bbtjVar);
                            if (a2 == null) {
                                calendar = null;
                            } else {
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(a2.longValue());
                                calendar2.set(11, 0);
                                calendar2.set(12, 0);
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                                calendar = calendar2;
                            }
                            String str = (String) hashMap.get(calendar);
                            if (str == null) {
                                str = bdmkVar2.b(calendar);
                                if (calendar != null) {
                                    hashMap.put(calendar, str);
                                }
                            }
                            dcddVar.b(str, bbtjVar);
                        }
                        final dcde a3 = dcddVar.a();
                        bdou bdouVar = (bdou) bdmsVar2;
                        final bdpe bdpeVar2 = bdouVar.a;
                        final List list3 = bdouVar.b;
                        bdpeVar2.e.execute(new Runnable(bdpeVar2, list3, a3) { // from class: bdov
                            private final bdpe a;
                            private final List b;
                            private final dcha c;

                            {
                                this.a = bdpeVar2;
                                this.b = list3;
                                this.c = a3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                bbud f;
                                int i2;
                                int i3;
                                ArrayList arrayList;
                                bdpe bdpeVar3 = this.a;
                                List<bbtj> list4 = this.b;
                                dcha dchaVar2 = this.c;
                                bvrj.UI_THREAD.c();
                                ArrayList<bdpc> arrayList2 = new ArrayList();
                                dcka<String, bbtm> o = bdpeVar3.b.o();
                                int i4 = 0;
                                int i5 = 1;
                                if (!o.D()) {
                                    for (String str2 : o.J()) {
                                        Activity activity = bdpeVar3.c;
                                        Object[] objArr = new Object[1];
                                        objArr[0] = str2.isEmpty() ? bdpeVar3.c.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_PICK_PHOTOS) : str2;
                                        bdpc bdpcVar = new bdpc(activity.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_SHARED_FROM, objArr), ddcu.Jz);
                                        for (bbtm bbtmVar : ((dbys) o).f(str2)) {
                                            bdpcVar.a(bdpeVar3.f(bdpeVar3.g.b(bbtmVar)));
                                        }
                                        arrayList2.add(bdpcVar);
                                    }
                                }
                                List<bbtm> n = bdpeVar3.b.n();
                                if (!n.isEmpty()) {
                                    Activity activity2 = bdpeVar3.c;
                                    bdpc bdpcVar2 = new bdpc(activity2.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_SHARED_FROM, new Object[]{activity2.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_PICK_PHOTOS)}), ddcu.h);
                                    for (bbtm bbtmVar2 : n) {
                                        bdpcVar2.a(bdpeVar3.f(bdpeVar3.g.b(bbtmVar2)));
                                    }
                                    arrayList2.add(bdpcVar2);
                                }
                                if (!bdpeVar3.d.getPhotoUploadParameters().i) {
                                    if (!list4.isEmpty() && (f = bdpeVar3.b.f()) != null && f.b()) {
                                        bdpc bdpcVar3 = new bdpc(bdpeVar3.c.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_TAKEN_AROUND_A_PLACE, new Object[]{((bbsp) f).a.b().n()}), ddcu.ax);
                                        for (bbtj bbtjVar2 : list4) {
                                            bdpcVar3.a(bdpeVar3.f(bbtjVar2));
                                        }
                                        arrayList2.add(bdpcVar3);
                                    }
                                } else {
                                    dcbg b2 = dcbg.b(bdpeVar3.b.k());
                                    bbtk bbtkVar2 = bdpeVar3.g;
                                    bbtkVar2.getClass();
                                    dcdc<bbtj> g2 = bdpe.g(b2.s(new dbrn(bbtkVar2) { // from class: bdor
                                        private final bbtk a;

                                        {
                                            this.a = bbtkVar2;
                                        }

                                        @Override // defpackage.dbrn
                                        public final Object a(Object obj) {
                                            return this.a.b((bbtm) obj);
                                        }
                                    }), list4);
                                    if (!g2.isEmpty()) {
                                        bdpc bdpcVar4 = new bdpc(bdpeVar3.c.getString(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_SUGGESTED_MEDIA), ddcu.JB);
                                        for (bbtj bbtjVar3 : g2) {
                                            bdpcVar4.a(bdpeVar3.f(bbtjVar3));
                                        }
                                        arrayList2.add(bdpcVar4);
                                    }
                                }
                                for (K k : dchaVar2.J()) {
                                    bdpc bdpcVar5 = new bdpc(k, ddcu.j);
                                    for (bbtj bbtjVar4 : dchaVar2.c(k)) {
                                        bdpcVar5.a(bdpeVar3.f(bbtjVar4));
                                    }
                                    arrayList2.add(bdpcVar5);
                                }
                                cjqy cjqyVar = bdpeVar3.f;
                                cjst d = cjsu.d();
                                d.d(ddda.eN);
                                ArrayList arrayList3 = new ArrayList();
                                for (bdpc bdpcVar6 : arrayList2) {
                                    if (bdpcVar6.b == null) {
                                        bvoo.h("DataElementType is null in logSections when section.headerName = %s", dbsj.e(bdpcVar6.a));
                                    } else {
                                        cjry e = cjrz.e();
                                        e.b(bdpcVar6.b);
                                        cjrz a4 = e.a();
                                        for (bbtj bbtjVar5 : bdpcVar6.c.keySet()) {
                                            d.f(a4);
                                        }
                                        arrayList3.add(bdpcVar6);
                                    }
                                }
                                if (!d.b().isEmpty()) {
                                    cjsu e2 = d.e();
                                    cjqyVar.l(e2);
                                    int size2 = arrayList3.size();
                                    int i6 = 0;
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        bdpc bdpcVar7 = (bdpc) arrayList3.get(i7);
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (bbtj bbtjVar6 : bdpcVar7.c.keySet()) {
                                            linkedHashMap.put(bbtjVar6, e2.f(i6));
                                            i6++;
                                        }
                                        bdpcVar7.c.putAll(linkedHashMap);
                                    }
                                }
                                bdoz bdozVar = new bdoz();
                                int size3 = arrayList2.size();
                                while (i4 < size3) {
                                    bdpc bdpcVar8 = (bdpc) arrayList2.get(i4);
                                    bdoc bdocVar = bdpeVar3.h;
                                    String str3 = bdpcVar8.a;
                                    bdpd bdpdVar = bdocVar.e.get(str3);
                                    if (bdpdVar == null) {
                                        bdpdVar = new bdpd(str3);
                                        bdocVar.e.put(str3, bdpdVar);
                                    }
                                    Iterator<Map.Entry<bbtj, cjtd>> it = bdpcVar8.c.entrySet().iterator();
                                    while (true) {
                                        i2 = i4 + 1;
                                        if (it.hasNext()) {
                                            Map.Entry<bbtj, cjtd> next = it.next();
                                            bbtj key = next.getKey();
                                            cjtd value = next.getValue();
                                            bdoc bdocVar2 = bdpeVar3.h;
                                            if (bdocVar2.d.isEmpty()) {
                                                bdocVar2.a(bdpdVar);
                                            }
                                            bcam c2 = bcam.c(key);
                                            if (bdocVar2.d.containsKey(c2)) {
                                                key.a();
                                            } else {
                                                bdpa bdpaVar = bdocVar2.c.get(c2);
                                                if (bdpaVar == null) {
                                                    bdph bdphVar = bdocVar2.i;
                                                    bwrs<bcan> bwrsVar = bdocVar2.g;
                                                    bdol bdolVar = bdocVar2.h;
                                                    bcpd bcpdVar = bdocVar2.f;
                                                    bdph.a(key, i5);
                                                    bdph.a(bwrsVar, 3);
                                                    bdph.a(bdolVar, 4);
                                                    bdph.a(bdozVar, 5);
                                                    bdph.a(bcpdVar, 6);
                                                    Activity activity3 = (Activity) ((dxjd) bdphVar.a).a;
                                                    i3 = size3;
                                                    bdph.a(activity3, 7);
                                                    btvo a5 = bdphVar.b.a();
                                                    arrayList = arrayList2;
                                                    bdph.a(a5, 8);
                                                    apqe a6 = bdphVar.c.a();
                                                    bdph.a(a6, 9);
                                                    bdpaVar = new bdpa(key, value, bwrsVar, bdolVar, bdozVar, bcpdVar, activity3, a5, a6);
                                                } else {
                                                    i3 = size3;
                                                    arrayList = arrayList2;
                                                    bdpaVar.m(key);
                                                    bdpaVar.n(value);
                                                    bdpaVar.o(bdozVar);
                                                    bdpaVar.p();
                                                }
                                                bdocVar2.d.put(c2, bdpaVar);
                                                bdocVar2.b.b(bdpdVar, bdpaVar);
                                                size3 = i3;
                                                arrayList2 = arrayList;
                                                i5 = 1;
                                            }
                                        }
                                    }
                                    i4 = i2;
                                }
                                bdpeVar3.h.b();
                                cqkx.p(bdpeVar3);
                            }
                        });
                    }
                });
            }
        };
        bdmqVar.b.execute(new Runnable(bdmqVar, g, bdmsVar) { // from class: bdmm
            private final bdmq a;
            private final List b;
            private final bdms c;

            {
                this.a = bdmqVar;
                this.b = g;
                this.c = bdmsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bdmq bdmqVar2 = this.a;
                List<bbtj> list2 = this.b;
                final bdms bdmsVar2 = this.c;
                bcan c = bdmqVar2.a.c();
                dbsk.s(c);
                bbud f = c.f();
                final dcdd a2 = dcde.a();
                if (f == null) {
                    a2.c(bdmp.NON_NEARBY_PHOTOS, list2);
                    bdmsVar2.a(a2.a());
                    return;
                }
                dbsg<ilo> dbsgVar = ((bbsp) f).a;
                final akqq aj = dbsgVar.a() ? dbsgVar.b().aj() : null;
                bdrs a3 = bdmqVar2.c.a(list2.size(), new Runnable(bdmsVar2, a2) { // from class: bdmn
                    private final bdms a;
                    private final dcdd b;

                    {
                        this.a = bdmsVar2;
                        this.b = a2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a(this.b.a());
                    }
                });
                for (final bbtj bbtjVar : list2) {
                    a3.a(new Runnable(aj, bbtjVar, a2) { // from class: bdmo
                        private final akqq a;
                        private final bbtj b;
                        private final dcdd c;

                        {
                            this.a = aj;
                            this.b = bbtjVar;
                            this.c = a2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bdmp bdmpVar;
                            akqq akqqVar = this.a;
                            bbtj bbtjVar2 = this.b;
                            dcdd dcddVar = this.c;
                            akqq j = bbtjVar2.j();
                            if (akqqVar == null || j == null || akqo.e(akqqVar, j) >= 500.0d) {
                                bdmpVar = bdmp.NON_NEARBY_PHOTOS;
                            } else {
                                bdmpVar = bdmp.NEARBY_PHOTOS;
                            }
                            synchronized (dcddVar) {
                                dcddVar.b(bdmpVar, bbtjVar2);
                            }
                        }
                    }, bvrj.BACKGROUND_THREADPOOL);
                }
            }
        });
    }

    @Override // defpackage.bdoq
    public Boolean c() {
        return Boolean.valueOf(this.k.a("android.permission.READ_EXTERNAL_STORAGE"));
    }

    @Override // defpackage.bdoq
    public cqkl d() {
        bdmb bdmbVar;
        bdlz bdlzVar = bdlz.GRANTED;
        int ordinal = this.n.b.ordinal();
        if (ordinal == 4 || ordinal == 5) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.c.getPackageName(), null));
            this.j.a().f(this.c, intent, 4);
        } else {
            this.n.b();
            if (Build.VERSION.SDK_INT >= 29 && (bdmbVar = this.o) != null) {
                bdmbVar.b();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bdoq
    public cqqw e() {
        return this.m;
    }

    public final bbtj f(bbtj bbtjVar) {
        return bbtjVar.n(dbsj.e(this.b.x(bbtjVar)));
    }

    @Override // defpackage.bdrq
    public Boolean h() {
        return true;
    }

    @Override // defpackage.bdrq
    public Boolean i() {
        boolean z = false;
        if (!this.p && c().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdrq
    public void j() {
        this.p = true;
    }

    @Override // defpackage.bdoq
    /* renamed from: k */
    public dcde<bdoj, bdok> b() {
        bvrj.UI_THREAD.c();
        bdoc bdocVar = this.h;
        if (bdocVar.a.D()) {
            bdocVar.a(bdoc.k);
            bdocVar.b();
        }
        return bdocVar.a;
    }

    public void l(bbtj bbtjVar) {
        bdpa c = this.h.c(bbtjVar);
        if (c == null) {
            Object[] objArr = new Object[3];
            objArr[0] = true != bbtjVar.b().equals(bbti.VIDEO) ? "photo" : "video";
            objArr[1] = bbtjVar.a();
            objArr[2] = dbsj.e(bbtjVar.i());
            bvoo.h("Could not find %s with url: %s and filepath: %s", objArr);
        } else if (!c.a().booleanValue()) {
            c.l();
        } else {
            cqkx.p(c);
        }
    }

    public void m(bbtj bbtjVar) {
        bdpa c = this.h.c(bbtjVar);
        if (c == null) {
            if (!this.k.a("android.permission.READ_EXTERNAL_STORAGE")) {
                bbtjVar.a();
                bbtjVar.i();
                int i = dbsj.a;
                return;
            }
            bvoo.h("Could not find photo with URI: %s and filepath: %s", bbtjVar.a(), dbsj.e(bbtjVar.i()));
        } else if (c.a().booleanValue()) {
            c.l();
        } else {
            cqkx.p(c);
        }
    }
}
