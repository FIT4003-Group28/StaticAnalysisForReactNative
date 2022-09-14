package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apqo  reason: default package */
/* loaded from: classes2.dex */
public final class apqo implements Handler.Callback {
    private final WeakReference<apqr> a;

    public apqo(apqr apqrVar) {
        this.a = new WeakReference<>(apqrVar);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        apqr apqrVar = this.a.get();
        if (apqrVar != null) {
            apqrVar.e();
            return true;
        }
        return true;
    }
}
