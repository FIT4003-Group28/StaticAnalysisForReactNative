package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: cwop  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cwop implements dbrn {
    static final dbrn a = new cwop();

    private cwop() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        int i = cwoq.b;
        cowv c = ((couj) obj).c();
        ArrayList arrayList = new ArrayList();
        Iterator<cowu> it = c.iterator();
        while (it.hasNext()) {
            cowu next = it.next();
            if (next.F()) {
                arrayList.add(cwor.a.a(next));
            }
        }
        return dcdc.r(arrayList);
    }
}
