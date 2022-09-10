package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: PG */
/* renamed from: qrz  reason: default package */
/* loaded from: classes7.dex */
public final class qrz extends BroadcastReceiver {
    public auhi a;
    public auhj b;

    @dzsi
    private final auhk a(Context context, Intent intent) {
        Intent e;
        long longExtra = intent.getLongExtra(qsb.b, 0L);
        if (longExtra == 0) {
            return null;
        }
        qco i = qco.i(intent.getExtras());
        if (i == null || i.c().a() == null || i.c().b() == null || i.c().c() == null || i.k() == null) {
            e = bzgs.e(context, null, Integer.valueOf(bzgs.d(qcl.f().a())), null, null, null, null, null);
        } else {
            String e2 = i.c().e();
            Integer valueOf = Integer.valueOf(bzgs.d(i.c().a()));
            akqi b = i.c().b();
            dbsk.s(b);
            String o = b.o();
            akqq c = i.c().c();
            dbsk.s(c);
            Integer valueOf2 = Integer.valueOf((int) (c.a * 1.0E7d));
            akqq c2 = i.c().c();
            dbsk.s(c2);
            Integer valueOf3 = Integer.valueOf((int) (c2.b * 1.0E7d));
            qcn k = i.k();
            dbsk.s(k);
            e = bzgs.e(context, e2, valueOf, o, valueOf2, valueOf3, k.b(), 1);
        }
        auod k2 = auoe.k(ddcu.p);
        ((auoa) k2).e = 1;
        k2.g("mute");
        k2.j(new Intent(context, qsd.class).setAction(qsa.d), auhw.SERVICE);
        k2.f(false);
        k2.c(0);
        auoe h = k2.h();
        auod k3 = auoe.k(ddcu.p);
        ((auoa) k3).e = 2;
        k3.g("dismiss");
        k3.j(new Intent(context, qsd.class).setAction(qsa.e), auhw.SERVICE);
        k3.f(true);
        k3.c(0);
        auoe h2 = k3.h();
        auhj auhjVar = this.b;
        int i2 = dpyv.TRANSIT_COMMUTE_BOARDS_DEPARTURE_ALARM_NOTIFICATION.dm;
        aujb h3 = this.a.h(dpyv.TRANSIT_COMMUTE_BOARDS_DEPARTURE_ALARM_NOTIFICATION.dm);
        dbsk.s(h3);
        augc b2 = auhjVar.b(i2, h3);
        b2.f = context.getString(pxo.TRANSIT_COMMUTE_BOARD_DEPARTURE_ALARM_NOTIFICATION_TITLE);
        b2.g = context.getString(pxo.TRANSIT_COMMUTE_BOARD_DEPARTURE_ALARM_NOTIFICATION_CONTENT, SimpleDateFormat.getTimeInstance(3).format(new Date(longExtra)));
        b2.E(e, auhw.ACTIVITY);
        b2.w(2131232590);
        b2.B(h);
        b2.B(h2);
        return this.a.j(b2.a());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        auhk a = a(context, intent);
        if (a == null) {
            return;
        }
        Intent putExtra = new Intent(context, qsd.class).setAction(qsa.c).putExtra(qsa.a, a.c).putExtra(qsa.b, a.a.g);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(putExtra);
        } else {
            context.startService(putExtra);
        }
    }
}
