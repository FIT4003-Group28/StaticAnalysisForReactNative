package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: axjx  reason: default package */
/* loaded from: classes2.dex */
public final class axjx extends axix {
    protected int a;
    protected int b;
    public byte[] c;
    public List d;

    public axjx() {
        super("senc");
        this.a = -1;
        this.b = -1;
        this.c = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.d = Collections.emptyList();
    }

    private final List l(ByteBuffer byteBuffer, long j, int i) {
        axmc axmaVar;
        ArrayList arrayList = new ArrayList();
        long j2 = j;
        while (true) {
            long j3 = (-1) + j2;
            if (j2 > 0) {
                try {
                    axmh axmhVar = new axmh();
                    axmhVar.a = new byte[i];
                    byteBuffer.get(axmhVar.a);
                    if ((r() & 2) > 0) {
                        axmhVar.b = new axmc[hy.F(byteBuffer)];
                        int i2 = 0;
                        while (true) {
                            axmc[] axmcVarArr = axmhVar.b;
                            if (i2 >= axmcVarArr.length) {
                                break;
                            }
                            int F = hy.F(byteBuffer);
                            long I = hy.I(byteBuffer);
                            if (F <= 127) {
                                if (I <= 127) {
                                    axmaVar = new axlu(F, I);
                                } else if (I <= 32767) {
                                    axmaVar = new axlx(F, I);
                                } else if (I <= 2147483647L) {
                                    axmaVar = new axlv(F, I);
                                } else {
                                    axmaVar = new axlw(F, I);
                                }
                            } else if (F <= 32767) {
                                if (I <= 127) {
                                    axmaVar = new axmd(F, I);
                                } else if (I <= 32767) {
                                    axmaVar = new axmg(F, I);
                                } else if (I <= 2147483647L) {
                                    axmaVar = new axme(F, I);
                                } else {
                                    axmaVar = new axmf(F, I);
                                }
                            } else if (I <= 127) {
                                axmaVar = new axly(F, I);
                            } else if (I <= 32767) {
                                axmaVar = new axmb(F, I);
                            } else if (I <= 2147483647L) {
                                axmaVar = new axlz(F, I);
                            } else {
                                axmaVar = new axma(F, I);
                            }
                            axmcVarArr[i2] = axmaVar;
                            i2++;
                        }
                    }
                    arrayList.add(axmhVar);
                    j2 = j3;
                } catch (BufferUnderflowException unused) {
                    return null;
                }
            } else {
                return arrayList;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axjx axjxVar = (axjx) obj;
        if (this.a != axjxVar.a || this.b != axjxVar.b) {
            return false;
        }
        List list = this.d;
        if (list == null ? axjxVar.d != null : !list.equals(axjxVar.d)) {
            return false;
        }
        return Arrays.equals(this.c, axjxVar.c);
    }

    @Override // defpackage.axiv
    protected final long h() {
        long j;
        Iterator it;
        if (k()) {
            int length = this.c.length;
            j = 24;
        } else {
            j = 4;
        }
        long j2 = j + 4;
        while (this.d.iterator().hasNext()) {
            j2 += ((axmh) it.next()).a();
        }
        return j2;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        byte[] bArr = this.c;
        int i2 = 0;
        int hashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List list = this.d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @Override // defpackage.axiv
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if ((r() & 1) > 0) {
            this.a = hy.G(byteBuffer);
            this.b = hy.H(byteBuffer);
            byte[] bArr = new byte[16];
            this.c = bArr;
            byteBuffer.get(bArr);
        }
        long I = hy.I(byteBuffer);
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        List l = l(duplicate, I, 8);
        this.d = l;
        if (l == null) {
            this.d = l(duplicate2, I, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - duplicate.remaining());
        }
        if (this.d != null) {
            return;
        }
        throw new RuntimeException("Cannot parse SampleEncryptionBox");
    }

    @Override // defpackage.axiv
    protected final void j(ByteBuffer byteBuffer) {
        axmc[] axmcVarArr;
        t(byteBuffer);
        if (k()) {
            hy.x(byteBuffer, this.a);
            hy.z(byteBuffer, this.b);
            byteBuffer.put(this.c);
        }
        hy.y(byteBuffer, this.d.size());
        for (axmh axmhVar : this.d) {
            if (axmhVar.a() > 0) {
                byte[] bArr = axmhVar.a;
                int length = bArr.length;
                if (length == 8 || length == 16) {
                    byteBuffer.put(bArr);
                    if ((r() & 2) > 0) {
                        hy.w(byteBuffer, axmhVar.b.length);
                        for (axmc axmcVar : axmhVar.b) {
                            hy.w(byteBuffer, axmcVar.a());
                            hy.y(byteBuffer, axmcVar.b());
                        }
                    }
                } else {
                    throw new RuntimeException("IV must be either 8 or 16 bytes");
                }
            }
        }
    }

    public final boolean k() {
        return (r() & 1) > 0;
    }
}
