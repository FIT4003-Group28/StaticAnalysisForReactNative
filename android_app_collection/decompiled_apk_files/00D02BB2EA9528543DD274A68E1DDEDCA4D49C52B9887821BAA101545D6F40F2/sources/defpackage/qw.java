package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qw  reason: default package */
/* loaded from: classes7.dex */
public final class qw {
    public final int A;
    public final int B;
    final int C;
    final int D;
    final int E;
    final int F;
    public final boolean G;
    final Handler H;
    public final Context a;
    final rx b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    Button i;
    public CharSequence j;
    Message k;
    Button l;
    public CharSequence m;
    Message n;
    Button o;
    public CharSequence p;
    Message q;
    NestedScrollView r;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    ListAdapter y;
    public boolean h = false;
    public int s = 0;
    int z = -1;
    public final View.OnClickListener I = new ql(this);

    public qw(Context context, rx rxVar, Window window) {
        this.a = context;
        this.b = rxVar;
        this.c = window;
        this.H = new qu(rxVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, sj.e, R.attr.alertDialogStyle, 0);
        this.A = obtainStyledAttributes.getResourceId(0, 0);
        this.B = obtainStyledAttributes.getResourceId(2, 0);
        this.C = obtainStyledAttributes.getResourceId(4, 0);
        this.D = obtainStyledAttributes.getResourceId(5, 0);
        this.E = obtainStyledAttributes.getResourceId(7, 0);
        this.F = obtainStyledAttributes.getResourceId(3, 0);
        this.G = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        rxVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(true != view.canScrollVertically(-1) ? 4 : 0);
        }
        if (view3 != null) {
            if (true == view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    public static final void f(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup g(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void c(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void d(View view) {
        this.g = view;
        this.h = false;
    }

    public final void h(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.H.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.p = charSequence;
            this.q = obtainMessage;
        } else if (i != -2) {
            this.j = charSequence;
            this.k = obtainMessage;
        } else {
            this.m = charSequence;
            this.n = obtainMessage;
        }
    }
}
