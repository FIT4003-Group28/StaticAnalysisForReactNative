package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.UUID;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avsm  reason: default package */
/* loaded from: classes.dex */
public class avsm {
    static final IntentFilter a;
    private static final dzsj<String> g;
    public final dxio<akfa> b;
    public final Executor c;
    public final dxio<avpo> d;
    public final bvjj e;
    public boolean f;
    private final Application h;
    private final avsj i;
    private final awfh j;
    private final BroadcastReceiver k;
    private final crzo<avzg> l;
    private boolean m;
    private final avsl n;
    private final btxc o;

    static {
        IntentFilter intentFilter = new IntentFilter();
        a = intentFilter;
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addDataScheme("file");
        g = avsg.a;
    }

    public avsm(Application application, bvjj bvjjVar, dxio dxioVar, avpn avpnVar, bvoh bvohVar, Executor executor, dxio dxioVar2, btxc btxcVar, awfh awfhVar, avzj avzjVar) {
        dzsj<String> dzsjVar = g;
        this.k = new avsi(this);
        this.m = false;
        this.f = false;
        this.n = new avsl(this);
        this.h = application;
        this.b = dxioVar;
        this.c = executor;
        this.d = dxioVar2;
        this.o = btxcVar;
        this.j = awfhVar;
        this.e = bvjjVar;
        avsj avsjVar = new avsj(bvohVar, avzjVar, application, avpnVar, new dbty(this) { // from class: avsc
            private final avsm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                Boolean valueOf;
                avsm avsmVar = this.a;
                synchronized (avsmVar) {
                    valueOf = Boolean.valueOf(avsmVar.f);
                }
                return valueOf;
            }
        }, dzsjVar, awfhVar, bvjjVar);
        this.i = avsjVar;
        this.l = new crzo<>(avsjVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ String e() {
        return UUID.randomUUID().toString();
    }

    private final synchronized boolean f() {
        if (this.j.b()) {
            return this.b.a().l().isDone();
        }
        btvo l = this.o.a().l();
        if (l == null || !l.getOfflineMapsParameters().C) {
            return true;
        }
        return this.b.a().l().isDone();
    }

    private final synchronized void g(avzg avzgVar) {
        if (!avzgVar.a().d() || !this.i.b(avzgVar.a().a())) {
            if (this.m) {
                this.h.unregisterReceiver(this.k);
                this.m = false;
            }
        } else if (!this.m) {
            this.h.registerReceiver(this.k, a);
            this.m = true;
        }
    }

    public final synchronized void a(crzm<Boolean> crzmVar) {
        if (!Boolean.TRUE.equals(crzmVar.l()) || this.f) {
            return;
        }
        this.f = true;
        d();
    }

    public final crzm<avzg> b() {
        return this.l.a;
    }

    public final avzg c() {
        return this.i.a();
    }

    public final synchronized void d() {
        String str;
        avze i;
        if (!f()) {
            return;
        }
        btlu j = this.b.a().j();
        avsj avsjVar = this.i;
        avzb f = avzc.f();
        ((avys) f).a = j;
        f.b(avsjVar.b.b(j));
        f.d(!avsjVar.h.o(bvjk.ei, j, true));
        try {
            bvoh bvohVar = avsjVar.a;
            f.c(bvog.k(avsjVar.c));
        } catch (bvof unused) {
            f.c(false);
        }
        avzc a2 = f.a();
        if (avsjVar.d.a().booleanValue()) {
            i = avze.a;
        } else if (btlu.i(j).equals(btlt.INCOGNITO)) {
            i = avze.h();
        } else if (!avsjVar.b(j)) {
            i = avze.a;
        } else {
            if (!a2.d()) {
                str = null;
            } else if (!a2.c()) {
                i = avze.a;
            } else {
                str = avsjVar.e.e();
                if (str == null) {
                    dzsj<String> dzsjVar = avsjVar.f;
                    str = e();
                }
            }
            awfh awfhVar = avsjVar.g;
            i = avze.i(j, str);
        }
        avzf c = avzg.c();
        c.b(a2);
        c.c(i);
        avzg a3 = c.a();
        this.n.a(a3);
        g(a3);
        this.l.b(a3);
    }
}
