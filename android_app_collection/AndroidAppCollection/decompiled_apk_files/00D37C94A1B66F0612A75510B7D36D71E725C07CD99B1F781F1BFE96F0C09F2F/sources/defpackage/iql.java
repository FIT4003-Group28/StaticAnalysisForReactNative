package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: iql  reason: default package */
/* loaded from: classes3.dex */
final class iql implements DialogInterface.OnClickListener {
    final /* synthetic */ iqp a;

    public iql(iqp iqpVar) {
        this.a = iqpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.aE(new iqk(this));
        dialogInterface.dismiss();
    }
}
