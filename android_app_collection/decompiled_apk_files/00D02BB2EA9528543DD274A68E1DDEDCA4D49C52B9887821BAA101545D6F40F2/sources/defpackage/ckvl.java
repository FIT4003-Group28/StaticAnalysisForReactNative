package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckvl  reason: default package */
/* loaded from: classes4.dex */
public final class ckvl implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ ckvo a;

    public ckvl(ckvo ckvoVar) {
        this.a = ckvoVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
        ckvo ckvoVar = this.a;
        if (ckvoVar.c != 2) {
            return;
        }
        ckvoVar.e();
    }
}
