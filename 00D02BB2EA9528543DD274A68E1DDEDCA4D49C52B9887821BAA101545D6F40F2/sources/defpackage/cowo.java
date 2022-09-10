package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cowo  reason: default package */
/* loaded from: classes5.dex */
public final class cowo extends cowq {
    final /* synthetic */ String a;
    final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cowo(GoogleApiClient googleApiClient, String str, String str2) {
        super(googleApiClient);
        this.a = str;
        this.k = str2;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cowh cowhVar) {
        cowh cowhVar2 = cowhVar;
        String str = this.a;
        String str2 = this.k;
        cowe coweVar = new cowe(this);
        cnvk cnvkVar = null;
        try {
            cnvkVar = cowhVar2.T().g(coweVar, str, str2);
        } catch (RemoteException unused) {
            coweVar.c(8, null, null, null);
        }
        u(cnvkVar);
    }
}
