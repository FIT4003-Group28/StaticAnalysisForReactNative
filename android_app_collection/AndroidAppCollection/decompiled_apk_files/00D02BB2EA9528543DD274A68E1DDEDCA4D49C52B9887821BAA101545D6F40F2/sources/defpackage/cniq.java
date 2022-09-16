package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cniq  reason: default package */
/* loaded from: classes5.dex */
public final class cniq implements IBinder.DeathRecipient {
    private final WeakReference<cnis> a;

    public cniq(cnis cnisVar) {
        this.a = new WeakReference<>(cnisVar);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        cnis cnisVar = this.a.get();
        if (cnisVar != null) {
            cnisVar.f.a(new RemoteException("ICar died"));
        }
    }
}
