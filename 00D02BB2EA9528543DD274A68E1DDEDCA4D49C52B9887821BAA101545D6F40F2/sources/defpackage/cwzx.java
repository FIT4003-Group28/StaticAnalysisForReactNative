package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cwzx  reason: default package */
/* loaded from: classes5.dex */
final class cwzx extends cwzp implements cwwr {
    public final Application a;
    public final cqat b;
    public final dxio<cwze> c;
    public final cwwo d;
    public final cxac e;
    final AtomicReference<cwzf> f = new AtomicReference<>(cwzf.a);
    final ConcurrentHashMap<String, dehn<cwzf>> g = new ConcurrentHashMap<>();
    private final dehq h;
    private final cwuc i;
    private volatile dehn<cwzf> j;
    private final cwzn k;

    public cwzx(cwwp cwwpVar, cqat cqatVar, Context context, cwzn cwznVar, dehq dehqVar, dxio<cwze> dxioVar, cxac cxacVar, cwuc cwucVar, dzsj<cxfg> dzsjVar) {
        this.k = cwznVar;
        this.i = cwucVar;
        this.d = cwwpVar.a(dehqVar, dxioVar, dzsjVar);
        this.a = (Application) context;
        this.h = dehqVar;
        this.b = cqatVar;
        this.c = dxioVar;
        this.e = cxacVar;
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.k.b = cwzn.a;
    }

    @Override // defpackage.cwzp
    public final void a() {
        this.k.b = new cwzm(this) { // from class: cwzq
            private final cwzx a;

            {
                this.a = this;
            }

            @Override // defpackage.cwzm
            public final void a(int i, String str) {
                cwtl.a(this.a.j(null, i, str, null));
            }
        };
    }

