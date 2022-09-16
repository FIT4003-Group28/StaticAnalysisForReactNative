package defpackage;

import android.app.Service;
import android.graphics.Rect;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byzr  reason: default package */
/* loaded from: classes4.dex */
public final class byzr extends byzq {
    private final byzz a;
    private final byzz e;
    private final byzz f;
    private final byzz g;
    private final byzz h;
    private final byzz i;

    public byzr(Service service, vyl vylVar, bzas bzasVar, bzam bzamVar, bzal bzalVar, byzw byzwVar, byzo byzoVar, byzv byzvVar, btvo btvoVar) {
        super(vylVar, service, btvoVar);
        this.a = bzasVar;
        this.e = bzamVar;
        this.f = byzwVar;
        this.g = byzoVar;
        this.h = bzalVar;
        this.i = byzvVar;
    }

    @Override // defpackage.byzz
    public final byzy a(bzdk bzdkVar, byzg byzgVar) {
        vyk a;
        vyk vykVar;
        CharSequence charSequence;
        char c;
        vyk e;
        String f;
        int ordinal = byzgVar.ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                byzz byzzVar = this.e;
                bzdg b = ((bzdl) bzdkVar.g()).b();
                bzam bzamVar = (bzam) byzzVar;
                return ((byzq) byzzVar).i(bzdkVar, byzgVar, bzamVar.b(bzdkVar, b), bzamVar.m(b), bzamVar.n(b), bzal.m(b));
            } else if (ordinal == 2) {
                return this.h.a(bzdkVar, byzgVar);
            } else {
                if (ordinal == 3) {
                    return this.f.a(bzdkVar, byzgVar);
                }
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        byzz byzzVar2 = this.i;
                        if (byzgVar != byzg.ERROR) {
                            z = false;
                        }
                        dbsk.a(z);
                        byzv byzvVar = (byzv) byzzVar2;
                        byzq byzqVar = (byzq) byzzVar2;
                        return byzqVar.i(bzdkVar, byzgVar, byzvVar.b.a(byzqVar.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ERROR, new Object[0])), byzvVar.b.a(""), byzvVar.a, 2131232648);
                    }
                    String valueOf = String.valueOf(byzgVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    sb.append("No content for ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                byzz byzzVar3 = this.g;
                byzo byzoVar = (byzo) byzzVar3;
                vyl vylVar = byzoVar.b;
                dozc s = bzdkVar.g().b().s();
                if (s == null) {
                    f = byzoVar.b(bzdkVar);
                } else {
                    int ordinal2 = s.ordinal();
                    if (ordinal2 == 1) {
                        f = ((byzq) byzzVar3).f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE_DESTINATION_LEFT, new Object[0]);
                    } else if (ordinal2 == 2) {
                        f = ((byzq) byzzVar3).f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE_DESTINATION_RIGHT, new Object[0]);
                    } else {
                        f = byzoVar.b(bzdkVar);
                    }
                }
                byzq byzqVar2 = (byzq) byzzVar3;
                return byzqVar2.i(bzdkVar, byzgVar, byzoVar.b.a(byzqVar2.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE, new Object[0])), vylVar.a(f), byzoVar.a, 2131232848);
            }
        }
        byzz byzzVar4 = this.a;
        bzdf bzdfVar = (bzdf) bzdkVar.g();
        bzas bzasVar = (bzas) byzzVar4;
        byzq byzqVar3 = (byzq) byzzVar4;
        vyk a2 = bzasVar.b.a(byzqVar3.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_WALK, bzdfVar.d()));
        if (bzdfVar.o()) {
            vykVar = bzasVar.b((int) bzdfVar.e().g(), bzdfVar.f(), bzdfVar.h());
        } else {
            bzdg B = bzdfVar.b().B();
            dcdc q = dcdc.q(alcf.o(B.z()));
            vyk a3 = bzasVar.f.a(B, false);
            bvsx bvsxVar = new bvsx(byzqVar3.e());
            if (a3 != null && q.size() > 0) {
                if (q.size() == 1) {
                    vyl vylVar2 = bzasVar.b;
                    vyk[] vykVarArr = new vyk[3];
                    if (bzasVar.d.getTransitTrackingParameters().p) {
                        charSequence = " ";
                        zua zuaVar = new zua(bzasVar.c, q, byzqVar3.l(R.dimen.notification_description_directions_icon_size), new Rect(0, 0, byzqVar3.l(R.dimen.notification_description_vehicle_line_padding), 0), byzqVar3.l(R.dimen.transit_line_description_max_width));
                        e = bzasVar.b.b(zuaVar, zuaVar.c());
                        c = 1;
                    } else {
                        charSequence = " ";
                        c = 1;
                        e = bzasVar.b.e(q, vyl.d(bzasVar.c), true);
                    }
                    vykVarArr[0] = e;
                    vyl vylVar3 = bzasVar.b;
                    bvsv a4 = bvsxVar.a(byzqVar3.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_DEPARTS, new Object[0]));
                    a4.g(charSequence);
                    vykVarArr[c] = vylVar3.a(a4.c());
                    vykVarArr[2] = a3;
                    a = vylVar2.c(vykVarArr);
                } else {
                    vyl vylVar4 = bzasVar.b;
                    bvsv a5 = bvsxVar.a(byzqVar3.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_DEPARTURES, new Object[0]));
                    a5.g(" ");
                    a = vylVar4.c(vylVar4.a(a5.c()), a3);
                }
            } else {
                a = bzasVar.b.a("");
            }
            vykVar = a;
        }
        return byzqVar3.i(bzdkVar, byzgVar, a2, vykVar, bzasVar.a, 2131232627);
    }

    public final byzy b(bzdk bzdkVar, byzg byzgVar, bzdg bzdgVar) {
        String e;
        String f;
        byzg byzgVar2 = byzg.WALK;
        int ordinal = byzgVar.ordinal();
        int i = 0;
        if (ordinal == 0) {
            byzz byzzVar = this.a;
            dbsk.l(!bzdgVar.D());
            amte k = bzdkVar.k();
            dbsk.s(k);
            bzas bzasVar = (bzas) byzzVar;
            amub b = k.b(bzdkVar.m(), bzasVar.c);
            dbsk.s(b);
            if (bzdgVar.F()) {
                e = amvj.j(b.k());
            } else {
                e = bzdgVar.B().e();
            }
            byzq byzqVar = (byzq) byzzVar;
            return byzqVar.j(bzdkVar, bzdgVar, byzgVar, bzasVar.b.a(byzqVar.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_WALK, e)), bzasVar.b((int) bzdgVar.y().g(), bzdgVar.w(), b.I), bzasVar.e, 2131232627);
        } else if (ordinal == 1) {
            byzz byzzVar2 = this.e;
            bzam bzamVar = (bzam) byzzVar2;
            return ((byzq) byzzVar2).j(bzdkVar, bzdgVar, byzgVar, bzamVar.b(bzdkVar, bzdgVar), bzamVar.m(bzdgVar), bzamVar.n(bzdgVar), bzal.m(bzdgVar));
        } else if (ordinal != 2) {
            if (ordinal == 4) {
                byzz byzzVar3 = this.g;
                byzo byzoVar = (byzo) byzzVar3;
                byzq byzqVar2 = (byzq) byzzVar3;
                return byzqVar2.j(bzdkVar, bzdgVar, byzgVar, byzoVar.b.a(byzqVar2.f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE_TITLE_REVIEW, bvtb.i(byzoVar.c, TimeUnit.MILLISECONDS.toSeconds(bzdkVar.d().a)))), byzoVar.b.a(byzoVar.b(bzdkVar)), byzoVar.a, 2131232848);
            }
            String valueOf = String.valueOf(byzgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("No content for ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        } else {
            byzz byzzVar4 = this.h;
            String f2 = bzdgVar.f();
            if (f2 == null) {
                f = bzdgVar.g();
            } else {
                f = ((byzq) byzzVar4).f(R.string.TRANSIT_GUIDANCE_STOP_NAME_WITH_ICON, bzdgVar.g(), f2);
            }
            bzal bzalVar = (bzal) byzzVar4;
            vyk a = bzalVar.b.a(bzalVar.b(f));
            vyk a2 = bzalVar.b.a(bzalVar.n(bzdgVar.u(), (int) Math.max(0L, bzdgVar.y().g()), false));
            if (bzdkVar.h() != bzdj.STARTED || bzdgVar.J() < bzdkVar.g().q()) {
                i = 1;
            }
            byzq byzqVar3 = (byzq) byzzVar4;
            return byzqVar3.j(bzdkVar, bzdgVar, byzgVar, a, a2, new bzap(i, bzdgVar.m(), bzdgVar.A(), false, bzalVar.a, byzqVar3.e()), bzal.m(bzdgVar));
        }
    }
}
