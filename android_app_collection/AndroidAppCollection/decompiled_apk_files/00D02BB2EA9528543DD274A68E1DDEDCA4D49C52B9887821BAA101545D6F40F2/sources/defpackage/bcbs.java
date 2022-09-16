package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: bcbs  reason: default package */
/* loaded from: classes3.dex */
public final class bcbs implements bcbx, bcbu {
    private static final dcqe c = dcqe.c("bcbs");
    private static final dcdn<bcbr, bbur> e;
    public final dcdn<dspd, bbuq> a;
    private final dcdn<bcbr, dweu> d;
    @dzsi
    private final ilo f;
    private final bbur g;
    @dzsi
    private final dwfl h;
    private final boolean i;
    private final cjtd j;
    private final Activity k;
    private final btvo l;
    private final bckv m;
    private final bcmv n;
    private final bcol o;
    private final bcot p;
    private final bcoi q;
    private final bcoq r;
    private dcdc<dweu> s;

    static {
        dcdg p = dcdn.p();
        p.f(bcbr.ROOM, bbur.OPEN_ROOM_TAB);
        p.f(bcbr.FOOD_AND_DRINK, bbur.OPEN_FOOD_AND_DRINK_TAB);
        p.f(bcbr.VIBE, bbur.OPEN_VIBE_TAB);
        p.f(bcbr.AMENITY, bbur.OPEN_AMENITIES_TAB);
        p.f(bcbr.IN_STORE, bbur.OPEN_IN_STORE_TAB);
        p.f(bcbr.FROM_VISITORS, bbur.OPEN_FROM_VISITORS_TAB);
        p.f(bcbr.BY_OWNER, bbur.OPEN_BY_OWNER_TAB);
        p.f(bcbr.PHOTO_360, bbur.OPEN_360_TAB);
        p.f(bcbr.VIDEO, bbur.OPEN_VIDEO_TAB);
        e = dcjz.c(p.b());
    }

