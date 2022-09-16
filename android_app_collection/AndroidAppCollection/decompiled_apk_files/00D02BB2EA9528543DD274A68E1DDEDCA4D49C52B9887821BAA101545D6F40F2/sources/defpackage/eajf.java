package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eajf  reason: default package */
/* loaded from: classes6.dex */
public final class eajf extends eaka {
    public eaka a;

    public eajf(eaka eakaVar) {
        if (eakaVar != null) {
            this.a = eakaVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // defpackage.eaka
    public final eaka l(long j, TimeUnit timeUnit) {
        return this.a.l(j, timeUnit);
    }

    @Override // defpackage.eaka
    public final long m() {
        return this.a.m();
    }

    @Override // defpackage.eaka
    public final long n() {
        return this.a.n();
    }

    @Override // defpackage.eaka
    public final eaka o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.eaka
    public final eaka p() {
        return this.a.p();
    }

    @Override // defpackage.eaka
    public final eaka q() {
        return this.a.q();
    }

    @Override // defpackage.eaka
    public final void r() {
        this.a.r();
    }

    @Override // defpackage.eaka
    public final boolean s() {
        return this.a.s();
    }
}
