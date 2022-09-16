package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: azgf  reason: default package */
/* loaded from: classes2.dex */
final class azgf extends ayrq {
    final ayom a;
    final Iterator b;
    volatile boolean c;
    boolean d;
    boolean e;
    boolean f;

    public azgf(ayom ayomVar, Iterator it) {
        this.a = ayomVar;
        this.b = it;
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.e;
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.c = true;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 1) != 0) {
            this.d = true;
            return 1;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        if (this.e) {
            return null;
        }
        if (this.f) {
            if (!this.b.hasNext()) {
                this.e = true;
                return null;
            }
        } else {
            this.f = true;
        }
        Object next = this.b.next();
        ayrd.b(next, "The iterator returned a null value");
        return next;
    }
}
