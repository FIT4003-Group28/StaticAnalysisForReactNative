package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vse  reason: default package */
/* loaded from: classes7.dex */
final class vse implements amfq {
    public final Object a = new Object();
    public final Set<amfu> b = new HashSet();
    public int c;
    final /* synthetic */ vsf d;
    private final vti e;

    public vse(vsf vsfVar, vti vtiVar, int i) {
        this.d = vsfVar;
        this.e = vtiVar;
        this.c = i;
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        synchronized (this.a) {
            if (this.b.contains(amfuVar)) {
                return;
            }
            this.b.add(amfuVar);
            this.b.size();
            dbsk.m(this.b.size() <= this.c, "Handled too many resources");
            b();
        }
    }

    public final void b() {
        if (this.b.size() == this.c) {
            Executor executor = this.d.a;
            final vti vtiVar = this.e;
            vtiVar.getClass();
            executor.execute(new Runnable(vtiVar) { // from class: vsd
                private final vti a;

                {
                    this.a = vtiVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            });
        }
    }
}
