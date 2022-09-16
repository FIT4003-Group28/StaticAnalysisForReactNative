package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bjyi  reason: default package */
/* loaded from: classes3.dex */
public class bjyi implements bjwk {
    public static final bkph a = bkph.d(1, false);
    private final CharSequence b;
    private final String c;
    private final int d;
    private final cjtd e;
    private final bjwh f;
    private final jht g;
    private final Runnable h;
    @dzsi
    private final bjzz i;

    public bjyi(gga ggaVar, final bkpi bkpiVar, bjxv bjxvVar, bkaa bkaaVar, final bjhc bjhcVar, final bwrs<ilo> bwrsVar, final djsh djshVar, ddde dddeVar, boolean z) {
        final djsj djsjVar = djshVar.a;
        djsjVar = djsjVar == null ? djsj.e : djsjVar;
        djsl djslVar = djsjVar.c;
        this.b = bjgr.h((djslVar == null ? djsl.b : djslVar).a);
        this.c = djshVar.d;
        this.d = djshVar.b;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        ddes bZ = ddet.D.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        dddeVar.getClass();
        ddetVar.s = dddeVar;
        ddetVar.a |= 2097152;
        c2.s(bZ.bK());
        cjtd a2 = c2.a();
        this.e = a2;
        djag djagVar = djsjVar.b;
        this.f = bjxvVar.a(c, djagVar == null ? djag.d : djagVar, djsjVar.d, true);
        final Runnable runnable = new Runnable(bkpiVar, bwrsVar, djsjVar) { // from class: bjyd
            private final bkpi a;
            private final bwrs b;
            private final djsj c;

            {
                this.a = bkpiVar;
                this.b = bwrsVar;
                this.c = djsjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(this.b, this.c.a, dqgr.PUBLISHED, bkpg.f(cdjk.PLACESHEET_QA));
            }
        };
        this.h = runnable;
        final Runnable runnable2 = new Runnable(bjhcVar, djshVar, bkpiVar) { // from class: bjye
            private final bjhc a;
            private final djsh b;
            private final bkpi c;

            {
                this.a = bjhcVar;
                this.b = djshVar;
                this.c = bkpiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjhc bjhcVar2 = this.a;
                final djsh djshVar2 = this.b;
                final bkpi bkpiVar2 = this.c;
                bjhcVar2.c(new Runnable(djshVar2, bkpiVar2) { // from class: bjyh
                    private final djsh a;
                    private final bkpi b;

                    {
                        this.a = djshVar2;
                        this.b = bkpiVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        djsh djshVar3 = this.a;
                        bkpi bkpiVar3 = this.b;
                        docc bZ2 = docg.M.bZ();
                        dnpp bZ3 = dnpq.g.bZ();
                        String str = djshVar3.c;
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        dnpq dnpqVar = (dnpq) bZ3.b;
                        str.getClass();
                        dnpqVar.a |= 2;
                        dnpqVar.c = str;
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        docg docgVar = (docg) bZ2.b;
                        dnpq bK = bZ3.bK();
                        bK.getClass();
                        docgVar.z = bK;
                        docgVar.a |= ImageMetadata.LENS_APERTURE;
                        bkpiVar3.i(cdrr.q(bZ2.bK(), dqgr.PUBLISHED), bjyi.a);
                    }
                });
            }
        };
        jhu h = jhv.h();
        Object[] objArr = new Object[1];
        djsj djsjVar2 = djshVar.a;
        djag djagVar2 = (djsjVar2 == null ? djsj.e : djsjVar2).b;
        objArr[0] = bjgr.a(ggaVar, c, djagVar2 == null ? djag.d : djagVar2);
        ((jhi) h).e = ggaVar.getString(R.string.PLACE_QA_SUGGESTED_ANSWERS_OVERFLOW_MENU_CONTENT_DESCRIPTION, objArr);
        jhm jhmVar = new jhm();
        jhmVar.a = ggaVar.getText(R.string.PLACE_QA_VIEW_MORE);
        jhmVar.b = ggaVar.getText(R.string.PLACE_QA_VIEW_MORE);
        cjta c3 = cjtd.c(a2);
        c3.d = dtxy.gL;
        jhmVar.f = c3.a();
        jhmVar.d(new View.OnClickListener(runnable) { // from class: bjyf
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        });
        h.d(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.a = ggaVar.getText(R.string.REPORT_INAPPROPRIATE_REVIEW);
        jhmVar2.b = ggaVar.getText(R.string.REPORT_INAPPROPRIATE_REVIEW);
        cjta c4 = cjtd.c(a2);
        c4.d = dtxy.gJ;
        jhmVar2.f = c4.a();
        jhmVar2.d(new View.OnClickListener(runnable2) { // from class: bjyg
            private final Runnable a;

            {
                this.a = runnable2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.run();
            }
        });
        h.d(jhmVar2.c());
        this.g = h.b();
        this.i = z ? bkaaVar.a(bwrsVar, dddeVar) : null;
    }

    @Override // defpackage.bjwk
    public bjwh a() {
        return this.f;
    }

    @Override // defpackage.bjwk
    public Integer b() {
        return Integer.valueOf(this.d);
    }

    @Override // defpackage.bjwk
    public cqkl c() {
        this.h.run();
        return cqkl.a;
    }

    @Override // defpackage.bjwk
    public CharSequence d() {
        return this.b;
    }

    @Override // defpackage.bjwk
    public String e() {
        return this.c;
    }

    @Override // defpackage.bjwk
    public jht f() {
        return this.g;
    }

    @Override // defpackage.bjwy
    public cjtd g(ddho ddhoVar) {
        cjta c = cjtd.c(this.e);
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bjwy
    @dzsi
    public bjwx h() {
        return this.i;
    }
}
