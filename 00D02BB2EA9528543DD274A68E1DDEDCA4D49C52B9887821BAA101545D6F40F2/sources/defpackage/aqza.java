package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqza  reason: default package */
/* loaded from: classes2.dex */
final class aqza implements arae {
    final /* synthetic */ aqzb a;

    public aqza(aqzb aqzbVar) {
        this.a = aqzbVar;
    }

    @Override // defpackage.arae
    public final void a(araf arafVar) {
        float floor;
        this.a.c.j();
        if (arafVar == araf.OPTIMIZED && !this.a.c.p.d()) {
            this.a.c.f.b(new amqp(1));
        } else if (arafVar == araf.NOT_OPTIMIZED_OR_DISABLED) {
            this.a.c.f.b(new amqp(2));
        } else if (arafVar == araf.RECENTLY_SHOWN) {
            this.a.c.f.b(new amqp(3));
        }
        if (arafVar != araf.NOT_OPTIMIZED_OR_DISABLED) {
            aqzb aqzbVar = this.a;
            final aqzc aqzcVar = aqzbVar.c;
            boolean z = aqzbVar.a;
            boolean z2 = aqzbVar.b;
            if (!aqzcVar.o()) {
                return;
            }
            if (!aqzcVar.o() && arafVar == araf.OPTIMIZED) {
                bvrb bvrbVar = aqzcVar.h;
                gga ggaVar = aqzcVar.a;
                cjxu.k(bvrbVar, ggaVar, ggaVar.getString(R.string.LOCATION_NOT_YET_AVAILABLE));
            }
            if (!arafVar.i && !z2 && aqzcVar.j.a(aqzcVar.b, aqzcVar.w, aqya.AR_CAMERA)) {
                dbsz<Boolean> dbszVar = new dbsz(aqzcVar) { // from class: aqyx
                    private final aqzc a;

                    {
                        this.a = aqzcVar;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        aqzc aqzcVar2 = this.a;
                        Boolean bool = (Boolean) obj;
                        if (!aqzcVar2.u.a().a() || !bool.booleanValue()) {
                            if (!aqzcVar2.j.a(aqzcVar2.b, aqzcVar2.w, aqya.FIGURE_EIGHT)) {
                                return;
                            }
                            gei.a(aqzcVar2.a, aqxy.g(aqzcVar2.b));
                            return;
                        }
                        aqzcVar2.u.a().b().c(true);
                        aqzcVar2.j.b(aqya.AR_CAMERA);
                    }
                };
                if (!aqzcVar.u.a().a()) {
                    dbszVar.NU(false);
                } else {
                    dkhv dkhvVar = aqzcVar.o.getAugmentedRealityParameters().b;
                    if (dkhvVar == null) {
                        dkhvVar = dkhv.g;
                    }
                    if ((!dkhvVar.b || !dkhvVar.c) && !aqzcVar.u.a().b().a()) {
                        dbszVar.NU(false);
                    } else {
                        aqzcVar.u.a().b().b(dbszVar);
                    }
                }
            }
            if (!z) {
                return;
            }
            amwd amwdVar = amwd.OFF;
            int ordinal = aqzcVar.e.i().ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (!aqzcVar.i.c()) {
                        return;
                    }
                    aras arasVar = aqzcVar.e;
                    alaf a = alai.a();
                    a.f = alah.LOCATION_AND_BEARING;
                    a.e = aqzcVar.e.m();
                    a.b = 17.0f;
                    a.c = 45.0f;
                    arasVar.j(a.a(), false);
                    return;
                } else if (ordinal != 2) {
                    return;
                } else {
                    aras arasVar2 = aqzcVar.e;
                    alaf a2 = alai.a();
                    a2.f = alah.LOCATION_ONLY;
                    a2.e = aqzcVar.e.m();
                    a2.b = 16.0f;
                    a2.c = 0.0f;
                    a2.d = 0.0f;
                    arasVar2.j(a2.a(), false);
                    return;
                }
            }
            alad p = aqzcVar.d.a().p();
            float f = p.k;
            int n = aqzcVar.e.d.n();
            akra o = aqzcVar.e.d.o();
            akzh a3 = aqzcVar.d.a();
            if (n < 0) {
                floor = 1.0f;
            } else {
                dbsk.s(o);
                double r = o.r();
                double d = n;
                Double.isNaN(d);
                double d2 = r * d;
                floor = (float) Math.floor(akyx.c(a3, (float) (d2 + d2), Math.min(a3.y(), a3.z())));
            }
            if (floor < 2.0f || floor > 21.0f) {
                floor = 15.0f;
            }
            if (f > floor) {
                f = floor;
            } else if (f < 13.0f) {
                f = Math.min(floor, 15.0f);
            }
            aras arasVar3 = aqzcVar.e;
            alaf a4 = alai.a();
            a4.f = alah.LOCATION_ONLY;
            a4.b = f;
            a4.c = p.l;
            a4.d = p.m;
            a4.e = aqzcVar.e.m();
            arasVar3.j(a4.a(), false);
        }
    }
}
