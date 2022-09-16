package defpackage;

import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: aywr  reason: default package */
/* loaded from: classes2.dex */
public final class aywr extends aynx {
    final Future b;

    public aywr(Future future) {
        this.b = future;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        azob azobVar = new azob(bameVar);
        bameVar.f(azobVar);
        try {
            Object obj = this.b.get();
            if (obj == null) {
                bameVar.b(new NullPointerException("The future returned null"));
            } else {
                azobVar.g(obj);
            }
        } catch (Throwable th) {
            bapv.j(th);
            if (azobVar.get() == 4) {
                return;
            }
            bameVar.b(th);
        }
    }
}
