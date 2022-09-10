package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cntl  reason: default package */
/* loaded from: classes.dex */
public abstract class cntl<T> implements cntn<T> {
    protected final DataHolder a;

    /* JADX INFO: Access modifiers changed from: protected */
    public cntl(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.cnoj
    public final void b() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // defpackage.cntn
    public int c() {
        DataHolder dataHolder = this.a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new cnto(this);
    }
}
