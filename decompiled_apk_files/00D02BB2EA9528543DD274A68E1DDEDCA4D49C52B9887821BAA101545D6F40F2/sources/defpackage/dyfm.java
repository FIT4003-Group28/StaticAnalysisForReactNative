package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dyfm  reason: default package */
/* loaded from: classes6.dex */
final class dyfm {
    static final dyfn a;

    static {
        dyfn dyjjVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            dyjjVar = (dyfn) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(dyfn.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            dyjjVar = new dyjj();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = dyjjVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            dyfo.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
