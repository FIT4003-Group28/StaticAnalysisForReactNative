package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: yhv  reason: default package */
/* loaded from: classes4.dex */
final class yhv implements DialogInterface.OnClickListener {
    final /* synthetic */ yhw a;

    public yhv(yhw yhwVar) {
        this.a = yhwVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
    }
}
