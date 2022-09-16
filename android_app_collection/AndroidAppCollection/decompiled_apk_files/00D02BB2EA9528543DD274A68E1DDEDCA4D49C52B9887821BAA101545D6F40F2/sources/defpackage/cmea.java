package defpackage;

import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: cmea  reason: default package */
/* loaded from: classes5.dex */
public final class cmea implements cmeg, cmef {
    public final cmej a;
    public final cmeh b;
    public cmeg c;
    public final long d;
    public long e = -9223372036854775807L;
    private cmef f;
    private final cmkk g;

    public cmea(cmej cmejVar, cmeh cmehVar, cmkk cmkkVar, long j) {
        this.b = cmehVar;
        this.g = cmkkVar;
        this.a = cmejVar;
        this.d = j;
    }

    private final long q(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.cmeg
    public final void a(cmef cmefVar, long j) {
        this.f = cmefVar;
        cmeg cmegVar = this.c;
        if (cmegVar != null) {
            cmegVar.a(this, q(this.d));
        }
    }

    @Override // defpackage.cmef
    public final void b(cmeg cmegVar) {
        cmef cmefVar = this.f;
        int i = cmny.a;
        cmefVar.b(this);
    }

    @Override // defpackage.cmeg
    public final void c() {
        try {
            cmeg cmegVar = this.c;
            if (cmegVar != null) {
                cmegVar.c();
            } else {
                this.a.r();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.cmeg
    public final TrackGroupArray d() {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.d();
    }

    @Override // defpackage.cmfl
    public final /* bridge */ /* synthetic */ void e(cmeg cmegVar) {
        cmef cmefVar = this.f;
        int i = cmny.a;
        cmefVar.e(this);
    }

    @Override // defpackage.cmeg
    public final long f(cmjm[] cmjmVarArr, boolean[] zArr, cmfk[] cmfkVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.e;
        if (j3 == -9223372036854775807L || j != this.d) {
            j2 = j;
        } else {
            this.e = -9223372036854775807L;
            j2 = j3;
        }
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.f(cmjmVarArr, zArr, cmfkVarArr, zArr2, j2);
    }

    @Override // defpackage.cmeg
    public final void g(long j) {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        cmegVar.g(j);
    }

    @Override // defpackage.cmeg
    public final long h() {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.h();
    }

    @Override // defpackage.cmeg
    public final long i() {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.i();
    }

    @Override // defpackage.cmeg
    public final long j(long j) {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.j(j);
    }

    @Override // defpackage.cmeg
    public final long k(long j, cloq cloqVar) {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.k(j, cloqVar);
    }

    @Override // defpackage.cmeg
    public final long l() {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        return cmegVar.l();
    }

    @Override // defpackage.cmeg
    public final boolean m(long j) {
        cmeg cmegVar = this.c;
        return cmegVar != null && cmegVar.m(j);
    }

    @Override // defpackage.cmeg
    public final boolean n() {
        cmeg cmegVar = this.c;
        return cmegVar != null && cmegVar.n();
    }

    public final void o(cmeh cmehVar) {
        long q = q(this.d);
        cmeg t = this.a.t(cmehVar, this.g, q);
        this.c = t;
        if (this.f != null) {
            t.a(this, q);
        }
    }

    @Override // defpackage.cmeg
    public final void p(long j) {
        cmeg cmegVar = this.c;
        int i = cmny.a;
        cmegVar.p(j);
    }
}
