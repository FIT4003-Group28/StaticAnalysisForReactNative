package defpackage;

import android.content.DialogInterface;
/* renamed from: ayat  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class ayat implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new ayat();

    private ayat() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
