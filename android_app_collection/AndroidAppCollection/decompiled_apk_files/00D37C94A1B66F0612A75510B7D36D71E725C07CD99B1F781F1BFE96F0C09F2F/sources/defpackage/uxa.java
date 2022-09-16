package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: uxa  reason: default package */
/* loaded from: classes4.dex */
public final class uxa extends uxe implements uue, uvo {
    private static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl");
    private final Application b;
    private final uui c;
    private final uwu d;
    private final ArrayMap e;
    private final uvm f;
    private final azqb g;
    private final azqb h;
    private final uvu i;
    private final amqo j;
    private final azqb k;
    private final uwz l;

    public uxa(uvn uvnVar, Context context, uui uuiVar, axnm axnmVar, uwu uwuVar, azqb azqbVar, azqb azqbVar2, Executor executor, azqb azqbVar3, uvu uvuVar, final azqb azqbVar4, boolean z) {
        ArrayMap arrayMap = new ArrayMap();
        this.e = arrayMap;
        aqxo.y(Build.VERSION.SDK_INT >= 24);
        this.f = uvnVar.a(executor, axnmVar, azqbVar2);
        Application application = (Application) context;
        this.b = application;
        this.c = uuiVar;
        this.g = azqbVar;
        this.d = uwuVar;
        this.h = azqbVar3;
        this.i = uvuVar;
        this.j = aqxo.i(new amqo() { // from class: uww
            @Override // defpackage.amqo
            public final Object get() {
                return uxa.this.e(azqbVar4);
            }
        });
        this.k = azqbVar4;
        this.l = new uwz(new uwx(application, arrayMap));
    }

    @Override // defpackage.uvo, defpackage.ver
    public void a() {
        this.c.a(this.l);
        this.c.a(this.d);
    }

