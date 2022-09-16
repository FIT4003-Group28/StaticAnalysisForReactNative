package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: czwe  reason: default package */
/* loaded from: classes5.dex */
public class czwe extends rx {
    private BottomSheetBehavior<FrameLayout> a;
    boolean b;
    public boolean c;
    public boolean d;
    private FrameLayout e;
    private czvx f;

    public czwe(Context context) {
        this(context, 0);
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        c();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.e.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.e.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new czwa(this));
        od.c(frameLayout, new czwb(this));
        frameLayout.setOnTouchListener(new czwc());
        return this.e;
    }

    private final void c() {
        if (this.e == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.e = frameLayout;
            BottomSheetBehavior<FrameLayout> F = BottomSheetBehavior.F((FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet));
            this.a = F;
            F.x(this.f);
            this.a.v(this.b);
        }
    }

    public final BottomSheetBehavior<FrameLayout> a() {
        if (this.a == null) {
            c();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rx, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.o != 5) {
            return;
        }
        bottomSheetBehavior.y(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.b != z) {
            this.b = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.a;
            if (bottomSheetBehavior == null) {
                return;
            }
            bottomSheetBehavior.v(z);
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.b) {
            this.b = true;
        }
        this.c = z;
        this.d = true;
    }

    @Override // defpackage.rx, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public czwe(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968777(0x7f0400c9, float:1.7546217E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132018235(0x7f14043b, float:1.967477E38)
        L1b:
            r3.<init>(r4, r5)
            r3.b = r0
            r3.c = r0
            czwd r4 = new czwd
            r4.<init>(r3)
            r3.f = r4
            r3.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czwe.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.rx, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    @Override // defpackage.rx, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
