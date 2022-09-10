package defpackage;

import android.content.Context;
import android.text.BidiFormatter;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kht  reason: default package */
/* loaded from: classes7.dex */
public final class kht extends nos {
    private final btrm A;
    private final dehq B;
    private final bvrb C;
    private final crzm<Boolean> D;
    private final khs E;
    private final klj F;
    private final crzp<Boolean> G;
    private final jty H;
    private final khn I;
    public final Context a;
    public final nov b;
    public final kcv c;
    public final btvo d;
    public final klk e;
    public final kdi f;
    public final nop g;
    public final noo h;
    public final khx i;
    public final akfa j;
    public final cqkf<klc> k;
    public dcdc<klg> l;
    public final cov m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    @dzsi
    public btlu r;
    public final crzp<btlu> s;
    private final ntc t;
    private final khe u;
    private final nop v;
    @dzsi
    private final cjsz w;
    private final not x;
    private final kdg y;
    private final btpc z;

    public kht(Context context, nov novVar, kcv kcvVar, btvo btvoVar, crzm crzmVar, ntc ntcVar, khe kheVar, jty jtyVar, kdi kdiVar, nop nopVar, nop nopVar2, noo nooVar, khx khxVar, not notVar, kdg kdgVar, btpc btpcVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, akfa akfaVar, dehq dehqVar, bvrb bvrbVar, btrm btrmVar) {
        super(cjqyVar, cjqqVar);
        ddho ddhoVar;
        this.l = dcdc.e();
        this.n = false;
        this.o = false;
        this.q = 0;
        this.s = new khm(this);
        this.E = new khs(this);
        this.I = new khn(this);
        khq khqVar = new khq(this);
        this.F = khqVar;
        this.G = new khr(this);
        this.a = context;
        this.b = novVar;
        this.d = btvoVar;
        this.D = crzmVar;
        this.t = ntcVar;
        this.u = kheVar;
        this.H = jtyVar;
        this.f = kdiVar;
        this.g = nopVar;
        this.v = nopVar2;
        this.h = nooVar;
        this.i = khxVar;
        this.x = notVar;
        this.c = kcvVar;
        this.y = kdgVar;
        this.z = btpcVar;
        this.j = akfaVar;
        this.B = dehqVar;
        this.C = bvrbVar;
        this.A = btrmVar;
        if (khxVar == khx.CUSTOM_PLACES) {
            this.w = null;
        } else {
            int ordinal = khxVar.ordinal();
            if (ordinal == 0) {
                ddhoVar = dtxm.Q;
            } else if (ordinal == 1) {
                ddhoVar = dtxm.ap;
            } else if (ordinal == 2) {
                ddhoVar = dtxm.ah;
            } else if (ordinal == 3) {
                ddhoVar = dtxm.Y;
            } else if (ordinal == 4) {
                ddhoVar = dtxm.A;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(khxVar.name());
                throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal category type: ".concat(valueOf) : new String("Unexpected personal category type: "));
            } else {
                ddhoVar = dtxm.I;
            }
            this.w = new cjsz(ddhoVar);
        }
        cqkf<klc> d = cqkjVar.d(new kjz(), ((npb) notVar).b, false);
        this.k = d;
        this.e = new klk(context, khqVar, khxVar);
        this.m = (cov) d.c().findViewById(kjz.b);
    }

    private final int q() {
        if (this.o) {
            return this.p;
        }
        dukx dukxVar = this.d.getCarParameters().e;
        if (dukxVar == null) {
            dukxVar = dukx.c;
        }
        return dukxVar.a;
    }

    @dzsi
    private static ddho r(khx khxVar, boolean z) {
        khx khxVar2 = khx.FAVORITE_PLACES;
        int ordinal = khxVar.ordinal();
        if (ordinal == 0) {
            return z ? dtxm.P : dtxm.O;
        } else if (ordinal == 1) {
            return z ? dtxm.ao : dtxm.an;
        } else if (ordinal == 2) {
            return z ? dtxm.ag : dtxm.af;
        } else if (ordinal == 3) {
            return z ? dtxm.X : dtxm.W;
        } else if (ordinal == 4) {
            return z ? dtxm.z : dtxm.y;
        } else if (ordinal == 5) {
            return z ? dtxm.H : dtxm.G;
        } else {
            String valueOf = String.valueOf(khxVar.name());
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected personal category type: ".concat(valueOf) : new String("Unexpected personal category type: "));
        }
    }

