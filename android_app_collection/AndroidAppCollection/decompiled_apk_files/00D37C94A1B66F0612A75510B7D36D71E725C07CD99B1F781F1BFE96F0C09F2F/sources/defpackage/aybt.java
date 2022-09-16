package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aybt  reason: default package */
/* loaded from: classes2.dex */
public final class aybt extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    private final boolean b;

    public aybt(Status status) {
        super(Status.e(status), status.r);
        this.a = status;
        this.b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (this.b) {
            return super.fillInStackTrace();
        }
        return this;
    }
}
