package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayen  reason: default package */
/* loaded from: classes3.dex */
public final class ayen extends ges implements egq {
    public gga a;
    @dzsi
    public ayno aA;
    @dzsi
    public jjn aB;
    public ayet aC;
    ayej aO;
    ayel aP;
    @dzsi
    public ayfn aQ;
    @dzsi
    public ayex aR;
    @dzsi
    public ayez aS;
    public boolean aT;
    @dzsi
    private bwrs<baal> aU;
    @dzsi
    private aymm aV;
    private cqkf<aymn> aW;
    private cqkf<aymm> aX;
    private cqkf<aymt> aY;
    public aypy ad;
    public axwq ae;
    public bvrb af;
    public aynm ag;
    public aynp ah;
    public dzsj<ayet> ai;
    public dzsj<ayqy> aj;
    public ayey ak;
    public jkf al;
    public ayfa am;
    public angp an;
    public dzsj<ayfn> ao;
    public batm ap;
    public aybl aq;
    public axwg ar;
    public axwi as;
    public dxio<azfb> at;
    public axwo au;
    public dxio<axwy> av;
    public axyz aw;
    public dehq ax;
    @dzsi
    public bwrs<baad> ay;
    @dzsi
    public aymt az;
    public btrm b;
    private axyy ba;
    @dzsi
    private bwrr<baad> bb;
    @dzsi
    private gek bc;
    @dzsi
    private ayek bd;
    @dzsi
    private ddho be;
    @dzsi
    private int bg;
    public bwqv c;
    public cjqy d;
    public cjqq e;
    public efg f;
    public cqkj g;
    private final ayeg aZ = new ayeg(this);
    private int bf = 1;

