package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dcwh  reason: default package */
/* loaded from: classes5.dex */
public final class dcwh implements Comparable<dcwh>, Serializable, dcxa {
    transient dcyn a;
    private final List<dcvy> b = dchl.a();
    private final AtomicInteger d = new AtomicInteger();
    private int e = 0;
    private dcvu c = dcvu.c();

    static {
        dcus.c(dcwh.class);
        dbss dbssVar = dbss.ALWAYS_TRUE;
    }

    public dcwh() {
        dcvu.c();
        d();
    }

    public static dcwh c(InputStream inputStream) {
        Iterator dcwbVar;
        dcvy dcvyVar;
        int a;
        int a2;
        dcur dcurVar = new dcur(inputStream);
        byte a3 = dcurVar.a();
        char c = 0;
        if (a3 == 1) {
            dcurVar.a();
            dcurVar.a();
            int b = dcurVar.b();
            dbsk.m(b >= 0, "Can only deccode polygons with up to 2^31 - 1 loops");
            dcwh dcwhVar = new dcwh();
            for (int i = 0; i < b; i++) {
                List<dcvy> list = dcwhVar.b;
                byte a4 = dcurVar.a();
                if (a4 == 1) {
                    int b2 = dcurVar.b();
                    dbsk.m(b2 >= 0, "Loops with more than 2^31 - 1 vertices not supported.");
                    ArrayList arrayList = new ArrayList(b2);
                    for (int i2 = 0; i2 < b2; i2++) {
                        arrayList.add(new dcwa(dcurVar.c(), dcurVar.c(), dcurVar.c()));
                    }
                    boolean z = dcurVar.a() != 0;
                    int b3 = dcurVar.b();
                    dcvy a5 = dcvy.a(arrayList, z, dcvu.j(dcurVar));
                    a5.d = b3;
                    if (b2 > 0) {
                        a5.b();
                    }
                    list.add(a5);
                } else {
                    StringBuilder sb = new StringBuilder(65);
                    sb.append("Unknown S2Loop encoding version encountered during decoding: ");
                    sb.append((int) a4);
                    throw new IOException(sb.toString());
                }
            }
            dcwhVar.c = dcvu.j(dcurVar);
            dcwhVar.e();
            return dcwhVar;
        } else if (a3 == 4) {
            byte a6 = dcurVar.a();
            if (a6 > 30) {
                throw new IOException("Invalid level");
            }
            int d = dcurVar.d();
            ArrayList arrayList2 = new ArrayList(d);
            int i3 = 0;
            while (i3 < d) {
                int d2 = dcurVar.d();
                ArrayList arrayList3 = new ArrayList(d2);
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                while (i4 < d2) {
                    long e = dcurVar.e();
                    dcwc dcwcVar = new dcwc((int) (e % 6), (int) (e / 6));
                    arrayList4.add(dcwcVar);
                    i4 += dcwcVar.b;
                    d = d;
                }
                int i5 = d;
                Iterator it = arrayList4.iterator();
                if (!it.hasNext()) {
                    dcwbVar = Collections.emptyIterator();
                } else {
                    dcwbVar = new dcwb(it);
                }
                dcwd dcwdVar = new dcwd();
                dcwd dcwdVar2 = new dcwd();
                int i6 = 0;
                while (i6 < d2) {
                    if (i6 == 0) {
                        int i7 = (a6 + 7) / 8;
                        int i8 = i7 + i7;
                        byte[] bArr = new byte[i8];
                        if (dcurVar.a.read(bArr) >= i8) {
                            int[] a7 = dcuo.a(Long.reverseBytes(decn.f(Arrays.copyOf(bArr, 8))));
                            a = dcwdVar.a(a7[c]);
                            a2 = dcwdVar2.a(a7[1]);
                        } else {
                            throw new IOException("EOF");
                        }
                    } else {
                        int[] a8 = dcuo.a(dcurVar.e());
                        a = dcwdVar.a(dcup.a(a8[c]));
                        a2 = dcwdVar2.a(dcup.a(a8[1]));
                    }
                    arrayList3.add(dcwa.f(dcwz.f(((Integer) dcwbVar.next()).intValue(), dcwz.f.a(dcwe.a(a, a6)), dcwz.f.a(dcwe.a(a2, a6)))));
                    i6++;
                    dcwbVar = dcwbVar;
                    c = 0;
                }
                int d3 = dcurVar.d();
                if (d3 <= d2) {
                    for (int i9 = 0; i9 < d3; i9++) {
                        arrayList3.set(dcurVar.d(), new dcwa(dcurVar.c(), dcurVar.c(), dcurVar.c()));
                    }
                    long e2 = dcurVar.e();
                    int d4 = dcurVar.d();
                    if (dcvx.a(dcvw.BOUND_ENCODED, e2)) {
                        dcvyVar = dcvy.a(arrayList3, dcvx.a(dcvw.ORIGIN_INSIDE, e2), dcvu.j(dcurVar));
                    } else {
                        dcvyVar = new dcvy(arrayList3);
                    }
                    dcvyVar.d = d4;
                    arrayList2.add(dcvyVar);
                    i3++;
                    d = i5;
                    c = 0;
                } else {
                    throw new IOException("Number of off-center points is greater than total amount of points.");
                }
            }
            dcwh dcwhVar2 = new dcwh();
            dcwhVar2.b.addAll(arrayList2);
            dcwhVar2.e();
            return dcwhVar2;
        } else {
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Unsupported S2Polygon encoding version ");
            sb2.append((int) a3);
            throw new IOException(sb2.toString());
        }
    }

