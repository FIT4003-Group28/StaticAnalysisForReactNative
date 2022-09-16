package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public f() {
        new AtomicReference();
    }

    public abstract b a();

    public abstract void a(h hVar);

    public abstract void b(h hVar);
}
