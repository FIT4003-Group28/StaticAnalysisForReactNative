package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzje  reason: default package */
/* loaded from: classes.dex */
public class dzje {
    int d;
    int f;
    final /* synthetic */ dzjg g;
    int c = -1;
    int e = -1;

    public dzje(dzjg dzjgVar) {
        this.g = dzjgVar;
        this.d = -1;
        this.f = -1;
        this.d = dzjgVar.e;
        this.f = 0;
    }

    private final void a() {
        if (this.f >= 0) {
            return;
        }
        if (this.c == -1) {
            this.f = 0;
        } else if (this.d == -1) {
            this.f = this.g.j;
        } else {
            int i = this.g.e;
            this.f = 1;
            while (i != this.c) {
                i = (int) this.g.g[i];
                this.f++;
            }
        }
    }

    public static final void e() {
        throw new UnsupportedOperationException();
    }

    public static final void f() {
        throw new UnsupportedOperationException();
    }

    public final int c() {
        if (hasNext()) {
            int i = this.d;
            this.e = i;
            this.d = (int) this.g.g[i];
            this.c = i;
            int i2 = this.f;
            if (i2 >= 0) {
                this.f = i2 + 1;
            }
            return i;
        }
        throw new NoSuchElementException();
    }

    public final int d() {
        if (hasPrevious()) {
            int i = this.c;
            this.e = i;
            this.c = (int) (this.g.g[i] >>> 32);
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
        a();
        return this.f;
    }

    public final int previousIndex() {
        a();
        return this.f - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        r1[r0] = r5;
        r5 = r6.b;
        r5[r0] = r5[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r13.d != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        r13.d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r13.c != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r13.c = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzje.remove():void");
    }
}
