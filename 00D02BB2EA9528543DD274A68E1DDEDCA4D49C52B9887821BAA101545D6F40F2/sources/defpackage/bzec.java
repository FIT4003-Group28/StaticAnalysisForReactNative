package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzec  reason: default package */
/* loaded from: classes4.dex */
public final class bzec implements bzfn, bzfu {
    final dbsz<bzek> a;
    public final bzge b;
    public final amub c;
    public final byzk d;
    public final dxio<bzfo> e;
    public final bzda f;
    public final cqat g;
    public bzek h;

    public bzec(bzds bzdsVar, bzge bzgeVar, amub amubVar, byzk byzkVar, dxio<bzfo> dxioVar, bzda bzdaVar, vxv vxvVar, cqat cqatVar) {
        bzeb bzebVar = new bzeb(this);
        this.a = bzebVar;
        this.b = bzgeVar;
        this.c = amubVar;
        this.d = byzkVar;
        this.e = dxioVar;
        this.f = bzdaVar;
        this.g = cqatVar;
        this.h = bzdsVar.a(bzebVar, bzdg.a(amubVar.o(0), bzdaVar, vxvVar));
    }

    public final bzfo a() {
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bzdh b() {
        return this.h.b();
    }

    public final boolean c() {
        return this.h.h();
    }

    @Override // defpackage.bzfn
    public final boolean d() {
        if (this.h.i()) {
            bzdg b = b().b();
            if (b.D()) {
                return true;
            }
            bzdg B = b.B();
            if (!B.c().equals(dqvj.TRANSIT)) {
                return true;
            }
            long millis = TimeUnit.MINUTES.toMillis(2L);
            long currentTimeMillis = B.i().a - System.currentTimeMillis();
            return currentTimeMillis >= millis || currentTimeMillis <= (-millis);
        }
        return false;
    }
}
