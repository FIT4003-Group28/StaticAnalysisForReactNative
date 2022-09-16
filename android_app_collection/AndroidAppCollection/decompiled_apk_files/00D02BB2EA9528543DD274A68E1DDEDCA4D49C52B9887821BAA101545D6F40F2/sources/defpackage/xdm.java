package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xdm  reason: default package */
/* loaded from: classes7.dex */
final class xdm implements DialogInterface.OnDismissListener {
    final /* synthetic */ cqkf a;

    public xdm(cqkf cqkfVar) {
        this.a = cqkfVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.e(null);
    }
}
