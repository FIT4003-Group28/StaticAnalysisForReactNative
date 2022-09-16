package defpackage;

import com.google.android.apps.gmm.location.rawlocationevents.HardBrakeEvent;
import com.google.android.apps.gmm.location.rawlocationevents.ProjectedSensorStateEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crpj  reason: default package */
/* loaded from: classes5.dex */
public final class crpj<T> extends btrh<T> {
    private final int d;

    public crpj(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        GmmLocation a;
        crph f;
        crph f2;
        doyd h;
        ddvr a2;
        int i = 31;
        switch (this.d) {
            case 0:
                ((crpi) this.a).b((crhc) obj);
                return;
            case 1:
                crpi crpiVar = (crpi) this.a;
                crir crirVar = (crir) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                ddvr bZ = ddvs.g.bZ();
                ddvg bZ2 = ddvh.e.bZ();
                dqkr a3 = crirVar.a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddvh ddvhVar = (ddvh) bZ2.b;
                ddvhVar.b = a3.q;
                ddvhVar.a |= 1;
                int c = crirVar.c();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddvh ddvhVar2 = (ddvh) bZ2.b;
                int i2 = c - 1;
                if (c == 0) {
                    throw null;
                }
                ddvhVar2.c = i2;
                ddvhVar2.a |= 2;
                long b = crirVar.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddvh ddvhVar3 = (ddvh) bZ2.b;
                ddvhVar3.a |= 4;
                ddvhVar3.d = b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddvs ddvsVar = (ddvs) bZ.b;
                ddvh bK = bZ2.bK();
                bK.getClass();
                ddvsVar.c = bK;
                ddvsVar.b = 32;
                crpiVar.e.c(bZ);
                return;
            case 2:
                crpi crpiVar2 = (crpi) this.a;
                crmh crmhVar = (crmh) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                GmmLocation gmmLocation = crmhVar.a;
                crpiVar2.f.d(gmmLocation);
                crpiVar2.c("onProgressNavigation", gmmLocation, crpiVar2.f.e(crmhVar.b));
                return;
            case 3:
                crpi crpiVar3 = (crpi) this.a;
                amqo amqoVar = (amqo) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                int a4 = ddwv.a(crpiVar3.d.a.E);
                if ((a4 != 0 && a4 == 2) || (a = amqoVar.a()) == null) {
                    return;
                }
                crpiVar3.f.d(a);
                crpiVar3.c("onLocationChanged", a, false);
                return;
            case 4:
                crpi crpiVar4 = (crpi) this.a;
                crmn crmnVar = (crmn) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                amuo amuoVar = crmnVar.b.b().b;
                boolean e = crpiVar4.f.e(crmnVar.b);
                if (crpiVar4.m() && amuoVar != null) {
                    crqo crqoVar = crmnVar.b;
                    int i3 = crqoVar.b().h - crqoVar.b().e;
                    ddwx bZ3 = ddwy.c.bZ();
                    boolean z = crmnVar.a;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ddwy ddwyVar = (ddwy) bZ3.b;
                    ddwyVar.a |= 1;
                    ddwyVar.b = z;
                    ddvr bZ4 = ddvs.g.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ddvs ddvsVar2 = (ddvs) bZ4.b;
                    ddwy bK2 = bZ3.bK();
                    bK2.getClass();
                    ddvsVar2.c = bK2;
                    ddvsVar2.b = 8;
                    crpiVar4.e.d(bZ4, null, crpiVar4.e(i3), null, null);
                }
                crpiVar4.e.f(e);
                return;
            case 5:
                crpi crpiVar5 = (crpi) this.a;
                crmq crmqVar = (crmq) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                boolean e2 = crpiVar5.f.e(crmqVar.b);
                int i4 = crmqVar.b.a().y;
                if (crpiVar5.m() && i4 >= 0 && (f = crpiVar5.f(i4)) != null) {
                    crpo crpoVar = crpiVar5.h;
                    int i5 = crpoVar.a;
                    int i6 = crpoVar.b;
                    int i7 = f.e;
                    crpoVar.c(f.b);
                    crpiVar5.g.c(f.c);
                    crpo crpoVar2 = crpiVar5.h;
                    crpiVar5.f.b();
                    ddxf bZ5 = ddxg.f.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    ddxg ddxgVar = (ddxg) bZ5.b;
                    ddxgVar.a |= 8;
                    ddxgVar.e = i4;
                    crpo crpoVar3 = crpiVar5.h;
                    if (crpoVar3.a != i5 || crpoVar3.b != i6 + 1 || crpiVar5.f.b() != i7) {
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        ddxg ddxgVar2 = (ddxg) bZ5.b;
                        int i8 = ddxgVar2.a | 1;
                        ddxgVar2.a = i8;
                        ddxgVar2.b = i5;
                        int i9 = i8 | 2;
                        ddxgVar2.a = i9;
                        ddxgVar2.c = i6;
                        ddxgVar2.a = i9 | 4;
                        ddxgVar2.d = i7;
                    }
                    ddvr bZ6 = ddvs.g.bZ();
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    ddvs ddvsVar3 = (ddvs) bZ6.b;
                    ddxg bK3 = bZ5.bK();
                    bK3.getClass();
                    ddvsVar3.c = bK3;
                    ddvsVar3.b = 10;
                    crpiVar5.e.c(bZ6);
                }
                crpiVar5.e.f(e2);
                crpiVar5.p = false;
                return;
            case 6:
                crpi crpiVar6 = (crpi) this.a;
                crmj crmjVar = (crmj) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                boolean e3 = crpiVar6.f.e(crmjVar.b);
                int i10 = crmjVar.b.a().y;
                amtz amtzVar = crmjVar.b.a().K;
                amtz amtzVar2 = amtz.ONLINE;
                if (crpiVar6.m() && (i10 >= 0 || amtzVar != amtzVar2)) {
                    if (crmjVar.d != 2 && i10 >= 0 && (f2 = crpiVar6.f(i10)) != null) {
                        crpiVar6.h.c(crmjVar.d == 3 ? f2.d : f2.b);
                        crpiVar6.g.c(f2.c);
                        crpo crpoVar4 = crpiVar6.h;
                        crpiVar6.f.b();
                    }
                    ddtl bZ7 = ddtn.e.bZ();
                    int i11 = crmjVar.d == 2 ? 3 : 2;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    ddtn ddtnVar = (ddtn) bZ7.b;
                    ddtnVar.c = i11 - 1;
                    ddtnVar.a |= 2;
                    cray crayVar = crmjVar.a;
                    if (crayVar != null) {
                        cray b2 = crmjVar.b.b();
                        ddxp bZ8 = ddxq.g.bZ();
                        int i12 = crayVar.h;
                        int i13 = b2.h;
                        if (i12 != -1 && i13 != -1) {
                            int i14 = i13 - i12;
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            ddxq ddxqVar = (ddxq) bZ8.b;
                            ddxqVar.a |= 4;
                            ddxqVar.d = i14;
                        }
                        double d = crayVar.j.a;
                        double d2 = b2.j.a;
                        if (d != -1.0d && d2 != -1.0d) {
                            dspt b3 = dsuz.b(Math.round(d2 - d));
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            ddxq ddxqVar2 = (ddxq) bZ8.b;
                            b3.getClass();
                            ddxqVar2.b = b3;
                            ddxqVar2.a |= 1;
                        }
                        if (crayVar.j.b() && b2.j.b()) {
                            dspt b4 = dsuz.b(Math.round(b2.j.c() - crayVar.j.c()));
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            ddxq ddxqVar3 = (ddxq) bZ8.b;
                            b4.getClass();
                            ddxqVar3.c = b4;
                            ddxqVar3.a |= 2;
                        }
                        dpej g = crayVar.g();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        ddxq ddxqVar4 = (ddxq) bZ8.b;
                        ddxqVar4.e = g.e;
                        ddxqVar4.a |= 8;
                        dpej g2 = b2.g();
                        if (bZ8.c) {
                            bZ8.bF();
                            bZ8.c = false;
                        }
                        ddxq ddxqVar5 = (ddxq) bZ8.b;
                        ddxqVar5.f = g2.e;
                        ddxqVar5.a |= 16;
                        ddxq bK4 = bZ8.bK();
                        if (bZ7.c) {
                            bZ7.bF();
                            bZ7.c = false;
                        }
                        ddtn ddtnVar2 = (ddtn) bZ7.b;
                        bK4.getClass();
                        ddtnVar2.b = bK4;
                        ddtnVar2.a |= 1;
                    }
                    if (crmjVar.d != 2) {
                        ddtn ddtnVar3 = (ddtn) bZ7.b;
                        ddtnVar3.a |= 4;
                        ddtnVar3.d = i10;
                    }
                    ddvr bZ9 = ddvs.g.bZ();
                    if (bZ9.c) {
                        bZ9.bF();
                        bZ9.c = false;
                    }
                    ddvs ddvsVar4 = (ddvs) bZ9.b;
                    ddtn bK5 = bZ7.bK();
                    bK5.getClass();
                    ddvsVar4.c = bK5;
                    ddvsVar4.b = 9;
                    crpiVar6.e.c(bZ9);
                }
                if (crmjVar.d != 2) {
                    crpiVar6.p = false;
                }
                crpiVar6.e.f(e3);
                return;
            case 7:
                ((crpi) this.a).g((crlv) obj);
                return;
            case 8:
                ((crpi) this.a).h((crlu) obj);
                return;
            case 9:
                ((crpi) this.a).i((crlt) obj);
                return;
            case 10:
                ((crpi) this.a).j((cror) obj);
                return;
            case 11:
                crpi crpiVar7 = (crpi) this.a;
                crmi crmiVar = (crmi) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                boolean e4 = crpiVar7.f.e(crmiVar.b);
                if (crpiVar7.m()) {
                    ddwl bZ10 = ddwn.c.bZ();
                    if (crmiVar.d) {
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        ddwn ddwnVar = (ddwn) bZ10.b;
                        ddwnVar.b = 0;
                        ddwnVar.a |= 1;
                    } else if (crmiVar.a) {
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        ddwn ddwnVar2 = (ddwn) bZ10.b;
                        ddwnVar2.b = 1;
                        ddwnVar2.a |= 1;
                    } else {
                        if (bZ10.c) {
                            bZ10.bF();
                            bZ10.c = false;
                        }
                        ddwn ddwnVar3 = (ddwn) bZ10.b;
                        ddwnVar3.b = 2;
                        ddwnVar3.a |= 1;
                    }
                    ddvr bZ11 = ddvs.g.bZ();
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    ddvs ddvsVar5 = (ddvs) bZ11.b;
                    ddwn bK6 = bZ10.bK();
                    bK6.getClass();
                    ddvsVar5.c = bK6;
                    ddvsVar5.b = 14;
                    crpiVar7.e.c(bZ11);
                }
                crpiVar7.e.f(e4);
                return;
            case 12:
                crpi crpiVar8 = (crpi) this.a;
                crex crexVar = (crex) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar8.m()) {
                    return;
                }
                String str = crexVar.e;
                int i15 = crexVar.c;
                int i16 = crexVar.d;
                crexVar.b.c.T();
                ddvb bZ12 = ddvc.d.bZ();
                dspt c2 = dsuz.c(crexVar.a);
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                ddvc ddvcVar = (ddvc) bZ12.b;
                c2.getClass();
                ddvcVar.c = c2;
                ddvcVar.a |= 4;
                if (str != null) {
                    int a5 = auee.a(str);
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    ddvc ddvcVar2 = (ddvc) bZ12.b;
                    ddvcVar2.a |= 1;
                    ddvcVar2.b = a5;
                }
                int i17 = crexVar.d;
                ddvr bZ13 = ddvs.g.bZ();
                if (bZ13.c) {
                    bZ13.bF();
                    bZ13.c = false;
                }
                ddvs ddvsVar6 = (ddvs) bZ13.b;
                ddvc bK7 = bZ12.bK();
                bK7.getClass();
                ddvsVar6.c = bK7;
                ddvsVar6.b = 6;
                crpiVar8.e.d(bZ13, null, crpiVar8.e(i17), null, crexVar.b);
                return;
            case 13:
                ((crpi) this.a).k((crev) obj);
                return;
            case 14:
                crpi crpiVar9 = (crpi) this.a;
                bvrj.NAVIGATION_INTERNAL.c();
                boolean e5 = crpiVar9.f.e(((crmk) obj).b);
                if (crpiVar9.m()) {
                    ddtz bZ14 = ddua.a.bZ();
                    ddvr bZ15 = ddvs.g.bZ();
                    if (bZ15.c) {
                        bZ15.bF();
                        bZ15.c = false;
                    }
                    ddvs ddvsVar7 = (ddvs) bZ15.b;
                    ddua bK8 = bZ14.bK();
                    bK8.getClass();
                    ddvsVar7.c = bK8;
                    ddvsVar7.b = 17;
                    crpiVar9.e.c(bZ15);
                }
                crpiVar9.e.f(e5);
                return;
            case 15:
                crpi crpiVar10 = (crpi) this.a;
                crmr crmrVar = (crmr) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                throw null;
            case 16:
                crpi crpiVar11 = (crpi) this.a;
                HardBrakeEvent hardBrakeEvent = (HardBrakeEvent) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar11.m()) {
                    return;
                }
                ddvr bZ16 = ddvs.g.bZ();
                ddtk accelerationEvent = hardBrakeEvent.getAccelerationEvent();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                ddvs ddvsVar8 = (ddvs) bZ16.b;
                accelerationEvent.getClass();
                ddvsVar8.c = accelerationEvent;
                ddvsVar8.b = 34;
                crpiVar11.e.d(bZ16, Long.valueOf(hardBrakeEvent.getTimestampMillis()), false, null, null);
                return;
            case 17:
                crpi crpiVar12 = (crpi) this.a;
                ProjectedSensorStateEvent projectedSensorStateEvent = (ProjectedSensorStateEvent) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar12.m()) {
                    return;
                }
                ddvr bZ17 = ddvs.g.bZ();
                ddwh projectedSensorState = projectedSensorStateEvent.getProjectedSensorState();
                if (bZ17.c) {
                    bZ17.bF();
                    bZ17.c = false;
                }
                ddvs ddvsVar9 = (ddvs) bZ17.b;
                projectedSensorState.getClass();
                ddvsVar9.c = projectedSensorState;
                ddvsVar9.b = 37;
                crpiVar12.e.c(bZ17);
                return;
            case 18:
                crpi crpiVar13 = (crpi) this.a;
                bvrj.NAVIGATION_INTERNAL.c();
                boolean z2 = ((aswf) obj).a;
                if (!crpiVar13.m()) {
                    return;
                }
                ddvr bZ18 = ddvs.g.bZ();
                ddxh bZ19 = ddxi.c.bZ();
                if (bZ19.c) {
                    bZ19.bF();
                    bZ19.c = false;
                }
                ddxi ddxiVar = (ddxi) bZ19.b;
                ddxiVar.a |= 1;
                ddxiVar.b = true;
                ddxi bK9 = bZ19.bK();
                if (bZ18.c) {
                    bZ18.bF();
                    bZ18.c = false;
                }
                ddvs ddvsVar10 = (ddvs) bZ18.b;
                bK9.getClass();
                ddvsVar10.c = bK9;
                ddvsVar10.b = 31;
                crpiVar13.e.c(bZ18);
                return;
            case 19:
                ((crpi) this.a).l((ahju) obj);
                return;
            case 20:
                crpi crpiVar14 = (crpi) this.a;
                bvrj.NAVIGATION_INTERNAL.c();
                ddux bZ20 = dduy.c.bZ();
                boolean z3 = ((ascc) obj).d;
                if (bZ20.c) {
                    bZ20.bF();
                    bZ20.c = false;
                }
                dduy dduyVar = (dduy) bZ20.b;
                dduyVar.a |= 1;
                dduyVar.b = z3;
                dduy bK10 = bZ20.bK();
                dduy dduyVar2 = crpiVar14.j;
                if (dduyVar2 != null && dduyVar2.equals(bK10)) {
                    return;
                }
                crpiVar14.j = bK10;
                crpiVar14.k = crpiVar14.c.e();
                return;
            case 21:
                crpi crpiVar15 = (crpi) this.a;
                bvrj.NAVIGATION_INTERNAL.c();
                crqw crqwVar = ((cria) obj).a;
                String simpleName = crqwVar == null ? "null" : crqwVar.getClass().getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 14);
                sb.append("onShowPrompt(");
                sb.append(simpleName);
                sb.append(")");
                sb.toString();
                if (!crpiVar15.m() || crqwVar == null) {
                    return;
                }
                ddwi bZ21 = ddwk.f.bZ();
                crqv a6 = crqwVar.a();
                cred credVar = cred.NEVER_PLAYED;
                crqv crqvVar = crqv.BETTER_ROUTE;
                switch (a6.ordinal()) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 20;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 21;
                        break;
                    case 7:
                        i = 23;
                        break;
                    case 8:
                        i = 7;
                        break;
                    case 9:
                        i = 25;
                        break;
                    case 10:
                        i = 26;
                        break;
                    case 11:
                        i = 8;
                        break;
                    case 12:
                        i = 9;
                        break;
                    case 13:
                        i = 11;
                        break;
                    case 14:
                        i = 12;
                        break;
                    case 15:
                        i = 19;
                        break;
                    case 16:
                        i = 14;
                        break;
                    case 17:
                        i = 15;
                        break;
                    case 18:
                        i = 16;
                        break;
                    case 19:
                        i = 17;
                        break;
                    case 20:
                        i = 22;
                        break;
                    case 21:
                        i = 27;
                        break;
                    case 22:
                        i = 28;
                        break;
                    case 23:
                        i = 29;
                        break;
                    case 24:
                        i = 30;
                        break;
                    default:
                        i = 1;
                        break;
                }
                if (bZ21.c) {
                    bZ21.bF();
                    bZ21.c = false;
                }
                ddwk ddwkVar = (ddwk) bZ21.b;
                ddwkVar.b = i - 1;
                ddwkVar.a |= 1;
                if (crqwVar instanceof crre) {
                    dpfh dpfhVar = ((crre) crqwVar).a;
                    if ((32 & dpfhVar.a) != 0) {
                        dozz dozzVar = dpfhVar.h;
                        if (dozzVar == null) {
                            dozzVar = dozz.y;
                        }
                        doza b5 = doza.b(dozzVar.e);
                        if (b5 == null) {
                            b5 = doza.INFORMATION;
                        }
                        if (bZ21.c) {
                            bZ21.bF();
                            bZ21.c = false;
                        }
                        ddwk ddwkVar2 = (ddwk) bZ21.b;
                        ddwkVar2.c = b5.e;
                        ddwkVar2.a |= 2;
                        dozy b6 = dozy.b(dozzVar.f);
                        if (b6 == null) {
                            b6 = dozy.UNKNOWN;
                        }
                        if (bZ21.c) {
                            bZ21.bF();
                            bZ21.c = false;
                        }
                        ddwk ddwkVar3 = (ddwk) bZ21.b;
                        ddwkVar3.d = b6.G;
                        ddwkVar3.a |= 4;
                    }
                } else if ((crqwVar instanceof crrd) && (h = ((crrd) crqwVar).a.h()) != null) {
                    if (bZ21.c) {
                        bZ21.bF();
                        bZ21.c = false;
                    }
                    ddwk ddwkVar4 = (ddwk) bZ21.b;
                    ddwkVar4.e = h.s;
                    ddwkVar4.a |= 8;
                }
                ddvr bZ22 = ddvs.g.bZ();
                if (bZ22.c) {
                    bZ22.bF();
                    bZ22.c = false;
                }
                ddvs ddvsVar11 = (ddvs) bZ22.b;
                ddwk bK11 = bZ21.bK();
                bK11.getClass();
                ddvsVar11.c = bK11;
                ddvsVar11.b = 16;
                crpiVar15.e.c(bZ22);
                return;
            case 22:
                crpi crpiVar16 = (crpi) this.a;
                ahjy ahjyVar = (ahjy) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar16.m() || (a2 = crpiVar16.i.a(ahjyVar.a)) == null) {
                    return;
                }
                crpiVar16.e.c(a2);
                return;
            case 23:
                crpi crpiVar17 = (crpi) this.a;
                crhd crhdVar = (crhd) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (crpiVar17.m()) {
                    crpiVar17.d(crhdVar);
                    return;
                }
                crpiVar17.l.push(crhdVar);
                crpiVar17.m.push(Long.valueOf(crpiVar17.c.e()));
                return;
            case 24:
                crpi crpiVar18 = (crpi) this.a;
                crih crihVar = (crih) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar18.o.a() || !crpiVar18.m()) {
                    return;
                }
                ddvr bZ23 = ddvs.g.bZ();
                ddxr bZ24 = ddxs.d.bZ();
                boolean b7 = crpiVar18.o.b().b();
                if (bZ24.c) {
                    bZ24.bF();
                    bZ24.c = false;
                }
                ddxs ddxsVar = (ddxs) bZ24.b;
                ddxsVar.a |= 1;
                ddxsVar.b = b7;
                boolean d3 = crpiVar18.o.b().d();
                if (bZ24.c) {
                    bZ24.bF();
                    bZ24.c = false;
                }
                ddxs ddxsVar2 = (ddxs) bZ24.b;
                ddxsVar2.a |= 2;
                ddxsVar2.c = d3;
                if (bZ23.c) {
                    bZ23.bF();
                    bZ23.c = false;
                }
                ddvs ddvsVar12 = (ddvs) bZ23.b;
                ddxs bK12 = bZ24.bK();
                bK12.getClass();
                ddvsVar12.c = bK12;
                ddvsVar12.b = 35;
                crpiVar18.e.c(bZ23);
                return;
            case 25:
                crpi crpiVar19 = (crpi) this.a;
                ahkc ahkcVar = (ahkc) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!crpiVar19.a() || !crpiVar19.m()) {
                    return;
                }
                ddvr bZ25 = ddvs.g.bZ();
                ddvo bZ26 = ddvp.c.bZ();
                ddnf ddnfVar = ahkcVar.a;
                if (bZ26.c) {
                    bZ26.bF();
                    bZ26.c = false;
                }
                ddvp ddvpVar = (ddvp) bZ26.b;
                ddnfVar.getClass();
                ddvpVar.b = ddnfVar;
                ddvpVar.a |= 1;
                if (bZ25.c) {
                    bZ25.bF();
                    bZ25.c = false;
                }
                ddvs ddvsVar13 = (ddvs) bZ25.b;
                ddvp bK13 = bZ26.bK();
                bK13.getClass();
                ddvsVar13.c = bK13;
                ddvsVar13.b = 33;
                crpiVar19.e.d(bZ25, null, true, null, null);
                return;
            default:
                crot crotVar = (crot) obj;
                bvrj.NAVIGATION_INTERNAL.c();
                if (!((crpi) this.a).m()) {
                    return;
                }
                crotVar.a();
                crotVar.b();
                return;
        }
    }
}
