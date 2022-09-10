package defpackage;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crob  reason: default package */
/* loaded from: classes5.dex */
public final class crob<T> extends btrh<T> {
    private final int d;

    public crob(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        GmmLocation gmmLocation;
        switch (this.d) {
            case 0:
                ((croa) this.a).m = ((aswb) obj).a;
                return;
            case 1:
                crmk crmkVar = (crmk) obj;
                ((croa) this.a).p = true;
                return;
            case 2:
                crmj crmjVar = (crmj) obj;
                ((croa) this.a).c(crmjVar.b.a(), crmjVar.b.b(), crmjVar.a);
                return;
            case 3:
                crmi crmiVar = (crmi) obj;
                croh crohVar = ((croa) this.a).e;
                if (crohVar == null || !crmiVar.a) {
                    return;
                }
                crohVar.b.b();
                crog i = crohVar.a.i(crohVar.c);
                if (i == null) {
                    return;
                }
                i.b();
                return;
            case 4:
                crrk crrkVar = (crrk) obj;
                crok crokVar = ((croa) this.a).b;
                if (crokVar == null) {
                    return;
                }
                crokVar.d.add(crrkVar.b);
                return;
            case 5:
                croa croaVar = (croa) this.a;
                crmn crmnVar = (crmn) obj;
                cray b = crmnVar.b.b();
                amub amubVar = b.a;
                amuo amuoVar = b.b;
                if (!crmnVar.a) {
                    croaVar.c(crmnVar.b.a(), crmnVar.b.b(), crmnVar.c);
                }
                crop cropVar = croaVar.c;
                if (cropVar == null || amuoVar == null) {
                    return;
                }
                amuo amuoVar2 = cropVar.a;
                if (amuoVar2 == null || amuoVar.R != amuoVar2 || amuoVar.j >= amubVar.l.l() || (gmmLocation = cropVar.d) == null) {
                    cropVar.e = false;
                } else {
                    float E = gmmLocation.E(cropVar.a.c);
                    if (cropVar.e && E <= 100.0f) {
                        amuo amuoVar3 = cropVar.a;
                        int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - cropVar.b) / 1000);
                        int i2 = amuoVar3.m;
                        ddok bZ = ddol.f.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        ddol ddolVar = (ddol) bZ.b;
                        int i3 = ddolVar.a | 1;
                        ddolVar.a = i3;
                        ddolVar.b = i2;
                        int i4 = cropVar.c;
                        if (i2 != i4) {
                            i3 |= 2;
                            ddolVar.a = i3;
                            ddolVar.c = i4;
                        }
                        int i5 = i3 | 4;
                        ddolVar.a = i5;
                        ddolVar.d = elapsedRealtime;
                        int i6 = amuoVar3.k;
                        ddolVar.a = i5 | 8;
                        ddolVar.e = i6;
                        cropVar.f.add(bZ.bK());
                    }
                    cropVar.e = false;
                    if (E <= 100.0f && amuoVar.k >= 300) {
                        double K = amubVar.K(cropVar.a.j);
                        double G = amubVar.G();
                        double K2 = amubVar.K(amuoVar.j);
                        Double.isNaN(G);
                        double d = G - K2;
                        if (K > 1000.0d && d > 1000.0d) {
                            cropVar.e = true;
                            amuo amuoVar4 = amuoVar.R;
                            cropVar.c = (int) Math.round((amuoVar4 != null ? amubVar.ab(amubVar.K(amuoVar4.j)) : dcyn.a) - amubVar.ab(amubVar.K(amuoVar.j)));
                            cropVar.b = SystemClock.elapsedRealtime();
                        }
                    }
                }
                cropVar.a = amuoVar;
                return;
            case 6:
                crhb crhbVar = (crhb) obj;
                ((croa) this.a).r = 2;
                return;
            case 7:
                Location location = ((AndroidLocationEvent) obj).getLocation();
                crnj crnjVar = ((croa) this.a).d;
                if (crnjVar == null) {
                    return;
                }
                crnjVar.a(location);
                return;
            case 8:
                croa croaVar2 = (croa) this.a;
                GmmLocation a = ((amqo) obj).a();
                if (a != null) {
                    crok crokVar2 = croaVar2.b;
                    if (crokVar2 != null) {
                        crokVar2.f = a;
                    }
                    crop cropVar2 = croaVar2.c;
                    if (cropVar2 != null) {
                        cropVar2.d = a;
                    }
                    crnj crnjVar2 = croaVar2.d;
                    if (crnjVar2 != null && a.e()) {
                        Location location2 = crnjVar2.f;
                        if (location2 != null) {
                            crnjVar2.b.a(location2.distanceTo(a));
                        }
                        GmmLocation gmmLocation2 = crnjVar2.g;
                        if (gmmLocation2 != null) {
                            long j = gmmLocation2.j;
                            if (a.hasSpeed() && a.j > j && !a.p()) {
                                double d2 = crnjVar2.e;
                                double speed = a.getSpeed() * ((float) (a.j - j));
                                Double.isNaN(speed);
                                crnjVar2.e = d2 + (speed / 1000.0d);
                            } else {
                                double d3 = crnjVar2.e;
                                double distanceTo = gmmLocation2.distanceTo(a);
                                Double.isNaN(distanceTo);
                                crnjVar2.e = d3 + distanceTo;
                            }
                        }
                        crnjVar2.g = a;
                    }
                    croh crohVar2 = croaVar2.e;
                    if (crohVar2 != null) {
                        if (a.r()) {
                            crohVar2.d = a.s();
                        }
                        crohVar2.b.c(a);
                        Long q = a.q();
                        if (q != null) {
                            crog crogVar = crohVar2.a.get(q);
                            if (crogVar == null) {
                                crogVar = new crog();
                                crohVar2.a.c(q, crogVar);
                            }
                            crogVar.c(a);
                            crohVar2.c = q.longValue();
                        }
                    }
                    croaVar2.o.add(a.C());
                }
                croaVar2.n = a;
                return;
            case 9:
                croa croaVar3 = (croa) this.a;
                cror crorVar = (cror) obj;
                if (crorVar.e - croaVar3.k > croa.a) {
                    croaVar3.i = croaVar3.f();
                    croaVar3.j = dcyn.a;
                }
                croaVar3.k = crorVar.e;
                croaVar3.j += crorVar.a();
                if (crorVar.d == dqum.REROUTE_TYPE_AVOIDS_CLOSURE) {
                    return;
                }
                croaVar3.l -= crorVar.a();
                return;
            case 10:
                croa croaVar4 = (croa) this.a;
                if (((croq) obj) != croq.a) {
                    return;
                }
                croaVar4.q = true;
                return;
            case 11:
                croa croaVar5 = (croa) this.a;
                crhm crhmVar = (crhm) obj;
                croaVar5.f = Long.valueOf(crhmVar.b);
                croaVar5.g = Boolean.valueOf(crhmVar.a);
                return;
            default:
                croa croaVar6 = (croa) this.a;
                crhp crhpVar = (crhp) obj;
                if (!crhpVar.d() || croaVar6.h != null) {
                    return;
                }
                croaVar6.h = crhpVar.e().g().a.f();
                return;
        }
    }
}
