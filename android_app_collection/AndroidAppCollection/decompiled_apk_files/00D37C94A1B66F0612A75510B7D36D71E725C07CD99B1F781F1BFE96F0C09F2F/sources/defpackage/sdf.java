package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sdf  reason: default package */
/* loaded from: classes4.dex */
public final class sdf implements sdj {
    private final /* synthetic */ int a;

    public sdf() {
    }

    public sdf(int i) {
        this.a = i;
    }

    @Override // defpackage.sdj
    public final List a(List list) {
        boolean z;
        if (this.a == 0) {
            ArrayList f = sbv.f(list.size());
            for (Object obj : list) {
                f.add(obj.toString());
            }
            return f;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            double doubleValue = ((Number) it.next()).doubleValue();
            if (Math.floor(doubleValue) != doubleValue) {
                z = false;
                break;
            }
        }
        ArrayList f2 = sbv.f(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            f2.add(sdk.a((Number) it2.next(), z));
        }
        if (list.size() > 1 && ((Number) list.get(0)).doubleValue() == 0.0d) {
            f2.set(0, "");
        }
        return f2;
    }
}
