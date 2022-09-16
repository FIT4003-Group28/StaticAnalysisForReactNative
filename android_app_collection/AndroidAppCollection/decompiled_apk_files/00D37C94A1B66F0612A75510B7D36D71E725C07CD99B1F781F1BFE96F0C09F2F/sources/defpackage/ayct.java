package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ayct  reason: default package */
/* loaded from: classes2.dex */
public final class ayct extends Binder {
    private static final Logger b = Logger.getLogger(ayct.class.getName());
    public aycs a;

    public ayct(aycs aycsVar) {
        this.a = aycsVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        aycs aycsVar = this.a;
        if (aycsVar != null) {
            try {
                return aycsVar.p(i, parcel);
            } catch (RuntimeException e) {
                Logger logger = b;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder(39);
                sb.append("failure sending transaction ");
                sb.append(i);
                logger.logp(level, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", sb.toString(), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
