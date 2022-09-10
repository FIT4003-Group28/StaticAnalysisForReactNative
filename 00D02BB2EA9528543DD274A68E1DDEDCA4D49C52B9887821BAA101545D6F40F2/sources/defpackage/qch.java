package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qch  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class qch implements dbrn {
    static final dbrn a = new qch();

    private qch() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i;
        Iterable e;
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            return null;
        }
        byte[] byteArray = bundle.getByteArray("StartCommuteBoardParams.routeToken");
        dspd x = byteArray != null ? dspd.x(byteArray) : null;
        int i2 = bundle.getInt("StartCommuteBoardParams.routeTokenType");
        int[] a2 = qcm.a();
        int i3 = 0;
        while (true) {
            if (i3 >= 7) {
                i = 1;
                break;
            }
            i = a2[i3];
            int i4 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == i4) {
                break;
            }
            i3++;
        }
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) bundle.getParcelable("StartCommuteBoardParams.summary");
        if (protoBufUtil$ParcelableProtoList != null) {
            e = protoBufUtil$ParcelableProtoList.a((dssr) dpce.f.cu(7));
        } else {
            e = dcdc.e();
        }
        if (x == null) {
            return qcn.g(i);
        }
        return qcn.f(x, i, e);
    }
}
