package defpackage;

import android.app.Application;
import android.app.usage.UsageStatsManager;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.apps.gmm.messaging.intent.DismissMessagingNotificationBroadcastReceiver;
import com.google.android.apps.gmm.messaging.intent.MessagingNotificationService;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apxe  reason: default package */
/* loaded from: classes2.dex */
public final class apxe implements apyy {
    public static final /* synthetic */ int j = 0;
    private static final Handler k = new Handler(Looper.getMainLooper());
    public final Application a;
    public final apyv b;
    public final auhq c;
    public final aqbv d;
    public final dxio<aqav> e;
    public final aqgn f;
    public final ckcw g;
    public final cjqy h;
    public final dehq i;
    private final auhi l;
    private final auhj m;
    private final dxio<aqaa> n;
    private final dxio<akfa> o;
    private final dxio<apzy> p;
    private final dxio<btvo> q;
    private final bvjj r;
    private final dxio<afec> s;
    private final aqrr t;
    private final aprj u;

    public apxe(Application application, apyv apyvVar, auhi auhiVar, aqrr aqrrVar, auhj auhjVar, auhq auhqVar, aqbv aqbvVar, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, aprj aprjVar, aqgn aqgnVar, ckcw ckcwVar, cjqy cjqyVar, bvjj bvjjVar, dehq dehqVar, dxio dxioVar6) {
        this.a = application;
        this.b = apyvVar;
        this.l = auhiVar;
        this.t = aqrrVar;
        this.m = auhjVar;
        this.c = auhqVar;
        this.d = aqbvVar;
        this.e = dxioVar;
        this.n = dxioVar2;
        this.o = dxioVar3;
        this.p = dxioVar4;
        this.q = dxioVar5;
        this.u = aprjVar;
        this.f = aqgnVar;
        this.g = ckcwVar;
        this.h = cjqyVar;
        this.r = bvjjVar;
        this.i = dehqVar;
        this.s = dxioVar6;
    }

    public static C0002if m(Notification notification, dbsg<Bitmap> dbsgVar) {
        aki akiVar = new aki();
        akiVar.a = notification.f().g();
        if (dbsgVar.a()) {
            akiVar.b = IconCompat.c(dbsgVar.b());
        }
        return new C0002if(notification.f().h(), Calendar.getInstance().getTimeInMillis(), akiVar.a());
    }

