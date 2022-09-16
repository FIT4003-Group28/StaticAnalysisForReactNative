package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzls  reason: default package */
/* loaded from: classes.dex */
public final class dzls extends dzkm implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] b;
    protected transient int[] c;
    protected transient int d;
    protected transient boolean e;
    protected transient int f;
    protected transient int g;
    public int h;
    protected transient dznf i;
    protected transient dzkc j;
    protected transient dzlp k;

    public dzls() {
        this(16);
    }

    private final int o() {
        return this.e ? this.h - 1 : this.h;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        int i2;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.h, 0.75f);
        this.f = g;
        this.g = dzgv.f(g, 0.75f);
        int i3 = this.f;
        this.d = i3 - 1;
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        this.b = jArr;
        int[] iArr = new int[i4];
        this.c = iArr;
        int i5 = this.h;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                long readLong = objectInputStream.readLong();
                int readInt = objectInputStream.readInt();
                if (readLong == 0) {
                    i2 = this.f;
                    this.e = true;
                } else {
                    int b = (int) dzgv.b(readLong);
                    int i7 = this.d;
                    while (true) {
                        i = i7 & b;
                        if (jArr[i] == 0) {
                            break;
                        }
                        i7 = i + 1;
                        b = this.d;
                    }
                    i2 = i;
                }
                jArr[i2] = readLong;
                iArr[i2] = readInt;
                i5 = i6;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        long[] jArr = this.b;
        int[] iArr = this.c;
        dzlq dzlqVar = new dzlq(this);
        objectOutputStream.defaultWriteObject();
        int i = this.h;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int c = dzlqVar.c();
                objectOutputStream.writeLong(jArr[c]);
                objectOutputStream.writeInt(iArr[c]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzlj
    public final /* bridge */ /* synthetic */ dzrv SY() {
        if (this.k == null) {
            this.k = new dzlp(this);
        }
        return this.k;
    }

    @Override // defpackage.dzkl
    public final int b(long j) {
        long j2;
        if (j == 0) {
            return this.e ? k() : this.a;
        }
        long[] jArr = this.b;
        int b = this.d & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return this.a;
        }
        if (j != j3) {
            do {
                b = (b + 1) & this.d;
                j2 = jArr[b];
                if (j2 == 0) {
                    return this.a;
                }
            } while (j != j2);
            return j(b);
        }
        return j(b);
    }

    @Override // defpackage.dzkl, defpackage.dzgu
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.e = false;
        Arrays.fill(this.b, 0L);
    }

    @Override // defpackage.dzkm
    public final boolean e(int i) {
        int[] iArr = this.c;
        long[] jArr = this.b;
        if (!this.e || iArr[this.f] != i) {
            int i2 = this.f;
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    return false;
                }
                if (jArr[i3] != 0 && iArr[i3] == i) {
                    return true;
                }
                i2 = i3;
            }
        } else {
            return true;
        }
    }

    @Override // defpackage.dzkm, defpackage.dzli
    public final boolean f(long j) {
        long j2;
        if (j == 0) {
            return this.e;
        }
        long[] jArr = this.b;
        int b = this.d & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return false;
        }
        if (j == j3) {
            return true;
        }
        do {
            b = (b + 1) & this.d;
            j2 = jArr[b];
            if (j2 == 0) {
                return false;
            }
        } while (j != j2);
        return true;
    }

    @Override // defpackage.dzkm
    public final dznf g() {
        if (this.i == null) {
            this.i = new dzln(this);
        }
        return this.i;
    }

    @Override // defpackage.dzkm
    public final dzkc h() {
        if (this.j == null) {
            this.j = new dzlk(this);
        }
        return this.j;
    }

    @Override // defpackage.dzkm, java.util.Map
    public final int hashCode() {
        long j;
        int o = o();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = o - 1;
            if (o == 0) {
                break;
            }
            while (true) {
                j = this.b[i];
                if (j == 0) {
                    i++;
                }
            }
            i2 += dzgv.d(j) ^ this.c[i];
            i++;
            o = i3;
        }
        return this.e ? i2 + this.c[this.f] : i2;
    }

    @Override // defpackage.dzli
    public final int i(long j) {
        long j2;
        if (j == 0) {
            return this.e ? this.c[this.f] : this.a;
        }
        long[] jArr = this.b;
        int b = this.d & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return this.a;
        }
        if (j != j3) {
            do {
                b = (b + 1) & this.d;
                j2 = jArr[b];
                if (j2 == 0) {
                    return this.a;
                }
            } while (j != j2);
            return this.c[b];
        }
        return this.c[b];
    }

    @Override // defpackage.dzkm, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final int j(int i) {
        long j;
        int i2;
        int i3 = this.c[i];
        this.h--;
        long[] jArr = this.b;
        loop0: while (true) {
            int i4 = (i + 1) & this.d;
            while (true) {
                j = jArr[i4];
                if (j == 0) {
                    break loop0;
                }
                int i5 = this.d;
                int b = ((int) dzgv.b(j)) & i5;
                if (i > i4) {
                    if (i >= b && b > i4) {
                        break;
                    }
                    i4 = (i4 + 1) & i5;
                } else if (i < b && b <= i4) {
                    i4 = (i4 + 1) & i5;
                }
            }
            jArr[i] = j;
            int[] iArr = this.c;
            iArr[i] = iArr[i4];
            i = i4;
        }
        jArr[i] = 0;
        if (this.h < this.g / 4 && (i2 = this.f) > 16) {
            l(i2 >> 1);
        }
        return i3;
    }

    public final int k() {
        this.e = false;
        int[] iArr = this.c;
        int i = this.f;
        int i2 = iArr[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i3 < this.g / 4 && i > 16) {
            l(i >> 1);
        }
        return i2;
    }

    @Override // defpackage.dzkm, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    protected final void l(int i) {
        long j;
        long[] jArr = this.b;
        int[] iArr = this.c;
        int i2 = i - 1;
        int i3 = i + 1;
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        int i4 = this.f;
        int o = o();
        while (true) {
            int i5 = o - 1;
            if (o != 0) {
                do {
                    i4--;
                    j = jArr[i4];
                } while (j == 0);
                int b = ((int) dzgv.b(j)) & i2;
                if (jArr2[b] != 0) {
                    do {
                        b = (b + 1) & i2;
                    } while (jArr2[b] != 0);
                }
                jArr2[b] = jArr[i4];
                iArr2[b] = iArr[i4];
                o = i5;
            } else {
                iArr2[i] = iArr[this.f];
                this.f = i;
                this.d = i2;
                this.g = dzgv.f(i, 0.75f);
                this.b = jArr2;
                this.c = iArr2;
                return;
            }
        }
    }

    /* renamed from: m */
    public final dzls clone() {
        try {
            dzls dzlsVar = (dzls) super.clone();
            dzlsVar.i = null;
            dzlsVar.j = null;
            dzlsVar.k = null;
            dzlsVar.e = this.e;
            dzlsVar.b = (long[]) this.b.clone();
            dzlsVar.c = (int[]) this.c.clone();
            return dzlsVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void n() {
        int g = dzgv.g(this.h, 0.75f);
        if (g < this.f && this.h <= dzgv.f(g, 0.75f)) {
            try {
                l(g);
            } catch (OutOfMemoryError unused) {
            }
        }
    }

    @Override // defpackage.dzkm, java.util.Map
    public final void putAll(Map<? extends Long, ? extends Integer> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.h + map.size()) / 0.75f))));
        if (min > this.f) {
            l(min);
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Long, ? extends Integer>> it = map.entrySet().iterator();
        if (map instanceof dzlj) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzlo dzloVar = (dzlo) it.next();
                a(dzloVar.a(), dzloVar.b());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends Long, ? extends Integer> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // defpackage.dzkm, java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Integer> values() {
        return values();
    }

    public dzls(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        int g = dzgv.g(i, 0.75f);
        this.f = g;
        this.d = g - 1;
        this.g = dzgv.f(g, 0.75f);
        int i2 = this.f + 1;
        this.b = new long[i2];
        this.c = new int[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // defpackage.dzkl, defpackage.dzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r10, int r12) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 != 0) goto L14
            boolean r1 = r9.e
            if (r1 == 0) goto Lf
            int r0 = r9.f
            goto L55
        Lf:
            r9.e = r3
            int r1 = r9.f
            goto L39
        L14:
            long[] r4 = r9.b
            long r5 = defpackage.dzgv.b(r10)
            int r6 = (int) r5
            int r5 = r9.d
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L38
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L36
        L28:
            int r5 = r5 + r3
            int r6 = r9.d
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L38
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L28
        L36:
            r0 = r5
            goto L55
        L38:
            r1 = r5
        L39:
            long[] r2 = r9.b
            r2[r1] = r10
            int[] r10 = r9.c
            r10[r1] = r12
            int r10 = r9.h
            int r11 = r10 + 1
            r9.h = r11
            int r1 = r9.g
            if (r10 < r1) goto L55
            int r11 = r11 + r3
            r10 = 1061158912(0x3f400000, float:0.75)
            int r10 = defpackage.dzgv.g(r11, r10)
            r9.l(r10)
        L55:
            if (r0 >= 0) goto L5a
            int r10 = r9.a
            return r10
        L5a:
            int[] r10 = r9.c
            r11 = r10[r0]
            r10[r0] = r12
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzls.a(long, int):int");
    }
}
