package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: defe  reason: default package */
/* loaded from: classes.dex */
public abstract class defe<OutputT> extends deeo<OutputT> {
    private static final Logger a = Logger.getLogger(defe.class.getName());
    public static final defb b;
    public volatile int remaining;
    public volatile Set<Throwable> seenExceptions = null;

    static {
        defb defdVar;
        try {
            defdVar = new defc(AtomicReferenceFieldUpdater.newUpdater(defe.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(defe.class, "remaining"));
            th = null;
        } catch (Throwable th) {
            th = th;
            defdVar = new defd();
        }
        Throwable th2 = th;
        b = defdVar;
        if (th2 != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public defe(int i) {
        this.remaining = i;
    }

    public abstract void f(Set<Throwable> set);
}
