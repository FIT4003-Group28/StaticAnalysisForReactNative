package defpackage;
/* compiled from: PG */
/* renamed from: anal  reason: default package */
/* loaded from: classes.dex */
public final class anal extends Exception {
    public anal(Throwable th, anau anauVar, StackTraceElement[] stackTraceElementArr) {
        super(anauVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
