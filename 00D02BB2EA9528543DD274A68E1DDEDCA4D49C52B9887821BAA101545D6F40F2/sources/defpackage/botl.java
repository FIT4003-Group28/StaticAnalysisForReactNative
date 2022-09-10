package defpackage;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: botl  reason: default package */
/* loaded from: classes3.dex */
public class botl extends ivn implements botx {
    public String a;
    public String b;
    public final gft c;
    public final gga d;
    public final boxa e;
    public final dxio<cjqy> f;
    @dzsi
    private akqq g;
    private final gfw h;
    private final Resources i;
    private final btpc j;
    private final bnyo k;
    @dzsi
    private CharSequence l;
    private final cklf m;
    private final dnqb n;
    private final dzsj<afwr> o;
    private final akpm p;

    public botl(@dzsi String str, @dzsi String str2, @dzsi akqq akqqVar, gfw gfwVar, gft gftVar, boolean z, dnqb dnqbVar, Resources resources, gga ggaVar, jmx jmxVar, btpc btpcVar, bnyo bnyoVar, boxa boxaVar, cklf cklfVar, dxio<cjqy> dxioVar, dzsj<afwr> dzsjVar, akpm akpmVar) {
        super(ggaVar.getString(R.string.ADD_MISSING_BUILDING_PAGE_TITLE), 2, null, ggaVar.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.cl), cjtd.a(dtya.cm), true, true, z, true);
        this.a = "";
        this.b = "";
        this.a = dbsj.e(str);
        this.b = dbsj.e(str2);
        if (akqqVar != null) {
            this.g = akqqVar;
        }
        this.h = gfwVar;
        this.c = gftVar;
        this.i = resources;
        this.d = ggaVar;
        this.j = btpcVar;
        this.k = bnyoVar;
        this.e = boxaVar;
        this.m = cklfVar;
        this.f = dxioVar;
        this.n = dnqbVar;
        this.o = dzsjVar;
        this.p = akpmVar;
    }

    @Override // defpackage.ivn
    public void a() {
        this.d.onBackPressed();
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        if (!((ges) this.c).aD || !h()) {
            return;
        }
        jmw.d(this.d, null);
        if (this.j.i()) {
            afwo l = this.o.a().l();
            dnps bZ = dnqe.i.bZ();
            dnqb dnqbVar = this.n;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a |= 1;
            int i = l.d(afwm.SATELLITE) ? 3 : 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar2 = (dnqe) bZ.b;
            dnqeVar2.d = i - 1;
            dnqeVar2.a |= 4;
            dngl bZ2 = dngm.d.bZ();
            dhjx aa = this.p.aa();
            if (aa != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqe dnqeVar3 = (dnqe) bZ.b;
                aa.getClass();
                dnqeVar3.e = aa;
                dnqeVar3.a |= 8;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dngm dngmVar = (dngm) bZ2.b;
                aa.getClass();
                dngmVar.c = aa;
                dngmVar.a |= 4;
            }
            ArrayList a = dchl.a();
            dner bZ3 = dnet.h.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnet dnetVar = (dnet) bZ3.b;
            dnetVar.a |= 1;
            dnetVar.b = 14;
            dneu bZ4 = dnfe.p.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dnfe dnfeVar = (dnfe) bZ4.b;
            dnfeVar.a |= 2;
            dnfeVar.c = "gcid:compound_building";
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnet dnetVar2 = (dnet) bZ3.b;
            dnfe bK = bZ4.bK();
            bK.getClass();
            dnetVar2.d = bK;
            dnetVar2.a |= 4;
            a.add(bZ3.bK());
            dner bZ5 = dnet.h.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnet dnetVar3 = (dnet) bZ5.b;
            dnetVar3.a |= 1;
            dnetVar3.b = 1;
            dneu bZ6 = dnfe.p.bZ();
            String str = this.a;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnfe dnfeVar2 = (dnfe) bZ6.b;
            str.getClass();
            dnfeVar2.a |= 2;
            dnfeVar2.c = str;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dnet dnetVar4 = (dnet) bZ5.b;
            dnfe bK2 = bZ6.bK();
            bK2.getClass();
            dnetVar4.d = bK2;
            dnetVar4.a |= 4;
            a.add(bZ5.bK());
            dner bZ7 = dnet.h.bZ();
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dnet dnetVar5 = (dnet) bZ7.b;
            dnetVar5.a |= 1;
            dnetVar5.b = 2;
            dneu bZ8 = dnfe.p.bZ();
            String str2 = this.b;
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            dnfe dnfeVar3 = (dnfe) bZ8.b;
            str2.getClass();
            dnfeVar3.a |= 2;
            dnfeVar3.c = str2;
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            dnet dnetVar6 = (dnet) bZ7.b;
            dnfe bK3 = bZ8.bK();
            bK3.getClass();
            dnetVar6.d = bK3;
            dnetVar6.a |= 4;
            a.add(bZ7.bK());
            akqq akqqVar = this.g;
            if (akqqVar != null) {
                dner bZ9 = dnet.h.bZ();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dnet dnetVar7 = (dnet) bZ9.b;
                dnetVar7.a |= 1;
                dnetVar7.b = 5;
                dneu bZ10 = dnfe.p.bZ();
                dnoh g = akqqVar.g();
                if (bZ10.c) {
                    bZ10.bF();
                    bZ10.c = false;
                }
                dnfe dnfeVar4 = (dnfe) bZ10.b;
                g.getClass();
                dnfeVar4.e = g;
                dnfeVar4.a |= 8;
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                dnet dnetVar8 = (dnet) bZ9.b;
                dnfe bK4 = bZ10.bK();
                bK4.getClass();
                dnetVar8.d = bK4;
                dnetVar8.a |= 4;
                a.add(bZ9.bK());
            }
            dwgy bZ11 = dwgz.h.bZ();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dwgz dwgzVar = (dwgz) bZ11.b;
            dnqe bK5 = bZ.bK();
            bK5.getClass();
            dwgzVar.c = bK5;
            dwgzVar.a |= 2;
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dwgz dwgzVar2 = (dwgz) bZ11.b;
            dngm bK6 = bZ2.bK();
            bK6.getClass();
            dwgzVar2.d = bK6;
            dwgzVar2.a |= 4;
            djgw a2 = chiw.a();
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dwgz dwgzVar3 = (dwgz) bZ11.b;
            a2.getClass();
            dwgzVar3.e = a2;
            dwgzVar3.a |= 8;
            doaq bZ12 = doar.c.bZ();
            dniw bZ13 = dniz.f.bZ();
            bZ13.a(a);
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            doar doarVar = (doar) bZ12.b;
            dniz bK7 = bZ13.bK();
            bK7.getClass();
            doarVar.b = bK7;
            doarVar.a |= 1;
            if (bZ11.c) {
                bZ11.bF();
                bZ11.c = false;
            }
            dwgz dwgzVar4 = (dwgz) bZ11.b;
            doar bK8 = bZ12.bK();
            bK8.getClass();
            dwgzVar4.b = bK8;
            dwgzVar4.a |= 1;
            this.k.a(bZ11.bK(), new boti(this));
            return;
        }
        jmw.g(this.d, R.string.ADD_MISSING_BUILDING_PAGE_TITLE, R.string.REPORT_A_PROBLEM_NOT_AVAILABLE_OFFLINE);
    }

    @Override // defpackage.botx
    public String c() {
        return this.a;
    }

    @Override // defpackage.botx
    public String j() {
        return this.b;
    }

    @Override // defpackage.botx
    @dzsi
    public akqq k() {
        return this.g;
    }

    @Override // defpackage.botx
    public dnqb l() {
        return this.n;
    }

    @Override // defpackage.botx
    public void m() {
        d(true);
    }

    @Override // defpackage.botx
    public void n(String str) {
        this.b = str;
    }

    @Override // defpackage.botx
    public void o(akqq akqqVar) {
        this.g = akqqVar;
    }

    @Override // defpackage.botx
    public cqgl p() {
        return new cqgl(this) { // from class: botg
            private final botl a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.a = charSequence.toString();
            }
        };
    }

    @Override // defpackage.botx
    public cqgl q() {
        return new cqgl(this) { // from class: both
            private final botl a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.b = charSequence.toString();
            }
        };
    }

    @Override // defpackage.botx
    public cqkl r() {
        if (((ges) this.c).aD) {
            String string = this.i.getString(R.string.RAP_PANNABLE_TITLE);
            aneb z = anee.z();
            z.r(string);
            z.j(4);
            z.q("");
            z.c(dtxj.S);
            z.e(dtxj.T);
            this.h.aZ(andr.bt(k(), true, false, dosc.TYPE_RAP_ADD_A_PLACE, z.a()));
        }
        return cqkl.a;
    }

    @Override // defpackage.botx
    public jbh s() {
        return this;
    }

    @Override // defpackage.botx
    public Boolean t() {
        return Boolean.valueOf(!h());
    }

    @Override // defpackage.botx
    @dzsi
    public CharSequence u() {
        if (this.l == null) {
            String string = this.d.getString(R.string.LEARN_MORE);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.d.getString(R.string.LEGAL_DISCLAIMER, new Object[]{string}));
            ClickableSpan g = this.m.g("android_rap", ibm.w().b(this.d));
            int indexOf = spannableStringBuilder.toString().indexOf(string);
            spannableStringBuilder.setSpan(g, indexOf, string.length() + indexOf, 33);
            this.l = spannableStringBuilder;
        }
        return this.l;
    }
}
