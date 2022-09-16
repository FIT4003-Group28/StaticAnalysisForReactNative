package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gmm.majorevents.notification.dismissreceiver.DismissEventNotificationBroadcastReceiver;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pcw  reason: default package */
/* loaded from: classes7.dex */
public final class pcw implements pcx<dlfj> {
    public static final int a = auiy.LOCAL_EVENT.a().intValue();
    private final auhq b;
    private final cjqq c;
    private final auhi d;
    private final ckcw e;
    private final bvjj f;
    private final aknn g;

    static {
        TimeUnit.MINUTES.toMillis(20L);
    }

    public pcw(auhq auhqVar, cjqq cjqqVar, auhi auhiVar, ckcw ckcwVar, bvjj bvjjVar, aknn aknnVar) {
        this.b = auhqVar;
        this.c = cjqqVar;
        this.d = auhiVar;
        this.e = ckcwVar;
        this.f = bvjjVar;
        this.g = aknnVar;
    }

    public static final int e() {
        return dpyv.LOCAL_EVENT.dm;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dlfj> b() {
        return (dssr) dlfj.g.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlfj dlfjVar) {
        return e();
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlfj dlfjVar) {
        ddxx c;
        pcw pcwVar = this;
        dlfj dlfjVar2 = dlfjVar;
        dlfr dlfrVar = dlfjVar2.b;
        if (dlfrVar == null) {
            dlfrVar = dlfr.e;
        }
        cjta b = cjtd.b();
        b.d = dtxw.dG;
        b.g(aknn.b(dlfrVar));
        b.b = aknn.a(dlfrVar);
        cjtd a2 = b.a();
        if (TextUtils.isEmpty(a2.d) || (c = cjrx.c(a2.d)) == null || c.d != ddcu.Jo.a) {
            if ((dlfjVar2.a & 4096) != 0) {
                ((ckco) pcwVar.e.a(ckht.R)).a(dlfjVar2.e);
                if ((dlfjVar2.a & 16384) != 0) {
                    List<String> F = pcwVar.f.F(bvjk.fo, dcdc.e());
                    if (F.contains(dlfjVar2.f)) {
                        return;
                    }
                    int max = Math.max(F.size() - 9, 0);
                    bvjj bvjjVar = pcwVar.f;
                    bvjk bvjkVar = bvjk.fo;
                    dccx F2 = dcdc.F();
                    F2.i(F.subList(max, F.size()));
                    F2.g(dlfjVar2.f);
                    bvjjVar.ah(bvjkVar, F2.f());
                }
                auhi auhiVar = pcwVar.d;
                aknn aknnVar = pcwVar.g;
                btlu n = aknnVar.c.a().n(pauVar.b);
                String packageName = aknnVar.a.getPackageName();
                Intent intent = new Intent();
                StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 26);
                sb.append(packageName);
                sb.append(".");
                sb.append("EventNotificationActivity");
                Intent putExtra = intent.setComponent(new ComponentName(packageName, sb.toString())).putExtra("payload", dlfjVar2.bS()).putExtra("obfuscatedGaiaId", pauVar.b);
                Intent putExtra2 = new Intent(aknnVar.a, DismissEventNotificationBroadcastReceiver.class).setAction("com.google.android.apps.gmm.majorevents.notification.dismissreceiver.DISMISS_EVENT_NOTIFICATION").putExtra("event_notification_id_key", dlfjVar2.e);
                pap papVar = pasVar.b;
                if (papVar == null) {
                    papVar = pap.d;
                }
                dlfr dlfrVar2 = dlfjVar2.b;
                if (dlfrVar2 == null) {
                    dlfrVar2 = dlfr.e;
                }
                dlfo dlfoVar = dlfrVar2.d;
                if (dlfoVar == null) {
                    dlfoVar = dlfo.b;
                }
                int a3 = dlfn.a(dlfoVar.a);
                int i = (a3 == 0 || a3 == 1) ? 2131231734 : 2131231735;
                augc a4 = aknnVar.d.a(aknn.a(dlfrVar2), aknn.b(dlfrVar2), dpyv.LOCAL_EVENT.dm, aknnVar.b.g(dpyv.LOCAL_EVENT.dm));
                int i2 = dlfjVar2.a;
                if ((i2 & 16384) != 0) {
                    a4.e = dlfjVar2.f;
                }
                if ((i2 & 1024) != 0) {
                    a4.P = dlfjVar2.c;
                }
                a4.R = pauVar;
                a4.S = n;
                a4.f = papVar.b;
                a4.g = papVar.c;
                ia iaVar = new ia();
                iaVar.e(papVar.c);
                a4.s = iaVar;
                a4.w(i);
                a4.D(aknnVar.a.getResources().getColor(R.color.quantum_googblue));
                a4.t = dlfrVar2.c;
                a4.C(true);
                a4.E(putExtra, auhw.ACTIVITY);
                a4.m(putExtra2, auhw.BROADCAST);
                auhiVar.j(a4.a());
                return;
            }
            pcwVar = this;
        }
        pcwVar.c.g().d(a2);
        pcwVar.b.f(e());
    }
}
