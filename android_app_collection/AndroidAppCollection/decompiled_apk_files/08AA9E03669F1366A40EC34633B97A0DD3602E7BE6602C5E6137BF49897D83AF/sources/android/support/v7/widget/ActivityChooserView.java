package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    final a f817a;

    /* renamed from: b  reason: collision with root package name */
    final FrameLayout f818b;

    /* renamed from: c  reason: collision with root package name */
    final FrameLayout f819c;

    /* renamed from: d  reason: collision with root package name */
    android.support.v4.j.c f820d;
    final DataSetObserver e;
    PopupWindow.OnDismissListener f;
    boolean g;
    int h;
    private final b i;
    private final View j;
    private final ImageView k;
    private final int l;
    private final ViewTreeObserver.OnGlobalLayoutListener m;
    private z n;
    private boolean o;
    private int p;

    public void setActivityChooserModel(e eVar) {
        this.f817a.a(eVar);
        if (c()) {
            b();
            a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.k.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.k.setContentDescription(getContext().getString(i));
    }

    public void setProvider(android.support.v4.j.c cVar) {
        this.f820d = cVar;
    }

    public boolean a() {
        if (c() || !this.o) {
            return false;
        }
        this.g = false;
        a(this.h);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(int r6) {
        /*
            r5 = this;
            android.support.v7.widget.ActivityChooserView$a r0 = r5.f817a
            android.support.v7.widget.e r0 = r0.d()
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data model. Did you call #setDataModel?"
            r6.<init>(r0)
            throw r6
        L10:
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r5.m
            r0.addOnGlobalLayoutListener(r1)
            android.widget.FrameLayout r0 = r5.f819c
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            int r3 = r3.c()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r4) goto L41
            int r4 = r6 + r0
            if (r3 <= r4) goto L41
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            r3.a(r2)
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            int r6 = r6 - r2
            r3.a(r6)
            goto L4b
        L41:
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            r3.a(r1)
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            r3.a(r6)
        L4b:
            android.support.v7.widget.z r6 = r5.getListPopupWindow()
            boolean r3 = r6.d()
            if (r3 != 0) goto L9f
            boolean r3 = r5.g
            if (r3 != 0) goto L62
            if (r0 != 0) goto L5c
            goto L62
        L5c:
            android.support.v7.widget.ActivityChooserView$a r0 = r5.f817a
            r0.a(r1, r1)
            goto L67
        L62:
            android.support.v7.widget.ActivityChooserView$a r3 = r5.f817a
            r3.a(r2, r0)
        L67:
            android.support.v7.widget.ActivityChooserView$a r0 = r5.f817a
            int r0 = r0.a()
            int r3 = r5.l
            int r0 = java.lang.Math.min(r0, r3)
            r6.g(r0)
            r6.a()
            android.support.v4.j.c r0 = r5.f820d
            if (r0 == 0) goto L82
            android.support.v4.j.c r0 = r5.f820d
            r0.a(r2)
        L82:
            android.widget.ListView r0 = r6.e()
            android.content.Context r2 = r5.getContext()
            int r3 = android.support.v7.a.a.h.abc_activitychooserview_choose_application
            java.lang.String r2 = r2.getString(r3)
            r0.setContentDescription(r2)
            android.widget.ListView r6 = r6.e()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r6.setSelector(r0)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserView.a(int):void");
    }

    public boolean b() {
        if (c()) {
            getListPopupWindow().c();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                return true;
            }
            viewTreeObserver.removeGlobalOnLayoutListener(this.m);
            return true;
        }
        return true;
    }

    public boolean c() {
        return getListPopupWindow().d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e d2 = this.f817a.d();
        if (d2 != null) {
            d2.registerObserver(this.e);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e d2 = this.f817a.d();
        if (d2 != null) {
            d2.unregisterObserver(this.e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.m);
        }
        if (c()) {
            b();
        }
        this.o = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.j;
        if (this.f819c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.j.layout(0, 0, i3 - i, i4 - i2);
        if (!c()) {
            b();
        }
    }

    public e getDataModel() {
        return this.f817a.d();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.h = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.p = i;
    }

    z getListPopupWindow() {
        if (this.n == null) {
            this.n = new z(getContext());
            this.n.a(this.f817a);
            this.n.b(this);
            this.n.a(true);
            this.n.a((AdapterView.OnItemClickListener) this.i);
            this.n.a((PopupWindow.OnDismissListener) this.i);
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityChooserView f826a;

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f826a.b();
                    if (this.f826a.g) {
                        if (i <= 0) {
                            return;
                        }
                        this.f826a.f817a.d().c(i);
                        return;
                    }
                    if (!this.f826a.f817a.e()) {
                        i++;
                    }
                    Intent b2 = this.f826a.f817a.d().b(i);
                    if (b2 == null) {
                        return;
                    }
                    b2.addFlags(PKIFailureInfo.signerNotTrusted);
                    this.f826a.getContext().startActivity(b2);
                    return;
                case 1:
                    this.f826a.a(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == this.f826a.f819c) {
                this.f826a.b();
                Intent b2 = this.f826a.f817a.d().b(this.f826a.f817a.d().a(this.f826a.f817a.b()));
                if (b2 == null) {
                    return;
                }
                b2.addFlags(PKIFailureInfo.signerNotTrusted);
                this.f826a.getContext().startActivity(b2);
            } else if (view == this.f826a.f818b) {
                this.f826a.g = false;
                this.f826a.a(this.f826a.h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view == this.f826a.f819c) {
                if (this.f826a.f817a.getCount() > 0) {
                    this.f826a.g = true;
                    this.f826a.a(this.f826a.h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            if (this.f826a.f820d != null) {
                this.f826a.f820d.a(false);
            }
        }

        private void a() {
            if (this.f826a.f != null) {
                this.f826a.f.onDismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActivityChooserView f822a;

        /* renamed from: b  reason: collision with root package name */
        private e f823b;

        /* renamed from: c  reason: collision with root package name */
        private int f824c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f825d;
        private boolean e;
        private boolean f;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void a(e eVar) {
            e d2 = this.f822a.f817a.d();
            if (d2 != null && this.f822a.isShown()) {
                d2.unregisterObserver(this.f822a.e);
            }
            this.f823b = eVar;
            if (eVar != null && this.f822a.isShown()) {
                eVar.registerObserver(this.f822a.e);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (!this.f || i != getCount() - 1) ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int a2 = this.f823b.a();
            if (!this.f825d && this.f823b.b() != null) {
                a2--;
            }
            int min = Math.min(a2, this.f824c);
            return this.f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f825d && this.f823b.b() != null) {
                        i++;
                    }
                    return this.f823b.a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != a.f.list_item) {
                        view = LayoutInflater.from(this.f822a.getContext()).inflate(a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f822a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(a.f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(a.f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f825d && i == 0 && this.e) {
                        view.setActivated(true);
                    } else {
                        view.setActivated(false);
                    }
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View inflate = LayoutInflater.from(this.f822a.getContext()).inflate(a.g.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(a.f.title)).setText(this.f822a.getContext().getString(a.h.abc_activity_chooser_view_see_all));
                    return inflate;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int a() {
            int i = this.f824c;
            this.f824c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f824c = i;
            return i2;
        }

        public void a(int i) {
            if (this.f824c != i) {
                this.f824c = i;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo b() {
            return this.f823b.b();
        }

        public void a(boolean z) {
            if (this.f != z) {
                this.f = z;
                notifyDataSetChanged();
            }
        }

        public int c() {
            return this.f823b.a();
        }

        public e d() {
            return this.f823b;
        }

        public void a(boolean z, boolean z2) {
            if (this.f825d == z && this.e == z2) {
                return;
            }
            this.f825d = z;
            this.e = z2;
            notifyDataSetChanged();
        }

        public boolean e() {
            return this.f825d;
        }
    }

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private static final int[] f821a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            am a2 = am.a(context, attributeSet, f821a);
            setBackgroundDrawable(a2.a(0));
            a2.a();
        }
    }
}
