package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cedh  reason: default package */
/* loaded from: classes4.dex */
public class cedh implements ceby {
    public static final ddho a = dtyb.cC;
    public final blhs c;
    public final blly d;
    public bwrs<ilo> f;
    private final blln g;
    private final gga h;
    private final gfq i;
    private jib j;
    private ggg l;
    private final blhp n;
    public final List<blla> b = dchl.a();
    public Boolean e = false;
    private final cqqw k = new cede(this);
    private final View.OnAttachStateChangeListener m = new cedf(this);

    public cedh(blht blhtVar, bllo blloVar, blly bllyVar, final gga ggaVar, gfq gfqVar) {
        cedg cedgVar = new cedg(this);
        this.n = cedgVar;
        blhs a2 = blhtVar.a(true, cdjk.PLACESHEET_SELF_POSTS);
        this.c = a2;
        this.g = blloVar.a(false, cdjk.PLACESHEET_SELF_POSTS, a);
        this.d = bllyVar;
        this.h = ggaVar;
        this.i = gfqVar;
        jhz a3 = jhz.a();
        a3.f(new View.OnClickListener(ggaVar) { // from class: cedd
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.onBackPressed();
            }
        });
        a3.x = false;
        a3.q = cqta.f();
        a3.d = ibq.E();
        this.j = a3.b();
        a2.c = cedgVar;
    }

    @Override // defpackage.ceby
    public jib a() {
        return this.j;
    }

    @Override // defpackage.ceby
    public List<blla> b() {
        return this.b;
    }

    @Override // defpackage.ceby
    public blkz c() {
        return this.g;
    }

    @Override // defpackage.ceby
    public Boolean d() {
        return Boolean.valueOf(this.c.g());
    }

    @Override // defpackage.ceby
    public Boolean e() {
        return this.e;
    }

    @Override // defpackage.ceby
    public View.OnAttachStateChangeListener f() {
        return this.m;
    }

    @Override // defpackage.ceby
    public cqqw g() {
        return this.k;
    }

    public void h(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            return;
        }
        cdqb cdqbVar = (cdqb) c.bn();
        if (cdqbVar.b.c().d(cdqbVar.b.b()).f() == null) {
            ggg gggVar = this.l;
            if (gggVar != null) {
                gfq.l(gggVar);
                return;
            } else {
                this.h.g().e();
                return;
            }
        }
        this.f = bwrsVar;
        this.c.a(c);
        this.g.r(bwrsVar);
        cqkx.p(this);
        jhz e = this.j.e();
        e.a = this.h.getString(R.string.YOUR_REVIEWS_AND_UPDATES_ABOUT_A_PLACE, new Object[]{c.n()});
        this.j = e.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends bqld & ggg> void i(T t) {
        this.l = t;
        this.g.t(t.getClass());
    }

    public void j(cdjh cdjhVar) {
        int d = cdjhVar.d();
        int i = d - 1;
        if (d != 0) {
            if (i != 0 && i != 1 && i != 2) {
                return;
            }
            h(cdjhVar.a());
            return;
        }
        throw null;
    }

    public void k(bqje bqjeVar) {
        int i = bqjeVar.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
                return;
            }
            h(bqjeVar.a);
            return;
        }
        throw null;
    }
}
