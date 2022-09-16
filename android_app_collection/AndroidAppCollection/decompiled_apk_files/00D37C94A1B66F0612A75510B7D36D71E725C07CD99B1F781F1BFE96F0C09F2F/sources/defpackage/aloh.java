package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aloh  reason: default package */
/* loaded from: classes.dex */
public final class aloh extends aloe {
    private static final int[] n = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager o;
    private boolean p;

    private aloh(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.o = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static aloh m(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() != 16908290) {
                        viewGroup2 = (ViewGroup) view;
                    } else {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        int i2 = R.layout.design_layout_snackbar_include;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
        aloh alohVar = new aloh(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        alohVar.p(charSequence);
        alohVar.f = i;
        return alohVar;
    }

    public static aloh n(View view, int i) {
        return m(view, view.getResources().getText(i), 0);
    }

    @Override // defpackage.aloe
    public final int a() {
        int i = this.f;
        if (i == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.o.getRecommendedTimeoutMillis(i, (true != this.p ? 0 : 4) | 3);
        } else if (this.p && this.o.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return i;
        }
    }

    public final void o(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.e.getChildAt(0)).b;
        if (TextUtils.isEmpty(charSequence)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.p = false;
            return;
        }
        this.p = true;
        button.setVisibility(0);
        button.setText(charSequence);
        button.setOnClickListener(new alog(this, onClickListener));
    }

    public final void p(CharSequence charSequence) {
        ((SnackbarContentLayout) this.e.getChildAt(0)).a.setText(charSequence);
    }
}
