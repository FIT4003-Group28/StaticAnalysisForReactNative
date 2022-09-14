package defpackage;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxdt  reason: default package */
/* loaded from: classes6.dex */
public final class dxdt implements Callable<Void> {
    final /* synthetic */ dxdz a;

    public dxdt(dxdz dxdzVar) {
        this.a = dxdzVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() {
        synchronized (this.a) {
            dxdz dxdzVar = this.a;
            if (dxdzVar.d != null) {
                dxdzVar.h();
                if (this.a.e()) {
                    this.a.a();
                    this.a.e = 0;
                }
            }
        }
        return null;
    }
}
