package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ypd  reason: default package */
/* loaded from: classes7.dex */
final class ypd implements DialogInterface.OnCancelListener {
    final /* synthetic */ yph a;

    public ypd(yph yphVar) {
        this.a = yphVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        yph yphVar = this.a;
        yphVar.e = false;
        yphVar.d = null;
    }
}
