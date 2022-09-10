package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: albn  reason: default package */
/* loaded from: classes2.dex */
public final class albn implements amtu {
    public static final dcqe a = dcqe.c("albn");
    private final akrk b;
    @dzsi
    private final akqs c;
    private final dzke d;
    private final List<dbsi<akrk, akqs>> e;
    private final List<dzke> f;
    @dzsi
    private final akrk[][] g;
    @dzsi
    private final akqs[][] h;
    private final dzke i;
    private final dcdc<dwnl> j;
    private final boolean k;
    private final boolean l;
    private final amub m;

    public albn(albm albmVar) {
        akrk e = akrk.e(albmVar.e);
        this.b = e;
        this.c = m(e);
        dzke dzkeVar = albmVar.f;
        int i = ((dzjw) dzkeVar).b;
        if (i > 2) {
            this.d = dzkeVar.k(1, i);
        } else {
            dzjw dzjwVar = new dzjw(1);
            this.d = dzjwVar;
            dzjwVar.b(e.l() - 1);
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        this.e = arrayList;
        arrayList.addAll(Collections.nCopies(this.d.size(), null));
        List<dzke> list = albmVar.g;
        this.f = list;
        this.g = new akrk[list.size()];
        this.h = new akqs[list.size()];
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            int size = this.f.get(i2).size();
            this.g[i2] = new akrk[size];
            this.h[i2] = new akqs[size];
        }
        this.i = new dzjw(albmVar.h);
        this.j = dcdc.r(albmVar.i);
        dcdc.r(albmVar.j);
        this.k = albmVar.b;
        boolean z = albmVar.c;
        this.l = albmVar.d;
        this.m = albmVar.a;
    }

    @dzsi
    private static akqs m(akrk akrkVar) {
        akrp a2 = akrp.a(akrkVar);
        if (a2 == null) {
            return null;
        }
        return akqg.d(aksj.c(a2));
    }

    @dzsi
    private final dbsi<akrk, akqs> n(int i) {
        int size = this.d.size();
        if (i < 0 || i >= size) {
            return null;
        }
        if (size == 1) {
            return dbsi.a(this.b, this.c);
        }
        dbsi<akrk, akqs> dbsiVar = this.e.get(i);
        if (dbsiVar != null) {
            return dbsiVar;
        }
        akrk d = new akru(this.b, i == 0 ? 0 : this.d.t(i - 1).intValue(), this.d.t(i).intValue() + 1).d();
        dbsi<akrk, akqs> a2 = dbsi.a(d, m(d));
        this.e.set(i, a2);
        return a2;
    }

    @Override // defpackage.amtu
    public final akrk a() {
        return this.b;
    }

    @Override // defpackage.amtu
    @dzsi
    public final akrk b(int i) {
        dbsi<akrk, akqs> n = n(i);
        if (n == null) {
            return null;
        }
        return n.a;
    }

    @Override // defpackage.amtu
    @dzsi
    public final akrk c(int i, int i2) {
        akrk[] akrkVarArr;
        int intValue;
        akrk akrkVar = null;
        if (i >= 0) {
            akrk[][] akrkVarArr2 = this.g;
            if (i < akrkVarArr2.length && (akrkVarArr = akrkVarArr2[i]) != null && i2 >= 0 && i2 < akrkVarArr.length && (akrkVar = akrkVarArr[i2]) == null) {
                if (i == 0 && i2 == 0) {
                    intValue = 0;
                } else if (i2 == 0) {
                    intValue = ((Integer) dcft.s(this.f.get(i - 1))).intValue();
                } else {
                    intValue = this.f.get(i).t(i2 - 1).intValue();
                }
                akrk d = new akru(this.b, intValue, this.f.get(i).t(i2).intValue() + 1).d();
                akrkVarArr[i2] = d;
                return d;
            }
        }
        return akrkVar;
    }

    @Override // defpackage.amtu
    @dzsi
    public final akqs d(int i, int i2) {
        akqs[] akqsVarArr;
        if (i >= 0) {
            akqs[][] akqsVarArr2 = this.h;
            if (i < akqsVarArr2.length && (akqsVarArr = akqsVarArr2[i]) != null && i2 >= 0 && i2 < akqsVarArr.length) {
                akqs akqsVar = akqsVarArr[i2];
                if (akqsVar != null) {
                    return akqsVar;
                }
                akrk c = c(i, i2);
                if (c == null) {
                    return null;
                }
                akqs m = m(c);
                akqsVarArr[i2] = m;
                return m;
            }
        }
        return null;
    }

    @Override // defpackage.amtu
    @dzsi
    public final akqs e() {
        return this.c;
    }

    @Override // defpackage.amtu
    @dzsi
    public final akqs f(int i) {
        dbsi<akrk, akqs> n = n(i);
        if (n == null) {
            return null;
        }
        return n.b;
    }

    @Override // defpackage.amtu
    public final dzke g() {
        return this.i;
    }

    @Override // defpackage.amtu
    public final dcdc<dwnl> h() {
        return this.j;
    }

    @Override // defpackage.amtu
    public final boolean i() {
        return this.k;
    }

    @Override // defpackage.amtu
    public final boolean j() {
        return true;
    }

    @Override // defpackage.amtu
    public final boolean k() {
        return this.l;
    }

    @Override // defpackage.amtu
    public final amub l() {
        return this.m;
    }
}
