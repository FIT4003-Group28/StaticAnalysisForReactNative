package com.facebook.common.l;
/* compiled from: ExceptionWithNoStacktrace.java */
/* loaded from: classes.dex */
public class a extends Exception {
    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public a(String str) {
        super(str);
    }
}
