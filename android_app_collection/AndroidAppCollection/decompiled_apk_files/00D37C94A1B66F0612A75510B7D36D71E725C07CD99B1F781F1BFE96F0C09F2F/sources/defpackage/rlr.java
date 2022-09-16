package defpackage;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rlr  reason: default package */
/* loaded from: classes4.dex */
public final class rlr implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ rlu a;
    private final String b;

    public rlr(rlu rluVar, String str) {
        this.a = rluVar;
        this.b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.a.aG().c.b(this.b, th);
    }
}
