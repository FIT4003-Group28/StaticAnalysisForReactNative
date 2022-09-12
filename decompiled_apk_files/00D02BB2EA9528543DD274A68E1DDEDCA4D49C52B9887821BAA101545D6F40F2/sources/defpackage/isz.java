package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: isz  reason: default package */
/* loaded from: classes.dex */
public final class isz implements ita {
    private final Map<Integer, dzsj<itb>> h;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Map<Integer, itb> a = dcjz.j();

    public isz(Executor executor, Map<Integer, dzsj<itb>> map, final Set<Class<? extends itb>> set) {
        this.h = map;
        executor.execute(new Runnable(set) { // from class: isy
            private final Set a;

            {
                this.a = set;
            }

            @Override // java.lang.Runnable
            public final void run() {
                for (Class cls : this.a) {
                    try {
                        Class.forName(cls.getCanonicalName());
                    } catch (ClassNotFoundException e) {
                        deki.b(e);
                    }
                }
            }
        });
    }

    @Override // defpackage.ita
    public final boolean a(Integer num) {
        return this.a.containsKey(num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, itb, java.lang.Object] */
    @Override // defpackage.ita
    public final <T> T b(Integer num) {
        ?? r0 = (T) this.h.get(num).a();
        dbsk.s(r0);
        r0.getClass();
        if (!this.a.containsValue(r0)) {
            this.a.put(num, r0);
            String valueOf = String.valueOf(r0.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("VeneerManagerImpl.callLifecycleMethodsAndTrackNewVeneer-");
            sb.append(valueOf);
            sb.toString();
            synchronized (r0) {
                if (this.b.get() && !r0.v()) {
                    if (!this.g.get()) {
                        r0.getClass();
                        bvmn bvmnVar = bvmo.a;
                        r0.Ns();
                        r0.y(true);
                    } else if (this.g.get()) {
                        dcqe.b.v(dcqz.MEDIUM);
                        r0.getClass();
                    }
                }
                if (this.c.get() && !r0.w()) {
                    if (this.f.get()) {
                        dcqe.b.v(dcqz.MEDIUM);
                        r0.getClass();
                    } else {
                        r0.getClass();
                        bvmn bvmnVar2 = bvmo.a;
                        r0.Nt();
                        r0.z(true);
                    }
                }
                if (this.d.get() && !r0.x()) {
                    if (this.e.get()) {
                        dcqe.b.v(dcqz.MEDIUM);
                        r0.getClass();
                    } else {
                        r0.getClass();
                        bvmn bvmnVar3 = bvmo.a;
                        r0.PX();
                        r0.A(true);
                    }
                }
            }
        }
        return r0;
    }

    @Override // defpackage.ita
    public final boolean c() {
        return this.b.get();
    }
}
