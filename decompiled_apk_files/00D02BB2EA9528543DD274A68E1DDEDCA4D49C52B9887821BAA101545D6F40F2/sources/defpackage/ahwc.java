package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahwc  reason: default package */
/* loaded from: classes2.dex */
public final class ahwc {
    public static final dcqe a = dcqe.c("ahwc");
    static final long b = TimeUnit.SECONDS.toMillis(30);
    public static final String c = String.valueOf(ahwc.class.getName()).concat(".STATUS_CHECK_COMPLETE");
    public static final String d = String.valueOf(ahwc.class.getName()).concat(".request_id");
    public final bvjj e;
    public final cqat f;
    private final Application i;
    private final bvrb j;
    private final btvo k;
    private final BroadcastReceiver l = new ahvy(this);
    public final Map<Integer, ahwa> g = dcjz.d();
    public final dcba<ahvz> h = dcba.a(10);

    public ahwc(Application application, bvjj bvjjVar, bvrb bvrbVar, cqat cqatVar, btvo btvoVar) {
        this.i = application;
        this.e = bvjjVar;
        this.j = bvrbVar;
        this.f = cqatVar;
        this.k = btvoVar;
    }

    public final int a(btlu btluVar) {
        return (!this.e.o(bvjk.gu, btluVar, false) || this.e.x(bvjk.gv, btluVar, Long.MIN_VALUE) + ((long) this.k.getLocationSharingParameters().x) < this.f.b()) ? 0 : 2;
    }

    public final void b(btlu btluVar) {
        c(btluVar, ahvs.a);
    }

    public final void c(final btlu btluVar, final ahwb ahwbVar) {
        final ahwb ahwbVar2 = new ahwb(this, btluVar, ahwbVar) { // from class: ahvt
            private final ahwc a;
            private final btlu b;
            private final ahwb c;

            {
                this.a = this;
                this.b = btluVar;
                this.c = ahwbVar;
            }

            @Override // defpackage.ahwb
            public final void a(int i) {
                ahwc ahwcVar = this.a;
                btlu btluVar2 = this.b;
                ahwb ahwbVar3 = this.c;
                ahwcVar.h.add(new ahva(btluVar2, ahwcVar.f.b(), i));
                ahwbVar3.a(i);
            }
        };
        if (a(btluVar) == 2) {
            this.j.b(new Runnable(ahwbVar2) { // from class: ahvu
                private final ahwb a;

                {
                    this.a = ahwbVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ahwb ahwbVar3 = this.a;
                    dcqe dcqeVar = ahwc.a;
                    ahwbVar3.a(2);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        String t = btluVar.t();
        if (t == null) {
            this.j.b(new Runnable(ahwbVar2) { // from class: ahvv
                private final ahwb a;

                {
                    this.a = ahwbVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ahwb ahwbVar3 = this.a;
                    dcqe dcqeVar = ahwc.a;
                    ahwbVar3.a(0);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        final int e = (int) this.f.e();
        int size = this.g.size();
        if (this.g.put(Integer.valueOf(e), new ahvb(btluVar, ahwbVar2)) != null) {
            this.j.b(new Runnable(ahwbVar2) { // from class: ahvw
                private final ahwb a;

                {
                    this.a = ahwbVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ahwb ahwbVar3 = this.a;
                    dcqe dcqeVar = ahwc.a;
                    ahwbVar3.a(0);
                }
            }, bvrj.UI_THREAD);
            return;
        }
        if (size == 0) {
            this.i.registerReceiver(this.l, new IntentFilter(c));
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.i, e, new Intent(c).setPackage(this.i.getPackageName()).putExtra(d, e), 1073741824);
        try {
            Application application = this.i;
            Intent intent = new Intent("com.google.android.gms.social.location.activity.service.START");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("pending_intent", broadcast);
            ahyc.b(intent, t);
            dbsk.l(intent.hasExtra("pending_intent"));
            application.startService(intent);
        } catch (SecurityException e2) {
            bvoo.h("SecurityException when attempting to talk to GMSCore %s", e2);
        }
        this.j.a(new Runnable(this, e) { // from class: ahvx
            private final ahwc a;
            private final int b;

            {
                this.a = this;
                this.b = e;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahwc ahwcVar = this.a;
                int i = this.b;
                Map<Integer, ahwa> map = ahwcVar.g;
                Integer valueOf = Integer.valueOf(i);
                if (map.containsKey(valueOf)) {
                    ahwa remove = ahwcVar.g.remove(valueOf);
                    dbsk.s(remove);
                    remove.b().a(0);
                    ahwcVar.d();
                }
            }
        }, bvrj.UI_THREAD, b);
    }

    public final void d() {
        if (this.g.size() == 0) {
            this.i.unregisterReceiver(this.l);
        }
    }
}
