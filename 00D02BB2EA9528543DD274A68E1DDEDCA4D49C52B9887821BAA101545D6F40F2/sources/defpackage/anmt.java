package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anmt  reason: default package */
/* loaded from: classes2.dex */
public final class anmt implements anlp {
    private static final dcqe b = dcqe.c("anmt");
    public final long a;
    private final dvyw c;
    private final eaou d;
    private final boolean e;

    public anmt(dvyw dvywVar, eaou eaouVar, long j, boolean z) {
        this.c = dvywVar;
        this.d = eaouVar;
        this.a = j;
        this.e = z;
    }

    private final long j() {
        return this.a - ((eaqh) dmjw.b).b;
    }

    @Override // defpackage.anlp
    public final boolean a() {
        return true;
    }

    @Override // defpackage.anlp
    public final boolean b() {
        return false;
    }

    @Override // defpackage.dmkh
    @dzsi
    public final String c() {
        dvyw dvywVar = this.c;
        if ((dvywVar.a & 4) != 0) {
            return dvywVar.g;
        }
        bvoo.h("Place without feature ID.", new Object[0]);
        return null;
    }

    @Override // defpackage.dmkh
    public final /* bridge */ /* synthetic */ anms d(dbsg<anmq> dbsgVar) {
        eaou eaouVar = this.d;
        anmr b2 = anms.b(eaouVar, eaouVar, false);
        b2.b = j();
        long j = this.a;
        b2.c = j;
        b2.f = true;
        b2.d = dbsg.i(Long.valueOf(j));
        b2.c();
        anmq j2 = !dbsgVar.a() ? anmq.j(this.c) : dbsgVar.b();
        b2.b(this.e ? j2.i() : j2.h());
        return b2.a();
    }

    @Override // defpackage.anlp
    public final boolean e() {
        return false;
    }

    @Override // defpackage.anlp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.dmkh
    public final long g() {
        return j();
    }

    @Override // defpackage.dmkh
    public final long h() {
        return this.a;
    }

    @Override // defpackage.dmkh
    public final long i() {
        return TimeUnit.MILLISECONDS.toMicros(this.a);
    }
}
