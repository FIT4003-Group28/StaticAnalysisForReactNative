package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crpf  reason: default package */
/* loaded from: classes5.dex */
public final class crpf {
    public final crpm a;
    public final Map<ddvn, crpn> b = new EnumMap(ddvn.class);
    public final Map<ddvn, ddup> c = new EnumMap(ddvn.class);
    public List<dduq> d = new ArrayList();
    public int e;
    public int f;
    private final crpo g;
    private final crpo h;
    private final crpb i;

    public crpf(crpm crpmVar, crpo crpoVar, crpo crpoVar2, crpb crpbVar) {
        this.a = crpmVar;
        this.g = crpoVar;
        this.h = crpoVar2;
        this.i = crpbVar;
    }

    private final void d(ddvk ddvkVar, ddvn ddvnVar, boolean z, long j, Location location) {
        if (ddvkVar.c) {
            ddvkVar.bF();
            ddvkVar.c = false;
        }
        ddvl ddvlVar = (ddvl) ddvkVar.b;
        ddvl ddvlVar2 = ddvl.p;
        ddvlVar.a |= 2;
        ddvlVar.c = z;
        dstv a = dsvb.a(j);
        if (ddvkVar.c) {
            ddvkVar.bF();
            ddvkVar.c = false;
        }
        ddvl ddvlVar3 = (ddvl) ddvkVar.b;
        a.getClass();
        ddvlVar3.d = a;
        int i = ddvlVar3.a | 4;
        ddvlVar3.a = i;
        ddvlVar3.b = ddvnVar.h;
        ddvlVar3.a = i | 1;
        duhd bZ = duhe.c.bZ();
        double latitude = location.getLatitude();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((duhe) bZ.b).a = latitude;
        double longitude = location.getLongitude();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((duhe) bZ.b).b = longitude;
        if (ddvkVar.c) {
            ddvkVar.bF();
            ddvkVar.c = false;
        }
        ddvl ddvlVar4 = (ddvl) ddvkVar.b;
        duhe bK = bZ.bK();
        bK.getClass();
        ddvlVar4.e = bK;
        ddvlVar4.a |= 8;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (accuracy > 0.0f) {
                int round = Math.round(accuracy * 10.0f);
                if (ddvkVar.c) {
                    ddvkVar.bF();
                    ddvkVar.c = false;
                }
                ddvl ddvlVar5 = (ddvl) ddvkVar.b;
                int i2 = ddvlVar5.a | 32;
                ddvlVar5.a = i2;
                ddvlVar5.g = round;
                ddvlVar5.a = i2 | 64;
                ddvlVar5.h = 68;
            }
        }
        dqvj dqvjVar = this.i.e;
        if (ddvkVar.c) {
            ddvkVar.bF();
            ddvkVar.c = false;
        }
        ddvl ddvlVar6 = (ddvl) ddvkVar.b;
        ddvlVar6.i = dqvjVar.k;
        ddvlVar6.a |= 128;
        if (location.hasBearing() && (e(ddvnVar) || (location.hasSpeed() && location.getSpeed() >= 3.0f))) {
            int round2 = Math.round(location.getBearing());
            if (ddvkVar.c) {
                ddvkVar.bF();
                ddvkVar.c = false;
            }
            ddvl ddvlVar7 = (ddvl) ddvkVar.b;
            ddvlVar7.a |= 512;
            ddvlVar7.k = round2;
        }
        if (location.hasSpeed()) {
            int round3 = Math.round(location.getSpeed() * 10.0f);
            if (ddvkVar.c) {
                ddvkVar.bF();
                ddvkVar.c = false;
            }
            ddvl ddvlVar8 = (ddvl) ddvkVar.b;
            ddvlVar8.a |= 1024;
            ddvlVar8.l = round3;
        }
        if (location.hasAltitude()) {
            int round4 = (int) Math.round(location.getAltitude());
            if (ddvkVar.c) {
                ddvkVar.bF();
                ddvkVar.c = false;
            }
            ddvl ddvlVar9 = (ddvl) ddvkVar.b;
            ddvlVar9.a |= 2048;
            ddvlVar9.m = round4;
        }
        int i3 = this.h.a;
        if (ddvkVar.c) {
            ddvkVar.bF();
            ddvkVar.c = false;
        }
        ddvl ddvlVar10 = (ddvl) ddvkVar.b;
        ddvlVar10.a |= 16384;
        ddvlVar10.o = i3;
    }

    private static boolean e(ddvn ddvnVar) {
        ddvn ddvnVar2 = ddvn.UNKNOWN;
        switch (ddvnVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 5:
                return false;
            case 3:
            case 4:
            case 6:
                return true;
            default:
                throw new RuntimeException();
        }
    }

    public final ddvl a(ddvn ddvnVar, boolean z, long j, GmmLocation gmmLocation) {
        ddvk bZ = ddvl.p.bZ();
        d(bZ, ddvnVar, z, j, gmmLocation);
        if (e(ddvnVar)) {
            boolean g = gmmLocation.g();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvl ddvlVar = (ddvl) bZ.b;
            ddvlVar.a |= 256;
            ddvlVar.j = g;
            Long q = gmmLocation.q();
            if (q != null) {
                long longValue = q.longValue();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddvl ddvlVar2 = (ddvl) bZ.b;
                ddvlVar2.a |= 16;
                ddvlVar2.f = longValue;
            }
        }
        return bZ.bK();
    }

    public final ddvl b(ddvn ddvnVar, boolean z, long j, Location location) {
        ddvk bZ = ddvl.p.bZ();
        d(bZ, ddvnVar, z, j, location);
        return bZ.bK();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x0401, code lost:
        if (r2 != r7) goto L283;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ddvl r17) {
        /*
            Method dump skipped, instructions count: 1833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpf.c(ddvl):void");
    }
}
