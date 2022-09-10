package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.maps.R;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: brhd  reason: default package */
/* loaded from: classes.dex */
public class brhd extends afho {
    private static final dcqe a = dcqe.c("brhd");
    private static final Pattern[] i = {Pattern.compile("com\\.android\\.(.*)"), Pattern.compile("com\\.chrome\\.(.*)"), Pattern.compile("com\\.google\\.(.*)"), Pattern.compile("com\\.htc\\.contacts"), Pattern.compile("com\\.htc\\.sense\\.browser"), Pattern.compile("com\\.htc\\.sense\\.mms"), Pattern.compile("com\\.opera\\.browser"), Pattern.compile("com\\.samsung\\.android\\.email\\.ui"), Pattern.compile("com\\.sec\\.android\\.app\\.sbrowser"), Pattern.compile("com\\.sonyericsson\\.android\\.socialphonebook")};
    public static final dbsl<afga> j = brhc.a;
    private final gga k;
    private final cjqy l;
    private final asik m;
    private final dxio<ckcw> n;
    private final dxio<begg> o;
    private final asim p;
    private final dxio<brba> q;
    private final dxio<ascb> r;
    private final dxio<ahjq> s;
    private final akpm t;
    private final afhj u;
    private final cklq v;

    public brhd(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, eeu eeuVar, cjqy cjqyVar, asik asikVar, dxio<ckcw> dxioVar, dxio<begg> dxioVar2, asim asimVar, dxio<brba> dxioVar3, dxio<ascb> dxioVar4, dxio<ahjq> dxioVar5, akpm akpmVar, dxio<afwr> dxioVar6, afhj afhjVar, cklq cklqVar) {
        super(intent, str, afid.SEARCH_ACTION, ggaVar, eeuVar, afihVar, afheVar, dxioVar6);
        this.k = ggaVar;
        this.l = cjqyVar;
        this.m = asikVar;
        this.n = dxioVar;
        this.o = dxioVar2;
        this.p = asimVar;
        this.q = dxioVar3;
        this.r = dxioVar4;
        this.s = dxioVar5;
        this.t = akpmVar;
        this.u = afhjVar;
        this.v = cklqVar;
    }

    private static String i(@dzsi String str) {
        if (dbsj.d(str)) {
            return "";
        }
        String[] split = str.split("//");
        return split.length == 2 ? split[1] : str;
    }

