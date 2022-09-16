package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: iju  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iju implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ iju a = new iju();

    private /* synthetic */ iju() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
    }
}
