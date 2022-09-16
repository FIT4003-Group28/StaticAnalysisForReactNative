package defpackage;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: agpz  reason: default package */
/* loaded from: classes.dex */
public final class agpz implements pde {
    public final String a;
    private final pde b;
    private final asu c;

    public agpz(pde pdeVar, String str) {
        agpy agpyVar = new agpy();
        aqxo.p(pdeVar != null);
        this.b = pdeVar;
        this.a = str;
        this.c = agpyVar;
    }

    @Override // defpackage.pde
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.pde
    public final pdj b(String str, long j) {
        return this.b.b(str, j);
    }

    @Override // defpackage.pde
    public final pdj c(String str, long j) {
        try {
            return this.b.c(str, j);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.pde
    public final pdp d(String str) {
        return this.b.d(str);
    }

    @Override // defpackage.pde
    public final File e(String str, long j, long j2) {
        return this.b.e(str, j, j2);
    }

    @Override // defpackage.pde
    public final NavigableSet f(String str) {
        return this.b.f(str);
    }

    @Override // defpackage.pde
    public final Set g() {
        return this.b.g();
    }

    @Override // defpackage.pde
    public final void h(String str, pdq pdqVar) {
        this.b.h(str, pdqVar);
    }

    @Override // defpackage.pde
    public final void i(File file, long j) {
        this.b.i(file, j);
    }

    @Override // defpackage.pde
    public final void j() {
        this.b.j();
    }

    @Override // defpackage.pde
    public final void k(pdj pdjVar) {
        this.b.k(pdjVar);
    }

    @Override // defpackage.pde
    public final void l(pdj pdjVar) {
        this.b.l(pdjVar);
    }

    @Override // defpackage.pde
    public final boolean m(String str, long j, long j2) {
        return this.b.m(str, j, j2);
    }

    public final asv n() {
        return this.c.a();
    }

    public final boolean o() {
        pde pdeVar = this.b;
        if (pdeVar instanceof pdx) {
            try {
                ((pdx) pdeVar).p();
                return true;
            } catch (pdc unused) {
                return false;
            }
        }
        return true;
    }
}
