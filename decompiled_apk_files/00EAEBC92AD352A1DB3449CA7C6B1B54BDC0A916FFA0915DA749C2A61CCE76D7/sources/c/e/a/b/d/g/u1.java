package c.e.a.b.d.g;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u1(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = v1.f4470e;
        atomicBoolean.set(true);
    }
}
