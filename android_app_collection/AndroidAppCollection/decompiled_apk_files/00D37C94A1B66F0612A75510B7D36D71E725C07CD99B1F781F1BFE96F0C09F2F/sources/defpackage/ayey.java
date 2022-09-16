package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: PG */
/* renamed from: ayey  reason: default package */
/* loaded from: classes2.dex */
public final class ayey extends aydr {
    private static final ayew b = new ayeu(1);
    private static final ayew c = new ayeu();
    private static final ayew d = new ayeu(2);
    private static final ayew e = new ayeu(3);
    private static final ayex f = new ayev();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public ayey() {
        this.g = new ArrayDeque();
    }

    private final int m(ayex ayexVar, int i, Object obj, int i2) {
        a(i);
        if (!this.g.isEmpty()) {
            p();
        }
        while (i > 0 && !this.g.isEmpty()) {
            aykl ayklVar = (aykl) this.g.peek();
            int min = Math.min(i, ayklVar.f());
            i2 = ayexVar.a(ayklVar, min, obj, i2);
            i -= min;
            this.a -= min;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(ayew ayewVar, int i, Object obj, int i2) {
        try {
            return m(ayewVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (this.i) {
            this.h.add((aykl) this.g.remove());
            aykl ayklVar = (aykl) this.g.peek();
            if (ayklVar == null) {
                return;
            }
            ayklVar.b();
            return;
        }
        ((aykl) this.g.remove()).close();
    }

    private final void p() {
        if (((aykl) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        aykl ayklVar = (aykl) this.g.peek();
        if (ayklVar != null) {
            int f2 = ayklVar.f();
            ayklVar.c();
            this.a += ayklVar.f() - f2;
        }
        while (true) {
            aykl ayklVar2 = (aykl) this.h.pollLast();
            if (ayklVar2 == null) {
                return;
            }
            ayklVar2.c();
            this.g.addFirst(ayklVar2);
            this.a += ayklVar2.f();
        }
    }

    @Override // defpackage.aydr, defpackage.aykl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.g.isEmpty()) {
            ((aykl) this.g.remove()).close();
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((aykl) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final boolean d() {
        for (aykl ayklVar : this.g) {
            if (!ayklVar.d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aykl
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.aykl
    public final int f() {
        return this.a;
    }

    @Override // defpackage.aykl
    public final aykl g(int i) {
        aykl ayklVar;
        int i2;
        aykl ayklVar2;
        if (i <= 0) {
            return aykp.a;
        }
        a(i);
        this.a -= i;
        ayey ayeyVar = null;
        ayey ayeyVar2 = null;
        while (true) {
            aykl ayklVar3 = (aykl) this.g.peek();
            int f2 = ayklVar3.f();
            if (f2 > i) {
                ayklVar2 = ayklVar3.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    ayklVar = ayklVar3.g(f2);
                    o();
                } else {
                    ayklVar = (aykl) this.g.poll();
                }
                aykl ayklVar4 = ayklVar;
                i2 = i - f2;
                ayklVar2 = ayklVar4;
            }
            if (ayeyVar == null) {
                ayeyVar = ayklVar2;
            } else {
                if (ayeyVar2 == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.g.size() + 2, 16);
                    }
                    ayeyVar2 = new ayey(i3);
                    ayeyVar2.h(ayeyVar);
                    ayeyVar = ayeyVar2;
                }
                ayeyVar2.h(ayklVar2);
            }
            if (i2 <= 0) {
                return ayeyVar;
            }
            i = i2;
        }
    }

    public final void h(aykl ayklVar) {
        boolean z = this.i && this.g.isEmpty();
        if (!(ayklVar instanceof ayey)) {
            this.g.add(ayklVar);
            this.a += ayklVar.f();
        } else {
            ayey ayeyVar = (ayey) ayklVar;
            while (!ayeyVar.g.isEmpty()) {
                this.g.add((aykl) ayeyVar.g.remove());
            }
            this.a += ayeyVar.a;
            ayeyVar.a = 0;
            ayeyVar.close();
        }
        if (z) {
            ((aykl) this.g.peek()).b();
        }
    }

    @Override // defpackage.aykl
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.aykl
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.aykl
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.aykl
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public ayey(int i) {
        this.g = new ArrayDeque(i);
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((aykl) this.h.remove()).close();
        }
        this.i = true;
        aykl ayklVar = (aykl) this.g.peek();
        if (ayklVar != null) {
            ayklVar.b();
        }
    }
}
