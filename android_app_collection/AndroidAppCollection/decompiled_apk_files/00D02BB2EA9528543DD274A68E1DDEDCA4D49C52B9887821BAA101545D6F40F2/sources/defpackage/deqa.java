package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* compiled from: PG */
/* renamed from: deqa  reason: default package */
/* loaded from: classes6.dex */
final class deqa extends depz {
    private final cpct<dept> a;
    private final delh b;

    public deqa(delh delhVar, cpct<dept> cpctVar) {
        this.b = delhVar;
        this.a = cpctVar;
    }

    @Override // defpackage.depz, defpackage.deqf
    public final void b(Status status, DynamicLinkData dynamicLinkData) {
        Bundle bundle;
        cntf.b(status, dynamicLinkData == null ? null : new dept(dynamicLinkData), this.a);
        if (dynamicLinkData == null || (bundle = dynamicLinkData.a().getBundle("scionData")) == null || bundle.keySet() == null || this.b == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            this.b.a("fdl", str, bundle.getBundle(str));
        }
    }
}
