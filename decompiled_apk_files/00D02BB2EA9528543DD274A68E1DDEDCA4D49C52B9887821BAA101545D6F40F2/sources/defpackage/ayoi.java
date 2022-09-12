package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayoi  reason: default package */
/* loaded from: classes3.dex */
public class ayoi implements aymp {
    static final dnqh a;
    static final dnqh b;
    public static final /* synthetic */ int r = 0;
    private final dqhy A;
    private final dxio<axwo> B;
    private final axwg C;
    private final batz D;
    private final axze E;
    @dzsi
    private ayde F;
    @dzsi
    private aymx G;
    @dzsi
    private final Integer H;
    private final aydo I;
    private final ayqe J;
    private final ayrc K;
    private final ayra L;
    private final bfkm M;
    public final gga c;
    public final ges d;
    public final axwi e;
    public final cztz f;
    public final batm g;
    public final String h;
    public final bzqa i;
    public final bzqc j;
    public final ayay k;
    public final aydl l;
    @dzsi
    public ayfk m;
    public baal n;
    @dzsi
    protected bnju o;
    public final aybq p;
    public final isd q;
    private final bvsl s;
    private final begg t;
    private final drcs u;
    private final int v;
    private final akfa w;
    private final dxio<angp> x;
    private final btvo y;
    private final bvrb z;

    static {
        dnqg bZ = dnqh.p.bZ();
        int i = ddda.eO.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        a = bZ.bK();
        dnqg bZ2 = dnqh.p.bZ();
        int i2 = ddda.eP.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ2.b;
        dnqhVar2.a |= 64;
        dnqhVar2.g = i2;
        b = bZ2.bK();
    }

