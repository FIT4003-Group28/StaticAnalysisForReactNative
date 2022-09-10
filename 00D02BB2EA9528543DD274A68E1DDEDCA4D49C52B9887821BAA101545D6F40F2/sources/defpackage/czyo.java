package defpackage;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
/* compiled from: PG */
/* renamed from: czyo  reason: default package */
/* loaded from: classes5.dex */
final class czyo implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ czyq b;

    public czyo(czyq czyqVar, int i) {
        this.b = czyqVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Month b = Month.b(this.a, this.b.a.c.b);
        CalendarConstraints calendarConstraints = this.b.a.b;
        if (b.compareTo(calendarConstraints.a) < 0) {
            b = calendarConstraints.a;
        } else if (b.compareTo(calendarConstraints.b) > 0) {
            b = calendarConstraints.b;
        }
        this.b.a.d(b);
        this.b.a.g(1);
    }
}
