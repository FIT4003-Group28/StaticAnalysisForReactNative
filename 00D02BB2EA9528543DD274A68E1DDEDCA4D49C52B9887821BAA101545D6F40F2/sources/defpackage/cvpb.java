package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cvpb  reason: default package */
/* loaded from: classes5.dex */
public final class cvpb implements cvot {
    private final Context a;
    private final dbsg<cvtj> b;
    private final dbsg<cvtk> c;
    private final cvkk d;
    private final cvor e;
    private final cvoy f;
    private final cvjt g;
    private final Map<Integer, cvpw> h;
    private final cqat i;
    private final cvpa j;
    private final cvlr k;

    public cvpb(Context context, dbsg dbsgVar, dbsg dbsgVar2, cvpa cvpaVar, cvkk cvkkVar, cvor cvorVar, cvoy cvoyVar, cvlr cvlrVar, cvjs cvjsVar, Map map, cqat cqatVar) {
        this.a = context;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.j = cvpaVar;
        this.d = cvkkVar;
        this.e = cvorVar;
        this.f = cvoyVar;
        this.k = cvlrVar;
        this.g = cvjsVar.e();
        this.h = map;
        this.i = cqatVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac A[Catch: all -> 0x01de, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0018, B:8:0x001e, B:12:0x0037, B:15:0x003b, B:19:0x0053, B:21:0x0059, B:27:0x006a, B:30:0x0080, B:37:0x0095, B:39:0x00ac, B:40:0x00b0, B:48:0x00cf, B:52:0x00dc, B:53:0x00f4, B:55:0x00fa, B:57:0x010a, B:58:0x0112, B:62:0x011d, B:64:0x0122, B:65:0x0123, B:67:0x014a, B:68:0x015d, B:70:0x016b, B:72:0x019b, B:73:0x01a0, B:49:0x00d2, B:50:0x00d5, B:51:0x00d9, B:79:0x01dd), top: B:85:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void e(@defpackage.dzsi defpackage.cvkc r21, defpackage.cvkj r22, java.lang.String r23, defpackage.ib r24, boolean r25, boolean r26, @defpackage.dzsi defpackage.cvte r27, @defpackage.dzsi defpackage.cvlq r28) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpb.e(cvkc, cvkj, java.lang.String, ib, boolean, boolean, cvte, cvlq):void");
    }

    private final boolean f(String str, String str2, @dzsi cvkc cvkcVar, @dzsi cvkj cvkjVar, boolean z, @dzsi cvte cvteVar) {
        ib ibVar;
        StatusBarNotification[] activeNotifications;
        StatusBarNotification[] activeNotifications2;
        boolean equals = "chime_default_group".equals(str2);
        if (cvpo.a() || !equals) {
            String b = cvkcVar != null ? cvkcVar.b() : null;
            List<cvkj> e = this.d.e(b, str2);
            if (cvpo.a()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (cvkj cvkjVar2 : e) {
                    if (cvkjVar == null || !cvkjVar.a().equals(cvkjVar2.a())) {
                        for (StatusBarNotification statusBarNotification : ((NotificationManager) this.a.getSystemService(NotificationManager.class)).getActiveNotifications()) {
                            if (statusBarNotification.getId() != 0 || !statusBarNotification.getTag().equals(cvpd.a(b, cvkjVar2.a()))) {
                            }
                        }
                        arrayList2.add(cvkjVar2.a());
                    }
                    arrayList.add(cvkjVar2);
                }
                if (!arrayList2.isEmpty()) {
                    this.d.j(b, (String[]) arrayList2.toArray(new String[0]));
                }
                e = arrayList;
            }
            if (e.isEmpty()) {
                in.a(this.a).c(str, 0);
                return false;
            }
            if (equals) {
                int size = e.size();
                if (cvpo.a() && size < this.g.m()) {
                    for (StatusBarNotification statusBarNotification2 : ((NotificationManager) this.a.getSystemService("notification")).getActiveNotifications()) {
                        if (!str.equals(statusBarNotification2.getTag()) || statusBarNotification2.getId() != 0) {
                        }
                    }
                    cvlw.a("SystemTrayManagerImpl", "Skipped creating default summary.", new Object[0]);
                    return true;
                }
            }
            cvpa cvpaVar = this.j;
            if (cvpo.a()) {
                cvow cvowVar = cvpaVar.a;
                dbsk.a(e != null);
                dbsk.a(!e.isEmpty());
                ibVar = new ib(cvowVar.b);
                ibVar.H = 2;
                ibVar.t(cvowVar.e.a().intValue());
                String d = cvowVar.d(cvkcVar, e);
                if (!TextUtils.isEmpty(d)) {
                    ibVar.w(d);
                }
                if (cvowVar.e.c() != null) {
                    ibVar.B = cvowVar.b.getResources().getColor(cvowVar.e.c().intValue());
                }
                cvowVar.d.a(ibVar, e.get(0));
                cvowVar.c(ibVar, cvkcVar, e.size());
                ibVar.g = cvowVar.c.a(str, cvkcVar, e, cvteVar);
                ibVar.n(cvowVar.c.b(str, cvkcVar, e));
            } else if (e.size() == 1) {
                ibVar = cvpaVar.a.a(str, cvkcVar, e.get(0), z, cvix.d(), cvteVar);
            } else {
                cvow cvowVar2 = cvpaVar.a;
                dbsk.a(e != null);
                dbsk.a(e.size() >= 2);
                ie ieVar = new ie();
                for (cvkj cvkjVar3 : e) {
                    dsch d2 = cvkjVar3.d();
                    if (d2.c.isEmpty()) {
                        ieVar.h(cvow.e(cvowVar2.b.getString(R.string.chime_notification_title, d2.b)));
                    } else {
                        ieVar.h(cvow.e(cvowVar2.b.getString(R.string.combined_notification_text, d2.b, d2.c)));
                    }
                }
                ib ibVar2 = new ib(cvowVar2.b);
                ibVar2.l(cvowVar2.b.getString(cvowVar2.e.b().intValue()));
                ibVar2.k(cvowVar2.b.getResources().getQuantityString(R.plurals.public_notification_text, e.size(), Integer.valueOf(e.size())));
                ibVar2.t(cvowVar2.e.a().intValue());
                ibVar2.v(ieVar);
                String d3 = cvowVar2.d(cvkcVar, e);
                if (!TextUtils.isEmpty(d3)) {
                    ibVar2.w(d3);
                }
                if (cvowVar2.e.c() != null) {
                    ibVar2.B = cvowVar2.b.getResources().getColor(cvowVar2.e.c().intValue());
                }
                cvowVar2.b(ibVar2, e.get(0).d(), z);
                cvowVar2.c(ibVar2, cvkcVar, e.size());
                ibVar2.g = cvowVar2.c.a(str, cvkcVar, e, null);
                ibVar2.n(cvowVar2.c.b(str, cvkcVar, e));
                ibVar = ibVar2;
            }
            if (this.b.a()) {
                this.b.b().c();
            }
            ibVar.u = true;
            ibVar.t = str;
            in.a(this.a).e(str, 0, ibVar.b());
            return true;
        }
        return false;
    }

