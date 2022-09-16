package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: booj  reason: default package */
/* loaded from: classes3.dex */
final class booj implements DialogInterface.OnCancelListener {
    final /* synthetic */ boon a;

    public booj(boon boonVar) {
        this.a = boonVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.d = null;
    }
}
