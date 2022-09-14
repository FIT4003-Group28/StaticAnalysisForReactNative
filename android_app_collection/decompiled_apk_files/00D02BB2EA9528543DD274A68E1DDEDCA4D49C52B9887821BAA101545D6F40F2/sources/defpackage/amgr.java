package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amgr  reason: default package */
/* loaded from: classes.dex */
public final class amgr {
    private static final btnh<amgr> w = new amgq();
    public boolean b;
    public int c;
    public int e;
    public int g;
    @dzsi
    public ByteBuffer i;
    @dzsi
    private bvpa j;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private byte[] r;
    private int s;
    private int u;
    private int k = 0;
    private int x = 1;
    private int y = 1;
    private int z = 1;
    private int A = 1;
    public final byte[] d = new byte[8];
    public int f = 0;
    private int t = 0;
    public float h = 1.0f;
    private final ArrayList<Integer> v = new ArrayList<>();
    public String a = "unused";

    public static amgr a(String str, int i, int i2, boolean z, int i3, boolean z2) {
        amgr d;
        btnh<amgr> btnhVar = w;
        synchronized (btnhVar) {
            d = btnhVar.d();
            d.a = str;
            d.g = i2;
            d.q = z;
            d.b = z2;
            boolean z3 = false;
            int i4 = (i2 & 2) != 0 ? 1 : (i2 & 1) != 0 ? 2 : 0;
            d.k = i4;
            d.u = i3;
            d.h = 1.0f;
            if (i3 > 0) {
                d.h = 1.0f / (1 << i3);
            }
            boolean z4 = (i2 & 16) != 0;
            d.l = z4;
            boolean z5 = (i2 & 8) != 0;
            d.n = z5;
            boolean z6 = (i2 & 32) != 0;
            d.m = z6;
            if ((i2 & 2176) == 0) {
                d.x = 1;
            } else if ((i2 & 128) != 0) {
                d.x = 2;
            }
            if ((i2 & 4352) == 0) {
                d.y = 1;
            } else if ((i2 & 256) != 0) {
                d.y = 2;
            }
            if ((i2 & 8704) == 0) {
                d.z = 1;
            } else if ((i2 & 512) != 0) {
                d.z = 2;
            }
            if ((i2 & 17408) == 0) {
                d.A = 1;
            } else if ((i2 & 1024) != 0) {
                d.A = 2;
            }
            d.o = (32768 & i2) != 0;
            int i5 = i2 & 64;
            if (i5 != 0) {
                z3 = true;
            }
            d.p = z3;
            if (i4 == 1) {
                int i6 = i5 != 0 ? 2 : 4;
                d.c = i6 + i6;
            } else if (i4 == 2) {
                d.c = (i5 != 0 ? 2 : 3) * 4;
            }
            if (z5) {
                d.c += 16;
            } else if (z6) {
                d.c += 4;
            }
            if (z4) {
                d.c += 8;
            }
            int i7 = d.c;
            d.s = i7;
            if (d.x == 2) {
                i7 += 4;
                d.c = i7;
            }
            if (d.y == 2) {
                i7 += 4;
                d.c = i7;
            }
            d.e = i7;
            if (d.z == 2) {
                i7 += 4;
                d.c = i7;
            }
            if (d.A == 2) {
                i7 += 4;
                d.c = i7;
            }
            d.r = new byte[i7];
            if (z && d.j == null) {
                d.j = new bvpa(i / 2);
            }
            d.j(i);
        }
        return d;
    }

    private final short o(int i) {
        int i2 = this.u;
        return i2 <= 0 ? (short) i : (short) (i >> i2);
    }

    public final void b() {
        l();
        btnh<amgr> btnhVar = w;
        synchronized (btnhVar) {
            btnhVar.h(this);
        }
    }

    public final void c(akra akraVar, float f, float f2) {
        ByteBuffer byteBuffer = this.i;
        dbsk.s(byteBuffer);
        if (this.k == 1) {
            byteBuffer.putShort(o(akraVar.a));
            byteBuffer.putShort(o(akraVar.b));
            if (!this.p) {
                byteBuffer.putShort(this.o ? o(akraVar.c) : (short) akraVar.c);
                byteBuffer.putShort((short) 0);
            }
        } else {
            byteBuffer.putFloat(akraVar.a);
            byteBuffer.putFloat(akraVar.b);
            if (!this.p) {
                byteBuffer.putFloat(akraVar.c);
            }
        }
        byteBuffer.putFloat(f);
        byteBuffer.putFloat(f2);
        this.f++;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.i;
        dbsk.s(byteBuffer);
        byteBuffer.position(byteBuffer.position() - this.c);
        byteBuffer.get(this.r);
        byteBuffer.put(this.r);
        this.f++;
    }

