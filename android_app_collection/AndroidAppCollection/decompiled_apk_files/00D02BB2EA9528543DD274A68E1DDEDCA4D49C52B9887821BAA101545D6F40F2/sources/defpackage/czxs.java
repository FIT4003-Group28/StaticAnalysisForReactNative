package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
/* compiled from: PG */
/* renamed from: czxs  reason: default package */
/* loaded from: classes5.dex */
public final class czxs<S> extends czyi<S> {
    public DateSelector<S> a;
    public int ad;
    private int af;
    private View ag;
    public CalendarConstraints b;
    public Month c;
    public czxf d;
    public RecyclerView e;
    public RecyclerView f;
    public View g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private final void i(int i) {
        this.f.post(new czxi(this, i));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, boolean] */
    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(H(), this.af);
        this.d = new czxf(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.b.a;
        ?? aM = czxy.aM(contextThemeWrapper);
        View inflate = cloneInContext.inflate(1 != aM ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        od.c(gridView, new czxj());
        gridView.setAdapter((ListAdapter) new czxh());
        gridView.setNumColumns(month.d);
        gridView.setEnabled(false);
        this.f = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f.setLayoutManager(new czxk(this, H(), aM == true ? 1 : 0, aM));
        this.f.setTag("MONTHS_VIEW_GROUP_TAG");
        czyg czygVar = new czyg(contextThemeWrapper, this.a, this.b, new czxl(this));
        this.f.setAdapter(czygVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e.setLayoutManager(new zy(integer));
            this.e.setAdapter(new czyq(this));
            this.e.g(new czxm(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            od.c(materialButton, new czxn(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.ag = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.g = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            g(1);
            materialButton.setText(this.c.i(inflate.getContext()));
            this.f.i(new czxo(this, czygVar, materialButton));
            materialButton.setOnClickListener(new czxp(this));
            materialButton3.setOnClickListener(new czxq(this, czygVar));
            materialButton2.setOnClickListener(new czxr(this, czygVar));
        }
        if (!czxy.aM(contextThemeWrapper)) {
            new aaz().f(this.f);
        }
        this.f.l(czygVar.b(this.c));
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Month month) {
        czyg czygVar = (czyg) this.f.k;
        int b = czygVar.b(month);
        int b2 = b - czygVar.b(this.c);
        int abs = Math.abs(b2);
        this.c = month;
        if (abs <= 3) {
            i(b);
        } else if (b2 <= 0) {
            this.f.l(b + 3);
            i(b);
        } else {
            this.f.l(b - 3);
            i(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aag f() {
        return (aag) this.f.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        this.ad = i;
        if (i == 2) {
            RecyclerView recyclerView = this.e;
            recyclerView.l.O(((czyq) recyclerView.k).a(this.c.c));
            this.ag.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        this.ag.setVisibility(8);
        this.g.setVisibility(0);
        d(this.c);
    }

    @Override // defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        this.af = bundle.getInt("THEME_RES_ID_KEY");
        this.a = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.af);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c);
    }
}
