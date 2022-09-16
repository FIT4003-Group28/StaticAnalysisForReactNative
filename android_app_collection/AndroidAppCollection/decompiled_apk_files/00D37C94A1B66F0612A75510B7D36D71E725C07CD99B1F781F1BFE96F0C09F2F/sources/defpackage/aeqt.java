package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aeqt  reason: default package */
/* loaded from: classes.dex */
public final class aeqt {
    public final yve a;
    public final zer b;
    public volatile boolean c;
    private final aadd d;
    private final ScheduledExecutorService e;
    private final acrr f;

    public aeqt(yve yveVar, ScheduledExecutorService scheduledExecutorService, aadd aaddVar, acrr acrrVar) {
        aeqr aeqrVar = new aeqr(this);
        this.b = aeqrVar;
        this.c = false;
        this.a = yveVar;
        this.e = scheduledExecutorService;
        this.d = aaddVar;
        this.f = acrrVar;
        aeqrVar.b(scheduledExecutorService);
    }

    private final atvq d() {
        arhd a;
        aadd aaddVar = this.d;
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

    private static void e(ArrayDeque arrayDeque, float f, int i) {
        arrayDeque.add(Float.valueOf(f));
        while (arrayDeque.size() > i) {
            arrayDeque.pop();
        }
    }

    public final void a() {
        if (Math.random() < 0.01d) {
            aeqh.d(16, this.f);
        }
    }

    public final boolean b() {
        atvq d = d();
        if (d != null) {
            return d.e;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(float f, float f2, long j, int i, String str) {
        atvq d = d();
        if (d == null || str == null || f2 <= 0.0f || !d.e) {
            return;
        }
        int i2 = d.c;
        int i3 = d.d;
        synchronized (this) {
            boolean z = !this.c;
            this.c = true;
            aeqs aeqsVar = (aeqs) this.b.get();
            if (!str.equals(aeqsVar.g)) {
                aeqsVar.b = new ArrayDeque();
                aeqsVar.c = new ArrayDeque();
                aeqsVar.d = new ArrayDeque();
                aeqsVar.e = new ArrayDeque();
                aeqsVar.f = -1L;
                aeqsVar.g = str;
            }
            int i4 = i - 1;
            if (i4 == 0) {
                e(aeqsVar.b, f2, i2);
            } else if (i4 != 1) {
                if (f > 0.0f && j != -1) {
                    e(aeqsVar.c, f2, i2);
                    e(aeqsVar.d, f, i2);
                    aeqsVar.f = j;
                }
                return;
            } else if (j == -1) {
                return;
            } else {
                e(aeqsVar.e, f2, i2);
                aeqsVar.f = j;
            }
            if (!z) {
                return;
            }
            try {
                this.e.schedule(new Runnable() { // from class: aeqq
                    @Override // java.lang.Runnable
                    public final void run() {
                        final aeqs a;
                        final aeqt aeqtVar = aeqt.this;
                        synchronized (aeqtVar) {
                            a = aeqs.a((aeqs) aeqtVar.b.get());
                            aeqtVar.c = false;
                        }
                        ylx.m(aeqtVar.a.b(new ampg() { // from class: aeqp
                            @Override // defpackage.ampg
                            public final Object apply(Object obj) {
                                aeqs aeqsVar2 = aeqs.this;
                                aopa mo52toBuilder = ((awuj) obj).mo52toBuilder();
                                aopa createBuilder = afks.a.createBuilder();
                                ArrayDeque arrayDeque = aeqsVar2.d;
                                createBuilder.copyOnWrite();
                                afks afksVar = (afks) createBuilder.instance;
                                aopp aoppVar = afksVar.c;
                                if (!aoppVar.c()) {
                                    afksVar.c = aopi.mutableCopy(aoppVar);
                                }
                                aonk.addAll((Iterable) arrayDeque, (List) afksVar.c);
                                ArrayDeque arrayDeque2 = aeqsVar2.b;
                                createBuilder.copyOnWrite();
                                afks afksVar2 = (afks) createBuilder.instance;
                                aopp aoppVar2 = afksVar2.b;
                                if (!aoppVar2.c()) {
                                    afksVar2.b = aopi.mutableCopy(aoppVar2);
                                }
                                aonk.addAll((Iterable) arrayDeque2, (List) afksVar2.b);
                                ArrayDeque arrayDeque3 = aeqsVar2.e;
                                createBuilder.copyOnWrite();
                                afks afksVar3 = (afks) createBuilder.instance;
                                aopp aoppVar3 = afksVar3.e;
                                if (!aoppVar3.c()) {
                                    afksVar3.e = aopi.mutableCopy(aoppVar3);
                                }
                                aonk.addAll((Iterable) arrayDeque3, (List) afksVar3.e);
                                ArrayDeque arrayDeque4 = aeqsVar2.c;
                                createBuilder.copyOnWrite();
                                afks afksVar4 = (afks) createBuilder.instance;
                                aopp aoppVar4 = afksVar4.d;
                                if (!aoppVar4.c()) {
                                    afksVar4.d = aopi.mutableCopy(aoppVar4);
                                }
                                aonk.addAll((Iterable) arrayDeque4, (List) afksVar4.d);
                                long j2 = aeqsVar2.f;
                                createBuilder.copyOnWrite();
                                ((afks) createBuilder.instance).f = (int) j2;
                                String str2 = aeqsVar2.g;
                                createBuilder.copyOnWrite();
                                str2.getClass();
                                ((afks) createBuilder.instance).g = str2;
                                afks afksVar5 = (afks) createBuilder.mo39build();
                                mo52toBuilder.copyOnWrite();
                                awuj awujVar = (awuj) mo52toBuilder.instance;
                                afksVar5.getClass();
                                awujVar.r = afksVar5;
                                awujVar.b |= 512;
                                return (awuj) mo52toBuilder.mo39build();
                            }
                        }), new ylv() { // from class: aeqo
                            @Override // defpackage.zdt
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                aeqt.this.a();
                            }
                        });
                    }
                }, i3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
                a();
            }
            synchronized (this) {
                this.c = false;
            }
        }
    }
}
