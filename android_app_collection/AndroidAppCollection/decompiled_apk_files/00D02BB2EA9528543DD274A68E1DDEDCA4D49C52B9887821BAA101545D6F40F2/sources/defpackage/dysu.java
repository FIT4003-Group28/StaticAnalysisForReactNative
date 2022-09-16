package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: dysu  reason: default package */
/* loaded from: classes6.dex */
public final class dysu implements dyoo {
    public final dyvt a;
    private final dyst b;
    private dyvs d;
    private final dyvi h;
    private boolean i;
    private int j;
    private long l;
    private int c = -1;
    private dyfi e = dyfg.a;
    private final dyss f = new dyss(this);
    private final byte[] g = new byte[5];
    private int k = -1;

    public dysu(dyst dystVar, dyvt dyvtVar, dyvi dyviVar) {
        this.b = dystVar;
        dbsk.t(dyvtVar, "bufferAllocator");
        this.a = dyvtVar;
        dbsk.t(dyviVar, "statsTraceCtx");
        this.h = dyviVar;
    }

    private final void h(dysr dysrVar, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.g);
        wrap.put(z ? (byte) 1 : (byte) 0);
        int i = 0;
        for (dyvs dyvsVar : dysrVar.a) {
            i += dyvsVar.d();
        }
        wrap.putInt(i);
        dyvs a = this.a.a(5);
        a.a(this.g, 0, wrap.position());
        if (i == 0) {
            this.d = a;
            return;
        }
        this.b.w(a, false, false, this.j - 1);
        this.j = 1;
        List<dyvs> list = dysrVar.a;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.b.w(list.get(i2), false, false, 0);
        }
        this.d = list.get(list.size() - 1);
        this.l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int i(InputStream inputStream, OutputStream outputStream) {
        return inputStream.a(outputStream);
    }

    private final void j(boolean z, boolean z2) {
        dyvs dyvsVar = this.d;
        this.d = null;
        this.b.w(dyvsVar, z, z2, this.j);
        this.j = 0;
    }

    @Override // defpackage.dyoo
    public final void a(InputStream inputStream) {
        int i;
        if (!this.i) {
            this.j++;
            this.k++;
            this.l = 0L;
            this.h.j();
            dyfi dyfiVar = this.e;
            dyfh dyfhVar = dyfg.a;
            try {
                int available = inputStream.available();
                if (available != 0 && dyfiVar != dyfhVar) {
                    dysr dysrVar = new dysr(this);
                    try {
                        i = i(inputStream, dysrVar);
                        dysrVar.close();
                        int i2 = this.c;
                        if (i2 >= 0 && i > i2) {
                            throw dyjb.j.g(String.format("message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.c))).j();
                        }
                        h(dysrVar, true);
                    } catch (Throwable th) {
                        dysrVar.close();
                        throw th;
                    }
                } else if (available == -1) {
                    dysr dysrVar2 = new dysr(this);
                    i = i(inputStream, dysrVar2);
                    int i3 = this.c;
                    if (i3 >= 0 && i > i3) {
                        throw dyjb.j.g(String.format("message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.c))).j();
                    }
                    h(dysrVar2, false);
                } else {
                    this.l = available;
                    int i4 = this.c;
                    if (i4 >= 0 && available > i4) {
                        throw dyjb.j.g(String.format("message too large %d > %d", Integer.valueOf(available), Integer.valueOf(this.c))).j();
                    }
                    ByteBuffer wrap = ByteBuffer.wrap(this.g);
                    wrap.put((byte) 0);
                    wrap.putInt(available);
                    if (this.d == null) {
                        this.d = this.a.a(wrap.position() + available);
                    }
                    g(this.g, 0, wrap.position());
                    i = i(inputStream, this.f);
                }
                if (available == -1 || i == available) {
                    this.h.l();
                    this.h.d(this.l);
                    this.h.k();
                    return;
                }
                throw dyjb.l.g(String.format("Message length inaccurate %s != %s", Integer.valueOf(i), Integer.valueOf(available))).j();
            } catch (IOException e) {
                throw dyjb.l.g("Failed to frame message").f(e).j();
            } catch (RuntimeException e2) {
                throw dyjb.l.g("Failed to frame message").f(e2).j();
            }
        }
        throw new IllegalStateException("Framer already closed");
    }

    @Override // defpackage.dyoo
    public final void b() {
        dyvs dyvsVar = this.d;
        if (dyvsVar == null || dyvsVar.d() <= 0) {
            return;
        }
        j(false, true);
    }

    @Override // defpackage.dyoo
    public final boolean c() {
        return this.i;
    }

    @Override // defpackage.dyoo
    public final void d() {
        if (!this.i) {
            this.i = true;
            dyvs dyvsVar = this.d;
            if (dyvsVar != null && dyvsVar.d() == 0 && this.d != null) {
                this.d = null;
            }
            j(true, true);
        }
    }

    @Override // defpackage.dyoo
    public final void e(int i) {
        dbsk.m(this.c == -1, "max size already set");
        this.c = i;
    }

    @Override // defpackage.dyoo
    public final /* bridge */ /* synthetic */ void f(dyfi dyfiVar) {
        this.e = dyfiVar;
    }

    public final void g(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            dyvs dyvsVar = this.d;
            if (dyvsVar != null && dyvsVar.c() == 0) {
                j(false, false);
            }
            if (this.d == null) {
                this.d = this.a.a(i2);
            }
            int min = Math.min(i2, this.d.c());
            this.d.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }
}
