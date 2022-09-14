package com.google.android.material.datepicker;

import a.g.m.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends RecyclerView.g<b> {

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.material.datepicker.a f8056c;

    /* renamed from: d  reason: collision with root package name */
    private final d<?> f8057d;

    /* renamed from: e  reason: collision with root package name */
    private final MaterialCalendar.l f8058e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8059f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f8060b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f8060b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f8060b.getAdapter2().e(i)) {
                k.this.f8058e.a(this.f8060b.getAdapter2().mo280getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            this.t = (TextView) linearLayout.findViewById(c.e.a.c.f.month_title);
            v.a((View) this.t, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(c.e.a.c.f.month_grid);
            if (!z) {
                this.t.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, MaterialCalendar.l lVar) {
        i n = aVar.n();
        i k = aVar.k();
        i m = aVar.m();
        if (n.compareTo(m) <= 0) {
            if (m.compareTo(k) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            }
            this.f8059f = (j.f8051f * MaterialCalendar.b(context)) + (MaterialDatePicker.g(context) ? MaterialCalendar.b(context) : 0);
            this.f8056c = aVar;
            this.f8057d = dVar;
            this.f8058e = lVar;
            a(true);
            return;
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f8056c.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(i iVar) {
        return this.f8056c.n().b(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long a(int i) {
        return this.f8056c.n().b(i).o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: a */
    public void b(b bVar, int i) {
        i b2 = this.f8056c.n().b(i);
        bVar.t.setText(b2.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(c.e.a.c.f.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !b2.equals(materialCalendarGridView.getAdapter2().f8052b)) {
            j jVar = new j(b2, this.f8057d, this.f8056c);
            materialCalendarGridView.setNumColumns(b2.f8048f);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c.e.a.c.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (MaterialDatePicker.g(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f8059f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i c(int i) {
        return this.f8056c.n().b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d(int i) {
        return c(i).n();
    }
}
