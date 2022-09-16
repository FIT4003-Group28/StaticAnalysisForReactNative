package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bvp  reason: default package */
/* loaded from: classes2.dex */
public final class bvp implements Runnable {
    private final brq a;
    private final String b;
    private final boolean c;

    static {
        bqf.b("StopWorkRunnable");
    }

    public bvp(brq brqVar, String str, boolean z) {
        this.a = brqVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean e;
        brq brqVar = this.a;
        WorkDatabase workDatabase = brqVar.d;
        bqy bqyVar = brqVar.f;
        bun n = workDatabase.n();
        workDatabase.f();
        try {
            String str = this.b;
            synchronized (bqyVar.g) {
                containsKey = bqyVar.d.containsKey(str);
            }
            if (this.c) {
                bqy bqyVar2 = this.a.f;
                String str2 = this.b;
                synchronized (bqyVar2.g) {
                    bqf a = bqf.a();
                    String.format("Processor stopping foreground work %s", str2);
                    a.d(new Throwable[0]);
                    e = bqy.e(str2, (bru) bqyVar2.d.remove(str2));
                }
            } else {
                if (!containsKey && n.h(this.b) == 2) {
                    n.k(1, this.b);
                }
                bqy bqyVar3 = this.a.f;
                String str3 = this.b;
                synchronized (bqyVar3.g) {
                    bqf a2 = bqf.a();
                    String.format("Processor stopping background work %s", str3);
                    a2.d(new Throwable[0]);
                    e = bqy.e(str3, (bru) bqyVar3.e.remove(str3));
                }
            }
            bqf a3 = bqf.a();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(e));
            a3.d(new Throwable[0]);
            workDatabase.h();
        } finally {
            workDatabase.g();
        }
    }
}
