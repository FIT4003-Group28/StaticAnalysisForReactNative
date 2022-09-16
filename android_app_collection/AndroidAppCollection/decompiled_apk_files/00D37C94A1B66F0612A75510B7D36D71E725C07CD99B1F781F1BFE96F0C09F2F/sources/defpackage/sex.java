package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sex  reason: default package */
/* loaded from: classes4.dex */
public final class sex extends sew {
    private Object a = null;

    @Override // defpackage.sfa
    public final boolean e() {
        return this.a != null;
    }

    @Override // defpackage.sfa
    public final int f(sgt sgtVar, Object obj) {
        Object obj2 = this.a;
        if (obj2 == null) {
            return 2;
        }
        return obj2.equals(obj) ? 1 : 3;
    }

    @Override // defpackage.sfa
    public final boolean g(List list) {
        Object obj = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f = Float.MAX_VALUE;
            while (it.hasNext()) {
                sgr sgrVar = (sgr) it.next();
                sgt sgtVar = sgrVar.c;
                float f2 = sgrVar.f;
                if (f2 < f) {
                    obj = sgrVar.e;
                    f = f2;
                }
            }
        }
        Object obj2 = this.a;
        this.a = obj;
        a();
        boolean z = true;
        if (obj2 != null ? obj2.equals(this.a) : this.a == null) {
            z = false;
        }
        if (z) {
            b();
        }
        return z;
    }
}