    public ankt c(Activity activity) {
        uxb uxbVar;
        baar baarVar;
        int i;
        uwy a2 = uwy.a(activity);
        vag vagVar = this.f.c;
        int i2 = vagVar.d;
        val valVar = vagVar.b;
        if (i2 != 3 || !valVar.c()) {
            return ankq.a;
        }
        synchronized (this.e) {
            uxbVar = (uxb) this.e.remove(a2);
            if (this.e.isEmpty()) {
                this.l.d();
            }
        }
        if (uxbVar == null) {
            ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 381, "FrameMetricServiceImpl.java")).s("Measurement not found: %s", a2);
            return ankq.a;
        }
        String b = a2.b();
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            for (uxf uxfVar : ((uxg) this.k.get()).c) {
                int b2 = uwv.b(uxfVar.b);
                if (b2 == 0) {
                    b2 = 1;
                }
                switch (b2 - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = uxbVar.h;
                        break;
                    case 3:
                        i = uxbVar.j;
                        break;
                    case 4:
                        i = uxbVar.k;
                        break;
                    case 5:
                        i = uxbVar.l;
                        break;
                    case 6:
                        i = uxbVar.m;
                        break;
                    case 7:
                        i = uxbVar.o;
                        break;
                    default:
                        ((amzw) ((amzw) a.c()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "endTraceSectionAndEmitCounters", 522, "FrameMetricServiceImpl.java")).s("UNKNOWN COUNTER with %s as the name", uxfVar.c);
                        continue;
                }
                Trace.setCounter(uxfVar.c.replace("%EVENT_NAME%", b), i);
            }
            Trace.endAsyncSection(String.format("J<%s>", b), 352691800);
        }
        if (uxbVar.j != 0) {
            if (((Boolean) this.h.get()).booleanValue() && uxbVar.o <= TimeUnit.SECONDS.toMillis(9L) && uxbVar.h != 0) {
                this.i.a((String) this.j.get());
            }
            aopa createBuilder = baax.a.createBuilder();
            long d = uxbVar.d.d();
            long j = uxbVar.e;
            aopa createBuilder2 = baao.a.createBuilder();
            createBuilder2.copyOnWrite();
            baao baaoVar = (baao) createBuilder2.instance;
            baaoVar.b |= 16;
            baaoVar.g = ((int) (d - j)) + 1;
            int i3 = uxbVar.h;
            createBuilder2.copyOnWrite();
            baao baaoVar2 = (baao) createBuilder2.instance;
            baaoVar2.b |= 1;
            baaoVar2.c = i3;
            int i4 = uxbVar.j;
            createBuilder2.copyOnWrite();
            baao baaoVar3 = (baao) createBuilder2.instance;
            baaoVar3.b |= 2;
            baaoVar3.d = i4;
            int i5 = uxbVar.k;
            createBuilder2.copyOnWrite();
            baao baaoVar4 = (baao) createBuilder2.instance;
            baaoVar4.b |= 4;
            baaoVar4.e = i5;
            int i6 = uxbVar.m;
            createBuilder2.copyOnWrite();
            baao baaoVar5 = (baao) createBuilder2.instance;
            baaoVar5.b |= 32;
            baaoVar5.h = i6;
            int i7 = uxbVar.o;
            createBuilder2.copyOnWrite();
            baao baaoVar6 = (baao) createBuilder2.instance;
            baaoVar6.b |= 64;
            baaoVar6.i = i7;
            int i8 = uxbVar.l;
            createBuilder2.copyOnWrite();
            baao baaoVar7 = (baao) createBuilder2.instance;
            baaoVar7.b |= 8;
            baaoVar7.f = i8;
            if (uxbVar.p != Integer.MIN_VALUE) {
                int[] iArr = uxb.c;
                int[] iArr2 = uxbVar.g;
                int i9 = uxbVar.p;
                aopa createBuilder3 = baar.a.createBuilder();
                int i10 = 0;
                while (true) {
                    if (i10 < 52) {
                        if (iArr[i10] <= i9) {
                            int i11 = iArr2[i10];
                            if (i11 > 0 || (i10 > 0 && iArr2[i10 - 1] > 0)) {
                                createBuilder3.cc(i11);
                                createBuilder3.cb(iArr[i10]);
                            }
                            i10++;
                        } else {
                            createBuilder3.cc(0);
                            createBuilder3.cb(i9 + 1);
                            baarVar = (baar) createBuilder3.mo39build();
                        }
                    } else {
                        if (iArr2[51] > 0) {
                            createBuilder3.cb(i9 + 1);
                            createBuilder3.cc(0);
                        }
                        baarVar = (baar) createBuilder3.mo39build();
                    }
                }
                createBuilder2.copyOnWrite();
                baao baaoVar8 = (baao) createBuilder2.instance;
                baarVar.getClass();
                baaoVar8.n = baarVar;
                baaoVar8.b |= 2048;
                int i12 = uxbVar.i;
                createBuilder2.copyOnWrite();
                baao baaoVar9 = (baao) createBuilder2.instance;
                baaoVar9.b |= 512;
                baaoVar9.l = i12;
                int i13 = uxbVar.n;
                createBuilder2.copyOnWrite();
                baao baaoVar10 = (baao) createBuilder2.instance;
                baaoVar10.b |= 1024;
                baaoVar10.m = i13;
            }
            for (int i14 = 0; i14 < 28; i14++) {
                if (uxbVar.f[i14] > 0) {
                    aopa createBuilder4 = baan.a.createBuilder();
                    int i15 = uxbVar.f[i14];
                    createBuilder4.copyOnWrite();
                    baan baanVar = (baan) createBuilder4.instance;
                    baanVar.b |= 1;
                    baanVar.c = i15;
                    int i16 = uxb.b[i14];
                    createBuilder4.copyOnWrite();
                    baan baanVar2 = (baan) createBuilder4.instance;
                    baanVar2.b |= 2;
                    baanVar2.d = i16;
                    int i17 = i14 + 1;
                    if (i17 < 28) {
                        int i18 = uxb.b[i17];
                        createBuilder4.copyOnWrite();
                        baan baanVar3 = (baan) createBuilder4.instance;
                        baanVar3.b |= 4;
                        baanVar3.e = i18 - 1;
                    }
                    createBuilder2.copyOnWrite();
                    baao baaoVar11 = (baao) createBuilder2.instance;
                    baan baanVar4 = (baan) createBuilder4.mo39build();
                    baanVar4.getClass();
                    aopu aopuVar = baaoVar11.j;
                    if (!aopuVar.c()) {
                        baaoVar11.j = aopi.mutableCopy(aopuVar);
                    }
                    baaoVar11.j.add(baanVar4);
                }
            }
            aopa mo52toBuilder = ((baao) createBuilder2.mo39build()).mo52toBuilder();
            int a3 = uwv.a(this.b);
            mo52toBuilder.copyOnWrite();
            baao baaoVar12 = (baao) mo52toBuilder.instance;
            baaoVar12.b |= 256;
            baaoVar12.k = a3;
            createBuilder.copyOnWrite();
            baax baaxVar = (baax) createBuilder.instance;
            baao baaoVar13 = (baao) mo52toBuilder.mo39build();
            baaoVar13.getClass();
            baaxVar.l = baaoVar13;
            baaxVar.b |= 2048;
            uvm uvmVar = this.f;
            uvi a4 = uvj.a();
            a4.d((baax) createBuilder.mo39build());
            a4.b = null;
            a4.c = "Activity";
            a4.a = a2.b();
            a4.b(true);
            return uvmVar.b(a4.a());
        }
        return ankq.a;
    }

    @Override // defpackage.uue
    public void d(Activity activity) {
        synchronized (this.e) {
            this.e.clear();
        }
    }

    public /* synthetic */ String e(azqb azqbVar) {
        return ((uxg) azqbVar.get()).b.replace("%PACKAGE_NAME%", this.b.getPackageName());
    }

    public void f(Activity activity) {
        uwy a2 = uwy.a(activity);
        if (!this.f.c(a2.b())) {
            return;
        }
        synchronized (this.e) {
            if (this.e.size() >= 25) {
                ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 309, "FrameMetricServiceImpl.java")).s("Too many concurrent measurements, ignoring %s", a2);
                return;
            }
            uxb uxbVar = (uxb) this.e.put(a2, (uxb) this.g.get());
            if (uxbVar != null) {
                this.e.put(a2, uxbVar);
                ((amzw) ((amzw) a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 322, "FrameMetricServiceImpl.java")).s("measurement already started: %s", a2);
                return;
            }
            if (this.e.size() == 1) {
                this.l.c();
            }
            if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                Trace.beginAsyncSection(String.format("J<%s>", a2.b()), 352691800);
            }
        }
    }
}
