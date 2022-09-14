package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qci  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class qci implements dbrn {
    static final dbrn a = new qci();

    private qci() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        qcn qcnVar = (qcn) obj;
        Bundle bundle = new Bundle();
        dspd b = qcnVar.b();
        bundle.putByteArray("StartCommuteBoardParams.routeToken", b != null ? b.G() : null);
        int c = qcnVar.c();
        int i = c - 1;
        if (c != 0) {
            bundle.putInt("StartCommuteBoardParams.routeTokenType", i);
            bundle.putParcelable("StartCommuteBoardParams.summary", new ProtoBufUtil$ParcelableProtoList(qcnVar.a()));
            return bundle;
        }
        throw null;
    }
}