    public static String n(ConversationId conversationId) {
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            return conversationId.e().a();
        }
        String valueOf = String.valueOf(conversationId.d().a());
        return valueOf.length() != 0 ? "group:".concat(valueOf) : new String("group:");
    }

    private final dehn<dbsg<augc>> p(final ctyy ctyyVar, final Notification notification, String str) {
        boolean z;
        augc t;
        ((ckhe) this.g.a(ckgs.I)).a();
        dbsg<btlu> q = q(ctyyVar);
        if (notification.e() != Notification.NotificationType.a) {
            ((ckco) this.g.a(ckgs.C)).a(aqcp.UNSUPPORTED_NOTIFICATION_TYPE.k);
            w(b(ctyyVar, notification, dbsg.i(ddci.UNSUPPORTED_NOTIFICATION_TYPE)));
        } else if (!this.f.a(notification.f().a())) {
            ((ckco) this.g.a(ckgs.C)).a(aqcp.UNSUPPORTED_NOTIFICATION_TYPE.k);
            w(b(ctyyVar, notification, dbsg.i(ddci.UNSUPPORTED_NOTIFICATION_TYPE)));
        } else if (!q.a()) {
            ((ckco) this.g.a(ckgs.C)).a(aqcp.RECEIVER_SIGNED_OUT.k);
            w(b(ctyyVar, notification, dbsg.i(ddci.RECEIVER_SIGNED_OUT)));
        } else {
            z = false;
            ((ckhe) this.g.a(ckgs.I)).c();
            if (!z || !q.a()) {
                return deha.a(dbpy.a);
            }
            btlu b = q.b();
            if (notification.e().ordinal() != 0) {
                return deha.a(dbpy.a);
            }
            MessageReceivedNotification f = notification.f();
            dbsk.s(f);
            if (aqda.d(ctyyVar) == 2) {
                t = t(s(f.a(), f.b()), f.e(), f.f(), dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER);
            } else {
                t = t(s(f.a(), f.b()), f.e(), f.f(), dpyv.BUSINESS_MESSAGE_FROM_MERCHANT);
            }
            final augc augcVar = t;
            augcVar.O = str != null;
            augcVar.S = b;
            augcVar.E(l(notification, ctyyVar), auhw.ACTIVITY);
            augcVar.m(DismissMessagingNotificationBroadcastReceiver.a(this.a, new String[]{f.b()}, n(f.a()), ctyyVar.c().J()), auhw.BROADCAST);
            if (bzrr.a() && this.q.a().getBusinessMessagingParameters().f && !f.i()) {
                ConversationId a = notification.f().a();
                auod l = auoe.l(ddcu.m);
                io ioVar = new io("messagingInlineResponseInputKey");
                ioVar.a = this.a.getString(R.string.MESSAGING_INLINE_REPLY_HINT);
                l.e(ioVar.a());
                l.b(1);
                l.f(false);
                l.c(0);
                l.g(this.a.getString(R.string.MESSAGING_INLINE_REPLY));
                String s = s(a, notification.f().b());
                Intent intent = new Intent();
                Intent putExtra = intent.setClass(this.a, MessagingNotificationService.class).putExtra("isInlineResponseIntent", true).putExtra("NotificationTagExtraKey", s);
                dbsk.s(a);
                putExtra.putExtra("ConversationIdExtraKey", (Parcelable) a).putExtra("NotificationExtraKey", notification);
                l.j(intent, auhw.SERVICE);
                augcVar.B(l.h());
            }
            if (str != null || !this.p.a().f()) {
                return h(augcVar, ctyyVar, notification, str);
            }
            cuss<dbsg<Bitmap>> u = u(ctyyVar, notification.f());
            final deig d = deig.d();
            d.getClass();
            u.k(new cusr(d) { // from class: apwx
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    this.a.j((dbsg) obj);
                }
            });
            final dehn h = deha.h(d, 500L, TimeUnit.MILLISECONDS, this.i);
            return deha.k(h).b(new Callable(this, h, ctyyVar, notification, augcVar) { // from class: apww
                private final apxe a;
                private final dehn b;
                private final ctyy c;
                private final Notification d;
                private final augc e;

                {
                    this.a = this;
                    this.b = h;
                    this.c = ctyyVar;
                    this.d = notification;
                    this.e = augcVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    apxe apxeVar = this.a;
                    dehn dehnVar = this.b;
                    ctyy ctyyVar2 = this.c;
                    Notification notification2 = this.d;
                    augc augcVar2 = this.e;
                    try {
                        dbsg<Bitmap> dbsgVar = (dbsg) deha.r(dehnVar);
                        if (!dbsgVar.a()) {
                            dbsgVar = apxeVar.i();
                        }
                        apxeVar.g(ctyyVar2, notification2, augcVar2, dbsgVar);
                    } catch (ExecutionException unused) {
                        apxeVar.g(ctyyVar2, notification2, augcVar2, apxeVar.i());
                    }
                    return dbsg.i(augcVar2);
                }
            }, this.i);
        }
        z = true;
        ((ckhe) this.g.a(ckgs.I)).c();
        if (!z) {
        }
        return deha.a(dbpy.a);
    }

    private final dbsg<btlu> q(ctyy ctyyVar) {
        List<btlu> t = this.o.a().t();
        if (t == null) {
            return dbpy.a;
        }
        for (btlu btluVar : t) {
            if (aqda.a(ctyyVar, btluVar)) {
                return dbsg.i(btluVar);
            }
        }
        return dbpy.a;
    }

    private final boolean r() {
        return this.q.a().getBusinessMessagingParameters().e;
    }

    private final String s(ConversationId conversationId, String str) {
        String f = f(conversationId);
        return r() ? f : String.format("%s-%s", f, str);
    }

    private final augc t(String str, String str2, String str3, dpyv dpyvVar) {
        auhj auhjVar = this.m;
        ddxw bZ = ddxx.j.bZ();
        int i = ddcu.m.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i;
        String b = cjrx.b(bZ.bK());
        int i2 = dpyvVar.dm;
        augc a = auhjVar.a(null, b, i2, this.l.h(i2));
        a.e = str;
        a.f = str2;
        a.g = str3;
        a.v = 4;
        a.C(true);
        a.H(-1);
        a.s(false);
        a.D(ibl.G().b(this.a));
        a.U = 4;
        a.d = str;
        return a;
    }

    private final cuss<dbsg<Bitmap>> u(ctyy ctyyVar, MessageReceivedNotification messageReceivedNotification) {
        if (messageReceivedNotification.a().c() == ConversationId.IdType.GROUP) {
            btlu f = this.d.b(ctyyVar).f();
            if (f == null || !this.b.b(f)) {
                return new cusy(dbpy.a);
            }
            return cusl.d(this.e.a().c().c(ctyyVar, messageReceivedNotification.a()), new dbrn(this) { // from class: apxc
                private final apxe a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    cufp cufpVar = (cufp) obj;
                    return cufpVar == null ? dbpy.a : this.a.j(cufpVar.d().f());
                }
            });
        }
        return cusl.d(this.e.a().f().c(ctyyVar, messageReceivedNotification.a().e()), new dbrn(this) { // from class: apxd
            private final apxe a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cufj cufjVar = (cufj) obj;
                return cufjVar == null ? dbpy.a : this.a.j(cufjVar.e().f());
            }
        });
    }

    private final void v(ctyy ctyyVar, Notification notification) {
        ((ckco) this.g.a(ckgs.C)).a(aqcp.RECEIVER_SIGNED_OUT.k);
        w(b(ctyyVar, notification, dbsg.i(ddci.RECEIVER_SIGNED_OUT)));
    }

    private final void w(final cjsu cjsuVar) {
        k.post(new Runnable(this, cjsuVar) { // from class: apwt
            private final apxe a;
            private final cjsu b;

            {
                this.a = this;
                this.b = cjsuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apxe apxeVar = this.a;
                apxeVar.h.l(this.b);
            }
        });
    }

    @Override // defpackage.apyy
    public final dehn<dbsg<augj>> a(ctyy ctyyVar, Notification notification, String str) {
        if (!this.p.a().a() || !r()) {
            return deha.a(dbpy.a);
        }
        return deew.h(p(ctyyVar, notification, str), apwq.a, dege.a);
    }

    @Override // defpackage.apyy
    public final cjsu b(ctyy ctyyVar, Notification notification, dbsg<ddci> dbsgVar) {
        MessageReceivedNotification f = notification.f();
        dbsk.s(f);
        ddcg bZ = ddcj.g.bZ();
        String n = n(f.a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddcj ddcjVar = (ddcj) bZ.b;
        n.getClass();
        ddcjVar.a |= 1;
        ddcjVar.b = n;
        String b = f.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddcj ddcjVar2 = (ddcj) bZ.b;
        b.getClass();
        ddcjVar2.a |= 2;
        ddcjVar2.c = b;
        String J = ctyyVar.c().J();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddcj ddcjVar3 = (ddcj) bZ.b;
        J.getClass();
        ddcjVar3.a |= 4;
        ddcjVar3.d = J;
        ddda dddaVar = ddda.aT;
        if (dbsgVar.a()) {
            ddci b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddcj ddcjVar4 = (ddcj) bZ.b;
            ddcjVar4.e = b2.l;
            ddcjVar4.a |= 8;
            dddaVar = ddda.aV;
        }
        cjst d = cjsu.d();
        d.d(dddaVar);
        cjry e = cjrz.e();
        e.b(ddcu.m);
        ddzf bZ2 = ddzg.t.bZ();
        ddcj bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ2.b;
        bK.getClass();
        ddzgVar.o = bK;
        ddzgVar.b |= 32768;
        ((cjrn) e).a = bZ2.bK();
        d.f(e.a());
        return d.e();
    }

    @Override // defpackage.apyy
    public final dehn<dbsg<augc>> c(ctyy ctyyVar, Notification notification) {
        if (!this.p.a().a()) {
            ((ckco) this.g.a(ckgs.C)).a(aqcp.BUSINESS_MESSAGING_NOT_SUPPORTED.k);
            w(b(ctyyVar, notification, dbsg.i(ddci.BUSINESS_MESSAGING_NOT_SUPPORTED)));
            return deha.a(dbpy.a);
        }
        return p(ctyyVar, notification, null);
    }

    @Override // defpackage.apyy
    public final boolean d(Notification notification, ctyy ctyyVar) {
        ConversationId b = this.n.a().b();
        ConversationId a = notification.f().a();
        if (b == null || !b.equals(a)) {
            if (notification.e() != Notification.NotificationType.a || !this.e.a().e().a(notification.f(), ctyyVar)) {
                if (this.s.a().a()) {
                    v(ctyyVar, notification);
                    return true;
                } else if (this.q.a().getBusinessMessagingParameters().w) {
                    String z = this.r.z(bvjk.i, "*");
                    if (!dbsj.d(z) && !"*".equals(z)) {
                        return false;
                    }
                    v(ctyyVar, notification);
                    return true;
                } else if (this.o.a().k() != null) {
                    return false;
                } else {
                    v(ctyyVar, notification);
                    return true;
                }
            }
            ((ckco) this.g.a(ckgs.C)).a(aqcp.MESSAGE_READ.k);
            w(b(ctyyVar, notification, dbsg.i(ddci.MESSAGE_READ)));
            return true;
        }
        ((ckco) this.g.a(ckgs.C)).a(aqcp.CONVERSATION_ON_SCREEN.k);
        w(b(ctyyVar, notification, dbsg.i(ddci.CONVERSATION_ON_SCREEN)));
        return true;
    }

    @Override // defpackage.apyy
    public final boolean e(Bundle bundle) {
        int i;
        dbsg dbsgVar;
        dbsg<ctyy> dbsgVar2;
        dbsg<ctyy> i2;
        dbsg<MessageReceivedNotification> i3;
        int i4;
        ((ckhe) this.g.a(ckgs.G)).a();
        if (!this.p.a().a()) {
            return false;
        }
        if (btlu.i(this.o.a().j()) == btlt.INCOGNITO || this.s.a().a()) {
            ((ckcn) this.g.a(ckgs.M)).a();
            return false;
        }
        csum e = this.e.a().e();
        dbsl dbslVar = new dbsl(this) { // from class: apwv
            private final apxe a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                apxe apxeVar = this.a;
                Pair pair = (Pair) obj;
                Notification notification = (Notification) pair.second;
                if (notification.e() != Notification.NotificationType.a || !apxeVar.f.c(notification.f().a())) {
                    return true;
                }
                try {
                    dbsg<btlu> dbsgVar3 = apxeVar.d.a((ctyy) pair.first).get();
                    if (!dbsgVar3.a()) {
                        return false;
                    }
                    return apxeVar.b.b(dbsgVar3.b());
                } catch (InterruptedException | ExecutionException unused) {
                    return false;
                }
            }
        };
        String string = bundle.getString("google.delivered_priority");
        if (dbsj.d(string)) {
            i = 0;
        } else {
            i = true != "high".equals(string) ? 0 : 131;
            if (true == "normal".equals(string)) {
                i = 132;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                UsageStatsManager usageStatsManager = (UsageStatsManager) ((ctda) e).c.getSystemService("usagestats");
                int i5 = -1;
                if (usageStatsManager != null) {
                    int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                    if ("high".equals(string)) {
                        dcdn<Integer, Integer> dcdnVar = ctda.a;
                        Integer valueOf = Integer.valueOf(appStandbyBucket);
                        if (dcdnVar.containsKey(valueOf)) {
                            i5 = ctda.a.get(valueOf).intValue();
                        }
                    }
                    if ("normal".equals(string)) {
                        dcdn<Integer, Integer> dcdnVar2 = ctda.b;
                        Integer valueOf2 = Integer.valueOf(appStandbyBucket);
                        if (dcdnVar2.containsKey(valueOf2)) {
                            i5 = ctda.b.get(valueOf2).intValue();
                        }
                    }
                }
                if (i5 > 0) {
                    i = i5;
                }
            }
        }
        final ctda ctdaVar = (ctda) e;
        ctdaVar.e(10013, dbpy.a, dbpy.a, i);
        String string2 = bundle.getString("lighter_sys");
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        cted ctedVar = ctdaVar.d;
        int i6 = 8;
        try {
            dxnh dxnhVar = (dxnh) dsqw.cr(dxnh.f, Base64.decode(string2, 8), dsqa.c());
            if (dxnhVar.a == 101) {
                cufq f = ConversationId.f();
                dxnc dxncVar = dxnhVar.c;
                if (dxncVar == null) {
                    dxncVar = dxnc.e;
                }
                f.c(ctus.c(dxncVar));
                dxnr dxnrVar = dxnhVar.a == 101 ? (dxnr) dxnhVar.b : dxnr.i;
                dxnc dxncVar2 = dxnrVar.b;
                if (dxncVar2 == null) {
                    dxncVar2 = dxnc.e;
                }
                ContactId c = ctus.c(dxncVar2);
                if (dxnrVar.c != null) {
                    cufr c2 = ConversationId.GroupId.c();
                    dxnc dxncVar3 = dxnrVar.c;
                    if (dxncVar3 == null) {
                        dxncVar3 = dxnc.e;
                    }
                    c2.c(dxncVar3.b);
                    dxnc dxncVar4 = dxnrVar.c;
                    if (dxncVar4 == null) {
                        dxncVar4 = dxnc.e;
                    }
                    c2.b(dxncVar4.d);
                    f.d(c2.a());
                } else {
                    f.e(c);
                }
                cugv j2 = MessageReceivedNotification.j();
                j2.d(f.a());
                j2.g(dxnrVar.a);
                j2.h(c);
                j2.b(dxnhVar.e);
                j2.c(dxnrVar.e);
                j2.i(dxnrVar.f);
                j2.j(dxnrVar.d);
                j2.f(dxnrVar.g);
                j2.e(dxnrVar.h);
                MessageReceivedNotification a = j2.a();
                cugw g = Notification.g();
                String valueOf3 = String.valueOf(UUID.randomUUID());
                cstd.a();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                sb.append(valueOf3);
                sb.append("-");
                sb.append(currentTimeMillis);
                g.b(sb.toString());
                cstd.a();
                ((ctyo) g).a = Long.valueOf(System.currentTimeMillis());
                g.e(a);
                Map unmodifiableMap = Collections.unmodifiableMap(dxnhVar.d);
                HashMap hashMap = new HashMap();
                for (String str : unmodifiableMap.keySet()) {
                    try {
                        hashMap.put(str, ((dsok) dsqw.cr(dsok.c, Base64.decode((String) unmodifiableMap.get(str), i6), dsqa.c())).bS());
                    } catch (IOException unused) {
                        cstl.a("NotifProtoConverter");
                    }
                    i6 = 8;
                }
                g.f(new HashMap<>(hashMap));
                dbsgVar = dbsg.i(g.a());
            } else {
                cstl.a("NotifProtoConverter");
                dbsgVar = dbpy.a;
            }
        } catch (dsrm e2) {
            if (String.valueOf(e2.getMessage()).length() == 0) {
                new String("Error parsing LighterNotification: ");
            }
            cstl.a("TyMsgClient");
            ctog ctogVar = ((cttz) ctedVar).c;
            ctxm r = ctxn.r();
            r.g(10001);
            ctogVar.b(r.a());
            dbsgVar = dbpy.a;
        }
        if (dbsgVar.a()) {
            final Notification notification = (Notification) dbsgVar.b();
            Notification.NotificationType notificationType = Notification.NotificationType.a;
            if (notification.e().ordinal() != 0) {
                dbsgVar2 = dbpy.a;
            } else {
                MessageReceivedNotification f2 = notification.f();
                dbsg<ctyy> b = ctdaVar.e.b(f2.a().a());
                if (!b.a() || b.b().d() != ctyx.VALID) {
                    ctdaVar.e(10002, dbpy.a, dbsg.i(f2), i);
                    dbsgVar2 = dbpy.a;
                } else {
                    dbsgVar2 = b;
                }
            }
            if (!dbsgVar2.a()) {
                ctdaVar.e(10010, dbpy.a, dbsg.i(notification.f()), i);
            } else {
                ctdaVar.e(10010, dbsgVar2, dbsg.i(notification.f()), i);
                final ctyy b2 = dbsgVar2.b();
                if (!dbslVar.a(Pair.create(b2, notification))) {
                    ctdaVar.e(10076, dbsgVar2, dbsg.i(notification.f()), i);
                } else {
                    if (notification.e().ordinal() == 0) {
                        MessageReceivedNotification f3 = notification.f();
                        if (f3.c().equals(f3.a().a())) {
                            if (String.valueOf(f3.b()).length() == 0) {
                                new String("Server sent notification to same sender: ");
                            }
                            cstl.a("TyNotifController");
                            i2 = dbsg.i(b2);
                            i3 = dbsg.i(f3);
                            i4 = 10008;
                        } else if (Boolean.FALSE.equals(cswe.a(ctdaVar.c).y.f()) && ctdaVar.a(f3, b2)) {
                            i2 = dbsg.i(b2);
                            i3 = dbsg.i(f3);
                            i4 = 10009;
                        }
                    }
                    cswg.b();
                    boolean a2 = cswg.a(ctdaVar.c);
                    if (notification.e().ordinal() == 0) {
                        ctdaVar.e(34, dbsg.i(b2), dbsg.i(notification.f()), i);
                        ctmm c3 = ctmn.c();
                        ((ctmh) c3).a = "send receipt";
                        c3.b(ctmr.a);
                        final ctmn a3 = c3.a();
                        ctdaVar.h.a(new Runnable(ctdaVar, b2, notification, a3) { // from class: ctcz
                            private final ctda a;
                            private final ctyy b;
                            private final Notification c;
                            private final ctmn d;

                            {
                                this.a = ctdaVar;
                                this.b = b2;
                                this.c = notification;
                                this.d = a3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ctda ctdaVar2 = this.a;
                                ctyy ctyyVar = this.b;
                                Notification notification2 = this.c;
                                ctmn ctmnVar = this.d;
                                if (cswe.a(ctdaVar2.c).F.f().booleanValue()) {
                                    ctdaVar2.d.a(ctyyVar, notification2.f().a(), Arrays.asList(notification2.f().b()), ctmnVar);
                                }
                            }
                        });
                        if (a2) {
                            cszw.c(ctdaVar.c, b2, ctdaVar.d, ctdaVar.i, new csuw(), ctdaVar.d(b2), ctdaVar.j, ctdaVar.k, ctdaVar.f, ctdaVar.l, ctdaVar.m, ctdaVar.n).d();
                        }
                        final aqak aqakVar = (aqak) ctdaVar.g;
                        aqakVar.c(b2, new Runnable(aqakVar, b2, notification) { // from class: aqad
                            private final aqak a;
                            private final ctyy b;
                            private final Notification c;

                            {
                                this.a = aqakVar;
                                this.b = b2;
                                this.c = notification;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
                                if (r3.b().b() != false) goto L30;
                             */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r7 = this;
                                    aqak r0 = r7.a
                                    ctyy r1 = r7.b
                                    com.google.android.libraries.messaging.lighter.model.Notification r2 = r7.c
                                    boolean r3 = defpackage.aqda.c(r1)
                                    if (r3 == 0) goto L8a
                                    dxio<aqbw> r3 = r0.p
                                    java.lang.Object r3 = r3.a()
                                    aqbw r3 = (defpackage.aqbw) r3
                                    dxio<aqbv> r4 = r3.d
                                    java.lang.Object r4 = r4.a()
                                    aqbv r4 = (defpackage.aqbv) r4
                                    dbsg r4 = r4.b(r1)
                                    java.lang.Object r4 = r4.f()
                                    btlu r4 = (defpackage.btlu) r4
                                    if (r4 != 0) goto L29
                                    goto L7f
                                L29:
                                    apyv r5 = r3.b
                                    boolean r5 = r5.b(r4)
                                    if (r5 != 0) goto L35
                                    r4.t()
                                    goto L7f
                                L35:
                                    btvo r5 = r3.a
                                    dkht r5 = r5.getBusinessMessagingParameters()
                                    int r5 = r5.S
                                    int r5 = defpackage.dkhs.a(r5)
                                    if (r5 != 0) goto L44
                                    r5 = 1
                                L44:
                                    int r5 = r5 + (-1)
                                    r6 = 2
                                    if (r5 == r6) goto L8a
                                    r6 = 3
                                    if (r5 == r6) goto L7f
                                    com.google.android.libraries.messaging.lighter.model.NotificationMetadata r5 = r2.c()
                                    java.util.HashMap<java.lang.String, byte[]> r5 = r5.a
                                    java.lang.String r6 = "gmbl"
                                    java.lang.Object r5 = r5.get(r6)
                                    byte[] r5 = (byte[]) r5
                                    java.lang.String r5 = defpackage.aqco.b(r5)
                                    if (r5 == 0) goto L7f
                                    dxio<apyu> r3 = r3.c
                                    java.lang.Object r3 = r3.a()
                                    apyu r3 = (defpackage.apyu) r3
                                    dbsg r3 = r3.a(r5, r4)
                                    boolean r4 = r3.a()
                                    if (r4 == 0) goto L7f
                                    java.lang.Object r3 = r3.b()
                                    apzn r3 = (defpackage.apzn) r3
                                    boolean r3 = r3.b()
                                    if (r3 == 0) goto L7f
                                    goto L8a
                                L7f:
                                    android.os.Handler r3 = defpackage.aqak.q
                                    aqae r4 = new aqae
                                    r4.<init>(r0, r1, r2)
                                    r3.post(r4)
                                    goto Lba
                                L8a:
                                    ckcw r3 = r0.l
                                    ckgu r4 = defpackage.ckgs.D
                                    java.lang.Object r3 = r3.a(r4)
                                    ckcn r3 = (defpackage.ckcn) r3
                                    r3.a()
                                    ckcw r3 = r0.l
                                    ckhf r4 = defpackage.ckgs.H
                                    java.lang.Object r3 = r3.a(r4)
                                    ckhe r3 = (defpackage.ckhe) r3
                                    r3.a()
                                    dxio<apyy> r3 = r0.b
                                    java.lang.Object r3 = r3.a()
                                    apyy r3 = (defpackage.apyy) r3
                                    dehn r4 = r3.c(r1, r2)
                                    aqag r5 = new aqag
                                    r5.<init>(r0, r2, r3, r1)
                                    dege r2 = defpackage.dege.a
                                    defpackage.deha.q(r4, r5, r2)
                                Lba:
                                    boolean r2 = defpackage.aqda.c(r1)
                                    if (r2 == 0) goto Lcf
                                    dxio<apzy> r2 = r0.j
                                    java.lang.Object r2 = r2.a()
                                    apzy r2 = (defpackage.apzy) r2
                                    boolean r2 = r2.h()
                                    if (r2 == 0) goto Lcf
                                    return
                                Lcf:
                                    dxio<aqcz> r0 = r0.i
                                    java.lang.Object r0 = r0.a()
                                    aqcz r0 = (defpackage.aqcz) r0
                                    r0.b(r1)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.aqad.run():void");
                            }
                        });
                    }
                }
            }
            return true;
        }
        i2 = dbpy.a;
        i3 = dbpy.a;
        i4 = 10007;
        ctdaVar.e(i4, i2, i3, i);
        return true;
    }

    @Override // defpackage.apyy
    public final String f(ConversationId conversationId) {
        return String.format("%s:%d:%s", conversationId.a().a(), Integer.valueOf(conversationId.c().c), n(conversationId));
    }

    public final void g(ctyy ctyyVar, Notification notification, augc augcVar, dbsg<Bitmap> dbsgVar) {
        if (!dbsgVar.a()) {
            return;
        }
        augcVar.m = dbsgVar.b();
        if (!r()) {
            return;
        }
        aki akiVar = new aki();
        akiVar.a = this.a.getResources().getString(R.string.YOU);
        akiVar.b = IconCompat.c(dbsgVar.b());
        ig igVar = new ig(akiVar.a());
        igVar.h(m(notification, dbsgVar));
        k(ctyyVar, igVar, augcVar, notification);
        augcVar.s = igVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dehn<defpackage.dbsg<defpackage.augc>> h(final defpackage.augc r17, final defpackage.ctyy r18, final com.google.android.libraries.messaging.lighter.model.Notification r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apxe.h(augc, ctyy, com.google.android.libraries.messaging.lighter.model.Notification, java.lang.String):dehn");
    }

    public final dbsg<Bitmap> i() {
        return dbsg.j(BitmapFactory.decodeResource(this.a.getResources(), 2131232062)).h(new dbrn(this) { // from class: apxa
            private final apxe a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c.h((Bitmap) obj);
            }
        });
    }

    public final dbsg<Bitmap> j(Bitmap bitmap) {
        return bitmap == null ? dbpy.a : dbsg.i(this.c.h(bitmap));
    }

    public final void k(ctyy ctyyVar, ig igVar, augc augcVar, Notification notification) {
        dbsg i;
        String e = notification.f().e();
        if (this.f.c(notification.f().a())) {
            String b = aqco.b(notification.c().a.get("gmbl"));
            if (b == null) {
                i = dbpy.a;
            } else {
                dbsg<btlu> q = q(ctyyVar);
                if (!q.a()) {
                    i = dbpy.a;
                } else {
                    dbsg<apsg> b2 = this.u.a.b(b, q.b());
                    i = (!b2.a() || dbsj.d(b2.b().b())) ? dbpy.a : dbsg.i(b2.b().b());
                }
            }
            e = (String) i.c(e);
        }
        if (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 27) {
            augcVar.h = e;
            return;
        }
        igVar.i(true);
        igVar.c = e;
    }

    public final Intent l(Notification notification, ctyy ctyyVar) {
        Intent intent = new Intent();
        Application application = this.a;
        String packageName = application.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 18);
        sb.append(packageName);
        sb.append(".");
        sb.append("MessagingActivity");
        intent.setComponent(new ComponentName(application, sb.toString()));
        intent.setAction("android.intent.action.VIEW").putExtra("ConversationIdExtraKey", (Parcelable) notification.f().a());
        intent.putExtra("MessageIdExtraKey", new String[]{notification.f().b()});
        intent.putExtra("ServerRegistrationIdExtraKey", ctyyVar.c().J());
        return intent;
    }

    @Override // defpackage.apyy
    public final dehn<dbsg<augc>> o(final augc augcVar, final ctyy ctyyVar, final Notification notification) {
        return deha.g(new deff(this, augcVar, ctyyVar, notification) { // from class: apwz
            private final apxe a;
            private final augc b;
            private final ctyy c;
            private final Notification d;

            {
                this.a = this;
                this.b = augcVar;
                this.c = ctyyVar;
                this.d = notification;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return this.a.h(this.b, this.c, this.d, null);
            }
        }, 6L, TimeUnit.SECONDS, this.i);
    }
}
