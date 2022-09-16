package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: vff  reason: default package */
/* loaded from: classes4.dex */
public final class vff extends vfk {
    private final amuk a;

    @Deprecated
    public vff(List list) {
        amuf f = amuk.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!amps.e(str)) {
                ampq a = vfh.a(str);
                if (a.h()) {
                    f.h((vfh) a.c());
                }
            }
        }
        this.a = f.g();
    }

    @Override // defpackage.vfk
    protected final boolean b(String str) {
        amuk amukVar = this.a;
        int i = ((amxx) amukVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            vfh vfhVar = (vfh) amukVar.get(i2);
            if (vfhVar != null && vfhVar.a.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
