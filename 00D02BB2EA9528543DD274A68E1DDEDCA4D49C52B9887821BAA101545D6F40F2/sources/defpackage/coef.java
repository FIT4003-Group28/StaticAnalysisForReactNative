package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.googlehelp.GoogleHelp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coef  reason: default package */
/* loaded from: classes5.dex */
public final class coef extends coeh {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long k;
    final /* synthetic */ GoogleHelp l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coef(GoogleApiClient googleApiClient, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(googleApiClient);
        this.a = bundle;
        this.k = j;
        this.l = googleHelp;
    }

    @Override // defpackage.coeg
    protected final void a(coen coenVar) {
        try {
            coenVar.e(this.a, this.k, this.l, new coee(this));
        } catch (Exception unused) {
            q(coei.a);
        }
    }
}
