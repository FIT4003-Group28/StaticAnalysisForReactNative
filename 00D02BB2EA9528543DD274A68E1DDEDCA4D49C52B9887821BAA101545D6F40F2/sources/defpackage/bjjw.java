package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjjw  reason: default package */
/* loaded from: classes3.dex */
public class bjjw implements bjjm {
    public final ArrayList<bjwo> a = new ArrayList<>();
    public final bjjd b;
    public final bjgh c;
    @dzsi
    public bjwo d;
    private final gga e;
    private final bjjv f;
    private final bjhr g;
    private final jbk h;
    private final gfv i;
    private final boolean j;
    private final bwrs<ilo> k;
    private final String l;

    public bjjw(final gga ggaVar, bjgu bjguVar, bjzo bjzoVar, bjxm bjxmVar, bjxq bjxqVar, bjje bjjeVar, bjhs bjhsVar, bjgi bjgiVar, bjze bjzeVar, bjjc bjjcVar, gfv gfvVar, bwrs<ilo> bwrsVar, djao djaoVar, boolean z, boolean z2, dqcj dqcjVar) {
        this.c = bjgiVar.a(bwrsVar);
        djam djamVar = djaoVar.b;
        boolean z3 = false;
        dbsk.b(1 == ((djamVar == null ? djam.m : djamVar).a & 1), "Cannot initialize SingleQuestionPageViewModelImpl without an EncryptedZipitAnnotationId");
        final ilo c = bwrsVar.c();
        dbsk.s(c);
        this.e = ggaVar;
        this.i = gfvVar;
        this.j = z2;
        this.k = bwrsVar;
        djam djamVar2 = djaoVar.b;
        String str = (djamVar2 == null ? djam.m : djamVar2).b;
        this.l = str;
        djam djamVar3 = djaoVar.b;
        z3 = ((djamVar3 == null ? djam.m : djamVar3).a & 4) != 0 ? true : z3;
        if (z3) {
            this.d = bjzoVar.a(bwrsVar, djaoVar);
        }
        bjjv bjjvVar = new bjjv(this, bjzoVar, bjxmVar, bjxqVar, bwrsVar, djaoVar, !z3);
        this.f = bjjvVar;
        this.g = bjhsVar.a(bjjvVar);
        bjje.a(bjjeVar.a.a(), 1);
        bjje.a(bjjeVar.b.a(), 2);
        bvff a = bjjeVar.c.a();
        bjje.a(a, 3);
        btrm a2 = bjjeVar.d.a();
        bjje.a(a2, 4);
        chhr a3 = bjjeVar.e.a();
        bjje.a(a3, 5);
        chht a4 = bjjeVar.f.a();
        bjje.a(a4, 6);
        bjhc a5 = bjjeVar.g.a();
        bjje.a(a5, 7);
        cafi a6 = bjjeVar.h.a();
        bjje.a(a6, 8);
        bjgi a7 = bjjeVar.i.a();
        bjje.a(a7, 9);
        PublicDisclosureLayout$PublicDisclosureViewModelImpl a8 = bjjeVar.j.a();
        bjje.a(a8, 10);
        bjje.a(bjjcVar, 11);
        bjje.a(c, 12);
        bjje.a(str, 13);
        bjje.a(dqcjVar, 15);
        this.b = new bjjd(a, a2, a3, a4, a5, a6, a7, a8, bjjcVar, c, str, z, dqcjVar);
        this.h = new jbk(ggaVar, c) { // from class: bjjn
            private final gga a;
            private final ilo b;

            {
                this.a = ggaVar;
                this.b = c;
            }

            @Override // defpackage.jbk
            public jib NC() {
                gga ggaVar2 = this.a;
                ilo iloVar = this.b;
                jhz e = jib.g(ggaVar2, ggaVar2.getString(R.string.PLACE_QA_QUESTION_PAGE_TITLE, new Object[]{iloVar.n()})).e();
                e.b = iloVar.B();
                return e.b();
            }
        };
        bjjq bjjqVar = new bjjq();
        bjjo bjjoVar = new bjjo(this);
        gga a9 = bjzeVar.a.a();
        bjze.a(a9, 1);
        bjze.a(bjzeVar.b.a(), 2);
        bwqv a10 = bjzeVar.c.a();
        bjze.a(a10, 3);
        bjyr a11 = bjzeVar.d.a();
        bjze.a(a11, 4);
        bkak a12 = bjzeVar.e.a();
        bjze.a(a12, 5);
        bjxd a13 = bjzeVar.f.a();
        bjze.a(a13, 6);
        btrm a14 = bjzeVar.g.a();
        bjze.a(a14, 7);
        bvfk a15 = bjzeVar.h.a();
        bjze.a(a15, 8);
        Executor a16 = bjzeVar.i.a();
        bjze.a(a16, 9);
        bjgi a17 = bjzeVar.j.a();
        bjze.a(a17, 10);
        dxio a18 = ((dxjh) bjzeVar.k).a();
        bjze.a(a18, 11);
        bjgy a19 = bjzeVar.l.a();
        bjze.a(a19, 12);
        bjze.a(bwrsVar, 13);
        bjze.a(djaoVar, 14);
        bjze.a(bjjqVar, 15);
        bjze.a(bjjoVar, 16);
        new bjzd(a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, bwrsVar, djaoVar, bjjoVar);
    }

