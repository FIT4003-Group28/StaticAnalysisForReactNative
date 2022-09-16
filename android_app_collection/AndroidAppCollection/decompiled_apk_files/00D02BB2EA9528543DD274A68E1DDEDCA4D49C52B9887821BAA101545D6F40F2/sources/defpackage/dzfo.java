package defpackage;
/* compiled from: PG */
/* renamed from: dzfo  reason: default package */
/* loaded from: classes6.dex */
public final class dzfo {
    public static final Throwable a = new dzfn();

    public static RuntimeException a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }
}
