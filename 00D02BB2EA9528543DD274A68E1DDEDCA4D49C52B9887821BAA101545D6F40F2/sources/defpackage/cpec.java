package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.CheckConsentRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpec  reason: default package */
/* loaded from: classes5.dex */
public final class cpec extends cpel {
    final /* synthetic */ CheckConsentRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpec(GoogleApiClient googleApiClient, CheckConsentRequest checkConsentRequest) {
        super(googleApiClient);
        this.a = checkConsentRequest;
    }

    @Override // defpackage.cpep
    protected final void a(Context context, cpeb cpebVar) {
        int[] iArr;
        dsno bZ = dsnq.g.bZ();
        String str = this.a.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsnq dsnqVar = (dsnq) bZ.b;
        str.getClass();
        dsnqVar.a |= 2;
        dsnqVar.b = str;
        for (int i : this.a.b) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsnq dsnqVar2 = (dsnq) bZ.b;
            dsrf dsrfVar = dsnqVar2.c;
            if (!dsrfVar.a()) {
                dsnqVar2.c = dsqw.cg(dsrfVar);
            }
            dsnqVar2.c.h(i);
        }
        CheckConsentRequest checkConsentRequest = this.a;
        dsob a = cpew.a(context, checkConsentRequest.a, checkConsentRequest.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsnq dsnqVar3 = (dsnq) bZ.b;
        a.getClass();
        dsnqVar3.f = a;
        dsnqVar3.a |= 16;
        dsnq dsnqVar4 = (dsnq) bZ.b;
        dsnqVar4.d = 2;
        dsnqVar4.a |= 4;
        dsnq dsnqVar5 = (dsnq) bZ.b;
        dsnqVar5.e = 1;
        dsnqVar5.a |= 8;
        cpebVar.e(this.k, bZ.bK().bS());
    }
}
