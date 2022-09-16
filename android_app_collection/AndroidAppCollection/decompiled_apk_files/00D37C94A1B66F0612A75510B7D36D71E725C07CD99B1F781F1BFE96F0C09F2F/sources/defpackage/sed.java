package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: sed  reason: default package */
/* loaded from: classes4.dex */
public final class sed implements sdl {
    public final see a;

    public sed(see seeVar) {
        this.a = seeVar;
    }

    @Override // defpackage.sdl
    public final List b(List list, sek sekVar, int i, sbz sbzVar, sdj sdjVar, sda sdaVar, set setVar, boolean z) {
        sep sepVar;
        ArrayList f = sbv.f(this.a.f(sekVar));
        sdu it = this.a.e(sekVar).iterator();
        int[] g = this.a.g();
        sdb sdbVar = new sdb();
        int i2 = 0;
        while (i2 < g.length) {
            int i3 = g[i2];
            f.clear();
            it.b(i3);
            while (it.hasNext()) {
                f.add(Double.valueOf(it.mo416next().doubleValue()));
            }
            List a = sdjVar.a(f);
            if (!z || f.isEmpty()) {
                sepVar = setVar;
            } else {
                sep h = setVar.h();
                h.j((Double) f.get(0));
                h.j((Double) f.get(f.size() - 1));
                sepVar = h;
            }
            sdbVar = sdaVar.e(f, a, i, sepVar, i2 < g.length + (-1));
            if (!sdbVar.a) {
                return sdbVar.b;
            }
            i2++;
        }
        return sdbVar.b;
    }
}
