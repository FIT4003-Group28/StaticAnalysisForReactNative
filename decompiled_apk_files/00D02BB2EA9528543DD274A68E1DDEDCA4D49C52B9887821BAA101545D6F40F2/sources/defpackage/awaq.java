package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: awaq  reason: default package */
/* loaded from: classes3.dex */
public final class awaq implements awab {
    public final cqat a;
    private final awar b;
    private final btvo c;
    private final auui d;

    public awaq(awar awarVar, cqat cqatVar, btvo btvoVar, auui auuiVar) {
        this.b = awarVar;
        this.a = cqatVar;
        this.c = btvoVar;
        this.d = auuiVar;
    }

    public static awao c(int i) {
        awao awaoVar = awao.DEFAULT;
        int i2 = i - 1;
        return (i2 == 0 || i2 == 1) ? awao.UNINTENTIONAL : i2 != 2 ? (i2 == 3 || i2 == 4) ? awao.TRIP_ENDED : awao.DO_NOT_SHOW : awao.DISUSE;
    }

    private final void d(dlsf dlsfVar) {
        dcdc A = dcbg.b(dlsfVar.a).o(new awan(this)).A(dcln.a.g(awaf.a));
        if (!A.isEmpty()) {
            if (g()) {
                if (e(awao.UNINTENTIONAL, awag.a)) {
                    return;
                }
                f(awao.UNINTENTIONAL, awah.a);
            }
            this.b.j(((dlse) A.get(0)).a);
        }
    }

    private final boolean e(awao awaoVar, awap awapVar) {
        awao[] values;
        for (awao awaoVar2 : awao.values()) {
            if (awaoVar2.f >= awaoVar.f && !this.d.e(awapVar.a(awaoVar2)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final void f(awao awaoVar, awap awapVar) {
        awao[] values;
        for (awao awaoVar2 : awao.values()) {
            if (awaoVar2.f < awaoVar.f) {
                int a = awapVar.a(awaoVar2);
                if (a == dpyv.OFFLINE_UNUSED_REGION_EXPIRING_SOON.dm) {
                    this.b.q();
                } else if (a == dpyv.OFFLINE_TRIP_REGION_EXPIRING_SOON.dm) {
                    this.b.o();
                } else if (a == dpyv.OFFLINE_UNUSED_REGION_EXPIRED.dm) {
                    this.b.p();
                } else if (a == dpyv.OFFLINE_TRIP_REGION_EXPIRED.dm) {
                    this.b.n();
                }
            }
        }
    }

    private final boolean g() {
        dkrz dkrzVar = this.c.getOfflineMapsParameters().H;
        if (dkrzVar == null) {
            dkrzVar = dkrz.b;
        }
        return dkrzVar.a;
    }

    @Override // defpackage.awab
    public final void a(dlsb dlsbVar) {
        if (dlsbVar.a.size() > 0) {
            if (g()) {
                int a = dluw.a(((dlsa) Collections.max(dlsbVar.a, awac.a)).a);
                if (a == 0) {
                    a = 1;
                }
                awao c = c(a);
                if (c == null || awao.DO_NOT_SHOW.equals(c) || e(c, awak.a)) {
                    return;
                }
                f(c, awal.a);
                int ordinal = c.ordinal();
                if (ordinal == 2) {
                    this.b.F();
                    return;
                } else if (ordinal == 3) {
                    this.b.D();
                    return;
                } else if (ordinal != 4) {
                    return;
                } else {
                    this.b.l();
                    return;
                }
            }
            this.b.l();
        }
    }

    @Override // defpackage.awab
    public final void b(dlsf dlsfVar) {
        if (dlsfVar.a.size() > 0) {
            if (g()) {
                dcde C = dcbg.b(dlsfVar.a).o(new awam(this)).C(awad.a);
                awao awaoVar = !C.D() ? (awao) Collections.max(C.J(), awae.a) : null;
                if (!awao.UNINTENTIONAL.equals(awaoVar)) {
                    if (awaoVar == null || awao.DO_NOT_SHOW.equals(awaoVar) || e(awaoVar, awai.a)) {
                        return;
                    }
                    f(awaoVar, awaj.a);
                    int ordinal = awaoVar.ordinal();
                    if (ordinal == 2) {
                        this.b.G();
                        return;
                    } else if (ordinal != 3) {
                        return;
                    } else {
                        this.b.E();
                        return;
                    }
                }
                d(dlsfVar);
                return;
            }
            d(dlsfVar);
        }
    }
}
