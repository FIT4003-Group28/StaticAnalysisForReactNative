package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bbcn  reason: default package */
/* loaded from: classes3.dex */
public class bbcn extends ibd implements bayq {
    public final gga g;
    public final anhg h;
    private final acyp i;
    private final dcdc<iao> j;
    private final dcdc<bayl> k;
    private final boolean l;

    public bbcn(acyp acypVar, gga ggaVar, anhg anhgVar, cqhn cqhnVar, cjqy cjqyVar, List<iao> list, List<bayl> list2, hzz hzzVar, boolean z) {
        super(cqhnVar, cjqyVar);
        this.d.add(hzzVar);
        this.i = acypVar;
        this.g = ggaVar;
        this.h = anhgVar;
        this.j = dcdc.r(list);
        this.k = dcdc.r(list2);
        this.l = z;
    }

    @Override // defpackage.bayq
    public jib d() {
        dkls dklsVar = this.i.e().b;
        if (dklsVar == null) {
            dklsVar = dkls.b;
        }
        int a = dklr.a(dklsVar.a);
        int i = R.string.SAVED_TAB_BUTTON;
        if (a != 0 && a == 3) {
            i = R.string.YOUR_PLACES_PAGE_TITLE;
        }
        jhz a2 = jhz.a();
        a2.a = this.g.getString(i);
        a2.f(new View.OnClickListener(this) { // from class: bbck
            private final bbcn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.g.onBackPressed();
            }
        });
        a2.x = false;
        String string = this.g.getString(R.string.SETTINGS);
        jhm jhmVar = new jhm();
        jhmVar.a = string;
        jhmVar.b = string;
        jhmVar.h = 0;
        jhmVar.f = cjtd.a(dtyg.L);
        jhmVar.d(new View.OnClickListener(this) { // from class: bbcl
            private final bbcn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h.l();
            }
        });
        a2.c(jhmVar.c());
        a2.l = this.g.getString(R.string.ACCESSIBILITY_OVERFLOW_MENU);
        if (this.l) {
            a2.j = null;
            a2.i = null;
            a2.k = null;
        }
        dkls dklsVar2 = this.i.e().b;
        if (dklsVar2 == null) {
            dklsVar2 = dkls.b;
        }
        int a3 = dklr.a(dklsVar2.a);
        int i2 = R.string.SAVED_PAGE_TITLE_CONTENT_DESCRIPTION;
        if (a3 != 0 && a3 == 3) {
            i2 = R.string.PLACES_PAGE_TITLE_CONTENT_DESCRIPTION;
        }
        a2.n = this.g.getString(i2);
        return a2.b();
    }

    @Override // defpackage.bayq
    public List<iao> e() {
        return this.j;
    }

    @Override // defpackage.bayq
    public List<bayl> f() {
        return this.k;
    }

    @Override // defpackage.bayq
    public Boolean g() {
        return Boolean.valueOf(this.l);
    }
}
