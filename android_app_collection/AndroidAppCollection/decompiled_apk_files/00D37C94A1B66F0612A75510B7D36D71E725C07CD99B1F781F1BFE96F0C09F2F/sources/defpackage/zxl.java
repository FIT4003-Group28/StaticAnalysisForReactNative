package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: zxl  reason: default package */
/* loaded from: classes4.dex */
final class zxl implements DialogInterface.OnCancelListener {
    final /* synthetic */ ild a;

    public zxl(ild ildVar) {
        this.a = ildVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.a();
    }
}
