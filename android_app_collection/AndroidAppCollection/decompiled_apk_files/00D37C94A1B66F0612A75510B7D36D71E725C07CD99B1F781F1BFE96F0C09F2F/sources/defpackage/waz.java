package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: waz  reason: default package */
/* loaded from: classes4.dex */
final class waz implements DialogInterface.OnClickListener {
    final /* synthetic */ wba a;

    public waz(wba wbaVar) {
        this.a = wbaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", this.a.mJ().getPackageName(), null));
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        this.a.am(intent);
    }
}