    private final synchronized void g(@dzsi cvkc cvkcVar, List<String> list, List<cvkj> list2, int i, @dzsi cvlq cvlqVar, @dzsi int i2) {
        if (list.isEmpty()) {
            cvlw.a("SystemTrayManagerImpl", "Remove notifications skipped due to empty thread list.", new Object[0]);
            return;
        }
        String b = cvkcVar != null ? cvkcVar.b() : null;
        String[] strArr = (String[]) list.toArray(new String[0]);
        for (String str : list) {
            in.a(this.a).c(cvpd.a(b, str), 0);
        }
        dbsk.b(true, "DataUpdatePolicy cannot be null.");
        if (i - 1 != 0) {
            this.d.h(b, strArr);
        } else {
            this.d.j(b, strArr);
        }
        HashSet hashSet = new HashSet();
        for (cvkj cvkjVar : list2) {
            String j = cvkjVar.j();
            if (hashSet.add(j)) {
                f(cvpd.b(b, j), j, cvkcVar, null, true, null);
            }
        }
        if (!list2.isEmpty() && dxxk.c() && i2 != 0) {
            cvlp a = this.k.a(drwv.REMOVED);
            a.i(cvkcVar);
            a.e(list2);
            a.s(2);
            a.p(cvlqVar);
            a.t(i2);
            a.a();
        }
        cvlw.a("SystemTrayManagerImpl", "Remove notifications completed.", new Object[0]);
    }