    @Override // defpackage.cwzp
    public final dehn<Void> c(final String str) {
        return deha.f(new deff(this, str) { // from class: cwzu
            private final cwzx a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cwzx cwzxVar = this.a;
                String str2 = this.b;
                if (!cwzxVar.d.a()) {
                    return dehk.a;
                }
                if (cwzxVar.g.size() >= 10) {
                    return deha.c();
                }
                dehn<cwzf> h = cwzxVar.h();
                dehn<cwzf> put = cwzxVar.g.put(str2, h);
                if (put != null && h != put) {
                    put.cancel(true);
                }
                return deew.h(h, dbrs.b(null), dege.a);
            }
        }, this.h);
    }

    @Override // defpackage.cwzp
    public final void d(String str) {
        dehn<cwzf> remove = this.g.remove(str);
        if (remove != null) {
            remove.cancel(true);
        }
    }

    @Override // defpackage.cwzp
    public final dehn<Void> e(String str, dzze dzzeVar) {
        if (this.i.b) {
            return deha.c();
        }
        return j(str, 1, null, dzzeVar);
    }

    @Override // defpackage.cwzp
    public final dehn<Void> f(final String str, final dzze dzzeVar) {
        final dehn<cwzf> remove = this.g.remove(str);
        if (remove == null) {
            String valueOf = String.valueOf(str);
            return deha.b(new IllegalStateException(valueOf.length() != 0 ? "Could not find the start memory diff measurement for custom event: ".concat(valueOf) : new String("Could not find the start memory diff measurement for custom event: ")));
        }
        final dehn<cwzf> h = h();
        dehn<Void> a = deha.m(remove, h).a(new deff(this, str, remove, h, dzzeVar) { // from class: cwzs
            private final cwzx a;
            private final String b;
            private final dehn c;
            private final dehn d;
            private final dzze e;

            {
                this.a = this;
                this.b = str;
                this.c = remove;
                this.d = h;
                this.e = dzzeVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cwzx cwzxVar = this.a;
                String str2 = this.b;
                dehn dehnVar = this.c;
                dehn dehnVar2 = this.d;
                dzze dzzeVar2 = this.e;
                dzzl c = cwzf.c(((cwzf) deha.r(dehnVar)).b(), ((cwzf) deha.r(dehnVar2)).b());
                if (c != null) {
                    if (c.c) {
                        c.bF();
                        c.c = false;
                    }
                    dzzn dzznVar = (dzzn) c.b;
                    dzzn dzznVar2 = dzzn.g;
                    dzznVar.d = 6;
                    dzznVar.a |= 4;
                    eacc bZ = eacd.u.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eacd eacdVar = (eacd) bZ.b;
                    dzzn dzznVar3 = (dzzn) c.bK();
                    dzznVar3.getClass();
                    eacdVar.b = dzznVar3;
                    eacdVar.a |= 1;
                    cwwo cwwoVar = cwzxVar.d;
                    cwwi f = cwwj.f();
                    cwwf cwwfVar = (cwwf) f;
                    cwwfVar.a = str2;
                    f.b(true);
                    f.c(bZ.bK());
                    cwwfVar.b = dzzeVar2;
                    return cwwoVar.c(f.a());
                }
                return deha.a(null);
            }
        }, this.h);
        a.Pk(new Runnable(this, str) { // from class: cwzt
            private final cwzx a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwzx cwzxVar = this.a;
                cwzxVar.g.remove(this.b);
            }
        }, dege.a);
        return a;
    }

    @Override // defpackage.cwwr
    public final void g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<cwzf> h() {
        dehn<cwzf> f;
        synchronized (this.f) {
            if (this.j != null) {
                return this.j;
            }
            cwzf cwzfVar = this.f.get();
            if (cwzfVar == cwzf.a || this.b.e() - cwzfVar.b > 1000) {
                if (this.f.get() == cwzfVar) {
                    if (this.i.b) {
                        f = deha.c();
                    } else {
                        f = deha.f(new deff(this) { // from class: cwzr
                            private final cwzx a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.deff
                            public final dehn a() {
                                cwzx cwzxVar = this.a;
                                if (!cwzxVar.d.a()) {
                                    return deha.c();
                                }
                                return deha.a(cwzf.a(cwzxVar.b.e(), cwzxVar.e.c(1, null)));
                            }
                        }, this.h);
                    }
                    this.j = f;
                    deha.q(this.j, new cwzw(this), dege.a);
                    return f;
                }
                return deha.a(this.f.get());
            }
            return deha.a(cwzfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<Void> j(final String str, final int i, final String str2, final dzze dzzeVar) {
        return deha.f(new deff(this, dzzeVar, str, i, str2) { // from class: cwzv
            private final cwzx a;
            private final dzze b;
            private final String c;
            private final String d;
            private final int e;

            {
                this.a = this;
                this.b = dzzeVar;
                this.c = str;
                this.e = i;
                this.d = str2;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cwzg f;
                cwzx cwzxVar = this.a;
                dzze dzzeVar2 = this.b;
                String str3 = this.c;
                int i2 = this.e;
                String str4 = this.d;
                if (!cwzxVar.d.a()) {
                    return dehk.a;
                }
                cwze a = cwzxVar.c.a();
                if (a.e()) {
                    System.gc();
                    System.runFinalization();
                    System.gc();
                }
                if (dzzeVar2 == null && (f = a.d().f()) != null) {
                    try {
                        dzzeVar2 = f.a();
                    } catch (RuntimeException unused) {
                    }
                }
                if (!a.c()) {
                    eacc bZ = eacd.u.bZ();
                    dzzn c = cwzxVar.e.c(i2, str4);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eacd eacdVar = (eacd) bZ.b;
                    c.getClass();
                    eacdVar.b = c;
                    eacdVar.a |= 1;
                    cwwo cwwoVar = cwzxVar.d;
                    cwwi f2 = cwwj.f();
                    cwwf cwwfVar = (cwwf) f2;
                    cwwfVar.a = str3;
                    f2.b(false);
                    f2.c(bZ.bK());
                    cwwfVar.b = dzzeVar2;
                    return cwwoVar.c(f2.a());
                }
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = cwuu.a(cwzxVar.a).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return dehk.a;
                }
                ArrayList arrayList = new ArrayList(runningAppProcesses.size());
                String packageName = cwzxVar.a.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (Build.VERSION.SDK_INT > 22 || runningAppProcessInfo.processName.contains(packageName)) {
                        eacc bZ2 = eacd.u.bZ();
                        dzzn b = cwzxVar.e.b(i2, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str4);
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        eacd eacdVar2 = (eacd) bZ2.b;
                        b.getClass();
                        eacdVar2.b = b;
                        eacdVar2.a |= 1;
                        cwwo cwwoVar2 = cwzxVar.d;
                        cwwi f3 = cwwj.f();
                        cwwf cwwfVar2 = (cwwf) f3;
                        cwwfVar2.a = str3;
                        f3.b(false);
                        f3.c(bZ2.bK());
                        cwwfVar2.b = dzzeVar2;
                        arrayList.add(cwwoVar2.c(f3.a()));
                    }
                }
                return deha.n(arrayList).b(defi.a(), dege.a);
            }
        }, this.h);
    }
}
