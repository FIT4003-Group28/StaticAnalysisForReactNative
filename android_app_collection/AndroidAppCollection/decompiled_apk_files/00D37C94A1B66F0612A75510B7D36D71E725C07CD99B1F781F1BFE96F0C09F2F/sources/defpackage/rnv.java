package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnv  reason: default package */
/* loaded from: classes4.dex */
public final class rnv implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ rom c;

    public rnv(rom romVar, AtomicReference atomicReference, AppMetadata appMetadata) {
        this.c = romVar;
        this.a = atomicReference;
        this.b = appMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.a) {
            try {
            } catch (RemoteException e) {
                this.c.aG().c.b("Failed to get app instance id", e);
                atomicReference = this.a;
            }
            if (!this.c.M().b().h()) {
                this.c.aG().h.a("Analytics storage consent denied; will not get app instance id");
                this.c.j().A(null);
                this.c.M().f.b(null);
                this.a.set(null);
                this.a.notify();
                return;
            }
            rom romVar = this.c;
            rkj rkjVar = romVar.c;
            if (rkjVar == null) {
                romVar.aG().c.a("Failed to get app instance id");
                this.a.notify();
                return;
            }
            this.a.set(rkjVar.a(this.b));
            String str = (String) this.a.get();
            if (str != null) {
                this.c.j().A(str);
                this.c.M().f.b(str);
            }
            this.c.s();
            atomicReference = this.a;
            atomicReference.notify();
        }
    }
}
