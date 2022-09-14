package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bldv  reason: default package */
/* loaded from: classes3.dex */
public final class bldv extends gen {
    private static final dcqe ae = dcqe.c("bldv");
    public gga a;
    @dzsi
    public blgm ad;
    public bwqv b;
    public cebq c;
    public ceet d;
    public blgn e;
    public cqkj g;

    public static bldv g(bwqv bwqvVar, bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, bkpg bkpgVar) {
        bldv bldvVar = new bldv();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "placemark", bwrsVar);
        bwqvVar.c(bundle, "post_ref", bwrsVar2);
        bundle.putSerializable("options", bkpgVar);
        bundle.putBoolean("isSelfReview", false);
        bldvVar.B(bundle);
        return bldvVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((bldw) btsx.b(bldw.class, this)).cS(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        blgm blgmVar = this.ad;
        if (blgmVar == null) {
            return new gdf(this.a);
        }
        jeo jeoVar = new jeo(this.a, 16973840, new blga(), blgmVar, this.g);
        blgmVar.i(new Runnable(this) { // from class: bldt
            private final bldv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        });
        jeoVar.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: bldu
            private final bldv a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                bldv bldvVar = this.a;
                if (i == 4 && keyEvent.getAction() == 1) {
                    bldvVar.q();
                    return true;
                }
                return false;
            }
        });
        return jeoVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dbsg<djck> dbsgVar;
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        try {
            final bwrs<ilo> e = this.b.e(ilo.class, this.o, "placemark");
            dbsk.s(e);
            bkpg bkpgVar = (bkpg) bundle2.getSerializable("options");
            boolean z = bkpgVar != null && bkpgVar.c();
            cdjk d = bkpgVar != null ? bkpgVar.d() : cdjk.PLACESHEET_OVERVIEW;
            try {
                bwrs<cdjd> e2 = this.b.e(cdjd.class, this.o, "post_ref");
                if (bkpgVar != null) {
                    bvrt<djck> b = bkpgVar.b();
                    if (b == null) {
                        dbsgVar = dbpy.a;
                    } else {
                        djck e3 = b.e((dssr) djck.i.cu(7), djck.i);
                        dbsgVar = e3.equals(djck.i) ? dbpy.a : dbsg.i(e3);
                    }
                } else {
                    dbsgVar = dbpy.a;
                }
                final dbsg<djck> dbsgVar2 = dbsgVar;
                final String a = bkpgVar != null ? bkpgVar.a() : "";
                blgn blgnVar = this.e;
                blly a2 = blgnVar.a.a();
                blgn.a(a2, 1);
                blnq a3 = blgnVar.b.a();
                blgn.a(a3, 2);
                cexu a4 = blgnVar.c.a();
                blgn.a(a4, 3);
                cqhn a5 = blgnVar.d.a();
                blgn.a(a5, 4);
                btrm a6 = blgnVar.e.a();
                blgn.a(a6, 5);
                cebr a7 = blgnVar.f.a();
                blgn.a(a7, 6);
                btvo a8 = blgnVar.g.a();
                blgn.a(a8, 7);
                blgn.a(d, 8);
                this.ad = new blgm(a2, a3, a4, a5, a6, a7, a8, d);
                if (e2 == null || e2.c() == null) {
                    if (!bundle2.containsKey("post_id")) {
                        bvoo.h("Can't create fragment without a post ref or post ID.", new Object[0]);
                        return;
                    }
                    final boolean z2 = z;
                    this.c.a(e, bundle2.getCharSequence("post_id").toString(), new cebp(this, e, a, dbsgVar2, z2) { // from class: bldr
                        private final bldv a;
                        private final bwrs b;
                        private final String c;
                        private final dbsg d;
                        private final boolean e;

                        {
                            this.a = this;
                            this.b = e;
                            this.c = a;
                            this.d = dbsgVar2;
                            this.e = z2;
                        }

                        @Override // defpackage.cebp
                        public final void a(cdjd cdjdVar) {
                            bldv bldvVar = this.a;
                            bldvVar.ad.h(this.b, bwrs.a(cdjdVar), this.c, this.d, this.e, false, false);
                        }
                    }, new Runnable(this) { // from class: blds
                        private final bldv a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bldv bldvVar = this.a;
                            gga ggaVar = bldvVar.a;
                            cjxu.i(ggaVar, ggaVar.getString(R.string.OPEN_REVIEW_PAGE_FAILED));
                            bldvVar.q();
                        }
                    });
                } else if (bundle2.getBoolean("isSelfReview", false)) {
                    if (this.d.f()) {
                        this.ad.h(e, e2, a, dbsgVar2, z, true, false);
                    } else {
                        this.ad.g(e, e2, z);
                    }
                } else {
                    this.ad.h(e, e2, a, dbsgVar2, z, false, false);
                }
            } catch (IOException e4) {
                bvoo.h("Can't get a post ref: %s", e4);
            }
        } catch (IOException | NullPointerException e5) {
            bvoo.h("Can't create fragment without a placemark: %s", e5);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.dI;
    }

    public final void q() {
        blgm blgmVar = this.ad;
        dbsk.s(blgmVar);
        blgmVar.e();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        blgm blgmVar = this.ad;
        if (blgmVar == null) {
            aT();
            return;
        }
        ceta a = blgmVar.a();
        if (a == null) {
            return;
        }
        ((cext) a).o();
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        ceta a;
        super.u();
        blgm blgmVar = this.ad;
        if (blgmVar == null || (a = blgmVar.a()) == null) {
            return;
        }
        ((cext) a).p();
    }
}
