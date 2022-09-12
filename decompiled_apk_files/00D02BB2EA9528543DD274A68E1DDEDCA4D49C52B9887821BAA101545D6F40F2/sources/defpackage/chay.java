package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: chay  reason: default package */
/* loaded from: classes4.dex */
public class chay extends chas {
    public boolean n;
    private final jic o;
    private final bwsh p;

    public chay(cgtl cgtlVar, boxa boxaVar, bwsh bwshVar, cjqy cjqyVar, gga ggaVar, bvrb bvrbVar, cgen cgenVar, bumy bumyVar, List<cgsk> list) {
        super(boxaVar, cjqyVar, ggaVar, cgenVar, bumyVar, null, list);
        String str;
        dwqb dwqbVar;
        this.p = bwshVar;
        if (!list.isEmpty()) {
            dwqc b = list.get(0).b();
            if (b.b == 3) {
                dwqbVar = (dwqb) b.c;
            } else {
                dwqbVar = dwqb.b;
            }
            str = dwqbVar.a;
        } else {
            str = "";
        }
        this.o = new jic(str, ckqc.FULLY_QUALIFIED, null, 250, new chax(this));
    }

    @Override // defpackage.chas, defpackage.cgwh
    public Boolean b() {
        boolean z = false;
        if (!dbsj.d(this.o.a) && this.b.b == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwh
    public Boolean g() {
        return Boolean.valueOf(!this.n);
    }

    @Override // defpackage.chas, defpackage.cgwh
    public jic i() {
        return this.o;
    }

    @Override // defpackage.chas, defpackage.cgwh
    public cqkl j() {
        if (d().booleanValue()) {
            this.p.p(null, q().aj(), null);
        } else {
            chaq chaqVar = this.d;
            if (chaqVar != null) {
                chaqVar.M();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.chas
    public jht v() {
        jhu h = jhv.h();
        h.d(jhm.b(R.string.UGC_TASK_CARD_DISMISS_PLACE).c());
        if (x()) {
            h.d(jhm.b(R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE).c());
        }
        jhi jhiVar = (jhi) h;
        jhiVar.b = new jhr(this) { // from class: chaw
            private final chay a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                chay chayVar = this.a;
                if (i == R.string.UGC_TASK_CARD_DISMISS_PLACE) {
                    chayVar.w();
                } else if (i != R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE) {
                } else {
                    chayVar.z();
                }
            }
        };
        return jhiVar.b();
    }
}
