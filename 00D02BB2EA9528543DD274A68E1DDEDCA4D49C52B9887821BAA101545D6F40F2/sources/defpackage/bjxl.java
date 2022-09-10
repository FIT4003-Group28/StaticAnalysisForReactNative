package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bjxl  reason: default package */
/* loaded from: classes3.dex */
public class bjxl extends bjyw {
    public final btrm a;
    public final bjgh b;
    public final Runnable c;
    public final btzi<djaa, djae> d;
    private final List<jho> g;
    private final bjwg h;
    private final String i;

    public bjxl(gga ggaVar, cqhn cqhnVar, bjgo bjgoVar, afgy afgyVar, dxio<afha> dxioVar, btrm btrmVar, btvo btvoVar, final bvff bvffVar, bjgi bjgiVar, bjgy bjgyVar, bkak bkakVar, bjyl bjylVar, bjyr bjyrVar, final bjxk bjxkVar, bwrs<ilo> bwrsVar, final djam djamVar, final String str, bjwg bjwgVar) {
        super(ggaVar, bjgoVar, afgyVar, dxioVar, btvoVar, bjgyVar, bjylVar, bkakVar.a(bwrsVar, djamVar, false), djamVar, bwrsVar, false);
        List<jho> list;
        this.d = new bjxj(this);
        this.a = btrmVar;
        this.b = bjgiVar.a(bwrsVar);
        this.h = bjwgVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        final Runnable runnable = new Runnable(this, bvffVar, str) { // from class: bjxe
            private final bjxl a;
            private final bvff b;
            private final String c;

            {
                this.a = this;
                this.b = bvffVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjxl bjxlVar = this.a;
                bvff bvffVar2 = this.b;
                String str2 = this.c;
                dizy bZ = djaa.l.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                djaa djaaVar = (djaa) bZ.b;
                djaaVar.b = 2;
                int i = djaaVar.a | 1;
                djaaVar.a = i;
                str2.getClass();
                djaaVar.a = 2 | i;
                djaaVar.c = str2;
                bvffVar2.a(bZ.bK(), bjxlVar.d, bvrj.UI_THREAD);
            }
        };
        this.c = runnable;
        djag djagVar = djamVar.c;
        if ((djagVar == null ? djag.d : djagVar).b) {
            final Runnable runnable2 = new Runnable(bjxkVar, djamVar) { // from class: bjxf
                private final bjxk a;
                private final djam b;

                {
                    this.a = bjxkVar;
                    this.b = djamVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b.d);
                }
            };
            list = new ArrayList<>();
            jhm jhmVar = new jhm();
            jhmVar.n = true;
            jhmVar.a = ggaVar.getString(R.string.PLACE_QA_EDIT_ANSWER);
            jhmVar.d(new View.OnClickListener(runnable2) { // from class: bjxg
                private final Runnable a;

                {
                    this.a = runnable2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.run();
                }
            });
            cjta c2 = cjtd.c(c.bZ());
            c2.d = dtxy.gf;
            jhmVar.f = c2.a();
            list.add(jhmVar.c());
            jhm jhmVar2 = new jhm();
            jhmVar2.n = true;
            jhmVar2.a = ggaVar.getString(R.string.PLACE_QA_DELETE_ANSWER);
            jhmVar2.d(new View.OnClickListener(runnable) { // from class: bjxh
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.run();
                }
            });
            cjta c3 = cjtd.c(c.bZ());
            c3.d = dtxy.ge;
            jhmVar2.f = c3.a();
            list.add(jhmVar2.c());
        } else {
            list = this.f;
        }
        this.g = list;
        Object[] objArr = new Object[1];
        djag djagVar2 = djamVar.c;
        objArr[0] = bjgr.a(ggaVar, c, djagVar2 == null ? djag.d : djagVar2);
        this.i = ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_ANSWER_OVERFLOW_MENU_DESCRIPTION, objArr);
        bjyrVar.a(bwrsVar, djamVar, false);
        dcqe dcqeVar = cjtd.a;
    }

    @Override // defpackage.bjyw, defpackage.bjgv
    public void QW() {
        super.QW();
        if (u() != null) {
            this.h.QW();
        }
    }

    @Override // defpackage.bjwo
    @dzsi
    public bjws r() {
        return null;
    }

    @Override // defpackage.bjwo
    @dzsi
    public bjwg u() {
        if (this.h.b().booleanValue()) {
            return this.h;
        }
        return null;
    }

    @Override // defpackage.bjyw
    protected final List<jho> w() {
        return this.g;
    }

    @Override // defpackage.bjyw
    protected final String x() {
        return this.i;
    }
}
