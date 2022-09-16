package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: uuv  reason: default package */
/* loaded from: classes4.dex */
public final class uuv extends uut implements utx, uuf, uue, uvo {
    private static final amzy b = amzy.l("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");
    final AtomicBoolean a = new AtomicBoolean();
    private final Context c;
    private final uui d;
    private final ankx e;
    private final uvf f;
    private final uup g;
    private final uvm h;
    private final AtomicBoolean i;

    public uuv(uvn uvnVar, Context context, uui uuiVar, ankx ankxVar, axnm axnmVar, uvf uvfVar, uup uupVar, azqb azqbVar, Executor executor) {
        new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.h = uvnVar.a(executor, axnmVar, azqbVar);
        this.c = context;
        this.d = uuiVar;
        this.e = ankxVar;
        this.f = uvfVar;
        this.g = uupVar;
    }

    private final ankt v(final azyz azyzVar) {
        return anlz.v(new aniq() { // from class: uuu
            @Override // defpackage.aniq
            public final ankt a() {
                return uuv.this.s(azyzVar, null);
            }
        }, this.e);
    }

    @Override // defpackage.uvo, defpackage.ver
    public void a() {
        this.d.a(this);
    }

    @Override // defpackage.utx
    public void b(Activity activity, Bundle bundle) {
        if (!this.i.getAndSet(true)) {
            c(null);
        }
    }

    @Override // defpackage.uuf
    public void c(Activity activity) {
        if (!this.a.get()) {
            u();
        }
    }

    @Override // defpackage.uue
    public void d(Activity activity) {
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02f8, code lost:
        if ((r6 / r8) <= 3.472222222222222E-5d) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: all -> 0x0586, TryCatch #1 {, blocks: (B:8:0x0014, B:14:0x0043, B:17:0x0047, B:20:0x004d, B:27:0x0088, B:68:0x0105, B:30:0x008f, B:32:0x0095, B:34:0x009d, B:37:0x00a2, B:39:0x00a8, B:40:0x00aa, B:42:0x00b1, B:44:0x00ba, B:46:0x00c0, B:48:0x00c9, B:50:0x00cf, B:52:0x00d8, B:54:0x00de, B:56:0x00e7, B:58:0x00ed, B:60:0x00f2, B:62:0x00f6, B:64:0x00fa, B:67:0x0101, B:24:0x0058, B:25:0x006c, B:11:0x002e), top: B:209:0x0014, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ defpackage.ankt s(defpackage.azyz r18, defpackage.utb r19) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuv.s(azyz, utb):ankt");
    }

    public ankt t() {
        if (!sre.e(this.c)) {
            return ankq.a;
        }
        try {
            aqxo.y(this.a.getAndSet(false));
            return v(azyz.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return anlz.p(e);
        }
    }

    public ankt u() {
        if (!sre.e(this.c)) {
            return ankq.a;
        }
        if (this.a.getAndSet(true)) {
            ((amzw) ((amzw) b.g()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 134, "BatteryMetricServiceImpl.java")).q("App is already in the foreground.");
            return anlz.o();
        }
        return v(azyz.BACKGROUND_TO_FOREGROUND);
    }
}
