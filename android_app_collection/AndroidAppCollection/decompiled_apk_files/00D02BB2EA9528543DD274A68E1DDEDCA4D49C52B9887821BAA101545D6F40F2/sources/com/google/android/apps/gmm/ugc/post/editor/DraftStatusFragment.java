package com.google.android.apps.gmm.ugc.post.editor;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.gmm.ugc.post.editor.DraftStatusFragment;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DraftStatusFragment extends cdvg<cdkq> {
    public isd a;
    public cjtd ad;
    public String ae;
    public akqi af;
    public String ag;
    public cdja ah;
    public cdnk b;
    public cdmx c;
    public cebd d;
    public bqrv e;
    public cdlv f;
    public View g;

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        cdkq cdkqVar = (cdkq) this.ai;
        dbsk.s(cdkqVar);
        cdkqVar.k.b(x(), new aa(this) { // from class: cdkc
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.ad = (cjtd) obj;
            }
        });
        ((cdkq) this.ai).e.b(x(), new aa(this) { // from class: cdkd
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.af = ((ilo) obj).ai();
            }
        });
        ((cdkq) this.ai).d.b(x(), new aa(this) { // from class: cdke
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.ae = ((cdjb) obj).g();
            }
        });
        ((cdkq) this.ai).d.b(x(), new aa(this) { // from class: cdkf
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.ag = ((cdjb) obj).h().c("");
            }
        });
        ((cdkq) this.ai).h.b(x(), new aa(this) { // from class: cdkg
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.ah = (cdja) obj;
            }
        });
        this.g = view.findViewById(R.id.draftStatusButton);
        cebd cebdVar = this.d;
        dbsk.s(cebdVar);
        final cdwi b = cdvv.a(this, cebdVar).b(R.id.draftStatusButton);
        b.e(((cdkq) this.ai).i);
        ((cdkq) this.ai).j.b(b.b, new aa(b) { // from class: cdwa
            private final cdwi a;

            {
                this.a = b;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.c((cjtd) obj);
            }
        });
        b.a(new Runnable(this) { // from class: cdkh
            private final DraftStatusFragment a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final DraftStatusFragment draftStatusFragment = this.a;
                jhm a = jhm.a();
                a.a = draftStatusFragment.Rp(R.string.DELETE_DRAFT_REVIEW);
                a.l = R.string.DELETE_DRAFT_REVIEW;
                cjtd cjtdVar = draftStatusFragment.ad;
                dbsk.s(cjtdVar);
                a.f = cjtdVar;
                isd isdVar = draftStatusFragment.a;
                dbsk.s(isdVar);
                View view2 = draftStatusFragment.g;
                dbsk.s(view2);
                isc a2 = isdVar.a(view2);
                a2.a(dchl.b(a.c()));
                a2.c = new PopupMenu.OnMenuItemClickListener(draftStatusFragment) { // from class: cdki
                    private final DraftStatusFragment a;

                    {
                        this.a = draftStatusFragment;
                    }

                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        final DraftStatusFragment draftStatusFragment2 = this.a;
                        if (menuItem.getItemId() == R.string.DELETE_DRAFT_REVIEW) {
                            bqrv bqrvVar = draftStatusFragment2.e;
                            dbsk.s(bqrvVar);
                            akqi akqiVar = draftStatusFragment2.af;
                            dbsk.s(akqiVar);
                            bqrvVar.a(akqiVar, new Runnable(draftStatusFragment2) { // from class: cdkj
                                private final DraftStatusFragment a;

                                {
                                    this.a = draftStatusFragment2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    final DraftStatusFragment draftStatusFragment3 = this.a;
                                    cdmx cdmxVar = draftStatusFragment3.c;
                                    dbsk.s(cdmxVar);
                                    final ProgressDialog a3 = cdmxVar.a(draftStatusFragment3.Rp(R.string.DELETE_DRAFT_REVIEW_SPINNER));
                                    cdnk cdnkVar = draftStatusFragment3.b;
                                    dbsk.s(cdnkVar);
                                    String str = draftStatusFragment3.ae;
                                    dbsk.s(str);
                                    cdja cdjaVar = draftStatusFragment3.ah;
                                    dbsk.s(cdjaVar);
                                    cdkv cdkvVar = draftStatusFragment3.w().f;
                                    dbsk.s(cdkvVar);
                                    dnqh dnqhVar = cdkvVar.b;
                                    dsqp dsqpVar = (dsqp) dnqhVar.cu(5);
                                    dsqpVar.bC(dnqhVar);
                                    dnqg dnqgVar = (dnqg) dsqpVar;
                                    String str2 = draftStatusFragment3.ag;
                                    dbsk.s(str2);
                                    if (dnqgVar.c) {
                                        dnqgVar.bF();
                                        dnqgVar.c = false;
                                    }
                                    dnqh dnqhVar2 = (dnqh) dnqgVar.b;
                                    dnqh dnqhVar3 = dnqh.p;
                                    str2.getClass();
                                    dnqhVar2.a |= 8;
                                    dnqhVar2.e = str2;
                                    deaf deafVar = deaf.TAP;
                                    if (dnqgVar.c) {
                                        dnqgVar.bF();
                                        dnqgVar.c = false;
                                    }
                                    dnqh dnqhVar4 = (dnqh) dnqgVar.b;
                                    dnqhVar4.h = deafVar.Q;
                                    dnqhVar4.a |= 128;
                                    ilo h = draftStatusFragment3.w().e.h();
                                    dbsk.s(h);
                                    cdnkVar.b(str, cdjaVar, dnqgVar.bK(), h, new mw(draftStatusFragment3, a3) { // from class: cdkk
                                        private final DraftStatusFragment a;
                                        private final ProgressDialog b;

                                        {
                                            this.a = draftStatusFragment3;
                                            this.b = a3;
                                        }

                                        @Override // defpackage.mw
                                        public final void a(Object obj) {
                                            DraftStatusFragment draftStatusFragment4 = this.a;
                                            ProgressDialog progressDialog = this.b;
                                            draftStatusFragment4.w().g.g((ilo) obj);
                                            cdmx cdmxVar2 = draftStatusFragment4.c;
                                            dbsk.s(cdmxVar2);
                                            cdmxVar2.b();
                                            progressDialog.dismiss();
                                            cdlv cdlvVar = draftStatusFragment4.f;
                                            dbsk.s(cdlvVar);
                                            bwrs<ilo> a4 = bwrs.a(draftStatusFragment4.w().e.h());
                                            cdkv cdkvVar2 = draftStatusFragment4.w().f;
                                            dbsk.s(cdkvVar2);
                                            cdlvVar.a(4, a4, cdkvVar2.d().f(), cdlu.class);
                                        }
                                    }, new Runnable(draftStatusFragment3, a3) { // from class: cdkl
                                        private final DraftStatusFragment a;
                                        private final ProgressDialog b;

                                        {
                                            this.a = draftStatusFragment3;
                                            this.b = a3;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            DraftStatusFragment draftStatusFragment4 = this.a;
                                            ProgressDialog progressDialog = this.b;
                                            cdmx cdmxVar2 = draftStatusFragment4.c;
                                            dbsk.s(cdmxVar2);
                                            cdmxVar2.c();
                                            progressDialog.dismiss();
                                        }
                                    });
                                }
                            });
                            return true;
                        }
                        return false;
                    }
                };
                a2.show();
            }
        });
    }

    @Override // defpackage.cdvg
    protected final Class<cdkq> g() {
        return cdkq.class;
    }

    @Override // defpackage.cdvg
    protected final int i() {
        return R.layout.draft_status_indicator;
    }
}
