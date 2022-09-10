package defpackage;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: czyd  reason: default package */
/* loaded from: classes5.dex */
public final class czyd extends BaseAdapter {
    static final int a = czyn.b().getMaximum(4);
    public final Month b;
    public final DateSelector<?> c;
    public Collection<Long> d;
    public czxf e;
    final CalendarConstraints f;

    public czyd(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.b = month;
        this.c = dateSelector;
        this.f = calendarConstraints;
        this.d = dateSelector.c();
    }

    private final void f(TextView textView, long j) {
        if (this.f.c.a(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.c.c().iterator();
            while (it.hasNext()) {
                if (czyn.e(j) == czyn.e(it.next().longValue())) {
                    this.e.b.b(textView);
                    return;
                }
            }
            if (czyn.a().getTimeInMillis() == j) {
                this.e.c.b(textView);
                return;
            } else {
                this.e.a.b(textView);
                return;
            }
        }
        textView.setEnabled(false);
        this.e.g.b(textView);
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final Long getItem(int i) {
        if (i < this.b.d() || i > d()) {
            return null;
        }
        Month month = this.b;
        return Long.valueOf(month.g((i - month.d()) + 1));
    }

    public final void b(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.a(j).equals(this.b)) {
            Calendar d = czyn.d(this.b.a);
            d.setTimeInMillis(j);
            f((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().e(d.get(5))), j);
        }
    }

    public final int c() {
        return this.b.d();
    }

    public final int d() {
        return (this.b.d() + this.b.e) - 1;
    }

    public final int e(int i) {
        return c() + (i - 1);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.e + c();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.b.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            android.content.Context r0 = r9.getContext()
            czxf r1 = r6.e
            if (r1 != 0) goto Lf
            czxf r1 = new czxf
            r1.<init>(r0)
            r6.e = r1
        Lf:
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r8 != 0) goto L27
            android.content.Context r8 = r9.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r0 = 2131624146(0x7f0e00d2, float:1.8875463E38)
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r0 = r8
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r8 = r6.c()
            int r8 = r7 - r8
            if (r8 < 0) goto La3
            com.google.android.material.datepicker.Month r9 = r6.b
            int r2 = r9.e
            if (r8 < r2) goto L36
            goto La3
        L36:
            r2 = 1
            int r8 = r8 + r2
            r0.setTag(r9)
            java.lang.String r9 = java.lang.String.valueOf(r8)
            r0.setText(r9)
            com.google.android.material.datepicker.Month r9 = r6.b
            long r8 = r9.g(r8)
            com.google.android.material.datepicker.Month r3 = r6.b
            int r3 = r3.c
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.c()
            int r4 = r4.c
            r5 = 24
            if (r3 != r4) goto L74
            java.util.Locale r3 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L6a
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r3 = defpackage.czyn.f(r4, r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
            goto L87
        L6a:
            java.text.DateFormat r3 = defpackage.czyn.g(r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
            goto L95
        L74:
            java.util.Locale r3 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L8c
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r3 = defpackage.czyn.f(r4, r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
        L87:
            java.lang.String r8 = r3.format(r4)
            goto L99
        L8c:
            java.text.DateFormat r3 = defpackage.czyn.g(r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r8)
        L95:
            java.lang.String r8 = r3.format(r4)
        L99:
            r0.setContentDescription(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto Lab
        La3:
            r8 = 8
            r0.setVisibility(r8)
            r0.setEnabled(r1)
        Lab:
            java.lang.Long r7 = r6.getItem(r7)
            if (r7 == 0) goto Lb8
            long r7 = r7.longValue()
            r6.f(r0, r7)
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czyd.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
