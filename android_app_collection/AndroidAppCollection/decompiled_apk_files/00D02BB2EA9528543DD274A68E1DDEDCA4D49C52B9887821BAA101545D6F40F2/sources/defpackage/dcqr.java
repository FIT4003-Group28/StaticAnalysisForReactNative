package defpackage;
/* compiled from: PG */
/* renamed from: dcqr  reason: default package */
/* loaded from: classes.dex */
public final class dcqr extends Exception {
    public dcqr(Throwable th, dcqz dcqzVar, StackTraceElement[] stackTraceElementArr) {
        super(dcqzVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
