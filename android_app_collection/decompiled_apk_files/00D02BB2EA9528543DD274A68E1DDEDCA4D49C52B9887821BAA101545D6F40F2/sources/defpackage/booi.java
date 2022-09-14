package defpackage;

import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: booi  reason: default package */
/* loaded from: classes3.dex */
public final class booi implements DialogInterface.OnCancelListener {
    final /* synthetic */ boon a;

    public booi(boon boonVar) {
        this.a = boonVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.d = null;
    }
}
