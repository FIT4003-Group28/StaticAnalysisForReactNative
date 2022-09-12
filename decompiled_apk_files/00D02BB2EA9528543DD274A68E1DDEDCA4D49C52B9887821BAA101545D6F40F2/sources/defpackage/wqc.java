package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: wqc  reason: default package */
/* loaded from: classes7.dex */
final class wqc implements DialogInterface.OnDismissListener {
    final /* synthetic */ cqkf a;

    public wqc(cqkf cqkfVar) {
        this.a = cqkfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.e(null);
    }
}
