package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmyi  reason: default package */
/* loaded from: classes5.dex */
final class cmyi implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ Context a;
    final /* synthetic */ cmyk b;

    public cmyi(cmyk cmykVar, Context context) {
        this.b = cmykVar;
        this.a = context;
    }

    @Override // defpackage.cnpv
    public final void Ph(Bundle bundle) {
        cmyk cmykVar = this.b;
        cmykVar.e(this.a, cmykVar.c);
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }
}
