package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cown  reason: default package */
/* loaded from: classes5.dex */
public final class cown extends cowq {
    final /* synthetic */ String a;
    final /* synthetic */ String k = null;
    final /* synthetic */ int l;
    final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cown(GoogleApiClient googleApiClient, String str, String str2, int i, int i2) {
        super(googleApiClient);
        this.a = str;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cowh cowhVar) {
        cowh cowhVar2 = cowhVar;
        String str = this.a;
        int i = this.l;
        int i2 = this.m;
        cowe coweVar = new cowe(this);
        cnvk cnvkVar = null;
        try {
            cnvkVar = cowhVar2.T().f(coweVar, str, null, i, i2);
        } catch (RemoteException unused) {
            coweVar.c(8, null, null, null);
        }
        u(cnvkVar);
    }
}