    public bcbs(@dzsi ilo iloVar, Map<dspd, bbuq> map, bbur bburVar, @dzsi dwfl dwflVar, boolean z, cjtd cjtdVar, Activity activity, btvo btvoVar, bckv bckvVar, bcmv bcmvVar, bcoi bcoiVar, bcol bcolVar, bcot bcotVar, bcoq bcoqVar) {
        cknx bdvmVar;
        this.s = dcdc.e();
        this.f = iloVar;
        this.g = bburVar;
        this.h = dwflVar;
        this.i = z;
        this.j = cjtdVar;
        this.k = activity;
        this.l = btvoVar;
        this.m = bckvVar;
        this.n = bcmvVar;
        this.o = bcolVar;
        this.p = bcotVar;
        this.r = bcoqVar;
        this.q = bcoiVar;
        dwek bZ = dweu.m.bZ();
        dspd B = dspd.B(bcbr.ROOM.name());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dweu dweuVar = (dweu) bZ.b;
        B.getClass();
        dweuVar.a |= 1;
        dweuVar.d = B;
        if (iloVar != null && iloVar.bH() && iloVar.aF(dweb.ROOM).size() == 0 && h()) {
            dwet dwetVar = dwet.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dweu dweuVar2 = (dweu) bZ.b;
            dwetVar.getClass();
            dweuVar2.c = dwetVar;
            dweuVar2.b = 6;
        }
        dwek bZ2 = dweu.m.bZ();
        dspd B2 = dspd.B(bcbr.FOOD_AND_DRINK.name());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dweu dweuVar3 = (dweu) bZ2.b;
        B2.getClass();
        dweuVar3.a |= 1;
        dweuVar3.d = B2;
        if (iloVar != null && iloVar.bG() && iloVar.aF(dweb.FOOD_AND_DRINK).size() == 0 && h()) {
            dwet dwetVar2 = dwet.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dweu dweuVar4 = (dweu) bZ2.b;
            dwetVar2.getClass();
            dweuVar4.c = dwetVar2;
            dweuVar4.b = 6;
        }
        dwek bZ3 = dweu.m.bZ();
        dspd B3 = dspd.B(bcbr.IN_STORE.name());
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dweu dweuVar5 = (dweu) bZ3.b;
        B3.getClass();
        dweuVar5.a |= 1;
        dweuVar5.d = B3;
        if (iloVar != null && iloVar.bI() && iloVar.aF(dweb.IN_STORE).isEmpty() && h()) {
            dwet dwetVar3 = dwet.e;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dweu dweuVar6 = (dweu) bZ3.b;
            dwetVar3.getClass();
            dweuVar6.c = dwetVar3;
            dweuVar6.b = 6;
        }
        dwek bZ4 = dweu.m.bZ();
        dspd B4 = dspd.B(bcbr.BY_OWNER.name());
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dweu dweuVar7 = (dweu) bZ4.b;
        B4.getClass();
        dweuVar7.a |= 1;
        dweuVar7.d = B4;
        if (iloVar != null && iloVar.bf().r && iloVar.aI() == 0 && h()) {
            dwet dwetVar4 = dwet.e;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dweu dweuVar8 = (dweu) bZ4.b;
            dwetVar4.getClass();
            dweuVar8.c = dwetVar4;
            dweuVar8.b = 6;
        }
        dcdg p = dcdn.p();
        p.f(bcbr.ROOM, bZ.bK());
        p.f(bcbr.FOOD_AND_DRINK, bZ2.bK());
        bcbr bcbrVar = bcbr.VIBE;
        dwek bZ5 = dweu.m.bZ();
        dspd B5 = dspd.B(bcbr.VIBE.name());
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dweu dweuVar9 = (dweu) bZ5.b;
        B5.getClass();
        dweuVar9.a |= 1;
        dweuVar9.d = B5;
        p.f(bcbrVar, bZ5.bK());
        bcbr bcbrVar2 = bcbr.AMENITY;
        dwek bZ6 = dweu.m.bZ();
        dspd B6 = dspd.B(bcbr.AMENITY.name());
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dweu dweuVar10 = (dweu) bZ6.b;
        B6.getClass();
        dweuVar10.a |= 1;
        dweuVar10.d = B6;
        p.f(bcbrVar2, bZ6.bK());
        p.f(bcbr.IN_STORE, bZ3.bK());
        bcbr bcbrVar3 = bcbr.FROM_VISITORS;
        dwek bZ7 = dweu.m.bZ();
        dspd B7 = dspd.B(bcbr.FROM_VISITORS.name());
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dweu dweuVar11 = (dweu) bZ7.b;
        B7.getClass();
        dweuVar11.a |= 1;
        dweuVar11.d = B7;
        p.f(bcbrVar3, bZ7.bK());
        p.f(bcbr.BY_OWNER, bZ4.bK());
        bcbr bcbrVar4 = bcbr.PHOTO_360;
        dwek bZ8 = dweu.m.bZ();
        dspd B8 = dspd.B(bcbr.PHOTO_360.name());
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dweu dweuVar12 = (dweu) bZ8.b;
        B8.getClass();
        dweuVar12.a |= 1;
        dweuVar12.d = B8;
        p.f(bcbrVar4, bZ8.bK());
        bcbr bcbrVar5 = bcbr.VIDEO;
        dwek bZ9 = dweu.m.bZ();
        dspd B9 = dspd.B(bcbr.VIDEO.name());
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dweu dweuVar13 = (dweu) bZ9.b;
        B9.getClass();
        dweuVar13.a |= 1;
        dweuVar13.d = B9;
        p.f(bcbrVar5, bZ9.bK());
        dcdn<bcbr, dweu> c2 = dcjz.c(p.b());
        this.d = c2;
        dccx F = dcdc.F();
        dcpd<dweu> it = c2.values().iterator();
        while (it.hasNext()) {
            dweu next = it.next();
            if (g(next)) {
                F.g(next);
            }
        }
        this.s = F.f();
        dcdg p2 = dcdn.p();
        if (map.containsKey(b)) {
            p2.f(b, map.get(b));
        } else {
            p2.f(b, new cknz(this.f, new cknw(null, false, false, true, this.i, dcdc.e())));
        }
        dcpd<dweu> it2 = this.d.values().iterator();
        while (it2.hasNext()) {
            dweu next2 = it2.next();
            dspd dspdVar = next2.d;
            if (map.containsKey(dspdVar)) {
                p2.f(dspdVar, map.get(dspdVar));
            } else {
                ilo iloVar2 = this.f;
                switch (bcbr.a(next2.d.J()).ordinal()) {
                    case 0:
                        bdvmVar = new bdvm(dweb.ROOM, this.i);
                        break;
                    case 1:
                        bdvmVar = new bdvm(dweb.FOOD_AND_DRINK, this.i);
                        break;
                    case 2:
                        bdvmVar = new bdvm(dweb.VIBE, this.i);
                        break;
                    case 3:
                        bdvmVar = new bdvm(dweb.AMENITY, this.i);
                        break;
                    case 4:
                        bdvmVar = new bdvm(dweb.IN_STORE, this.i);
                        break;
                    case 5:
                        bdvmVar = new bdvq(this.i);
                        break;
                    case 6:
                        bdvmVar = new bdvn(this.i);
                        break;
                    case 7:
                        bdvmVar = new bdvo();
                        break;
                    case 8:
                        bdvmVar = new bdvp();
                        break;
                    default:
                        bdvmVar = null;
                        break;
                }
                dbuh.d(bdvmVar);
                p2.f(dspdVar, new cknz(iloVar2, bdvmVar));
            }
        }
        this.a = p2.b();
    }

