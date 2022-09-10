package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjyb  reason: default package */
/* loaded from: classes3.dex */
public class bjyb implements bjwj {
    private final CharSequence a;
    private final cjtd b;
    private final bjwh c;
    private final jht d;
    private final bjya e;
    private final Runnable f;
    @dzsi
    private final bjzz g;

    public bjyb(gga ggaVar, final bjbu bjbuVar, final bjgy bjgyVar, bjxv bjxvVar, bkaa bkaaVar, final bwrs<ilo> bwrsVar, djsf djsfVar, ddde dddeVar, boolean z) {
        final djsj djsjVar = djsfVar.b;
        djsjVar = djsjVar == null ? djsj.e : djsjVar;
        djsl djslVar = djsjVar.c;
        this.a = bjgr.h((djslVar == null ? djsl.b : djslVar).a);
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
        cjtd a = c2.a();
        this.b = a;
        djag djagVar = djsjVar.b;
        this.c = bjxvVar.a(c, djagVar == null ? djag.d : djagVar, djsjVar.d, true);
        final Runnable runnable = new Runnable(bjbuVar, bwrsVar, djsjVar) { // from class: bjxw
            private final bjbu a;
            private final bwrs b;
            private final djsj c;

            {
                this.a = bjbuVar;
                this.b = bwrsVar;
                this.c = djsjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjbu bjbuVar2 = this.a;
                bwrs<ilo> bwrsVar2 = this.b;
                djsj djsjVar2 = this.c;
                djan bZ2 = djao.i.bZ();
                djaj bZ3 = djam.m.bZ();
                String str = djsjVar2.a;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djam djamVar = (djam) bZ3.b;
                str.getClass();
                djamVar.a |= 1;
                djamVar.b = str;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                djao djaoVar = (djao) bZ2.b;
                djam bK = bZ3.bK();
                bK.getClass();
                djaoVar.b = bK;
                djaoVar.a |= 1;
                bjbuVar2.c(bwrsVar2, bZ2.bK());
            }
        };
        this.f = runnable;
        jhu h = jhv.h();
        Object[] objArr = new Object[1];
        djsj djsjVar2 = djsfVar.a;
        djag djagVar2 = (djsjVar2 == null ? djsj.e : djsjVar2).b;
        objArr[0] = bjgr.a(ggaVar, c, djagVar2 == null ? djag.d : djagVar2);
        ((jhi) h).e = ggaVar.getString(R.string.PLACE_QA_SUGGESTED_ANSWERS_OVERFLOW_MENU_CONTENT_DESCRIPTION, objArr);
        jhm jhmVar = new jhm();
        jhmVar.a = ggaVar.getText(R.string.PLACE_QA_VIEW_MORE);
        jhmVar.b = ggaVar.getText(R.string.PLACE_QA_VIEW_MORE);
        cjta c3 = cjtd.c(a);
        c3.d = dtxy.gI;
        jhmVar.f = c3.a();
        jhmVar.d(new View.OnClickListener(runnable) { // from class: bjxx
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
        final String str = djsjVar.a;
        jhm jhmVar2 = new jhm();
        jhmVar2.a = ggaVar.getText(R.string.PLACE_QA_REPORT_QUESTION);
        jhmVar2.b = ggaVar.getText(R.string.PLACE_QA_REPORT_QUESTION);
        cjta c4 = cjtd.c(a);
        c4.d = dtxy.gG;
        jhmVar2.f = c4.a();
        jhmVar2.d(new View.OnClickListener(bjgyVar, str) { // from class: bjxy
            private final bjgy a;
            private final String b;

            {
                this.a = bjgyVar;
                this.b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjgy bjgyVar2 = this.a;
                String str2 = this.b;
                bjgyVar2.a(1, str2, str2);
            }
        });
        h.d(jhmVar2.c());
        djsj djsjVar3 = djsfVar.a;
        final String str2 = (djsjVar3 == null ? djsj.e : djsjVar3).a;
        jhm jhmVar3 = new jhm();
        jhmVar3.a = ggaVar.getText(R.string.PLACE_QA_REPORT_ANSWER);
        jhmVar3.b = ggaVar.getText(R.string.PLACE_QA_REPORT_ANSWER);
        cjta c5 = cjtd.c(a);
        c5.d = dtxy.gF;
        jhmVar3.f = c5.a();
        jhmVar3.d(new View.OnClickListener(bjgyVar, str2) { // from class: bjxz
            private final bjgy a;
            private final String b;

            {
                this.a = bjgyVar;
                this.b = str2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjgy bjgyVar2 = this.a;
                String str3 = this.b;
                bjgyVar2.a(2, str3, str3);
            }
        });
        h.d(jhmVar3.c());
        this.d = h.b();
        djsj djsjVar4 = djsfVar.a;
        this.e = new bjya(bjxvVar, c, djsjVar4 == null ? djsj.e : djsjVar4);
        this.g = z ? bkaaVar.a(bwrsVar, dddeVar) : null;
    }

    @Override // defpackage.bjwj
    public bjwh a() {
        return this.c;
    }

    @Override // defpackage.bjwj
    public jht b() {
        return this.d;
    }

    @Override // defpackage.bjwj
    public CharSequence c() {
        return this.a;
    }

    @Override // defpackage.bjwj
    public cqkl d() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.bjwj
    public bjwi e() {
        return this.e;
    }

    @Override // defpackage.bjwy
    public cjtd g(ddho ddhoVar) {
        cjta c = cjtd.c(this.b);
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.bjwy
    @dzsi
    public bjwx h() {
        return this.g;
    }
}
