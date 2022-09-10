package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdej  reason: default package */
/* loaded from: classes3.dex */
public class bdej extends bdbb implements bczz {
    private boolean A;
    private final bdat B;
    private final cjqy C;
    private final cjqq D;
    private final bwsh E;
    public final Activity f;
    @dzsi
    public final ilo g;
    public final bbuq h;
    public final bbty i;
    public final bcrq j;
    public final bcrs k;
    public final bcrt l;
    public final bdch m;
    boolean n;
    private final List<jbs> o;
    @dzsi
    private final String p;
    private final boolean q;
    private final ckcw r;
    @dzsi
    private final cqtd s;
    private final bvrb t;
    private final bdfe u;
    private final bdbx v;
    private final ckmm w;
    @dzsi
    private final bcrr x;
    private final bdcj y;
    private final bddb z;

    public bdej(bbuq bbuqVar, bbty bbtyVar, int i, @dzsi String str, jco jcoVar, bcrq bcrqVar, @dzsi bcrr bcrrVar, bcrs bcrsVar, bcrt bcrtVar, @dzsi cqtd cqtdVar, @dzsi ilo iloVar, Activity activity, btvo btvoVar, ckcw ckcwVar, bvrb bvrbVar, cjqy cjqyVar, cjqq cjqqVar, bwsh bwshVar, bdfe bdfeVar, bdbx bdbxVar, bdch bdchVar, bdcj bdcjVar, cqhn cqhnVar, ckmm ckmmVar, bddb bddbVar) {
        super(i, cqhnVar, cjqyVar, jcoVar, btvoVar, activity);
        this.o = new ArrayList();
        this.B = new bdef(this);
        this.p = str;
        this.s = cqtdVar;
        this.q = bbuqVar.b() != 1 ? false : true;
        this.g = iloVar;
        this.f = activity;
        this.r = ckcwVar;
        this.t = bvrbVar;
        this.C = cjqyVar;
        this.D = cjqqVar;
        this.E = bwshVar;
        this.u = bdfeVar;
        this.v = bdbxVar;
        this.w = ckmmVar;
        this.n = false;
        this.h = bbuqVar;
        this.i = bbtyVar;
        this.j = bcrqVar;
        this.x = bcrrVar;
        this.k = bcrsVar;
        this.l = bcrtVar;
        this.z = bddbVar;
        this.m = bdchVar;
        this.y = bdcjVar;
    }

    @Override // defpackage.bczz
    public List<jbs> a() {
        if (this.x != null && !this.A && !this.h.g()) {
            this.o.add(new iyr(new bdaz(this.x)));
            this.A = true;
        }
        return this.o;
    }

    @Override // defpackage.bczz
    public bdat b() {
        return this.B;
    }

    @Override // defpackage.bczz
    @dzsi
    public bdae c() {
        if (!this.a.getLensParameters().e) {
            return null;
        }
        return this.y.a();
    }

    @Override // defpackage.bdau
    public String f() {
        if (!dbsj.d(this.p)) {
            return this.p;
        }
        if (this.q) {
            return this.f.getResources().getString(R.string.PHOTO_TITLE_SINGLE);
        }
        int d = this.h.d();
        return e().intValue() >= d ? "" : (!this.i.c() || !this.h.c()) ? this.f.getResources().getQuantityString(R.plurals.PHOTO_TITLE, d) : this.f.getResources().getString(R.string.PAGING_INFO, Integer.valueOf(e().intValue() + 1), Integer.valueOf(this.h.b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bdbb
    @dzsi
    public final bdar g(int i) {
        jbs jbsVar = (i < 0 || i >= this.o.size()) ? null : this.o.get(i);
        if (jbsVar == null) {
            return null;
        }
        jbt jbtVar = jbsVar.a().get(0);
        if (!(jbtVar instanceof bdar)) {
            return null;
        }
        return (bdar) jbtVar;
    }

    public void h() {
        dccx dccxVar;
        int i;
        dccx dccxVar2;
        List<jbs> list = this.o;
        dccx F = dcdc.F();
        int size = this.o.size();
        while (size < this.h.d()) {
            dwfl e = this.h.e(size);
            dbsk.s(e);
            bdbx bdbxVar = this.v;
            bcrq bcrqVar = this.j;
            bdch bdchVar = this.m;
            ilo iloVar = this.g;
            bbty bbtyVar = this.i;
            String p = p();
            gga a = bdbxVar.a.a();
            bdbx.a(a, 1);
            cqhn a2 = bdbxVar.b.a();
            bdbx.a(a2, 2);
            cafi a3 = bdbxVar.c.a();
            bdbx.a(a3, 3);
            begg a4 = bdbxVar.d.a();
            List<jbs> list2 = list;
            bdbx.a(a4, 4);
            dxio a5 = ((dxjh) bdbxVar.e).a();
            dccx dccxVar3 = F;
            bdbx.a(a5, 5);
            btvo a6 = bdbxVar.f.a();
            int i2 = size;
            bdbx.a(a6, 6);
            bdbx.a(bcrqVar, 7);
            bdbx.a(bdchVar, 8);
            bdbx.a(e, 9);
            bdbx.a(bbtyVar, 11);
            cjxe a7 = bdbxVar.g.a();
            bdbx.a(a7, 12);
            bdbx.a(p, 13);
            bdbw bdbwVar = new bdbw(a, a2, a3, a4, a5, a6, bcrqVar, bdchVar, e, iloVar, bbtyVar, a7, p);
            if (cknv.g(e) || cknv.h(e)) {
                dccxVar = dccxVar3;
                i = i2;
                dccxVar.g(new iyr(new bdcb(this.f, e, i, this.t, this.a, this.r, this.C, this.E, this.g), bdbwVar));
            } else {
                if (cknv.j(e)) {
                    appj a8 = this.z.a(e);
                    i = i2;
                    bdfd a9 = this.u.a(a8, e, i, this.i.o().f());
                    bdbwVar.F(a8);
                    dccxVar2 = dccxVar3;
                    dccxVar2.g(new iyr(a9, bdbwVar));
                } else {
                    dccxVar2 = dccxVar3;
                    i = i2;
                    dccxVar2.g(new iyr(new bdeo(e, i, this.e, i == this.d ? this.s : null, this.r, this.D, this.w, bdbwVar)));
                }
                dccxVar = dccxVar2;
            }
            size = i + 1;
            F = dccxVar;
            list = list2;
        }
        list.addAll(F.f());
    }

    public void n(Uri uri, Uri uri2) {
        this.h.m(uri.toString(), uri2.toString());
        this.o.clear();
        h();
        cqkx.p(this);
    }

    public void o(int i) {
        this.o.remove(i);
        l(Math.min(e().intValue(), this.o.size() - 1));
    }

    public String p() {
        return this.f.getResources().getString(R.string.EDIT_PHOTO_CAPTION_HINT);
    }
}
