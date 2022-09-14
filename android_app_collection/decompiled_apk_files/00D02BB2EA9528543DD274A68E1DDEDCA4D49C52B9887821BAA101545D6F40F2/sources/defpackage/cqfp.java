package defpackage;

import android.animation.LayoutTransition;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.constraint.ConstraintLayout;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.AutoCompleteTextView;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: cqfp  reason: default package */
/* loaded from: classes.dex */
public final class cqfp {
    public static final cqis<View.OnClickListener> a = cqis.a();
    public static final cqis<View.OnTouchListener> b = cqis.a();
    public static final cqis<cqfl> c = cqis.a();
    public static final cqis<cqfm> d = cqis.a();
    private static final cqis<View.OnAttachStateChangeListener> f = cqis.a();
    private final cqho j;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    boolean e = true;

    public cqfp(cqho cqhoVar) {
        this.j = cqhoVar;
    }

    private final float bF(TextView textView) {
        if (this.e) {
            try {
                return textView.getLineSpacingExtra();
            } catch (NoSuchMethodError unused) {
                this.e = false;
            }
        }
        return bG(textView, R.id.line_spacing_extra);
    }

    private final float bG(TextView textView, int i) {
        Number number;
        if (this.e || (number = (Number) textView.getTag(i)) == null) {
            return 1.0f;
        }
        return number.floatValue();
    }

    private final float bH(TextView textView) {
        if (this.e) {
            try {
                return textView.getLineSpacingMultiplier();
            } catch (NoSuchMethodError unused) {
                this.e = false;
            }
        }
        return bG(textView, R.id.line_spacing_multiplier);
    }

    @dzsi
    private final ListAdapter bI(Object obj) {
        if (obj instanceof cqli) {
            return (cqli) obj;
        }
        if (obj instanceof ListAdapter) {
            return (ListAdapter) obj;
        }
        if (obj instanceof cqiv) {
            return ((cqiv) obj).h(this.j.g());
        }
        return null;
    }

