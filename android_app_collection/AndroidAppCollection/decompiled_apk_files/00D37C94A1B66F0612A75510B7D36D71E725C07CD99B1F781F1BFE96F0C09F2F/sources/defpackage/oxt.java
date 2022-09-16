package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oxt  reason: default package */
/* loaded from: classes4.dex */
public final class oxt implements pbx {
    private final Uri a;
    private final pbl b;
    private final oxu c;
    private final int d;
    private final oxz e;
    private volatile boolean f;
    private boolean g;
    private final pbo h;

    public oxt(Uri uri, pbl pblVar, oxu oxuVar, pbo pboVar, int i, long j) {
        pce.a(uri);
        this.a = uri;
        this.b = pblVar;
        pce.a(oxuVar);
        this.c = oxuVar;
        this.h = pboVar;
        this.d = i;
        oxz oxzVar = new oxz();
        this.e = oxzVar;
        oxzVar.a = j;
        this.g = true;
    }

    @Override // defpackage.pbx
    public final void i() {
        this.f = true;
    }

    @Override // defpackage.pbx
    public final void k() {
        oxn oxnVar;
        while (!this.f) {
            int i = 0;
            try {
                long j = this.e.a;
                long b = this.b.b(new pbn(this.a, j, -1L, null));
                if (b != -1) {
                    b += j;
                }
                oxn oxnVar2 = new oxn(this.b, j, b);
                try {
                    oxq a = this.c.a(oxnVar2);
                    if (this.g) {
                        a.d();
                        this.g = false;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f) {
                                i2 = 0;
                                break;
                            } else {
                                this.h.b(this.d);
                                i2 = a.e(oxnVar2, this.e);
                            }
                        } catch (Throwable th) {
                            oxnVar = oxnVar2;
                            th = th;
                            i = i2;
                            if (i != 1 && oxnVar != null) {
                                this.e.a = oxnVar.c;
                            }
                            pcx.n(this.b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.e.a = oxnVar2.c;
                        i = i2;
                    }
                    pcx.n(this.b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    oxnVar = oxnVar2;
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                oxnVar = null;
            }
        }
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.f;
    }
}
