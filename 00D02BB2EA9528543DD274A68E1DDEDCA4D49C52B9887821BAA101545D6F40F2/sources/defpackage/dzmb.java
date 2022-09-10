package defpackage;

import java.util.NoSuchElementException;
/* compiled from: PG */
/* renamed from: dzmb  reason: default package */
/* loaded from: classes6.dex */
class dzmb {
    int d;
    final /* synthetic */ dzmd g;
    int c = -1;
    int e = -1;
    int f = 0;

    public dzmb(dzmd dzmdVar) {
        this.g = dzmdVar;
        this.d = dzmdVar.e;
    }

    private final void a() {
        int i;
        if (this.f >= 0) {
            return;
        }
        if (this.c == -1) {
            i = 0;
        } else if (this.d != -1) {
            int i2 = this.g.e;
            this.f = 1;
            while (i2 != this.c) {
                i2 = (int) this.g.g[i2];
                this.f++;
            }
            return;
        } else {
            i = this.g.j;
        }
        this.f = i;
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        r1[r0] = r4;
        r4 = r6.b;
        r4[r0] = r4[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
        if (r13.d != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r13.d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r13.c != r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r13.c = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzmb.remove():void");
    }
}