    private final int bJ(Object obj, View view) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof cqjg) {
            this.j.t();
            return cqhu.a((View) view.getParent(), (cqjg) obj).getId();
        }
        throw new IllegalArgumentException("The value argument passed to getNextFocusId() was not ofexpected type Integer or Token.");
    }

    private static final boolean bK(ListAdapter listAdapter, ListAdapter listAdapter2) {
        if (!(listAdapter instanceof cqlm) || !(listAdapter2 instanceof cqlm)) {
            return false;
        }
        int viewTypeCount = listAdapter.getViewTypeCount();
        int count = listAdapter2.getCount();
        for (int i = 0; i < count; i++) {
            if (listAdapter2.getItemViewType(i) >= viewTypeCount) {
                return false;
            }
        }
        return true;
    }

    private static final void bL(Drawable drawable, TextView textView, int i) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        compoundDrawables[i] = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), compoundDrawables[i].getIntrinsicHeight());
        }
        textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private static final void bM(Drawable drawable, TextView textView, int i) {
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        compoundDrawablesRelative[i] = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), compoundDrawablesRelative[i].getIntrinsicHeight());
        }
        textView.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    public static void c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = viewGroup.getChildAt(childCount);
                viewGroup.removeViewAt(childCount);
                cqkf<?> a2 = cqke.a(childAt);
                if (a2 != null) {
                    a2.i();
                }
            } else {
                return;
            }
        }
    }

    @dzsi
    public static View.OnAttachStateChangeListener d(View view) {
        return (View.OnAttachStateChangeListener) view.getTag(R.id.curvular_attach_state_change_listener);
    }

    public static void e(View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) view.getTag(R.id.curvular_attach_state_change_listener);
        if (onAttachStateChangeListener != null) {
            if (onAttachStateChangeListener instanceof cqfk) {
                ((cqfk) onAttachStateChangeListener).a(view);
            }
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            view.setTag(R.id.curvular_attach_state_change_listener, null);
        }
    }

    public static int g(@dzsi Object obj, View view) {
        if (obj instanceof cqlc) {
            return g(((cqlc) obj).a(cqjz.o(view)), view);
        } else if (obj instanceof cqjb) {
            return g(((cqjb) obj).a(cqjz.o(view), view.getContext()), view);
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof cqtv) {
                return ((cqtv) obj).NR(view.getContext());
            }
            if (obj == null) {
                return 0;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Can't handle padding object: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
    }

    public static int m(Object obj, View view) {
        if (obj instanceof cqtv) {
            return ((cqtv) obj).e(view.getContext());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Unable to resolve dimension pixel size: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int n(@dzsi Object obj, View view) {
        if (obj instanceof cqss) {
            return ((cqss) obj).b(view.getContext());
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            return 0;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unable to resolve color: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static ColorStateList o(@dzsi Object obj, View view) {
        if (obj instanceof cqss) {
            return ((cqss) obj).c(view.getContext());
        }
        if (obj instanceof Number) {
            return ColorStateList.valueOf(((Number) obj).intValue());
        }
        if (obj == null) {
            return ColorStateList.valueOf(0);
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Unable to resolve color state list: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void p(@dzsi View.OnAttachStateChangeListener onAttachStateChangeListener, View view) {
        if (onAttachStateChangeListener != null) {
            View.OnAttachStateChangeListener d2 = d(view);
            if (d2 != null) {
                if ((d2 instanceof cqfk) && d2 != onAttachStateChangeListener) {
                    ((cqfk) d2).a(view);
                }
                view.removeOnAttachStateChangeListener(d2);
            }
            view.setTag(R.id.curvular_attach_state_change_listener, onAttachStateChangeListener);
            view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            if (view.getWindowToken() == null || d2 == onAttachStateChangeListener) {
                return;
            }
            onAttachStateChangeListener.onViewAttachedToWindow(view);
            return;
        }
        e(view);
    }

    public final void A(@dzsi final cqgq cqgqVar, View view) {
        if (cqgqVar == null) {
            view.animate().cancel();
        } else {
            aH(new cqfc(cqgqVar) { // from class: cqfg
                private final cqgq a;

                {
                    this.a = cqgqVar;
                }

                @Override // defpackage.cqfc
                public final void a(View view2, boolean z) {
                    cqgq cqgqVar2 = this.a;
                    cqjz<?> g = cqjz.g(view2);
                    cqgqVar2.a(view2, g != null ? g.j : null, z);
                }
            }, view, cqjz.g(view));
        }
        view.invalidate();
    }

    public final void B(boolean z, ViewGroup viewGroup) {
        viewGroup.setLayoutTransition(z ? new LayoutTransition() : null);
    }

    public final void C(boolean z, View view, cqjz<?> cqjzVar) {
        cqis cqisVar = f;
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) cqjzVar.m(cqisVar);
        if (onAttachStateChangeListener == null && z) {
            cqfh cqfhVar = new cqfh();
            view.addOnAttachStateChangeListener(cqfhVar);
            cqjzVar.n(cqisVar, cqfhVar);
        } else if (onAttachStateChangeListener == null || z) {
        } else {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            cqjzVar.n(cqisVar, null);
        }
    }

    public final void D(@dzsi Integer num, View view) {
        if (num == null) {
            view.setBackgroundResource(0);
        } else {
            view.setBackgroundColor(num.intValue());
        }
    }

    public final void E(@dzsi Drawable drawable, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        view.setBackground(drawable);
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public final void F(@dzsi ColorFilter colorFilter, ImageView imageView) {
        if (colorFilter == null) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(colorFilter);
        }
    }

    public final void G(cqjg cqjgVar, ViewAnimator viewAnimator, cqjz<?> cqjzVar) {
        cqjzVar.g.g();
        int childCount = viewAnimator.getChildCount();
        for (int i = 0; i < childCount; i++) {
            cqjz<?> g = cqjz.g(viewAnimator.getChildAt(i));
            if (g != null && g.e == cqjgVar) {
                viewAnimator.setDisplayedChild(i);
                return;
            }
        }
        throw new RuntimeException("Unable to find view to switch to");
    }

    public final void H(List<String> list, NumberPicker numberPicker) {
        numberPicker.setDisplayedValues((String[]) list.toArray(new String[list.size()]));
    }

    public final void I(@dzsi Drawable drawable, TextView textView) {
        bM(drawable, textView, 3);
    }

    public final void J(@dzsi Drawable drawable, TextView textView) {
        bM(drawable, textView, 2);
    }

    public final void K(@dzsi Drawable drawable, TextView textView) {
        bL(drawable, textView, 0);
    }

    public final void L(@dzsi Drawable drawable, TextView textView) {
        bL(drawable, textView, 2);
    }

    public final void M(@dzsi Drawable drawable, TextView textView) {
        bM(drawable, textView, 0);
    }

    public final void N(@dzsi Drawable drawable, TextView textView) {
        bM(drawable, textView, 1);
    }

    public final void O(boolean z, View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            view.setDuplicateParentStateEnabled(z);
            viewGroup.addView(view, indexOfChild);
            return;
        }
        view.setDuplicateParentStateEnabled(z);
    }

    public final void P(cqtv cqtvVar, View view) {
        try {
            view.setElevation(cqtvVar.a(view.getContext()));
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void Q(Number number, View view) {
        try {
            view.setElevation(number.floatValue());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void R(@dzsi Boolean bool, View view) {
        view.setFitsSystemWindows(bool == null ? false : bool.booleanValue());
    }

    public final void S(@dzsi Drawable drawable, FrameLayout frameLayout) {
        frameLayout.setForeground(drawable);
    }

    public final void T(gt gtVar, ViewPager viewPager) {
        if (!Objects.equals(gtVar, viewPager.c())) {
            viewPager.setAdapter(gtVar);
        }
    }

    public final void U(@dzsi Integer num, View view) {
        ViewParent parent = view.getParent();
        int intValue = num == null ? -1 : num.intValue();
        if (parent instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            if (view.getId() == intValue) {
                return;
            }
            int indexOfChild = constraintLayout.indexOfChild(view);
            constraintLayout.removeViewAt(indexOfChild);
            view.setId(intValue);
            constraintLayout.addView(view, indexOfChild);
            return;
        }
        view.setId(intValue);
    }

    public final void V(@dzsi Matrix matrix, ImageView imageView) {
        imageView.setImageMatrix(matrix);
    }

    public final void W(@dzsi ColorFilter colorFilter, ProgressBar progressBar) {
        progressBar.getIndeterminateDrawable().setColorFilter(colorFilter);
    }

    public final void X(cqgg cqggVar, DatePicker datePicker) {
        cqkp o = cqjz.o(datePicker);
        datePicker.init(cqggVar.a().intValue(), cqggVar.b().intValue(), cqggVar.c().intValue(), o != null ? (DatePicker.OnDateChangedListener) cqjv.a(cqggVar.d(), o, datePicker.getContext()) : null);
    }

    public final void Y(int i, View view) {
        view.setLayerType(i, null);
    }

    public final void Z(float f2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new GridLayout.LayoutParams();
        }
        if (layoutParams instanceof GridLayout.LayoutParams) {
            ((GridLayout.LayoutParams) layoutParams).columnSpec = GridLayout.spec(Integer.MIN_VALUE, f2);
            view.setLayoutParams(layoutParams);
            return;
        }
        String valueOf = String.valueOf(view);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Can't apply layout_columnWeight to ");
        sb.append(valueOf);
        sb.toString();
    }

    public final boolean a(boolean z, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).alignWithParent = z;
            return true;
        }
        return false;
    }

    public final void aA(CalendarView.OnDateChangeListener onDateChangeListener, CalendarView calendarView) {
        calendarView.setOnDateChangeListener(onDateChangeListener);
    }

    public final void aB(@dzsi TextView.OnEditorActionListener onEditorActionListener, TextView textView) {
        textView.setOnEditorActionListener(onEditorActionListener);
    }

    public final void aC(@dzsi View.OnFocusChangeListener onFocusChangeListener, View view) {
        cqfn.a(view).c = onFocusChangeListener;
    }

    public final void aD(@dzsi cqnx<cqkp, Void> cqnxVar, View view) {
        cqfn.a(view).b = cqnxVar;
    }

    public final void aE(@dzsi cqnx<cqkp, Void> cqnxVar, View view) {
        cqfn.a(view).a = cqnxVar;
    }

    public final void aF(@dzsi View.OnLayoutChangeListener onLayoutChangeListener, View view) {
        View.OnLayoutChangeListener onLayoutChangeListener2 = (View.OnLayoutChangeListener) view.getTag(R.id.curvular_layout_change_listener);
        if (onLayoutChangeListener2 != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener2);
        }
        view.setTag(R.id.curvular_layout_change_listener, onLayoutChangeListener);
        if (onLayoutChangeListener != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public final void aG(View view) {
        cqkc.a(view).c(a, null);
    }

    public final void aH(@dzsi cqfc cqfcVar, View view, cqjz<?> cqjzVar) {
        cqis cqisVar = c;
        cqfl cqflVar = (cqfl) cqjzVar.m(cqisVar);
        if (cqflVar != null) {
            cqflVar.a();
        }
        if (cqfcVar != null) {
            cqjzVar.n(cqisVar, new cqfl(cqfcVar, cqjzVar));
            view.invalidate();
        }
    }

    public final void aI(@dzsi cqfd cqfdVar, View view, cqjz<?> cqjzVar) {
        cqis cqisVar = d;
        cqfm cqfmVar = (cqfm) cqjzVar.m(cqisVar);
        if (cqfmVar != null) {
            cqfmVar.b.removeOnAttachStateChangeListener(cqfmVar);
            cqfmVar.onViewDetachedFromWindow(null);
            cqfmVar.a.n(cqisVar, null);
        }
        if (cqfdVar != null) {
            cqjzVar.n(cqisVar, new cqfm(cqfdVar, cqjzVar));
            view.invalidate();
        }
    }

    public final void aJ(@dzsi awz awzVar, axb axbVar) {
        axbVar.setOnRefreshListener(awzVar);
    }

    public final void aK(@dzsi cqnx<cqkp, Void> cqnxVar, TextView textView) {
        cqfo.a(textView).a = cqnxVar;
    }

    public final void aL(TextWatcher textWatcher, TextView textView) {
        int i = cqfj.c;
        cqfj cqfjVar = (cqfj) textView.getTag(R.id.text_watcher);
        if (cqfjVar == null) {
            cqfjVar = new cqfj();
            textView.addTextChangedListener(cqfjVar);
            textView.setTag(R.id.text_watcher, cqfjVar);
            textView.addOnAttachStateChangeListener(cqfjVar);
        }
        cqfjVar.b = textView.isAttachedToWindow();
        cqfjVar.a = textWatcher;
    }

    public final void aM(TimePicker.OnTimeChangedListener onTimeChangedListener, TimePicker timePicker) {
        timePicker.setOnTimeChangedListener(onTimeChangedListener);
    }

    public final void aN(@dzsi View.OnTouchListener onTouchListener, View view) {
        cqky cqkyVar = (cqky) view.getTag(R.id.touch_manager);
        if (cqkyVar == null) {
            cqkyVar = new cqky();
            view.setOnTouchListener(cqkyVar);
            view.setTag(R.id.touch_manager, cqkyVar);
        }
        cqis<View.OnTouchListener> cqisVar = b;
        if (onTouchListener == null) {
            cqkyVar.a.remove(cqisVar);
        } else {
            cqkyVar.a.put(cqisVar, onTouchListener);
        }
    }

    public final void aO(@dzsi Integer num, View view) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            try {
                intValue = num.intValue();
            } catch (NoSuchMethodError unused) {
                return;
            }
        }
        view.setOutlineAmbientShadowColor(intValue);
    }

    public final void aP(@dzsi Integer num, View view) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            try {
                intValue = num.intValue();
            } catch (NoSuchMethodError unused) {
                return;
            }
        }
        view.setOutlineSpotShadowColor(intValue);
    }

    public final void aQ(Object[] objArr, View view) {
        view.setPadding(g(objArr[0], view), g(objArr[1], view), g(objArr[2], view), g(objArr[3], view));
    }

    public final void aR(Object obj, View view) {
        if (view.isPaddingRelative()) {
            od.y(view, od.w(view), view.getPaddingTop(), od.x(view), g(obj, view));
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), g(obj, view));
        }
    }

    public final void aS(Object obj, View view) {
        od.y(view, od.w(view), view.getPaddingTop(), g(obj, view), view.getPaddingBottom());
    }

    public final void aT(Object obj, View view) {
        view.setPadding(g(obj, view), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public final void aU(Object obj, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), g(obj, view), view.getPaddingBottom());
    }

    public final void aV(Object obj, View view) {
        od.y(view, g(obj, view), view.getPaddingTop(), od.x(view), view.getPaddingBottom());
    }

    public final void aW(Object obj, View view) {
        if (view.isPaddingRelative()) {
            od.y(view, od.w(view), g(obj, view), od.x(view), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), g(obj, view), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void aX(Boolean bool, VideoView videoView) {
        if (bool.booleanValue()) {
            videoView.start();
        } else {
            videoView.pause();
        }
    }

    public final void aY(@dzsi cqtv cqtvVar, axb axbVar) {
        if (cqtvVar != null) {
            int i = axbVar.i;
            int i2 = axbVar.h;
            int e = cqtvVar.e(axbVar.getContext());
            axbVar.setProgressViewOffset(false, e, (i - i2) + e);
        }
    }

    public final <T extends cqkp> void aZ(cqje cqjeVar, View view) {
        int i;
        this.j.t();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (layoutParams != null) {
            List<cqjd> a2 = cqjeVar.a();
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                cqjd cqjdVar = a2.get(i2);
                if (cqjdVar == null) {
                    i = 0;
                } else {
                    cqjg b2 = cqjdVar.b();
                    if (b2 != null) {
                        View a3 = cqhu.a((View) view.getParent(), b2);
                        dbsk.s(a3);
                        i = a3.getId();
                    } else {
                        i = -1;
                    }
                }
                layoutParams.addRule(i2, i);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public final void aa(int i, View view) {
        try {
            view.setLayoutDirection(i);
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void ab(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
            view.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
            view.setLayoutParams(layoutParams);
        } else if (layoutParams instanceof anf) {
            ((anf) layoutParams).a = i;
            view.setLayoutParams(layoutParams);
        } else {
            String valueOf = String.valueOf(view);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Can't apply layout_gravity to ");
            sb.append(valueOf);
            sb.toString();
        }
    }

    public final void ac(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void ad(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.setMargins(i, i, i, i);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void ae(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public final void af(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        if (this.g) {
            try {
                marginLayoutParams.setMarginEnd(i);
            } catch (NoSuchMethodError unused) {
                this.g = false;
            }
        }
        if (!this.g) {
            marginLayoutParams.rightMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public final void ag(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.leftMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public final void ah(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.rightMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public final void ai(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        if (this.h) {
            try {
                marginLayoutParams.setMarginStart(i);
            } catch (NoSuchMethodError unused) {
                this.h = false;
            }
        }
        if (!this.h) {
            marginLayoutParams.leftMargin = i;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public final void aj(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public final void ak(float f2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new GridLayout.LayoutParams();
        }
        if (layoutParams instanceof GridLayout.LayoutParams) {
            ((GridLayout.LayoutParams) layoutParams).rowSpec = GridLayout.spec(Integer.MIN_VALUE, f2);
            view.setLayoutParams(layoutParams);
            return;
        }
        String valueOf = String.valueOf(view);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("Can't apply layout_rowWeight to ");
        sb.append(valueOf);
        sb.toString();
    }

    public final void al(float f2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(0, 0);
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).weight = f2;
            view.setLayoutParams(layoutParams);
            return;
        }
        String valueOf = String.valueOf(view);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("Can't apply layout_weight to ");
        sb.append(valueOf);
        sb.toString();
    }

    public final void am(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public final void an(float f2, TextView textView) {
        textView.setLetterSpacing(f2);
    }

    public final void ao(float f2, TextView textView) {
        textView.setTag(R.id.line_spacing_extra, Float.valueOf(f2));
        textView.setLineSpacing(f2, Float.valueOf(bH(textView)).floatValue());
    }

    public final void ap(Number number, TextView textView) {
        textView.setTag(R.id.line_spacing_multiplier, number);
        textView.setLineSpacing(Float.valueOf(bF(textView)).floatValue(), number.floatValue());
    }

    public final void aq(int i, TextView textView) {
        textView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void ar(int i, View view) {
        view.setMinimumHeight(i);
        if (view instanceof TextView) {
            ((TextView) view).setMinHeight(i);
        }
        if (view instanceof ConstraintLayout) {
            ((ConstraintLayout) view).setMinHeight(i);
        }
    }

    public final void as(int i, View view) {
        if (view instanceof TextView) {
            ((TextView) view).setMinWidth(i);
        }
        if (view instanceof ConstraintLayout) {
            ((ConstraintLayout) view).setMinWidth(i);
        }
        view.setMinimumWidth(i);
    }

    public final void at(Object obj, View view) {
        view.setNextFocusDownId(bJ(obj, view));
    }

    public final void au(Object obj, View view) {
        view.setNextFocusForwardId(bJ(obj, view));
    }

    public final void av(Object obj, View view) {
        view.setNextFocusLeftId(bJ(obj, view));
    }

    public final void aw(Object obj, View view) {
        view.setNextFocusRightId(bJ(obj, view));
    }

    public final void ax(Object obj, View view) {
        view.setNextFocusUpId(bJ(obj, view));
    }

    public final void ay(@dzsi View.OnAttachStateChangeListener onAttachStateChangeListener, View view) {
        p(onAttachStateChangeListener, view);
    }

    public final void az(cqko<?> cqkoVar, CompoundButton compoundButton) {
        compoundButton.setOnCheckedChangeListener(new cqfi(cqkoVar));
    }

    public final boolean b(Object obj, View view) {
        ListAdapter bI;
        if (view instanceof AbsListView) {
            ListAdapter bI2 = bI(obj);
            if (bI2 == null) {
                return false;
            }
            AbsListView absListView = (AbsListView) view;
            ListAdapter listAdapter = (ListAdapter) absListView.getAdapter();
            if (bK(listAdapter, bI2)) {
                ((cqlm) listAdapter).b((cqlm) bI2);
            } else {
                absListView.setAdapter(bI2);
            }
            if (bI2 instanceof AbsListView.RecyclerListener) {
                absListView.setRecyclerListener((AbsListView.RecyclerListener) bI2);
            }
            return true;
        } else if (view instanceof AutoCompleteTextView) {
            ListAdapter bI3 = bI(obj);
            if (bI3 == null) {
                return false;
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) view;
            ListAdapter adapter = autoCompleteTextView.getAdapter();
            if (bK(adapter, bI3)) {
                ((cqlm) adapter).b((cqlm) bI3);
            } else {
                autoCompleteTextView.setAdapter((cqli) bI3);
            }
            return true;
        } else {
            if (view instanceof ViewPager) {
                if (obj instanceof cqiv) {
                    cqln cqlnVar = new cqln(this.j.g());
                    for (cqix<?> cqixVar : ((cqiv) obj).a) {
                        cqlnVar.a.b(cqixVar);
                        cqlnVar.Pa();
                    }
                    ((ViewPager) view).setAdapter(cqlnVar);
                    return true;
                }
            } else if (!(view instanceof ViewGroup) || (bI = bI(obj)) == null) {
                return false;
            } else {
                ViewGroup viewGroup = (ViewGroup) view;
                c(viewGroup);
                for (int i = 0; i < bI.getCount(); i++) {
                    viewGroup.addView(bI.getView(i, null, viewGroup));
                }
                return true;
            }
            return false;
        }
    }

    public final void bA(Number number, View view) {
        view.setTranslationX(number.floatValue());
    }

    public final void bB(cqiw<?> cqiwVar, ViewPager viewPager) {
        viewPager.setAdapter(new cqlo(this.j.g(), cqiwVar));
    }

    public final void bC(@dzsi List<? extends cqkp> list, ViewPager viewPager) {
        cqlh cqlhVar = (cqlh) viewPager.c();
        if (cqlhVar != null) {
            cqlhVar.A(list);
        }
    }

    public final void bD(@dzsi bbc bbcVar, ViewPager viewPager) {
        viewPager.setPageTransformer(false, bbcVar);
    }

    public final void bE(String str, WebView webView) {
        webView.loadData(str, "text/html", null);
    }

    public final void ba(@dzsi Boolean bool, View view) {
        if (bool == null || !bool.booleanValue()) {
            view.setSystemUiVisibility(view.getSystemUiVisibility() & (-5));
        } else {
            view.setSystemUiVisibility(view.getSystemUiVisibility() | 4);
        }
    }

    public final void bb(boolean z, View view) {
        od.as().d(view, Boolean.valueOf(z));
    }

    public final void bc(boolean z, View view) {
        view.setHorizontalScrollBarEnabled(z);
        view.setVerticalScrollBarEnabled(z);
    }

    public final void bd(@dzsi Integer num, VideoView videoView) {
        if (num != null) {
            videoView.seekTo(num.intValue());
        }
    }

    public final void be(int i, TextView textView) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), i);
    }

    public final void bf(float f2, TextView textView) {
        textView.setShadowLayer(textView.getShadowRadius(), f2, textView.getShadowDy(), textView.getShadowColor());
    }

    public final void bg(float f2, TextView textView) {
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDy(), f2, textView.getShadowColor());
    }

    public final void bh(float f2, TextView textView) {
        textView.setShadowLayer(f2, textView.getShadowDy(), textView.getShadowDx(), textView.getShadowColor());
    }

    public final void bi(Integer[] numArr, TableLayout tableLayout) {
        for (Integer num : numArr) {
            tableLayout.setColumnShrinkable(num.intValue(), true);
        }
    }

    public final void bj(Integer[] numArr, TableLayout tableLayout) {
        for (Integer num : numArr) {
            tableLayout.setColumnStretchable(num.intValue(), true);
        }
    }

    public final void bk(@dzsi CharSequence charSequence, TextView textView) {
        if (!(textView instanceof EditText) || !TextUtils.equals(textView.getText(), charSequence)) {
            textView.setText(charSequence);
        }
    }

    public final void bl(@dzsi cqgh cqghVar, TextView textView) {
        boolean z;
        if (cqghVar == null) {
            return;
        }
        boolean z2 = textView instanceof EditText;
        if (!z2 || !TextUtils.equals(textView.getText(), cqghVar.a())) {
            textView.setText(cqghVar.a());
            z = true;
        } else {
            z = false;
        }
        if (!z2) {
            return;
        }
        if ((!z && cqghVar.b().intValue() == textView.getSelectionStart() && cqghVar.c().intValue() == textView.getSelectionEnd()) || cqghVar.b().intValue() < 0 || cqghVar.c().intValue() < 0) {
            return;
        }
        ((EditText) textView).setSelection(cqghVar.b().intValue(), cqghVar.c().intValue());
    }

    public final void bm(@dzsi CharSequence charSequence, TextView textView) {
        textView.setText(charSequence);
        int i = 8;
        if (charSequence != null && charSequence.length() != 0) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void bn(int i, TextView textView) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    public final void bo(int i, View view) {
        view.setTextDirection(i);
    }

    public final void bp(@dzsi CharSequence charSequence, TextView textView) {
        if (!(textView instanceof EditText) || !TextUtils.equals(textView.getText(), charSequence)) {
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setTextKeepState(charSequence);
        }
    }

    public final void bq(@dzsi CharSequence charSequence, ToggleButton toggleButton) {
        toggleButton.setTextOff(charSequence);
        toggleButton.setChecked(toggleButton.isChecked());
    }

    public final void br(@dzsi CharSequence charSequence, ToggleButton toggleButton) {
        toggleButton.setTextOn(charSequence);
        toggleButton.setChecked(toggleButton.isChecked());
    }

    public final void bs(float f2, TextView textView) {
        textView.setTextSize(0, f2);
    }

    public final void bt(int i, TextView textView) {
        textView.setTypeface(Typeface.create(textView.getTypeface(), i), i);
    }

    public final void bu(cqvj cqvjVar, TextView textView) {
        textView.setTypeface(cqvjVar.a(textView.getContext()));
    }

    public final void bv(@dzsi Drawable drawable, AbsSeekBar absSeekBar) {
        absSeekBar.setThumb(drawable);
    }

    public final void bw(@dzsi Integer num, ImageView imageView) {
        if (num != null) {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP);
        } else {
            imageView.clearColorFilter();
        }
    }

    public final void bx(@dzsi Integer num, ImageView imageView) {
        if (num != null) {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            imageView.clearColorFilter();
        }
    }

    public final void by(String str, View view) {
        od.I(view, str);
    }

    public final void bz(cqtv cqtvVar, View view) {
        view.setTranslationX(cqtvVar.a(view.getContext()));
    }

    public final boolean f(@dzsi Object obj, View view) {
        cqkc a2 = cqkc.a(view);
        cqis<View.OnClickListener> cqisVar = a;
        Boolean bool = true;
        if (obj == null) {
            a2.b(cqisVar, null);
        } else if (obj instanceof View.OnClickListener) {
            a2.b(cqisVar, (View.OnClickListener) obj);
        } else if (obj instanceof cqnx) {
            a2.b(cqisVar, new cqka(view, obj));
        } else if (obj instanceof cqkn) {
            a2.b(cqisVar, new cqkb(view, obj));
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean h(@dzsi Object obj, View view) {
        try {
            if (obj == null) {
                view.setStateListAnimator(null);
                return true;
            } else if (!(obj instanceof StateListAnimator)) {
                return false;
            } else {
                view.setStateListAnimator((StateListAnimator) obj);
                return true;
            }
        } catch (NoSuchMethodError unused) {
            return true;
        }
    }

    public final boolean i(int i, View view) {
        if (this.i) {
            try {
                view.setTextAlignment(i);
                return true;
            } catch (NoSuchMethodError unused) {
                this.i = false;
            }
        }
        if (view instanceof TextView) {
            int i2 = 8388613;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        i2 = 1;
                    } else if (i != 5) {
                        if (i != 6) {
                            return false;
                        }
                    }
                }
                ((TextView) view).setGravity(i2);
                return true;
            }
            i2 = 8388611;
            ((TextView) view).setGravity(i2);
            return true;
        }
        return false;
    }

    public final boolean j(@dzsi Object obj, Switch r5) {
        if (obj == null) {
            r5.setThumbResource(0);
            return true;
        } else if (!(obj instanceof Integer)) {
            return false;
        } else {
            r5.setThumbResource(((Integer) obj).intValue());
            return true;
        }
    }

    public final boolean k(Object obj, View view) {
        if (obj instanceof cqtv) {
            view.setTranslationY(((cqtv) obj).a(view.getContext()));
            return true;
        } else if (!(obj instanceof Number)) {
            return false;
        } else {
            view.setTranslationY(((Number) obj).floatValue());
            return true;
        }
    }

    public final boolean l(Object obj, View view) {
        try {
            if (obj instanceof cqtv) {
                view.setTranslationZ(((cqtv) obj).a(view.getContext()));
                return true;
            } else if (!(obj instanceof Number)) {
                return false;
            } else {
                view.setTranslationZ(((Number) obj).floatValue());
                return true;
            }
        } catch (NoSuchMethodError unused) {
            return true;
        }
    }

    public final void q(@dzsi ne neVar, View view) {
        od.c(view, neVar);
    }

    public final void r(@dzsi View.AccessibilityDelegate accessibilityDelegate, View view) {
        try {
            view.setAccessibilityDelegate(accessibilityDelegate);
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void s(boolean z, View view) {
        od.aw(view, z);
    }

    public final void t(int i, View view) {
        od.v(view, i);
    }

    public final void u(cqjg cqjgVar, View view) {
        try {
            this.j.t();
            view.setAccessibilityTraversalAfter(cqhu.a(view.getRootView(), cqjgVar).getId());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void v(Integer num, View view) {
        try {
            view.setAccessibilityTraversalAfter(num.intValue());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void w(cqjg cqjgVar, View view) {
        try {
            this.j.t();
            view.setAccessibilityTraversalBefore(cqhu.a(view.getRootView(), cqjgVar).getId());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void x(Integer num, View view) {
        try {
            view.setAccessibilityTraversalBefore(num.intValue());
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void y(@dzsi cqnx<cqkp, Void> cqnxVar, TextView textView) {
        cqfo.a(textView).b = cqnxVar;
    }

    public final void z(@dzsi Number number, View view) {
        view.setAlpha(number == null ? 1.0f : number.floatValue());
    }
}
