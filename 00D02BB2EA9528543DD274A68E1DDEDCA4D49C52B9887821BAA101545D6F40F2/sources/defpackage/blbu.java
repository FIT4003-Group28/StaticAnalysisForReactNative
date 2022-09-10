package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: blbu  reason: default package */
/* loaded from: classes3.dex */
public final class blbu {
    public static boolean a(cqiv cqivVar, blkv blkvVar, int i, boolean z, boolean z2) {
        boolean booleanValue = blkvVar.e().booleanValue();
        ArrayList arrayList = new ArrayList();
        Iterator<blla> it = blkvVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            blla next = it.next();
            if (arrayList.size() >= i) {
                booleanValue = true;
                break;
            } else if (!next.p().booleanValue() || blkvVar.j().booleanValue()) {
                arrayList.add(next);
            }
        }
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (i2 > 0) {
                cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
            }
            blla bllaVar = (blla) arrayList.get(i2);
            int i3 = i2 + 1;
            bllaVar.q(i3);
            if (z) {
                cqivVar.a(new bkwh(), bllaVar);
            } else if (bllaVar.p().booleanValue()) {
                cqivVar.a(new cdsx(), bllaVar);
            } else {
                cqivVar.a(new blbf(), bllaVar);
            }
            Integer valueOf = Integer.valueOf(arrayList.size() - i2);
            if (z2 && booleanValue && valueOf.intValue() > 0 && valueOf.equals(blkvVar.k())) {
                cqivVar.a(new blbt(), blkvVar);
            }
            i2 = i3;
        }
        return booleanValue;
    }
}
