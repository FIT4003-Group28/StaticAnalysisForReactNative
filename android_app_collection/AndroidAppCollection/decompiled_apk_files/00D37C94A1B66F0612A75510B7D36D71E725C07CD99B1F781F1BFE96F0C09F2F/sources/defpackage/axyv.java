package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: axyv  reason: default package */
/* loaded from: classes2.dex */
final class axyv {
    static final axyw a;

    static {
        axyw aybyVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            aybyVar = (axyw) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(axyw.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            aybyVar = new ayby();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = aybyVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            axyx.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
