package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyw  reason: default package */
/* loaded from: classes3.dex */
public abstract class dyw extends dyz implements bpr {
    static {
        uyw uywVar = uyw.a;
        if (uywVar.c == 0) {
            uywVar.c = SystemClock.elapsedRealtime();
            uywVar.m.a = true;
        }
    }

    @Override // defpackage.bpr
    public final bps a() {
        if (!h()) {
            bpq bpqVar = new bpq();
            bpqVar.e = 4;
            return bpqVar.a();
        }
        return (bps) this.d.get();
    }

    protected abstract void f();

    @Override // defpackage.dyz
    protected final void g() {
        f();
        super.onCreate();
    }

    protected final boolean h() {
        String n = etk.n(this);
        if (n != null && !getPackageName().equals(n)) {
            Intent intent = new Intent("com.google.android.youtube.api.service.START");
            intent.setPackage(getApplicationInfo().packageName);
            ResolveInfo resolveService = getPackageManager().resolveService(intent, 0);
            String str = null;
            if (resolveService != null && resolveService.serviceInfo != null) {
                str = resolveService.serviceInfo.processName;
            }
            if (str != null && str.equals(n)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.amhj, android.app.Application
    public final void onCreate() {
        if (!h() || this.a) {
            return;
        }
        this.a = true;
        final uyw uywVar = uyw.a;
        if (uwp.j() && uywVar.c > 0 && uywVar.d == 0) {
            uywVar.d = SystemClock.elapsedRealtime();
            uywVar.m.b = true;
            uwp.h(new Runnable() { // from class: uyn
                @Override // java.lang.Runnable
                public final void run() {
                    uyw uywVar2 = uyw.this;
                    uywVar2.b = uywVar2.n.b != null;
                }
            });
            registerActivityLifecycleCallbacks(new uyu(uywVar, this));
            new Closeable() { // from class: uym
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    uyw uywVar2 = uyw.this;
                    if (uywVar2.e == 0) {
                        uywVar2.e = SystemClock.elapsedRealtime();
                        uywVar2.m.c = true;
                    }
                }
            };
        }
        g();
        long c = this.m.c(ywk.K);
        if (c != 0) {
            if ((2 & c) != 0) {
                azqc.e(new dyx(this, 1));
            } else if ((8 & c) != 0) {
                azqc.e(new dyx(this));
            }
            if ((1 & c) != 0) {
                azqc.f(new dyx(this, 2));
            } else if ((c & 16) != 0) {
                azqc.f(new dyx(this, 3));
            }
        }
        yxe yxeVar = ((efz) this.c.get()).b;
        yxeVar.h(0);
        dzb dzbVar = this.b;
        zep.k("YouTube");
        long c2 = dzbVar.g.c(ywk.E);
        long j = c2 & 128;
        if (j == 0) {
            ((aacu) dzbVar.b.get()).c();
            dzbVar.a();
        }
        ((efl) dzbVar.c.get()).a();
        if (j == 0) {
            dzbVar.a();
        }
        if ((8192 & c2) == 0) {
            dzbVar.e.execute(new dza(dzbVar));
        }
        if (j == 0 && (c2 & 8448) != 8448) {
            dzbVar.a();
        }
        this.b.a();
        long c3 = this.m.c(ywk.E);
        if ((c3 & 128) == 0) {
            ((16 & this.m.c(ywk.C)) != 0 ? this.i : (Executor) this.l.get()).execute(new bhj(3));
        }
        this.h.get();
        if ((c3 & 131072) == 0) {
            dyy dyyVar = (dyy) antz.u(this, dyy.class);
            dyyVar.jj();
            dyyVar.jh();
            dyyVar.jk();
            dyyVar.jn();
            dyyVar.jl();
            dyyVar.jg();
            dyyVar.ji();
            this.b.a();
        }
        ((dzc) (((efz) this.c.get()).a ? this.g : this.f).get()).a();
        yxeVar.d(0);
    }
}
