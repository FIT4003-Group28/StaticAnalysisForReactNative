package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: datj  reason: default package */
/* loaded from: classes5.dex */
final class datj extends datc {
    private final eamw a;
    private final dath b;

    public datj(dath dathVar, eamw eamwVar) {
        this.b = dathVar;
        this.a = eamwVar;
    }

    @Override // defpackage.datc
    public final /* bridge */ /* synthetic */ dasy a() {
        return this.b;
    }

    @Override // defpackage.datc
    public final void b() {
        this.a.close();
    }

    @Override // defpackage.datc
    public final datg c() {
        return dath.g(this.a.b());
    }

    @Override // defpackage.datc
    public final datg d() {
        return dath.g(this.a.b);
    }

    @Override // defpackage.datc
    public final String e() {
        return this.a.c();
    }

    @Override // defpackage.datc
    public final String f() {
        return this.a.e();
    }

    @Override // defpackage.datc
    public final byte g() {
        eamw eamwVar = this.a;
        int f = eamwVar.f();
        if (f < -128 || f > 127) {
            throw eamwVar.l("Numeric value (" + eamwVar.e() + ") out of range of Java byte");
        }
        return (byte) f;
    }

    @Override // defpackage.datc
    public final short h() {
        eamw eamwVar = this.a;
        int f = eamwVar.f();
        if (f < -32768 || f > 32767) {
            throw eamwVar.l("Numeric value (" + eamwVar.e() + ") out of range of Java short");
        }
        return (short) f;
    }

    @Override // defpackage.datc
    public final int i() {
        return this.a.f();
    }

    @Override // defpackage.datc
    public final float j() {
        return this.a.i();
    }

    @Override // defpackage.datc
    public final long k() {
        return this.a.g();
    }

    @Override // defpackage.datc
    public final double l() {
        return this.a.j();
    }

    @Override // defpackage.datc
    public final BigInteger m() {
        return this.a.h();
    }

    @Override // defpackage.datc
    public final BigDecimal n() {
        return this.a.k();
    }

    @Override // defpackage.datc
    public final void r() {
        this.a.m();
    }
}
