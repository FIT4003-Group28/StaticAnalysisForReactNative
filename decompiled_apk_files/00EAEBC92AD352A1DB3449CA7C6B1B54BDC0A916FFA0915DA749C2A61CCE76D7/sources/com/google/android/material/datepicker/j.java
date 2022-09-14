package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    static final int f8051f = o.d().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    final i f8052b;

    /* renamed from: c  reason: collision with root package name */
    final d<?> f8053c;

    /* renamed from: d  reason: collision with root package name */
    c f8054d;

    /* renamed from: e  reason: collision with root package name */
    final a f8055e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i iVar, d<?> dVar, a aVar) {
        this.f8052b = iVar;
        this.f8053c = dVar;
        this.f8055e = aVar;
    }

    private void a(Context context) {
        if (this.f8054d == null) {
            this.f8054d = new c(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f8052b.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return a() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return (this.f8052b.m() + this.f8052b.f8049g) - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i) {
        return i % this.f8052b.f8048f == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i) {
        return (i + 1) % this.f8052b.f8048f == 0;
    }

    int d(int i) {
        return (i - this.f8052b.m()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(int i) {
        return i >= a() && i <= b();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8052b.f8049g + a();
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public Long mo280getItem(int i) {
        if (i < this.f8052b.m() || i > b()) {
            return null;
        }
        return Long.valueOf(this.f8052b.a(d(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f8052b.f8048f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.a(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = c.e.a.c.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L5e
            com.google.android.material.datepicker.i r2 = r5.f8052b
            int r3 = r2.f8049g
            if (r7 < r3) goto L2e
            goto L5e
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.i r2 = r5.f8052b
            long r2 = r2.a(r7)
            com.google.android.material.datepicker.i r7 = r5.f8052b
            int r7 = r7.f8047e
            com.google.android.material.datepicker.i r4 = com.google.android.material.datepicker.i.p()
            int r4 = r4.f8047e
            if (r7 != r4) goto L50
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            goto L54
        L50:
            java.lang.String r7 = com.google.android.material.datepicker.e.b(r2)
        L54:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L66
        L5e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r6 = r5.mo280getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            com.google.android.material.datepicker.a r7 = r5.f8055e
            com.google.android.material.datepicker.a$c r7 = r7.j()
            long r2 = r6.longValue()
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto Lcc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f8053c
            java.util.Collection r7 = r7.h()
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.o.a(r3)
            long r1 = com.google.android.material.datepicker.o.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
            com.google.android.material.datepicker.c r6 = r5.f8054d
            com.google.android.material.datepicker.b r6 = r6.f8032b
        Lae:
            r6.a(r0)
            return r0
        Lb2:
            java.util.Calendar r7 = com.google.android.material.datepicker.o.b()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lc7
            com.google.android.material.datepicker.c r6 = r5.f8054d
            com.google.android.material.datepicker.b r6 = r6.f8033c
            goto Lae
        Lc7:
            com.google.android.material.datepicker.c r6 = r5.f8054d
            com.google.android.material.datepicker.b r6 = r6.f8031a
            goto Lae
        Lcc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f8054d
            com.google.android.material.datepicker.b r6 = r6.f8037g
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
