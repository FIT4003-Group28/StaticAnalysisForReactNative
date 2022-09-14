package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.reactnativecommunity.webview.RNCWebViewManager;
/* loaded from: classes.dex */
class b1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1214a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1215b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1216c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1217d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1218e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1219f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1220g = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(Context context) {
        this.f1214a = context;
        this.f1215b = LayoutInflater.from(this.f1214a).inflate(a.a.g.abc_tooltip, (ViewGroup) null);
        this.f1216c = (TextView) this.f1215b.findViewById(a.a.f.message);
        this.f1217d.setTitle(b1.class.getSimpleName());
        this.f1217d.packageName = this.f1214a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1217d;
        layoutParams.type = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.a.i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
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

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1214a.getResources().getDimensionPixelOffset(a.a.d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1214a.getResources().getDimensionPixelOffset(a.a.d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1214a.getResources().getDimensionPixelOffset(z ? a.a.d.tooltip_y_offset_touch : a.a.d.tooltip_y_offset_non_touch);
        View a2 = a(view);
        if (a2 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a2.getWindowVisibleDisplayFrame(this.f1218e);
        Rect rect = this.f1218e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1214a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1218e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a2.getLocationOnScreen(this.f1220g);
        view.getLocationOnScreen(this.f1219f);
        int[] iArr = this.f1219f;
        int i4 = iArr[0];
        int[] iArr2 = this.f1220g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a2.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1215b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1215b.getMeasuredHeight();
        int[] iArr3 = this.f1219f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 > this.f1218e.height() : i5 >= 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (!b()) {
            return;
        }
        ((WindowManager) this.f1214a.getSystemService("window")).removeView(this.f1215b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (b()) {
            a();
        }
        this.f1216c.setText(charSequence);
        a(view, i, i2, z, this.f1217d);
        ((WindowManager) this.f1214a.getSystemService("window")).addView(this.f1215b, this.f1217d);
    }

    boolean b() {
        return this.f1215b.getParent() != null;
    }
}
