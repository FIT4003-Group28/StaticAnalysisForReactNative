package defpackage;
/* compiled from: PG */
/* renamed from: azym  reason: default package */
/* loaded from: classes2.dex */
public final class azym extends azyn {
    public static final azym b;
    public static final azur d;

    static {
        azym azymVar = new azym();
        b = azymVar;
        d = new azyo(azymVar, azrp.e("kotlinx.coroutines.io.parallelism", azst.f(64, azyh.a), 0, 0, 12));
    }

    private azym() {
        super(azyt.b, azyt.c, azyt.d);
    }

    @Override // defpackage.azyn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.azyn, defpackage.azur
    public final String toString() {
        return "Dispatchers.Default";
    }
}
