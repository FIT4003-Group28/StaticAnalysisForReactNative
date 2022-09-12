package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.google.android.apps.maps.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czyg  reason: default package */
/* loaded from: classes5.dex */
public final class czyg extends abg<czyf> {
    public final Context a;
    public final czxl e;
    private final CalendarConstraints f;
    private final DateSelector<?> g;
    private final int h;

    public czyg(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, czxl czxlVar) {
        Month month = calendarConstraints.a;
        Month month2 = calendarConstraints.b;
        Month month3 = calendarConstraints.d;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int e = czyd.a * czxs.e(context);
        int e2 = czxy.aM(context) ? czxs.e(context) : 0;
        this.a = context;
        this.h = e + e2;
        this.f = calendarConstraints;
        this.g = dateSelector;
        this.e = czxlVar;
        j(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Month a(int i) {
        return this.f.a.h(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(Month month) {
        return this.f.a.f(month);
    }

    @Override // defpackage.abg
    public final int c() {
        return this.f.f;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ czyf d(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (czxy.aM(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new abt(-1, this.h));
            return new czyf(linearLayout, true);
        }
        return new czyf(linearLayout, false);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(czyf czyfVar, int i) {
        czyf czyfVar2 = czyfVar;
        Month h = this.f.a.h(i);
        czyfVar2.s.setText(h.i(czyfVar2.a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) czyfVar2.t.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !h.equals(materialCalendarGridView.getAdapter2().b)) {
            czyd czydVar = new czyd(h, this.g, this.f);
            materialCalendarGridView.setNumColumns(h.d);
            materialCalendarGridView.setAdapter((ListAdapter) czydVar);
        } else {
            materialCalendarGridView.invalidate();
            czyd adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l : adapter2.d) {
                adapter2.b(materialCalendarGridView, l.longValue());
            }
            DateSelector<?> dateSelector = adapter2.c;
            if (dateSelector != null) {
                for (Long l2 : dateSelector.c()) {
                    adapter2.b(materialCalendarGridView, l2.longValue());
                }
                adapter2.d = adapter2.c.c();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new czye(this, materialCalendarGridView));
    }

    @Override // defpackage.abg
    public final long k(int i) {
        return this.f.a.h(i).a.getTimeInMillis();
    }
}
