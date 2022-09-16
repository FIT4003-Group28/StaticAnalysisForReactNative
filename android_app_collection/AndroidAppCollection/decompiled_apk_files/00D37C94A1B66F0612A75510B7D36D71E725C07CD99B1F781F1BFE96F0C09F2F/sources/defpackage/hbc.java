package defpackage;

import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: hbc  reason: default package */
/* loaded from: classes3.dex */
public final class hbc implements plo {
    private pjt a;
    private final hbh b;
    private boolean c;

    public hbc(hbh hbhVar) {
        this.b = hbhVar;
    }

    @Override // defpackage.plo
    public final int a(Format format) {
        if (!"audio/raw".equals(format.l) || !pxi.P(format.A)) {
            return 0;
        }
        return format.A == 2 ? 2 : 1;
    }

    @Override // defpackage.plo
    public final long b(boolean z) {
        return 0L;
    }

    @Override // defpackage.plo
    public final pjt c() {
        return this.a;
    }

    @Override // defpackage.plo
    public final void d() {
    }

    @Override // defpackage.plo
    public final void e() {
    }

    @Override // defpackage.plo
    public final void f() {
        this.b.b();
    }

    @Override // defpackage.plo
    public final void g() {
    }

    @Override // defpackage.plo
    public final void h() {
    }

    @Override // defpackage.plo
    public final void i() {
    }

    @Override // defpackage.plo
    public final void j() {
        this.b.g();
        this.c = true;
    }

    @Override // defpackage.plo
    public final void k() {
        this.c = false;
    }

    @Override // defpackage.plo
    public final void l(aso asoVar) {
    }

    @Override // defpackage.plo
    public final void m(int i) {
    }

    @Override // defpackage.plo
    public final void n(asp aspVar) {
    }

    @Override // defpackage.plo
    public final void o(pll pllVar) {
    }

    @Override // defpackage.plo
    public final void p(pjt pjtVar) {
        this.a = pjtVar;
    }

    @Override // defpackage.plo
    public final void q(boolean z) {
    }

    @Override // defpackage.plo
    public final void r(float f) {
    }

    @Override // defpackage.plo
    public final boolean s(ByteBuffer byteBuffer, long j, int i) {
        this.b.i(byteBuffer);
        return !byteBuffer.hasRemaining();
    }

    @Override // defpackage.plo
    public final boolean t() {
        return false;
    }

    @Override // defpackage.plo
    public final boolean u() {
        return this.c && this.b.p();
    }

    @Override // defpackage.plo
    public final boolean v(Format format) {
        return a(format) != 0;
    }

    @Override // defpackage.plo
    public final void w(Format format, int[] iArr) {
        hbh hbhVar = this.b;
        hbhVar.c = format.y;
        hbhVar.c();
        if (format.z == hbhVar.d) {
            hbhVar.e = null;
            return;
        }
        try {
            hbhVar.e = new pmm();
            pmm pmmVar = hbhVar.e;
            pmmVar.a = hbhVar.d;
            pmmVar.j(new pkw(format.z, hbhVar.c, format.A));
            hbhVar.e.l();
        } catch (pkx unused) {
            hbhVar.e = null;
        }
    }
}
