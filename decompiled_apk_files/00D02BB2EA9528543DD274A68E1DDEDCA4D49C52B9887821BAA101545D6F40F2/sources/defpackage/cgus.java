package defpackage;

import android.content.DialogInterface;
/* renamed from: cgus  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgus implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new cgus();

    private cgus() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
