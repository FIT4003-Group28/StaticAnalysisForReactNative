package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import j$.util.function.Function;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: afau  reason: default package */
/* loaded from: classes.dex */
public final class afau implements afan {
    public volatile pht a;
    public volatile Handler b;
    public final afhl e;
    public final afle f;
    public final afgz g;
    public final Runnable h;
    public final Function i;
    public final aewy l;
    public final afjz m;
    private volatile ScheduledFuture n;
    private ScheduledExecutorService o;
    private final pnp p;
    private final Handler q;
    private final afex r;
    private final afmw s;
    private final ScheduledExecutorService t;
    public final List c = new ArrayList();
    public final Object d = new Object();
    public volatile boolean j = true;
    public volatile afao k = null;

    public afau(pht phtVar, pnp pnpVar, Handler handler, Handler handler2, aewy aewyVar, afex afexVar, afle afleVar, ScheduledExecutorService scheduledExecutorService, Context context, afhj afhjVar, afmw afmwVar, afgz afgzVar, afjz afjzVar, Runnable runnable, Function function) {
        this.a = phtVar;
        this.p = pnpVar;
        this.q = handler;
        this.b = handler2;
        this.l = aewyVar;
        this.r = afexVar;
        this.f = afleVar;
        this.s = afmwVar;
        this.t = scheduledExecutorService;
        this.g = afgzVar;
        this.m = afjzVar;
        this.h = runnable;
        this.i = function;
        this.e = new afhl(context, afhjVar);
    }

    public static String b(afbi afbiVar) {
        String str = afbiVar.a;
        int hashCode = afbiVar.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    public static List d(FormatStreamModel[] formatStreamModelArr) {
        ArrayList arrayList = new ArrayList();
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            aopa createBuilder = ajfw.a.createBuilder();
            int e = formatStreamModel.e();
            createBuilder.copyOnWrite();
            ajfw ajfwVar = (ajfw) createBuilder.instance;
            ajfwVar.b |= 1;
            ajfwVar.c = e;
            String w = formatStreamModel.w();
            createBuilder.copyOnWrite();
            ajfw ajfwVar2 = (ajfw) createBuilder.instance;
            w.getClass();
            ajfwVar2.b |= 4;
            ajfwVar2.e = w;
            long k = formatStreamModel.k();
            createBuilder.copyOnWrite();
            ajfw ajfwVar3 = (ajfw) createBuilder.instance;
            ajfwVar3.b |= 2;
            ajfwVar3.d = k;
            arrayList.add((ajfw) createBuilder.mo39build());
        }
        return arrayList;
    }

    public final pqb a(afbi afbiVar) {
        synchronized (this.d) {
            for (afao afaoVar : this.c) {
                if (afaoVar.c.equals(afbiVar)) {
                    return afaoVar.i;
                }
            }
            return null;
        }
    }

    public final List c(String str) {
        ArrayList arrayList = new ArrayList();
        for (afao afaoVar : this.c) {
            if (afaoVar.c.a.equals(str)) {
                arrayList.add(afaoVar);
            }
        }
        return arrayList;
    }

