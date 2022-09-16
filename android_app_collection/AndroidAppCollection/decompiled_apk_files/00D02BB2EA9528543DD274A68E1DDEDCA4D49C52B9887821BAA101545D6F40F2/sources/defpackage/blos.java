package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: blos  reason: default package */
/* loaded from: classes3.dex */
final class blos implements DialogInterface.OnClickListener {
    final /* synthetic */ blot a;

    public blos(blot blotVar) {
        this.a = blotVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.a.c.i(cjtd.a(dtya.bJ));
        }
        dialogInterface.dismiss();
    }
}
