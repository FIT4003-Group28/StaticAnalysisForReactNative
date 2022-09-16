package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: uyi  reason: default package */
/* loaded from: classes4.dex */
public final class uyi extends uye implements uue, uvo {
    private static final amzy h = amzy.l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl");
    public final uvm a;
    public final Application b;
    public final axnm c;
    public final axnm e;
    private final ankx i;
    public final Object d = new Object();
    public final ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public uyi(uvn uvnVar, Context context, uui uuiVar, ankx ankxVar, axnm axnmVar, axnm axnmVar2, azqb azqbVar, Executor executor) {
        this.a = uvnVar.a(executor, axnmVar, azqbVar);
        this.b = (Application) context;
        this.i = ankxVar;
        this.c = axnmVar;
        this.e = axnmVar2;
        uuiVar.a(this);
    }

    @Override // defpackage.uvo, defpackage.ver
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.uye
    public final void b(final uyc uycVar) {
        if (!uycVar.q()) {
            ((amzw) ((amzw) h.g()).i("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 87, "NetworkMetricServiceImpl.java")).q("skip logging NetworkEvent due to empty bandwidth/latency data");
            ankt anktVar = ankq.a;
        } else if (!this.a.c(null)) {
            ankt anktVar2 = ankq.a;
        } else {
            this.g.incrementAndGet();
            anlz.v(new aniq() { // from class: uyg
                @Override // defpackage.aniq
                public final ankt a() {
                    uyc[] uycVarArr;
                    ankt b;
                    uyi uyiVar = uyi.this;
                    uyc uycVar2 = uycVar;
                    try {
                        uycVar2.p(uyiVar.b);
                        int i = ((uyb) uyiVar.c.get()).a;
                        synchronized (uyiVar.d) {
                            uyiVar.f.ensureCapacity(i);
                            uyiVar.f.add(uycVar2);
                            if (uyiVar.f.size() >= i) {
                                ArrayList arrayList = uyiVar.f;
                                uycVarArr = (uyc[]) arrayList.toArray(new uyc[arrayList.size()]);
                                uyiVar.f.clear();
                            } else {
                                uycVarArr = null;
                            }
                        }
                        if (uycVarArr == null) {
                            b = ankq.a;
                        } else {
                            uvm uvmVar = uyiVar.a;
                            uvi a = uvj.a();
                            a.d(((uyd) uyiVar.e.get()).d(uycVarArr));
                            b = uvmVar.b(a.a());
                        }
                        return b;
                    } finally {
                        uyiVar.g.decrementAndGet();
                    }
                }
            }, this.i);
        }
    }

    public final ankt c() {
        final uyc[] uycVarArr;
        if (this.g.get() > 0) {
            return anlz.s(new aniq() { // from class: uyf
                @Override // defpackage.aniq
                public final ankt a() {
                    return uyi.this.c();
                }
            }, 1L, TimeUnit.SECONDS, this.i);
        }
        synchronized (this.d) {
            if (!this.f.isEmpty()) {
                ArrayList arrayList = this.f;
                uycVarArr = (uyc[]) arrayList.toArray(new uyc[arrayList.size()]);
                this.f.clear();
            } else {
                uycVarArr = null;
            }
        }
        if (uycVarArr == null) {
            return ankq.a;
        }
        return anlz.v(new aniq() { // from class: uyh
            @Override // defpackage.aniq
            public final ankt a() {
                uyi uyiVar = uyi.this;
                uyc[] uycVarArr2 = uycVarArr;
                uvm uvmVar = uyiVar.a;
                uvi a = uvj.a();
                a.d(((uyd) uyiVar.e.get()).d(uycVarArr2));
                return uvmVar.b(a.a());
            }
        }, this.i);
    }

    @Override // defpackage.uue
    public final void d(Activity activity) {
        c();
    }
}
