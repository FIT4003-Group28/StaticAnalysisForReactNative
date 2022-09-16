package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cabn  reason: default package */
/* loaded from: classes4.dex */
public final class cabn extends itb implements cafi {
    public static final /* synthetic */ int a = 0;
    private static final dcdn<dkcp, drds> b;
    private final anhk c;
    private final gga d;
    private final dxio<akfa> e;
    private final dxio<akfc> f;
    private final btvo g;
    private final cbqg h;
    private final ceet i;
    private final chnm j;
    private final Set<cafo> k = new HashSet();

    static {
        dcdg p = dcdn.p();
        p.f(dkcp.REVIEW, drds.REVIEW);
        p.f(dkcp.PHOTO, drds.MEDIA);
        p.f(dkcp.PUBLIC_LIST, drds.PUBLIC_LIST);
        p.f(dkcp.EDIT, drds.FACTUAL_EDIT);
        p.f(dkcp.EVENTS, drds.EVENT);
        p.f(dkcp.QA, drds.PLACE_QA);
        b = p.b();
    }

    public cabn(anhk anhkVar, gga ggaVar, dxio<akfa> dxioVar, dxio<akfc> dxioVar2, btvo btvoVar, cbqg cbqgVar, chnm chnmVar, ceet ceetVar) {
        this.c = anhkVar;
        this.d = ggaVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = btvoVar;
        this.h = cbqgVar;
        this.i = ceetVar;
        this.j = chnmVar;
    }

    private final void B(@dzsi String str, @dzsi dkcp dkcpVar, cabc cabcVar, @dzsi droq droqVar, boolean z, boolean z2) {
        caaw g;
        dkcp dkcpVar2 = (dkcpVar != dkcp.EVENTS || this.h.a()) ? dkcpVar : dkcp.CONTRIBUTE;
        if (dkcpVar2 != dkcp.CONTRIBUTE || !this.j.p() || z2) {
            btlu j = this.e.a().j();
            if (this.i.e() && droqVar == null && !z2) {
                drds drdsVar = b.get(dkcpVar2);
                if (drdsVar == null) {
                    this.i.i(str);
                    return;
                }
                boolean z3 = false;
                if (str == null || (j != null && j.d.equals(str))) {
                    z3 = true;
                }
                this.i.l(str, drdsVar, !z3, cees.h());
                return;
            } else if (dkcpVar2 == dkcp.PUBLIC_LIST) {
                return;
            } else {
                String f = dbsj.f(str);
                String str2 = this.c.a().d;
                if (btlu.i(j).equals(btlt.GOOGLE) || f == null) {
                    this.f.a().b(C(new cabm(f, dkcpVar2, null, str2, p(), q(), cabcVar, droqVar, this.g.getContributionsPageParameters().e, z)));
                    return;
                }
                dwtm r = r(f, str2, this.d, p(), q(), cabcVar, droqVar);
                if (!l(this.d, r, null, dkcpVar2, null, this.g.getContributionsPageParameters().e)) {
                    return;
                }
                if (z) {
                    g = caaw.i(r, null, dkcpVar2, null);
                } else {
                    g = caaw.g(r, null, dkcpVar2, null);
                }
                this.d.D(g);
                return;
            }
        }
        this.j.f();
    }

    private static akes C(cabm cabmVar) {
        aker i = akeu.i(cabmVar);
        aken a2 = i.a();
        a2.i(R.string.CONTRIBUTIONS_LOGIN_PROMPT_TITLE);
        a2.h(R.string.CONTRIBUTIONS_LOGIN_PROMPT_BODY);
        aken a3 = i.a();
        a3.d(R.string.YOUR_CONTRIBUTIONS);
        a3.c(R.string.CONTRIBUTIONS_INCOGNITO_MESSAGE);
        return i.b();
    }

    public static boolean l(gga ggaVar, dwtm dwtmVar, @dzsi String str, @dzsi dkcp dkcpVar, @dzsi String str2, boolean z) {
        if (!z || !ggaVar.aY) {
            return true;
        }
        ggaVar.g().aq();
        fd K = ggaVar.K();
        if (!(K instanceof caaw)) {
            return true;
        }
        Bundle bundle = ((caaw) K).o;
        return !Arrays.equals(bundle.getByteArray("arg_key_user_contributions_request"), dwtmVar.bS()) || (str == null && bundle.containsKey("arg_key_user_account_id")) || ((str != null && !str.equals(bundle.getString("arg_key_user_account_id"))) || ((dkcpVar == null && bundle.containsKey("arg_tab_type_to_open")) || (!(dkcpVar == null || dkcpVar.i == bundle.getInt("arg_tab_type_to_open")) || ((str2 == null && bundle.getString("arg_key_initial_tab_page_section") != null) || (str2 != null && !str2.equals(bundle.getString("arg_key_initial_tab_page_section")))))));
    }

