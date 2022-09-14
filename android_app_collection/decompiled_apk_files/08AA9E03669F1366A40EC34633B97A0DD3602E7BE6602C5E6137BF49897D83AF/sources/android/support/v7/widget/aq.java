package android.support.v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.a.a;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.baidu.mapapi.UIMsg;
/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
class aq {

    /* renamed from: a  reason: collision with root package name */
    private final Context f936a;

    /* renamed from: b  reason: collision with root package name */
    private final View f937b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f938c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f939d = new WindowManager.LayoutParams();
    private final Rect e = new Rect();
    private final int[] f = new int[2];
    private final int[] g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(Context context) {
        this.f936a = context;
        this.f937b = LayoutInflater.from(this.f936a).inflate(a.g.abc_tooltip, (ViewGroup) null);
        this.f938c = (TextView) this.f937b.findViewById(a.f.message);
        this.f939d.setTitle(getClass().getSimpleName());
        this.f939d.packageName = this.f936a.getPackageName();
        this.f939d.type = UIMsg.f_FUN.FUN_ID_MAP_OPTION;
        this.f939d.width = -2;
        this.f939d.height = -2;
        this.f939d.format = -3;
        this.f939d.windowAnimations = a.i.Animation_AppCompat_Tooltip;
        this.f939d.flags = 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f938c.setText(charSequence);
        a(view, i, i2, z, this.f939d);
        ((WindowManager) this.f936a.getSystemService("window")).addView(this.f937b, this.f939d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (!b()) {
            return;
        }
        ((WindowManager) this.f936a.getSystemService("window")).removeView(this.f937b);
    }

    boolean b() {
        return this.f937b.getParent() != null;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f936a.getResources().getDimensionPixelOffset(a.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f936a.getResources().getDimensionPixelOffset(a.d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f936a.getResources().getDimensionPixelOffset(z ? a.d.tooltip_y_offset_touch : a.d.tooltip_y_offset_non_touch);
        View a2 = a(view);
        if (a2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a2.getWindowVisibleDisplayFrame(this.e);
        if (this.e.left < 0 && this.e.top < 0) {
            Resources resources = this.f936a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a2.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        int[] iArr = this.f;
        iArr[0] = iArr[0] - this.g[0];
        int[] iArr2 = this.f;
        iArr2[1] = iArr2[1] - this.g[1];
        layoutParams.x = (this.f[0] + i) - (a2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f937b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f937b.getMeasuredHeight();
        int i4 = ((this.f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i5 = this.f[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i4 >= 0) {
                layoutParams.y = i4;
            } else {
                layoutParams.y = i5;
            }
        } else if (measuredHeight + i5 <= this.e.height()) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i4;
        }
    }

    private static View a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
            return rootView;
        }
        return rootView;
    }
}
