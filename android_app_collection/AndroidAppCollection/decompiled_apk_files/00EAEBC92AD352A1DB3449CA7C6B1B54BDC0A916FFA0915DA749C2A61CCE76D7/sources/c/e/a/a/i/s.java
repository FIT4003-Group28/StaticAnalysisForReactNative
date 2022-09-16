package c.e.a.a.i;

import android.content.Context;
import java.io.Closeable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class s implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        a mo148a(Context context);

        s a();
    }

    abstract c.e.a.a.i.w.j.c a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract r b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
