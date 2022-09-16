package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: akvb  reason: default package */
/* loaded from: classes.dex */
final class akvb implements ankb {
    final /* synthetic */ akvd a;

    public akvb(akvd akvdVar) {
        this.a = akvdVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            this.a.b.run();
        } else {
            this.a.c.accept(th);
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
    }
}
