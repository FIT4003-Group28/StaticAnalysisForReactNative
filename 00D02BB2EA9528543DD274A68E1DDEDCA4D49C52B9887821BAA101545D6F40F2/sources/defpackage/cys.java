package defpackage;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cys  reason: default package */
/* loaded from: classes5.dex */
public class cys implements View.OnClickListener, PopupMenu.OnMenuItemClickListener, cyg {
    private final gga a;
    private final isd b;
    @dzsi
    private dqmr c;
    private String f;
    private cqss e = ibl.p();
    private Boolean d = false;

    public cys(gga ggaVar, cyi cyiVar, isd isdVar) {
        this.a = ggaVar;
        this.b = isdVar;
        this.f = ggaVar.getString(R.string.PROMOTED_PLACE_AD_BLOCKING_MENU_ITEM_TEXT);
    }

    @Override // defpackage.cyg
    public View.OnClickListener a() {
        return this;
    }

    @Override // defpackage.cyg
    public cjtd b() {
        return cjtd.a(dtyi.cQ);
    }

    @Override // defpackage.cyg
    public Boolean c() {
        return this.d;
    }

    @Override // defpackage.cyg
    public cqss d() {
        return this.e;
    }

    @Override // defpackage.cyg
    public String e() {
        return this.f;
    }

    public void f(@dzsi dqmr dqmrVar) {
        this.c = dqmrVar;
    }

    public void g(cqss cqssVar) {
        this.e = cqssVar;
    }

    public void h(String str) {
        this.f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        isc a = this.b.a(view);
        jhm jhmVar = new jhm();
        jhmVar.a = this.a.getString(R.string.PROMOTED_PLACE_AD_BLOCKING_MENU_ITEM_TEXT);
        jhmVar.b = this.a.getString(R.string.PROMOTED_PLACE_AD_BLOCKING_MENU_ITEM_TEXT);
        jhmVar.f = cjtd.a(dtyi.cR);
        a.a(dcdc.f(jhmVar.c()));
        a.c = this;
        a.show();
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        dqmr dqmrVar = this.c;
        if (dqmrVar != null) {
            gei.a(this.a, cyj.g(dqmrVar));
            return true;
        }
        return true;
    }
}
