package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: akqc  reason: default package */
/* loaded from: classes2.dex */
public final class akqc {
    private akrq a;
    private int b;
    private akra[] c;
    private boolean d;
    private final List<akrj> e = dchl.a();
    private final List<akqb> f = dchl.a();
    private int g;

    public akqc(akrq akrqVar) {
        this.a = akrqVar;
        int w = akrqVar.w();
        this.b = w;
        this.c = new akra[w];
        int i = 0;
        while (true) {
            akra[] akraVarArr = this.c;
            if (i < akraVarArr.length) {
                akraVarArr[i] = new akra();
                i++;
            } else {
                return;
            }
        }
    }

    private final void c(int i, akra akraVar, long j, boolean z, float f) {
        akra x;
        akra x2;
        if (i == this.b) {
            if (z) {
                if (this.g == this.e.size()) {
                    this.e.add(new akrj());
                    this.f.add(new akqb());
                }
                this.g++;
            }
            akrj akrjVar = this.e.get(this.g - 1);
            if (akrjVar.a(akraVar) && this.d) {
                akqb akqbVar = this.f.get(this.g - 1);
                int i2 = akqbVar.b;
                long[] jArr = akqbVar.a;
                int length = jArr.length;
                if (i2 == length) {
                    akqbVar.a = Arrays.copyOf(jArr, length + length);
                }
                long[] jArr2 = akqbVar.a;
                int i3 = akqbVar.b;
                akqbVar.b = i3 + 1;
                jArr2[i3] = j;
            }
            if (!z) {
                return;
            }
            akrjVar.b = f;
            return;
        }
        if (i == 0) {
            x = this.a.y();
            x2 = this.a.x(0);
        } else {
            x = this.a.x(i - 1);
            x2 = this.a.x(i);
        }
        if (akrb.a(x, x2, akraVar) >= 0) {
            if (!z && akrb.a(x, x2, this.c[i]) < 0) {
                akra akraVar2 = new akra();
                akrb.i(x, x2, akraVar, this.c[i], akraVar2);
                c(i + 1, akraVar2, j, true, f - akraVar.y(akraVar2));
            }
            c(i + 1, akraVar, j, z, f);
        } else if (!z && akrb.a(x, x2, this.c[i]) >= 0) {
            akra akraVar3 = new akra();
            akrb.i(x, x2, this.c[i], akraVar, akraVar3);
            c(i + 1, akraVar3, j, false, f - akraVar.y(akraVar3));
        }
        this.c[i].aa(akraVar);
    }

    public final void a(akrk akrkVar, List<akrk> list) {
        b(akrkVar, null, list, null);
    }

    public final void b(akrk akrkVar, long[] jArr, List<akrk> list, @dzsi List<long[]> list2) {
        this.g = 0;
        this.d = (jArr == null || list2 == null) ? false : true;
        akrp a = akrkVar.a();
        if (!this.a.k(a)) {
            return;
        }
        if (this.a.l(a)) {
            list.add(akrkVar);
            if (jArr == null || list2 == null) {
                return;
            }
            list2.add(jArr);
            return;
        }
        akra akraVar = new akra();
        akra akraVar2 = new akra();
        akrkVar.n(0, akraVar);
        akrkVar.n(0, akraVar2);
        float f = akrkVar.c;
        c(0, akraVar, (jArr == null || list2 == null) ? 0L : jArr[0], true, f);
        for (int i = 1; i < akrkVar.l(); i++) {
            akrkVar.n(i, akraVar);
            float y = f + akraVar.y(akraVar2);
            akrkVar.n(i, akraVar2);
            f = y;
            c(0, akraVar, (jArr == null || list2 == null) ? 0L : jArr[i], false, f);
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            akrj akrjVar = this.e.get(i2);
            if (akrjVar.a > 1) {
                list.add(akrjVar.c());
            }
            akrjVar.b();
            if (jArr != null && list2 != null) {
                akqb akqbVar = this.f.get(i2);
                int i3 = akqbVar.b;
                if (i3 > 1) {
                    list2.add(Arrays.copyOf(akqbVar.a, i3));
                }
                akqbVar.b = 0;
            }
        }
    }
}