    @Override // defpackage.cvot
    public final void a(@dzsi cvkc cvkcVar, cvkj cvkjVar, boolean z, boolean z2, cvix cvixVar, @dzsi cvte cvteVar, @dzsi cvlq cvlqVar) {
        cvkj cvkjVar2 = cvkjVar;
        cvlw.a("SystemTrayManagerImpl", "Updating notification", new Object[0]);
        cvjt cvjtVar = this.g;
        if (cvjtVar == null || !cvjtVar.n() || cvkcVar == null || cvkcVar.i().longValue() < cvkjVar.b().longValue()) {
            String b = cvkcVar != null ? cvkcVar.b() : null;
            if (!z) {
                List<cvkj> d = this.d.d(b, cvkjVar.a());
                if (!d.isEmpty() && d.get(0).b().longValue() >= cvkjVar.b().longValue()) {
                    cvlp b2 = this.k.b(42);
                    b2.i(cvkcVar);
                    b2.d(cvkjVar2);
                    b2.p(cvlqVar);
                    b2.a();
                    cvlw.a("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", cvkjVar.a());
                    return;
                }
            }
            if (cvpo.d(this.a)) {
                String b3 = this.e.b(cvkjVar2);
                if (TextUtils.isEmpty(b3)) {
                    cvlp b4 = this.k.b(35);
                    b4.i(cvkcVar);
                    b4.d(cvkjVar2);
                    b4.p(cvlqVar);
                    b4.a();
                    cvlw.d("SystemTrayManagerImpl", "Skipping thread [%s]. Channel not found error.", cvkjVar.a());
                    return;
                } else if (!this.e.e(b3)) {
                    cvlp b5 = this.k.b(36);
                    b5.i(cvkcVar);
                    b5.c(b3);
                    b5.d(cvkjVar2);
                    b5.p(cvlqVar);
                    b5.a();
                    cvlw.a("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", cvkjVar.a());
                    return;
                }
            }
            if (!in.a(this.a).f()) {
                cvlp b6 = this.k.b(7);
                b6.i(cvkcVar);
                b6.d(cvkjVar2);
                b6.p(cvlqVar);
                b6.a();
                cvlw.a("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", cvkjVar.a());
                return;
            }
            if (this.b.a()) {
                long currentTimeMillis = System.currentTimeMillis();
                List<cvkg> b7 = this.b.b().b(cvkcVar, cvkjVar2, cvkjVar.n());
                if (b7 != null) {
                    cvka o = cvkjVar.o();
                    o.b(b7);
                    cvkjVar2 = o.a();
                }
                if (cvlqVar != null) {
                    cvlqVar.e = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                }
            }
            cvkj cvkjVar3 = cvkjVar2;
            String a = cvpd.a(b, cvkjVar3.a());
            long currentTimeMillis2 = System.currentTimeMillis();
            ib a2 = this.j.a.a(a, cvkcVar, cvkjVar3, z2, cvixVar, cvteVar);
            if (cvlqVar != null) {
                cvlqVar.f = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
            }
            if (a2 == null) {
                cvlw.a("SystemTrayManagerImpl", "Skipping thread [%s]. No notification builder.", cvkjVar3.a());
                return;
            }
            if (this.b.a()) {
                long currentTimeMillis3 = System.currentTimeMillis();
                this.b.b().a(cvkcVar, cvkjVar3, a2);
                if (cvlqVar != null) {
                    cvlqVar.g = Long.valueOf(System.currentTimeMillis() - currentTimeMillis3);
                }
            }
            for (Integer num : cvpw.a) {
                int intValue = num.intValue();
                Map<Integer, cvpw> map = this.h;
                Integer valueOf = Integer.valueOf(intValue);
                if (map.containsKey(valueOf) && this.h.get(valueOf).a(cvkcVar, cvkjVar3, a2)) {
                    cvlw.a("SystemTrayManagerImpl", "Notification customized by customizer with int key: %d", valueOf);
                }
            }
            e(cvkcVar, cvkjVar3, a, a2, z, z2, cvteVar, cvlqVar);
            return;
        }
        cvlp b8 = this.k.b(52);
        b8.i(cvkcVar);
        b8.d(cvkjVar2);
        b8.p(cvlqVar);
        b8.a();
        cvlw.a("SystemTrayManagerImpl", "Skipping thread [%s]. Created before first registration.", cvkjVar.a());
    }

    @Override // defpackage.cvot
    public final synchronized List<cvkj> b(@dzsi cvkc cvkcVar, List<String> list, int i, @dzsi cvlq cvlqVar, @dzsi int i2) {
        String b;
        List<cvkj> d;
        if (cvkcVar != null) {
            try {
                b = cvkcVar.b();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            b = null;
        }
        d = this.d.d(b, (String[]) list.toArray(new String[0]));
        g(cvkcVar, list, d, i, cvlqVar, i2);
        return d;
    }

    @Override // defpackage.cvot
    public final synchronized void c(@dzsi cvkc cvkcVar, @dzsi int i) {
        String b;
        if (cvkcVar != null) {
            try {
                b = cvkcVar.b();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            b = null;
        }
        List<cvkj> b2 = this.d.b(b);
        dbsk.b(true, "DataUpdatePolicy cannot be null.");
        this.d.i(b);
        HashSet<String> hashSet = new HashSet();
        for (cvkj cvkjVar : b2) {
            hashSet.add(cvkjVar.j());
            in.a(this.a).c(cvpd.a(b, cvkjVar.a()), 0);
        }
        for (String str : hashSet) {
            in.a(this.a).c(cvpd.b(b, str), 0);
        }
        if (b2.isEmpty() || !dxxk.c()) {
            return;
        }
        cvlp a = this.k.a(drwv.REMOVED);
        a.i(cvkcVar);
        a.e(b2);
        a.s(2);
        a.t(11);
        a.a();
    }

    @Override // defpackage.cvot
    public final synchronized List<cvkj> d(@dzsi cvkc cvkcVar, List<dsbc> list, @dzsi int i) {
        String b;
        ArrayList arrayList;
        if (cvkcVar != null) {
            try {
                b = cvkcVar.b();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            b = null;
        }
        String[] strArr = new String[list.size()];
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).b;
            strArr[i2] = str;
            hashMap.put(str, Long.valueOf(list.get(i2).c));
        }
        List<cvkj> d = this.d.d(b, strArr);
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        for (cvkj cvkjVar : d) {
            String a = cvkjVar.a();
            if (((Long) hashMap.get(a)).longValue() > cvkjVar.b().longValue()) {
                arrayList2.add(a);
                arrayList.add(cvkjVar);
            }
        }
        g(cvkcVar, arrayList2, arrayList, 1, null, i);
        return arrayList;
    }
}
