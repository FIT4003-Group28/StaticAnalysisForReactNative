package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cjwz  reason: default package */
/* loaded from: classes4.dex */
final class cjwz implements DialogInterface.OnCancelListener {
    final /* synthetic */ cjxc a;
    final /* synthetic */ boolean b;

    public cjwz(cjxc cjxcVar, boolean z) {
        this.a = cjxcVar;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        cjxc cjxcVar = this.a;
        if (cjxcVar != null) {
            cjxcVar.b(this.b);
        }
    }
}
