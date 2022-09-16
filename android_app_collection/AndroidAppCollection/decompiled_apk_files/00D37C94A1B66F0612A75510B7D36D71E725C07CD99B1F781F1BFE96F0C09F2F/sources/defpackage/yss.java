package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: yss  reason: default package */
/* loaded from: classes4.dex */
public final class yss implements yqw {
    private final yts a;
    private final boolean b;
    private final ThreadPoolExecutor c;
    private final ThreadPoolExecutor d;
    private final ytk e;
    private final AtomicInteger f;

    @Override // defpackage.yqw
    public final yua a(yua yuaVar) {
        ysp yspVar = (ysp) this.e;
        ytq ytqVar = new ytq(yspVar.o, yspVar.x, yuaVar);
        if (this.a.d(yuaVar, ytqVar)) {
            return yuaVar;
        }
        d(yuaVar, ytqVar);
        return yuaVar;
    }

    @Override // defpackage.yqw
    public final ankt b(yua yuaVar) {
        SettableFuture f = SettableFuture.f();
        yto ytoVar = new yto(f, ((ysp) this.e).x, yuaVar);
        if (this.a.d(yuaVar, ytoVar)) {
            return f;
        }
        d(yuaVar, ytoVar);
        return f;
    }

    @Override // defpackage.yqw
    public final void c() {
        if (this.b) {
            this.d.prestartAllCoreThreads();
            ThreadPoolExecutor threadPoolExecutor = this.c;
            if (threadPoolExecutor == this.d) {
                return;
            }
            threadPoolExecutor.prestartAllCoreThreads();
        }
    }

    public yss(ytk ytkVar) {
        yts ytsVar;
        ThreadPoolExecutor u;
        this.e = ytkVar;
        ysp yspVar = (ysp) ytkVar;
        this.b = yspVar.f.c;
        boolean z = false;
        if (yspVar.w == null) {
            synchronized (ytkVar) {
                if (((ysp) ytkVar).w == null) {
                    apfr apfrVar = ((ysx) ((ysp) ytkVar).p).a;
                    if (((ysp) ytkVar).l == 1 || !apfrVar.d) {
                        u = ytkVar.u();
                    } else {
                        int i = apfrVar.f;
                        int i2 = apfrVar.g;
                        long j = apfrVar.e;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
                        String str = ((ysp) ytkVar).m;
                        u = new ThreadPoolExecutor(i, i2, j, timeUnit, linkedBlockingDeque, new yli(0, str.length() != 0 ? "cronetPrio-".concat(str) : new String("cronetPrio-")));
                    }
                    ((ysp) ytkVar).w = u;
                    if (((ysp) ytkVar).w == null) {
                        throw new NullPointerException("priorityExecutor() cannot return null");
                    }
                }
            }
        }
        this.c = yspVar.w;
        this.d = ytkVar.u();
        if (!yspVar.u) {
            synchronized (ytkVar) {
                if (!((ysp) ytkVar).u) {
                    apfz a = ymf.a(((ysp) ytkVar).d.a());
                    apfy apfyVar = a.i;
                    apfyVar = apfyVar == null ? apfy.a : apfyVar;
                    if ((a.b & 512) != 0 && apfyVar.c) {
                        z = true;
                    }
                    ((ysp) ytkVar).t = z;
                    ((ysp) ytkVar).u = true;
                }
            }
        }
        if (yspVar.t) {
            ytsVar = new yte(this);
        } else {
            ytsVar = yts.b;
        }
        this.a = ytsVar;
        this.f = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(yua yuaVar, ysq ysqVar) {
        ThreadPoolExecutor threadPoolExecutor = yuaVar.i ? this.c : this.d;
        try {
            ytk ytkVar = this.e;
            threadPoolExecutor.execute(new ytu(threadPoolExecutor, yuaVar, ytkVar, this.a, ysqVar, ((ysp) ytkVar).s, String.valueOf(this.f.getAndIncrement())));
        } catch (RejectedExecutionException e) {
            ysqVar.a(yuaVar, cfb.a(new cff(e)));
        }
    }
}
