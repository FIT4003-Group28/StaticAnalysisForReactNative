package defpackage;

import android.content.DialogInterface;
/* renamed from: cbej  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cbej implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new cbej();

    private cbej() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
