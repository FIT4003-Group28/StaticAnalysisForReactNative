package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adv  reason: default package */
/* loaded from: classes.dex */
public final class adv {
    public eo a;

    public static Context a(dp dpVar) {
        dt mJ = dpVar.mJ();
        return mJ != null ? mJ : dpVar.rb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ady b(Context context) {
        if (context instanceof ak) {
            return (ady) new ai((ak) context).a(ady.class);
        }
        return null;
    }

    public adv(dp dpVar, Executor executor, adg adgVar, byte[] bArr) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        eo mL = dpVar.mL();
        final ady b = b(a(dpVar));
        if (b != null) {
            dpVar.X.c(new apx(b) { // from class: androidx.biometric.BiometricPrompt$ResetCallbackObserver
                private final WeakReference a;

                {
                    this.a = new WeakReference(b);
                }

                @OnLifecycleEvent(a = aps.ON_DESTROY)
                public void resetCallback() {
                    if (this.a.get() != null) {
                        ((ady) this.a.get()).x = null;
                    }
                }
            });
        }
        this.a = mL;
        if (b == null) {
            return;
        }
        b.a = executor;
        b.x = adgVar;
    }
}
