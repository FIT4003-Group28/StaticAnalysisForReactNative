package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: axfd  reason: default package */
/* loaded from: classes2.dex */
final class axfd implements DialogInterface.OnCancelListener {
    final /* synthetic */ Runnable a;

    public axfd(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.run();
    }
}
