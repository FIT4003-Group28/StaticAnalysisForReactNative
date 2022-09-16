package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
/* loaded from: classes.dex */
public class w extends Spinner implements a.g.m.u {
    private static final int[] j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    private final androidx.appcompat.widget.e f1395b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1396c;

    /* renamed from: d  reason: collision with root package name */
    private h0 f1397d;

    /* renamed from: e  reason: collision with root package name */
    private SpinnerAdapter f1398e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1399f;

    /* renamed from: g  reason: collision with root package name */
    private g f1400g;

    /* renamed from: h  reason: collision with root package name */
    int f1401h;
    final Rect i;

    /* loaded from: classes.dex */
    class a extends h0 {
        final /* synthetic */ e k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.k = eVar;
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.q a() {
            return this.k;
        }

        @Override // androidx.appcompat.widget.h0
        @SuppressLint({"SyntheticAccessor"})
        public boolean b() {
            if (!w.this.getInternalPopup().b()) {
                w.this.a();
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.a();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.app.c f1403b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f1404c;

        /* renamed from: d  reason: collision with root package name */
        private CharSequence f1405d;

        c() {
        }

        @Override // androidx.appcompat.widget.w.g
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i, int i2) {
            if (this.f1404c == null) {
                return;
            }
            c.a aVar = new c.a(w.this.getPopupContext());
            CharSequence charSequence = this.f1405d;
            if (charSequence != null) {
                aVar.a(charSequence);
            }
            aVar.a(this.f1404c, w.this.getSelectedItemPosition(), this);
            this.f1403b = aVar.a();
            ListView b2 = this.f1403b.b();
            if (Build.VERSION.SDK_INT >= 17) {
                b2.setTextDirection(i);
                b2.setTextAlignment(i2);
            }
            this.f1403b.show();
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(ListAdapter listAdapter) {
            this.f1404c = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(CharSequence charSequence) {
            this.f1405d = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public boolean b() {
            androidx.appcompat.app.c cVar = this.f1403b;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.w.g
        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.w.g
        public Drawable d() {
            return null;
        }

        @Override // androidx.appcompat.widget.w.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1403b;
            if (cVar != null) {
                cVar.dismiss();
                this.f1403b = null;
            }
        }

        @Override // androidx.appcompat.widget.w.g
        public int f() {
            return 0;
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.f1405d;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f1404c.getItemId(i));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        private SpinnerAdapter f1407b;

        /* renamed from: c  reason: collision with root package name */
        private ListAdapter f1408c;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1407b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1408c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == theme) {
                        return;
                    }
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                } else if (!(spinnerAdapter instanceof t0)) {
                } else {
                    t0 t0Var = (t0) spinnerAdapter;
                    if (t0Var.getDropDownViewTheme() != null) {
                        return;
                    }
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1408c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1408c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1407b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends j0 implements g {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {
            a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    w.this.performItemClick(view, i, eVar.K.getItemId(i));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.b(w.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.m();
                e.super.c();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1411b;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1411b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1411b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.L = new Rect();
            a(w.this);
            a(true);
            h(0);
            a(new a(w.this));
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            m();
            g(2);
            super.c();
            ListView e2 = e();
            e2.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                e2.setTextDirection(i);
                e2.setTextAlignment(i2);
            }
            i(w.this.getSelectedItemPosition());
            if (!b2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                a(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.j0, androidx.appcompat.widget.w.g
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.K = listAdapter;
        }

        @Override // androidx.appcompat.widget.w.g
        public void a(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override // androidx.appcompat.widget.w.g
        public void b(int i) {
            this.M = i;
        }

        boolean b(View view) {
            return a.g.m.v.H(view) && view.getGlobalVisibleRect(this.L);
        }

        @Override // androidx.appcompat.widget.w.g
        public CharSequence g() {
            return this.J;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.d()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.w r1 = androidx.appcompat.widget.w.this
                android.graphics.Rect r1 = r1.i
                r0.getPadding(r1)
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                boolean r0 = androidx.appcompat.widget.d1.a(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                android.graphics.Rect r0 = r0.i
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.w r0 = androidx.appcompat.widget.w.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.w r2 = androidx.appcompat.widget.w.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.w r3 = androidx.appcompat.widget.w.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                int r5 = r4.f1401h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.K
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.d()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.w r5 = androidx.appcompat.widget.w.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.w r6 = androidx.appcompat.widget.w.this
                android.graphics.Rect r6 = r6.i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.e(r4)
                goto L85
            L82:
                r8.e(r5)
            L85:
                androidx.appcompat.widget.w r4 = androidx.appcompat.widget.w.this
                boolean r4 = androidx.appcompat.widget.d1.a(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.j()
                int r3 = r3 - r0
                int r0 = r8.n()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.n()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.c(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.e.m():void");
        }

        public int n() {
            return this.M;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        boolean f1413b;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<f> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public f mo58createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public f[] mo59newArray(int i) {
                return new f[i];
            }
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1413b = parcel.readByte() != 0;
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1413b ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        int a();

        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        void b(int i);

        boolean b();

        void c(int i);

        Drawable d();

        void dismiss();

        int f();

        CharSequence g();
    }

    public w(Context context, int i) {
        this(context, null, a.a.a.spinnerStyle, i);
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.spinnerStyle);
    }

    public w(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public w(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        r11.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.i = r0
            int[] r0 = a.a.j.Spinner
            r1 = 0
            androidx.appcompat.widget.x0 r0 = androidx.appcompat.widget.x0.a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1395b = r2
            if (r11 == 0) goto L22
            a.a.o.d r2 = new a.a.o.d
            r2.<init>(r7, r11)
        L1f:
            r6.f1396c = r2
            goto L32
        L22:
            int r11 = a.a.j.Spinner_popupTheme
            int r11 = r0.g(r11, r1)
            if (r11 == 0) goto L30
            a.a.o.d r2 = new a.a.o.d
            r2.<init>(r7, r11)
            goto L1f
        L30:
            r6.f1396c = r7
        L32:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L64
            int[] r11 = androidx.appcompat.widget.w.j     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5d
            if (r3 == 0) goto L46
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L5d
        L46:
            if (r11 == 0) goto L64
        L48:
            r11.recycle()
            goto L64
        L4c:
            r3 = move-exception
            goto L53
        L4e:
            r7 = move-exception
            r11 = r2
            goto L5e
        L51:
            r3 = move-exception
            r11 = r2
        L53:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L64
            goto L48
        L5d:
            r7 = move-exception
        L5e:
            if (r11 == 0) goto L63
            r11.recycle()
        L63:
            throw r7
        L64:
            r11 = 1
            if (r10 == 0) goto La1
            if (r10 == r11) goto L6a
            goto Lb3
        L6a:
            androidx.appcompat.widget.w$e r10 = new androidx.appcompat.widget.w$e
            android.content.Context r3 = r6.f1396c
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1396c
            int[] r4 = a.a.j.Spinner
            androidx.appcompat.widget.x0 r1 = androidx.appcompat.widget.x0.a(r3, r8, r4, r9, r1)
            int r3 = a.a.j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.f(r3, r4)
            r6.f1401h = r3
            int r3 = a.a.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.b(r3)
            r10.a(r3)
            int r3 = a.a.j.Spinner_android_prompt
            java.lang.String r3 = r0.d(r3)
            r10.a(r3)
            r1.a()
            r6.f1400g = r10
            androidx.appcompat.widget.w$a r1 = new androidx.appcompat.widget.w$a
            r1.<init>(r6, r10)
            r6.f1397d = r1
            goto Lb3
        La1:
            androidx.appcompat.widget.w$c r10 = new androidx.appcompat.widget.w$c
            r10.<init>()
            r6.f1400g = r10
            androidx.appcompat.widget.w$g r10 = r6.f1400g
            int r1 = a.a.j.Spinner_android_prompt
            java.lang.String r1 = r0.d(r1)
            r10.a(r1)
        Lb3:
            int r10 = a.a.j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.f(r10)
            if (r10 == 0) goto Lcb
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = a.a.g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lcb:
            r0.a()
            r6.f1399f = r11
            android.widget.SpinnerAdapter r7 = r6.f1398e
            if (r7 == 0) goto Ld9
            r6.setAdapter(r7)
            r6.f1398e = r2
        Ld9:
            androidx.appcompat.widget.e r7 = r6.f1395b
            r7.a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.w.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i2 + rect.left + rect.right;
    }

    void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1400g.a(getTextDirection(), getTextAlignment());
        } else {
            this.f1400g.a(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f1400g;
        if (gVar != null) {
            return gVar.a();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f1400g;
        if (gVar != null) {
            return gVar.f();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1400g != null) {
            return this.f1401h;
        }
        if (Build.VERSION.SDK_INT < 16) {
            return 0;
        }
        return super.getDropDownWidth();
    }

    final g getInternalPopup() {
        return this.f1400g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f1400g;
        if (gVar != null) {
            return gVar.d();
        }
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1396c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f1400g;
        return gVar != null ? gVar.g() : super.getPrompt();
    }

    @Override // a.g.m.u
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.g.m.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f1400g;
        if (gVar == null || !gVar.b()) {
            return;
        }
        this.f1400g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1400g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1413b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f1400g;
        fVar.f1413b = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f1397d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f1400g;
        if (gVar != null) {
            if (gVar.b()) {
                return true;
            }
            a();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1399f) {
            this.f1398e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1400g == null) {
            return;
        }
        Context context = this.f1396c;
        if (context == null) {
            context = getContext();
        }
        this.f1400g.a(new d(spinnerAdapter, context.getTheme()));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            eVar.a(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        g gVar = this.f1400g;
        if (gVar != null) {
            gVar.b(i);
            this.f1400g.c(i);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        g gVar = this.f1400g;
        if (gVar != null) {
            gVar.a(i);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1400g != null) {
            this.f1401h = i;
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f1400g;
        if (gVar != null) {
            gVar.a(drawable);
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.a.k.a.a.c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f1400g;
        if (gVar != null) {
            gVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.g.m.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1395b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }
}
