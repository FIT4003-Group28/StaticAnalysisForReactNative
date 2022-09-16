package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: pgm  reason: default package */
/* loaded from: classes4.dex */
public final class pgm implements avx {
    private final List a = new ArrayList();
    private final boolean b;
    private pgn c;
    private boolean d;
    private pgl e;

    public pgm(boolean z) {
        this.b = z;
    }

    @Override // defpackage.avx
    public final int a() {
        pgl pglVar = this.e;
        if (pglVar == null) {
            pgn pgnVar = this.c;
            if (pgnVar != null) {
                return pgnVar.a();
            }
            return -1;
        }
        throw pglVar;
    }

    @Override // defpackage.avx
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            return -1;
        }
        return pgnVar.b(bufferInfo);
    }

    @Override // defpackage.avx
    public final MediaFormat c() {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            return null;
        }
        return pgnVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(pgn pgnVar) {
        if (this.d) {
            pgnVar.h();
        } else {
            for (ampw ampwVar : this.a) {
                ampwVar.a(pgnVar);
            }
        }
        this.c = pgnVar;
    }

    @Override // defpackage.avx
    public final ByteBuffer e(int i) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            return null;
        }
        return pgnVar.e(i);
    }

    @Override // defpackage.avx
    public final ByteBuffer f(int i) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            return null;
        }
        return pgnVar.f(i);
    }

    @Override // defpackage.avx
    public final void g() {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            return;
        }
        pgnVar.g();
    }

    @Override // defpackage.avx
    public final synchronized void h() {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            this.d = true;
        } else {
            pgnVar.h();
        }
    }

    @Override // defpackage.avx
    public final void i(int i, long j) {
        afms.a(this.c);
        this.c.i(i, j);
    }

    @Override // defpackage.avx
    public final synchronized void j(final Surface surface) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            this.a.add(new ampw() { // from class: pgj
                @Override // defpackage.ampw
                public final void a(Object obj) {
                    ((pgn) obj).j(surface);
                }
            });
        } else {
            pgnVar.j(surface);
        }
    }

    @Override // defpackage.avx
    public final synchronized void k(final Bundle bundle) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            this.a.add(new ampw() { // from class: pgi
                @Override // defpackage.ampw
                public final void a(Object obj) {
                    ((pgn) obj).k(bundle);
                }
            });
        } else {
            pgnVar.k(bundle);
        }
    }

    @Override // defpackage.avx
    public final synchronized void l(final int i) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            this.a.add(new ampw() { // from class: pgh
                @Override // defpackage.ampw
                public final void a(Object obj) {
                    ((pgn) obj).l(i);
                }
            });
        } else {
            pgnVar.l(i);
        }
    }

    @Override // defpackage.avx
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.avx
    public final synchronized void n(final pxp pxpVar, final Handler handler) {
        pgn pgnVar = this.c;
        if (pgnVar == null) {
            this.a.add(new ampw() { // from class: pgk
                @Override // defpackage.ampw
                public final void a(Object obj) {
                    ((pgn) obj).n(pxp.this, handler);
                }
            });
        } else {
            pgnVar.n(pxpVar, handler);
        }
    }

    @Override // defpackage.avx
    public final void o(int i, int i2, long j, int i3) {
        afms.a(this.c);
        this.c.o(i, i2, j, i3);
    }

    @Override // defpackage.avx
    public final void p(int i, pmq pmqVar, long j) {
        afms.a(this.c);
        this.c.p(i, pmqVar, j);
    }

    @Override // defpackage.avx
    public final void q(int i) {
        afms.a(this.c);
        this.c.q(i);
    }

    public final void r(Throwable th, Surface surface) {
        this.e = new pgl(th, surface);
    }
}
