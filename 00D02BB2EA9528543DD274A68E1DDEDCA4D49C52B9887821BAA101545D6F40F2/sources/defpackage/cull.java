package defpackage;

import android.content.DialogInterface;
/* renamed from: cull  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cull implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new cull();

    private cull() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = culw.j;
        dialogInterface.cancel();
    }
}
