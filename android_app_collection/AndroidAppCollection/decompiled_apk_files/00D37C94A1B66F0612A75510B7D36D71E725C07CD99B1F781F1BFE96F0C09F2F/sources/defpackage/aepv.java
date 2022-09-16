package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aepv */
/* loaded from: classes.dex */
public final class aepv {
    public final yrj a;
    public final yve b;
    public final zer c;
    public volatile boolean d;
    private final aadd e;
    private final ScheduledExecutorService f;

    public aepv(yrj yrjVar, yve yveVar, ScheduledExecutorService scheduledExecutorService, aadd aaddVar) {
        aepu aepuVar = new aepu(this);
        this.c = aepuVar;
        this.d = false;
        this.a = yrjVar;
        this.b = yveVar;
        this.f = scheduledExecutorService;
        this.e = aaddVar;
        aepuVar.b(scheduledExecutorService);
    }

    public static /* synthetic */ void d() {
        afus.e(1, 6, "Failed to persist persisted bandwidth samples.", 0.01d);
    }

    private final atvq e() {
        arhd a;
        aadd aaddVar = this.e;
        if (aaddVar == null || (a = aaddVar.a()) == null) {
            return null;
        }
        atdy atdyVar = a.i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atvq atvqVar = atdyVar.g;
        return atvqVar == null ? atvq.a : atvqVar;
    }

    public final List a() {
        int i;
        ArrayList arrayList = new ArrayList();
        if (c()) {
            int a = this.a.a();
            synchronized (this) {
                Iterator it = ((ArrayDeque) this.c.get()).iterator();
                while (it.hasNext()) {
                    afkq afkqVar = (afkq) it.next();
                    if (a == 2 || (i = afkqVar.c) == 0 || i == a) {
                        arrayList.add(Long.valueOf(afkqVar.b));
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b(long j, long j2) {
        boolean z;
        atvq e = e();
        if (e == null) {
            return;
        }
        boolean z2 = e.b;
        int i = e.c;
        int i2 = e.d;
        if (!z2 || j2 <= 0 || j <= 0) {
            return;
        }
        aopa createBuilder = afkq.a.createBuilder();
        createBuilder.copyOnWrite();
        ((afkq) createBuilder.instance).d = j;
        createBuilder.copyOnWrite();
        ((afkq) createBuilder.instance).b = j2;
        createBuilder.copyOnWrite();
        ((afkq) createBuilder.instance).c = 0;
        afkq afkqVar = (afkq) createBuilder.mo39build();
        synchronized (this) {
            z = !this.d;
            this.d = true;
            ArrayDeque arrayDeque = (ArrayDeque) this.c.get();
            arrayDeque.add(afkqVar);
            while (arrayDeque.size() > i) {
                arrayDeque.pop();
            }
        }
        if (!z) {
            return;
        }
        try {
            this.f.schedule(new Runnable() { // from class: aept
                @Override // java.lang.Runnable
                public final void run() {
                    afkq[] afkqVarArr;
                    int i3;
                    aepv aepvVar = aepv.this;
                    int a = aepvVar.a.a();
                    synchronized (aepvVar) {
                        ArrayDeque arrayDeque2 = (ArrayDeque) aepvVar.c.get();
                        afkqVarArr = (afkq[]) arrayDeque2.toArray(new afkq[arrayDeque2.size()]);
                        aepvVar.d = false;
                    }
                    ArrayList arrayList = new ArrayList(afkqVarArr.length);
                    for (afkq afkqVar2 : afkqVarArr) {
                        if (afkqVar2.c == 0) {
                            aopa mo52toBuilder = afkqVar2.mo52toBuilder();
                            mo52toBuilder.copyOnWrite();
                            ((afkq) mo52toBuilder.instance).c = a;
                            arrayList.add((afkq) mo52toBuilder.mo39build());
                        } else {
                            arrayList.add(afkqVar2);
                        }
                    }
                    ylx.m(aepvVar.b.b(new tvu(arrayList, 6)), adkd.p);
                }
            }, i2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            afus.c(2, 8, "Could not schedule the persisting of bandwidth samples.", e2);
            synchronized (this) {
                this.d = false;
            }
        }
    }

    public final boolean c() {
        atvq e = e();
        if (e != null) {
            return e.b;
        }
        return false;
    }
}
