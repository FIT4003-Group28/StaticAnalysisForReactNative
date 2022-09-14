package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: aqys  reason: default package */
/* loaded from: classes2.dex */
final class aqys implements DialogInterface.OnCancelListener {
    final /* synthetic */ cjxc a;

    public aqys(cjxc cjxcVar) {
        this.a = cjxcVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.b(false);
    }
}
