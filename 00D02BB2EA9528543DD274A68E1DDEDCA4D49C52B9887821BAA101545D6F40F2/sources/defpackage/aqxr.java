package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: aqxr  reason: default package */
/* loaded from: classes.dex */
final class aqxr implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ aqxv a;

    public aqxr(aqxv aqxvVar) {
        this.a = aqxvVar;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        aqxw aqxwVar = this.a.b;
        if (aqxwVar != null) {
            aqxwVar.a();
        }
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
