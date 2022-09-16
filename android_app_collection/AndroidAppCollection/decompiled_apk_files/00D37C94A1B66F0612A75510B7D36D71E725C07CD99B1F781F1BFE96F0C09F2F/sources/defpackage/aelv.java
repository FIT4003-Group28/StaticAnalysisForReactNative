package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: aelv  reason: default package */
/* loaded from: classes.dex */
public final class aelv implements ati {
    private static final asy f = new asy(Uri.EMPTY);
    public final ati b;
    public final aflm c;
    public final ath d;
    public volatile ati e;
    private final atd g;
    private final int h;
    private final ArrayList i;
    private final ExecutorCompletionService j;
    private ati k;
    private Future l;
    private Future m;
    private asy n;
    private asy o;
    private asy p;
    private final aelu q;

    public aelv(ati atiVar, atd atdVar, aelu aeluVar, Executor executor, aflm aflmVar, int i) {
        afms.a(atiVar);
        this.b = atiVar;
        afms.a(atdVar);
        this.g = atdVar;
        afms.a(aeluVar);
        this.q = aeluVar;
        afms.a(executor);
        this.j = new ExecutorCompletionService(executor);
        afms.a(aflmVar);
        this.c = aflmVar;
        this.h = i < 0 ? 2000 : i;
        this.d = new ath();
        this.i = new ArrayList();
        this.p = f;
    }

    private final Future d(final ati atiVar, final asy asyVar) {
        try {
            return this.j.submit(new Callable() { // from class: aelt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aelv aelvVar = aelv.this;
                    ati atiVar2 = atiVar;
                    asy asyVar2 = asyVar;
                    try {
                        if (aelvVar.b == atiVar2) {
                            aelvVar.c.R();
                        } else {
                            aelvVar.c.ad();
                        }
                        atiVar2.l();
                        for (Map.Entry entry : aelvVar.d.a().entrySet()) {
                            atiVar2.m((String) entry.getKey(), (String) entry.getValue());
                        }
                        long h = atiVar2.h(asyVar2);
                        aelvVar.c(atiVar2);
                        Long valueOf = Long.valueOf(h);
                        if (aelvVar.e != atiVar2) {
                            pxi.I(atiVar2);
                        }
                        return valueOf;
                    } catch (Throwable th) {
                        if (aelvVar.e != atiVar2) {
                            pxi.I(atiVar2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            throw new ate("Unable to submit task for execution", asyVar, 1);
        }
    }

    private final void e() {
        Future future = this.l;
        if (future != null) {
            future.cancel(true);
            this.l = null;
        }
        Future future2 = this.m;
        if (future2 != null) {
            future2.cancel(true);
            this.m = null;
        }
    }

    private final void f(Future future) {
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new ate("Execution interrupted.", this.p, 3);
            } catch (ExecutionException unused2) {
            }
        }
    }

    @Override // defpackage.ati, defpackage.asv
    public final Map a() {
        return this.e == null ? amyc.b : this.e.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        this.b.b(atkVar);
        ati atiVar = this.k;
        if (atiVar != null) {
            atiVar.b(atkVar);
        }
        this.i.add(atkVar);
    }

    public final synchronized void c(ati atiVar) {
        if (this.e == null) {
            this.e = atiVar;
        }
        if (this.b == atiVar) {
            asy asyVar = this.n;
            if (asyVar == null) {
                asyVar = this.p;
            }
            this.p = asyVar;
            this.c.S();
            return;
        }
        asy asyVar2 = this.o;
        if (asyVar2 == null) {
            asyVar2 = this.p;
        }
        this.p = asyVar2;
        this.c.ae();
    }

    @Override // defpackage.ati, defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (this.e == null) {
            throw new ate("DataSource is not open.", this.p, 2);
        }
        return this.e.g(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0008, B:5:0x000d, B:6:0x0015, B:8:0x0022, B:12:0x0035, B:22:0x0083, B:24:0x0087, B:25:0x0097, B:27:0x009d, B:28:0x00a7, B:29:0x00ad, B:31:0x00b5, B:39:0x00e2, B:41:0x00ea, B:43:0x00ee, B:46:0x00f5, B:33:0x00c3, B:34:0x00d1, B:36:0x00d3, B:38:0x00db, B:47:0x00f6, B:48:0x00fd, B:15:0x003e, B:18:0x004b, B:20:0x006d, B:21:0x0074, B:49:0x00fe, B:50:0x010a, B:52:0x010c, B:54:0x0114, B:56:0x011c, B:58:0x0124, B:60:0x012c, B:61:0x013c, B:62:0x013d, B:63:0x0142, B:64:0x0143, B:65:0x0149, B:66:0x014a, B:67:0x0150, B:68:0x0151, B:69:0x0157, B:70:0x0158, B:71:0x015f), top: B:76:0x0008, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: InterruptedException -> 0x00c3, ExecutionException -> 0x00d2, all -> 0x0160, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x00c3, blocks: (B:29:0x00ad, B:31:0x00b5), top: B:77:0x00ad, outer: #0 }] */
    @Override // defpackage.ati, defpackage.asv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.asy r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aelv.h(asy):long");
    }

    @Override // defpackage.asv
    public final Uri i() {
        if (this.e == null) {
            return null;
        }
        return this.e.i();
    }

    @Override // defpackage.ati, defpackage.asv
    public final void j() {
        try {
            f(this.l);
            f(this.m);
            if (this.e != null) {
                pxi.I(this.e);
            }
            this.l = null;
            this.m = null;
            this.e = null;
        } catch (Throwable th) {
            if (this.e != null) {
                pxi.I(this.e);
            }
            this.l = null;
            this.m = null;
            this.e = null;
            throw th;
        }
    }

    @Override // defpackage.ati
    public final int k() {
        if (this.e == null) {
            return -1;
        }
        return this.e.k();
    }

    @Override // defpackage.ati
    public final void l() {
        this.d.b();
    }

    @Override // defpackage.ati
    public final void m(String str, String str2) {
        this.d.c(str, str2);
    }
}
