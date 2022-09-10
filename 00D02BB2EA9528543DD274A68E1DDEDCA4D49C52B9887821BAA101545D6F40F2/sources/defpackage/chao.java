package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: chao  reason: default package */
/* loaded from: classes4.dex */
public class chao extends chas {
    private String n;
    private String o;

    public chao(cgtl cgtlVar, boxa boxaVar, cjqy cjqyVar, gga ggaVar, bvrb bvrbVar, cgen cgenVar, bumy bumyVar, List<cgsk> list) {
        super(boxaVar, cjqyVar, ggaVar, cgenVar, bumyVar, null, list);
        dwpt dwptVar;
        this.n = "";
        this.o = "";
        if (!list.isEmpty()) {
            dwqc b = list.get(0).b();
            if (b.b == 4) {
                dwptVar = (dwpt) b.c;
            } else {
                dwptVar = dwpt.c;
            }
            this.n = dwptVar.a;
            this.o = dwptVar.b;
        }
    }

    @Override // defpackage.chas, defpackage.cgwh
    public String a() {
        return this.n;
    }

    @Override // defpackage.chas, defpackage.cgwh
    public Boolean f() {
        boolean z = true;
        if (this.b.b != 4 && !e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgwh
    public Boolean g() {
        return false;
    }

    @Override // defpackage.chas, defpackage.cgwh
    public String h() {
        return this.o;
    }

    @Override // defpackage.chas
    public jht v() {
        jhu h = jhv.h();
        h.d(jhm.b(R.string.UGC_TASK_CARD_DISMISS_PLACE).c());
        if (x()) {
            h.d(jhm.b(R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE).c());
        }
        jhi jhiVar = (jhi) h;
        jhiVar.b = new jhr(this) { // from class: chan
            private final chao a;

            {
                this.a = this;
            }

            @Override // defpackage.jhr
            public final void a(int i) {
                chao chaoVar = this.a;
                if (i == R.string.UGC_TASK_CARD_DISMISS_PLACE) {
                    chaoVar.w();
                } else if (i != R.string.UGC_TASKS_SHARE_TASK_MENU_ITEM_TITLE) {
                } else {
                    chaoVar.z();
                }
            }
        };
        return jhiVar.b();
    }
}
