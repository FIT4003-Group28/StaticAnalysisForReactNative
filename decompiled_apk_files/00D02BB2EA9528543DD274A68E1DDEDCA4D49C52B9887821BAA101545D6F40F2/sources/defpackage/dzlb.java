package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzlb  reason: default package */
/* loaded from: classes6.dex */
public final class dzlb extends dzkk implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient long[] a = dzmw.a;
    public transient double[] b = dzhh.a;
    public int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int l(dzlb dzlbVar) {
        int i = dzlbVar.c;
        dzlbVar.c = i - 1;
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int i = this.c;
        this.a = new long[i];
        this.b = new double[i];
        for (int i2 = 0; i2 < this.c; i2++) {
            this.a[i2] = objectInputStream.readLong();
            this.b[i2] = objectInputStream.readDouble();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.c; i++) {
            objectOutputStream.writeLong(this.a[i]);
            objectOutputStream.writeDouble(this.b[i]);
        }
    }

    @Override // defpackage.dzki, defpackage.dzlc
    public final double a(long j, double d) {
        int h = h(j);
        if (h != -1) {
            double[] dArr = this.b;
            double d2 = dArr[h];
            dArr[h] = d;
            return d2;
        }
        int i = this.c;
        if (i == this.a.length) {
            int i2 = 2;
            long[] jArr = new long[i == 0 ? 2 : i + i];
            if (i != 0) {
                i2 = i + i;
            }
            double[] dArr2 = new double[i2];
            while (true) {
                int i3 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i3] = this.a[i3];
                dArr2[i3] = this.b[i3];
                i = i3;
            }
            this.a = jArr;
            this.b = dArr2;
        }
        long[] jArr2 = this.a;
        int i4 = this.c;
        jArr2[i4] = j;
        this.b[i4] = d;
        this.c = i4 + 1;
        return dcyn.a;
    }

    @Override // defpackage.dzki
    public final double b(long j) {
        int h = h(j);
        if (h == -1) {
            return dcyn.a;
        }
        double d = this.b[h];
        int i = (this.c - h) - 1;
        long[] jArr = this.a;
        int i2 = h + 1;
        System.arraycopy(jArr, i2, jArr, h, i);
        double[] dArr = this.b;
        System.arraycopy(dArr, i2, dArr, h, i);
        this.c--;
        return d;
    }

    @Override // defpackage.dzki, defpackage.dzgu
    public final void clear() {
        this.c = 0;
    }

    @Override // defpackage.dzkk
    public final boolean d(double d) {
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (this.b[i2] == d) {
                    return true;
                }
                i = i2;
            } else {
                return false;
            }
        }
    }

    @Override // defpackage.dzkk, defpackage.dzlc
    public final boolean e(long j) {
        return h(j) != -1;
    }

    @Override // defpackage.dzkk, defpackage.dzlf
    public final dznf f() {
        return new dzmv(this.a, this.c);
    }

    @Override // defpackage.dzkk
    public final dzhi g() {
        return new dzhk(new dzhg(this.b, this.c));
    }

    public final int h(long j) {
        long[] jArr = this.a;
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (jArr[i2] == j) {
                    return i2;
                }
                i = i2;
            } else {
                return -1;
            }
        }
    }

    @Override // defpackage.dzlc
    public final double i(long j) {
        long[] jArr = this.a;
        int i = this.c;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (jArr[i2] == j) {
                    return this.b[i2];
                }
                i = i2;
            } else {
                return dcyn.a;
            }
        }
    }

    @Override // defpackage.dzkk, java.util.Map
    public final boolean isEmpty() {
        return this.c == 0;
    }

    /* renamed from: j */
    public final dzlb clone() {
        try {
            dzlb dzlbVar = (dzlb) super.clone();
            dzlbVar.a = (long[]) this.a.clone();
            dzlbVar.b = (double[]) this.b.clone();
            return dzlbVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzlf
    public final /* bridge */ /* synthetic */ dzrv k() {
        return new dzla(this);
    }

    @Override // defpackage.dzkk, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dzkk, java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Double> values() {
        return values();
    }
}
