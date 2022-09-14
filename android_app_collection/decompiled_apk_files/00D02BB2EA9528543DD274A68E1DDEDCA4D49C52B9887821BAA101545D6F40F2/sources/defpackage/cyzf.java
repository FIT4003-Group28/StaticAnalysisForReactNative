package defpackage;

import android.os.CancellationSignal;
import java.io.Closeable;
/* compiled from: PG */
/* renamed from: cyzf  reason: default package */
/* loaded from: classes5.dex */
final class cyzf implements Closeable, defs {
    private final CancellationSignal a = new CancellationSignal();

    @Override // defpackage.defs
    public final /* bridge */ /* synthetic */ Object a(defu defuVar) {
        defuVar.a(this, dege.a);
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.cancel();
    }
}
