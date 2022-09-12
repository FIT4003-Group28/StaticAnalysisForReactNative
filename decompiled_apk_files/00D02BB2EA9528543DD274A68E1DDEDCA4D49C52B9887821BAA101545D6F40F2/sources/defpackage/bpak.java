package defpackage;

import android.content.DialogInterface;
/* renamed from: bpak  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bpak implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new bpak();

    private bpak() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cjtd cjtdVar = bpao.a;
        dialogInterface.cancel();
    }
}