    public final void e() {
        synchronized (this.d) {
            ScheduledExecutorService scheduledExecutorService = this.o;
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                this.o.shutdown();
            }
        }
    }

    public final void f() {
        synchronized (this.d) {
            ScheduledExecutorService scheduledExecutorService = this.o;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                this.o = newSingleThreadScheduledExecutor;
                newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: afaq
                    @Override // java.lang.Runnable
                    public final void run() {
                        afau afauVar = afau.this;
                        afbi afbiVar = null;
                        afauVar.k(null);
                        try {
                            afhl afhlVar = afauVar.e;
                            afms.d(afhlVar.e == 3);
                            try {
                                try {
                                    adxl adxlVar = (adxl) aopi.parseFrom(adxl.a, afhlVar.d.a.a("fetchLoop", adxk.a.toByteArray()), aoos.b());
                                } catch (aopx e) {
                                    throw new RuntimeException("Unexpected protobuf error", e);
                                }
                            } catch (RuntimeException e2) {
                                throw new afgy(5, "Unexpected error calling into JS.", e2);
                            }
                        } catch (afgy e3) {
                            afao afaoVar = afauVar.k;
                            if (afaoVar != null) {
                                afbiVar = afaoVar.c;
                            }
                            afauVar.g(e3, afbiVar);
                        }
                    }
                }, 0L, 500L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g(afgy afgyVar, afbi afbiVar) {
        int i = afgyVar.b;
        boolean z = true;
        if (i != 6 && i != 5) {
            z = false;
        }
        h(afgyVar.a(), afbiVar, z);
    }

    public final void i(afgy afgyVar, String str) {
        List c = c(str);
        h(afgyVar.a(), c.isEmpty() ? null : ((afao) c.get(0)).c, false);
    }

    public final void j(afbi afbiVar) {
        synchronized (this.d) {
            k(afbiVar);
            n(afbiVar);
            l(afbiVar);
        }
        f();
    }

    public final void k(afbi afbiVar) {
        if (this.n == null) {
            q(afbiVar);
        }
        ScheduledFuture scheduledFuture = this.n;
        if (scheduledFuture.isDone()) {
            return;
        }
        try {
            scheduledFuture.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str = true != (e instanceof TimeoutException) ? "failed." : " timed out.";
            g(new afgy(6, str.length() != 0 ? "Init ".concat(str) : new String("Init "), e), afbiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0231 A[Catch: afgy -> 0x02b7, TryCatch #2 {afgy -> 0x02b7, blocks: (B:8:0x0050, B:17:0x0070, B:23:0x00c1, B:27:0x0106, B:29:0x0231, B:30:0x0237, B:32:0x024c, B:33:0x0252, B:35:0x0268, B:36:0x026e, B:37:0x0279, B:16:0x006e, B:38:0x027a, B:39:0x027f, B:40:0x0287, B:41:0x029f, B:44:0x02a2, B:45:0x02a9, B:47:0x02ab, B:48:0x02b3), top: B:60:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024c A[Catch: afgy -> 0x02b7, TryCatch #2 {afgy -> 0x02b7, blocks: (B:8:0x0050, B:17:0x0070, B:23:0x00c1, B:27:0x0106, B:29:0x0231, B:30:0x0237, B:32:0x024c, B:33:0x0252, B:35:0x0268, B:36:0x026e, B:37:0x0279, B:16:0x006e, B:38:0x027a, B:39:0x027f, B:40:0x0287, B:41:0x029f, B:44:0x02a2, B:45:0x02a9, B:47:0x02ab, B:48:0x02b3), top: B:60:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0268 A[Catch: afgy -> 0x02b7, TryCatch #2 {afgy -> 0x02b7, blocks: (B:8:0x0050, B:17:0x0070, B:23:0x00c1, B:27:0x0106, B:29:0x0231, B:30:0x0237, B:32:0x024c, B:33:0x0252, B:35:0x0268, B:36:0x026e, B:37:0x0279, B:16:0x006e, B:38:0x027a, B:39:0x027f, B:40:0x0287, B:41:0x029f, B:44:0x02a2, B:45:0x02a9, B:47:0x02ab, B:48:0x02b3), top: B:60:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x027a A[Catch: all -> 0x02b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {afgy -> 0x02b7, blocks: (B:8:0x0050, B:17:0x0070, B:23:0x00c1, B:27:0x0106, B:29:0x0231, B:30:0x0237, B:32:0x024c, B:33:0x0252, B:35:0x0268, B:36:0x026e, B:37:0x0279, B:16:0x006e, B:38:0x027a, B:39:0x027f, B:40:0x0287, B:41:0x029f, B:44:0x02a2, B:45:0x02a9, B:47:0x02ab, B:48:0x02b3), top: B:60:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(final defpackage.afbi r22) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afau.l(afbi):void");
    }

    public final void m() {
        synchronized (this.d) {
            afhl afhlVar = this.e;
            afms.d(afhlVar.e == 3);
            synchronized (afhlVar.c) {
                try {
                    try {
                        adza adzaVar = (adza) aopi.parseFrom(adza.a, afhlVar.d.a.a("reset", adyz.a.toByteArray()), aoos.b());
                        for (aksq aksqVar : afhlVar.b) {
                            aksqVar.b();
                        }
                        afhlVar.b.clear();
                    } catch (aopx e) {
                        throw new RuntimeException("Unexpected protobuf error", e);
                    }
                } catch (RuntimeException e2) {
                    throw new afgy(5, "Unexpected error calling into JS.", e2);
                }
            }
            this.c.clear();
            this.k = null;
        }
    }

    public final void n(afbi afbiVar) {
        synchronized (this.d) {
            try {
                m();
            } catch (afgy e) {
                g(e, afbiVar);
            }
        }
    }

    public final void o(long j) {
        this.a.b(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0009, B:9:0x0018, B:11:0x001f, B:14:0x002d, B:19:0x0037, B:20:0x003f, B:23:0x0043, B:29:0x004f, B:30:0x0054, B:32:0x005a, B:35:0x0062, B:36:0x006f, B:38:0x0075, B:40:0x00a5, B:41:0x00ab, B:42:0x00af, B:44:0x00b5, B:45:0x00c3, B:47:0x00db, B:48:0x00e1, B:49:0x00e7, B:50:0x00ef, B:53:0x0109, B:54:0x0110, B:55:0x0111, B:21:0x0040, B:22:0x0042), top: B:64:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afau.p(boolean):void");
    }

    public final void q(final afbi afbiVar) {
        synchronized (this.d) {
            if (this.n != null) {
                return;
            }
            this.n = this.t.schedule(new Runnable() { // from class: afar
                @Override // java.lang.Runnable
                public final void run() {
                    auol auolVar;
                    afau afauVar = afau.this;
                    afbi afbiVar2 = afbiVar;
                    try {
                        afhl afhlVar = afauVar.e;
                        synchronized (afhlVar.c) {
                            if (afhlVar.e == 1) {
                                try {
                                    InputStream open = afhlVar.a.getAssets().open("mediafetch_bundle.js");
                                    try {
                                        String next = new Scanner(open).useDelimiter("\\A").next();
                                        if (open != null) {
                                            open.close();
                                        }
                                        afhlVar.b(next);
                                    } catch (Throwable th) {
                                        if (open != null) {
                                            try {
                                                open.close();
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw new afgy(6, "Failed to read init script.", e);
                                }
                            }
                        }
                        afhl afhlVar2 = afauVar.e;
                        afay afayVar = new afay(afauVar, new afap(afauVar));
                        apyy b = afauVar.m.d.b();
                        if (b != null) {
                            auolVar = b.D;
                            if (auolVar == null) {
                                auolVar = auol.a;
                            }
                        } else {
                            auolVar = auol.a;
                        }
                        boolean z = false;
                        afms.b(afauVar.e.e != 1);
                        aejj aejjVar = new aejj(afauVar.f, afauVar.g, afauVar.i, afauVar.e.a());
                        afbb afbbVar = new afbb();
                        if (afhlVar2.e != 1) {
                            z = true;
                        }
                        afms.d(z);
                        synchronized (afhlVar2.c) {
                            if (afhlVar2.e == 3) {
                                return;
                            }
                            byte[] nativeRetainObjectReference = NativeSupport.nativeRetainObjectReference(afayVar);
                            byte[] nativeRetainObjectReference2 = NativeSupport.nativeRetainObjectReference(aejjVar);
                            byte[] nativeRetainObjectReference3 = NativeSupport.nativeRetainObjectReference(afbbVar);
                            try {
                                afhn afhnVar = afhlVar2.d;
                                aopa createBuilder = adxo.a.createBuilder();
                                aoob x = aoob.x(nativeRetainObjectReference);
                                createBuilder.copyOnWrite();
                                adxo adxoVar = (adxo) createBuilder.instance;
                                adxoVar.b = 1 | adxoVar.b;
                                adxoVar.c = x;
                                createBuilder.copyOnWrite();
                                adxo adxoVar2 = (adxo) createBuilder.instance;
                                auolVar.getClass();
                                adxoVar2.d = auolVar;
                                adxoVar2.b |= 2;
                                aoob x2 = aoob.x(nativeRetainObjectReference2);
                                createBuilder.copyOnWrite();
                                adxo adxoVar3 = (adxo) createBuilder.instance;
                                adxoVar3.b |= 4;
                                adxoVar3.e = x2;
                                aoob x3 = aoob.x(nativeRetainObjectReference3);
                                createBuilder.copyOnWrite();
                                adxo adxoVar4 = (adxo) createBuilder.instance;
                                adxoVar4.b |= 8;
                                adxoVar4.f = x3;
                                try {
                                    adxp adxpVar = (adxp) aopi.parseFrom(adxp.a, afhnVar.a.a("initialize", ((adxo) createBuilder.mo39build()).toByteArray()), aoos.b());
                                    afhlVar2.e = 3;
                                } catch (aopx e2) {
                                    throw new RuntimeException("Unexpected protobuf error", e2);
                                }
                            } catch (RuntimeException e3) {
                                throw new afgy(6, "Failed to initialize JS MFC.", e3);
                            }
                        }
                    } catch (afgy e4) {
                        afauVar.g(e4, afbiVar2);
                    }
                }
            }, 0L, TimeUnit.MILLISECONDS);
        }
    }

    public final void h(final afkn afknVar, final afbi afbiVar, final boolean z) {
        final aeub aeubVar = afbiVar == null ? aeub.a : afbiVar.K;
        if (afknVar.n()) {
            aeubVar.e("smfc", "f");
        }
        this.q.post(new Runnable() { // from class: afas
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                if (r1 != false) goto L19;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r8 = this;
                    afau r0 = defpackage.afau.this
                    boolean r1 = r2
                    afkn r2 = r3
                    aeub r3 = r4
                    afbi r4 = r5
                    boolean r5 = r2.n()
                    r6 = 1
                    if (r5 == 0) goto L1e
                    if (r1 != 0) goto L20
                    afhl r1 = r0.e
                    int r1 = r1.e
                    r5 = 3
                    if (r1 != r5) goto L2e
                    r0.m()     // Catch: defpackage.afgy -> L20
                    goto L2e
                L1e:
                    if (r1 == 0) goto L2e
                L20:
                    afjz r1 = r0.m
                    r1.p = r6
                    r0.e()
                    java.lang.String r1 = "smfc"
                    java.lang.String r5 = "d"
                    r3.e(r1, r5)
                L2e:
                    if (r4 != 0) goto L59
                    r1 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.String r5 = r2.i()
                    r7 = 0
                    r3[r7] = r5
                    java.lang.String r5 = r2.k()
                    java.lang.String r5 = defpackage.amps.d(r5)
                    r3[r6] = r5
                    java.lang.String r5 = "Scripted MediaFetch error with no playback: %s:%s"
                    java.lang.String r3 = java.lang.String.format(r5, r3)
                    r5 = 6
                    defpackage.afus.b(r1, r5, r3)
                    afki r1 = defpackage.afki.MEDIAFETCH
                    java.lang.Object[] r5 = new java.lang.Object[r6]
                    r5[r7] = r3
                    java.lang.String r3 = "%s"
                    defpackage.afkj.b(r1, r3, r5)
                L59:
                    aewy r0 = r0.l
                    if (r4 != 0) goto L60
                    aetv r1 = defpackage.aetv.c
                    goto L62
                L60:
                    aetv r1 = r4.b
                L62:
                    aewx r0 = r0.a
                    r0.u(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.afas.run():void");
            }
        });
    }
}
