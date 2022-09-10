package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: wqb  reason: default package */
/* loaded from: classes7.dex */
final class wqb implements DialogInterface.OnCancelListener {
    final /* synthetic */ wqd a;

    public wqb(wqd wqdVar) {
        this.a = wqdVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.k();
    }
}
