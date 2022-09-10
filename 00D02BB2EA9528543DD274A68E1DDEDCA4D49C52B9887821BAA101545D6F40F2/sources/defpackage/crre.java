package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crre  reason: default package */
/* loaded from: classes5.dex */
public class crre extends crpu implements crqj {
    public final dpfh a;
    public final long c;
    private final long d;
    private final amuh e;

    public crre(dpfh dpfhVar, amuh amuhVar, long j) {
        this.a = dpfhVar;
        this.e = amuhVar;
        this.c = j;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dpfc dpfcVar = dpfhVar.j;
        this.d = j + timeUnit.toMillis((dpfcVar == null ? dpfc.b : dpfcVar).a);
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return crqv.TRAFFIC_REPORT;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return false;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return false;
    }

    @Override // defpackage.crqj
    public final dpfa d() {
        dpfa dpfaVar = this.a.i;
        return dpfaVar == null ? dpfa.e : dpfaVar;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final long f() {
        return this.d;
    }

    @Override // defpackage.crpu, defpackage.crqw
    public final boolean g() {
        int a = dpex.a(this.a.k);
        return a != 0 && a == 3;
    }

    @Override // defpackage.crqj
    public final boolean i() {
        return false;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amuh j() {
        return this.e;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub k() {
        if (this.e.j()) {
            return this.e.k();
        }
        return null;
    }

    @Override // defpackage.crqj
    @dzsi
    public final amub l() {
        return null;
    }
}
