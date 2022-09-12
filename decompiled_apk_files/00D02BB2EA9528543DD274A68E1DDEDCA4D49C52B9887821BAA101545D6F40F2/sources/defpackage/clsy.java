package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: PG */
/* renamed from: clsy  reason: default package */
/* loaded from: classes5.dex */
public final class clsy implements clrh {
    public boolean f;
    public long g;
    public long h;
    private int i;
    private clsx l;
    private ByteBuffer m;
    private ShortBuffer n;
    private ByteBuffer o;
    private boolean p;
    public float b = 1.0f;
    public float c = 1.0f;
    private clrf j = clrf.a;
    private clrf k = clrf.a;
    public clrf d = clrf.a;
    public clrf e = clrf.a;

    public clsy() {
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.i = -1;
    }

    @Override // defpackage.clrh
    public final clrf a(clrf clrfVar) {
        if (clrfVar.d == 2) {
            int i = this.i;
            if (i == -1) {
                i = clrfVar.b;
            }
            this.j = clrfVar;
            clrf clrfVar2 = new clrf(i, clrfVar.c, 2);
            this.k = clrfVar2;
            this.f = true;
            return clrfVar2;
        }
        throw new clrg(clrfVar);
    }

    @Override // defpackage.clrh
    public final boolean b() {
        if (this.k.b != -1) {
            return Math.abs(this.b + (-1.0f)) >= 1.0E-4f || Math.abs(this.c + (-1.0f)) >= 1.0E-4f || this.k.b != this.j.b;
        }
        return false;
    }

    @Override // defpackage.clrh
    public final void c(ByteBuffer byteBuffer) {
        clsx clsxVar = this.l;
        cmmn.f(clsxVar);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.g += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = clsxVar.a;
            int i2 = remaining2 / i;
            int i3 = i * i2;
            clsxVar.f = clsxVar.b(clsxVar.f, clsxVar.g, i2);
            asShortBuffer.get(clsxVar.f, clsxVar.g * clsxVar.a, (i3 + i3) / 2);
            clsxVar.g += i2;
            clsxVar.c();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = clsxVar.a();
        if (a > 0) {
            if (this.m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.m = order;
                this.n = order.asShortBuffer();
            } else {
                this.m.clear();
                this.n.clear();
            }
            ShortBuffer shortBuffer = this.n;
            int min = Math.min(shortBuffer.remaining() / clsxVar.a, clsxVar.i);
            shortBuffer.put(clsxVar.h, 0, clsxVar.a * min);
            int i4 = clsxVar.i - min;
            clsxVar.i = i4;
            short[] sArr = clsxVar.h;
            int i5 = clsxVar.a;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.h += a;
            this.m.limit(a);
            this.o = this.m;
        }
    }

    @Override // defpackage.clrh
    public final void d() {
        int i;
        clsx clsxVar = this.l;
        if (clsxVar != null) {
            int i2 = clsxVar.g;
            float f = clsxVar.b;
            float f2 = clsxVar.c;
            int i3 = clsxVar.i + ((int) ((((i2 / (f / f2)) + clsxVar.j) / (clsxVar.d * f2)) + 0.5f));
            short[] sArr = clsxVar.f;
            int i4 = clsxVar.e;
            clsxVar.f = clsxVar.b(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = clsxVar.e;
                i = i6 + i6;
                int i7 = clsxVar.a;
                if (i5 >= i * i7) {
                    break;
                }
                clsxVar.f[(i7 * i2) + i5] = 0;
                i5++;
            }
            clsxVar.g += i;
            clsxVar.c();
            if (clsxVar.i > i3) {
                clsxVar.i = i3;
            }
            clsxVar.g = 0;
            clsxVar.m = 0;
            clsxVar.j = 0;
        }
        this.p = true;
    }

    @Override // defpackage.clrh
    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.o;
        this.o = a;
        return byteBuffer;
    }

    @Override // defpackage.clrh
    public final boolean f() {
        clsx clsxVar;
        return this.p && ((clsxVar = this.l) == null || clsxVar.a() == 0);
    }

    @Override // defpackage.clrh
    public final void g() {
        if (b()) {
            this.d = this.j;
            this.e = this.k;
            if (this.f) {
                clrf clrfVar = this.d;
                this.l = new clsx(clrfVar.b, clrfVar.c, this.b, this.c, this.e.b);
            } else {
                clsx clsxVar = this.l;
                if (clsxVar != null) {
                    clsxVar.g = 0;
                    clsxVar.i = 0;
                    clsxVar.j = 0;
                    clsxVar.k = 0;
                    clsxVar.l = 0;
                    clsxVar.m = 0;
                    clsxVar.n = 0;
                    clsxVar.o = 0;
                    clsxVar.p = 0;
                    clsxVar.q = 0;
                }
            }
        }
        this.o = a;
        this.g = 0L;
        this.h = 0L;
        this.p = false;
    }

    @Override // defpackage.clrh
    public final void h() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.j = clrf.a;
        this.k = clrf.a;
        this.d = clrf.a;
        this.e = clrf.a;
        ByteBuffer byteBuffer = a;
        this.m = byteBuffer;
        this.n = byteBuffer.asShortBuffer();
        this.o = a;
        this.i = -1;
        this.f = false;
        this.l = null;
        this.g = 0L;
        this.h = 0L;
        this.p = false;
    }
}
