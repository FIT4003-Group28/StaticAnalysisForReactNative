package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: zjt  reason: default package */
/* loaded from: classes4.dex */
final class zjt implements DialogInterface.OnClickListener {
    final /* synthetic */ Runnable a;
    private final /* synthetic */ int b;

    public zjt(Runnable runnable) {
        this.a = runnable;
    }

    public zjt(Runnable runnable, int i) {
        this.b = i;
        this.a = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.run();
            dialogInterface.dismiss();
            return;
        }
        this.a.run();
        dialogInterface.dismiss();
    }
}
