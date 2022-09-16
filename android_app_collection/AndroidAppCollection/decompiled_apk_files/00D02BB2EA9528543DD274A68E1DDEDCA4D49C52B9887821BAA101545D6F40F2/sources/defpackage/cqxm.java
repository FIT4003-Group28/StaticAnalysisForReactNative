package defpackage;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cqxm  reason: default package */
/* loaded from: classes5.dex */
final class cqxm implements Closeable {
    public final dyhi a;
    public final dspt b;

    public cqxm(dyhi dyhiVar, dspt dsptVar) {
        this.a = dyhiVar;
        this.b = dsptVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.f();
            this.a.e(TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
    }
}
