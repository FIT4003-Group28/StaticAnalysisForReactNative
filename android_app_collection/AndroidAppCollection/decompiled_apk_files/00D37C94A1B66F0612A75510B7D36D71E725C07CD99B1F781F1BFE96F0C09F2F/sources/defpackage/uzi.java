package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uzi  reason: default package */
/* loaded from: classes4.dex */
public final class uzi extends vsc implements uue, uvo {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl");
    public static final long b = TimeUnit.HOURS.toMillis(12);
    public final uvm c;
    public final Application d;
    public final axnm e;
    public final uzz f;
    private final uui g;
    private final Executor h;

    public uzi(uvn uvnVar, Context context, uui uuiVar, Executor executor, axnm axnmVar, uzz uzzVar, azqb azqbVar) {
        this.c = uvnVar.a(executor, axnmVar, azqbVar);
        this.h = executor;
        this.d = (Application) context;
        this.e = axnmVar;
        this.f = uzzVar;
        this.g = uuiVar;
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        this.g.a(this);
    }

    @Override // defpackage.uue
    public final void d(Activity activity) {
        this.g.b(this);
        anlz.v(new aniq() { // from class: uzh
            @Override // defpackage.aniq
            public final ankt a() {
                uzi uziVar = uzi.this;
                if (((uzg) uziVar.e.get()).a) {
                    ((amzw) ((amzw) uzi.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 104, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, triggering mechanism didn't match manual capture configuration");
                    return ankq.a;
                } else if (sre.e(uziVar.d)) {
                    uwp.e();
                    uzz uzzVar = uziVar.f;
                    long j = uzi.b;
                    uwp.e();
                    if (sre.e(uzzVar.b)) {
                        long j2 = -1;
                        long j3 = sre.e(uzzVar.b) ? ((SharedPreferences) uzzVar.d.get()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                        long d = uzzVar.c.d();
                        if (d < j3) {
                            if (!((SharedPreferences) uzzVar.d.get()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                                ((amzw) ((amzw) uzz.a.c()).i("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 50, "PersistentRateLimiting.java")).q("Failure storing timestamp to SharedPreferences");
                            }
                            j2 = -1;
                            j3 = -1;
                        }
                        if (j3 != j2 && d <= j3 + j) {
                            ((amzw) ((amzw) uzi.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 114, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, storage metric collection occurred too recently.");
                            return ankq.a;
                        }
                    }
                    if (!uziVar.c.c(null)) {
                        return ankq.a;
                    }
                    PackageStats a2 = uzd.a(uziVar.d);
                    if (a2 == null) {
                        return anlz.p(new IllegalStateException("PackageStats capture failed."));
                    }
                    aopa createBuilder = baax.a.createBuilder();
                    aopa createBuilder2 = baaq.a.createBuilder();
                    long j4 = a2.cacheSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar = (baaq) createBuilder2.instance;
                    baaqVar.b |= 1;
                    baaqVar.c = j4;
                    long j5 = a2.codeSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar2 = (baaq) createBuilder2.instance;
                    baaqVar2.b |= 2;
                    baaqVar2.d = j5;
                    long j6 = a2.dataSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar3 = (baaq) createBuilder2.instance;
                    baaqVar3.b |= 4;
                    baaqVar3.e = j6;
                    long j7 = a2.externalCacheSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar4 = (baaq) createBuilder2.instance;
                    baaqVar4.b |= 8;
                    baaqVar4.f = j7;
                    long j8 = a2.externalCodeSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar5 = (baaq) createBuilder2.instance;
                    baaqVar5.b |= 16;
                    baaqVar5.g = j8;
                    long j9 = a2.externalDataSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar6 = (baaq) createBuilder2.instance;
                    baaqVar6.b |= 32;
                    baaqVar6.h = j9;
                    long j10 = a2.externalMediaSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar7 = (baaq) createBuilder2.instance;
                    baaqVar7.b |= 64;
                    baaqVar7.i = j10;
                    long j11 = a2.externalObbSize;
                    createBuilder2.copyOnWrite();
                    baaq baaqVar8 = (baaq) createBuilder2.instance;
                    baaqVar8.b |= 128;
                    baaqVar8.j = j11;
                    aopa mo52toBuilder = ((baaq) createBuilder2.mo39build()).mo52toBuilder();
                    ampq ampqVar = ((uzg) uziVar.e.get()).b;
                    createBuilder.copyOnWrite();
                    baax baaxVar = (baax) createBuilder.instance;
                    baaq baaqVar9 = (baaq) mo52toBuilder.mo39build();
                    baaqVar9.getClass();
                    baaxVar.j = baaqVar9;
                    baaxVar.b |= 256;
                    uzz uzzVar2 = uziVar.f;
                    if (!sre.e(uzzVar2.b) || !((SharedPreferences) uzzVar2.d.get()).edit().putLong("primes.packageMetric.lastSendTime", uzzVar2.c.d()).commit()) {
                        ((amzw) ((amzw) uzi.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 147, "StorageMetricServiceImpl.java")).q("Failure storing timestamp persistently");
                    }
                    uvm uvmVar = uziVar.c;
                    uvi a3 = uvj.a();
                    a3.d((baax) createBuilder.mo39build());
                    return uvmVar.b(a3.a());
                } else {
                    ((amzw) ((amzw) uzi.a.c()).i("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "lambda$sendInBackgroundInternal$0", 110, "StorageMetricServiceImpl.java")).q("Device locked.");
                    return ankq.a;
                }
            }
        }, this.h);
    }
}
