package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzql  reason: default package */
/* loaded from: classes6.dex */
public class dzql {
    int d;
    int f;
    final /* synthetic */ dzqn g;
    int c = -1;
    int e = -1;

    public dzql(dzqn dzqnVar) {
        this.g = dzqnVar;
        this.d = -1;
        this.f = -1;
        this.d = dzqnVar.f;
        this.f = 0;
    }

    public static final void c() {
        throw new UnsupportedOperationException();
    }

    public static final void d() {
        throw new UnsupportedOperationException();
    }

    private final void e() {
        if (this.f >= 0) {
            return;
        }
        if (this.c == -1) {
            this.f = 0;
        } else if (this.d == -1) {
            this.f = this.g.k;
        } else {
            int i = this.g.f;
            this.f = 1;
            while (i != this.c) {
                i = (int) this.g.h[i];
                this.f++;
            }
        }
    }

    public final int a() {
        if (hasNext()) {
            int i = this.d;
            this.e = i;
            this.d = (int) this.g.h[i];
            this.c = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    public final int b() {
        if (hasPrevious()) {
            int i = this.c;
            this.e = i;
            this.c = (int) (this.g.h[i] >>> 32);
            this.d = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 - 1;
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.d != -1;
    }

    public final boolean hasPrevious() {
        return this.c != -1;
    }

    public final int nextIndex() {
        e();
        return this.f;
    }

    public final int previousIndex() {
        e();
        return this.f - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void remove() {
        Object obj;
        dzqn dzqnVar;
        e();
        int i = this.e;
        if (i != -1) {
            int i2 = this.c;
            if (i == i2) {
                this.f--;
                i2 = (int) (this.g.h[i] >>> 32);
                this.c = i2;
            } else {
                this.d = (int) this.g.h[i];
            }
            dzqn dzqnVar2 = this.g;
            dzqnVar2.k--;
            if (i2 == -1) {
                dzqnVar2.f = this.d;
            } else {
                long[] jArr = dzqnVar2.h;
                long j = jArr[i2];
                jArr[i2] = j ^ (((this.d & 4294967295L) ^ j) & 4294967295L);
            }
            int i3 = this.d;
            if (i3 == -1) {
                dzqnVar2.g = i2;
            } else {
                long[] jArr2 = dzqnVar2.h;
                long j2 = jArr2[i3];
                jArr2[i3] = ((((4294967295L & i2) << 32) ^ j2) & (-4294967296L)) ^ j2;
            }
            this.e = -1;
            int i4 = dzqnVar2.i;
            if (i == i4) {
                dzqnVar2.e = false;
                dzqnVar2.b[i4] = 0;
                dzqnVar2.c[i4] = 0;
                return;
            }
            Object[] objArr = dzqnVar2.b;
            while (true) {
                int i5 = (i + 1) & this.g.d;
                while (true) {
                    obj = objArr[i5];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        dzqnVar = this.g;
                        int i6 = dzqnVar.d;
                        int a = dzgv.a(hashCode) & i6;
                        if (i > i5) {
                            if (i >= a && a > i5) {
                                break;
                            }
                            i5 = (i5 + 1) & i6;
                        } else if (i >= a || a > i5) {
                            break;
                        } else {
                            i5 = (i5 + 1) & i6;
                        }
                    } else {
                        objArr[i] = null;
                        this.g.c[i] = 0;
                        return;
                    }
                }
                objArr[i] = obj;
                Object[] objArr2 = dzqnVar.c;
                objArr2[i] = objArr2[i5];
                if (this.d == i5) {
                    this.d = i;
                }
                if (this.c == i5) {
                    this.c = i;
                }
                dzqnVar.k(i5, i);
                i = i5;
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
