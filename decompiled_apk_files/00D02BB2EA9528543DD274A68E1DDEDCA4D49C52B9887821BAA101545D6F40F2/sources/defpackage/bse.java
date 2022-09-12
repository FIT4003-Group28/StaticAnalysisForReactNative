package defpackage;

import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bse  reason: default package */
/* loaded from: classes.dex */
public final class bse {
    public final bsf a;
    public final boolean[] b;
    final /* synthetic */ bsh c;
    private boolean d;

    public bse(bsh bshVar, bsf bsfVar) {
        this.c = bshVar;
        this.a = bsfVar;
        this.b = bsfVar.e ? null : new boolean[bshVar.b];
    }

    public final void a() {
        this.c.c(this, true);
        this.d = true;
    }

    public final void b() {
        this.c.c(this, false);
    }

    public final void c() {
        if (!this.d) {
            try {
                b();
            } catch (IOException unused) {
            }
        }
    }

    public final File d() {
        File d;
        synchronized (this.c) {
            bsf bsfVar = this.a;
            if (bsfVar.f == this) {
                if (!bsfVar.e) {
                    this.b[0] = true;
                }
                d = bsfVar.d();
                if (!this.c.a.exists()) {
                    this.c.a.mkdirs();
                }
            } else {
                throw new IllegalStateException();
            }
        }
        return d;
    }
}
