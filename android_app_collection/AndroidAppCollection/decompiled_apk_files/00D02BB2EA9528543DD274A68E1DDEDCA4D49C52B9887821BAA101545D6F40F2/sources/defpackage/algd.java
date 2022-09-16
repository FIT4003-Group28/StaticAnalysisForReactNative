package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: algd  reason: default package */
/* loaded from: classes2.dex */
final class algd implements Iterator<algc> {
    public final List<akra> a = dchl.a();
    private int b = 0;
    private int c = 0;
    private int d;
    private final int e;
    private final List<dmlo> f;

    public algd(akzh akzhVar, akrk akrkVar, dmlo dmloVar, dcdc<dmlo> dcdcVar) {
        akra m;
        float y;
        this.f = dcdcVar;
        int indexOf = dmloVar != null ? dcdcVar.indexOf(dmloVar) : 0;
        this.e = indexOf;
        this.d = indexOf;
        akqc akqcVar = new akqc(akzhVar.r().b);
        ArrayList a = dchl.a();
        akqcVar.a(akrkVar, a);
        akrk akrkVar2 = !a.isEmpty() ? a.get(0) : null;
        if (akrkVar2 == null || akrkVar2.l() == 0) {
            return;
        }
        float r = akrkVar2.r() / 10.0f;
        akra m2 = akrkVar2.m(0);
        ArrayList a2 = dchl.a();
        a2.add(m2);
        int l = akrkVar2.l();
        int i = 1;
        loop0: while (true) {
            float f = r;
            while (i < l && a2.size() < 10) {
                m = akrkVar2.m(i);
                y = m2.y(m);
                if (y < f) {
                    i++;
                    f -= y;
                    m2 = m;
                }
            }
            m2 = m2.I(m, f / y);
            a2.add(m2);
        }
        int size = a2.size() / 2;
        for (int i2 = 0; i2 < a2.size(); i2++) {
            int i3 = i2 / 2;
            if ((i2 & 1) != 0) {
                i3 = (-i3) - 1;
            }
            this.a.add((akra) a2.get(i3 + size));
        }
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final algc next() {
        this.b++;
        algc algcVar = new algc(this.a.get(this.c), this.f.get(this.d));
        int size = (this.d + 1) % this.f.size();
        this.d = size;
        if (size == this.e && this.c < this.a.size()) {
            this.c++;
        }
        return algcVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < 40 && this.c < this.a.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
