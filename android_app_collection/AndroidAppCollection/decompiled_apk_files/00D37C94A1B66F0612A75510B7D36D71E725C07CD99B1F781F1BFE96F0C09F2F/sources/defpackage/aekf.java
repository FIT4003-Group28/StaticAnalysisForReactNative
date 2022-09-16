package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aekf  reason: default package */
/* loaded from: classes.dex */
public final class aekf implements Runnable {
    private final yrj a;
    private final boolean b;
    private final int c;
    private int d;
    private final aekg e;

    public aekf(aekg aekgVar, yrj yrjVar, boolean z, int i) {
        afms.a(aekgVar);
        this.e = aekgVar;
        afms.a(yrjVar);
        this.a = yrjVar;
        this.d = 1;
        this.b = z;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long min;
        synchronized (this.e) {
            aekg aekgVar = this.e;
            if (!aekgVar.m) {
                aekgVar.r = false;
                return;
            }
            int a = this.a.a();
            if (a != this.d) {
                this.d = a;
                ArrayList arrayList = this.e.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    aekd aekdVar = (aekd) arrayList.get(i);
                    aekdVar.c = 0L;
                    aekdVar.d = aekdVar.g.d.d();
                    if (this.b) {
                        aekdVar.e();
                    }
                }
                this.e.f.c();
            }
            if (this.b && this.c > 0) {
                ArrayList arrayList2 = this.e.j;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    aekd aekdVar2 = (aekd) arrayList2.get(i2);
                    if (this.e.d.d() - aekdVar2.b >= this.c * 1000) {
                        aekdVar2.e();
                    }
                }
            }
            if (!this.e.k.contains(Integer.valueOf(a)) || this.e.n.b()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.e.j;
                int size3 = arrayList4.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    final aekd aekdVar3 = (aekd) arrayList4.get(i3);
                    long j = aekdVar3.d;
                    snc sncVar = this.e.d;
                    if (a != 2 && j - 3000 <= sncVar.d()) {
                        arrayList3.add(this.e.e.submit(new Runnable() { // from class: aeke
                            @Override // java.lang.Runnable
                            public final void run() {
                                aekg.f(aekd.this);
                            }
                        }));
                    }
                }
                int size4 = arrayList3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    try {
                        ((Future) arrayList3.get(i4)).get();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        afus.b(1, 8, "InterruptedException when attempting to open Bandaid connection.");
                    } catch (ExecutionException unused2) {
                        afus.b(1, 8, "ExecutionException when attempting to open Bandaid connection.");
                    }
                }
                if (this.d == 2) {
                    min = 5000;
                } else {
                    ArrayList arrayList5 = this.e.j;
                    int size5 = arrayList5.size();
                    long j2 = Long.MAX_VALUE;
                    for (int i5 = 0; i5 < size5; i5++) {
                        j2 = Math.min(j2, ((aekd) arrayList5.get(i5)).d);
                    }
                    min = Math.min(j2 - this.e.d.d(), 5000L);
                }
            } else {
                min = 1000;
            }
            synchronized (this.e) {
                aekg aekgVar2 = this.e;
                if (aekgVar2.m) {
                    aekgVar2.e.schedule(this, min, TimeUnit.MILLISECONDS);
                } else {
                    aekgVar2.r = false;
                }
            }
        }
    }
}
