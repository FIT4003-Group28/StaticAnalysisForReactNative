package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ceuf  reason: default package */
/* loaded from: classes4.dex */
public class ceuf implements cesj {
    public final dhtb a;
    public final ceue b;
    private final gga c;
    private final dxio<akfa> d;
    private final awnm e;
    private final btvo f;
    private final cese g;
    private final String h;
    @dzsi
    private jib i;
    private boolean j = false;
    private final View.OnFocusChangeListener k = new ceuc();

    public ceuf(gga ggaVar, dxio<akfa> dxioVar, awnm awnmVar, cqhn cqhnVar, btvo btvoVar, cese ceseVar, dhtc dhtcVar, String str, ceue ceueVar) {
        this.c = ggaVar;
        this.d = dxioVar;
        this.e = awnmVar;
        this.f = btvoVar;
        this.g = ceseVar;
        dsqp dsqpVar = (dsqp) dhtcVar.cu(5);
        dsqpVar.bC(dhtcVar);
        this.a = (dhtb) dsqpVar;
        this.h = str;
        this.b = ceueVar;
    }

    private final jib p() {
        gga ggaVar = this.c;
        jhz e = jib.g(ggaVar, ggaVar.getString(R.string.CREATOR_PROFILE_EDIT_PAGE_TITLE_TEXT)).e();
        jhm jhmVar = new jhm();
        jhmVar.h = 1;
        jhmVar.a = this.c.getString(R.string.SAVE);
        jhmVar.f = cjtd.a(dtxo.p);
        if (q()) {
            jhmVar.d = ibm.x();
            jhmVar.d(new View.OnClickListener(this) { // from class: ceua
                private final ceuf a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b.i();
                }
            });
            this.j = true;
        } else {
            jhmVar.d = ibm.n();
            jhmVar.n = false;
            this.j = false;
        }
        e.c(jhmVar.c());
        e.x = false;
        e.o = cjtd.a(dtxo.m);
        e.F = 1;
        return e.b();
    }

    private final boolean q() {
        return !h().equals(this.h);
    }

    @Override // defpackage.jbk
    public jib NC() {
        if (q() != this.j) {
            this.i = p();
        }
        if (this.i == null) {
            this.i = p();
        }
        return this.i;
    }

    @Override // defpackage.cesj
    public cqkl b() {
        String o = this.d.a().o();
        if (o == null) {
            o = "";
        }
        this.e.e(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 10003).putExtra("extra.accountName", o), new ceud());
        return cqkl.a;
    }

    @Override // defpackage.cesj
    public cqgl c() {
        return new cqgl(this) { // from class: ceub
            private final ceuf a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                ceuf ceufVar = this.a;
                dhtb dhtbVar = ceufVar.a;
                String charSequence2 = charSequence.toString();
                if (dhtbVar.c) {
                    dhtbVar.bF();
                    dhtbVar.c = false;
                }
                dhtc dhtcVar = (dhtc) dhtbVar.b;
                dhtc dhtcVar2 = dhtc.l;
                charSequence2.getClass();
                dhtcVar.a |= 2;
                dhtcVar.c = charSequence2;
                cqkx.p(ceufVar);
            }
        };
    }

    @Override // defpackage.cesj
    public View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.cesj
    public jic e() {
        dqkn dqknVar = ((dhtc) this.a.b).b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        return new jic(dqknVar.c, ckqc.FIFE_MERGE, (cqtd) null, 0);
    }

    @Override // defpackage.cesj
    public String f() {
        dqkn dqknVar = ((dhtc) this.a.b).b;
        if (dqknVar == null) {
            dqknVar = dqkn.e;
        }
        return dqknVar.b;
    }

    @Override // defpackage.cesj
    public String g() {
        return ((dhtc) this.a.b).g;
    }

    @Override // defpackage.cesj
    public String h() {
        return ((dhtc) this.a.b).c;
    }

    @Override // defpackage.cesj
    public Integer i() {
        return Integer.valueOf(this.f.getCreatorProfileParameters().b);
    }

    @Override // defpackage.cesj
    public String j() {
        return n().booleanValue() ? this.c.getString(R.string.EDIT_PROFILE_PAGE_PROFILE_SETTING_LINK) : "";
    }

    @Override // defpackage.cesj
    public Integer k() {
        return Integer.valueOf(((int) (((float) this.c.getResources().getDisplayMetrics().widthPixels) / this.c.getResources().getDisplayMetrics().density)) > 500 ? 8388611 : 17);
    }

    @Override // defpackage.cesj
    public cqkl l() {
        bszv.ba(this.c, btki.aU(3));
        return cqkl.a;
    }

    @Override // defpackage.cesj
    public cjtd m() {
        return cjtd.a(dtxo.q);
    }

    @Override // defpackage.cesj
    public Boolean n() {
        return Boolean.valueOf(this.g.b());
    }

    public dhtc o() {
        return this.a.bK();
    }
}
