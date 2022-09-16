package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ccm  reason: default package */
/* loaded from: classes2.dex */
public final class ccm implements ccs {
    public static final ccm a = new ccm();
    private static final ccv b = ccv.a("c", "v", "i", "o");

    private ccm() {
    }

    @Override // defpackage.ccs
    public final /* bridge */ /* synthetic */ Object a(ccw ccwVar, float f) {
        if (ccwVar.r() == 1) {
            ccwVar.i();
        }
        ccwVar.j();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (ccwVar.p()) {
            int c = ccwVar.c(b);
            if (c == 0) {
                z = ccwVar.q();
            } else if (c == 1) {
                list = ccd.d(ccwVar, f);
            } else if (c == 2) {
                list2 = ccd.d(ccwVar, f);
            } else if (c == 3) {
                list3 = ccd.d(ccwVar, f);
            } else {
                ccwVar.n();
                ccwVar.o();
            }
        }
        ccwVar.l();
        if (ccwVar.r() == 2) {
            ccwVar.k();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new caw(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = (PointF) list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) list.get(i);
            int i2 = i - 1;
            arrayList.add(new bzq(cdc.f((PointF) list.get(i2), (PointF) list3.get(i2)), cdc.f(pointF2, (PointF) list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = (PointF) list.get(0);
            int i3 = size - 1;
            arrayList.add(new bzq(cdc.f((PointF) list.get(i3), (PointF) list3.get(i3)), cdc.f(pointF3, (PointF) list2.get(0)), pointF3));
        }
        return new caw(pointF, z, arrayList);
    }
}
