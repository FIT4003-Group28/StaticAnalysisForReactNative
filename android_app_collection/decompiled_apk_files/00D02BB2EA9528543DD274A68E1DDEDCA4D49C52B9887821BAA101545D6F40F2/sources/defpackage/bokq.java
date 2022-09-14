package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bokq  reason: default package */
/* loaded from: classes3.dex */
final class bokq implements DialogInterface.OnDismissListener {
    final /* synthetic */ DialogInterface.OnDismissListener a;
    final /* synthetic */ cqkf b;

    public bokq(DialogInterface.OnDismissListener onDismissListener, cqkf cqkfVar) {
        this.a = onDismissListener;
        this.b = cqkfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.a;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.b.e(null);
    }
}
