package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f1876a = new HashMap();

    private static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T a(String str) {
        T t;
        Map<String, Object> map = this.f1876a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f1876a.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Map<String, Object> map = this.f1876a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f1876a.values()) {
                    a(obj);
                }
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
    }
}
