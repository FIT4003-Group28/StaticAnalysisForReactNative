package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cows  reason: default package */
/* loaded from: classes5.dex */
public final class cows extends cout {
    final /* synthetic */ cowc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cows(GoogleApiClient googleApiClient, cowc cowcVar) {
        super(googleApiClient);
        this.a = cowcVar;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cowh cowhVar) {
        cowhVar.S(this.a);
        p(Status.a);
    }
}
