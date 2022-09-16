package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: lmi  reason: default package */
/* loaded from: classes3.dex */
final class lmi implements DialogInterface.OnDismissListener {
    final /* synthetic */ lmj a;

    public lmi(lmj lmjVar) {
        this.a = lmjVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.b = false;
    }
}