    public static ayen aU(bwqv bwqvVar, bwrs<baad> bwrsVar, boolean z, @dzsi ddho ddhoVar, @dzsi int i) {
        ayen ayenVar = new ayen();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "arg_local_list", bwrsVar);
        bundle.putBoolean("is_starred_places_list", false);
        bundle.putString("arg_action_on_start", true != z ? "NONE" : "OPEN_SHARE_SHEET");
        if (ddhoVar != null) {
            bundle.putInt("arg_ve_type_key", ((dtxi) ddhoVar).a);
        }
        if (i != 0) {
            bundle.putInt("arg_list_entrypoint", i - 1);
        }
        ayenVar.B(bundle);
        return ayenVar;
    }

    private final void aV(boolean z) {
        baad aR = aR();
        if (aR != null && aR.C()) {
            if (z) {
                final azfb a = this.at.a();
                final dpov n = aR.n();
                dpov dpovVar = a.d;
                if (!azfb.c(n, dpovVar) && dpovVar != null) {
                    a.a(dpovVar);
                }
                a.d = n;
                final String o = a.b.o();
                a.c.b(new Runnable(a, o, n) { // from class: azey
                    private final azfb a;
                    private final String b;
                    private final dpov c;

                    {
                        this.a = a;
                        this.b = o;
                        this.c = n;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        azfb azfbVar = this.a;
                        String str = this.b;
                        dpov dpovVar2 = this.c;
                        if (str == null) {
                            return;
                        }
                        azfbVar.a.a(str, dcdc.f(dpovVar2.b));
                    }
                }, bvrj.BACKGROUND_THREADPOOL);
                return;
            }
            this.at.a().a(aR.n());
        }
    }

    private final void aX() {
        cjmu cjmuVar;
        jkc jkcVar;
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.at(null);
        egjVar.w(null);
        if (aT()) {
            cjmuVar = cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE;
        } else {
            cjmuVar = cjmu.TRANSLUCENT_DARK_BG_WHITE_ICONS;
        }
        egjVar.aq(cjmuVar);
        cqkf<aymn> cqkfVar = this.aW;
        egjVar.G(cqkfVar == null ? null : cqkfVar.c(), 5);
        egjVar.Y(aT() && btpf.c(this.a).f);
        egjVar.s(this.bd);
        jjn jjnVar = this.aB;
        dbsk.s(jjnVar);
        egjVar.ai(jjnVar);
        if (aT()) {
            jkcVar = jkc.d;
        } else {
            jkcVar = jkc.m;
        }
        egjVar.ak(jkcVar, aT() ? jkc.d : jkc.m);
        egf h = egf.h();
        h.l(false);
        h.h = ardz.MAP;
        h.B = true;
        h.s = true;
        egjVar.A(h);
        egjVar.D(0);
        egjVar.t(this.aP);
        egjVar.J(this);
        egjVar.e(this);
        egjVar.B(true);
        cqkf<aymm> cqkfVar2 = this.aX;
        View c = cqkfVar2 == null ? null : cqkfVar2.c();
        if (c != null) {
            egjVar.aw(c, false);
            if (this.ar.c()) {
                egjVar.a.Q = new ayeh(this);
            }
        } else {
            egjVar.av(null);
        }
        this.f.a(egjVar.a());
    }

    public static ayen g() {
        ayen ayenVar = new ayen();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_starred_places_list", true);
        bundle.putString("arg_action_on_start", "NONE");
        ayenVar.B(bundle);
        return ayenVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        super.Qd();
        baad aR = aR();
        if (aR != null) {
            this.b.b(azrb.b(6, aR));
        } else if (!this.aT) {
        } else {
            this.b.b(azrb.c(6));
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<aymt> cqkfVar = this.aY;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        cqkf<aymn> cqkfVar2 = this.aW;
        dbsk.s(cqkfVar2);
        cqkfVar2.e(null);
        cqkf<aymm> cqkfVar3 = this.aX;
        dbsk.s(cqkfVar3);
        cqkfVar3.e(null);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        aymt aymtVar;
        if (!(obj instanceof bdhk) || (aymtVar = this.az) == null) {
            return;
        }
        aymtVar.r((bdhk) obj);
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        if (!this.aD) {
            return;
        }
        w();
        ayet ayetVar = this.aC;
        jjn jjnVar = this.aB;
        dbsk.s(jjnVar);
        ayetVar.b(jjnVar);
        ayez ayezVar = this.aS;
        if (ayezVar != null) {
            jjn jjnVar2 = this.aB;
            dbsk.s(jjnVar2);
            ayezVar.P(ayezVar.a.l(), jjnVar2, 0.0f);
        }
        ayex ayexVar = this.aR;
        if (ayexVar != null) {
            jjn jjnVar3 = this.aB;
            dbsk.s(jjnVar3);
            ayexVar.a(jjnVar3);
        }
        ayfn ayfnVar = this.aQ;
        if (ayfnVar != null) {
            ayfnVar.Qs(eguVar);
        }
        jjn jjnVar4 = this.aB;
        dbsk.s(jjnVar4);
        i(jjnVar4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        ayno aynoVar = this.aA;
        if (aynoVar != null) {
            aymt aymtVar = this.az;
            dbsk.s(aymtVar);
            aynoVar.e(aymtVar.d().intValue());
            cqkx.p(this.aA);
        }
    }

    @dzsi
    public final baad aR() {
        bwrs<baad> bwrsVar = this.ay;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    public final void aS() {
        if (this.aD) {
            aymm aymmVar = this.aV;
            dbsk.s(aymmVar);
            aymmVar.c(Boolean.valueOf(this.aB != jjn.HIDDEN));
            aymm aymmVar2 = this.aV;
            dbsk.s(aymmVar2);
            cqkx.p(aymmVar2);
        }
    }

    public final boolean aT() {
        return this.aQ != null && ayfn.h(this.aB);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<aymn> c = this.g.c(new aygw(), null);
        this.aW = c;
        c.e(this.aA);
        ayey ayeyVar = this.ak;
        cqkf<aymn> cqkfVar = this.aW;
        gga a = ayeyVar.a.a();
        ayey.a(a, 1);
        ayey.a(ayeyVar.b.a(), 2);
        cjmt a2 = ayeyVar.c.a();
        ayey.a(a2, 3);
        ayey.a(cqkfVar, 4);
        this.aR = new ayex(a, a2, cqkfVar);
        cqkf<aymt> c2 = this.g.c(new ayio(), null);
        this.aY = c2;
        c2.e(this.az);
        cqkf<aymm> c3 = this.g.c(new aygu(), null);
        this.aX = c3;
        c3.e(this.aV);
        cqkf<aymt> cqkfVar2 = this.aY;
        dbsk.s(cqkfVar2);
        View c4 = cqkfVar2.c();
        ayek ayekVar = new ayek(H());
        this.bd = ayekVar;
        ayekVar.setShouldUseRoundedCornersShadow(false);
        this.bd.setContent(c4);
        ayfa ayfaVar = this.am;
        aymt aymtVar = this.az;
        dbsk.s(aymtVar);
        bfkk o = aymtVar.o();
        dbsk.s(o);
        Activity activity = (Activity) ((dxjd) ayfaVar.a).a;
        ayfa.a(activity, 1);
        jkf a3 = ayfaVar.b.a();
        ayfa.a(a3, 2);
        ayfa.a(o, 3);
        ayfa.a(c4, 4);
        this.aS = new ayez(activity, a3, o, c4);
        return c4;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        ayeg ayegVar;
        aymt aymtVar;
        this.b.a(this.aO);
        baad aR = aR();
        if (aR != null && (aymtVar = this.az) != null) {
            aymtVar.m();
        }
        if (aR != null && this.bb != null) {
            bwrs<baad> bwrsVar = this.ay;
            dbsk.s(bwrsVar);
            bwqv.t(bwrsVar, this.bb);
        }
        angp angpVar = this.an;
        if (angpVar != null && (ayegVar = this.aZ) != null) {
            angpVar.b(ayegVar);
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        ayno aynoVar = this.aA;
        return aynoVar != null && aynoVar.f();
    }

    public final void i(jjn jjnVar) {
        boolean z = jjnVar == jjn.HIDDEN;
        aymt aymtVar = this.az;
        ViewGroup viewGroup = null;
        Iterable<View> n = aymtVar == null ? null : cqkx.n(aymtVar);
        if (n != null) {
            Iterator<View> it = n.iterator();
            while (true) {
                if (it.hasNext()) {
                    View a = cqhu.a(it.next(), ayio.a);
                    if (a != null) {
                        viewGroup = (ViewGroup) a;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (viewGroup != null) {
            viewGroup.setClipChildren(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c7 A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f9 A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0333 A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0348 A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362 A[Catch: IOException -> 0x0399, TryCatch #0 {IOException -> 0x0399, blocks: (B:15:0x0119, B:21:0x017d, B:24:0x0192, B:51:0x01d7, B:47:0x01ce, B:48:0x01d3, B:52:0x01d9, B:54:0x0253, B:58:0x026c, B:60:0x027d, B:63:0x0282, B:65:0x02a1, B:67:0x02a9, B:70:0x02af, B:72:0x02b3, B:75:0x02bf, B:76:0x02c1, B:78:0x02c7, B:83:0x02db, B:85:0x02f9, B:86:0x02fe, B:88:0x0333, B:90:0x0339, B:96:0x034b, B:98:0x0362, B:99:0x0367, B:91:0x033c, B:93:0x0342, B:94:0x0345, B:95:0x0348, B:79:0x02ca, B:81:0x02d2, B:82:0x02d5, B:55:0x025e, B:57:0x0262, B:18:0x0151, B:20:0x015d), top: B:109:0x0037 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayen.l(android.os.Bundle):void");
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayex ayexVar = this.aR;
        if (ayexVar != null) {
            ayexVar.b();
        }
        aX();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ej;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        dbsk.l(this.aT);
        this.af.b(new Runnable(this) { // from class: ayea
            private final ayen a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final ayen ayenVar = this.a;
                final dcdc e = dcdc.e();
                try {
                    e = ayenVar.ae.g(azxm.e);
                } catch (axxc unused) {
                }
                ayenVar.af.b(new Runnable(ayenVar, e) { // from class: ayec
                    private final ayen a;
                    private final List b;

                    {
                        this.a = ayenVar;
                        this.b = e;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ayen ayenVar2 = this.a;
                        List<azxk> list = this.b;
                        aymt aymtVar = ayenVar2.az;
                        dbsk.s(aymtVar);
                        ((ayqy) aymtVar).v(list);
                        ayet ayetVar = ayenVar2.aC;
                        ayetVar.b.clear();
                        ayetVar.b.addAll(list);
                        ayetVar.a = null;
                        ayetVar.d = null;
                        ayetVar.c();
                        ayenVar2.aJ();
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ar.c();
        jjn jjnVar = jjn.EXPANDED;
        gek gekVar = this.bc;
        dbsk.s(gekVar);
        this.aB = gekVar.a(jjnVar);
        aS();
        aX();
        aJ();
        aV(true);
        if (this.ba == null) {
            this.ba = new ayee(this);
        }
        baad aR = aR();
        if (aR != null) {
            this.aw.a(this.ba, aR.n());
        }
        int i = this.bf;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                axwo axwoVar = this.au;
                baad aR2 = aR();
                dbsk.s(aR2);
                ddho ddhoVar = this.be;
                dbsk.s(ddhoVar);
                axwoVar.l(aR2, ddhoVar);
            } else if (i2 == 2) {
                this.ap.b(new Runnable(this) { // from class: ayeb
                    private final ayen a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aymt aymtVar = this.a.az;
                        dbsk.s(aymtVar);
                        aymtVar.q().o();
                    }
                });
            }
            this.bf = 1;
            return;
        }
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putBoolean("is_starred_places_list", this.aT);
        int i = this.bf;
        String a = axwl.a(i);
        if (i != 0) {
            bundle.putString("arg_action_on_start", a);
            if (aR() == null) {
                return;
            }
            this.c.c(bundle, "arg_local_list", this.ay);
            return;
        }
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        axyy axyyVar;
        super.u();
        aV(false);
        baad aR = aR();
        if (aR == null || (axyyVar = this.ba) == null) {
            return;
        }
        this.aw.b(axyyVar, aR.n());
    }

    public final void w() {
        ViewGroup viewGroup = (ViewGroup) J().findViewById(R.id.header_container);
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(0);
        }
    }
}
