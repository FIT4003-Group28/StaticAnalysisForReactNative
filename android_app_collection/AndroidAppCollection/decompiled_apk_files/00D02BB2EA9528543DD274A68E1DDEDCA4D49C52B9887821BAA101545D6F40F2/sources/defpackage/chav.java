package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: chav  reason: default package */
/* loaded from: classes4.dex */
public class chav extends chas {
    public final dxio<afha> n;

    public chav(cgtl cgtlVar, boxa boxaVar, cjqy cjqyVar, gga ggaVar, bvrb bvrbVar, cgen cgenVar, dxio<begg> dxioVar, bumy bumyVar, dxio<afha> dxioVar2, List<cgsk> list) {
        super(boxaVar, cjqyVar, ggaVar, cgenVar, bumyVar, dxioVar, list);
        this.n = dxioVar2;
    }

    public final String B() {
        return q().ag() != null ? q().ag().c : "";
    }

    @Override // defpackage.chas, defpackage.cgwh
    public String a() {
        ilo q = q();
        return q.f ? q.n() : "";
    }

    @Override // defpackage.chas, defpackage.cgwh
    public Boolean e() {
        int i = this.b.b;
        boolean z = false;
        if (i == 2 || (i != 4 && i != 3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwh
    public Boolean g() {
        return Boolean.valueOf(!q().f);
    }

    @Override // defpackage.chas, defpackage.cgwh
    public String h() {
        int a = dnlw.a(this.m.b);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            if ((this.m.a & 1) != 0) {
                String str = this.l.b;
            }
            return q().f ? q().B() : "";
        }
        return "";
    }

    @Override // defpackage.chas, defpackage.cgwh
    public cqkl j() {
        chaq chaqVar = this.d;
        if (chaqVar != null) {
            chaqVar.M();
        }
        return cqkl.a;
    }

    @Override // defpackage.chas
    protected final jht v() {
        jhu h = jhv.h();
        h.d(jhm.b(R.string.UGC_TASK_CARD_VIEW_PLACE_DETAILS).c());
        if (!dbsj.d(B())) {
            h.d(jhm.b(R.string.VIEW_WEBSITE).c());
        }
        h.d(jhm.b(R.string.UGC_TASKS_PLACE_SHEET_CARD_SUGGEST_EDIT_LINK_TEXT).c());
        h.d(jhm.b(R.string.UGC_TASK_CARD_DISMISS_PLACE).c());
        if (x()) {
            h.d(jhm.b(R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE).c());
        }
        jhi jhiVar = (jhi) h;
        jhiVar.b = new jhr(this) { // from class: chau
            private final chav a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                chav chavVar = this.a;
                if (i == R.string.UGC_TASK_CARD_DISMISS_PLACE) {
                    chavVar.w();
                } else if (i == R.string.UGC_TASK_CARD_VIEW_PLACE_DETAILS) {
                    chavVar.A();
                } else if (i == R.string.UGC_TASKS_PLACE_SHEET_CARD_SUGGEST_EDIT_LINK_TEXT) {
                    chavVar.g.i(cjtd.a(dtyd.aw));
                    chavVar.f.F(chavVar.a);
                } else if (i != R.string.VIEW_WEBSITE) {
                    if (i != R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE) {
                        return;
                    }
                    chavVar.z();
                } else {
                    chaq chaqVar = chavVar.d;
                    if (chaqVar != null) {
                        chaqVar.ab(doab.PRIOR_RESEARCH_VISITED_WEBSITE);
                    }
                    chavVar.g.i(cjtd.a(dtyd.ax));
                    chavVar.n.a().k(chavVar.h, chavVar.B(), 1);
                }
            }
        };
        return jhiVar.b();
    }
}
