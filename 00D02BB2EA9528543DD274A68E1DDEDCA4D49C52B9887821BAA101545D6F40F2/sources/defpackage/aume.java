package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gmm.notification.feedback.NotificationFeedbackActivity;
import com.google.android.apps.gmm.notification.feedback.NotificationInlineFeedbackBroadcastReceiver;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aume  reason: default package */
/* loaded from: classes2.dex */
public final class aume implements aump {
    private final Application a;
    private final btvo b;
    private final cqat c;
    private final aunp d;
    private final ckcw e;

    public aume(Application application, btvo btvoVar, cqat cqatVar, aunp aunpVar, ckcw ckcwVar) {
        this.a = application;
        this.b = btvoVar;
        this.c = cqatVar;
        this.d = aunpVar;
        this.e = ckcwVar;
    }

    private static boolean g(dbsg<dkmm> dbsgVar) {
        return ((Boolean) dbsgVar.h(aumc.a).c(false)).booleanValue();
    }

    private static boolean h(dbsg<dkmm> dbsgVar) {
        return ((Boolean) dbsgVar.h(aumd.a).c(false)).booleanValue();
    }

    private final auni i(int i, @dzsi String str) {
        aunh bZ = auni.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        auni auniVar = (auni) bZ.b;
        auniVar.a |= 1;
        auniVar.b = i;
        long b = this.c.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        auni auniVar2 = (auni) bZ.b;
        int i2 = auniVar2.a | 4;
        auniVar2.a = i2;
        auniVar2.d = b;
        if (str != null) {
            str.getClass();
            auniVar2.a = i2 | 2;
            auniVar2.c = str;
        }
        return bZ.bK();
    }

    @Override // defpackage.aump
    @dzsi
    public final aumo a(int i, @dzsi String str) {
        auni i2 = i(i, str);
        for (dkqb dkqbVar : this.b.getNotificationsParameters().h) {
            dpyv b = dpyv.b(dkqbVar.a);
            if (b == null) {
                b = dpyv.UNKNOWN_NOTIFICATION_ID;
            }
            if (b.dm == i) {
                Long c = this.d.c(i2, 3);
                if (c != null && this.c.b() - c.longValue() < TimeUnit.SECONDS.toMillis(dkqbVar.c)) {
                    return null;
                }
                aumn h = aumo.h();
                h.e(2131232675);
                dkps dkpsVar = dkqbVar.b;
                if (dkpsVar == null) {
                    dkpsVar = dkps.k;
                }
                h.b(dkpsVar.c);
                Application application = this.a;
                dkps dkpsVar2 = dkqbVar.b;
                if (dkpsVar2 == null) {
                    dkpsVar2 = dkps.k;
                }
                Intent intent = new Intent();
                intent.putExtra("survey_key", dkpsVar2.bS());
                intent.putExtra("notification_instance_key", i2.bS());
                intent.setClass(application, NotificationFeedbackActivity.class);
                intent.setFlags(536870912);
                aumk aumkVar = (aumk) h;
                aumkVar.a = intent;
                Application application2 = this.a;
                dkps dkpsVar3 = dkqbVar.b;
                if (dkpsVar3 == null) {
                    dkpsVar3 = dkps.k;
                }
                dplu bZ = dplx.g.bZ();
                dplv bZ2 = dplw.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dplw dplwVar = (dplw) bZ2.b;
                dplwVar.a |= 1;
                dplwVar.d = "survey_key";
                dspd bR = dkpsVar3.bR();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dplw dplwVar2 = (dplw) bZ2.b;
                bR.getClass();
                dplwVar2.b = 3;
                dplwVar2.c = bR;
                bZ.a(bZ2);
                dplv bZ3 = dplw.e.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dplw dplwVar3 = (dplw) bZ3.b;
                dplwVar3.a |= 1;
                dplwVar3.d = "notification_instance_key";
                dspd bR2 = i2.bR();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dplw dplwVar4 = (dplw) bZ3.b;
                bR2.getClass();
                dplwVar4.b = 3;
                dplwVar4.c = bR2;
                bZ.a(bZ3);
                String flattenToString = new ComponentName(application2, NotificationFeedbackActivity.class).flattenToString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dplx dplxVar = (dplx) bZ.b;
                flattenToString.getClass();
                int i3 = dplxVar.a | 4;
                dplxVar.a = i3;
                dplxVar.d = flattenToString;
                dplxVar.a = i3 | 8;
                dplxVar.e = 536870912;
                h.c(bZ.bK());
                aumkVar.b = dbsg.i(ddcu.ay);
                return h.a();
            }
        }
        return null;
    }

