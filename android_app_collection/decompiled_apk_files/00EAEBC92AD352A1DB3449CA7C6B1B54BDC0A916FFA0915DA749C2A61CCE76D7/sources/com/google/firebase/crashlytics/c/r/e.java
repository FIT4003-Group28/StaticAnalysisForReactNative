package com.google.firebase.crashlytics.c.r;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f9159a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9160b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f9161c;

    /* renamed from: d  reason: collision with root package name */
    public final e f9162d;

    public e(Throwable th, d dVar) {
        this.f9159a = th.getLocalizedMessage();
        this.f9160b = th.getClass().getName();
        this.f9161c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f9162d = cause != null ? new e(cause, dVar) : null;
    }
}
