package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ajqp  reason: default package */
/* loaded from: classes2.dex */
final class ajqp implements DialogInterface.OnCancelListener {
    final /* synthetic */ ajqq a;

    public ajqp(ajqq ajqqVar) {
        this.a = ajqqVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.d.a();
    }
}
