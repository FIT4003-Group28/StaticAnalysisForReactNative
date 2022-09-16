package defpackage;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: agsz  reason: default package */
/* loaded from: classes.dex */
public final class agsz implements asv {
    byte[][] a;
    private final asv c;
    private final azqb d;
    private long e;
    private long f;
    private asy g;
    private String h;
    private int i;
    private String j;
    private long k;
    private agwh n;
    private agvt o;
    private agmc p;
    private int l = -1;
    private boolean m = false;
    final ArrayList b = new ArrayList();
    private ahdw q = new ahdw();
    private ahdt r = new ahds(false);
    private final byte[] s = new byte[4096];

    public agsz(asv asvVar, azqb azqbVar) {
        this.c = asvVar;
        this.d = azqbVar;
    }

    private final void c(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (true) {
            int i4 = i3 - i;
            if (i4 > 0) {
                int i5 = (int) (this.f % 4096);
                int min = Math.min(i4, 4096 - i5);
                System.arraycopy(bArr, i, this.s, i5, min);
                this.r.c(this.s, i5, min);
                this.f += min;
                if (this.r.a() == 4096) {
                    byte[] d = this.r.d();
                    ahdt ahdtVar = this.r;
                    if (ahdtVar instanceof Serializable) {
                        this.r = ahdw.a(this.m);
                    } else {
                        ahdtVar.b();
                    }
                    int i6 = (int) ((this.f - 1) / 4096);
                    byte[][] bArr2 = this.a;
                    int length = bArr2.length;
                    bArr2[i6 % length] = d;
                    if ((i6 + 1) % length == 0) {
                        d(i6);
                    }
                }
                i += min;
            } else {
                return;
            }
        }
    }

