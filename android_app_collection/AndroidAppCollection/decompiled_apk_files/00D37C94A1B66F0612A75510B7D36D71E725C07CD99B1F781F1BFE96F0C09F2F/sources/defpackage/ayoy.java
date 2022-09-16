package defpackage;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ayoy  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayoy implements aypg {
    private final AtomicBoolean a = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();

    @Override // defpackage.aypg
    public final boolean e() {
        return this.a.get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a();
            } else {
                aypa.a().f(new ayox(this));
            }
        }
    }
}
