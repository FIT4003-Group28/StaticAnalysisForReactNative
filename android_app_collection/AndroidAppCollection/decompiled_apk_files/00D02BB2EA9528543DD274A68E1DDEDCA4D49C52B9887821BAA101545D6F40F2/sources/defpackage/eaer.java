package defpackage;

import java.io.Closeable;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eaer  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaer implements Closeable {
    public abstract long a();

    public abstract eajb b();

    public final InputStream c() {
        return b().f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eafa.b(b());
    }
}
