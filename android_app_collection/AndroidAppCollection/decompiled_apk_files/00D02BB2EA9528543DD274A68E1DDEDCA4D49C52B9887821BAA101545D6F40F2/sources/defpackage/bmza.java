package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmza  reason: default package */
/* loaded from: classes3.dex */
public class bmza {
    public final gga a;
    public final cjqy b;
    public final bwqv c;
    public final cqkj d;
    public final dxio<akfa> e;
    public final akfc f;
    public final bvrb g;
    public final ania h;
    public final cjxd i;
    public final awnm j;
    public final dxio<axwy> k;
    public final dxio<begg> l;
    public final aesb m;
    public final boxa n;
    public final afec o;
    public final dxio<afef> p;
    public final dxio<btvo> q;
    public final dxio<bzpz> r;
    @dzsi
    public bwrs<ilo> s;
    public final caym t;
    private final cjqq u;
    private final cbqg v;

    public bmza(gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, cbqg cbqgVar, caym caymVar, bwqv bwqvVar, cqkj cqkjVar, dxio dxioVar, akfc akfcVar, bvrb bvrbVar, ania aniaVar, cjxd cjxdVar, awnm awnmVar, dxio dxioVar2, dxio dxioVar3, aesb aesbVar, boxa boxaVar, afec afecVar, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6) {
        this.a = ggaVar;
        this.b = cjqyVar;
        this.u = cjqqVar;
        this.v = cbqgVar;
        this.t = caymVar;
        this.c = bwqvVar;
        this.d = cqkjVar;
        this.e = dxioVar;
        this.f = akfcVar;
        this.g = bvrbVar;
        this.h = aniaVar;
        this.i = cjxdVar;
        this.j = awnmVar;
        this.k = dxioVar2;
        this.l = dxioVar3;
        this.m = aesbVar;
        this.n = boxaVar;
        this.o = afecVar;
        this.p = dxioVar4;
        this.q = dxioVar5;
        this.r = dxioVar6;
    }

    public static boolean b(ilo iloVar) {
        if (iloVar.aQ() || iloVar.aR()) {
            return false;
        }
        return (!iloVar.aU() || !iloVar.aM()) && !iloVar.h().aE;
    }

    public final void a() {
        this.s = null;
    }

    public final ivc c(final boolean z, @dzsi final cjtd cjtdVar) {
        return new ivc(this, cjtdVar, z) { // from class: bmyx
            private final bmza a;
            private final cjtd b;
            private final boolean c;

            {
                this.a = this;
                this.b = cjtdVar;
                this.c = z;
            }

            @Override // defpackage.ivc
            public final void a(cjqm cjqmVar) {
                bmza bmzaVar = this.a;
                cjtd cjtdVar2 = this.b;
                boolean z2 = this.c;
                if (cjtdVar2 != null) {
                    bmzaVar.b.i(cjtdVar2);
                }
                if (bmzaVar.o.a()) {
                    afdt afdtVar = afdt.a;
                    bmzaVar.p.a().r();
                    return;
                }
                bmyy bmyyVar = new bmyy(bmzaVar, bmzaVar.a, bmzaVar.d, bmzaVar.b, bmzaVar.e, bmzaVar.f, bmzaVar.g, z2);
                if (!bmyyVar.f.a().c()) {
                    bmzw bmzwVar = new bmzw(bmyyVar.b.a);
                    bmzd bmzdVar = new bmzd(bmyyVar.c, bmyyVar.d, bmzwVar);
                    bmzwVar.k(new bnaa(bmzdVar));
                    bmzwVar.j(new bmzz(bmyyVar, bmzdVar));
                    bmzdVar.show();
                    return;
                }
                bmyyVar.a();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(jhz jhzVar) {
        final cjtd a;
        String string;
        ilo iloVar = (ilo) bwrs.b(this.s);
        if (iloVar == null || !b(iloVar)) {
            return;
        }
        if (iloVar.be() != iln.GEOCODE) {
            if (iloVar.bi()) {
                a = cjtd.a(dtxj.aU);
            } else {
                a = cjtd.a(dtxj.aS);
            }
            this.u.g().d(a);
            jhm jhmVar = new jhm();
            if (iloVar.bi()) {
                string = this.a.getString(R.string.EDIT_NICKNAME_MENU_TITLE);
            } else {
                string = this.a.getString(R.string.ADD_ALIAS_MENU_TITLE);
            }
            jhmVar.a = string;
            jhmVar.g = new jhn(this, a) { // from class: bmyu
                private final bmza a;
                private final cjtd b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // defpackage.jhn
                public final void a(View view, cjqm cjqmVar) {
                    this.a.c(false, this.b).a(cjqmVar);
                }
            };
            jhzVar.c(jhmVar.c());
        }
        btlu j = this.e.a().j();
        if (!akqi.d(iloVar.ai())) {
            return;
        }
        if (j != null && j.h) {
            return;
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.a.getString(R.string.ADD_CONTACT_MENU_TITLE);
        jhmVar2.g = new jhn(this) { // from class: bmyv
            private final bmza a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.c(true, cjtd.a(dtxj.aT)).a(cjqmVar);
            }
        };
        jhzVar.c(jhmVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(jhz jhzVar) {
        bwrs<ilo> bwrsVar = this.s;
        if (bwrsVar == null || bwrsVar.c() == null || !this.v.a()) {
            return;
        }
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.getString(R.string.UGC_EVENTS_ADD_EVENT);
        jhmVar.d(new View.OnClickListener(this) { // from class: bmyt
            private final bmza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bmza bmzaVar = this.a;
                bmzaVar.b.i(cjtd.a(dtxy.jR));
                caym caymVar = bmzaVar.t;
                bwrs<ilo> bwrsVar2 = bmzaVar.s;
                dbsk.s(bwrsVar2);
                bwqv bwqvVar = caymVar.b;
                cbei cbeiVar = new cbei();
                Bundle bundle = new Bundle();
                cctq.a(bundle, bwqvVar, bwrsVar2);
                cbeiVar.B(bundle);
                caymVar.a.D(cbeiVar);
            }
        });
        jhzVar.c(jhmVar.c());
    }
}