    private final boolean g(dweu dweuVar) {
        if (this.l.getImageryViewerParameters().c && this.f != null) {
            switch (bcbr.a(dweuVar.d.J()).ordinal()) {
                case 0:
                    return this.f.aF(dweb.ROOM).size() > 0 || this.d.get(bcbr.ROOM).b == 6;
                case 1:
                    return this.f.aF(dweb.FOOD_AND_DRINK).size() > 0 || this.d.get(bcbr.FOOD_AND_DRINK).b == 6;
                case 2:
                    return this.f.aF(dweb.VIBE).size() >= 3;
                case 3:
                    return this.f.aF(dweb.AMENITY).size() >= 3;
                case 4:
                    return !this.f.aF(dweb.IN_STORE).isEmpty() || this.d.get(bcbr.IN_STORE).b == 6;
                case 5:
                    return this.f.bH() && this.f.aJ() >= 3;
                case 6:
                    return this.f.aI() > 0 || this.d.get(bcbr.BY_OWNER).b == 6;
                case 7:
                    return this.f.aH() > 1;
                case 8:
                    return this.i && this.f.aK() > 1;
                default:
                    return false;
            }
        }
        return false;
    }

    private final boolean h() {
        ilo iloVar = this.f;
        if (iloVar == null) {
            return false;
        }
        return iloVar.aX(this.l.getEnableFeatureParameters());
    }

    private final bcmu i(String str, dweu dweuVar, bbuq bbuqVar, @dzsi dwfl dwflVar, cjtd cjtdVar) {
        return this.n.a(str, dweuVar, bbuqVar, dwflVar, this.j, cjtdVar, this.f, null, true);
    }

    @Override // defpackage.bcbv
    public final dehn<dcdc<dweu>> a() {
        return deha.a(this.s);
    }

    @Override // defpackage.bcbx
    @dzsi
    public final bcbu b() {
        return this;
    }

    @Override // defpackage.bcbu
    public final boolean c(dweu dweuVar) {
        return this.g.equals(e.get(bcbr.a(dweuVar.d.J()))) && g(dweuVar);
    }

    @Override // defpackage.bcbv
    public final dcdc<bclt> d() {
        bvoo.h("getCoverImageViewModels should never be called from ClientBasedCollectionManager.", new Object[0]);
        return dcdc.e();
    }

