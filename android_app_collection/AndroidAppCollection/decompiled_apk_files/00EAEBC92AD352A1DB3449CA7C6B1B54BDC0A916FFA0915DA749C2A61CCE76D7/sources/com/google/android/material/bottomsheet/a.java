package com.google.android.material.bottomsheet;

import a.g.m.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import c.e.a.c.f;
import c.e.a.c.j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: d  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f7955d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f7956e;

    /* renamed from: f  reason: collision with root package name */
    boolean f7957f;

    /* renamed from: g  reason: collision with root package name */
    boolean f7958g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7959h;
    private boolean i;
    private BottomSheetBehavior.e j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomsheet.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0154a implements View.OnClickListener {
        View$OnClickListenerC0154a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (!aVar.f7958g || !aVar.isShowing() || !a.this.e()) {
                return;
            }
            a.this.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a.g.m.a {
        b() {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            boolean z;
            super.a(view, cVar);
            if (a.this.f7958g) {
                cVar.a(1048576);
                z = true;
            } else {
                z = false;
            }
            cVar.f(z);
        }

        @Override // a.g.m.a
        public boolean a(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.f7958g) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.a(view, i, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {
        c(a aVar) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class d extends BottomSheetBehavior.e {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void a(View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
        public void a(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    public a(Context context, int i) {
        super(context, a(context, i));
        this.f7958g = true;
        this.f7959h = true;
        this.j = new d();
        a(1);
    }

    private static int a(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            return context.getTheme().resolveAttribute(c.e.a.c.b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : j.Theme_Design_Light_BottomSheetDialog;
        }
        return i;
    }

    private View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f7956e.findViewById(f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f7956e.findViewById(f.design_bottom_sheet);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f.touch_outside).setOnClickListener(new View$OnClickListenerC0154a());
        v.a(frameLayout, new b());
        frameLayout.setOnTouchListener(new c(this));
        return this.f7956e;
    }

    private FrameLayout f() {
        if (this.f7956e == null) {
            this.f7956e = (FrameLayout) View.inflate(getContext(), c.e.a.c.h.design_bottom_sheet_dialog, null);
            this.f7955d = BottomSheetBehavior.b((FrameLayout) this.f7956e.findViewById(f.design_bottom_sheet));
            this.f7955d.a(this.j);
            this.f7955d.b(this.f7958g);
        }
        return this.f7956e;
    }

    public BottomSheetBehavior<FrameLayout> b() {
        if (this.f7955d == null) {
            f();
        }
        return this.f7955d;
    }

    public boolean c() {
        return this.f7957f;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> b2 = b();
        if (!this.f7957f || b2.b() == 5) {
            super.cancel();
        } else {
            b2.e(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f7955d.b(this.j);
    }

    boolean e() {
        if (!this.i) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f7959h = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.i = true;
        }
        return this.f7959h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7955d;
        if (bottomSheetBehavior == null || bottomSheetBehavior.b() != 5) {
            return;
        }
        this.f7955d.e(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f7958g != z) {
            this.f7958g = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f7955d;
            if (bottomSheetBehavior == null) {
                return;
            }
            bottomSheetBehavior.b(z);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f7958g) {
            this.f7958g = true;
        }
        this.f7959h = z;
        this.i = true;
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }
}
