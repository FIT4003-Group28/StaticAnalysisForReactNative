package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: biz  reason: default package */
/* loaded from: classes2.dex */
final class biz implements DialogInterface.OnClickListener {
    final /* synthetic */ bja a;

    public biz(bja bjaVar) {
        this.a = bjaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bja bjaVar = this.a;
        bjaVar.ae = i;
        ((bjk) bjaVar).ai = -1;
        dialogInterface.dismiss();
    }
}
