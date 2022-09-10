package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: askv  reason: default package */
/* loaded from: classes2.dex */
public final class askv {
    public final HashMap<asku, aslg> a = new HashMap<>();

    public askv(btvo btvoVar, cjqq cjqqVar, arym arymVar, akza akzaVar) {
        int i = 2;
        boolean[] zArr = {true, false};
        int i2 = 0;
        while (i2 < i) {
            boolean z = zArr[i2];
            int i3 = 0;
            while (i3 < i) {
                boolean z2 = zArr[i3];
                askt d = asku.d();
                d.b(dvdm.CAMERA_2D_NORTH_UP);
                d.c(z2);
                d.d(z);
                asku a = d.a();
                this.a.put(a, new aslc(btvoVar, a, arymVar, alah.LOCATION_ONLY));
                askt d2 = asku.d();
                d2.b(dvdm.CAMERA_2D_HEADING_UP);
                d2.c(z2);
                d2.d(z);
                asku a2 = d2.a();
                this.a.put(a2, new aslc(btvoVar, a2, arymVar, alah.LOCATION_AND_BEARING));
                askt d3 = asku.d();
                d3.b(dvdm.CAMERA_3D);
                d3.c(z2);
                d3.d(z);
                asku a3 = d3.a();
                this.a.put(a3, new aslb(btvoVar, cjqqVar, a3, alah.LOCATION_AND_BEARING, akzaVar));
                i3++;
                i = 2;
            }
            i2++;
            i = 2;
        }
    }

    public final aslg a(dvdm dvdmVar, boolean z, boolean z2) {
        askt d = asku.d();
        d.b(dvdmVar);
        d.c(z);
        d.d(z2);
        aslg aslgVar = this.a.get(d.a());
        dbsk.s(aslgVar);
        return aslgVar;
    }
}
