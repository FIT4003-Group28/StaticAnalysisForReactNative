package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bnxe  reason: default package */
/* loaded from: classes3.dex */
final class bnxe implements DialogInterface.OnCancelListener {
    final /* synthetic */ bnxf a;

    public bnxe(bnxf bnxfVar) {
        this.a = bnxfVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a.aS();
    }
}
