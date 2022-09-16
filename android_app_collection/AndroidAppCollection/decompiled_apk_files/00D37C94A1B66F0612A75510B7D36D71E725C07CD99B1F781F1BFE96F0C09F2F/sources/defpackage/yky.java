package defpackage;

import java.util.concurrent.Callable;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/* compiled from: PG */
/* renamed from: yky  reason: default package */
/* loaded from: classes4.dex */
public final class yky extends Handler implements ylo {
    private final ylo a;

    public yky(ylo yloVar) {
        this.a = yloVar;
    }

    @Override // defpackage.ylo
    public final /* synthetic */ Runnable a(Runnable runnable) {
        return runnable;
    }

    @Override // defpackage.ylo
    public final /* synthetic */ Callable b(Callable callable) {
        return callable;
    }

    @Override // defpackage.ylo
    public final void c(Throwable th) {
        this.a.c(th);
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ylo
    public final /* synthetic */ void e(Throwable th) {
        yln.a(this, th);
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        if (!Level.SEVERE.equals(logRecord.getLevel()) || logRecord.getThrown() == null) {
            return;
        }
        c(logRecord.getThrown());
    }
}