    public final void e(float f, float f2, float f3, int i, int i2) {
        ByteBuffer byteBuffer = this.i;
        dbsk.s(byteBuffer);
        byteBuffer.putFloat(f);
        byteBuffer.putFloat(f2);
        byteBuffer.putFloat(f3);
        byteBuffer.putFloat(i);
        byteBuffer.putFloat(i2);
        this.f++;
    }

    public final void f(ByteBuffer byteBuffer, float f, float f2, float f3) {
        if (this.k == 1) {
            byteBuffer.putShort(o((int) f));
            byteBuffer.putShort(o((int) f2));
            if (this.p) {
                return;
            }
            byteBuffer.putShort(o((int) f3));
            byteBuffer.putShort((short) 0);
            return;
        }
        byteBuffer.putFloat(f);
        byteBuffer.putFloat(f2);
        if (this.p) {
            return;
        }
        byteBuffer.putFloat(f3);
    }

    public final void h(int i, byte[] bArr) {
        int i2 = this.s + 2;
        while (i2 < bArr.length) {
            bArr[i2] = (byte) i;
            i2 += this.c;
        }
    }

    public final void i(byte[] bArr) {
        ByteBuffer byteBuffer = this.i;
        dbsk.s(byteBuffer);
        byteBuffer.put(bArr);
        this.f += bArr.length / this.c;
        k();
    }

    public final void j(int i) {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer == null) {
            this.i = ByteBuffer.allocateDirect(this.c * i).order(ByteOrder.nativeOrder());
        } else if (this.c * i <= byteBuffer.capacity()) {
        } else {
            ByteBuffer byteBuffer2 = this.i;
            dbsk.s(byteBuffer2);
            ByteBuffer order = ByteBuffer.allocateDirect(this.c * i).order(ByteOrder.nativeOrder());
            if (byteBuffer2.position() != 0) {
                byteBuffer2.rewind();
                order.put(byteBuffer2);
            }
            this.i = order;
        }
    }

    public final void k() {
        this.v.add(Integer.valueOf(this.f));
    }

    public final void l() {
        bvpa bvpaVar = this.j;
        if (bvpaVar != null) {
            bvpaVar.b = 0;
        }
        this.t = 0;
        this.f = 0;
        this.v.clear();
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.i = null;
    }

    public final void m(int i, int i2, int i3) {
        bvpa bvpaVar = this.j;
        dbsk.s(bvpaVar);
        bvpaVar.a((short) i);
        bvpaVar.a((short) i2);
        bvpaVar.a((short) i3);
        this.t += 3;
    }

    public final bnvn n(int i) {
        short[] sArr;
        k();
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            this.i = null;
        }
        dbsk.s(byteBuffer);
        int[] iArr = new int[(this.f * this.c) / 4];
        byteBuffer.position(0);
        byteBuffer.asIntBuffer().get(iArr);
        String str = this.a;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.c;
        if (!this.q) {
            sArr = null;
        } else {
            bvpa bvpaVar = this.j;
            dbsk.s(bvpaVar);
            int i5 = bvpaVar.b;
            short[] sArr2 = new short[i5];
            System.arraycopy(bvpaVar.a, 0, sArr2, 0, i5);
            sArr = sArr2;
        }
        return new bnvn(str, iArr, i2, i3, i, i4, sArr, this.t);
    }

    public final byte[] g(int i) {
        int intValue = i == 0 ? 0 : this.v.get(i - 1).intValue();
        int intValue2 = this.v.get(i).intValue();
        int i2 = this.c;
        byte[] bArr = new byte[(intValue2 - intValue) * i2];
        ByteBuffer byteBuffer = this.i;
        dbsk.s(byteBuffer);
        int position = byteBuffer.position();
        byteBuffer.position(i2 * intValue);
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }
}
