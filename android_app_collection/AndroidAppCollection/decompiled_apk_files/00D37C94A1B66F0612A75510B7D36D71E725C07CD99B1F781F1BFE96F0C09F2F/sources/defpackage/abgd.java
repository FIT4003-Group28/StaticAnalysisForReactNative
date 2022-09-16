package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: abgd  reason: default package */
/* loaded from: classes.dex */
public final class abgd {
    final SparseArray a = new SparseArray();
    public int b = 0;

    private abgd() {
    }

    public static abgd a(aoog aoogVar, alzi alziVar) {
        abgd abgdVar = new abgd();
        abgdVar.c(aoogVar, alziVar);
        return abgdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v0, types: [abgd] */
    private final void c(aoog aoogVar, alzi alziVar) {
        aoob aoobVar;
        while (true) {
            int n = aoogVar.n();
            if (n > 0) {
                int a = aosl.a(n);
                alzi e = alziVar.e(a);
                if (!e.c.isEmpty() || e.d) {
                    this.b += aool.ae(n);
                    int b = aosl.b(n);
                    if (b == 0) {
                        long s = ((aooc) aoogVar).s();
                        this.b += aool.ag(s);
                        aoobVar = Long.valueOf(s);
                    } else if (b == 1) {
                        long r = ((aooc) aoogVar).r();
                        this.b += 8;
                        aoobVar = Long.valueOf(r);
                    } else if (b == 2) {
                        alzi e2 = alziVar.e(a);
                        if (akzj.f(e2, alzi.b)) {
                            aoob x = aoogVar.x();
                            this.b += aool.J(x);
                            aoobVar = x;
                        } else {
                            int k = aoogVar.k();
                            this.b += aool.ae(k);
                            int e3 = aoogVar.e();
                            int f = aoogVar.f(k);
                            ?? abgdVar = new abgd();
                            abgdVar.c(aoogVar, e2);
                            aoogVar.C(f);
                            int e4 = aoogVar.e() - e3;
                            if (e4 == k) {
                                this.b += abgdVar.b;
                                aoobVar = abgdVar;
                            } else {
                                StringBuilder sb = new StringBuilder(43);
                                sb.append("Mismatched size: ");
                                sb.append(k);
                                sb.append(" != ");
                                sb.append(e4);
                                throw new aopw(sb.toString());
                            }
                        }
                    } else if (b == 5) {
                        int j = ((aooc) aoogVar).j();
                        this.b += 4;
                        aoobVar = Integer.valueOf(j);
                    } else {
                        throw new aopw("Unexpected wire type");
                    }
                } else {
                    aoogVar.G(n);
                    aoobVar = null;
                }
                if (aoobVar != null) {
                    int indexOfKey = this.a.indexOfKey(n);
                    if (indexOfKey < 0) {
                        this.a.append(n, aoobVar);
                    } else {
                        Object valueAt = this.a.valueAt(indexOfKey);
                        if (valueAt instanceof ArrayList) {
                            ((ArrayList) valueAt).add(aoobVar);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(valueAt);
                            arrayList.add(aoobVar);
                            this.a.append(n, arrayList);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void d(int i, Object obj, aool aoolVar) {
        int a = aosl.a(i);
        int b = aosl.b(i);
        if (b == 0) {
            aoolVar.E(a, ((Long) obj).longValue());
        } else if (b == 1) {
            aoolVar.r(a, ((Long) obj).longValue());
        } else if (b == 2) {
            if (obj instanceof aoob) {
                aoolVar.n(a, (aoob) obj);
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    d(i, arrayList.get(i2), aoolVar);
                }
            } else if (obj instanceof abgd) {
                abgd abgdVar = (abgd) obj;
                aoolVar.B(a, 2);
                aoolVar.D(abgdVar.b);
                abgdVar.b(aoolVar);
            } else {
                throw new aopw("Unexpected WIRETYPE_LENGTH_DELIMITED value");
            }
        } else {
            if (b == 5) {
                aoolVar.p(a, ((Integer) obj).intValue());
                return;
            }
            throw new aopw("Unexpected wire type");
        }
    }

    public final void b(aool aoolVar) {
        for (int i = 0; i < this.a.size(); i++) {
            d(this.a.keyAt(i), this.a.valueAt(i), aoolVar);
        }
    }
}
