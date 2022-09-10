package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: csvi  reason: default package */
/* loaded from: classes5.dex */
final class csvi implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ GoogleApiClient a;
    final /* synthetic */ deig b;
    final /* synthetic */ csvk c;

    public csvi(csvk csvkVar, GoogleApiClient googleApiClient, deig deigVar) {
        this.c = csvkVar;
        this.a = googleApiClient;
        this.b = deigVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        final csvk csvkVar = this.c;
        final GoogleApiClient googleApiClient = this.a;
        final deig deigVar = this.b;
        cnoa<cmss> cnoaVar = cmso.a;
        googleApiClient.execute(new cmtc(googleApiClient)).j(new cnon(csvkVar, deigVar, googleApiClient) { // from class: csvh
            private final csvk a;
            private final deig b;
            private final GoogleApiClient c;

            {
                this.a = csvkVar;
                this.b = deigVar;
                this.c = googleApiClient;
            }

            @Override // defpackage.cnon
            public final void Om(cnom cnomVar) {
                csvk csvkVar2 = this.a;
                deig deigVar2 = this.b;
                GoogleApiClient googleApiClient2 = this.c;
                cmte cmteVar = (cmte) cnomVar;
                Status status = cmteVar.a;
                if (status.d()) {
                    if (TextUtils.isEmpty(cmteVar.b)) {
                        deigVar2.k(new Exception("Spatula header is empty"));
                    } else {
                        csvkVar2.b = cmteVar.b;
                        if (String.valueOf(csvkVar2.b).length() == 0) {
                            new String("Spatula header: ");
                        }
                        cstl.a("ClntIntrcptrFctryV12");
                        deigVar2.j(null);
                    }
                } else {
                    String valueOf = String.valueOf(status);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Error generating spatula header: ");
                    sb.append(valueOf);
                    deigVar2.k(new Exception(sb.toString()));
                    csvkVar2.c = null;
                }
                googleApiClient2.disconnect();
            }
        }, 20L, TimeUnit.SECONDS);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
