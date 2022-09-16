package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abab  reason: default package */
/* loaded from: classes2.dex */
public class abab implements aazp {
    public boolean a;
    private final gga b;
    private final bvjj c;
    private final gfw d;
    private final dxio<bbut> e;
    private final dxio<bdhl> f;
    private final diwb g;
    @dzsi
    private final btlu h;
    private final jlp i;

    public abab(gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, bvjj bvjjVar, dxio<bbut> dxioVar, dxio<bdhl> dxioVar2, akfa akfaVar, jlp jlpVar, gfw gfwVar, diwb diwbVar) {
        this.b = ggaVar;
        this.c = bvjjVar;
        this.d = gfwVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = diwbVar;
        this.i = jlpVar;
        this.h = akfaVar.j();
    }

    @Override // defpackage.aazp
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.aazp
    public void b() {
        if (!this.c.o(bvjk.jo, this.h, false)) {
            for (View view : cqkx.n(this)) {
                View a = cqhu.a(view, aakp.a);
                if (a != null && a.getVisibility() == 0) {
                    c(a);
                }
            }
        }
    }

    public void c(View view) {
        this.a = true;
        this.c.T(bvjk.jo, this.h, true);
        jlp jlpVar = this.i;
        String string = this.b.getString(R.string.SUGGEST_PHOTO_TOOLTIP);
        dbuh.d(view);
        jlo a = jlpVar.a(string, view);
        a.b(jmj.a(this.b, 2));
        a.i();
        a.p();
        a.m(5000);
        a.o(true);
        a.t(jln.GM2_BLUE);
        a.a();
    }

    @Override // defpackage.jaf
    public Boolean e() {
        throw null;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.g.x.size() > 0) {
            bdhl a = this.f.a();
            gfw gfwVar = this.d;
            diwb diwbVar = this.g;
            divy divyVar = diwbVar.x.get(0);
            bdhe k = bdhg.k();
            k.c(divyVar.a);
            bdhb bdhbVar = (bdhb) k;
            bdhbVar.a = diwbVar.c;
            k.g(this.b.getString(R.string.SUGGEST_PHOTOS_BUTTON));
            k.b(dwyd.EXPERIENCE_SHEET);
            ditt dittVar = diwbVar.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            k.f(dittVar.f);
            bdhbVar.c = this.b.getString(R.string.SUGGEST_PHOTO_FROM_A_PLACE, new Object[]{divyVar.b});
            bdhbVar.d = 2;
            a.e(gfwVar, k.a());
        } else {
            ily ilyVar = new ily();
            dvya bZ = dvyw.bv.bZ();
            String str = this.g.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar = (dvyw) bZ.b;
            str.getClass();
            dvywVar.a |= 8;
            dvywVar.h = str;
            ilyVar.E(bZ.bK());
            ilo d = ilyVar.d();
            bbuz m = bbve.m();
            m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
            m.e(dwyd.EXPERIENCE_SHEET);
            ((bbsu) m).b = d;
            this.e.a().j(m.a());
        }
        return cqkl.a;
    }
}
