package defpackage;

import com.google.geo.imagery.viewer.api.AreaConnectivityRequest;
import com.google.geo.imagery.viewer.api.ConnectivityRequest;
import com.google.geo.imagery.viewer.api.ConnectivityRequestContainer;
import com.google.geo.imagery.viewer.api.ConnectivityService;
import com.google.geo.imagery.viewer.api.ConnectivityServiceSwigJNI;
/* compiled from: PG */
/* renamed from: bwul  reason: default package */
/* loaded from: classes4.dex */
public final class bwul extends ConnectivityService {
    private final buti b;

    public bwul(buti butiVar) {
        this.b = butiVar;
    }

    @Override // com.google.geo.imagery.viewer.api.ConnectivityService
    public final void cancel(AreaConnectivityRequest areaConnectivityRequest) {
    }

    @Override // com.google.geo.imagery.viewer.api.ConnectivityService
    public final void request(ConnectivityRequest connectivityRequest) {
        AreaConnectivityRequest areaConnectivityRequest;
        ConnectivityRequestContainer connectivityRequestContainer = new ConnectivityRequestContainer(ConnectivityServiceSwigJNI.new_RequestContainer(ConnectivityRequest.a(connectivityRequest), connectivityRequest));
        byte[] ConnectivityRequestContainer_rawRequest = ConnectivityServiceSwigJNI.ConnectivityRequestContainer_rawRequest(connectivityRequestContainer.a, connectivityRequestContainer);
        if (ConnectivityRequestContainer_rawRequest == null) {
            areaConnectivityRequest = null;
        } else {
            try {
                areaConnectivityRequest = (AreaConnectivityRequest) dsqw.cq(AreaConnectivityRequest.d, ConnectivityRequestContainer_rawRequest);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.AreaConnectivityRequest protocol message.", e);
            }
        }
        dizc bZ = dizd.d.bZ();
        dpul bZ2 = dpum.d.bZ();
        dhjz dhjzVar = areaConnectivityRequest.c;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        double d = dhjzVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpum dpumVar = (dpum) bZ2.b;
        dpumVar.a |= 1;
        dpumVar.b = d;
        dhjz dhjzVar2 = areaConnectivityRequest.c;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        double d2 = dhjzVar2.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpum dpumVar2 = (dpum) bZ2.b;
        dpumVar2.a |= 2;
        dpumVar2.c = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dizd dizdVar = (dizd) bZ.b;
        dpum bK = bZ2.bK();
        bK.getClass();
        dizdVar.b = bK;
        dizdVar.a |= 2;
        if ((areaConnectivityRequest.a & 1) != 0) {
            String str = areaConnectivityRequest.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dizd dizdVar2 = (dizd) bZ.b;
            str.getClass();
            dizdVar2.a |= 4;
            dizdVar2.c = str;
        }
        dwfy bZ3 = dwge.m.bZ();
        dwfs bZ4 = dwfv.m.bZ();
        dwfp bZ5 = dwfr.h.bZ();
        dize bZ6 = dizf.c.bZ();
        dlwp bZ7 = dlws.c.bZ();
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dlws dlwsVar = (dlws) bZ7.b;
        dlwsVar.b = 2;
        dlwsVar.a |= 1;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dizf dizfVar = (dizf) bZ6.b;
        dlws bK2 = bZ7.bK();
        bK2.getClass();
        dizfVar.b = bK2;
        dizfVar.a |= 1;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dwfr dwfrVar = (dwfr) bZ5.b;
        dizf bK3 = bZ6.bK();
        bK3.getClass();
        dwfrVar.g = bK3;
        dwfrVar.a |= 2;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ4.b;
        dwfr bK4 = bZ5.bK();
        bK4.getClass();
        dwfvVar.c = bK4;
        dwfvVar.a |= 2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwge dwgeVar = (dwge) bZ3.b;
        dwfv bK5 = bZ4.bK();
        bK5.getClass();
        dwgeVar.h = bK5;
        dwgeVar.a |= 128;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwge dwgeVar2 = (dwge) bZ3.b;
        dwgeVar2.b = 6;
        dwgeVar2.a |= 1;
        dizd bK6 = bZ.bK();
        bK6.getClass();
        dwgeVar2.j = bK6;
        dwgeVar2.a |= 4096;
        this.b.a(bZ3.bK(), new bwuk(connectivityRequestContainer), bvrj.BACKGROUND_THREADPOOL);
    }
}
