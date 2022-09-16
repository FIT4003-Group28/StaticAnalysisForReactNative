package com.google.android.material.datepicker;

import a.g.m.v;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class MaterialCalendar<S> extends m<S> {
    static final Object i0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object j0 = "NAVIGATION_PREV_TAG";
    static final Object k0 = "NAVIGATION_NEXT_TAG";
    static final Object l0 = "SELECTOR_TOGGLE_TAG";
    private int Y;
    private com.google.android.material.datepicker.d<S> Z;
    private com.google.android.material.datepicker.a a0;
    private com.google.android.material.datepicker.i b0;
    private k c0;
    private com.google.android.material.datepicker.c d0;
    private RecyclerView e0;
    private RecyclerView f0;
    private View g0;
    private View h0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f7989b;

        a(int i) {
            this.f7989b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.f0.smoothScrollToPosition(this.f7989b);
        }
    }

    /* loaded from: classes.dex */
    class b extends a.g.m.a {
        b(MaterialCalendar materialCalendar) {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            cVar.a((Object) null);
        }
    }

    /* loaded from: classes.dex */
    class c extends n {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void a(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = MaterialCalendar.this.f0.getWidth();
                iArr[1] = MaterialCalendar.this.f0.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f0.getHeight();
            iArr[1] = MaterialCalendar.this.f0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.MaterialCalendar.l
        public void a(long j) {
            if (MaterialCalendar.this.a0.j().a(j)) {
                MaterialCalendar.this.Z.b(j);
                Iterator<com.google.android.material.datepicker.l<S>> it = MaterialCalendar.this.X.iterator();
                while (it.hasNext()) {
                    it.next().a((S) MaterialCalendar.this.Z.i());
                }
                MaterialCalendar.this.f0.getAdapter().d();
                if (MaterialCalendar.this.e0 == null) {
                    return;
                }
                MaterialCalendar.this.e0.getAdapter().d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f7992a = o.d();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f7993b = o.d();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void a(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            if (!(recyclerView.getAdapter() instanceof p) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                return;
            }
            p pVar = (p) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (androidx.core.util.d<Long, Long> dVar : MaterialCalendar.this.Z.f()) {
                Long l = dVar.f1593a;
                if (l != null && dVar.f1594b != null) {
                    this.f7992a.setTimeInMillis(l.longValue());
                    this.f7993b.setTimeInMillis(dVar.f1594b.longValue());
                    int c2 = pVar.c(this.f7992a.get(1));
                    int c3 = pVar.c(this.f7993b.get(1));
                    View c4 = gridLayoutManager.c(c2);
                    View c5 = gridLayoutManager.c(c3);
                    int M = c2 / gridLayoutManager.M();
                    int M2 = c3 / gridLayoutManager.M();
                    int i = M;
                    while (i <= M2) {
                        View c6 = gridLayoutManager.c(gridLayoutManager.M() * i);
                        if (c6 != null) {
                            canvas.drawRect(i == M ? c4.getLeft() + (c4.getWidth() / 2) : 0, c6.getTop() + MaterialCalendar.this.d0.f8034d.b(), i == M2 ? c5.getLeft() + (c5.getWidth() / 2) : recyclerView.getWidth(), c6.getBottom() - MaterialCalendar.this.d0.f8034d.a(), MaterialCalendar.this.d0.f8038h);
                        }
                        i++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends a.g.m.a {
        f() {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            MaterialCalendar materialCalendar;
            int i;
            super.a(view, cVar);
            if (MaterialCalendar.this.h0.getVisibility() == 0) {
                materialCalendar = MaterialCalendar.this;
                i = c.e.a.c.i.mtrl_picker_toggle_to_year_selection;
            } else {
                materialCalendar = MaterialCalendar.this;
                i = c.e.a.c.i.mtrl_picker_toggle_to_day_selection;
            }
            cVar.d(materialCalendar.a(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f7996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f7997b;

        g(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.f7996a = kVar;
            this.f7997b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f7997b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager r0 = MaterialCalendar.this.r0();
            int G = i < 0 ? r0.G() : r0.H();
            MaterialCalendar.this.b0 = this.f7996a.c(G);
            this.f7997b.setText(this.f7996a.d(G));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.s0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f8000b;

        i(com.google.android.material.datepicker.k kVar) {
            this.f8000b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int G = MaterialCalendar.this.r0().G() + 1;
            if (G < MaterialCalendar.this.f0.getAdapter().a()) {
                MaterialCalendar.this.a(this.f8000b.c(G));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f8002b;

        j(com.google.android.material.datepicker.k kVar) {
            this.f8002b = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int H = MaterialCalendar.this.r0().H() - 1;
            if (H >= 0) {
                MaterialCalendar.this.a(this.f8002b.c(H));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface l {
        void a(long j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MaterialCalendar<T> a(com.google.android.material.datepicker.d<T> dVar, int i2, com.google.android.material.datepicker.a aVar) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.m());
        materialCalendar.m(bundle);
        return materialCalendar;
    }

    private void a(View view, com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(c.e.a.c.f.month_navigation_fragment_toggle);
        materialButton.setTag(l0);
        v.a(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(c.e.a.c.f.month_navigation_previous);
        materialButton2.setTag(j0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(c.e.a.c.f.month_navigation_next);
        materialButton3.setTag(k0);
        this.g0 = view.findViewById(c.e.a.c.f.mtrl_calendar_year_selector_frame);
        this.h0 = view.findViewById(c.e.a.c.f.mtrl_calendar_day_selector_frame);
        a(k.DAY);
        materialButton.setText(this.b0.n());
        this.f0.addOnScrollListener(new g(kVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(kVar));
        materialButton2.setOnClickListener(new j(kVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Context context) {
        return context.getResources().getDimensionPixelSize(c.e.a.c.d.mtrl_calendar_day_height);
    }

    private void e(int i2) {
        this.f0.post(new a(i2));
    }

    private RecyclerView.n t0() {
        return new e();
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.Y);
        this.d0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.i n = this.a0.n();
        if (MaterialDatePicker.g(contextThemeWrapper)) {
            i2 = c.e.a.c.h.mtrl_calendar_vertical;
            i3 = 1;
        } else {
            i2 = c.e.a.c.h.mtrl_calendar_horizontal;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(c.e.a.c.f.mtrl_calendar_days_of_week);
        v.a(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(n.f8048f);
        gridView.setEnabled(false);
        this.f0 = (RecyclerView) inflate.findViewById(c.e.a.c.f.mtrl_calendar_months);
        this.f0.setLayoutManager(new c(n(), i3, false, i3));
        this.f0.setTag(i0);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.Z, this.a0, new d());
        this.f0.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(c.e.a.c.g.mtrl_calendar_year_selector_span);
        this.e0 = (RecyclerView) inflate.findViewById(c.e.a.c.f.mtrl_calendar_year_selector_frame);
        RecyclerView recyclerView = this.e0;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.e0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.e0.setAdapter(new p(this));
            this.e0.addItemDecoration(t0());
        }
        if (inflate.findViewById(c.e.a.c.f.month_navigation_fragment_toggle) != null) {
            a(inflate, kVar);
        }
        if (!MaterialDatePicker.g(contextThemeWrapper)) {
            new androidx.recyclerview.widget.i().a(this.f0);
        }
        this.f0.scrollToPosition(kVar.a(this.b0));
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar) {
        this.c0 = kVar;
        if (kVar == k.YEAR) {
            this.e0.getLayoutManager().i(((p) this.e0.getAdapter()).c(this.b0.f8047e));
            this.g0.setVisibility(0);
            this.h0.setVisibility(8);
        } else if (kVar != k.DAY) {
        } else {
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            a(this.b0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.google.android.material.datepicker.i iVar) {
        RecyclerView recyclerView;
        int i2;
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f0.getAdapter();
        int a2 = kVar.a(iVar);
        int a3 = a2 - kVar.a(this.b0);
        boolean z = true;
        boolean z2 = Math.abs(a3) > 3;
        if (a3 <= 0) {
            z = false;
        }
        this.b0 = iVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.f0;
                i2 = a2 + 3;
            }
            e(a2);
        }
        recyclerView = this.f0;
        i2 = a2 - 3;
        recyclerView.scrollToPosition(i2);
        e(a2);
    }

    @Override // androidx.fragment.app.Fragment
    public void c(Bundle bundle) {
        super.c(bundle);
        if (bundle == null) {
            bundle = l();
        }
        this.Y = bundle.getInt("THEME_RES_ID_KEY");
        this.Z = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.a0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.b0 = (com.google.android.material.datepicker.i) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Y);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.a0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.b0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.a n0() {
        return this.a0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.c o0() {
        return this.d0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.i p0() {
        return this.b0;
    }

    public com.google.android.material.datepicker.d<S> q0() {
        return this.Z;
    }

    LinearLayoutManager r0() {
        return (LinearLayoutManager) this.f0.getLayoutManager();
    }

    void s0() {
        k kVar;
        k kVar2 = this.c0;
        if (kVar2 == k.YEAR) {
            kVar = k.DAY;
        } else if (kVar2 != k.DAY) {
            return;
        } else {
            kVar = k.YEAR;
        }
        a(kVar);
    }
}
