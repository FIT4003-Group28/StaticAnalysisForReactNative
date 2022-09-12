package defpackage;
/* compiled from: PG */
/* renamed from: dzau  reason: default package */
/* loaded from: classes6.dex */
public final class dzau extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public dzau(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }
}
