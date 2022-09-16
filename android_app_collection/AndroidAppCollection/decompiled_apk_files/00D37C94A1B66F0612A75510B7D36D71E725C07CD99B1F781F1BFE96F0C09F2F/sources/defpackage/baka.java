package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: baka  reason: default package */
/* loaded from: classes2.dex */
public final class baka extends bajt {
    private final int a;
    private final int c;
    private final int d;

    public baka(bahn bahnVar, bahp bahpVar) {
        this(bahnVar, bahpVar, 1);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long e(long j, int i) {
        long e = super.e(j, i);
        bajw.e(this, a(e), this.c, this.d);
        return e;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv q() {
        return this.b.q();
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final boolean s(long j) {
        return this.b.s(j);
    }

    public baka(bahn bahnVar, bahp bahpVar, int i) {
        super(bahnVar, bahpVar);
        this.a = i;
        if (bahnVar.d() + i > Integer.MIN_VALUE) {
            this.c = bahnVar.d() + i;
        } else {
            this.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        if (bahnVar.c() + i < Integer.MAX_VALUE) {
            this.d = bahnVar.c() + i;
        } else {
            this.d = Integer.MAX_VALUE;
        }
    }
}
