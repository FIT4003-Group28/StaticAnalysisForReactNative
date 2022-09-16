package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gmm.locationsharing.reporting.ReporterService;
/* compiled from: PG */
/* renamed from: ajmx  reason: default package */
/* loaded from: classes2.dex */
public final class ajmx {
    public final btvo a;
    public final ckcw b;

    public ajmx(btvo btvoVar, ckcw ckcwVar) {
        this.a = btvoVar;
        this.b = ckcwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Application application, dqyy dqyyVar, dqza dqzaVar, dqzg dqzgVar, dcep<btlu> dcepVar, dcep<dqym> dcepVar2, boolean z, dbsg<dqxv> dbsgVar) {
        Intent intent = new Intent(application, ReporterService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("extra_show_notification", z);
        bundle.putByteArray("extra_collection_parameters", dqyyVar.bR().G());
        bundle.putByteArray("extra_quality_requirements", dqzaVar.bR().G());
        bundle.putByteArray("extra_upload_parameters", dqzgVar.bR().G());
        bundle.putIntegerArrayList("extra_collection_reasons", dchl.c(dcft.o(dcepVar2, ajmv.a)));
        bundle.putStringArrayList("extra_accounts", dchl.c(dcft.o(dcepVar, ajmw.a)));
        if (dbsgVar.a()) {
            bundle.putByteArray("extra_active_ovenfresh", dbsgVar.b().bK().bR().G());
        }
        intent.putExtras(bundle);
        return intent;
    }
}