    private final void d(int i) {
        this.q.c();
        int length = this.a.length;
        int i2 = i / length;
        int i3 = (i % length) + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            this.q.b(this.a[i4]);
        }
        agqc agqcVar = new agqc();
        agqcVar.a = this.h;
        agqcVar.b = this.i;
        agqcVar.c = this.j;
        agqcVar.d = this.l;
        agqcVar.e = i2;
        agqcVar.b(this.q.d());
        this.b.add(agqcVar.a());
        if (this.b.size() >= 256) {
            e();
        }
    }

    private final void e() {
        this.o.e(this.b);
        this.b.clear();
    }

    @Override // defpackage.asv
    public final /* synthetic */ Map a() {
        return Collections.emptyMap();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        this.c.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (this.l == -1) {
            return this.c.g(bArr, i, i2);
        }
        asy asyVar = this.g;
        if (asyVar != null) {
            long j = asyVar.f;
            long j2 = this.e;
            long j3 = j - j2;
            if (j3 > 0) {
                byte[] bArr2 = new byte[4096];
                for (long j4 = 0; j3 > j4; j4 = 0) {
                    int g = this.c.g(bArr2, 0, (int) Math.min(j3, bArr.length));
                    if (g == -1) {
                        return -1;
                    }
                    long j5 = g;
                    this.e += j5;
                    c(bArr2, 0, g);
                    j3 -= j5;
                }
            } else {
                long j6 = this.f;
                if (j2 < j6) {
                    int g2 = this.c.g(bArr, i, Math.min(i2, (int) (j6 - j2)));
                    if (g2 == -1) {
                        return -1;
                    }
                    this.e += g2;
                    return g2;
                }
            }
            int g3 = this.c.g(bArr, i, i2);
            if (g3 == -1) {
                return -1;
            }
            this.e += g3;
            c(bArr, i, g3);
            return g3;
        }
        throw new IOException("Null dataspec on read.");
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        agql agqlVar;
        aqzz aqzzVar;
        int al;
        int i;
        ahdt ahdtVar;
        this.g = asyVar;
        if (asyVar != null) {
            if (asyVar.i != null) {
                this.e = asyVar.f;
                agvx a = ((agrf) this.d.get()).a();
                this.n = a.m();
                this.o = a.h();
                this.p = a.d();
                this.h = aear.e(asyVar.i);
                this.i = ovm.a(aear.d(asyVar.i));
                this.l = -1;
                agqv e = this.n.e(this.h);
                if (e == null) {
                    return this.c.h(asyVar);
                }
                agqz agqzVar = e.o;
                if (agqzVar == null) {
                    return this.c.h(asyVar);
                }
                int c = agxg.c(agqzVar.f);
                this.l = c;
                if (c == -1) {
                    return this.c.h(asyVar);
                }
                agqd agqdVar = null;
                agqm b = this.p.b(this.h, null);
                if (b != null) {
                    agqlVar = b.a;
                    if (agqlVar == null || agqlVar.a() != this.i) {
                        agqlVar = null;
                    }
                    agql agqlVar2 = b.b;
                    if (agqlVar2 != null && agqlVar2.a() == this.i) {
                        agqlVar = agqlVar2;
                    }
                } else {
                    agqlVar = null;
                }
                if (agqlVar == null) {
                    String str = this.h;
                    int i2 = this.i;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                    sb.append("[Offline] stream to hash not in store: ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(i2);
                    zep.b(sb.toString());
                    throw new IOException("stream not in OfflineStreamStore");
                }
                aqzx aqzxVar = agqlVar.b.a;
                if ((aqzxVar.c & 1048576) != 0) {
                    aqzzVar = aqzxVar.x;
                    if (aqzzVar == null) {
                        aqzzVar = aqzz.a;
                    }
                } else {
                    aqzzVar = null;
                }
                if (aqzzVar == null || (al = akel.al(aqzzVar.b)) == 0 || al != 3) {
                    this.l = -1;
                    return this.c.h(asyVar);
                }
                this.k = agqlVar.b();
                this.j = agqlVar.l;
                int i3 = this.l;
                this.a = new byte[1 << i3];
                if (i3 > 0) {
                    agqdVar = this.o.b(this.h, this.i, i3);
                }
                agqd b2 = this.o.b(this.h, this.i, 0);
                boolean ac = agxg.ac(agqzVar.f);
                this.m = ac;
                if (ac) {
                    this.q = new ahdw(true);
                    this.r = ahdw.a(true);
                }
                long j = 0;
                this.f = 0L;
                if (agqdVar != null) {
                    j = (agqdVar.e + 1) * i * 4096;
                    this.f = j;
                }
                if (b2 != null) {
                    this.f = b2.e * 4096;
                    byte[] bArr = b2.g;
                    if (bArr != null) {
                        try {
                            this.r = (ahdt) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
                            j = ahdtVar.a() + this.f;
                            this.f = j;
                        } catch (IOException e2) {
                            throw new IOException("Failed to reconstitute offline content verification state.", e2);
                        } catch (ClassNotFoundException e3) {
                            throw new IllegalStateException(e3);
                        }
                    } else {
                        this.r.b();
                        j = this.f + 4096;
                        this.f = j;
                    }
                }
                int i4 = (int) (j / 4096);
                int length = this.a.length;
                int i5 = (i4 / length) * length;
                for (agqd agqdVar2 : this.o.g(this.h, this.i, i5, i4)) {
                    this.a[agqdVar2.e - i5] = agqdVar2.f;
                }
                long j2 = asyVar.f;
                long j3 = this.f;
                if (j2 <= j3) {
                    return this.c.h(asyVar);
                }
                long j4 = j2 - j3;
                if (asyVar.g < j4) {
                    zep.b("[Offline] Can't hash offline gap");
                    this.f = asyVar.f;
                    return this.c.h(asyVar);
                }
                asy b3 = asyVar.b(-j4);
                this.e = b3.f;
                long h = this.c.h(b3);
                if (h != -1) {
                    return h - j4;
                }
                return -1L;
            }
            throw new IOException("Null dataspec key on open.");
        }
        throw new IOException("Null dataspec on open.");
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.c.i();
    }

    @Override // defpackage.asv
    public final void j() {
        this.c.j();
        this.g = null;
        int i = this.l;
        if (i == -1) {
            return;
        }
        if (i > 0) {
            this.o.f(this.h, this.i);
        }
        long j = this.f;
        if (j != this.k) {
            e();
            int i2 = (int) (this.f / 4096);
            int length = this.a.length;
            int i3 = (i2 / length) * length;
            ArrayList arrayList = new ArrayList(length);
            for (int i4 = i3; i4 < i2; i4++) {
                agqc agqcVar = new agqc();
                agqcVar.a = this.h;
                agqcVar.b = this.i;
                agqcVar.c = this.j;
                agqcVar.d = 0;
                agqcVar.e = i4;
                agqcVar.b(this.a[i4 - i3]);
                arrayList.add(agqcVar.a());
            }
            this.o.e(arrayList);
            int a = this.r.a();
            if (a <= 0) {
                return;
            }
            if (!(this.r instanceof Serializable)) {
                boolean z = this.m;
                int i5 = ahdw.c;
                ahdv ahdvVar = new ahdv(z);
                this.r = ahdvVar;
                ahdvVar.c(this.s, 0, a);
            }
            ahdt ahdtVar = this.r;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(ahdtVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            long j2 = this.f;
            agqc agqcVar2 = new agqc();
            agqcVar2.a = this.h;
            agqcVar2.b = this.i;
            agqcVar2.c = this.j;
            agqcVar2.d = 0;
            agqcVar2.e = (int) (j2 / 4096);
            agqcVar2.g = Arrays.copyOf(byteArray, byteArray.length);
            this.o.d(agqcVar2.a());
            return;
        }
        int i6 = (int) ((j - 1) / 4096);
        if (this.r.a() != 0) {
            byte[][] bArr = this.a;
            bArr[i6 % bArr.length] = this.r.d();
        }
        if (this.f % (this.a.length * 4096) != 0) {
            d(i6);
        }
        e();
        String.valueOf(this.h).length();
    }
}
