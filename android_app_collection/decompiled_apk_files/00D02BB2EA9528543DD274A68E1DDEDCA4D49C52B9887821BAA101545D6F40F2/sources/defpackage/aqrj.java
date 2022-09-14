package defpackage;

import android.content.DialogInterface;
/* renamed from: aqrj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqrj implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new aqrj();

    private aqrj() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
