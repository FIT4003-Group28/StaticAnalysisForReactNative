package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: uhp  reason: default package */
/* loaded from: classes4.dex */
public final class uhp implements uhh {
    private final Context a;
    private final ampq b;
    private final uhf c;
    private final uhe d;
    private final uhm e;
    private final uck f;
    private final Map g;
    private final snc h;
    private final ude i;
    private final ues j;

    public uhp(Context context, ampq ampqVar, uhf uhfVar, ude udeVar, uhe uheVar, uhm uhmVar, ues uesVar, ucj ucjVar, Map map, snc sncVar) {
        this.a = context;
        this.b = ampqVar;
        this.c = uhfVar;
        this.i = udeVar;
        this.d = uheVar;
        this.e = uhmVar;
        this.j = uesVar;
        this.f = ucjVar.d;
        this.g = map;
        this.h = sncVar;
    }

    private static synchronized void e(Context context, String str, Notification notification) {
        synchronized (uhp.class) {
            fq.a(context).f(str, 0, notification);
            uev.e("SystemTrayManagerImpl", "Added to tray: tag = %s", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2 A[Catch: all -> 0x0217, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:10:0x002b, B:13:0x002f, B:17:0x0049, B:19:0x004d, B:24:0x0061, B:30:0x0072, B:33:0x008a, B:40:0x009c, B:42:0x00b2, B:43:0x00b6, B:45:0x00c5, B:52:0x00d6, B:53:0x00f1, B:55:0x00f7, B:57:0x0105, B:58:0x012a, B:62:0x0133, B:64:0x0158, B:65:0x0159, B:70:0x017f, B:72:0x01a6, B:69:0x017b, B:78:0x0216, B:46:0x00c8, B:49:0x00ce, B:50:0x00d1, B:51:0x00d4), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x0217, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:10:0x002b, B:13:0x002f, B:17:0x0049, B:19:0x004d, B:24:0x0061, B:30:0x0072, B:33:0x008a, B:40:0x009c, B:42:0x00b2, B:43:0x00b6, B:45:0x00c5, B:52:0x00d6, B:53:0x00f1, B:55:0x00f7, B:57:0x0105, B:58:0x012a, B:62:0x0133, B:64:0x0158, B:65:0x0159, B:70:0x017f, B:72:0x01a6, B:69:0x017b, B:78:0x0216, B:46:0x00c8, B:49:0x00ce, B:50:0x00d1, B:51:0x00d4), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[Catch: all -> 0x0217, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:10:0x002b, B:13:0x002f, B:17:0x0049, B:19:0x004d, B:24:0x0061, B:30:0x0072, B:33:0x008a, B:40:0x009c, B:42:0x00b2, B:43:0x00b6, B:45:0x00c5, B:52:0x00d6, B:53:0x00f1, B:55:0x00f7, B:57:0x0105, B:58:0x012a, B:62:0x0133, B:64:0x0158, B:65:0x0159, B:70:0x017f, B:72:0x01a6, B:69:0x017b, B:78:0x0216, B:46:0x00c8, B:49:0x00ce, B:50:0x00d1, B:51:0x00d4), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7 A[Catch: all -> 0x0217, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0012, B:10:0x002b, B:13:0x002f, B:17:0x0049, B:19:0x004d, B:24:0x0061, B:30:0x0072, B:33:0x008a, B:40:0x009c, B:42:0x00b2, B:43:0x00b6, B:45:0x00c5, B:52:0x00d6, B:53:0x00f1, B:55:0x00f7, B:57:0x0105, B:58:0x012a, B:62:0x0133, B:64:0x0158, B:65:0x0159, B:70:0x017f, B:72:0x01a6, B:69:0x017b, B:78:0x0216, B:46:0x00c8, B:49:0x00ce, B:50:0x00d1, B:51:0x00d4), top: B:84:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void f(defpackage.ucp r22, defpackage.ucw r23, java.lang.String r24, defpackage.fi r25, boolean r26, boolean r27, defpackage.uip r28, defpackage.uer r29) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhp.f(ucp, ucw, java.lang.String, fi, boolean, boolean, uip, uer):void");
    }

    private static synchronized void g(Context context, String str) {
        synchronized (uhp.class) {
            fq.a(context).d(str, 0);
            uev.e("SystemTrayManagerImpl", "Removed from tray: tag = %s", str);
        }
    }

    private final boolean h(String str, String str2, ucp ucpVar, ucw ucwVar, boolean z, uip uipVar) {
        List list;
        StatusBarNotification[] activeNotifications;
        StatusBarNotification[] activeNotifications2;
        boolean equals = "chime_default_group".equals(str2);
        if (uid.c() || !equals) {
            String str3 = ucpVar != null ? ucpVar.b : null;
            List b = this.i.b(str3, str2);
            if (uid.c()) {
                list = new ArrayList();
                ArrayList arrayList = new ArrayList();
                amzt listIterator = ((amuk) b).listIterator();
                while (listIterator.hasNext()) {
                    ucw ucwVar2 = (ucw) listIterator.next();
                    if (ucwVar == null || !ucwVar.a.equals(ucwVar2.a)) {
                        if (uid.c()) {
                            for (StatusBarNotification statusBarNotification : ((NotificationManager) this.a.getSystemService(NotificationManager.class)).getActiveNotifications()) {
                                if (statusBarNotification.getId() != 0 || !umr.d(str3, ucwVar2.a).equals(statusBarNotification.getTag())) {
                                }
                            }
                        }
                        arrayList.add(ucwVar2.a);
                    }
                    list.add(ucwVar2);
                }
                if (!arrayList.isEmpty()) {
                    this.i.d(str3, (String[]) arrayList.toArray(new String[0]));
                }
            } else {
                list = b;
            }
            if (list.isEmpty()) {
                g(this.a, str);
                return false;
            }
            if (equals) {
                int size = list.size();
                if (uid.c() && size < this.f.k) {
                    for (StatusBarNotification statusBarNotification2 : ((NotificationManager) this.a.getSystemService("notification")).getActiveNotifications()) {
                        if (!str.equals(statusBarNotification2.getTag()) || statusBarNotification2.getId() != 0) {
                        }
                    }
                    uev.e("SystemTrayManagerImpl", "Skipped creating default summary.", new Object[0]);
                    return true;
                }
            }
            fi a = this.c.a(str, ucpVar, list, z, uipVar);
            a.u = true;
            a.t = str;
            e(this.a, str, a.b());
            return true;
        }
        return false;
    }

    private final synchronized void i(ucp ucpVar, List list, List list2, uer uerVar, aojl aojlVar) {
        if (list.isEmpty()) {
            uev.e("SystemTrayManagerImpl", "Remove notifications skipped due to empty thread list.", new Object[0]);
            return;
        }
        String str = ucpVar != null ? ucpVar.b : null;
        String[] strArr = (String[]) list.toArray(new String[0]);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g(this.a, umr.d(str, (String) it.next()));
        }
        this.i.d(str, strArr);
        HashSet hashSet = new HashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = ((ucw) it2.next()).j;
            if (hashSet.add(str2)) {
                h(umr.e(str, str2), str2, ucpVar, null, true, null);
            }
        }
        if (!list2.isEmpty() && axqb.b() && aojlVar != null) {
            uep a = this.j.a(aojw.REMOVED);
            a.d(ucpVar);
            a.c(list2);
            ((ueu) a).w = 2;
            ((ueu) a).t = uerVar;
            ((ueu) a).j = aojlVar;
            a.i();
        }
        uev.e("SystemTrayManagerImpl", "Remove notifications completed.", new Object[0]);
    }

    @Override // defpackage.uhh
    public final synchronized List a(ucp ucpVar, List list, uer uerVar, aojl aojlVar) {
        String str;
        List c;
        if (ucpVar != null) {
            try {
                str = ucpVar.b;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        c = this.i.c(str, (String[]) list.toArray(new String[0]));
        i(ucpVar, list, c, uerVar, aojlVar);
        return c;
    }

    @Override // defpackage.uhh
    public final synchronized List b(ucp ucpVar, List list, aojl aojlVar) {
        ArrayList arrayList;
        String str = ucpVar.b;
        String[] strArr = new String[list.size()];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            String str2 = ((aolq) list.get(i)).c;
            strArr[i] = str2;
            hashMap.put(str2, Long.valueOf(((aolq) list.get(i)).d));
        }
        List c = this.i.c(str, strArr);
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        amzt listIterator = ((amuk) c).listIterator();
        while (listIterator.hasNext()) {
            ucw ucwVar = (ucw) listIterator.next();
            String str3 = ucwVar.a;
            if (((Long) hashMap.get(str3)).longValue() > ucwVar.b.longValue()) {
                arrayList2.add(str3);
                arrayList.add(ucwVar);
            }
        }
        i(ucpVar, arrayList2, arrayList, null, aojlVar);
        return arrayList;
    }

    @Override // defpackage.uhh
    public final void c(ucp ucpVar, ucw ucwVar, boolean z, boolean z2, ubz ubzVar, uip uipVar, uer uerVar) {
        ucw ucwVar2 = ucwVar;
        uev.e("SystemTrayManagerImpl", "Updating notification", new Object[0]);
        uck uckVar = this.f;
        uckVar.getClass();
        if (!uckVar.l || ucpVar == null || ucpVar.i.longValue() < ucwVar2.b.longValue()) {
            String str = ucpVar != null ? ucpVar.b : null;
            if (!z) {
                List c = this.i.c(str, ucwVar2.a);
                if (!c.isEmpty() && ((ucw) c.get(0)).b.longValue() >= ucwVar2.b.longValue()) {
                    uep c2 = this.j.c(42);
                    c2.d(ucpVar);
                    c2.b(ucwVar2);
                    ((ueu) c2).t = uerVar;
                    c2.i();
                    uev.e("SystemTrayManagerImpl", "Skipping thread [%s]. Already in system tray.", ucwVar2.a);
                    return;
                }
            }
            if (uid.d(this.a)) {
                String a = this.d.a(ucwVar2);
                if (TextUtils.isEmpty(a)) {
                    uep c3 = this.j.c(35);
                    c3.d(ucpVar);
                    c3.b(ucwVar2);
                    ((ueu) c3).t = uerVar;
                    c3.i();
                    uev.b("SystemTrayManagerImpl", "Skipping thread [%s]. Channel not found error.", ucwVar2.a);
                    return;
                } else if (!this.d.e(a)) {
                    uep c4 = this.j.c(36);
                    c4.d(ucpVar);
                    c4.a(a);
                    c4.b(ucwVar2);
                    ((ueu) c4).t = uerVar;
                    c4.i();
                    uev.e("SystemTrayManagerImpl", "Skipping thread [%s]. Can't post to channel.", ucwVar2.a);
                    return;
                }
            }
            if (fq.a(this.a).g()) {
                String d = umr.d(str, ucwVar2.a);
                long d2 = this.h.d();
                Pair b = this.c.b(d, ucpVar, ucwVar, z2, ubzVar, uipVar);
                if (uerVar != null) {
                    uerVar.g = Long.valueOf(this.h.d() - d2);
                }
                if (b == null) {
                    uev.e("SystemTrayManagerImpl", "Skipping thread [%s]. No notification builder.", ucwVar2.a);
                    return;
                }
                fi fiVar = (fi) b.first;
                for (Integer num : uii.a) {
                    int intValue = num.intValue();
                    Map map = this.g;
                    Integer valueOf = Integer.valueOf(intValue);
                    if (map.containsKey(valueOf) && ((uii) this.g.get(valueOf)).b(ucpVar, ucwVar2, fiVar, (ampq) b.second, ubzVar)) {
                        uev.e("SystemTrayManagerImpl", "Notification customized by customizer with int key: %d", valueOf);
                        ucwVar2 = ((uii) this.g.get(valueOf)).a(ucwVar2);
                    }
                }
                f(ucpVar, ucwVar2, d, fiVar, z, z2, uipVar, uerVar);
                return;
            }
            uep c5 = this.j.c(7);
            c5.d(ucpVar);
            c5.b(ucwVar2);
            ((ueu) c5).t = uerVar;
            c5.i();
            uev.e("SystemTrayManagerImpl", "Skipping thread [%s]. Notifications from this app are blocked.", ucwVar2.a);
            return;
        }
        uep c6 = this.j.c(52);
        c6.d(ucpVar);
        c6.b(ucwVar2);
        ((ueu) c6).t = uerVar;
        c6.i();
        uev.e("SystemTrayManagerImpl", "Skipping thread [%s]. Created before first registration.", ucwVar2.a);
    }

    @Override // defpackage.uhh
    public final synchronized void d(ucp ucpVar, aojl aojlVar) {
        String str;
        if (ucpVar != null) {
            try {
                str = ucpVar.b;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            str = null;
        }
        List a = this.i.a(str);
        ude udeVar = this.i;
        vfm b = vfm.b();
        b.c("1");
        udeVar.a.b(str, amuk.r(b.a()));
        HashSet<String> hashSet = new HashSet();
        amzt listIterator = ((amuk) a).listIterator();
        while (listIterator.hasNext()) {
            ucw ucwVar = (ucw) listIterator.next();
            hashSet.add(ucwVar.j);
            g(this.a, umr.d(str, ucwVar.a));
        }
        for (String str2 : hashSet) {
            g(this.a, umr.e(str, str2));
        }
        if (a.isEmpty() || !axqb.b() || aojlVar == null) {
            return;
        }
        uep a2 = this.j.a(aojw.REMOVED);
        a2.d(ucpVar);
        a2.c(a);
        ((ueu) a2).w = 2;
        ((ueu) a2).j = aojlVar;
        a2.i();
    }
}