    private final void d() {
        int i = this.e;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.d.set(i2);
        this.a = new dcyn();
        for (int i3 = 0; i3 < a(); i3++) {
            this.a.a(b(i3));
        }
    }

    private final void e() {
        this.e = 0;
        dcvt d = dcvt.d();
        for (dcvy dcvyVar : this.b) {
            if ((dcvyVar.d & 1) == 0) {
                d.f(dcvyVar.c);
            }
            this.e += dcvyVar.b;
        }
        dcvu c = d.c();
        this.c = c;
        dcvn.a(c);
        d();
    }

    private Object readResolve() {
        d();
        return this;
    }

    public final int a() {
        return this.b.size();
    }

    public final dcvy b(int i) {
        return this.b.get(i);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dcwh dcwhVar) {
        dcwh dcwhVar2 = dcwhVar;
        if (a() != dcwhVar2.a()) {
            return a() - dcwhVar2.a();
        }
        for (int i = 0; i < a(); i++) {
            int compareTo = this.b.get(i).compareTo(dcwhVar2.b.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcwh) {
            dcwh dcwhVar = (dcwh) obj;
            if (this.e == dcwhVar.e && this.c.equals(dcwhVar.c) && this.b.equals(dcwhVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        if (this.a.c || this.c.h(dcwaVar)) {
            if (this.e > 32 && (this.a.c || this.d.decrementAndGet() <= 0)) {
                dcvr<dcxm> b = this.a.b();
                if (!b.n(dcwaVar)) {
                    return false;
                }
                dcxm g = b.g();
                dcvm dcvmVar = new dcvm(b.h(), dcwaVar);
                boolean z = false;
                for (int i = 0; i < g.b(); i++) {
                    dcyk c = g.c(i);
                    z ^= c.d();
                    int e = c.e();
                    if (e > 0) {
                        dcvy dcvyVar = (dcvy) c.b;
                        int i2 = -2;
                        int i3 = 0;
                        while (i3 < e) {
                            int f = c.f(i3);
                            if (f != i2 + 1) {
                                dcvmVar.a(dcvyVar.c(f));
                            }
                            z ^= dcvmVar.c(dcvyVar.c(f + 1));
                            i3++;
                            i2 = f;
                        }
                    }
                }
                return true == z;
            }
            boolean z2 = false;
            for (int i4 = 0; i4 < a(); i4++) {
                z2 ^= b(i4).k(dcwaVar);
            }
            return true == z2;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polygon: (");
        sb.append(a());
        sb.append(") loops:\n");
        for (int i = 0; i < a(); i++) {
            dcvy b = b(i);
            sb.append("loop <\n");
            for (int i2 = 0; i2 < b.b; i2++) {
                sb.append(b.c(i2).r());
                sb.append("\n");
            }
            sb.append(">\n");
        }
        return sb.toString();
    }
}
