package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: qu  reason: default package */
/* loaded from: classes7.dex */
final class qu extends Handler {
    private final WeakReference<DialogInterface> a;

    public qu(DialogInterface dialogInterface) {
        this.a = new WeakReference<>(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
        } else if (i != 1) {
        } else {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
