package defpackage;
/* compiled from: PG */
/* renamed from: amqv  reason: default package */
/* loaded from: classes.dex */
public final class amqv extends RuntimeException {
    public amqv(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }
}
