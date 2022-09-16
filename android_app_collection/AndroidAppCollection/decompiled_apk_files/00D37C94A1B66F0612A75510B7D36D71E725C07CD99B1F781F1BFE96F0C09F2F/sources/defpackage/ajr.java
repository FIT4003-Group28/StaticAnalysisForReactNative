package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajr  reason: default package */
/* loaded from: classes.dex */
public final class ajr implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ajr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (ajt.d != null) {
                ajt.d.invoke(this.a, this.b, false, "AppCompat recreation");
            } else {
                ajt.e.invoke(this.a, this.b, false);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
