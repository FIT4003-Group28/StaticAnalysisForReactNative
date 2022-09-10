package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjde  reason: default package */
/* loaded from: classes4.dex */
public final class cjde implements ango {
    public final Activity a;
    public final angp b;
    public final dxio<anhg> c;
    public final dxio<bqji> d;
    public final dxio<cdjj> e;
    public final cjdf f;
    public final dlif g;
    public final String h;
    public final cjdx i;
    private final Executor j;
    private final int k;

    public cjde(Activity activity, angp angpVar, Executor executor, dxio<anhg> dxioVar, dxio<bqji> dxioVar2, cjdf cjdfVar, dxio<cdjj> dxioVar3, dlif dlifVar, int i, String str, cjdx cjdxVar) {
        this.a = activity;
        this.b = angpVar;
        this.j = executor;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.f = cjdfVar;
        this.e = dxioVar3;
        this.g = dlifVar;
        this.k = i;
        this.h = str;
        this.i = cjdxVar;
    }

    public final String a() {
        dgrh dgrhVar = this.g.c.get(0).a;
        if (dgrhVar == null) {
            dgrhVar = dgrh.d;
        }
        return akqi.k(dgrhVar).o();
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        if (this.k == 1) {
            this.j.execute(new Runnable(this) { // from class: cjda
                private final cjde a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final cjde cjdeVar = this.a;
                    dafk a = ckos.a(cjdeVar.a.findViewById(16908290), cjdeVar.a.getString(R.string.UPDATE_VISIT_PAGE_SNACKBAR_TEXT, new Object[]{cjdeVar.h}), 0);
                    a.p(cjdeVar.a.getString(R.string.UPDATE_VISIT_PAGE_SNACKBAR_UNDO), new View.OnClickListener(cjdeVar) { // from class: cjdd
                        private final cjde a;

                        {
                            this.a = cjdeVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cjde cjdeVar2 = this.a;
                            dvya bZ = dvyw.bv.bZ();
                            String a2 = cjdeVar2.a();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dvyw dvywVar = (dvyw) bZ.b;
                            a2.getClass();
                            dvywVar.a |= 4;
                            dvywVar.g = a2;
                            cjdeVar2.b.r(dbpy.a, aogf.c(new eaph(cjdeVar2.g.a), new eaph(cjdeVar2.g.b)).e(), bZ.bK(), 1, dbpy.a, dnqm.c, dbsg.i(cjdeVar2.f.a(cjdeVar2.g, 0, cjdeVar2.h, cjdeVar2.i)), false);
                            ((gga) cjdeVar2.a).g().f();
                            if (cjdeVar2.i == cjdx.OPEN_REVIEW_EDITOR) {
                                ily ilyVar = new ily();
                                ilyVar.k(cjdeVar2.a());
                                ilo d = ilyVar.d();
                                bqjf r = bqjh.r();
                                r.f(bzwi.c(blpk.REVIEW_AT_A_PLACE_NOTIFICATION));
                                r.d(true);
                                ((bqir) r).d = dpyv.REVIEW_AT_A_PLACE;
                                r.i(cjdeVar2.g);
                                cjdeVar2.d.a().b(bwrs.a(d), r.o());
                            } else if (cjdeVar2.i != cjdx.OPEN_PHOTO_POST_EDITOR) {
                            } else {
                                ily ilyVar2 = new ily();
                                ilyVar2.k(cjdeVar2.a());
                                ilyVar2.F(cjdeVar2.g.c.get(0).b);
                                ilo d2 = ilyVar2.d();
                                cdjj a3 = cjdeVar2.e.a();
                                bwrs<ilo> a4 = bwrs.a(d2);
                                cdje e = cdjf.e();
                                dnqg bZ2 = dnqh.p.bZ();
                                dnmu dnmuVar = dnmu.PROPERTY_GMM;
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dnqh dnqhVar = (dnqh) bZ2.b;
                                dnqhVar.l = dnmuVar.ap;
                                dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                                e.b(bZ2.bK());
                                a3.c(a4, e.a());
                            }
                        }
                    });
                    a.c();
                }
            });
        } else {
            this.j.execute(new Runnable(this) { // from class: cjdb
                private final cjde a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final cjde cjdeVar = this.a;
                    dafk a = ckos.a(cjdeVar.a.findViewById(16908290), cjdeVar.a.getString(R.string.UPDATE_VISIT_PAGE_PLACE_ADDED_SNACKBAR_TEXT, new Object[]{cjdeVar.h}), 0);
                    a.p(cjdeVar.a.getString(R.string.UPDATE_VISIT_PAGE_SEE_TIMELINE), new View.OnClickListener(cjdeVar) { // from class: cjdc
                        private final cjde a;

                        {
                            this.a = cjdeVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cjde cjdeVar2 = this.a;
                            cjdeVar2.c.a().D(anhy.m(new eapg(cjdeVar2.g.b)));
                        }
                    });
                    a.c();
                }
            });
        }
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
    }
}
