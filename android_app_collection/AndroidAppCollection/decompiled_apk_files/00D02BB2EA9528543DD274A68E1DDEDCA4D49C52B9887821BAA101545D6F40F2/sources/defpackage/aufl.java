package defpackage;

import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.gmm.notification.receiver.CancelNotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aufl  reason: default package */
/* loaded from: classes.dex */
public final class aufl implements auhi {
    public final dxio<cjqy> a;
    public final dxio<auui> b;
    public final dxio<auhq> c;
    public final dxio<auon> d;
    private final dxio<ausy> f;
    private final bvjj g;
    private final Application h;
    private final Executor i;
    private final Executor j;
    private final dxio<NotificationManager> k;
    private final dxio<auhg> l;
    private final dxio<auso> m;
    private final dxio<AlarmManager> n;
    private final dxio<bsvn> o;
    private final dxio<aukk> p;
    private final dxio<aufm> q;
    private final dxio<btvo> r;
    private final btrm s;
    private final Map<auio, List<aujb>> e = new aif();
    private final AtomicBoolean t = new AtomicBoolean(false);

    public aufl(final Application application, Executor executor, Executor executor2, dxio<cjqy> dxioVar, dxio<bsvn> dxioVar2, bvjj bvjjVar, dxio<auhq> dxioVar3, dxio<auhg> dxioVar4, dxio<auso> dxioVar5, dxio<auui> dxioVar6, dxio<ausy> dxioVar7, dxio<aukk> dxioVar8, dxio<aufm> dxioVar9, dxio<auon> dxioVar10, dxio<btvo> dxioVar11, btrm btrmVar) {
        this.i = executor;
        this.j = executor2;
        this.a = dxioVar;
        this.o = dxioVar2;
        this.g = bvjjVar;
        this.c = dxioVar3;
        this.l = dxioVar4;
        this.m = dxioVar5;
        this.k = btsp.b(new dbty(application) { // from class: aufh
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (NotificationManager) this.a.getSystemService("notification");
            }
        });
        this.n = btsp.b(new dbty(application) { // from class: aufi
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return (AlarmManager) this.a.getSystemService("alarm");
            }
        });
        this.b = dxioVar6;
        this.h = application;
        this.f = dxioVar7;
        this.p = dxioVar8;
        this.q = dxioVar9;
        this.d = dxioVar10;
        this.r = dxioVar11;
        this.s = btrmVar;
    }

    private final aufs A(aujb aujbVar) {
        auix b = aujbVar.b();
        if (b == null) {
            return aufs.ENABLED;
        }
        C();
        aufv B = B();
        if (!B.b(aujbVar.a)) {
            return b.e;
        }
        int i = aujbVar.a;
        auft auftVar = auft.c;
        dssd<Integer, auft> dssdVar = B.a;
        Integer valueOf = Integer.valueOf(i);
        if (dssdVar.containsKey(valueOf)) {
            auftVar = dssdVar.get(valueOf);
        }
        aufs b2 = aufs.b(auftVar.b);
        return b2 == null ? aufs.UNKNOWN_STATE : b2;
    }

    private final aufv B() {
        C();
        return (aufv) this.g.L(bvjk.gd, (dssr) aufv.b.cu(7), aufv.b);
    }

    private final void C() {
        ArrayList arrayList;
        aufs aufsVar;
        D();
        if (this.t.getAndSet(true)) {
            return;
        }
        w();
        synchronized (this) {
            arrayList = new ArrayList(this.e.values());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List<aujb> list = (List) arrayList.get(i);
            if (list.size() > 1) {
                aih aihVar = new aih();
                for (aujb aujbVar : list) {
                    if (u(aujbVar.a)) {
                        aihVar.add(A(aujbVar));
                    }
                }
                if (!aihVar.isEmpty()) {
                    if (aihVar.contains(aufs.ENABLED)) {
                        aufsVar = aufs.ENABLED;
                    } else {
                        aufsVar = aihVar.contains(aufs.INBOX_ONLY) ? aufs.INBOX_ONLY : aufs.DISABLED;
                    }
                    for (aujb aujbVar2 : list) {
                        v(aujbVar2, aufsVar);
                    }
                }
            }
        }
    }

    private final synchronized void D() {
        bvjk bvjkVar;
        aufs aufsVar;
        if (this.g.i(bvjk.gd)) {
            return;
        }
        aufp bZ = aufv.b.bZ();
        dcpd<aujb> it = this.f.a().g().values().iterator();
        while (it.hasNext()) {
            aujb next = it.next();
            auix b = next.b();
            if (b != null && (bvjkVar = b.a) != null && this.g.i(bvjkVar)) {
                if (this.g.m(bvjkVar, false)) {
                    aufsVar = aufs.ENABLED;
                } else {
                    aufsVar = aufs.DISABLED;
                }
                int i = next.a;
                aufq bZ2 = auft.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                auft auftVar = (auft) bZ2.b;
                auftVar.b = aufsVar.e;
                auftVar.a |= 1;
                bZ.a(i, bZ2.bK());
            }
        }
        this.g.al(bvjk.gd, bZ.bK());
    }

    public static boolean i(aujb aujbVar, btvo btvoVar) {
        return aujbVar.e(btvoVar) && !(aujbVar.o(btvoVar) || aujbVar.p(btvoVar));
    }

    private final void v(@dzsi aujb aujbVar, aufs aufsVar) {
        if (aujbVar == null) {
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (aujb aujbVar2 : f(aujbVar)) {
            if (aufsVar != aufs.ENABLED) {
                o(aujbVar2.a);
            }
            if (aujbVar2.b() != null && (!u(aujbVar2.a) || z(aujbVar2) != aufsVar)) {
                auix b = aujbVar2.b();
                if (b != null) {
                    bvjk bvjkVar = b.a;
                    if (bvjkVar != null) {
                        this.g.S(bvjkVar, aufsVar == aufs.ENABLED);
                    }
                    C();
                    aufq bZ = auft.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    auft auftVar = (auft) bZ.b;
                    auftVar.b = aufsVar.e;
                    auftVar.a |= 1;
                    aufv B = B();
                    dsqp dsqpVar = (dsqp) B.cu(5);
                    dsqpVar.bC(B);
                    aufp aufpVar = (aufp) dsqpVar;
                    aufpVar.a(aujbVar2.a, bZ.bK());
                    this.g.al(bvjk.gd, aufpVar.bK());
                }
                aujbVar2.i(this.r.a(), aufsVar == aufs.ENABLED);
                z2 |= aujbVar2.d();
                z = true;
            }
        }
        if (z) {
            this.s.b(new btas());
        }
        if (!z2) {
            return;
        }
        this.o.a().b();
    }

    private final synchronized void w() {
        auio v;
        if (!this.e.isEmpty()) {
            return;
        }
        dcpd<aujb> it = a().values().iterator();
        while (it.hasNext()) {
            aujb next = it.next();
            if (next.b() != null && (v = next.v()) != null) {
                if (!this.e.containsKey(v)) {
                    this.e.put(v, new ArrayList());
                }
                this.e.get(v).add(next);
            }
        }
    }

    private final void x(auuh auuhVar) {
        auug d = this.b.a().d(auuhVar);
        if (d != null) {
            final cjtd b = d.b();
            final cjsh c = d.c();
            if (b != null && c != null) {
                this.i.execute(new Runnable(this, c, b) { // from class: aufk
                    private final aufl a;
                    private final cjsh b;
                    private final cjtd c;

                    {
                        this.a = this;
                        this.b = c;
                        this.c = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aufl auflVar = this.a;
                        auflVar.a.a().N(this.b, new cjte(deaf.AUTOMATED), this.c);
                    }
                });
                this.b.a().b(auuhVar);
            }
        }
        this.k.a().cancel(auuhVar.a(), auuhVar.b());
        auuhVar.b();
        auuhVar.a();
    }

    private final void y(@dzsi String str, int i, @dzsi cjtd cjtdVar, int i2, @dzsi cjql cjqlVar, Notification notification) {
        if (ako.a()) {
            this.p.a().a(false);
        }
        try {
            this.k.a().notify(str, i2, notification);
        } catch (RuntimeException e) {
            Object[] objArr = new Object[1];
            objArr[0] = notification == null ? "<null>" : notification.toString();
            bvoo.f(new RuntimeException(String.format("Failed to show notification %s", objArr), e));
        }
        this.m.a().b(i, str, cjqlVar != null ? cjqlVar.b : null, cjtdVar, notification.flags);
    }

    private final aufs z(@dzsi aujb aujbVar) {
        C();
        if (aujbVar == null || !aujbVar.f()) {
            return aufs.DISABLED;
        }
        return A(aujbVar);
    }

    public final dcdn<Integer, aujb> a() {
        return this.f.a().f();
    }

    @Override // defpackage.auhi
    public final dcdn<Integer, aujb> b() {
        return this.f.a().g();
    }

    @Override // defpackage.auhi
    public final dcdn<Integer, aujb> c(auin auinVar) {
        dcdg p = dcdn.p();
        dcpd<Map.Entry<Integer, aujb>> it = a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, aujb> next = it.next();
            if (next.getValue().w() == auinVar) {
                p.g(next);
            }
        }
        return p.b();
    }

    @Override // defpackage.auho
    public final void d(int i, aufs aufsVar) {
        deaa deaaVar;
        aujb h = h(i);
        if (h == null) {
            return;
        }
        auix b = h.b();
        if (b != null) {
            ddho ddhoVar = b.f;
            cjqy a = this.a.a();
            cjql cjqlVar = cjql.a;
            cjte cjteVar = new cjte(deaf.TAP);
            cjta b2 = cjtd.b();
            b2.d = ddhoVar;
            ddzy bZ = deab.c.bZ();
            if (aufsVar == aufs.ENABLED) {
                deaaVar = deaa.TOGGLE_OFF;
            } else {
                deaaVar = deaa.TOGGLE_ON;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b2.a = bZ.bK();
            a.n(cjqlVar, cjteVar, b2.a());
        }
        v(h, aufsVar);
    }

    @Override // defpackage.auho
    public final void e(int i, aufs aufsVar) {
        v(g(i), aufsVar);
    }

    @Override // defpackage.auhi
    public final synchronized List<aujb> f(aujb aujbVar) {
        List<aujb> arrayList;
        w();
        if (aujbVar.b() == null) {
            return new ArrayList();
        }
        auio v = aujbVar.v();
        if (v == null) {
            return new ArrayList();
        }
        if (this.e.containsKey(v)) {
            arrayList = this.e.get(v);
        } else {
            arrayList = new ArrayList<>();
        }
        return arrayList;
    }

    @Override // defpackage.auhi
    @dzsi
    public final aujb g(int i) {
        aujb e = this.f.a().e(i);
        if (e == null || e.b() == null) {
            return null;
        }
        return e;
    }

    @Override // defpackage.auhi
    @dzsi
    public final aujb h(int i) {
        return this.f.a().e(i);
    }

    @Override // defpackage.auhi
    public final auhk j(final augj augjVar) {
        long j;
        int i = augjVar.a;
        if (!TextUtils.isEmpty(augjVar.j) || augjVar.i || augjVar.s) {
            if (!augjVar.s || Build.VERSION.SDK_INT >= 24) {
                btlu.h(augjVar.h);
                aujb aujbVar = augjVar.b;
                long j2 = augjVar.p;
                auhh b = this.l.a().b(i, augjVar.e, aujbVar, augjVar.d, j2, !augjVar.q);
                this.j.execute(new Runnable(this, augjVar) { // from class: aufj
                    private final aufl a;
                    private final augj b;

                    {
                        this.a = this;
                        this.b = augjVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aufl auflVar = this.a;
                        try {
                            auflVar.d.a().b(this.b);
                        } catch (Exception e) {
                            ((ckcn) auflVar.c.a().a.a(ckfm.a)).a();
                            bvoo.f(new RuntimeException(e));
                        }
                    }
                });
                cjql a = b.a() ? this.m.a().a(augjVar.a, augjVar.e, augjVar.c, augjVar.m, augjVar.t.f(), !augjVar.q) : null;
                if (b != auhh.SHOWN) {
                    return auhk.a(augjVar, b, dbpy.a);
                }
                int i2 = augjVar.g;
                dcpd<Integer> it = this.q.a().b.h(Integer.valueOf(i2)).iterator();
                while (it.hasNext()) {
                    o(it.next().intValue());
                }
                if (TextUtils.isEmpty(augjVar.e)) {
                    j = j2;
                    y(null, i, augjVar.c, i2, a, augjVar.a(dbsg.j(a)));
                } else {
                    j = j2;
                    y(augjVar.e, i, augjVar.c, i2, a, augjVar.a(dbsg.j(a)));
                }
                if (j > 0) {
                    try {
                        AlarmManager a2 = this.n.a();
                        Intent intent = new Intent(this.h, CancelNotificationBroadcastReceiver.class);
                        intent.putExtra("receiver_notification_id", augjVar.g);
                        String str = augjVar.e;
                        if (str != null) {
                            intent.putExtra("receiver_notification_tag", str);
                        }
                        String str2 = augjVar.e;
                        int i3 = augjVar.g;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 11);
                        sb.append(str2);
                        sb.append(i3);
                        intent.setAction(sb.toString());
                        a2.set(0, j, PendingIntent.getBroadcast(this.h, augjVar.g, intent, 268435456));
                    } catch (SecurityException unused) {
                    }
                }
                return auhk.a(augjVar, b, dbsg.j(a));
            }
            this.c.a().f(i);
            return auhk.a(augjVar, auhh.SUPPRESSED, dbpy.a);
        }
        this.c.a().f(i);
        return auhk.a(augjVar, auhh.SUPPRESSED, dbpy.a);
    }

    @Override // defpackage.auhi
    public final boolean k(@dzsi Integer num, boolean z) {
        auiw h;
        aujb h2 = h(num.intValue());
        return (h2 == null || (h = h2.h()) == null || (z && !h.b) || this.g.s(h2.h().a, 0) >= 2) ? false : true;
    }

    @Override // defpackage.auhi
    @dzsi
    public final Integer l(Intent intent) {
        int intExtra = intent.getIntExtra("NOTIFICATION_TYPE", 0);
        if (intExtra == 0) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    @Override // defpackage.auhi
    public final void m(int i) {
        n(null, i);
    }

    @Override // defpackage.auhi
    public final void n(@dzsi String str, int i) {
        x(auuh.c(str, i));
    }

    @Override // defpackage.auhi
    public final void o(int i) {
        for (auuh auuhVar : this.b.a().e(i)) {
            x(auuhVar);
        }
    }

    @Override // defpackage.auhi
    public final void p(String str, int i) {
        for (auuh auuhVar : this.b.a().e(i)) {
            String a = auuhVar.a();
            if (a != null && a.startsWith(str)) {
                x(auuhVar);
            }
        }
    }

    @Override // defpackage.auhi
    public final void q() {
        this.k.a().cancelAll();
    }

    @Override // defpackage.auhi
    public final dbsg<StatusBarNotification> r(String str, int i) {
        StatusBarNotification[] activeNotifications;
        for (StatusBarNotification statusBarNotification : this.k.a().getActiveNotifications()) {
            String tag = statusBarNotification.getTag();
            if (tag != null && tag.equals(str) && statusBarNotification.getId() == i) {
                return dbsg.i(statusBarNotification);
            }
        }
        return dbpy.a;
    }

    @Override // defpackage.auho
    public final boolean s(int i) {
        return z(h(i)) == aufs.ENABLED;
    }

    @Override // defpackage.auho
    public final aufs t(int i) {
        return z(h(i));
    }

    @Override // defpackage.auho
    public final boolean u(int i) {
        aujb h = h(i);
        if (h == null || h.b() == null) {
            return false;
        }
        C();
        return B().b(h.a);
    }
}