    @Override // defpackage.aump
    @dzsi
    public final aumq b(aujb aujbVar, @dzsi String str, @dzsi String str2, @dzsi ddcu ddcuVar) {
        eaow d;
        ddoz ddozVar;
        auni i = i(aujbVar.a, str);
        dbsg<dkmm> u = aujbVar.u(this.b);
        if (u.a()) {
            if (!u.a() || (u.b().a & 4) == 0) {
                dkmn dkmnVar = this.b.getNotificationsParameters().i;
                if (dkmnVar == null) {
                    dkmnVar = dkmn.d;
                }
                d = eaow.d(dkmnVar.b);
            } else {
                d = eaow.d(u.b().d);
            }
            Long c = this.d.c(i, 2);
            if (c != null && new eapd(c).e(d).w(new eapd(this.c.b()))) {
                return null;
            }
            if (u.b().e) {
                ddozVar = ddoz.PRODUCTION;
            } else {
                ddozVar = ddoz.EXPERIMENT;
            }
            cjtd f = f(ddozVar);
            Intent a = NotificationInlineFeedbackBroadcastReceiver.a(this.a, i, 2);
            Intent a2 = NotificationInlineFeedbackBroadcastReceiver.a(this.a, i, 3);
            aumn h = aumo.h();
            h.e(2131232945);
            h.b(this.a.getResources().getString(R.string.NOTIFICATION_INLINE_FEEDBACK_USEFUL));
            aumk aumkVar = (aumk) h;
            aumkVar.a = a;
            h.c(NotificationInlineFeedbackBroadcastReceiver.b(this.a, i, 2));
            h.d(f);
            aumkVar.c = dbsg.j(str2);
            aumkVar.b = dbsg.j(ddcuVar);
            aumo a3 = h.a();
            aumn h2 = aumo.h();
            h2.e(2131232940);
            h2.b(this.a.getResources().getString(R.string.NOTIFICATION_INLINE_FEEDBACK_NOT_USEFUL));
            aumk aumkVar2 = (aumk) h2;
            aumkVar2.a = a2;
            h2.c(NotificationInlineFeedbackBroadcastReceiver.b(this.a, i, 3));
            h2.d(f);
            aumkVar2.c = dbsg.j(str2);
            aumkVar2.b = dbsg.j(ddcuVar);
            return new aumm(a3, h2.a());
        }
        return null;
    }

    @Override // defpackage.aump
    public final boolean c(aujb aujbVar, int i) {
        dbsk.l(true);
        dbsg<dkmm> u = aujbVar.u(this.b);
        if (!g(u) && i != 0 && !h(u)) {
            if (Build.VERSION.SDK_INT >= 24 && i <= 1) {
                return true;
            }
            ((ckco) this.e.a(ckht.aZ)).a(aujbVar.a);
            return false;
        }
        return true;
    }

    @Override // defpackage.aump
    public final int d(aujb aujbVar, int i) {
        if (i == 0) {
            return 0;
        }
        dbsg<dkmm> u = aujbVar.u(this.b);
        if (g(u)) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT >= 24 ? 1 : 0;
        if (h(u)) {
            return i - i2;
        }
        return 0;
    }

    @Override // defpackage.aump
    public final dbsg<ddoz> e(aujb aujbVar) {
        dbsg<dkmm> u = aujbVar.u(this.b);
        if (!u.a()) {
            return dbpy.a;
        }
        return dbsg.i(u.b().e ? ddoz.PRODUCTION : ddoz.EXPERIMENT);
    }

    @Override // defpackage.aump
    public final cjtd f(ddoz ddozVar) {
        cjta b = cjtd.b();
        ddox bZ = ddpa.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddpa ddpaVar = (ddpa) bZ.b;
        ddpaVar.c = ddozVar.d;
        ddpaVar.a |= 2;
        b.t(bZ.bK());
        return b.d();
    }
}
