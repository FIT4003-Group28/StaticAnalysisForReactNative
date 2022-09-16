package defpackage;

import java.io.File;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: dza  reason: default package */
/* loaded from: classes3.dex */
final class dza implements Runnable {
    final /* synthetic */ dzb a;

    public dza(dzb dzbVar) {
        this.a = dzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dzb dzbVar = this.a;
        dzbVar.a.getApplicationContext();
        if (dzbVar.h == null) {
            dzbVar.h = new esp((zen) dzbVar.f.get());
        }
        if (dzbVar.h.a()) {
            try {
                if (!((Boolean) ((aacu) dzbVar.b.get()).b().get()).booleanValue()) {
                    return;
                }
                zew.c((File) this.a.d.get());
            } catch (InterruptedException | ExecutionException e) {
                afus.c(2, 18, "Failed to get the fail safe status", e);
            }
        }
    }
}
