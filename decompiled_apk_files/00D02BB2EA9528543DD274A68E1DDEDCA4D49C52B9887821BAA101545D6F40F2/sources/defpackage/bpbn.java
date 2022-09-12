package defpackage;

import android.content.DialogInterface;
/* renamed from: bpbn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bpbn implements DialogInterface.OnClickListener {
    static final DialogInterface.OnClickListener a = new bpbn();

    private bpbn() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
