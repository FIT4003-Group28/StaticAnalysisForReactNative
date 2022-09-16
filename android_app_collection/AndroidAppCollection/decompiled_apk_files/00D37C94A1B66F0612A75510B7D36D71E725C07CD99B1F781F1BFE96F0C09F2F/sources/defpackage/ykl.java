package defpackage;

import java.io.Closeable;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ykl  reason: default package */
/* loaded from: classes4.dex */
public final class ykl implements Closeable {
    public final InputStream[] a;

    public ykl(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.a) {
            ykm.c(inputStream);
        }
    }
}
