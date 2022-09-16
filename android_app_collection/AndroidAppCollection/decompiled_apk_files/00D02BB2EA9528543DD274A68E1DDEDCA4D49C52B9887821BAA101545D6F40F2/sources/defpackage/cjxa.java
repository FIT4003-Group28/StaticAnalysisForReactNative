package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: cjxa  reason: default package */
/* loaded from: classes4.dex */
final class cjxa implements DialogInterface.OnClickListener {
    final /* synthetic */ cjxc a;
    final /* synthetic */ boolean b;

    public cjxa(cjxc cjxcVar, boolean z) {
        this.a = cjxcVar;
        this.b = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cjxc cjxcVar = this.a;
        if (cjxcVar != null) {
            cjxcVar.b(this.b);
        }
    }
}