    @Override // defpackage.afho
    public final void e(afia afiaVar, String str) {
        if (dbsj.d(afiaVar.b)) {
            bvoo.h("An intent with empty query should not handled as SEARCH or SEARCH_LIST. See isValidIntentAction() for more details.", new Object[0]);
        } else if (!this.m.a()) {
            this.v.a(ckls.EXTERNAL_INTENT);
            this.u.a(afiaVar);
            iqy iqyVar = new iqy();
            if (afhi.n(afiaVar)) {
                iqyVar.p = 4;
            }
            akqq b = afhi.b(afiaVar.b);
            String str2 = null;
            if (!dbsj.d(afiaVar.c)) {
                iqyVar.i = true;
                String str3 = afiaVar.c;
                dbsk.s(str3);
                iqyVar.a = str3;
                String str4 = afiaVar.F;
                if (!dbsj.d(str4)) {
                    String i2 = i(str4);
                    Pattern[] patternArr = i;
                    int length = patternArr.length;
                    for (int i3 = 0; i3 < 10; i3++) {
                        if (patternArr[i3].matcher(i2).matches()) {
                            break;
                        }
                    }
                }
                gga ggaVar = this.k;
                String str5 = afiaVar.F;
                String string = ggaVar.getString(R.string.DEFAULT_APPLICATION_LABEL);
                if (!dbsj.d(str5)) {
                    PackageManager packageManager = ggaVar.getPackageManager();
                    try {
                        str2 = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(i(str5), 0));
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!dbsj.d(str2)) {
                        string = str2;
                    }
                }
                iqyVar.b = this.k.getString(R.string.PROVIDED_BY, new Object[]{string});
            } else if (b != null) {
                String str6 = afiaVar.F;
                ily ilyVar = new ily();
                ilyVar.q(b);
                ilyVar.f = false;
                ilyVar.g = true;
                ilyVar.n = true;
                ilo d = ilyVar.d();
                begj begjVar = new begj();
                begjVar.b(d);
                begjVar.l = dtxy.iH;
                this.o.a().o(begjVar, false, null);
                return;
            }
            String e = dbsj.e(afiaVar.b);
            dwim bZ = dwir.R.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            e.getClass();
            dwirVar.a |= 1;
            dwirVar.c = e;
            cjsb cjsbVar = new cjsb();
            cjsbVar.i(ddda.f);
            cjsbVar.f(str);
            dnqh a2 = cjsbVar.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar2 = (dwir) bZ.b;
            a2.getClass();
            dwirVar2.s = a2;
            dwirVar2.a |= 33554432;
            if ((afiaVar.E.a & 4) != 0) {
                dwiw bZ2 = dwix.h.bZ();
                drrf drrfVar = afiaVar.E.d;
                if (drrfVar == null) {
                    drrfVar = drrf.i;
                }
                dsrh<dodv> dsrhVar = new dsrh(drrfVar.a, drrf.b);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwix dwixVar = (dwix) bZ2.b;
                dsrf dsrfVar = dwixVar.c;
                if (!dsrfVar.a()) {
                    dwixVar.c = dsqw.cg(dsrfVar);
                }
                for (dodv dodvVar : dsrhVar) {
                    dwixVar.c.h(dodvVar.e);
                }
                doef bZ3 = doeg.c.bZ();
                int a3 = dodz.a(drrfVar.c);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                doeg doegVar = (doeg) bZ3.b;
                doegVar.b = a3 - 1;
                doegVar.a |= 1;
                doeg bK = bZ3.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwix dwixVar2 = (dwix) bZ2.b;
                bK.getClass();
                dwixVar2.d = bK;
                dwixVar2.a |= 8;
                dodx b2 = dodx.b(drrfVar.f);
                if (b2 == null) {
                    b2 = dodx.STARS_0_5;
                }
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwix dwixVar3 = (dwix) bZ2.b;
                dwixVar3.f = b2.k;
                dwixVar3.a |= 16;
                dsrh<dodx> dsrhVar2 = new dsrh(drrfVar.d, drrf.e);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwix dwixVar4 = (dwix) bZ2.b;
                dsrf dsrfVar2 = dwixVar4.e;
                if (!dsrfVar2.a()) {
                    dwixVar4.e = dsqw.cg(dsrfVar2);
                }
                for (dodx dodxVar : dsrhVar2) {
                    dwixVar4.e.h(dodxVar.k);
                }
                drpo drpoVar = drrfVar.g;
                if (drpoVar == null) {
                    drpoVar = drpo.c;
                }
                dnnh bZ4 = dnnn.l.bZ();
                String str7 = drpoVar.a;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dnnn dnnnVar = (dnnn) bZ4.b;
                str7.getClass();
                int i4 = dnnnVar.a | 1;
                dnnnVar.a = i4;
                dnnnVar.b = str7;
                int i5 = drpoVar.b;
                dnnnVar.a = i4 | 2;
                dnnnVar.c = i5;
                dnnn bK2 = bZ4.bK();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwix dwixVar5 = (dwix) bZ2.b;
                bK2.getClass();
                dwixVar5.b = bK2;
                dwixVar5.a |= 1;
                dsrj<String> dsrjVar = drrfVar.h;
                dwix dwixVar6 = (dwix) bZ2.b;
                dsrj<String> dsrjVar2 = dwixVar6.g;
                if (!dsrjVar2.a()) {
                    dwixVar6.g = dsqw.cl(dsrjVar2);
                }
                dsod.bv(dsrjVar, dwixVar6.g);
                dwix bK3 = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar3 = (dwir) bZ.b;
                bK3.getClass();
                dwirVar3.w = bK3;
                dwirVar3.a |= 536870912;
            }
            dwip bZ5 = dwiq.e.bZ();
            if (!dbsj.d(afiaVar.d)) {
                String str8 = afiaVar.d;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dwiq dwiqVar = (dwiq) bZ5.b;
                str8.getClass();
                dwiqVar.a |= 1;
                dwiqVar.b = str8;
            }
            if (!dbsj.d(afiaVar.e)) {
                String str9 = afiaVar.e;
                if (!dbsj.d(str9)) {
                    int indexOf = str9.indexOf(44);
                    if (indexOf < 0) {
                        if (akqi.f(str9) != null) {
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dwiq dwiqVar2 = (dwiq) bZ5.b;
                            str9.getClass();
                            dwiqVar2.a = 4 | dwiqVar2.a;
                            dwiqVar2.d = str9;
                        } else {
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dwiq dwiqVar3 = (dwiq) bZ5.b;
                            str9.getClass();
                            dwiqVar3.a |= 2;
                            dwiqVar3.c = str9;
                        }
                    } else {
                        String substring = str9.substring(0, indexOf);
                        if (akqi.f(substring) == null) {
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dwiq dwiqVar4 = (dwiq) bZ5.b;
                            str9.getClass();
                            dwiqVar4.a |= 2;
                            dwiqVar4.c = str9;
                        } else {
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dwiq dwiqVar5 = (dwiq) bZ5.b;
                            substring.getClass();
                            dwiqVar5.a = 4 | dwiqVar5.a;
                            dwiqVar5.d = substring;
                            String substring2 = str9.substring(indexOf + 1);
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            dwiq dwiqVar6 = (dwiq) bZ5.b;
                            substring2.getClass();
                            dwiqVar6.a |= 2;
                            dwiqVar6.c = substring2;
                        }
                    }
                    dwiq bK4 = bZ5.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwir dwirVar4 = (dwir) bZ.b;
                    bK4.getClass();
                    dwirVar4.u = bK4;
                    dwirVar4.a |= 134217728;
                }
            }
            this.q.a().r(bZ);
            dhjx b3 = afhj.b(afiaVar, this.t, this.k.getResources(), this.s.a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar5 = (dwir) bZ.b;
            b3.getClass();
            dwirVar5.d = b3;
            dwirVar5.a |= 2;
            this.q.a().s(bZ.bK(), iqyVar);
        } else {
            String str10 = afiaVar.b;
            dbsk.l(this.m.a());
            astd s = aste.s();
            assw asswVar = (assw) s;
            asswVar.a = cjqg.b(this.l);
            asswVar.b = str10;
            s.d(dbsj.e(str10));
            s.f(ddda.g);
            s.h(true);
            this.p.j(this.r, s.a());
            ((ckco) this.n.a().a(ckee.x)).a(asij.a(2));
        }
    }
}
