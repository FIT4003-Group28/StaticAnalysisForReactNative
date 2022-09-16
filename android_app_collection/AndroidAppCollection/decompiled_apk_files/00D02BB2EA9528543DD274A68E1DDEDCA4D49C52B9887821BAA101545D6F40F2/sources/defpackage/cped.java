package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.UdcSettingDisplayInfoRequest;
/* compiled from: PG */
/* renamed from: cped  reason: default package */
/* loaded from: classes5.dex */
public final class cped extends cpeo {
    final /* synthetic */ UdcSettingDisplayInfoRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cped(GoogleApiClient googleApiClient, UdcSettingDisplayInfoRequest udcSettingDisplayInfoRequest) {
        super(googleApiClient);
        this.a = udcSettingDisplayInfoRequest;
    }

    @Override // defpackage.cpep
    protected final void a(Context context, cpeb cpebVar) {
        dsnr bZ = dsns.f.bZ();
        int i = this.a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsns dsnsVar = (dsns) bZ.b;
        dsrf dsrfVar = dsnsVar.d;
        if (!dsrfVar.a()) {
            dsnsVar.d = dsqw.cg(dsrfVar);
        }
        dsnsVar.d.h(i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsns dsnsVar2 = (dsns) bZ.b;
        dsnsVar2.a |= 4;
        dsnsVar2.c = false;
        UdcSettingDisplayInfoRequest udcSettingDisplayInfoRequest = this.a;
        dsob a = cpew.a(context, udcSettingDisplayInfoRequest.b, udcSettingDisplayInfoRequest.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsns dsnsVar3 = (dsns) bZ.b;
        a.getClass();
        dsnsVar3.e = a;
        int i2 = dsnsVar3.a | 8;
        dsnsVar3.a = i2;
        String str = this.a.d;
        if (str != null) {
            str.getClass();
            dsnsVar3.a = i2 | 2;
            dsnsVar3.b = str;
        }
        cpebVar.f(this.k, bZ.bK().bS());
    }
}
