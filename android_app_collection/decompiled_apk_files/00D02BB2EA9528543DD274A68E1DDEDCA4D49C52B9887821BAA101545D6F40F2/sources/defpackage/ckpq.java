package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ckpq  reason: default package */
/* loaded from: classes.dex */
final class ckpq extends gh {
    final /* synthetic */ ckpr a;

    public ckpq(ckpr ckprVar) {
        this.a = ckprVar;
    }

    @Override // defpackage.gh
    public final void a(gn gnVar, fd fdVar) {
        ckoy remove = this.a.c.remove(fdVar);
        if (remove != null) {
            remove.c(0);
        }
    }

    @Override // defpackage.gh
    public final void b(fd fdVar) {
        ckoy c;
        ckoy remove = this.a.d.remove(fdVar);
        if (remove != null) {
            remove.c(0);
        }
        ddho c2 = ckpr.c(fdVar);
        if (c2 == null || (c = this.a.k.c(c2)) == null) {
            return;
        }
        c.b(0);
        this.a.e.put(fdVar, c);
    }

    @Override // defpackage.gh
    public final void c(fd fdVar, Bundle bundle) {
        ddho c = ckpr.c(fdVar);
        if (c != null) {
            ckoy a = this.a.k.a(c);
            if (a != null) {
                a.b(0);
                this.a.c.put(fdVar, a);
            }
            ckoy b = this.a.k.b(c);
            if (b == null) {
                return;
            }
            b.b(0);
            this.a.d.put(fdVar, b);
        }
    }

    @Override // defpackage.gh
    public final void i(fd fdVar) {
        ckoy remove = this.a.e.remove(fdVar);
        if (remove != null) {
            remove.c(0);
        }
    }
}
