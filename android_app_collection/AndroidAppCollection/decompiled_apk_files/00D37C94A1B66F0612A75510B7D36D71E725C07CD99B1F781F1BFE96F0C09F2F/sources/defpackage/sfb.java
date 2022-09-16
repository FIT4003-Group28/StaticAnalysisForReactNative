package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sfb  reason: default package */
/* loaded from: classes4.dex */
public final class sfb extends sew {
    private String a = null;

    @Override // defpackage.sfa
    public final boolean e() {
        return this.a != null;
    }

    @Override // defpackage.sfa
    public final int f(sgt sgtVar, Object obj) {
        String str = this.a;
        if (str == null) {
            return 2;
        }
        return str.equals(sgtVar.b) ? 1 : 3;
    }

    @Override // defpackage.sfa
    public final boolean g(List list) {
        String str = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f = Float.MAX_VALUE;
            while (it.hasNext()) {
                sgr sgrVar = (sgr) it.next();
                float pow = (float) (Math.pow(sgrVar.f, 2.0d) + Math.pow(sgrVar.g, 2.0d));
                if (pow < f) {
                    str = sgrVar.c.b;
                    f = pow;
                }
            }
        }
        String str2 = this.a;
        this.a = str;
        a();
        boolean z = true;
        if (str2 != null ? str2.equals(this.a) : this.a == null) {
            z = false;
        }
        if (z) {
            b();
        }
        return z;
    }
}
