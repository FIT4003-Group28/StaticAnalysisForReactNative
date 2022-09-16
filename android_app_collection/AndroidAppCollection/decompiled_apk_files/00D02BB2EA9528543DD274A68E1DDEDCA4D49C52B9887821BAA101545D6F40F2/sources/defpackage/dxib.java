package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: dxib  reason: default package */
/* loaded from: classes6.dex */
final class dxib implements DialogInterface.OnCancelListener {
    final /* synthetic */ dxid a;

    public dxib(dxid dxidVar) {
        this.a = dxidVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.dismiss();
    }
}
