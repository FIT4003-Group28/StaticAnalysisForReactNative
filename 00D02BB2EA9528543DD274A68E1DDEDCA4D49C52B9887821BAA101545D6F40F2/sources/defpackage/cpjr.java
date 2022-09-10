package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
/* compiled from: PG */
/* renamed from: cpjr  reason: default package */
/* loaded from: classes5.dex */
final class cpjr extends cpjq<cphy> {
    public cpjr(cnph<cphy> cnphVar) {
        super(cnphVar);
    }

    @Override // defpackage.cphh, defpackage.cpiu
    public final void c(DeleteDataItemsResponse deleteDataItemsResponse) {
        Status a = cpjo.a(deleteDataItemsResponse.a);
        int i = deleteDataItemsResponse.b;
        C(new cphy(a));
    }
}
