package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxw  reason: default package */
/* loaded from: classes.dex */
public final class azxw extends azxm<azwo> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.PARKING_LOCATION;
    }

    @Override // defpackage.azxm
    public final azwh<azwo> c(byte[] bArr) {
        try {
            return new azwn((dpzm) dsqw.cq(dpzm.j, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        return dcdc.e();
    }

    @Override // defpackage.azxm
    public final List<azwo> e(doiz doizVar) {
        ArrayList arrayList = new ArrayList();
        if (doizVar.b == 15) {
            for (dntq dntqVar : ((dohy) doizVar.c).a) {
                int a = dntp.a(dntqVar.b);
                if (a != 0 && a == 2) {
                    dpzm dpzmVar = dntqVar.c;
                    if (dpzmVar == null) {
                        dpzmVar = dpzm.j;
                    }
                    arrayList.add(new azwn(dpzmVar).b());
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azwo azwoVar) {
        return azwoVar.g().bS();
    }

    @Override // defpackage.azxm
    public final ckhg g() {
        return ckkf.k;
    }
}
