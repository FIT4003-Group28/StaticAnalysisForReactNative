package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amxm  reason: default package */
/* loaded from: classes2.dex */
public final class amxm implements amxn {
    public final Set<Integer> a;
    private final float b;
    private final List<akrk> c;

    public amxm(akrk akrkVar) {
        this.a = new HashSet();
        this.b = 1.0f;
        ArrayList a = dchl.a();
        this.c = a;
        a.add(akrkVar);
    }

    @Override // defpackage.amxn
    public final boolean d(amxr amxrVar) {
        synchronized (this.a) {
            char c = 0;
            int i = 0;
            while (i < this.c.size()) {
                if (!this.a.contains(Integer.valueOf(i))) {
                    akrk akrkVar = this.c.get(i);
                    float f = this.b;
                    if (amxrVar.a != null && akrkVar.a().p((int) Math.ceil((akyx.e(amxrVar.c) * f) / 2.0f)).k(amxrVar.a)) {
                        float f2 = (amxrVar.f + (f / 2.0f)) * 10.0f;
                        float f3 = f2 * f2;
                        akra akraVar = new akra(Math.round(amxrVar.e[c] * 10.0f), Math.round(amxrVar.e[1] * 10.0f));
                        akra akraVar2 = new akra();
                        akra akraVar3 = new akra();
                        akra akraVar4 = new akra();
                        akra akraVar5 = new akra();
                        int i2 = 0;
                        boolean z = false;
                        while (i2 < akrkVar.l()) {
                            akrkVar.n(i2, akraVar3);
                            if (akyx.o(amxrVar.c, akraVar3, amxrVar.g)) {
                                akraVar4.t(Math.round(amxrVar.g[c] * 10.0f), Math.round(amxrVar.g[1] * 10.0f));
                                if (z && akra.M(akraVar5, akraVar4, akraVar, akraVar2) <= f3) {
                                    return true;
                                }
                                akraVar5.aa(akraVar4);
                                z = true;
                            }
                            i2++;
                            c = 0;
                        }
                        continue;
                    }
                }
                i++;
                c = 0;
            }
            return false;
        }
    }

    public amxm(float f, List<akrk> list) {
        this.a = new HashSet();
        this.b = f;
        this.c = list;
    }
}
