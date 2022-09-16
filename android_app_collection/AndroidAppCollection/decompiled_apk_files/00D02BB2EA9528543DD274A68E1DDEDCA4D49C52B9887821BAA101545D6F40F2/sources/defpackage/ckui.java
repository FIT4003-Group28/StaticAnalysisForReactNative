package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ckui  reason: default package */
/* loaded from: classes4.dex */
final class ckui implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ ckuj a;

    public ckui(ckuj ckujVar) {
        this.a = ckujVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        String str;
        String str2;
        synchronized (this.a.b) {
            ckuj ckujVar = this.a;
            str = ckujVar.c;
            str2 = ckujVar.d;
        }
        ckuj ckujVar2 = this.a;
        dbsk.s(str);
        dbsk.s(str2);
        cnoa<copa> cnoaVar = cool.a;
        GoogleApiClient googleApiClient = ckujVar2.a;
        boolean z = false;
        String[] strArr = {str2};
        cnwc.e(true, "placeIds == null");
        cnwc.e(true, "placeIds is empty");
        String str3 = strArr[0];
        if (str3 != null) {
            z = true;
        }
        cnwc.e(z, "placeId == null");
        cnwc.e(true ^ str3.isEmpty(), "placeId is empty");
        googleApiClient.enqueue(new coox(cool.c, googleApiClient, strArr)).i(new ckuh(ckujVar2, str, str2));
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
