package defpackage;
/* compiled from: PG */
/* renamed from: dzas  reason: default package */
/* loaded from: classes6.dex */
public final class dzas {
    public static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
