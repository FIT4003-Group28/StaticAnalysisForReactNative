package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: deir  reason: default package */
/* loaded from: classes6.dex */
final class deir extends TimeoutException {
    public deir(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
