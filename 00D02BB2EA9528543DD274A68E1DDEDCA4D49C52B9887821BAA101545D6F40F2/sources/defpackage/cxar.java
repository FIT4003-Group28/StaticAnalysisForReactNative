package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cxar  reason: default package */
/* loaded from: classes5.dex */
final class cxar extends cxan implements cwqx, cwwr {
    public final cwwo a;
    public final Application b;
    public final dxio<cxai> c;
    public final cxak e;
    private final cwrb h;
    private final dehq i;
    public final Object d = new Object();
    public final ArrayList<cxaj> f = new ArrayList<>(0);
    public final AtomicInteger g = new AtomicInteger();

    public cxar(cwwp cwwpVar, Context context, cwrb cwrbVar, dehq dehqVar, dxio<cxai> dxioVar, cxak cxakVar, dzsj<cxfg> dzsjVar, Executor executor) {
        this.a = cwwpVar.a(executor, dxioVar, dzsjVar);
        this.b = (Application) context;
        this.h = cwrbVar;
        this.i = dehqVar;
        this.c = dxioVar;
        this.e = cxakVar;
        cwrbVar.a(this);
    }

    @Override // defpackage.cwud
    public final void Sz() {
        this.h.b(this);
        synchronized (this.d) {
            this.f.clear();
        }
    }

    @Override // defpackage.cwqx
    public final void b(Activity activity) {
        cwtl.a(c());
    }

    public final dehn<Void> c() {
        final cxaj[] cxajVarArr;
        if (this.g.get() > 0) {
            return deha.g(new deff(this) { // from class: cxap
                private final cxar a;

                {
                    this.a = this;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    return this.a.c();
                }
            }, 1L, TimeUnit.SECONDS, this.i);
        }
        synchronized (this.d) {
            if (!this.f.isEmpty()) {
                ArrayList<cxaj> arrayList = this.f;
                cxajVarArr = (cxaj[]) arrayList.toArray(new cxaj[arrayList.size()]);
                this.f.clear();
            } else {
                cxajVarArr = null;
            }
        }
        if (cxajVarArr == null) {
            return dehk.a;
        }
        return deha.f(new deff(this, cxajVarArr) { // from class: cxaq
            private final cxar a;
            private final cxaj[] b;

            {
                this.a = this;
                this.b = cxajVarArr;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cxar cxarVar = this.a;
                cxaj[] cxajVarArr2 = this.b;
                cwwo cwwoVar = cxarVar.a;
                cwwi f = cwwj.f();
                f.c(cxarVar.e.c(cxajVarArr2));
                return cwwoVar.c(f.a());
            }
        }, this.i);
    }

    @Override // defpackage.cwwr
    public final void g() {
    }

    @Override // defpackage.cxan
    public final dehn<Void> a(final cxaj cxajVar) {
        int i;
        if (cxajVar.b > 0 || cxajVar.c > 0 || cxajVar.d > 0 || cxajVar.e > 0 || cxajVar.r > 0 || (i = cxajVar.w) == 3 || i == 4 || cxajVar.u > 0) {
            if (!this.a.a()) {
                return dehk.a;
            }
            this.g.incrementAndGet();
            return deha.f(new deff(this, cxajVar) { // from class: cxao
                private final cxar a;
                private final cxaj b;

                {
                    this.a = this;
                    this.b = cxajVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    cxaj[] cxajVarArr;
                    dehn c;
                    NetworkInfo activeNetworkInfo;
                    cxar cxarVar = this.a;
                    cxaj cxajVar2 = this.b;
                    try {
                        Application application = cxarVar.b;
                        cxajVar2.m = cwuv.a(application);
                        int i2 = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                i2 = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException unused) {
                        }
                        int a = dzzs.a(i2);
                        if (a == 0) {
                            a = 1;
                        }
                        cxajVar2.v = a;
                        int c2 = cxarVar.c.a().c();
                        synchronized (cxarVar.d) {
                            cxarVar.f.ensureCapacity(c2);
                            cxarVar.f.add(cxajVar2);
                            if (cxarVar.f.size() >= c2) {
                                ArrayList<cxaj> arrayList = cxarVar.f;
                                cxajVarArr = (cxaj[]) arrayList.toArray(new cxaj[arrayList.size()]);
                                cxarVar.f.clear();
                            } else {
                                cxajVarArr = null;
                            }
                        }
                        if (cxajVarArr == null) {
                            c = dehk.a;
                        } else {
                            cwwo cwwoVar = cxarVar.a;
                            cwwi f = cwwj.f();
                            f.c(cxarVar.e.c(cxajVarArr));
                            c = cwwoVar.c(f.a());
                        }
                        return c;
                    } finally {
                        cxarVar.g.decrementAndGet();
                    }
                }
            }, this.i);
        }
        return dehk.a;
    }
}
