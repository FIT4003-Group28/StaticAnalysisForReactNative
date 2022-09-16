package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ayg  reason: default package */
/* loaded from: classes2.dex */
public final class ayg implements asv {
    private final asv a;
    private final axd b;
    private boolean c;
    private long d;

    public ayg(asv asvVar, axd axdVar) {
        ptx.a(asvVar);
        this.a = asvVar;
        this.b = axdVar;
    }

    @Override // defpackage.asv
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.asv
    public final void b(atk atkVar) {
        ptx.a(atkVar);
        this.a.b(atkVar);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int g = this.a.g(bArr, i, i2);
        if (g > 0) {
            this.b.c(bArr, i, g);
            long j = this.d;
            if (j != -1) {
                this.d = j - g;
            }
        }
        return g;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        long h = this.a.h(asyVar);
        this.d = h;
        if (h == 0) {
            return 0L;
        }
        if (asyVar.h == -1 && h != -1) {
            asyVar = asyVar.c(0L, h);
        }
        this.c = true;
        this.b.b(asyVar);
        return this.d;
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.a.i();
    }

    @Override // defpackage.asv
    public final void j() {
        try {
            this.a.j();
            if (!this.c) {
                return;
            }
            this.c = false;
            this.b.a();
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
            throw th;
        }
    }
}
