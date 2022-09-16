package defpackage;

import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpjs  reason: default package */
/* loaded from: classes5.dex */
final class cpjs extends cpjq<cpjg> {
    public cpjs(cnph<cpjg> cnphVar) {
        super(cnphVar);
    }

    @Override // defpackage.cphh, defpackage.cpiu
    public final void e(GetConnectedNodesResponse getConnectedNodesResponse) {
        ArrayList arrayList = new ArrayList();
        List<NodeParcelable> list = getConnectedNodesResponse.b;
        if (list != null) {
            arrayList.addAll(list);
        }
        C(new cpjg(cpjo.a(getConnectedNodesResponse.a), arrayList));
    }
}
