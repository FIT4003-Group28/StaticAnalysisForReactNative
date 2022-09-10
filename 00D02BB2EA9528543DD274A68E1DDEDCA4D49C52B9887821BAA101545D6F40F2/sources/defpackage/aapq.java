package defpackage;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: aapq  reason: default package */
/* loaded from: classes2.dex */
public class aapq implements aape {
    private static final int m = 2;
    public final gga a;
    @dzsi
    public final Bitmap b;
    private final aapl c;
    private final dxio<aaps> d;
    private final List<drlo> e;
    private final diwb f;
    private final cklf g;
    private final dcdc<aapd> h;
    private final dxio<caym> i;
    private final cbqg j;
    private final dxio<akge> k;
    private boolean l = false;

    public aapq(drlp drlpVar, diwb diwbVar, @dzsi Bitmap bitmap, gga ggaVar, aapl aaplVar, cklf cklfVar, dxio<caym> dxioVar, cbqg cbqgVar, dxio<akge> dxioVar2, dxio<aaps> dxioVar3) {
        dsrj<drlo> dsrjVar = drlpVar.a;
        this.e = dsrjVar;
        dccx F = dcdc.F();
        for (final int i = 0; i < dsrjVar.size(); i++) {
            F.g(new aapi(dsrjVar.get(i), new Runnable(this, i) { // from class: aapm
                private final aapq a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h(this.b);
                }
            }));
        }
        this.h = F.f();
        this.d = dxioVar3;
        this.f = diwbVar;
        this.c = aaplVar;
        this.a = ggaVar;
        this.g = cklfVar;
        this.b = bitmap;
        this.i = dxioVar;
        this.j = cbqgVar;
        this.k = dxioVar2;
    }

    @Override // defpackage.aape
    public List<aapd> a() {
        return this.h;
    }

    @Override // defpackage.aape
    public cqkl b() {
        this.g.a("prohibited_contributed_content");
        return cqkl.a;
    }

    @Override // defpackage.aape
    public cqkl c() {
        this.i.a().a();
        return cqkl.a;
    }

    @Override // defpackage.aape
    public cqkl d() {
        caym a = this.i.a();
        dijn dijnVar = this.f.I;
        if (dijnVar == null) {
            dijnVar = dijn.e;
        }
        dive diveVar = this.f.v;
        if (diveVar == null) {
            diveVar = dive.d;
        }
        a.b(dijnVar, diveVar);
        return cqkl.a;
    }

    @Override // defpackage.aape
    public Boolean e() {
        return Boolean.valueOf(this.j.a());
    }

    @Override // defpackage.aape
    public Boolean f() {
        boolean z = false;
        if (e().booleanValue() && (this.f.b & 32) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aape
    public jib g() {
        gga ggaVar = this.a;
        jhz e = jib.g(ggaVar, ggaVar.getString(R.string.EXPERIENCE_SHEET_SEND_FEEDBACK)).e();
        e.f(new View.OnClickListener(this) { // from class: aapn
            private final aapq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gga ggaVar2 = this.a.a;
                if (ggaVar2 != null) {
                    ggaVar2.onBackPressed();
                }
            }
        });
        ditt dittVar = this.f.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        e.b = dittVar.f;
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.getString(R.string.EXPERIENCE_FEEDBACK_NEXT_BUTTON);
        jhmVar.d = ibm.x();
        jhmVar.h = 1;
        jhmVar.n = this.l;
        jhmVar.d(new View.OnClickListener(this) { // from class: aapo
            private final aapq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j();
            }
        });
        cjta b = cjtd.b();
        b.d = dtxo.ck;
        ditt dittVar2 = this.f.e;
        if (dittVar2 == null) {
            dittVar2 = ditt.n;
        }
        b.g(dittVar2.b);
        jhmVar.f = b.a();
        e.c(jhmVar.c());
        e.E = 2;
        return e.b();
    }

    public void h(int i) {
        if (i < 0 || i > this.e.size() - 1) {
            throw new IllegalArgumentException("Index supplied outside of bounds.");
        }
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < this.h.size()) {
                aapd aapdVar = this.h.get(i2);
                if (i2 != i) {
                    z = false;
                }
                aapdVar.d(z);
                i2++;
            } else {
                this.l = true;
                cqkx.p(this);
                return;
            }
        }
    }

    @dzsi
    public drlo i() {
        for (int i = 0; i < this.h.size(); i++) {
            if (this.h.get(i).c().booleanValue()) {
                return this.e.get(i);
            }
        }
        return null;
    }

    public cqkl j() {
        gn g;
        drlo i = i();
        if (i == null) {
            return cqkl.a;
        }
        int a = drln.a(i.b);
        if ((a == 0 || a != 5) && (g = this.a.g()) != null) {
            g.f();
        }
        int a2 = drln.a(i.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 1) {
            int a3 = drkn.a(i.c);
            if (a3 == 0) {
                a3 = 1;
            }
            aapl aaplVar = this.c;
            dijy bZ = dijz.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dijz dijzVar = (dijz) bZ.b;
            dijzVar.b = a3 - 1;
            int i3 = dijzVar.a | 1;
            dijzVar.a = i3;
            String str = this.f.c;
            str.getClass();
            dijzVar.a = i3 | 2;
            dijzVar.c = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dijz dijzVar2 = (dijz) bZ.b;
            dijzVar2.d = 1;
            dijzVar2.a |= 4;
            String uuid = UUID.randomUUID().toString();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dijz dijzVar3 = (dijz) bZ.b;
            uuid.getClass();
            dijzVar3.a |= 32;
            dijzVar3.f = uuid;
            dnqg bZ2 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.l = dnmuVar.ap;
            int i4 = dnqhVar.a | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dnqhVar.a = i4;
            dnqhVar.a = i4 | 2048;
            dnqhVar.j = false;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dijz dijzVar4 = (dijz) bZ.b;
            dnqh bK = bZ2.bK();
            bK.getClass();
            dijzVar4.e = bK;
            dijzVar4.a |= 8;
            dijz bK2 = bZ.bK();
            aapl.a(bK2, 1);
            gga a4 = aaplVar.a.a();
            aapl.a(a4, 2);
            cqkj a5 = aaplVar.b.a();
            aapl.a(a5, 3);
            aaph a6 = aaplVar.c.a();
            aapl.a(a6, 4);
            busw a7 = aaplVar.d.a();
            aapl.a(a7, 5);
            aapk aapkVar = new aapk(bK2, a4, a5, a6, a7);
            ProgressDialog progressDialog = aapkVar.c;
            if (progressDialog == null || !progressDialog.isShowing()) {
                aapkVar.c = new ProgressDialog(aapkVar.a, 0);
                aapkVar.c.setMessage(aapkVar.a.getString(R.string.SENDING));
                aapkVar.c.show();
            }
            aapkVar.d.a(aapkVar.b, new aapj(aapkVar), bvrj.UI_THREAD);
        } else if (i2 == 2) {
            this.d.a().a(this.f, this.b != null ? new aapp(this) : null, false);
        } else if (i2 == 3) {
            this.g.a("legal");
        } else if (i2 == 4) {
            this.k.a().b(akgc.a(this.f), dnqb.EXPERIENCE_STRUCTURED_FEEDBACK);
        }
        return cqkl.a;
    }
}
