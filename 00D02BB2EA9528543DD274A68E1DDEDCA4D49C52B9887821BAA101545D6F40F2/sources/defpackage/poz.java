package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: poz  reason: default package */
/* loaded from: classes7.dex */
final class poz implements DialogInterface.OnDismissListener {
    final /* synthetic */ ppd a;

    public poz(ppd ppdVar) {
        this.a = ppdVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.c();
    }
}