    public static dwtm r(@dzsi String str, String str2, Context context, boolean z, boolean z2, cabc cabcVar, @dzsi droq droqVar) {
        dwtj dwtjVar = (dwtj) dwtm.l.bZ();
        if (!dbsj.d(str)) {
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar = (dwtm) dwtjVar.b;
            str.getClass();
            dwtmVar.a |= 1;
            dwtmVar.b = str;
        }
        int e = cawp.a.e(context);
        dhkc bZ = dhkd.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        int i = dhkdVar.a | 1;
        dhkdVar.a = i;
        dhkdVar.b = e;
        dhkdVar.a = i | 2;
        dhkdVar.c = e;
        dhkd bK = bZ.bK();
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar2 = (dwtm) dwtjVar.b;
        bK.getClass();
        dwtmVar2.c = bK;
        dwtmVar2.a |= 2;
        if (!dbsj.d(str2)) {
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar3 = (dwtm) dwtjVar.b;
            str2.getClass();
            dwtmVar3.a |= 4;
            dwtmVar3.d = str2;
        }
        if (z) {
            dkfy bZ2 = dkfz.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkfz dkfzVar = (dkfz) bZ2.b;
            dkfzVar.a |= 1;
            dkfzVar.b = 10;
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar4 = (dwtm) dwtjVar.b;
            dkfz bK2 = bZ2.bK();
            bK2.getClass();
            dwtmVar4.h = bK2;
            dwtmVar4.a |= 64;
        }
        if (droqVar != null) {
            if (dwtjVar.c) {
                dwtjVar.bF();
                dwtjVar.c = false;
            }
            dwtm dwtmVar5 = (dwtm) dwtjVar.b;
            droqVar.getClass();
            dwtmVar5.j = droqVar;
            dwtmVar5.a |= 256;
        }
        boolean z3 = z2 && cabcVar.equals(cabc.AS_PUBLIC);
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar6 = (dwtm) dwtjVar.b;
        dwtmVar6.a |= 128;
        dwtmVar6.i = z3;
        dpvp bZ3 = dpvr.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpvr dpvrVar = (dpvr) bZ3.b;
        dpvrVar.b = 3;
        dpvrVar.a |= 1;
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar7 = (dwtm) dwtjVar.b;
        dpvr bK3 = bZ3.bK();
        bK3.getClass();
        dsrj<dpvr> dsrjVar = dwtmVar7.e;
        if (!dsrjVar.a()) {
            dwtmVar7.e = dsqw.cl(dsrjVar);
        }
        dwtmVar7.e.add(bK3);
        dulg bZ4 = dulh.b.bZ();
        bZ4.a(dulf.LOAD_USER_FACTUAL_EDITS);
        bZ4.a(dulf.LOAD_USER_QA_CONTRIBUTIONS);
        if (dwtjVar.c) {
            dwtjVar.bF();
            dwtjVar.c = false;
        }
        dwtm dwtmVar8 = (dwtm) dwtjVar.b;
        dulh bK4 = bZ4.bK();
        bK4.getClass();
        dwtmVar8.f = bK4;
        dwtmVar8.a |= 8;
        return (dwtm) dwtjVar.bK();
    }

    @Override // defpackage.cafi
    public final boolean e() {
        return ((caaw) this.d.z(caaw.class)) != null;
    }

    @Override // defpackage.cafi
    public final void f() {
        B(null, null, cabc.AS_PUBLIC, null, false, false);
    }

    @Override // defpackage.cafi
    public final void i() {
        B(null, null, cabc.AS_SELF, null, false, true);
    }

    @Override // defpackage.cafi
    public final void j(@dzsi String str, @dzsi dkcp dkcpVar, @dzsi droq droqVar) {
        B(str, dkcpVar, cabc.AS_SELF, droqVar, false, false);
    }

    @Override // defpackage.cafi
    public final void k(@dzsi String str, @dzsi dkcp dkcpVar) {
        B(str, dkcpVar, cabc.AS_SELF, null, false, false);
    }

    @Override // defpackage.cafi
    public final void m(String str) {
        this.f.a().b(C(new cabm(null, dkcp.CONTRIBUTE, str, this.c.a().d, p(), q(), cabc.AS_SELF, null, this.g.getContributionsPageParameters().e, false)));
    }

    @Override // defpackage.cafi
    public final void n(cafo cafoVar) {
        this.k.add(cafoVar);
    }

    @Override // defpackage.cafi
    public final void o(cafo cafoVar) {
        this.k.remove(cafoVar);
    }

    @Override // defpackage.cafi
    public final boolean p() {
        return !this.g.getBadgesParameters().a;
    }

    @Override // defpackage.cafi
    public final boolean q() {
        return this.g.getUgcParameters().S();
    }

    @Override // defpackage.cafi
    public final void s(int i) {
        String str = this.c.a().d;
        for (cafo cafoVar : this.k) {
            cafoVar.bv(i, str);
        }
    }

    @Override // defpackage.cafi
    public final void t(@dzsi dkcp dkcpVar) {
        B(null, dkcpVar, cabc.AS_SELF, null, true, false);
    }
}
