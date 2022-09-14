package defpackage;

import java.io.Closeable;
import java.io.Flushable;
/* compiled from: PG */
/* renamed from: eajx  reason: default package */
/* loaded from: classes6.dex */
public interface eajx extends Closeable, Flushable {
    void a(eaiz eaizVar, long j);

    eaka b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
