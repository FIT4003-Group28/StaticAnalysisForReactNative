package defpackage;
/* compiled from: PG */
/* renamed from: dykm  reason: default package */
/* loaded from: classes6.dex */
public abstract class dykm implements dytj {
    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        if (c() >= i) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.dytj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
