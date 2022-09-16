package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbz  reason: default package */
/* loaded from: classes2.dex */
public final class bbz implements aze, azy {
    public azh a;
    private final pwu b;
    private final pwu c;
    private final pwu d;
    private final pwu e;
    private final ArrayDeque f;
    private final List g;
    private int h;
    private int i;
    private long j;
    private int k;
    private pwu l;
    private int m;
    private int n;
    private int o;
    private int p;
    private bby[] q;
    private long[][] r;
    private int s;
    private long t;
    private int u;

    public bbz() {
        this(null);
    }

    private static int i(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int j(bcf bcfVar, long j) {
        int a = bcfVar.a(j);
        return a == -1 ? bcfVar.b(j) : a;
    }

    private static long k(bcf bcfVar, long j, long j2) {
        int j3 = j(bcfVar, j);
        return j3 == -1 ? j2 : Math.min(bcfVar.c[j3], j2);
    }

    private final void l() {
        this.h = 0;
        this.k = 0;
    }

    private final void m(long j) {
        Metadata metadata;
        Metadata metadata2;
        long j2;
        List list;
        int i;
        azp azpVar;
        int i2;
        while (!this.f.isEmpty() && ((bbj) this.f.peek()).a == j) {
            bbj bbjVar = (bbj) this.f.pop();
            if (bbjVar.d == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.u == 1;
                azp azpVar2 = new azp();
                bbk b = bbjVar.b(1969517665);
                if (b != null) {
                    Pair a = bbr.a(b);
                    Metadata metadata3 = (Metadata) a.first;
                    Metadata metadata4 = (Metadata) a.second;
                    if (metadata3 != null) {
                        azpVar2.b(metadata3);
                    }
                    metadata = metadata4;
                    metadata2 = metadata3;
                } else {
                    metadata = null;
                    metadata2 = null;
                }
                bbj a2 = bbjVar.a(1835365473);
                Metadata b2 = a2 != null ? bbr.b(a2) : null;
                List d = bbr.d(bbjVar, azpVar2, -9223372036854775807L, null, z, egf.b);
                azh azhVar = this.a;
                ptx.a(azhVar);
                int size = d.size();
                int i3 = -1;
                int i4 = 0;
                long j3 = -9223372036854775807L;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    bcf bcfVar = (bcf) d.get(i4);
                    if (bcfVar.b == 0) {
                        list = d;
                        i = size;
                        azpVar = azpVar2;
                    } else {
                        bcc bccVar = bcfVar.a;
                        int i5 = i3;
                        long j4 = bccVar.e;
                        if (j4 == -9223372036854775807L) {
                            j4 = bcfVar.h;
                        }
                        long max = Math.max(j3, j4);
                        list = d;
                        i = size;
                        bby bbyVar = new bby(bccVar, bcfVar, azhVar.pT(i4, bccVar.b));
                        int i6 = bcfVar.e;
                        pis b3 = bccVar.f.b();
                        b3.l = i6 + 30;
                        int i7 = bccVar.b;
                        if (i7 == 2) {
                            if (j4 > 0 && (i2 = bcfVar.b) > 1) {
                                b3.r = i2 / (((float) j4) / 1000000.0f);
                            }
                            i7 = 2;
                        }
                        int i8 = bbx.b;
                        if (i7 == 1 && azpVar2.a()) {
                            b3.A = azpVar2.a;
                            b3.B = azpVar2.b;
                        }
                        int i9 = bccVar.b;
                        Metadata[] metadataArr = new Metadata[2];
                        metadataArr[0] = metadata;
                        metadataArr[1] = this.g.isEmpty() ? null : new Metadata(this.g);
                        azpVar = azpVar2;
                        Metadata metadata5 = new Metadata(new Metadata.Entry[0]);
                        if (i9 == 1) {
                            if (metadata2 != null) {
                                metadata5 = metadata2;
                            }
                        } else if (i9 == 2 && b2 != null) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= b2.a()) {
                                    break;
                                }
                                Metadata.Entry b4 = b2.b(i10);
                                if (b4 instanceof MdtaMetadataEntry) {
                                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) b4;
                                    if ("com.android.capture.fps".equals(mdtaMetadataEntry.a)) {
                                        metadata5 = new Metadata(mdtaMetadataEntry);
                                        break;
                                    }
                                }
                                i10++;
                            }
                        }
                        for (int i11 = 0; i11 < 2; i11++) {
                            metadata5 = metadata5.d(metadataArr[i11]);
                        }
                        if (metadata5.a() > 0) {
                            b3.i = metadata5;
                        }
                        bbyVar.c.rx(b3.a());
                        i3 = i5;
                        if (bccVar.b == 2 && i3 == -1) {
                            i3 = arrayList.size();
                        }
                        arrayList.add(bbyVar);
                        j3 = max;
                    }
                    i4++;
                    d = list;
                    size = i;
                    azpVar2 = azpVar;
                }
                this.s = i3;
                this.t = j3;
                bby[] bbyVarArr = (bby[]) arrayList.toArray(new bby[0]);
                this.q = bbyVarArr;
                int length = bbyVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < bbyVarArr.length; i12++) {
                    jArr[i12] = new long[bbyVarArr[i12].b.b];
                    jArr2[i12] = bbyVarArr[i12].b.f[0];
                }
                int i13 = 0;
                while (i13 < bbyVarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < bbyVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j6 = jArr2[i15];
                            if (j6 <= j5) {
                                i14 = i15;
                                j5 = j6;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j2;
                    bcf bcfVar2 = bbyVarArr[i14].b;
                    j2 += bcfVar2.d[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = bcfVar2.f[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.r = jArr;
                azhVar.b();
                azhVar.ry(this);
                this.f.clear();
                this.h = 2;
            } else if (!this.f.isEmpty()) {
                ((bbj) this.f.peek()).c(bbjVar);
            }
        }
        if (this.h != 2) {
            l();
        }
    }

    @Override // defpackage.azy
    public final long a() {
        return this.t;
    }

    @Override // defpackage.azy
    public final azw b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((bby[]) ptx.a(this.q)).length == 0) {
            azz azzVar = azz.a;
            return new azw(azzVar, azzVar);
        }
        int i = this.s;
        if (i != -1) {
            bcf bcfVar = this.q[i].b;
            int j6 = j(bcfVar, j);
            if (j6 == -1) {
                azz azzVar2 = azz.a;
                return new azw(azzVar2, azzVar2);
            }
            long j7 = bcfVar.f[j6];
            j2 = bcfVar.c[j6];
            if (j7 >= j || j6 >= bcfVar.b - 1 || (b = bcfVar.b(j)) == -1 || b == j6) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = bcfVar.f[b];
                j5 = bcfVar.c[b];
            }
            j3 = j5;
            j = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            bby[] bbyVarArr = this.q;
            if (i2 >= bbyVarArr.length) {
                break;
            }
            if (i2 != this.s) {
                bcf bcfVar2 = bbyVarArr[i2].b;
                long k = k(bcfVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = k(bcfVar2, j4, j3);
                }
                j2 = k;
            }
            i2++;
        }
        azz azzVar3 = new azz(j, j2);
        if (j4 == -9223372036854775807L) {
            return new azw(azzVar3, azzVar3);
        }
        return new azw(azzVar3, new azz(j4, j3));
    }

    @Override // defpackage.azy
    public final boolean c() {
        return true;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.a = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.f.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            l();
            return;
        }
        bby[] bbyVarArr = this.q;
        if (bbyVarArr == null) {
            return;
        }
        for (bby bbyVar : bbyVarArr) {
            bcf bcfVar = bbyVar.b;
            int a = bcfVar.a(j2);
            if (a == -1) {
                a = bcfVar.b(j2);
            }
            bbyVar.d = a;
        }
    }

    @Override // defpackage.aze
    public final boolean h(azf azfVar) {
        return bcb.a(azfVar, false);
    }

    public bbz(byte[] bArr) {
        this.h = 0;
        new ArrayList();
        this.g = new ArrayList();
        this.e = new pwu(16);
        this.f = new ArrayDeque();
        this.b = new pwu(pwo.a);
        this.c = new pwu(4);
        this.d = new pwu();
        this.m = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x034d, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r33, defpackage.azv r34) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbz.d(azf, azv):int");
    }
}
