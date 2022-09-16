package defpackage;

import android.app.ProgressDialog;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
import com.google.android.apps.gmm.ugc.post.editor.StructuredQuestionAnswer;
import com.google.android.apps.gmm.ugc.post.photo.MediaData;
import com.google.android.apps.maps.R;
import com.google.android.material.chip.Chip;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdlu  reason: default package */
/* loaded from: classes4.dex */
public final class cdlu extends ges {
    public bwqv a;
    public caxn ad;
    public dxio<bbut> ae;
    public cdlv af;
    public cdkw ag;
    public cebr ah;
    public cdms ai;
    public cdxx aj;
    public EditText ak;
    public boolean al;
    public cdkv am;
    public bwrs<ilo> an;
    private cdnd ao;
    private cdog ap;
    private cdkq aq;
    public efg b;
    public cebd c;
    public btvo d;
    public cdnk e;
    public cdmx f;
    public bqrv g;

    public cdlu() {
        new cdjx();
        this.al = true;
    }

    private final cdjd aJ(int i) {
        cdms cdmsVar = this.ai;
        dbsk.s(cdmsVar);
        cdog cdogVar = this.ap;
        dbsk.s(cdogVar);
        dbsg<dmce> c = cdogVar.c();
        dbsk.s(this.ah);
        final dmbb bZ = dmbc.h.bZ();
        dcdc<MediaData> h = cdmsVar.h.h();
        dbsk.s(h);
        dcdc z = dcbg.b(h).s(cdmd.a).s(cdme.a).z();
        CharSequence h2 = cdmsVar.f.h();
        dbsk.s(h2);
        String charSequence = h2.toString();
        final dmbf bZ2 = dmbg.i.bZ();
        dmbz bZ3 = dmca.c.bZ();
        Float h3 = cdmsVar.g.h();
        dbsk.s(h3);
        int intValue = h3.intValue();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmca dmcaVar = (dmca) bZ3.b;
        dmcaVar.a |= 1;
        dmcaVar.b = intValue;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmbg dmbgVar = (dmbg) bZ2.b;
        dmca bK = bZ3.bK();
        bK.getClass();
        dmbgVar.b = bK;
        dmbgVar.a |= 1;
        dmcb bZ4 = dmcc.i.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmcc dmccVar = (dmcc) bZ4.b;
        charSequence.getClass();
        dmccVar.a |= 1;
        dmccVar.b = charSequence;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmbg dmbgVar2 = (dmbg) bZ2.b;
        dmcc bK2 = bZ4.bK();
        bK2.getClass();
        dmbgVar2.c = bK2;
        dmbgVar2.a |= 2;
        bZ2.a(z);
        bZ2.getClass();
        bvor.a(c, new mw(bZ2) { // from class: cdmf
            private final dmbf a;

            {
                this.a = bZ2;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dmbf dmbfVar = this.a;
                dmce dmceVar = (dmce) obj;
                if (dmbfVar.c) {
                    dmbfVar.bF();
                    dmbfVar.c = false;
                }
                dmbg dmbgVar3 = (dmbg) dmbfVar.b;
                dmbg dmbgVar4 = dmbg.i;
                dmceVar.getClass();
                dmbgVar3.e = dmceVar;
                dmbgVar3.a |= 4;
            }
        });
        dmbg bK3 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbc dmbcVar = (dmbc) bZ.b;
        bK3.getClass();
        dmbcVar.d = bK3;
        dmbcVar.a |= 4;
        dmbr bZ5 = dmbu.i.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dmbu dmbuVar = (dmbu) bZ5.b;
        dmbuVar.d = i - 1;
        dmbuVar.a |= 8;
        dmbu bK4 = bZ5.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbc dmbcVar2 = (dmbc) bZ.b;
        bK4.getClass();
        dmbcVar2.c = bK4;
        dmbcVar2.a |= 2;
        cdjd h4 = cdmsVar.i.h();
        dbsk.s(h4);
        String g = h4.a().g();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmbc dmbcVar3 = (dmbc) bZ.b;
        g.getClass();
        dmbcVar3.a |= 1;
        dmbcVar3.b = g;
        cdjd h5 = cdmsVar.i.h();
        dbsk.s(h5);
        dbsg<String> h6 = h5.a().h();
        bZ.getClass();
        bvor.a(h6, new mw(bZ) { // from class: cdly
            private final dmbb a;

            {
                this.a = bZ;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                dmbb dmbbVar = this.a;
                String str = (String) obj;
                if (dmbbVar.c) {
                    dmbbVar.bF();
                    dmbbVar.c = false;
                }
                dmbc dmbcVar4 = (dmbc) dmbbVar.b;
                dmbc dmbcVar5 = dmbc.h;
                str.getClass();
                dmbcVar4.a |= 32;
                dmbcVar4.g = str;
            }
        });
        return new cdsa(bZ.bK());
    }

