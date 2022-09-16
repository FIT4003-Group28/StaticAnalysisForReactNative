package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: caai  reason: default package */
/* loaded from: classes4.dex */
final class caai implements DialogInterface.OnCancelListener {
    final /* synthetic */ caaw a;

    public caai(caaw caawVar) {
        this.a = caawVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.aJ(null, true);
    }
}
