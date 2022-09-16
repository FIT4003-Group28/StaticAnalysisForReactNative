package com.google.android.libraries.youtube.mdx.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRevokeManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LivingRoomNotificationRevokeManager extends acwv implements afvu, f, ynl {
    static final long a;
    public final yni b;
    public final adjb c;
    public boolean d;
    private final adjg e;
    private final snc f;
    private final boolean g;
    private final NotificationManager h;
    private final acwn i;
    private aypg j;

    static {
        zep.a("MDX.NotificationRevokeManager");
        a = TimeUnit.HOURS.toMillis(3L);
    }

    public LivingRoomNotificationRevokeManager(adjg adjgVar, snc sncVar, Context context, afvt afvtVar, yni yniVar, adjb adjbVar, boolean z, acwn acwnVar, acxu acxuVar) {
        super(acxuVar);
        this.e = adjgVar;
        this.f = sncVar;
        this.b = yniVar;
        this.g = z;
        this.c = adjbVar;
        this.h = (NotificationManager) context.getSystemService("notification");
        this.i = acwnVar;
        this.j = n();
        afvtVar.i(this);
    }

    private final aypg n() {
        return this.i.k().as(new ayqb() { // from class: adjf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager = LivingRoomNotificationRevokeManager.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() == livingRoomNotificationRevokeManager.d) {
                    return;
                }
                livingRoomNotificationRevokeManager.d = bool.booleanValue();
                livingRoomNotificationRevokeManager.rl();
            }
        });
    }

    @Override // defpackage.acxq
    public final ankt a() {
        int i = true != this.g ? 3600 : 15;
        acxs a2 = acxt.a();
        a2.b(!this.d ? false : m());
        a2.c(8);
        a2.d(i);
        a2.e(i);
        return anlz.q(a2.a());
    }

    @Override // defpackage.acxq
    public final String b() {
        return "LivingRoomNotificationRevokeManager";
    }

    @Override // defpackage.acxq
    public final void c(amuk amukVar) {
        if (!m()) {
            return;
        }
        if (!amukVar.isEmpty()) {
            long b = this.e.b();
            if (b == 0 || this.f.c() - b < a) {
                return;
            }
            adjb adjbVar = this.c;
            zep.h(adjb.a, "LR Notification revoked due to TTL.");
            adjbVar.a(atcs.MDX_NOTIFICATION_GEL_ACTION_REVOKED_TTL);
            i();
            return;
        }
        adjb adjbVar2 = this.c;
        zep.h(adjb.a, "LR Notification revoked because no devices were found.");
        adjbVar2.a(atcs.MDX_NOTIFICATION_GEL_ACTION_REVOKED_DEVICE_NOT_FOUND);
        i();
    }

    @Override // defpackage.acxq
    public final void d() {
    }

    @Override // defpackage.acwv, defpackage.acxq
    public final void h() {
    }

    final void i() {
        if (m()) {
            int a2 = this.e.a();
            this.h.cancel(this.e.c(), a2);
            this.e.d();
        }
    }

    @Override // defpackage.afvu
    public final void j() {
        if (!m()) {
            return;
        }
        this.c.c();
        i();
    }

    @Override // defpackage.afvu
    public final void k() {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                if (((adob) obj).a() == null || !m()) {
                    return null;
                }
                adjb adjbVar = this.c;
                zep.h(adjb.a, "LR Notification revoked because an MDx session was started.");
                adjbVar.a(atcs.MDX_NOTIFICATION_GEL_ACTION_REVOKED_STARTED_CASTING);
                i();
                this.b.m(this);
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                if (!m()) {
                    return null;
                }
                this.c.c();
                i();
                this.b.m(this);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{adob.class, afwd.class};
    }

    @Override // defpackage.afvu
    public final void l() {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    final boolean m() {
        int a2 = this.e.a();
        if (a2 == -1) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        StatusBarNotification[] activeNotifications = this.h.getActiveNotifications();
        if (activeNotifications == null) {
            this.e.d();
            return false;
        }
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            String c = this.e.c();
            if (statusBarNotification != null && statusBarNotification.getId() == a2 && statusBarNotification.getTag().equals(c)) {
                return true;
            }
        }
        this.e.d();
        return false;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ayqi.c((AtomicReference) this.j);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (this.j.e()) {
            this.j = n();
        }
    }
}
