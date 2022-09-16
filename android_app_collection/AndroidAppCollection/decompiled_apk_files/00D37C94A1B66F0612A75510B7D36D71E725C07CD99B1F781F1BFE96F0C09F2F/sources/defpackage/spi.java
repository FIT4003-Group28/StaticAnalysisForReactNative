package defpackage;
/* compiled from: PG */
/* renamed from: spi  reason: default package */
/* loaded from: classes4.dex */
final class spi extends RuntimeException {
    public spi(String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
