package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: cfhv  reason: default package */
/* loaded from: classes4.dex */
public class cfhv extends cfje implements cfgy {
    public final cfgv a;
    public final dspd b;
    public final cfjm c;
    public final mw<Boolean> d;
    public CharSequence e;
    private final dddi f;
    private final dlle g;

    public cfhv(cfgv cfgvVar, dddi dddiVar, dspd dspdVar, dlle dlleVar, cfjm cfjmVar, mw<Boolean> mwVar) {
        this.a = cfgvVar;
        this.f = dddiVar;
        this.b = dspdVar;
        this.g = dlleVar;
        this.c = cfjmVar;
        this.d = mwVar;
        String str = (String) cfgvVar.e(dspdVar).h(cfgr.a).c("");
        this.e = str;
        mwVar.a(Boolean.valueOf(str.toString().trim().isEmpty()));
    }

    @Override // defpackage.cfgy
    public Spanned a() {
        return Html.fromHtml(this.g.a);
    }

    @Override // defpackage.cfgy
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.cfgy
    public String c() {
        return this.g.b;
    }

    @Override // defpackage.cfgy
    @dzsi
    public String d() {
        return null;
    }

    @Override // defpackage.cfgy
    public cqgl e() {
        return new cqgl(this) { // from class: cfht
            private final cfhv a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                cfhv cfhvVar = this.a;
                cfhvVar.e = charSequence;
                cfgv cfgvVar = cfhvVar.a;
                dspd dspdVar = cfhvVar.b;
                String charSequence2 = cfhvVar.e.toString();
                cfga bZ = cfgd.h.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ.b;
                charSequence2.getClass();
                cfgdVar.a |= 8;
                cfgdVar.g = charSequence2;
                cfgvVar.f(dspdVar, bZ.bK());
                cfhvVar.d.a(Boolean.valueOf(cfhvVar.e.toString().trim().isEmpty()));
                cqkx.p(cfhvVar);
            }
        };
    }

    @Override // defpackage.cfgy
    public TextView.OnEditorActionListener f() {
        return new jmm(new jml(this) { // from class: cfhu
            private final cfhv a;

            {
                this.a = this;
            }

            @Override // defpackage.jml
            public final void a(CharSequence charSequence) {
                cfhv cfhvVar = this.a;
                dbsg i = dbsg.i(cfhvVar.e.toString().trim());
                cfga bZ = cfgd.h.bZ();
                String str = (String) ((dbsu) i).a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cfgd cfgdVar = (cfgd) bZ.b;
                str.getClass();
                cfgdVar.a |= 8;
                cfgdVar.g = str;
                cfhvVar.c.a(bZ.bK());
            }
        });
    }

    @Override // defpackage.cfgy
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxy.nT;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddiVar.getClass();
        dddgVar.d = dddiVar;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }
}