    public ayoi(gga ggaVar, fd fdVar, begg beggVar, bvsl bvslVar, axwi axwiVar, dxio<axwo> dxioVar, cztz cztzVar, batm batmVar, bvrb bvrbVar, akfa akfaVar, dxio<angp> dxioVar2, btvo btvoVar, bzqa bzqaVar, bzqc bzqcVar, aydo aydoVar, ayqe ayqeVar, ayay ayayVar, ayrc ayrcVar, bfks bfksVar, axwg axwgVar, batz batzVar, axze axzeVar, aybq aybqVar, aydl aydlVar, ayra ayraVar, isd isdVar, baal baalVar, String str, drcs drcsVar, int i, @dzsi ayfb ayfbVar, @dzsi Integer num, @dzsi ayfk ayfkVar) {
        dqhy c;
        this.c = ggaVar;
        this.d = (ges) fdVar;
        this.s = bvslVar;
        this.n = baalVar;
        this.t = beggVar;
        this.e = axwiVar;
        this.f = cztzVar;
        this.g = batmVar;
        this.z = bvrbVar;
        this.w = akfaVar;
        this.x = dxioVar2;
        this.h = str;
        this.u = drcsVar;
        this.v = i;
        diwb diwbVar = null;
        this.o = ayfbVar == null ? null : ayfbVar.a();
        this.H = num;
        this.y = btvoVar;
        this.i = bzqaVar;
        this.j = bzqcVar;
        this.I = aydoVar;
        this.J = ayqeVar;
        this.k = ayayVar;
        this.K = ayrcVar;
        this.m = ayfkVar;
        this.B = dxioVar;
        this.M = bfksVar.a(new Runnable(this) { // from class: aynq
            private final ayoi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, null, dbpy.a);
        this.D = batzVar;
        this.C = axwgVar;
        this.E = axzeVar;
        this.l = aydlVar;
        this.p = aybqVar;
        this.L = ayraVar;
        this.q = isdVar;
        if (ayfbVar == null) {
            c = dqhy.OK;
        } else {
            c = ayfbVar.c();
        }
        this.A = c;
        ddho G = G(baalVar);
        if (G == null) {
            return;
        }
        diwbVar = ayfbVar != null ? ayfbVar.b() : diwbVar;
        if (diwbVar != null) {
            diwb diwbVar2 = diwbVar;
            this.F = aydoVar.b(baalVar, diwbVar2, true, false, G);
            ayra.a(baalVar, 1);
            ayra.a(diwbVar, 2);
            ayra.a(G, 5);
            gga a2 = ayraVar.a.a();
            ayra.a(a2, 6);
            aklj a3 = ayraVar.b.a();
            ayra.a(a3, 7);
            aaxo a4 = ayraVar.c.a();
            ayra.a(a4, 8);
            bvsx a5 = ayraVar.d.a();
            ayra.a(a5, 9);
            dxio a6 = ((dxjh) ayraVar.e).a();
            ayra.a(a6, 10);
            dxio a7 = ((dxjh) ayraVar.f).a();
            ayra.a(a7, 11);
            this.G = new ayqz(baalVar, diwbVar2, G, a2, a3, a4, a5, a6, a7);
        } else if (baalVar.x() != baaj.EXPERIENCE) {
        } else {
            this.F = aydoVar.a(baalVar, c, true, false, G);
            this.G = ayraVar.b(baalVar, c, G);
        }
    }

    private static int C(int i) {
        return i + 1;
    }

    private final boolean D() {
        return this.n.x() == baaj.EXPERIENCE && this.A != dqhy.OK;
    }

    private static String E(Context context, baal baalVar) {
        baak z = baalVar.z();
        if (z == null || !akqi.d(z.a())) {
            return context.getString(R.string.DROPPED_PIN);
        }
        return baalVar.y(context);
    }

    private static aymo F(Context context, int i, aydj aydjVar) {
        return new ayob(aydjVar, context, i);
    }

    @dzsi
    private static ddho G(@dzsi baal baalVar) {
        if (baalVar != null && baalVar.x() == baaj.EXPERIENCE) {
            return H(baalVar) ? dtxr.m : dtxr.n;
        }
        return null;
    }

    private static boolean H(baal baalVar) {
        baad b2 = baalVar.b();
        return b2 != null && b2.y();
    }

    private static boolean I(baal baalVar) {
        baad b2 = baalVar.b();
        return b2 != null && b2.ac();
    }

    public final void A(boolean z) {
        if (this.n.e() == z) {
            return;
        }
        this.n.f(z);
        y(this.n);
        baad b2 = this.n.b();
        if (b2 == null) {
            return;
        }
        if (z) {
            b2.U();
        } else {
            b2.V();
        }
        this.e.j(b2);
    }

    public final void B() {
        if (!this.n.e()) {
            this.x.a().i(u().h(), a, dbsg.i(new ayog(this, true)));
            A(true);
        } else {
            this.x.a().g(dbpy.a, dbpy.a, u().h(), dbpy.a, b, dbpy.a, dbsg.i(new ayog(this, false)));
            A(false);
        }
        cqkx.p(this);
    }

    @Override // defpackage.aymp
    public Boolean a() {
        baab baabVar = baab.FAVORITES;
        baaj baajVar = baaj.PLACE;
        int ordinal = this.n.x().ordinal();
        boolean z = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                return true;
            }
            return false;
        }
        baak z2 = this.n.z();
        if (z2 == null || this.o == null || z2.c()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aymp
    public Boolean b() {
        boolean z = false;
        if (D() || I(this.n)) {
            return false;
        }
        baad b2 = this.n.b();
        if ((b2 != null && b2.y()) || (btlu.i(this.w.j()) == btlt.GOOGLE && a().booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aymp
    public Boolean c() {
        boolean z = false;
        if (z() && D()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aymp
    public Boolean d() {
        return Boolean.valueOf(!dbsj.d(i().toString()));
    }

    @Override // defpackage.aymp
    public Boolean e() {
        return Boolean.valueOf(z());
    }

    @Override // defpackage.aymp
    public String f() {
        baad b2 = this.n.b();
        if ((b2 != null && !b2.W()) || this.n.o() < 0) {
            return E(this.c, this.n);
        }
        return this.c.getString(R.string.NUMBERED_PLACE_TITLE, new Object[]{Integer.valueOf(C(this.n.o())), alp.a().b(E(this.c, this.n))});
    }

    @Override // defpackage.aymp
    public String g() {
        baak z = this.n.z();
        dbsk.s(z);
        return akqi.d(z.a()) ? "" : z.b().b();
    }

    @Override // defpackage.aymp
    public String h() {
        return batx.b(this.H, this.s);
    }

    @Override // defpackage.aymp
    public CharSequence i() {
        return dbra.b.s(this.n.c());
    }

    @Override // defpackage.aymp
    @dzsi
    public aymo j() {
        baad b2 = this.n.b();
        if (b2 != null && b2.C()) {
            this.l.h(b2.N());
            this.E.a(b2.n(), new dbsz(this) { // from class: ayns
                private final ayoi a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    ayoi ayoiVar = this.a;
                    ayoiVar.l.j((List) obj);
                    cqkx.p(ayoiVar);
                }
            }, new dbty(this) { // from class: aynt
                private final ayoi a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    return Boolean.valueOf(cqkx.l(this.a).iterator().hasNext());
                }
            });
            dppk dppkVar = this.n.v().g;
            if (dppkVar == null) {
                dppkVar = dppk.b;
            }
            dpre dpreVar = dppkVar.a;
            if (dpreVar == null) {
                dpreVar = dpre.e;
            }
            String str = dpreVar.d;
            btlu j = this.w.j();
            if (this.n.l() && !dbsj.d(this.n.c())) {
                String j2 = j != null ? j.j() : null;
                if (j2 != null) {
                    str = j2;
                }
            }
            aydj d = this.l.d(str);
            if (d != null) {
                return F(this.c, R.string.NOTE_ATTRIBUTION, d);
            }
            aydl aydlVar = this.l;
            dpre dpreVar2 = this.n.v().l;
            if (dpreVar2 == null) {
                dpreVar2 = dpre.e;
            }
            aydj d2 = aydlVar.d(dpreVar2.d);
            if (d2 != null) {
                return F(this.c, R.string.PLACE_ATTRIBUTION, d2);
            }
        }
        return null;
    }

    @Override // defpackage.aymp
    public cqkl k() {
        this.D.c(this.h, this.u, this.v, u(), this.t);
        return cqkl.a;
    }

    @Override // defpackage.aymp
    public cqkl l() {
        if (!this.c.aZ) {
            return cqkl.a;
        }
        baad b2 = this.n.b();
        if (b2 != null) {
            b2.e(this.n);
            deha.q(this.e.j(b2), new ayoe(this, b2), this.z.h());
        }
        return cqkl.a;
    }

    @Override // defpackage.aymp
    public cqkl m() {
        if (this.c.aZ) {
            this.B.a().b(null, this.n);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymp
    @dzsi
    public bfkm n() {
        bnju x = x();
        if (x != null) {
            return x.ah();
        }
        return null;
    }

    @Override // defpackage.aymp
    public cqtv o() {
        if (this.n.j() != null) {
            return cqrp.d(220.0d);
        }
        return cqrp.d(152.0d);
    }

    @Override // defpackage.aymp
    public View.OnClickListener p() {
        return new View.OnClickListener(this) { // from class: aynw
            private final ayoi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ayoi ayoiVar = this.a;
                isc a2 = ayoiVar.q.a(view);
                a2.a(ayoiVar.q().b());
                a2.show();
            }
        };
    }

    @Override // defpackage.aymp
    public jht q() {
        ddho ddhoVar;
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = this.c.getString(R.string.ACCESSIBILITY_PLACE_OVERFLOW_MENU_DESCRIPTION, new Object[]{f()});
        jhiVar.d = Integer.valueOf(ibm.p().b(this.c));
        baad b2 = this.n.b();
        if (z()) {
            if (this.n.x() != baaj.EXPERIENCE) {
                boolean z = !dbsj.d(this.n.c());
                int i = z ? R.string.EDIT_NOTE_OVERFLOW_MENU_TEXT : R.string.ADD_NOTE_OVERFLOW_MENU_TEXT;
                jhm jhmVar = new jhm();
                jhmVar.l = i;
                jhmVar.a = this.c.getText(i);
                jhmVar.b = this.c.getText(i);
                jhmVar.f = cjtd.a(z ? dtxy.dT : dtxy.dO);
                jhmVar.d(new View.OnClickListener(this) { // from class: aynz
                    private final ayoi a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.m();
                    }
                });
                h.d(jhmVar.c());
                if (n() != null) {
                    jhm jhmVar2 = new jhm();
                    jhmVar2.l = R.string.CHOOSE_PHOTO_BUTTON_TEXT;
                    jhmVar2.a = this.c.getString(R.string.CHOOSE_PHOTO_BUTTON_TEXT);
                    gga ggaVar = this.c;
                    jhmVar2.b = ggaVar.getString(R.string.CHOOSE_PHOTO_BUTTON_CONTENT_DESCRIPTION, new Object[]{this.n.y(ggaVar)});
                    jhmVar2.f = cjtd.a(this.u == drcs.PUBLISHED ? dtxo.V : dtxo.R);
                    jhmVar2.d(new View.OnClickListener(this) { // from class: ayoa
                        private final ayoi a;

                        {
                            this.a = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ayoi ayoiVar = this.a;
                            aybp a2 = ayoiVar.p.a(ayoiVar.n, ayoiVar.o);
                            ges gesVar = ayoiVar.d;
                            if (a2.a) {
                                a2.b(gesVar, a2.c());
                            }
                        }
                    });
                    h.d(jhmVar2.c());
                }
            }
            int i2 = this.n.x() == baaj.EXPERIENCE ? R.string.REMOVE_ITEM_OVERFLOW_MENU_TEXT : R.string.REMOVE_PLACE_OVERFLOW_MENU_TEXT;
            jhm jhmVar3 = new jhm();
            jhmVar3.l = i2;
            jhmVar3.a = this.c.getText(i2);
            jhmVar3.b = this.c.getString(R.string.ACCESSIBILITY_REMOVE_DESCRIPTION, new Object[]{f()});
            baad b3 = this.n.b();
            dbsk.s(b3);
            baab o = b3.o();
            baab baabVar = baab.FAVORITES;
            int ordinal = o.ordinal();
            if (ordinal == 0) {
                ddhoVar = dtxo.M;
            } else if (ordinal == 1) {
                ddhoVar = dtxo.P;
            } else if (ordinal == 2) {
                ddhoVar = dtxo.O;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(o);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unsupported list type ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                ddhoVar = dtxo.L;
            }
            jhmVar3.f = cjtd.a(ddhoVar);
            jhmVar3.d(new View.OnClickListener(this) { // from class: aynr
                private final ayoi a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l();
                }
            });
            h.d(jhmVar3.c());
        }
        if (btlu.i(this.w.j()) == btlt.GOOGLE) {
            dbsk.s(b2);
            if (!b2.o().equals(baab.FAVORITES) && this.n.x() != baaj.EXPERIENCE && this.y.getPlaceListsParameters().a && a().booleanValue()) {
                boolean e = this.n.e();
                int i3 = e ? R.string.HAVENT_BEEN_OVERFLOW_MENU_TEXT : R.string.HAVE_BEEN_OVERFLOW_MENU_TEXT;
                int i4 = true != e ? R.string.ACCESSIBILITY_HAVE_BEEN_DESCRIPTION : R.string.ACCESSIBILITY_HAVENT_BEEN_DESCRIPTION;
                jhm jhmVar4 = new jhm();
                jhmVar4.l = i3;
                jhmVar4.a = this.c.getText(i3);
                jhmVar4.b = this.c.getString(i4, new Object[]{f()});
                cjta b4 = cjtd.b();
                b4.d = z() ? dtxy.dU : dtxy.dV;
                ddzy bZ = deab.c.bZ();
                deaa deaaVar = e ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                deab deabVar = (deab) bZ.b;
                deabVar.b = deaaVar.d;
                deabVar.a |= 1;
                b4.a = bZ.bK();
                jhmVar4.f = b4.a();
                jhmVar4.d(new View.OnClickListener(this) { // from class: aynx
                    private final ayoi a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final ayoi ayoiVar = this.a;
                        if (!ayoiVar.c.aZ) {
                            return;
                        }
                        ayoiVar.j.b(bzqb.LOCATION_HISTORY, new dbsz(ayoiVar) { // from class: ayny
                            private final ayoi a;

                            {
                                this.a = ayoiVar;
                            }

                            @Override // defpackage.dbsz
                            public final void NU(Object obj) {
                                ayoi ayoiVar2 = this.a;
                                if (((UdcCacheResponse.UdcSetting) ((dbsu) dbsg.i((UdcCacheResponse.UdcSetting) obj)).a).b != 3) {
                                    ayoiVar2.B();
                                } else {
                                    ayoiVar2.i.a(new int[]{bzqb.LOCATION_HISTORY.d, bzqb.LOCATION_REPORTING.d}, new ayoh(ayoiVar2), "timeline");
                                }
                            }
                        });
                    }
                });
                h.d(jhmVar4.c());
            }
        }
        return jhiVar.b();
    }

    @Override // defpackage.aymp
    @dzsi
    public cqkp r() {
        baab baabVar = baab.FAVORITES;
        baaj baajVar = baaj.PLACE;
        int ordinal = this.n.x().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.F;
            }
            return null;
        }
        bnju x = x();
        if (x == null) {
            return null;
        }
        ayqd a2 = this.J.a(x.aK(), new Runnable(this) { // from class: aynv
            private final ayoi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, z() ? dtxy.el : dtxy.eu);
        a2.c(v());
        return a2;
    }

    @Override // defpackage.aymp
    @dzsi
    public aymy s() {
        bnju x = x();
        if (!this.C.c() || x == null || this.F != null) {
            return null;
        }
        return this.K.a(x.aK(), new Runnable(this) { // from class: aynu
            private final ayoi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        }, z() ? dtxy.el : dtxy.eu, this);
    }

    @Override // defpackage.aymp
    @dzsi
    public aymx t() {
        if (this.C.c()) {
            return this.G;
        }
        return null;
    }

    @Override // defpackage.aymp
    public ilo u() {
        return batz.b(this.n);
    }

    @Override // defpackage.aymp
    @dzsi
    public izx v() {
        if (I(this.n)) {
            return null;
        }
        return this.p.a(this.n, this.o).a(this.d);
    }

    @Override // defpackage.aymp
    public View.OnAttachStateChangeListener w() {
        return aybb.a(this.B.a(), u());
    }

    @dzsi
    public bnju x() {
        bnju bnjuVar;
        bnju bnjuVar2 = this.o;
        docg docgVar = null;
        if (bnjuVar2 == null) {
            return null;
        }
        bnjs aK = bnjuVar2.aK();
        begh beghVar = new begh();
        docg E = this.n.D() ? this.n.E() : null;
        if (E == null && (bnjuVar = this.o) != null) {
            E = bnjuVar.aF();
        }
        if (E != null && !dbra.b.s(E.r).isEmpty()) {
            docgVar = E;
        }
        if (docgVar != null || i().length() > 0) {
            beghVar.d = true;
        }
        aK.b(true);
        baad b2 = this.n.b();
        if (b2 != null && b2.W()) {
            beghVar.f = C(this.n.o());
        }
        dwfl j = this.n.j();
        if (j != null) {
            aK.p = j;
        }
        bfkm bfkmVar = this.M;
        if (bfkmVar != null) {
            aK.r = bfkmVar;
        }
        if (z()) {
            beghVar.e = true;
        }
        if (beghVar.d || beghVar.f > 0 || beghVar.e) {
            aK.o = beghVar;
        }
        return aK.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(baal baalVar) {
        this.n = baalVar;
        baab baabVar = baab.FAVORITES;
        baaj baajVar = baaj.PLACE;
        int ordinal = baalVar.x().ordinal();
        if (ordinal == 0) {
            bnju bnjuVar = this.o;
            if (bnjuVar == null || bnjuVar.aD().booleanValue() == baalVar.e()) {
                return;
            }
            bnjs aK = this.o.aK();
            aK.j = baalVar.e();
            aK.k = baalVar.g();
            this.o = aK.a();
        } else if (ordinal != 1) {
        } else {
            aydo aydoVar = this.I;
            dqhy dqhyVar = dqhy.OK;
            ddho G = G(baalVar);
            dbsk.s(G);
            this.F = aydoVar.a(baalVar, dqhyVar, true, false, G);
            ayra ayraVar = this.L;
            dqhy dqhyVar2 = dqhy.OK;
            ddho G2 = G(baalVar);
            dbsk.s(G2);
            this.G = ayraVar.b(baalVar, dqhyVar2, G2);
        }
    }

    final boolean z() {
        return H(this.n) && !I(this.n);
    }
}