    @Override // defpackage.non
    public final noq b() {
        this.c.i(this);
        this.e.k(!this.c.p());
        this.H.setKeyInterceptor(new kdh(this) { // from class: khk
            private final kht a;

            {
                this.a = this;
            }

            @Override // defpackage.kdh
            public final boolean a(KeyEvent keyEvent) {
                kht khtVar = this.a;
                if (keyEvent.getAction() == 1 && khtVar.e.g().booleanValue() && keyEvent.getKeyCode() == 19) {
                    nol.b(khtVar.k.c().findViewById(kjz.a));
                    return true;
                }
                return false;
            }
        });
        this.y.d(this);
        cjsz cjszVar = this.w;
        if (cjszVar != null) {
            s(cjszVar);
        }
        btrm btrmVar = this.A;
        khs khsVar = this.E;
        dceq a = dcet.a();
        a.b(azrb.class, new khv(0, azrb.class, khsVar, bvrj.UI_THREAD));
        a.b(azrf.class, new khv(1, azrf.class, khsVar, bvrj.UI_THREAD));
        btrmVar.g(khsVar, a.a());
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.k.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        t();
        this.c.h(this);
        this.H.a();
        this.y.e(this);
        this.A.a(this.E);
    }

    @Override // defpackage.non
    public final String g() {
        return "DestinationInputPersonalPlacesOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.x.b(noeVar, this.k.c());
    }

    @Override // defpackage.nos
    public final void k() {
        this.k.e(this.e);
        this.m.a.setClipChildren(false);
        this.m.setAdapter(this.t);
        this.D.d(this.G, this.B);
        if (this.o) {
            dukx dukxVar = this.d.getCarParameters().e;
            if (dukxVar == null) {
                dukxVar = dukx.c;
            }
            this.p = dukxVar.b - 8;
        } else {
            dukx dukxVar2 = this.d.getCarParameters().e;
            if (dukxVar2 == null) {
                dukxVar2 = dukx.c;
            }
            this.p = dukxVar2.b;
        }
        this.r = this.j.j();
        this.j.C().d(this.s, this.B);
        m();
    }

