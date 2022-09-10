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
/* renamed from: dzis  reason: default package */
/* loaded from: classes6.dex */
public final class dzis extends dzhu implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] b;
    protected transient int[] c;
    protected transient int d;
    protected transient boolean e;
    protected transient int f;
    protected transient int g;
    protected int h;
    protected transient dzkg i;
    protected transient dzkc j;
    protected transient dzip k;

    public dzis() {
        int g = dzgv.g(16, 0.75f);
        this.f = g;
        this.d = g - 1;
        this.g = dzgv.f(g, 0.75f);
        int i = this.f + 1;
        this.b = new int[i];
        this.c = new int[i];
    }

    private final int m() {
        return this.e ? this.h - 1 : this.h;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.h, 0.75f);
        this.f = g;
        this.g = dzgv.f(g, 0.75f);
        int i2 = this.f;
        this.d = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.b = iArr;
        int[] iArr2 = new int[i3];
        this.c = iArr2;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                int readInt = objectInputStream.readInt();
                int readInt2 = objectInputStream.readInt();
                if (readInt == 0) {
                    i = this.f;
                    this.e = true;
                } else {
                    int a = dzgv.a(readInt);
                    int i6 = this.d;
                    while (true) {
                        i = a & i6;
                        if (iArr[i] != 0) {
                            a = i + 1;
                            i6 = this.d;
                        }
                    }
                }
                iArr[i] = readInt;
                iArr2[i] = readInt2;
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        dziq dziqVar = new dziq(this);
        objectOutputStream.defaultWriteObject();
        int i = this.h;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int b = dziqVar.b();
                objectOutputStream.writeInt(iArr[b]);
                objectOutputStream.writeInt(iArr2[b]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzij
    public final /* bridge */ /* synthetic */ dzrv SX() {
        if (this.k == null) {
            this.k = new dzip(this);
        }
        return this.k;
    }

    @Override // defpackage.dzht
    public final int b(int i) {
        int i2;
        if (i == 0) {
            return this.e ? j() : this.a;
        }
        int[] iArr = this.b;
        int a = dzgv.a(i) & this.d;
        int i3 = iArr[a];
        if (i3 == 0) {
            return this.a;
        }
        if (i != i3) {
            do {
                a = (a + 1) & this.d;
                i2 = iArr[a];
                if (i2 == 0) {
                    return this.a;
                }
            } while (i != i2);
            return i(a);
        }
        return i(a);
    }

    @Override // defpackage.dzht, defpackage.dzgu
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.e = false;
        Arrays.fill(this.b, 0);
    }

    @Override // defpackage.dzhu
    public final boolean d(int i) {
        int[] iArr = this.c;
        int[] iArr2 = this.b;
        if (!this.e || iArr[this.f] != i) {
            int i2 = this.f;
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    return false;
                }
                if (iArr2[i3] != 0 && iArr[i3] == i) {
                    return true;
                }
                i2 = i3;
            }
        } else {
            return true;
        }
    }

    @Override // defpackage.dzhu, defpackage.dzii
    public final boolean e(int i) {
        int i2;
        if (i == 0) {
            return this.e;
        }
        int[] iArr = this.b;
        int a = dzgv.a(i) & this.d;
        int i3 = iArr[a];
        if (i3 == 0) {
            return false;
        }
        if (i == i3) {
            return true;
        }
        do {
            a = (a + 1) & this.d;
            i2 = iArr[a];
            if (i2 == 0) {
                return false;
            }
        } while (i != i2);
        return true;
    }

    @Override // defpackage.dzhu
    public final dzkg f() {
        if (this.i == null) {
            this.i = new dzin(this);
        }
        return this.i;
    }

    @Override // defpackage.dzhu
    public final dzkc g() {
        if (this.j == null) {
            this.j = new dzik(this);
        }
        return this.j;
    }

    @Override // defpackage.dzii
    public final int h(int i) {
        int i2;
        if (i == 0) {
            return this.e ? this.c[this.f] : this.a;
        }
        int[] iArr = this.b;
        int a = dzgv.a(i) & this.d;
        int i3 = iArr[a];
        if (i3 == 0) {
            return this.a;
        }
        if (i != i3) {
            do {
                a = (a + 1) & this.d;
                i2 = iArr[a];
                if (i2 == 0) {
                    return this.a;
                }
            } while (i != i2);
            return this.c[a];
        }
        return this.c[a];
    }

    @Override // defpackage.dzhu, java.util.Map
    public final int hashCode() {
        int i;
        int m = m();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = m - 1;
            if (m == 0) {
                break;
            }
            while (true) {
                i = this.b[i2];
                if (i == 0) {
                    i2++;
                }
            }
            i3 += i ^ this.c[i2];
            i2++;
            m = i4;
        }
        return this.e ? i3 + this.c[this.f] : i3;
    }

    public final int i(int i) {
        int i2;
        int i3;
        int i4 = this.c[i];
        this.h--;
        int[] iArr = this.b;
        loop0: while (true) {
            int i5 = (i + 1) & this.d;
            while (true) {
                i2 = iArr[i5];
                if (i2 == 0) {
                    break loop0;
                }
                int i6 = this.d;
                int a = dzgv.a(i2) & i6;
                if (i > i5) {
                    if (i >= a && a > i5) {
                        break;
                    }
                    i5 = (i5 + 1) & i6;
                } else if (i < a && a <= i5) {
                    i5 = (i5 + 1) & i6;
                }
            }
            iArr[i] = i2;
            int[] iArr2 = this.c;
            iArr2[i] = iArr2[i5];
            i = i5;
        }
        iArr[i] = 0;
        if (this.h < this.g / 4 && (i3 = this.f) > 16) {
            k(i3 >> 1);
        }
        return i4;
    }

    @Override // defpackage.dzhu, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final int j() {
        this.e = false;
        int[] iArr = this.c;
        int i = this.f;
        int i2 = iArr[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i3 < this.g / 4 && i > 16) {
            k(i >> 1);
        }
        return i2;
    }

    protected final void k(int i) {
        int i2;
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int i5 = this.f;
        int m = m();
        while (true) {
            int i6 = m - 1;
            if (m != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int a = dzgv.a(i2) & i3;
                if (iArr3[a] != 0) {
                    do {
                        a = (a + 1) & i3;
                    } while (iArr3[a] != 0);
                }
                iArr3[a] = iArr[i5];
                iArr4[a] = iArr2[i5];
                m = i6;
            } else {
                iArr4[i] = iArr2[this.f];
                this.f = i;
                this.d = i3;
                this.g = dzgv.f(i, 0.75f);
                this.b = iArr3;
                this.c = iArr4;
                return;
            }
        }
    }

    @Override // defpackage.dzhu, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    /* renamed from: l */
    public final dzis clone() {
        try {
            dzis dzisVar = (dzis) super.clone();
            dzisVar.i = null;
            dzisVar.j = null;
            dzisVar.k = null;
            dzisVar.e = this.e;
            dzisVar.b = (int[]) this.b.clone();
            dzisVar.c = (int[]) this.c.clone();
            return dzisVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzhu, java.util.Map
    public final void putAll(Map<? extends Integer, ? extends Integer> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.h + map.size()) / 0.75f))));
        if (min > this.f) {
            k(min);
        }
        int size = map.size();
        Iterator<Map.Entry<? extends Integer, ? extends Integer>> it = map.entrySet().iterator();
        if (map instanceof dzij) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzio dzioVar = (dzio) it.next();
                a(dzioVar.a(), dzioVar.b());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends Integer, ? extends Integer> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // defpackage.dzhu, java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Integer> values() {
        return values();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // defpackage.dzht
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 != 0) goto L10
            boolean r2 = r5.e
            if (r2 == 0) goto Lb
            int r0 = r5.f
            goto L49
        Lb:
            r5.e = r1
            int r2 = r5.f
            goto L2d
        L10:
            int[] r2 = r5.b
            int r3 = defpackage.dzgv.a(r6)
            int r4 = r5.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r6) goto L21
        L1f:
            r0 = r3
            goto L49
        L21:
            int r3 = r3 + r1
            int r4 = r5.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r6) goto L21
            goto L1f
        L2c:
            r2 = r3
        L2d:
            int[] r3 = r5.b
            r3[r2] = r6
            int[] r6 = r5.c
            r6[r2] = r7
            int r6 = r5.h
            int r2 = r6 + 1
            r5.h = r2
            int r3 = r5.g
            if (r6 < r3) goto L49
            int r2 = r2 + r1
            r6 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.dzgv.g(r2, r6)
            r5.k(r6)
        L49:
            if (r0 >= 0) goto L4e
            int r6 = r5.a
            return r6
        L4e:
            int[] r6 = r5.c
            r1 = r6[r0]
            r6[r0] = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzis.a(int, int):int");
    }
}
