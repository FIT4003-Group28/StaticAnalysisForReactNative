package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: anip  reason: default package */
/* loaded from: classes.dex */
abstract class anip extends ania {
    private static final Logger a = Logger.getLogger(anip.class.getName());
    public static final anim b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        anim anioVar;
        try {
            anioVar = new anin(AtomicReferenceFieldUpdater.newUpdater(anip.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(anip.class, "remaining"));
            th = null;
        } catch (Throwable th) {
            th = th;
            anioVar = new anio();
        }
        Throwable th2 = th;
        b = anioVar;
        if (th2 != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public anip(int i) {
        this.remaining = i;
    }

    public abstract void f(Set set);
}