    private final void w(cdjd cdjdVar, final boolean z) {
        dbsk.s(this.f);
        dbsk.s(this.e);
        cdnk cdnkVar = this.e;
        cdms cdmsVar = this.ai;
        dbsk.s(cdmsVar);
        ilo h = cdmsVar.d.h();
        dbsk.s(h);
        cdkv cdkvVar = this.am;
        dbsk.s(cdkvVar);
        cdnkVar.a(cdjdVar, h, cdkvVar.b, this.am.b(), this.am.a(), new mw(this, z) { // from class: cdlf
            private final cdlu a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                cdlu cdluVar = this.a;
                boolean z2 = this.b;
                cdms cdmsVar2 = cdluVar.ai;
                dbsk.s(cdmsVar2);
                cdmsVar2.d.g((ilo) obj);
                cdmx cdmxVar = cdluVar.f;
                dbsk.s(cdmxVar);
                cdmy.a(R.string.DRAFT_REVIEW_SAVED_TOAST, cdmxVar.b).show();
                if (z2) {
                    cdluVar.q(3);
                }
            }
        }, new Runnable(this, z) { // from class: cdlg
            private final cdlu a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cdlu cdluVar = this.a;
                boolean z2 = this.b;
                cdmx cdmxVar = cdluVar.f;
                dbsk.s(cdmxVar);
                cdmy.a(R.string.SAVE_DRAFT_REVIEW_FAILURE, cdmxVar.b).show();
                if (z2) {
                    cdluVar.q(6);
                }
            }
        });
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        dbsk.s(this.ai);
        if (obj instanceof bbuf) {
            List<bbtm> a = ((bbuf) obj).a();
            cdxx cdxxVar = this.aj;
            dbsk.s(cdxxVar);
            dcdc z = dcbg.b(a).s(cdlm.a).z();
            Collection subList = z.subList(0, Math.min(cdxxVar.d().c(Integer.MAX_VALUE).intValue(), z.size()));
            dcdc<MediaData> h = cdxxVar.e.h();
            dbsk.s(h);
            final dcep B = dcbg.b(h).s(cdxu.a).B();
            cdxxVar.f.g(dcbg.b(subList).o(new dbsl(B) { // from class: cdxv
                private final dcep a;

                {
                    this.a = B;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj2) {
                    dcep dcepVar = this.a;
                    int i = cdxx.j;
                    return !dcepVar.contains(((MediaData) obj2).a());
                }
            }).z());
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.editor, viewGroup, false);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        cjtd a;
        cebd cebdVar = this.c;
        dbsk.s(cebdVar);
        cdvv a2 = cdvv.a(this, cebdVar);
        final ModAppBar modAppBar = (ModAppBar) view.findViewById(R.id.modAppBar);
        jhz a3 = jhz.a();
        a3.i = cqrt.g(2131232205, ibm.p());
        a3.j = cqrt.l(R.string.GENERIC_CANCEL_BUTTON);
        a3.f(new View.OnClickListener(this) { // from class: cdky
            private final cdlu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.g();
            }
        });
        a3.o = cjtd.a(dtyf.x);
        jhm a4 = jhm.a();
        a4.a = Rp(R.string.POST_BUTTON);
        a4.h = 2;
        a4.d(new View.OnClickListener(this) { // from class: cdkz
            private final cdlu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.i(view2);
            }
        });
        cdms cdmsVar = this.ai;
        dbsk.s(cdmsVar);
        ilo h = cdmsVar.d.h();
        cdkv cdkvVar = this.am;
        dbsk.s(cdkvVar);
        ddhv b = ddhv.b(cdkvVar.a.k);
        if (b == null) {
            b = ddhv.UNKNOWN;
        }
        cjta b2 = cjtd.b();
        b2.d = dtyf.I;
        ddes bZ = ddet.D.bZ();
        ddhs bZ2 = ddhw.d.bZ();
        int i = 0;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddhw ddhwVar = (ddhw) bZ2.b;
        ddhwVar.b = b.d;
        ddhwVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddhw bK = bZ2.bK();
        bK.getClass();
        ddetVar.x = bK;
        ddetVar.a |= 1073741824;
        b2.s(bZ.bK());
        if (h == null) {
            a = b2.a();
        } else {
            String bK2 = h.bK();
            if (bK2 == null) {
                a = b2.a();
            } else {
                ddji bZ3 = ddjj.c.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddjj ddjjVar = (ddjj) bZ3.b;
                bK2.getClass();
                ddjjVar.a |= 1;
                ddjjVar.b = bK2;
                b2.k(bZ3.bK());
                a = b2.a();
            }
        }
        a4.f = a;
        a4.n = true;
        a3.c(a4.c());
        modAppBar.setToolbarProperties(a3.b());
        modAppBar.setCoverStatusBar(false);
        cdms cdmsVar2 = this.ai;
        dbsk.s(cdmsVar2);
        v<String> vVar = cdmsVar2.j;
        modAppBar.getClass();
        vVar.b(a2.a.x(), new aa(modAppBar) { // from class: cdlr
            private final ModAppBar a;

            {
                this.a = modAppBar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.setTitle((String) obj);
            }
        });
        final cdwi b3 = a2.b(R.id.ratingFiveStarView);
        b3.d(dtyf.D);
        final cdkb<Float> cdkbVar = this.ai.g;
        View view2 = b3.c;
        if (view2 instanceof FiveStarView) {
            m mVar = b3.b;
            final FiveStarView fiveStarView = (FiveStarView) view2;
            fiveStarView.getClass();
            cdkbVar.b(mVar, new aa(fiveStarView) { // from class: cdwe
                private final FiveStarView a;

                {
                    this.a = fiveStarView;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.setValue(((Float) obj).floatValue());
                }
            });
            cdkbVar.getClass();
            final mw mwVar = new mw(cdkbVar) { // from class: cdwf
                private final z a;

                {
                    this.a = cdkbVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    this.a.g((Float) obj);
                }
            };
            View view3 = b3.d;
            if (view3 instanceof FiveStarView) {
                ((FiveStarView) view3).setListener(new jfp(b3, mwVar) { // from class: cdwj
                    private final cdwl a;
                    private final mw b;

                    {
                        this.a = b3;
                        this.b = mwVar;
                    }

                    @Override // defpackage.jfp
                    public final void a(final float f) {
                        cdwl cdwlVar = this.a;
                        final mw mwVar2 = this.b;
                        cdwlVar.e.a(new Runnable(mwVar2, f) { // from class: cdwk
                            private final mw a;
                            private final float b;

                            {
                                this.a = mwVar2;
                                this.b = f;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a(Float.valueOf(this.b));
                            }
                        });
                    }
                });
            }
        }
        cdwi b4 = a2.b(R.id.contentEditText);
        b4.d(dtyf.P);
        b4.f(this.ai.f);
        v<CharSequence> vVar2 = this.ai.k;
        final String Rp = Rp(R.string.WRITE_REVIEW_HINT);
        v a5 = am.a(vVar2, new ahp(Rp) { // from class: cdvx
            private final CharSequence a;

            {
                this.a = Rp;
            }

            @Override // defpackage.ahp
            public final Object a(Object obj) {
                return (CharSequence) dbsg.j((CharSequence) obj).c(this.a);
            }
        });
        View view4 = b4.c;
        if (view4 instanceof TextView) {
            m mVar2 = b4.b;
            final TextView textView = (TextView) view4;
            textView.getClass();
            a5.b(mVar2, new aa(textView) { // from class: cdvw
                private final TextView a;

                {
                    this.a = textView;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.setHint((CharSequence) obj);
                }
            });
        }
        this.ak = (EditText) view.findViewById(R.id.contentEditText);
        cdwi b5 = a2.b(R.id.mediaCarouselFragment);
        cdxx cdxxVar = this.aj;
        dbsk.s(cdxxVar);
        b5.e(cdxxVar.h);
        cdwi b6 = a2.b(R.id.addPhotosButton);
        b6.d(dtyf.G);
        b6.a(new Runnable(this) { // from class: cdlk
            private final cdlu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cdlu cdluVar = this.a;
                cdxx cdxxVar2 = cdluVar.aj;
                dbsk.s(cdxxVar2);
                dxio<bbut> dxioVar = cdluVar.ae;
                dbsk.s(dxioVar);
                bbuz m = bbve.m();
                m.e(dwyd.REVIEW);
                cdms cdmsVar3 = cdluVar.ai;
                dbsk.s(cdmsVar3);
                bbsu bbsuVar = (bbsu) m;
                bbsuVar.b = cdmsVar3.d.h();
                m.i(dcbg.b((List) dbsg.j(cdxxVar2.f.h()).c(dcdc.e())).s(cdll.a).z());
                cdkv cdkvVar2 = cdluVar.am;
                dbsk.s(cdkvVar2);
                cdpd cdpdVar = cdkvVar2.a;
                dbsk.s(cdpdVar);
                m.j(dcbg.b(cdpdVar.h).s(new dbrn(cdkvVar2) { // from class: cdku
                    private final cdkv a;

                    {
                        this.a = cdkvVar2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        cdkv cdkvVar3 = this.a;
                        bbtu bbtuVar = cdkvVar3.c;
                        dbsk.s(bbtuVar);
                        return bbtuVar.a((dwfl) obj, cdkvVar3.d);
                    }
                }).z());
                bbsuVar.c = cdluVar.aj.d();
                dxioVar.a().k(m.a(), cdluVar);
            }
        });
        cdxx cdxxVar2 = this.aj;
        dbsk.s(cdxxVar2);
        v<Boolean> vVar3 = cdxxVar2.a;
        m mVar3 = b6.b;
        final View view5 = b6.c;
        view5.getClass();
        vVar3.b(mVar3, new aa(view5) { // from class: cdwd
            private final View a;

            {
                this.a = view5;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.setEnabled(((Boolean) obj).booleanValue());
            }
        });
        if (Chip.class.isInstance(b6.c)) {
            Drawable b7 = bvlo.a().b(b6.a, R.raw.ic_mod_add_photo, bvlw.a);
            b7.mutate().setColorFilter(new PorterDuffColorFilter(b6.a.getColor(R.color.mod_daynight_blue600), PorterDuff.Mode.SRC_IN));
            ((Chip) ((View) Chip.class.cast(b6.c))).setChipIcon(b7);
        }
        cdkv cdkvVar2 = this.am;
        dbsk.s(cdkvVar2);
        boolean c = cdkvVar2.c();
        View findViewById = view.findViewById(R.id.place_picker);
        if (true != c) {
            i = 8;
        }
        findViewById.setVisibility(i);
        if (c) {
            cdms cdmsVar3 = this.ai;
            dbsk.s(cdmsVar3);
            z<ilo> zVar = cdmsVar3.d;
            cdnd cdndVar = this.ao;
            dbsk.s(cdndVar);
            a2.d(zVar, cdndVar.a, cdlt.a);
            a2.c(this.ao.d, this.ai.d);
        }
        cdms cdmsVar4 = this.ai;
        dbsk.s(cdmsVar4);
        z<ilo> zVar2 = cdmsVar4.d;
        cdog cdogVar = this.ap;
        dbsk.s(cdogVar);
        a2.c(zVar2, cdogVar.d);
        dbsk.s(this.ah);
        a2.e(this.ai.e, new aa(this) { // from class: cdls
            private final cdlu a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dbsg dbsgVar;
                dbsg dbsgVar2;
                cdlu cdluVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return;
                }
                EditText editText = cdluVar.ak;
                dbsk.s(editText);
                editText.requestFocus();
                cdluVar.ak.post(new Runnable(cdluVar) { // from class: cdlq
                    private final cdlu a;

                    {
                        this.a = cdluVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cdlu cdluVar2 = this.a;
                        EditText editText2 = cdluVar2.ak;
                        dbsk.s(editText2);
                        editText2.setSelection(cdluVar2.ak.getText().length());
                        ((InputMethodManager) cdluVar2.J().getSystemService("input_method")).showSoftInput(cdluVar2.ak, 1);
                    }
                });
                cdms cdmsVar5 = cdluVar.ai;
                dbsk.s(cdmsVar5);
                cdkv cdkvVar3 = cdluVar.am;
                dbsk.s(cdkvVar3);
                int i2 = cdkvVar3.a.b;
                if (i2 != 0) {
                    dbsgVar = dbsg.i(Float.valueOf(i2));
                } else {
                    dbsgVar = dbpy.a;
                }
                final cdkb<Float> cdkbVar2 = cdmsVar5.g;
                cdkbVar2.getClass();
                bvor.a(dbsgVar, new mw(cdkbVar2) { // from class: cdlz
                    private final cdkb a;

                    {
                        this.a = cdkbVar2;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        this.a.g((Float) obj2);
                    }
                });
                if (!cdkvVar3.a.g.isEmpty()) {
                    dbsgVar2 = dbsg.i(cdkvVar3.a.g);
                } else {
                    dbsgVar2 = dbpy.a;
                }
                final cdkb<CharSequence> cdkbVar3 = cdmsVar5.f;
                cdkbVar3.getClass();
                bvor.a(dbsgVar2, new mw(cdkbVar3) { // from class: cdma
                    private final cdkb a;

                    {
                        this.a = cdkbVar3;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj2) {
                        this.a.g((String) obj2);
                    }
                });
                cdmsVar5.p.g(false);
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        if (!this.al) {
            cdjd aJ = aJ(3);
            if (!cebu.d(aJ)) {
                return;
            }
            w(aJ, false);
        }
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        g();
        return true;
    }

    public final void g() {
        StructuredQuestionAnswer h;
        dbsg dbsgVar;
        if (!this.aD) {
            return;
        }
        if (!this.al) {
            cdms cdmsVar = this.ai;
            dbsk.s(cdmsVar);
            CharSequence h2 = cdmsVar.f.h();
            dbsk.s(h2);
            if (h2.toString().isEmpty() && ((h = this.ai.n.h()) == null || h.a().D())) {
                cdjd h3 = this.ai.i.h();
                dbsk.s(h3);
                cdjb a = h3.a();
                if (a.c().equals(cdja.DRAFT)) {
                    dbsgVar = dbsg.i(a.g());
                } else {
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    cdjd aJ = aJ(3);
                    dbsk.s(this.f);
                    dbsk.s(this.e);
                    cdnk cdnkVar = this.e;
                    cdsa cdsaVar = (cdsa) aJ;
                    String g = cdsaVar.a.g();
                    cdja cdjaVar = cdja.DRAFT;
                    cdkv cdkvVar = this.am;
                    dbsk.s(cdkvVar);
                    dnqh dnqhVar = cdkvVar.b;
                    dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
                    dsqpVar.bC(dnqhVar);
                    dnqg dnqgVar = (dnqg) dsqpVar;
                    String c = cdsaVar.a.h().c("");
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar2 = (dnqh) dnqgVar.b;
                    dnqh dnqhVar3 = dnqh.p;
                    c.getClass();
                    dnqhVar2.a |= 8;
                    dnqhVar2.e = c;
                    deaf deafVar = deaf.BACK_BUTTON;
                    if (dnqgVar.c) {
                        dnqgVar.bF();
                        dnqgVar.c = false;
                    }
                    dnqh dnqhVar4 = (dnqh) dnqgVar.b;
                    dnqhVar4.h = deafVar.Q;
                    dnqhVar4.a |= 128;
                    dnqh bK = dnqgVar.bK();
                    cdms cdmsVar2 = this.ai;
                    dbsk.s(cdmsVar2);
                    ilo h4 = cdmsVar2.d.h();
                    dbsk.s(h4);
                    cdnkVar.b(g, cdjaVar, bK, h4, new mw(this) { // from class: cdli
                        private final cdlu a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.mw
                        public final void a(Object obj) {
                            cdlu cdluVar = this.a;
                            cdms cdmsVar3 = cdluVar.ai;
                            dbsk.s(cdmsVar3);
                            cdmsVar3.d.g((ilo) obj);
                            cdmx cdmxVar = cdluVar.f;
                            dbsk.s(cdmxVar);
                            cdmxVar.b();
                            cdluVar.q(4);
                        }
                    }, new Runnable(this) { // from class: cdlj
                        private final cdlu a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cdlu cdluVar = this.a;
                            cdmx cdmxVar = cdluVar.f;
                            dbsk.s(cdmxVar);
                            cdmxVar.c();
                            cdluVar.q(6);
                        }
                    });
                    return;
                }
            }
            cdjd aJ2 = aJ(3);
            if (cebu.d(aJ2)) {
                w(aJ2, true);
                return;
            }
        }
        q(5);
    }

    public final void i(final View view) {
        jmw.d(K(), null);
        cdjd aJ = aJ(2);
        if (((cdsa) aJ).b.e().c(0).intValue() <= 0) {
            bqrv bqrvVar = this.g;
            dbsk.s(bqrvVar);
            bqrvVar.c(new bquu(this) { // from class: cdla
                private final cdlu a;

                {
                    this.a = this;
                }

                @Override // defpackage.bquu
                public final void a(int i) {
                    cdms cdmsVar = this.a.ai;
                    dbsk.s(cdmsVar);
                    cdmsVar.g.g(Float.valueOf(i));
                }
            });
            return;
        }
        cdmx cdmxVar = this.f;
        dbsk.s(cdmxVar);
        final ProgressDialog a = cdmxVar.a(Rp(R.string.SENDING));
        cdnk cdnkVar = this.e;
        dbsk.s(cdnkVar);
        cdms cdmsVar = this.ai;
        dbsk.s(cdmsVar);
        ilo h = cdmsVar.d.h();
        dbsk.s(h);
        cdkv cdkvVar = this.am;
        dbsk.s(cdkvVar);
        cdnkVar.a(aJ, h, cdkvVar.b, this.am.b(), this.am.a(), new mw(this, a) { // from class: cdlb
            private final cdlu a;
            private final ProgressDialog b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                cdlu cdluVar = this.a;
                this.b.dismiss();
                cdms cdmsVar2 = cdluVar.ai;
                dbsk.s(cdmsVar2);
                cdmsVar2.d.g((ilo) obj);
                cdluVar.q(1);
            }
        }, new Runnable(this, a, view) { // from class: cdlc
            private final cdlu a;
            private final ProgressDialog b;
            private final View c;

            {
                this.a = this;
                this.b = a;
                this.c = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cdlu cdluVar = this.a;
                ProgressDialog progressDialog = this.b;
                final View view2 = this.c;
                progressDialog.dismiss();
                cdmx cdmxVar2 = cdluVar.f;
                dbsk.s(cdmxVar2);
                Runnable runnable = new Runnable(cdluVar, view2) { // from class: cdld
                    private final cdlu a;
                    private final View b;

                    {
                        this.a = cdluVar;
                        this.b = view2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i(this.b);
                    }
                };
                Runnable runnable2 = new Runnable(cdluVar) { // from class: cdle
                    private final cdlu a;

                    {
                        this.a = cdluVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.q(6);
                    }
                };
                cdmv cdmvVar = new cdmv(runnable);
                cdmw cdmwVar = new cdmw(runnable2);
                gcz a2 = cdmxVar2.c.a();
                a2.d(R.string.SUBMIT_REVIEW_RETRY);
                cjta b = cjtd.b();
                b.g = cdmxVar2.a.n();
                b.d = dtyf.J;
                a2.i = b.a();
                cjta b2 = cjtd.b();
                b2.g = cdmxVar2.a.n();
                b2.d = dtyf.O;
                a2.h(R.string.YES_BUTTON, b2.a(), new cdmt(cdmvVar));
                cjta b3 = cjtd.b();
                b3.g = cdmxVar2.a.n();
                b3.d = dtyf.N;
                a2.e(R.string.NO_BUTTON, b3.a(), new cdmu(cdmwVar));
                a2.b();
            }
        });
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        fd cdnmVar;
        super.l(bundle);
        try {
            bwqv bwqvVar = this.a;
            dbsk.s(bwqvVar);
            bwrs<ilo> e = bwqvVar.e(ilo.class, this.o, "PLACEMARK_REF");
            dbsk.s(e);
            this.an = e;
            cdkw cdkwVar = this.ag;
            dbsk.s(cdkwVar);
            cdpd cdpdVar = (cdpd) bvrs.g(this.o, cdpd.class.getName(), (dssr) cdpd.l.cu(7), cdpd.l);
            dnqh dnqhVar = (dnqh) bvrs.g(this.o, dnqh.class.getName(), (dssr) dnqh.p.cu(7), bzwi.c(blpk.UNKNOWN));
            bbtu a = cdkwVar.a.a();
            cdkw.a(a, 1);
            eaou a2 = cdkwVar.b.a();
            cdkw.a(a2, 2);
            cdkw.a(cdpdVar, 3);
            cdkw.a(dnqhVar, 4);
            this.am = new cdkv(a, a2, cdpdVar, dnqhVar);
            cdnk cdnkVar = this.e;
            dbsk.s(cdnkVar);
            cdpb b = cdpb.b(this.am.a.d);
            if (b == null) {
                b = cdpb.UNKNOWN_ACTION_ON_THANKS_PAGE;
            }
            cdnkVar.a.b = cdnkVar.b.k().NV(b);
            au auVar = new au(this);
            this.ai = (cdms) auVar.a(cdms.class);
            this.aj = (cdxx) auVar.a(cdxx.class);
            this.ao = (cdnd) auVar.a(cdnd.class);
            this.ap = (cdog) auVar.a(cdog.class);
            this.aq = (cdkq) auVar.a(cdkq.class);
            btvo btvoVar = this.d;
            dbsk.s(btvoVar);
            int bf = btvoVar.getUgcParameters().bf();
            this.aj.i.g(bf == 0 ? dbpy.a : dbsg.i(Integer.valueOf(bf)));
            this.aq.f = this.am;
            z<ilo> zVar = this.ai.d;
            bwrs<ilo> bwrsVar = this.an;
            dbsk.s(bwrsVar);
            ilo c = bwrsVar.c();
            dbsk.s(c);
            zVar.g(c);
            this.ai.o.b(this, new aa(this) { // from class: cdkx
                private final cdlu a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    this.a.al = ((Boolean) obj).booleanValue();
                }
            });
            cebd cebdVar = this.c;
            dbsk.s(cebdVar);
            cdvv a3 = cdvv.a(this, cebdVar);
            a3.e(this.ai.d, new aa(this) { // from class: cdlh
                private final cdlu a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    cdlu cdluVar = this.a;
                    ilo iloVar = (ilo) obj;
                    cdmx cdmxVar = cdluVar.f;
                    dbsk.s(cdmxVar);
                    akqi ai = iloVar.ai();
                    dzvx.c(ai, "<set-?>");
                    cdmxVar.a = ai;
                    bwrs<ilo> bwrsVar2 = cdluVar.an;
                    dbsk.s(bwrsVar2);
                    bwrsVar2.d(iloVar);
                }
            });
            a3.d(this.ai.i, this.aq.d, cdln.a);
            a3.c(this.ai.o, this.aq.a);
            a3.c(this.ai.d, this.aq.e);
            a3.c(this.aq.g, this.ai.d);
            z<dcdc<MediaData>> zVar2 = this.ai.l;
            final cdxx cdxxVar = this.aj;
            cdxxVar.getClass();
            a3.e(zVar2, new aa(cdxxVar) { // from class: cdlo
                private final cdxx a;

                {
                    this.a = cdxxVar;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    cdxx cdxxVar2 = this.a;
                    cdxxVar2.f.g(dcdc.e());
                    cdxxVar2.e.g((dcdc) obj);
                }
            });
            a3.c(this.aj.g, this.ai.h);
            cdxx cdxxVar2 = this.aj;
            dbsk.s(cdxxVar2);
            a3.e(cdxxVar2.d, new aa(this) { // from class: cdlp
                private final cdlu a;

                {
                    this.a = this;
                }

                @Override // defpackage.aa
                public final void m(Object obj) {
                    cdlu cdluVar = this.a;
                    cdwq cdwqVar = (cdwq) obj;
                    int a4 = cdwqVar.a();
                    int i = a4 - 1;
                    if (a4 != 0) {
                        if (i == 4) {
                            cdwp c2 = cdwqVar.c();
                            if (c2.b()) {
                                return;
                            }
                            cdxx cdxxVar3 = cdluVar.aj;
                            dbsk.s(cdxxVar3);
                            Uri a5 = c2.a();
                            cdxx.e(a5, cdxxVar3.e);
                            cdxx.e(a5, cdxxVar3.f);
                            return;
                        } else if (i != 6) {
                            return;
                        } else {
                            cdwm b2 = cdwqVar.b();
                            cdxx cdxxVar4 = cdluVar.aj;
                            dbsk.s(cdxxVar4);
                            Uri a6 = b2.a();
                            String b3 = b2.b();
                            cdxx.f(a6, b3, cdxxVar4.e);
                            cdxx.f(a6, b3, cdxxVar4.f);
                            return;
                        }
                    }
                    throw null;
                }
            });
            dbsk.s(this.ah);
            caxn caxnVar = this.ad;
            dbsk.s(caxnVar);
            if (caxnVar.a) {
                cdnmVar = new cdnq();
            } else {
                cdnmVar = new cdnm();
            }
            gz b2 = R().b();
            b2.w(R.id.profileBar, cdnmVar);
            cdkv cdkvVar = this.am;
            dbsk.s(cdkvVar);
            if (cdkvVar.c()) {
                dlif dlifVar = this.am.a.e;
                if (dlifVar == null) {
                    dlifVar = dlif.d;
                }
                cdnc cdncVar = new cdnc();
                Bundle bundle2 = new Bundle();
                bvrs.l(bundle2, dlifVar);
                cdncVar.B(bundle2);
                b2.w(R.id.place_picker, cdncVar);
            }
            b2.f();
        } catch (IOException e2) {
            throw new IllegalStateException("Could not retrieve Placemark", e2);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.nJ;
    }

    public final void q(int i) {
        cdlv cdlvVar = this.af;
        dbsk.s(cdlvVar);
        bwrs<ilo> bwrsVar = this.an;
        dbsk.s(bwrsVar);
        cdkv cdkvVar = this.am;
        dbsk.s(cdkvVar);
        cdlvVar.a(i, bwrsVar, cdkvVar.d().f(), cdlu.class);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        efgVar.a(egjVar.a());
    }
}
