package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;
/* compiled from: PG */
/* renamed from: alrh  reason: default package */
/* loaded from: classes.dex */
final class alrh extends alrn {
    final /* synthetic */ alri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrh(alri alriVar, alvg alvgVar) {
        super(alriVar, alvgVar);
        this.a = alriVar;
        new alrz("OnRequestInstallCallback");
    }

    @Override // defpackage.alrn
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (alri.a(bundle) != 0) {
            this.b.a(new alrs(alri.a(bundle)));
            return;
        }
        alvg alvgVar = this.b;
        alri alriVar = this.a;
        bundle.getInt("version.code", -1);
        int i = bundle.getInt("update.availability");
        int i2 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        alvgVar.b(new alqw(i, i2, bundle.getLong("additional.size.required"), alrj.a(new File(alriVar.e.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