    @Override // defpackage.bjgv
    public void QW() {
        bjwo bjwoVar = this.d;
        if (bjwoVar != null) {
            bjwoVar.QW();
        }
        ArrayList<bjwo> arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).QW();
        }
    }

    @Override // defpackage.bjjm
    @dzsi
    public bjwo a() {
        return this.d;
    }

    @Override // defpackage.bjjm
    public List<bjwo> b() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.bjjm
    public cqrh c() {
        return this.g.b;
    }

    @Override // defpackage.bjjm
    @dzsi
    public cqkp d() {
        return this.g.d;
    }

    @Override // defpackage.bjjm
    public bjix e() {
        return this.b;
    }

    final void f() {
        this.d = null;
        this.a.clear();
        this.f.d();
        this.g.c();
        cqkx.p(this);
        this.b.t(false);
    }

    @Override // defpackage.bjfj
    public jbk h() {
        return this.h;
    }

    @Override // defpackage.bjfj
    public void i(Bundle bundle) {
    }

    @Override // defpackage.bjfj
    public void j(Bundle bundle) {
    }

    @Override // defpackage.bjfc
    public void k(bjfb bjfbVar) {
        if (bjfbVar instanceof bjff) {
            f();
        } else if (!(bjfbVar instanceof bjfa)) {
        } else {
            bjfa bjfaVar = (bjfa) bjfbVar;
            if (bjfaVar.b != 2) {
                int i = bjfaVar.a;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    return;
                }
                if (i2 == 2) {
                    this.e.s();
                    return;
                } else {
                    this.d = null;
                    this.f.d();
                }
            } else if (bjfaVar.a == 4) {
                gga ggaVar = this.e;
                Toast.makeText(ggaVar, ggaVar.getString(R.string.PLACE_QA_BEST_ANSWER_UPDATED_TOAST), 1).show();
                f();
                return;
            }
            this.a.clear();
            this.g.c();
            if (bjfaVar.a == 3) {
                this.b.s("");
            }
            this.b.t(false);
            cqkx.p(this);
            if (bjfaVar.b != 2 || bjfaVar.a != 1) {
                return;
            }
            gfv gfvVar = this.i;
            bjhw bZ = bjhz.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bjhz bjhzVar = (bjhz) bZ.b;
            bjhzVar.d = 2;
            bjhzVar.a = 4 | bjhzVar.a;
            ilo c = this.k.c();
            dbsk.s(c);
            String o = c.ai().o();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bjhz bjhzVar2 = (bjhz) bZ.b;
            o.getClass();
            int i3 = 1 | bjhzVar2.a;
            bjhzVar2.a = i3;
            bjhzVar2.b = o;
            String str = this.l;
            str.getClass();
            bjhzVar2.a = i3 | 2;
            bjhzVar2.c = str;
            gfvVar.Nw(bZ.bK());
            if (!this.j) {
                return;
            }
            this.e.s();
        }
    }

    public final void l() {
        bjgh bjghVar = this.c;
        final gga ggaVar = this.e;
        ggaVar.getClass();
        final Runnable runnable = new Runnable(ggaVar) { // from class: bjjp
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        };
        gcz a = bjghVar.a.a();
        a.j();
        a.i = bjghVar.a(dtxy.gj);
        a.d(R.string.PLACE_QA_ERROR_MESSAGE_QUESTION_REMOVED);
        a.f = false;
        a.c();
        a.e(R.string.PLACE_QA_CLOSE_BUTTON, bjghVar.a(dtxy.gk), new gdd(runnable) { // from class: bjgg
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.run();
            }
        });
        a.b();
    }
}
