package defpackage;

import android.content.DialogInterface;
/* renamed from: apxp  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class apxp implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new apxp();

    private apxp() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
