package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ppv  reason: default package */
/* loaded from: classes7.dex */
final class ppv implements DialogInterface.OnDismissListener {
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        bvrj.UI_THREAD.c();
        ppw.a--;
    }
}
