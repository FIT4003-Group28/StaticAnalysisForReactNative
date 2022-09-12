package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amld  reason: default package */
/* loaded from: classes.dex */
public final class amld<T> {
    public final amkz a;
    public final amkz b;
    private final int e;
    private final List<amlc<T>> c = new ArrayList();
    private final List<amlc<T>> d = new ArrayList();
    private final amlb f = new amlb();

    public amld(amkz amkzVar, amkz amkzVar2) {
        this.a = amkzVar;
        this.b = amkzVar2;
        int ceil = (int) Math.ceil(amkzVar.b() / 350.0f);
        int ceil2 = ((int) Math.ceil(amkzVar.c() / 250.0f)) * ceil;
        this.e = ceil;
        for (int i = 0; i < ceil2; i++) {
            this.c.add(null);
            this.d.add(null);
        }
    }

    private final void c(amla amlaVar) {
        akse akseVar = amlaVar.f;
        float f = akseVar.b;
        float f2 = akseVar.c;
        float f3 = f;
        float f4 = f3;
        float f5 = f2;
        for (int i = 1; i < 4; i++) {
            akse d = amlaVar.d(i);
            f3 = Math.min(d.b, f3);
            f2 = Math.min(d.c, f2);
            f4 = Math.max(d.b, f4);
            f5 = Math.max(d.c, f5);
        }
        amkz amkzVar = this.a;
        float f6 = amkzVar.a;
        float f7 = amkzVar.b;
        this.f.a = (int) Math.max((double) dcyn.a, Math.floor((f3 - f6) / 350.0f));
        this.f.c = (int) Math.min(this.e, Math.ceil((f4 - f6) / 350.0f));
        this.f.b = (int) Math.max((double) dcyn.a, Math.floor((f2 - f7) / 250.0f));
        this.f.d = (int) Math.min(this.c.size() / this.e, Math.ceil((f5 - f7) / 250.0f));
    }

    public final boolean a(amlg<T> amlgVar, amli<amlg<T>> amliVar, int i) {
        amlc<T> amlcVar;
        if (!this.a.e(amlgVar.b.b)) {
            return false;
        }
        c(amlgVar.b);
        int i2 = this.f.a;
        while (true) {
            amlb amlbVar = this.f;
            if (i2 >= amlbVar.c) {
                return true;
            }
            for (int i3 = amlbVar.b; i3 < this.f.d; i3++) {
                amlc<T> amlcVar2 = this.c.get((this.e * i3) + i2);
                if (amlcVar2 != null && amlcVar2.b(amlgVar, amliVar)) {
                    return false;
                }
                if (i == 2 && (amlcVar = this.d.get((this.e * i3) + i2)) != null && amlcVar.b(amlgVar, amliVar)) {
                    return false;
                }
            }
            i2++;
        }
    }

    public final boolean b(amlg<T> amlgVar, amli<amlg<T>> amliVar, int i) {
        if (!this.a.e(amlgVar.b.b)) {
            return false;
        }
        c(amlgVar.b);
        if (!a(amlgVar, amliVar, i)) {
            return false;
        }
        int i2 = this.f.a;
        while (true) {
            amlb amlbVar = this.f;
            if (i2 >= amlbVar.c) {
                return true;
            }
            for (int i3 = amlbVar.b; i3 < this.f.d; i3++) {
                if (i - 1 == 1) {
                    amlc<T> amlcVar = this.d.get((this.e * i3) + i2);
                    if (amlcVar == null) {
                        amlcVar = new amlc<>();
                        this.d.set((this.e * i3) + i2, amlcVar);
                    }
                    amlcVar.a(amlgVar);
                } else {
                    amlc<T> amlcVar2 = this.c.get((this.e * i3) + i2);
                    if (amlcVar2 == null) {
                        amlcVar2 = new amlc<>();
                        this.c.set((this.e * i3) + i2, amlcVar2);
                    }
                    amlcVar2.a(amlgVar);
                }
            }
            i2++;
        }
    }
}
