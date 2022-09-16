package defpackage;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aukv  reason: default package */
/* loaded from: classes2.dex */
public final class aukv implements cvtk {
    private static final dcqe a = dcqe.c("aukv");
    private final dxio<aulh> b;
    private final dxio<auso> c;
    private final auhz d;
    private final ault e;
    private final Application f;

    public aukv(dxio<aulh> dxioVar, dxio<auso> dxioVar2, auhz auhzVar, ault aultVar, Application application) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = auhzVar;
        this.e = aultVar;
        this.f = application;
    }

    private final dbsg<aule> h(@dzsi cvkc cvkcVar, List<cvkj> list) {
        if (list.isEmpty()) {
            return dbpy.a;
        }
        return this.b.a().a(cvkcVar, list.get(0));
    }

    private final void i(aujb aujbVar, aulg aulgVar, dbsg<Bundle> dbsgVar) {
        cjrc cjrcVar;
        cjtd c = aulgVar.e().c();
        Intent c2 = this.d.c(aulgVar.b().f(), aulgVar.a().f(), aulgVar.c());
        if (dbsgVar.a()) {
            Bundle extras = c2.getExtras();
            if (extras == null) {
                c2.putExtras(dbsgVar.b());
            } else {
                extras.putAll(dbsgVar.b());
                c2.putExtras(extras);
            }
        }
        cjsa cjsaVar = c.m;
        String str = null;
        if (cjsaVar != null && (cjrcVar = cjsaVar.a) != null) {
            str = cjrcVar.a;
        }
        auhw c3 = aulgVar.d().c(auhw.ACTIVITY);
        auhz auhzVar = this.d;
        auhy h = NotificationIntentConverter$NotificationIntent.h();
        auht auhtVar = (auht) h;
        auhtVar.a = dbsg.i(Integer.valueOf(aujbVar.a));
        h.c(c3);
        h.b(c2);
        auhtVar.b = dbsg.j(c.d);
        auhtVar.c = dbsg.j(c.e);
        auhtVar.d = dbsg.j(str);
        PendingIntent d = auhzVar.d(h.a());
        if (c3 == auhw.ACTIVITY) {
            this.f.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        if (d == null) {
            try {
                bvoo.h("pendingIntent was null when it shouldn't be.", new Object[0]);
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        dbsk.s(d);
        d.send();
    }

    private final void j(aulc aulcVar, NotificationLogger$IntentMetadata notificationLogger$IntentMetadata) {
        this.c.a().c(notificationLogger$IntentMetadata, aulcVar.a(), aulcVar.b().f(), null, aulcVar.c(), aulcVar.e().f());
    }

    @Override // defpackage.cvtk
    public final void a(@dzsi cvkc cvkcVar, List<cvkj> list, Notification notification) {
        dbsg<aule> h = h(cvkcVar, list);
        if (h.a()) {
            aule b = h.b();
            int i = notification.flags;
            cjql e = e(b);
            cjsh cjshVar = e != null ? e.b : null;
            aulc c = b.c();
            this.c.a().b(c.a(), c.b().f(), cjshVar, c.c(), i);
        }
    }

    @Override // defpackage.cvtk
    public final void b(@dzsi cvkc cvkcVar, List<cvkj> list) {
        dbsg<Bundle> i;
        dbsg<aule> h = h(cvkcVar, list);
        if (h.a()) {
            aule b = h.b();
            aulu e = this.e.e(auuh.c(b.c().b().f(), b.c().a()));
            j(b.c(), NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_CONTENT_CLICK, b.c().d()));
            if (!b.d().a()) {
                return;
            }
            if (e == null) {
                i = dbpy.a;
            } else {
                Bundle bundle = new Bundle();
                if (!e.h().isEmpty()) {
                    bundle.putParcelableArrayList("multiple_streams", new ArrayList<>(dcbg.b(e.h()).s(aulq.a).z()));
                }
                i = dbsg.i(bundle);
            }
            i(b.a(), b.d().b(), i);
        }
    }

    @Override // defpackage.cvtk
    public final void c(@dzsi cvkc cvkcVar, List<cvkj> list) {
        dbsg<aule> h = h(cvkcVar, list);
        if (h.a()) {
            j(h.b().c(), NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_SWIPE, true));
        }
    }

    @Override // defpackage.cvtk
    public final void d(@dzsi cvkc cvkcVar, cvkj cvkjVar, final dsbi dsbiVar) {
        dbsg<aule> h = h(cvkcVar, dcdc.f(cvkjVar));
        if (!h.a()) {
            return;
        }
        aule b = h.b();
        dbsg m = dcft.m(b.e(), new dbsl(dsbiVar) { // from class: aukt
            private final dsbi a;

            {
                this.a = dsbiVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                dsbi dsbiVar2 = this.a;
                return dbsd.a(((aulf) obj).b(), dsbiVar2.b == 4 ? (String) dsbiVar2.c : "");
            }
        });
        if (!m.a()) {
            return;
        }
        aulg c = ((aulf) m.b()).c();
        j(c.e(), NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_ACTION_CLICK, c.e().d()));
        i(b.a(), c, dbpy.a);
    }

    @dzsi
    public final cjql e(aule auleVar) {
        dcdc<cjtd> e;
        boolean z = false;
        if (auleVar.g().a() && auleVar.g().b().d()) {
            z = true;
        }
        if (auleVar.g().a()) {
            e = auleVar.g().b().g();
        } else {
            e = dcdc.e();
        }
        aulc c = auleVar.c();
        return this.c.a().a(c.a(), c.b().f(), c.c(), dcbg.d(dcft.o(dcft.o(auleVar.e(), auld.a), auku.a), e), c.e().f(), !z);
    }

    @Override // defpackage.cvtk
    public final void f() {
    }

    @Override // defpackage.cvtk
    public final void g() {
    }
}
