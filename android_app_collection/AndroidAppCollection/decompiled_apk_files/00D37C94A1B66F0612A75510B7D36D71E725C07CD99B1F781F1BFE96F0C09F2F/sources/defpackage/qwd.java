package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: qwd  reason: default package */
/* loaded from: classes4.dex */
public final class qwd implements Iterable, Closeable, qtb {
    protected final DataHolder a;

    public qwd(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.qtb
    public final void b() {
        this.a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qwe(this);
    }
}
