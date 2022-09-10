package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfuq  reason: default package */
/* loaded from: classes4.dex */
public final class cfuq implements cccr {
    final /* synthetic */ cfur a;

    public cfuq(cfur cfurVar) {
        this.a = cfurVar;
    }

    @Override // defpackage.cccr
    public final void a(final String str) {
        cgby h = this.a.c.h();
        if (h == null) {
            bvoo.h("InformationalCardsModule is not set. InfoCardKey=%s", str);
            return;
        }
        dcdc z = dcbg.b(h.a).o(new dbsl(str) { // from class: cfup
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                drnj drnjVar = ((drnp) obj).f;
                if (drnjVar == null) {
                    drnjVar = drnj.b;
                }
                return !dcbg.b(drnjVar.a).p(new dbsl(str2) { // from class: cfuo
                    private final String a;

                    {
                        this.a = str2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        drmb drmbVar;
                        String str3 = this.a;
                        drni drniVar = (drni) obj2;
                        if (drniVar.a == 1) {
                            drmbVar = (drmb) drniVar.b;
                        } else {
                            drmbVar = drmb.d;
                        }
                        return drmbVar.b.equals(str3);
                    }
                });
            }
        }).z();
        if (z.size() == h.a.size()) {
            bvoo.h("InfoCardKey is invalid so no card was dismissed. InfoCardKey=%s", str);
            return;
        }
        z<cgby> zVar = this.a.c;
        dsqp dsqpVar = (dsqp) h.cu(5);
        dsqpVar.bC(h);
        cgbx cgbxVar = (cgbx) dsqpVar;
        if (cgbxVar.c) {
            cgbxVar.bF();
            cgbxVar.c = false;
        }
        ((cgby) cgbxVar.b).a = cgby.ck();
        cgbxVar.a(z);
        zVar.g(cgbxVar.bK());
        this.a.b.a(cfwq.b(cqrt.l(R.string.CT_INFO_CARD_DISMISS_SUCCESS)));
    }

    @Override // defpackage.cccr
    public final void b() {
        this.a.b.a(cfwq.b(cqrt.l(R.string.CT_INFO_CARD_DISMISS_FAILURE)));
    }
}