    @Override // defpackage.nos
    public final void l() {
        this.D.c(this.G);
        mgm mgmVar = this.u.h;
        brln brlnVar = mgmVar.c;
        if (brlnVar != null) {
            mgmVar.b.b(brlnVar);
        }
        this.k.e(null);
        this.C.b(new Runnable(this) { // from class: khl
            private final kht a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                kht khtVar = this.a;
                khtVar.j.C().c(khtVar.s);
            }
        }, bvrj.UI_THREAD);
    }

    public final void m() {
        dcdc e;
        dcdc<klg> f;
        int i;
        dcdc<klg> f2;
        khx khxVar = khx.FAVORITE_PLACES;
        int ordinal = this.i.ordinal();
        if (ordinal == 0) {
            this.u.e(new mgn(this) { // from class: khi
                private final kht a;

                {
                    this.a = this;
                }

                @Override // defpackage.mgn
                public final void a(ldm ldmVar) {
                    this.a.n(ldmVar);
                }
            }, this.I, khx.FAVORITE_PLACES);
        } else if (ordinal == 1) {
            this.u.e(new mgn(this) { // from class: khj
                private final kht a;

                {
                    this.a = this;
                }

                @Override // defpackage.mgn
                public final void a(ldm ldmVar) {
                    this.a.n(ldmVar);
                }
            }, this.I, khx.WANT_TO_GO_PLACES);
        } else {
            Context context = null;
            azva azvaVar = null;
            int i2 = 0;
            if (ordinal == 2) {
                khe kheVar = this.u;
                mgn mgnVar = new mgn(this) { // from class: khg
                    private final kht a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mgn
                    public final void a(ldm ldmVar) {
                        this.a.n(ldmVar);
                    }
                };
                dccx F = dcdc.F();
                if (!kheVar.b) {
                    f = F.f();
                } else {
                    GmmLocation a = kheVar.d.a();
                    try {
                        e = kheVar.e.g(azxm.e);
                    } catch (axxc unused) {
                        e = dcdc.e();
                    }
                    int size = e.size();
                    int i3 = 0;
                    while (i2 < size) {
                        azxk azxkVar = (azxk) e.get(i2);
                        if (a == null || mgo.a(a, azxkVar.d())) {
                            boolean d = akqi.d(azxkVar.b());
                            amvg P = amvh.P();
                            P.c = azxkVar.b();
                            P.d = azxkVar.d();
                            P.k = d;
                            P.b = azxkVar.e(context);
                            F.g(new kli(kheVar.a, azxkVar.e(context), azxkVar.c(), new ldm(P.a(), azxkVar.e(context), azxkVar.e(context), azxkVar.c()), nqu.Z(), nqu.aa(), null, kheVar.b(mgnVar, ckee.Q), i3, dtxm.ai, dtxm.ac));
                            i3++;
                        }
                        i2++;
                        context = null;
                    }
                    ((ckco) kheVar.c.a(ckee.F)).a(i3);
                    f = F.f();
                }
                o(f);
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    return;
                }
                final khe kheVar2 = this.u;
                final mgn mgnVar2 = new mgn(this) { // from class: khh
                    private final kht a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mgn
                    public final void a(ldm ldmVar) {
                        this.a.n(ldmVar);
                    }
                };
                final khn khnVar = this.I;
                if (!kheVar2.b) {
                    return;
                }
                final GmmLocation a2 = kheVar2.d.a();
                final ddho ddhoVar = dtxm.v;
                final BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                kheVar2.e.x().b(new axwa(kheVar2, a2, bidiFormatter, mgnVar2, ddhoVar, khnVar) { // from class: kgy
                    private final khe a;
                    private final GmmLocation b;
                    private final BidiFormatter c;
                    private final mgn d;
                    private final ddho e;
                    private final khn f;

                    {
                        this.a = kheVar2;
                        this.b = a2;
                        this.c = bidiFormatter;
                        this.d = mgnVar2;
                        this.e = ddhoVar;
                        this.f = khnVar;
                    }

                    @Override // defpackage.axwa
                    public final void a(List list) {
                        String string;
                        khe kheVar3 = this.a;
                        GmmLocation gmmLocation = this.b;
                        BidiFormatter bidiFormatter2 = this.c;
                        mgn mgnVar3 = this.d;
                        ddho ddhoVar2 = this.e;
                        khn khnVar2 = this.f;
                        dccx F2 = dcdc.F();
                        Iterator it = list.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            azvo azvoVar = (azvo) it.next();
                            if (gmmLocation == null || mgo.a(gmmLocation, azvoVar.d())) {
                                String o = azvoVar.o(kheVar3.a);
                                if (o.isEmpty()) {
                                    string = azvoVar.e(kheVar3.a);
                                } else {
                                    Context context2 = kheVar3.a;
                                    string = context2.getString(R.string.TITLE_FOR_ONE_CONTACT, bidiFormatter2.unicodeWrap(azvoVar.e(context2)), bidiFormatter2.unicodeWrap(o));
                                }
                                String str = string;
                                amvg P2 = amvh.P();
                                P2.a = dpjs.ENTITY_TYPE_CONTACT;
                                P2.c = azvoVar.b();
                                P2.d = azvoVar.d();
                                P2.j = str;
                                P2.k = true;
                                dccx dccxVar = F2;
                                dccxVar.g(new kli(kheVar3.a, str, azvoVar.c(), new ldm(P2.a(), azvoVar.c(), str, azvoVar.c()), azvoVar.n(), null, kheVar3.b(mgnVar3, ckee.U), i4, dtxm.B, ddhoVar2));
                                F2 = dccxVar;
                                i4++;
                                khnVar2 = khnVar2;
                            }
                        }
                        ((ckco) kheVar3.c.a(ckee.E)).a(i4);
                        khnVar2.a(F2.f());
                    }
                });
            } else {
                khe kheVar3 = this.u;
                mgn mgnVar3 = new mgn(this) { // from class: khf
                    private final kht a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.mgn
                    public final void a(ldm ldmVar) {
                        this.a.n(ldmVar);
                    }
                };
                dccx F2 = dcdc.F();
                if (!kheVar3.b) {
                    f2 = F2.f();
                } else {
                    GmmLocation a3 = kheVar3.d.a();
                    dcdc<azva> n = kheVar3.e.n();
                    int size2 = n.size();
                    azva azvaVar2 = null;
                    for (int i4 = 0; i4 < size2; i4++) {
                        azva azvaVar3 = n.get(i4);
                        dndr dndrVar = azvaVar3.a;
                        if (dndrVar.equals(dndr.HOME)) {
                            azvaVar = azvaVar3;
                        } else if (dndrVar.equals(dndr.WORK)) {
                            azvaVar2 = azvaVar3;
                        }
                    }
                    kheVar3.i = kheVar3.b(mgnVar3, ckee.T);
                    if (azvaVar != null) {
                        ldm g = ldm.g(azvaVar, azvaVar.e(kheVar3.a));
                        Context context2 = kheVar3.a;
                        String string = context2.getString(R.string.HOME_LOCATION);
                        String str = azvaVar.d;
                        cqtd c = khe.c(azvaVar.a);
                        cqtd d2 = khe.d(azvaVar.a);
                        klr klrVar = kheVar3.i;
                        dbsk.s(klrVar);
                        F2.g(new kli(context2, string, str, g, c, d2, null, klrVar, 0, dtxm.Z, dtxm.T));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (azvaVar2 != null) {
                        ldm g2 = ldm.g(azvaVar2, azvaVar2.e(kheVar3.a));
                        Context context3 = kheVar3.a;
                        String string2 = context3.getString(R.string.WORK_LOCATION);
                        String str2 = azvaVar2.d;
                        cqtd c2 = khe.c(azvaVar2.a);
                        cqtd d3 = khe.d(azvaVar2.a);
                        klr klrVar2 = kheVar3.i;
                        dbsk.s(klrVar2);
                        F2.g(new kli(context3, string2, str2, g2, c2, d3, null, klrVar2, i, dtxm.Z, dtxm.T));
                        i++;
                    }
                    int size3 = n.size();
                    int i5 = i;
                    for (int i6 = 0; i6 < size3; i6++) {
                        azva azvaVar4 = n.get(i6);
                        dndr dndrVar2 = azvaVar4.a;
                        akqq akqqVar = azvaVar4.e;
                        if (dndrVar2.equals(dndr.NICKNAME) && akqqVar != null && (a3 == null || mgo.a(a3, akqqVar))) {
                            String e2 = azvaVar4.e(kheVar3.a);
                            ldm g3 = ldm.g(azvaVar4, e2);
                            Context context4 = kheVar3.a;
                            if (e2 == null) {
                                e2 = azvaVar4.d;
                            }
                            String str3 = e2;
                            String str4 = azvaVar4.d;
                            cqtd W = nqu.W();
                            cqtd X = nqu.X();
                            klr klrVar3 = kheVar3.i;
                            dbsk.s(klrVar3);
                            F2.g(new kli(context4, str3, str4, g3, W, X, null, klrVar3, i5, dtxm.Z, dtxm.T));
                            i5++;
                        }
                    }
                    ((ckco) kheVar3.c.a(ckee.D)).a((i5 - (azvaVar == null ? 1 : 0)) - (azvaVar2 == null ? 1 : 0));
                    f2 = F2.f();
                }
                o(f2);
            }
        }
    }

    public final void n(ldm ldmVar) {
        this.b.a();
        this.v.k(this.f.c(ldmVar, null, null, kdk.NOTHING, mnz.SHORTCUT_PERSONAL_PLACES, false, true, dcdc.e(), new cjsz(dtxm.cJ), this.x, this.v));
        this.b.b();
    }

    public final void o(dcdc<klg> dcdcVar) {
        this.l = dcdcVar;
        if (dcdcVar.isEmpty()) {
            if (!this.z.i()) {
                if (this.i == khx.CONTACTS) {
                    this.e.m(this.a.getString(R.string.CAR_UNABLE_TO_RETRIEVE_CONTACTS));
                    return;
                } else {
                    this.e.m(this.a.getString(R.string.CAR_UNABLE_TO_RETRIEVE_PLACES));
                    return;
                }
            } else if (this.i == khx.CONTACTS) {
                this.e.m(this.a.getString(R.string.CAR_NO_CONTACTS_FOUND));
                return;
            } else {
                this.e.m(this.a.getString(R.string.CAR_NO_PLACES_FOUND));
                return;
            }
        }
        int q = q();
        if (q < dcdcVar.size()) {
            this.t.z(new kkp(), dcdcVar.subList(0, q));
            if (this.o) {
                this.t.A(new jyh(), new jyy(this.a.getString(R.string.CAR_LIST_LOCKOUT), r(this.i, false), q));
            }
            this.t.s();
        } else {
            this.t.b(new kkp(), dcdcVar);
        }
        this.e.l();
        cov covVar = this.m;
        covVar.b.g = true;
        covVar.a(0);
    }

    public final void p(int i) {
        int q = q() / 2;
        int max = Math.max(i - q, 0);
        int min = Math.min(q + i, this.l.size());
        dcdc<klg> subList = this.l.subList(max, min);
        for (int i2 = 0; i2 < subList.size(); i2++) {
            ((kli) subList.get(i2)).l(i2);
        }
        if (this.o) {
            this.t.B();
            if (max > 0) {
                int i3 = max - 1;
                this.t.A(new jyh(), new jyy(this.a.getString(R.string.CAR_LIST_LOCKOUT), r(this.i, true), i3));
                this.q = i3;
            } else {
                this.q = max;
            }
            this.t.z(new kkp(), subList);
            if (min < this.l.size()) {
                this.t.A(new jyh(), new jyy(this.a.getString(R.string.CAR_LIST_LOCKOUT), r(this.i, false), min));
            }
            this.t.s();
        } else {
            this.t.b(new kkp(), subList);
            this.q = max;
        }
        int i4 = this.q;
        cov covVar = this.m;
        covVar.b.g = true;
        covVar.a(i - i4);
    }
}
