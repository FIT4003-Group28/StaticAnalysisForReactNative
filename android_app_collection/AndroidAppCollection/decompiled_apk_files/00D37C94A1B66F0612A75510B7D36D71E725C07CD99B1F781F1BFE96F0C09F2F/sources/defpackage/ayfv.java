package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayfv  reason: default package */
/* loaded from: classes2.dex */
public final class ayfv implements ayjt {
    public final aybx b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public ayjs f;
    public Status h;
    private final Executor j;
    private ayah k;
    private long l;
    private final axzs i = axzs.a(ayfv.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();

    public ayfv(Executor executor, aybx aybxVar) {
        this.j = executor;
        this.b = aybxVar;
    }

    private final ayfu e(ayad ayadVar, azqj[] azqjVarArr) {
        int size;
        ayfu ayfuVar = new ayfu(this, ayadVar, azqjVarArr, null, null);
        this.g.add(ayfuVar);
        synchronized (this.a) {
            size = this.g.size();
        }
        if (size == 1) {
            this.b.c(this.c);
        }
        return ayfuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ayah ayahVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.k = ayahVar;
            this.l++;
            if (ayahVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ayfu ayfuVar = (ayfu) arrayList.get(i);
                    ayad ayadVar = ayfuVar.a;
                    ayac a = ayahVar.a();
                    axyd axydVar = ayfuVar.a.a;
                    ayer b = ayhf.b(a, axydVar.f());
                    if (b != null) {
                        Executor executor = this.j;
                        Executor executor2 = axydVar.c;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        axyx a2 = ayfuVar.b.a();
                        try {
                            ayad ayadVar2 = ayfuVar.a;
                            ayeo l = b.l(ayadVar2.c, ayadVar2.b, ayadVar2.a, ayfuVar.d);
                            ayfuVar.b.c(a2);
                            Runnable q = ayfuVar.q(l);
                            if (q != null) {
                                executor.execute(q);
                            }
                            arrayList2.add(ayfuVar);
                        } catch (Throwable th) {
                            ayfuVar.b.c(a2);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (!b()) {
                        return;
                    }
                    this.g.removeAll(arrayList2);
                    if (this.g.isEmpty()) {
                        this.g = new LinkedHashSet();
                    }
                    if (!b()) {
                        this.b.c(this.d);
                        if (this.h != null && (runnable = this.e) != null) {
                            this.b.c(runnable);
                            this.e = null;
                        }
                    }
                    this.b.b();
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.axzw
    public final axzs c() {
        return this.i;
    }

    @Override // defpackage.ayjt
    public final Runnable d(ayjs ayjsVar) {
        throw null;
    }

    @Override // defpackage.ayjt
    public final void j(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h != null) {
                return;
            }
            this.h = status;
            this.b.c(new ayft(this));
            if (!b() && (runnable = this.e) != null) {
                this.b.c(runnable);
                this.e = null;
            }
            this.b.b();
        }
    }

    @Override // defpackage.ayjt
    public final void k(Status status) {
        Collection<ayfu> collection;
        Runnable runnable;
        j(status);
        synchronized (this.a) {
            collection = this.g;
            runnable = this.e;
            this.e = null;
            if (!collection.isEmpty()) {
                this.g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (ayfu ayfuVar : collection) {
                Runnable q = ayfuVar.q(new aygt(status, ayep.REFUSED, ayfuVar.d, null, null));
                if (q != null) {
                    q.run();
                }
            }
            this.b.execute(runnable);
        }
    }

    @Override // defpackage.ayer
    public final ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        ayeo aygtVar;
        aybx aybxVar;
        try {
            ayad ayadVar = new ayad(ayaxVar, ayatVar, axydVar);
            long j = -1;
            ayah ayahVar = null;
            while (true) {
                synchronized (this.a) {
                    Status status = this.h;
                    if (status == null) {
                        ayah ayahVar2 = this.k;
                        if (ayahVar2 != null) {
                            if (ayahVar != null && j == this.l) {
                                aygtVar = e(ayadVar, azqjVarArr);
                                aybxVar = this.b;
                                break;
                            }
                            j = this.l;
                            ayer b = ayhf.b(ayahVar2.a(), axydVar.f());
                            if (b != null) {
                                aygtVar = b.l(ayadVar.c, ayadVar.b, ayadVar.a, azqjVarArr);
                                aybxVar = this.b;
                                break;
                            }
                            ayahVar = ayahVar2;
                        } else {
                            aygtVar = e(ayadVar, azqjVarArr);
                            aybxVar = this.b;
                            break;
                        }
                    } else {
                        aygtVar = new aygt(status, azqjVarArr, null, null);
                        aybxVar = this.b;
                        break;
                    }
                }
            }
            aybxVar.b();
            return aygtVar;
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }
}