    @Override // defpackage.bcbu
    public final dcdc<bclv> e() {
        String string;
        bcmu bcosVar;
        bcmu bcohVar;
        dccx dccxVar = new dccx();
        int i = 1;
        boolean z = this.g == bbur.DEFAULT || !dcbg.b(this.s).p(new dbsl(this) { // from class: bcbq
            private final bcbs a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.c((dweu) obj);
            }
        });
        bcmv bcmvVar = this.n;
        if (this.m.c()) {
            string = this.k.getString(R.string.GALLERY_COLLECTIONS_DEFAULT_GALLERY_TITLE);
        } else {
            string = this.k.getString(R.string.GALLERY_OVERVIEW_TITLE);
        }
        String str = string;
        dweu dweuVar = dweu.m;
        bbuq bbuqVar = this.a.get(b);
        dbsk.s(bbuqVar);
        dccxVar.g(bcmvVar.a(str, dweuVar, bbuqVar, z ? this.h : null, this.j, cjtd.a(dtxy.cb), this.f, null, true));
        dcdc<dweu> dcdcVar = this.s;
        int size = dcdcVar.size();
        int i2 = 0;
        while (i2 < size) {
            dweu dweuVar2 = dcdcVar.get(i2);
            bbuq bbuqVar2 = this.a.get(dweuVar2.d);
            dbsk.s(bbuqVar2);
            switch (bcbr.a(dweuVar2.d.J()).ordinal()) {
                case 0:
                    bcot bcotVar = this.p;
                    dweu dweuVar3 = dweu.m;
                    dwfl dwflVar = c(dweuVar2) ? this.h : null;
                    ilo iloVar = this.f;
                    boolean z2 = dweuVar2.b == 6;
                    bcms a = bcotVar.a.a();
                    bcot.a(a, 1);
                    Activity activity = (Activity) ((dxjd) bcotVar.b).a;
                    bcot.a(activity, 2);
                    bcot.a(dweuVar3, 3);
                    bcot.a(bbuqVar2, 4);
                    bcosVar = new bcos(a, activity, dweuVar3, bbuqVar2, dwflVar, iloVar, !z2);
                    continue;
                    dbuh.d(bcosVar);
                    dccxVar.g(bcosVar);
                    i2++;
                    i = 1;
                case 1:
                    bcoi bcoiVar = this.q;
                    dweu dweuVar4 = dweu.m;
                    dwfl dwflVar2 = c(dweuVar2) ? this.h : null;
                    ilo iloVar2 = this.f;
                    boolean z3 = dweuVar2.b == 6;
                    bcms a2 = bcoiVar.a.a();
                    bcoi.a(a2, 1);
                    Activity activity2 = (Activity) ((dxjd) bcoiVar.b).a;
                    bcoi.a(activity2, 2);
                    bcoi.a(dweuVar4, 3);
                    bcoi.a(bbuqVar2, 4);
                    bcohVar = new bcoh(a2, activity2, dweuVar4, bbuqVar2, dwflVar2, iloVar2, !z3);
                    bcosVar = bcohVar;
                    break;
                case 2:
                    bcosVar = i(this.k.getString(R.string.GALLERY_VIBE_TITLE), dweu.m, bbuqVar2, c(dweuVar2) ? this.h : null, cjtd.a(dtxy.bM));
                    break;
                case 3:
                    bcosVar = i(this.k.getString(R.string.GALLERY_AMENITIES_TITLE), dweu.m, bbuqVar2, c(dweuVar2) ? this.h : null, cjtd.a(dtxy.bL));
                    break;
                case 4:
                    bcol bcolVar = this.o;
                    dweu dweuVar5 = dweu.m;
                    dwfl dwflVar3 = c(dweuVar2) ? this.h : null;
                    ilo iloVar3 = this.f;
                    boolean z4 = dweuVar2.b == 6;
                    bcms a3 = bcolVar.a.a();
                    bcol.a(a3, 1);
                    Activity activity3 = (Activity) ((dxjd) bcolVar.b).a;
                    bcol.a(activity3, 2);
                    bcol.a(dweuVar5, 3);
                    bcol.a(bbuqVar2, 4);
                    bcohVar = new bcok(a3, activity3, dweuVar5, bbuqVar2, dwflVar3, iloVar3, !z4);
                    bcosVar = bcohVar;
                    break;
                case 5:
                    bcosVar = i(this.k.getString(R.string.GALLERY_FROM_VISITORS_TITLE), dweu.m, bbuqVar2, c(dweuVar2) ? this.h : null, cjtd.a(dtxy.bX));
                    break;
                case 6:
                    ilo iloVar4 = this.f;
                    boolean z5 = (iloVar4 == null || !iloVar4.bf().r || dweuVar2.b == 6) ? false : true;
                    bcoq bcoqVar = this.r;
                    dweu dweuVar6 = dweu.m;
                    dwfl dwflVar4 = c(dweuVar2) ? this.h : null;
                    ilo iloVar5 = this.f;
                    bcms a4 = bcoqVar.a.a();
                    bcoq.a(a4, i);
                    Activity activity4 = (Activity) ((dxjd) bcoqVar.b).a;
                    bcoq.a(activity4, 2);
                    akfa a5 = bcoqVar.c.a();
                    bcoq.a(a5, 3);
                    dxio a6 = ((dxjh) bcoqVar.d).a();
                    bcoq.a(a6, 4);
                    bcoq.a(dweuVar6, 5);
                    bcoq.a(bbuqVar2, 6);
                    bcosVar = new bcop(a4, activity4, a5, a6, dweuVar6, bbuqVar2, dwflVar4, iloVar5, z5);
                    break;
                case 7:
                    bcosVar = i(this.k.getString(R.string.GALLERY_360_TITLE), dweu.m, bbuqVar2, c(dweuVar2) ? this.h : null, cjtd.a(dtxy.bJ));
                    break;
                case 8:
                    bcosVar = i(this.k.getString(R.string.GALLERY_VIDEOS_TITLE), dweu.m, bbuqVar2, c(dweuVar2) ? this.h : null, cjtd.a(dtxy.cj));
                    break;
                default:
                    bcosVar = null;
                    continue;
                    dbuh.d(bcosVar);
                    dccxVar.g(bcosVar);
                    i2++;
                    i = 1;
            }
            dbuh.d(bcosVar);
            dccxVar.g(bcosVar);
            i2++;
            i = 1;
        }
        return dccxVar.f();
    }

    @Override // defpackage.bcbu
    public final dcdn<dspd, bbuq> f() {
        return this.a;
    }
}
