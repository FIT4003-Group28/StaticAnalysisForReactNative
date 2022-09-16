package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agep  reason: default package */
/* loaded from: classes.dex */
public abstract class agep implements aget {
    public static final ampg a = new hhf(5);
    public final zdz b;
    public final agev c;
    private final String d;
    private final agcp e;
    private final abaj f;
    private final ScheduledExecutorService g;
    private final agbd h;
    private final Context i;
    private final snc j;
    private final aadd k;
    private final yrj l;
    private final agew m;
    private final azqb n;

    public agep(agcp agcpVar, abaj abajVar, ScheduledExecutorService scheduledExecutorService, zdz zdzVar, agbd agbdVar, Context context, snc sncVar, aadd aaddVar, yrj yrjVar, agew agewVar, azqb azqbVar) {
        agev agevVar = new agev();
        zgh.m("414843287017");
        this.d = "414843287017";
        this.e = agcpVar;
        this.f = abajVar;
        this.g = scheduledExecutorService;
        this.b = zdzVar;
        this.h = agbdVar;
        this.i = context;
        this.j = sncVar;
        this.k = aaddVar;
        this.l = yrjVar;
        this.c = agevVar;
        this.m = agewVar;
        this.n = azqbVar;
    }

    private final void i() {
        int a2 = this.c.a(ageu.FINISHED_REGISTRATION);
        int i = a2 - 1;
        if (a2 != 0) {
            if (i == 1) {
                j();
                return;
            } else if (i != 2) {
                return;
            } else {
                c(agey.UNKNOWN);
                return;
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agep.j():void");
    }

    @Override // defpackage.aget
    public final ampq a() {
        return ampq.j(this.e.s());
    }

    @Override // defpackage.aget
    public final void b(final ages agesVar) {
        this.g.execute(new Runnable() { // from class: ageo
            @Override // java.lang.Runnable
            public final void run() {
                agep agepVar = agep.this;
                ages agesVar2 = agesVar;
                if (agepVar.c.a(ageu.REGISTRATION_FORCED) == 3) {
                    Object apply = agep.a.apply(agesVar2);
                    apply.getClass();
                    agepVar.c((agey) apply);
                }
            }
        });
    }

    public final void c(agey ageyVar) {
        List<NotificationChannel> list;
        azqb azqbVar = this.n;
        String str = ageyVar.j;
        boolean z = false;
        if (agcj.d(this.k, azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).o.get()).b(str);
        }
        boolean g = g();
        ylr.b();
        String str2 = (String) ((ampv) a()).a;
        if (!TextUtils.isEmpty(str2)) {
            zeb a2 = this.b.a();
            abaj abajVar = this.f;
            abai abaiVar = new abai(abajVar.e, abajVar.a.c());
            aopa aopaVar = abaiVar.b;
            aoob z2 = aoob.z(str2);
            aopaVar.copyOnWrite();
            atpe atpeVar = (atpe) aopaVar.instance;
            atpe atpeVar2 = atpe.a;
            atpeVar.b |= 1;
            atpeVar.c = z2;
            String str3 = this.d;
            aopa aopaVar2 = abaiVar.b;
            aopaVar2.copyOnWrite();
            atpe atpeVar3 = (atpe) aopaVar2.instance;
            atpeVar3.b |= 8;
            atpeVar3.f = str3;
            boolean booleanValue = ((Boolean) ylx.f(this.h.c(), true)).booleanValue();
            if (!booleanValue) {
                aopa aopaVar3 = abaiVar.b;
                aopaVar3.copyOnWrite();
                atpe atpeVar4 = (atpe) aopaVar3.instance;
                atpeVar4.b |= 2;
                atpeVar4.d = true;
            }
            boolean e = agel.e(this.i);
            if (!e) {
                aopa aopaVar4 = abaiVar.b;
                aopaVar4.copyOnWrite();
                atpe atpeVar5 = (atpe) aopaVar4.instance;
                atpeVar5.b |= 4;
                atpeVar5.e = true;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                list = ((NotificationManager) this.i.getSystemService("notification")).getNotificationChannels();
                for (NotificationChannel notificationChannel : list) {
                    aopa createBuilder = atpd.a.createBuilder();
                    String id = notificationChannel.getId();
                    createBuilder.copyOnWrite();
                    atpd atpdVar = (atpd) createBuilder.instance;
                    id.getClass();
                    atpdVar.b |= 1;
                    atpdVar.c = id;
                    int importance = notificationChannel.getImportance();
                    createBuilder.copyOnWrite();
                    atpd atpdVar2 = (atpd) createBuilder.instance;
                    atpdVar2.b |= 2;
                    atpdVar2.d = importance;
                    boolean z3 = notificationChannel.getSound() != null;
                    createBuilder.copyOnWrite();
                    atpd atpdVar3 = (atpd) createBuilder.instance;
                    atpdVar3.b |= 4;
                    atpdVar3.e = z3;
                    boolean canShowBadge = notificationChannel.canShowBadge();
                    createBuilder.copyOnWrite();
                    atpd atpdVar4 = (atpd) createBuilder.instance;
                    atpdVar4.b |= 8;
                    atpdVar4.f = canShowBadge;
                    boolean shouldShowLights = notificationChannel.shouldShowLights();
                    createBuilder.copyOnWrite();
                    atpd atpdVar5 = (atpd) createBuilder.instance;
                    atpdVar5.b |= 16;
                    atpdVar5.g = shouldShowLights;
                    boolean canBypassDnd = notificationChannel.canBypassDnd();
                    createBuilder.copyOnWrite();
                    atpd atpdVar6 = (atpd) createBuilder.instance;
                    atpdVar6.b |= 32;
                    atpdVar6.h = canBypassDnd;
                    int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
                    createBuilder.copyOnWrite();
                    atpd atpdVar7 = (atpd) createBuilder.instance;
                    atpdVar7.b |= 64;
                    atpdVar7.i = lockscreenVisibility;
                    abaiVar.a.add((atpd) createBuilder.mo39build());
                }
            } else {
                list = null;
            }
            List<NotificationChannel> list2 = list;
            while (true) {
                try {
                    arxw arxwVar = (arxw) this.f.b.d(abaiVar);
                    agbd agbdVar = this.h;
                    agcp agcpVar = this.e;
                    Context context = this.i;
                    snc sncVar = this.j;
                    boolean d = agbdVar.d(context);
                    ampq h = agcpVar.h();
                    if (!agcpVar.i().h() || !h.h() || ((Boolean) h.c()).booleanValue() != d) {
                        ylx.m(agcpVar.q(sncVar.c()), afsc.i);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(agcpVar.p(e));
                    arrayList.add(agcpVar.n(booleanValue));
                    if (Build.VERSION.SDK_INT >= 26 && list2 != null) {
                        for (NotificationChannel notificationChannel2 : list2) {
                            arrayList.add(agcpVar.o(notificationChannel2.getId(), new agcn(notificationChannel2.getImportance(), notificationChannel2.getSound() == null)));
                        }
                    }
                    try {
                        anlz.j(arrayList).c(anlf.a, anjk.a).get();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (ExecutionException unused2) {
                        zep.b("Failed to store notification settings to disk");
                    }
                    f("INNERTUBE_SUCCESS");
                    z = true;
                    break;
                } catch (aart | IllegalStateException e2) {
                    zep.n("Could not register for notifications with InnerTube: ", e2);
                    if (a2.b()) {
                        f("INNERTUBE_RETRY");
                    } else {
                        f("INNERTUBE_FAILED");
                        z = false;
                        break;
                    }
                }
                f("INNERTUBE_RETRY");
            }
        }
        if (g & z) {
            try {
                ylx.d(this.e.m(new Date().getTime()), adrz.s);
            } catch (Exception e3) {
                zep.d("Failed to store the timestamp", e3);
            }
        }
        i();
    }

    @Override // defpackage.aget
    public final void d() {
        ylr.b();
        if (this.c.a(ageu.REGISTRATION) == 2) {
            j();
        }
    }

    @Override // defpackage.aget
    public final void e() {
        this.g.schedule(new Runnable() { // from class: agen
            @Override // java.lang.Runnable
            public final void run() {
                agep.this.d();
            }
        }, 3L, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        azqb azqbVar = this.n;
        if (agcj.d(this.k, azqbVar)) {
            ((vpg) ((akvm) azqbVar.get()).p.get()).b(str);
        }
    }

    public abstract boolean g();
}
