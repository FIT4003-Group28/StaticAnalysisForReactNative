package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.SendMessageResponse;
/* compiled from: PG */
/* renamed from: cpjv  reason: default package */
/* loaded from: classes5.dex */
final class cpjv extends cpjq<cpjc> {
    public cpjv(cnph<cpjc> cnphVar) {
        super(cnphVar);
    }

    @Override // defpackage.cphh, defpackage.cpiu
    public final void d(SendMessageResponse sendMessageResponse) {
        Status a = cpjo.a(sendMessageResponse.a);
        int i = sendMessageResponse.b;
        C(new cpjc(a));
    }
}
