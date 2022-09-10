package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: bcpi  reason: default package */
/* loaded from: classes3.dex */
final class bcpi implements DialogInterface.OnClickListener {
    final /* synthetic */ gga a;
    final /* synthetic */ dxio b;

    public bcpi(gga ggaVar, dxio dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        gga ggaVar = this.a;
        dxio dxioVar = this.b;
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", ggaVar.getPackageName(), null));
        ((afha) dxioVar.a()).f(ggaVar, intent, 4);
    }
}
