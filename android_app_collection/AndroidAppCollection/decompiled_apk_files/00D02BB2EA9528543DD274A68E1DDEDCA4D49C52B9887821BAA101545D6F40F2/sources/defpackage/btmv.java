package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: btmv  reason: default package */
/* loaded from: classes.dex */
public final class btmv implements btni {
    public final Runtime a;
    public final csso b;
    public final ckcw c;
    public final dbty<Float> d;
    public final dbty<Float> e;
    public final dbty<Float> f;
    public long g;
    public boolean h;
    public final dbty<Integer> i;
    public final AtomicBoolean j;
    public final cssn k;
    private final ConcurrentMap<btni, String> l;
    private final AtomicBoolean m;
    private final Executor n;
    private final ComponentCallbacks2 o;

    public btmv(Context context, csso cssoVar, ckcw ckcwVar, dzsj<dwwr> dzsjVar, dzsj<dvcz> dzsjVar2, Executor executor) {
        Runtime runtime = Runtime.getRuntime();
        dchm dchmVar = new dchm();
        dchmVar.i();
        this.l = dchmVar.e();
        this.m = new AtomicBoolean(false);
        this.g = -1L;
        this.h = false;
        this.j = new AtomicBoolean(false);
        btmn btmnVar = new btmn(this);
        this.o = btmnVar;
        this.k = new btmo(this);
        this.a = runtime;
        if (runtime.maxMemory() < 16777216) {
            long maxMemory = runtime.maxMemory();
            StringBuilder sb = new StringBuilder(74);
            sb.append("Device has lower than minimum required amount of RAM: ");
            sb.append(maxMemory);
            bvoo.j(new IllegalStateException(sb.toString()));
        }
        this.b = cssoVar;
        this.c = ckcwVar;
        this.n = executor;
        this.d = dbud.a(new btmp(dzsjVar));
        this.e = dbud.a(new btmq(dzsjVar2));
        this.f = dbud.a(new btmr(dzsjVar2));
        this.i = dbud.a(new btms(dzsjVar2));
        context.registerComponentCallbacks(btmnVar);
    }

    public final void a(btni btniVar, @dzsi String str) {
        if (str == null) {
            str = "unknown";
        }
        this.l.put(btniVar, str);
    }

    @Override // defpackage.btni
    public final int b(float f) {
        if (f == 1.0f) {
            return 0;
        }
        if (!this.m.compareAndSet(false, true)) {
            return -1;
        }
        try {
            this.c.o(ckip.q, 1L);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        for (btni btniVar : this.l.keySet()) {
            synchronized (btniVar) {
                btniVar.b(f);
                String str = this.l.get(btniVar);
                if (str != null) {
                    bvpm.a(str.length() != 0 ? "CacheManager_".concat(str) : new String("CacheManager_"), btniVar.c());
                }
            }
        }
        this.m.set(false);
        this.g = SystemClock.elapsedRealtime();
        return 0;
    }

    @Override // defpackage.btni
    @dzsi
    public final String c() {
        return null;
    }

    public final void d(btni btniVar) {
        this.l.remove(btniVar);
    }

    public final void e(final btmu btmuVar, float f) {
        float f2 = btmuVar.i;
        if (f < 0.0f) {
            f = f2;
        } else if (btmuVar.m) {
            f = Math.min(f2, f);
        }
        final long f3 = f();
        if (b(f) != -1) {
            this.c.s(ckip.r, btmuVar.j);
            if (!this.j.compareAndSet(false, true)) {
                return;
            }
            this.n.execute(new Runnable(this, f3, btmuVar) { // from class: btmm
                private final btmv a;
                private final long b;
                private final btmu c;

                {
                    this.a = this;
                    this.b = f3;
                    this.c = btmuVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    btmv btmvVar = this.a;
                    long j = this.b;
                    btmu btmuVar2 = this.c;
                    int intValue = btmvVar.i.a().intValue();
                    WeakReference weakReference = new WeakReference(new Object());
                    deix.c(intValue, TimeUnit.MILLISECONDS);
                    if (weakReference.get() == null) {
                        long f4 = j - btmvVar.f();
                        btmvVar.c.s(btmuVar2.k, Math.round((((float) f4) / ((float) j)) * 100.0f));
                        btmvVar.c.s(btmuVar2.l, decl.b(f4 / 1048576));
                    }
                    btmvVar.j.set(false);
                }
            });
        }
    }

    public final long f() {
        return this.a.totalMemory() - this.a.freeMemory();
    }
}
