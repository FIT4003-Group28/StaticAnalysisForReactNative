package defpackage;

import androidx.work.impl.WorkDatabase;
/* compiled from: PG */
/* renamed from: bhk  reason: default package */
/* loaded from: classes3.dex */
public final class bhk implements Runnable {
    private final bdn a;
    private final String b;
    private final boolean c;

    static {
        bbz.f("StopWorkRunnable");
    }

    public bhk(bdn bdnVar, String str, boolean z) {
        this.a = bdnVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        bdn bdnVar = this.a;
        WorkDatabase workDatabase = bdnVar.c;
        bcw bcwVar = bdnVar.e;
        bgi t = workDatabase.t();
        workDatabase.F();
        try {
            String str = this.b;
            synchronized (bcwVar.d) {
                containsKey = bcwVar.a.containsKey(str);
            }
            if (this.c) {
                bcw bcwVar2 = this.a.e;
                String str2 = this.b;
                synchronized (bcwVar2.d) {
                    bbz.e().a(new Throwable[0]);
                    bcw.g(bcwVar2.a.remove(str2));
                }
            } else {
                if (!containsKey && t.o(this.b) == 2) {
                    t.u(1, this.b);
                }
                bcw bcwVar3 = this.a.e;
                String str3 = this.b;
                synchronized (bcwVar3.d) {
                    bbz.e().a(new Throwable[0]);
                    bcw.g(bcwVar3.b.remove(str3));
                }
            }
            bbz.e().a(new Throwable[0]);
            workDatabase.l();
        } finally {
            workDatabase.k();
        }
    }
}
