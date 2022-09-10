package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bsrh  reason: default package */
/* loaded from: classes4.dex */
public class bsrh implements bsss {
    private static final dspd a;
    private final dnxl b;
    private final dxio<afha> c;
    private final bsjm d;
    @dzsi
    private final brzc e;
    private final Context f;
    private final bvsx g;
    private final cjtd h;

    static {
        djmu bZ = djmv.c.bZ();
        djlf bZ2 = djlh.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djlh djlhVar = (djlh) bZ2.b;
        djlhVar.b = 1;
        djlhVar.a = 1 | djlhVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djlh bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 25;
        a = bZ.bK().bR();
    }

    public bsrh(Context context, brlu brluVar, dxio<afha> dxioVar, @dzsi brzc brzcVar) {
        this.f = context;
        this.g = new bvsx(context.getResources());
        this.d = brluVar.o;
        this.e = brzcVar;
        this.c = dxioVar;
        dhjz dhjzVar = brluVar.x().b;
        akqq j = akqq.j(dhjzVar == null ? dhjz.e : dhjzVar);
        for (int i = 0; i < brluVar.E(); i++) {
            ilo d = brluVar.D(i).d();
            if (d != null && j != null) {
                akqq aj = d.aj();
                if ((d.h().c & ImageMetadata.SHADING_MODE) != 0 && aj != null && akqo.e(aj, j) < 50000.0d) {
                    dnxl dnxlVar = d.h().aJ;
                    dnxlVar = dnxlVar == null ? dnxl.i : dnxlVar;
                    this.b = dnxlVar;
                    cjta b = cjtd.b();
                    b.d = dtyb.bk;
                    int i2 = dnxlVar.a;
                    if ((i2 & 2) != 0 && (i2 & 4) != 0) {
                        b.b = dnxlVar.b;
                        b.g(dnxlVar.c);
                    }
                    this.h = b.a();
                    return;
                }
            }
        }
        this.b = dnxl.i;
        this.h = cjtd.b;
    }

    private final boolean h() {
        dnpq dnpqVar = this.b.f;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return !dnpqVar.c.isEmpty();
    }

    private final boolean i() {
        return this.b.h && this.d.l(40, a);
    }

    @Override // defpackage.befi
    public String a() {
        return this.b.d;
    }

    @Override // defpackage.befi
    @dzsi
    public cqsn b() {
        CharSequence charSequence;
        if (!this.b.e.isEmpty()) {
            if (i()) {
                bvsu b = this.g.b("%s %s");
                bvsu c = this.g.c(R.string.VIEW_HOTELS_CALL_TO_ACTION);
                c.l(ibm.x().b(this.f));
                b.a(this.b.e, c.c());
                charSequence = b.c();
            } else {
                charSequence = this.b.e;
            }
            return cqsk.a(charSequence);
        }
        return null;
    }

    @Override // defpackage.befi
    public dpwt c() {
        dpwt b = dpwt.b(this.b.g);
        return b == null ? dpwt.EVENT_CATEGORY_UNKNOWN : b;
    }

    @Override // defpackage.befi
    public cqkl d(cjqm cjqmVar) {
        if (h()) {
            afha a2 = this.c.a();
            dnpq dnpqVar = this.b.f;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            a2.m(dnpqVar.c, 1);
        } else if (i() && this.e != null) {
            this.d.u(40, a, 2);
            ((brca) this.e).b(this.d, ddda.aA, cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.befi
    public Boolean e() {
        boolean z = true;
        if (!h() && !i()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.befi
    public cjtd f() {
        return this.h;
    }

    @Override // defpackage.bsss
    public Boolean g() {
        boolean z = true;
        if (this.b.d.isEmpty() && this.b.e.isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
