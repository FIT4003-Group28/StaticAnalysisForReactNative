package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: anlm  reason: default package */
/* loaded from: classes.dex */
final class anlm extends TimeoutException {
    public anlm(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
