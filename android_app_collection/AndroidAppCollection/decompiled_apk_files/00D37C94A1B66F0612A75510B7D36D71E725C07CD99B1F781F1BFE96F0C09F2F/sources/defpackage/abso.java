package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abso  reason: default package */
/* loaded from: classes.dex */
public final class abso implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ abss b;
    private final /* synthetic */ int c;

    public abso(abss abssVar, Callable callable) {
        this.b = abssVar;
        this.a = callable;
    }

    public abso(abss abssVar, Callable callable, int i) {
        this.c = i;
        this.b = abssVar;
        this.a = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            absr absrVar = this.b.b;
            Callable callable = this.a;
            try {
                synchronized (absrVar) {
                    absrVar.f.add(((absl) callable).a);
                }
                return;
            } catch (Exception e) {
                absrVar.a(e);
                return;
            }
        }
        absr absrVar2 = this.b.b;
        Callable callable2 = this.a;
        try {
            synchronized (absrVar2) {
                absrVar2.e = ((absm) callable2).a;
            }
        } catch (Exception e2) {
            absrVar2.a(e2);
        }
    }
}
