package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private final MaterialCalendar<?> f8062c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f8063b;

        a(int i) {
            this.f8063b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.f8062c.a(i.a(this.f8063b, p.this.f8062c.p0().f8046d));
            p.this.f8062c.a(MaterialCalendar.k.DAY);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        final TextView t;

        b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(MaterialCalendar<?> materialCalendar) {
        this.f8062c = materialCalendar;
    }

    private View.OnClickListener e(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f8062c.n0().o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: a */
    public void b(b bVar, int i) {
        int d2 = d(i);
        String string = bVar.t.getContext().getString(c.e.a.c.i.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d2)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(d2)));
        c o0 = this.f8062c.o0();
        Calendar b2 = o.b();
        com.google.android.material.datepicker.b bVar2 = b2.get(1) == d2 ? o0.f8036f : o0.f8034d;
        for (Long l : this.f8062c.q0().h()) {
            b2.setTimeInMillis(l.longValue());
            if (b2.get(1) == d2) {
                bVar2 = o0.f8035e;
            }
        }
        bVar2.a(bVar.t);
        bVar.t.setOnClickListener(e(d2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.e.a.c.h.mtrl_calendar_year, viewGroup, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i) {
        return i - this.f8062c.n0().n().f8047e;
    }

    int d(int i) {
        return this.f8062c.n0().n().f8047e + i;
    }
}
