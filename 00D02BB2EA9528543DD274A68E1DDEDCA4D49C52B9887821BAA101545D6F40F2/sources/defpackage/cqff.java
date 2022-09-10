package defpackage;

import android.animation.LayoutTransition;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CalendarView;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;
import android.widget.VideoView;
import android.widget.ViewAnimator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqff  reason: default package */
/* loaded from: classes.dex */
public final class cqff implements cqkv {
    final cqfp a;
    final cqlg b;

    public cqff(cqfp cqfpVar, cqlg cqlgVar) {
        this.a = cqfpVar;
        this.b = cqlgVar;
    }

    static final <T extends Adapter> T c(Object obj) {
        return (T) obj;
    }

    static final <T extends ListAdapter & Filterable> T d(Object obj) {
        return (T) ((ListAdapter) obj);
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        Animation l;
        Drawable e;
        Animation l2;
        ColorStateList g;
        ColorStateList o;
        ColorStateList g2;
        ColorStateList o2;
        ColorStateList g3;
        ColorStateList o3;
        View h = cqjzVar.h();
        if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            switch (((cqfe) cqkuVar).ordinal()) {
                case 0:
                    boolean z = h instanceof View;
                    if (!z || (obj != null && !(obj instanceof View.AccessibilityDelegate))) {
                        if (!z || !(obj instanceof ne)) {
                            return false;
                        }
                        this.a.q((ne) obj, h);
                        return true;
                    }
                    this.a.r((View.AccessibilityDelegate) obj, h);
                    return true;
                case 1:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.s(((Boolean) obj).booleanValue(), h);
                    return true;
                case 2:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.t(((Integer) obj).intValue(), h);
                    return true;
                case 3:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof Integer)) {
                        if (!(obj instanceof cqjg)) {
                            return false;
                        }
                        this.a.u((cqjg) obj, h);
                        return true;
                    }
                    this.a.v((Integer) obj, h);
                    return true;
                case 4:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof Integer)) {
                        if (!(obj instanceof cqjg)) {
                            return false;
                        }
                        this.a.w((cqjg) obj, h);
                        return true;
                    }
                    this.a.x((Integer) obj, h);
                    return true;
                case 5:
                    if (!(h instanceof AdapterView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Adapter)) {
                        return false;
                    }
                    ((AdapterView) h).setAdapter(c(obj));
                    return true;
                case 6:
                    if (!(h instanceof ViewGroup) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ViewGroup) h).setAddStatesFromChildren(((Boolean) obj).booleanValue());
                    return true;
                case 7:
                    if (!(h instanceof ImageView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ImageView) h).setAdjustViewBounds(((Boolean) obj).booleanValue());
                    return true;
                case 8:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqnx)) {
                        return false;
                    }
                    this.a.y((cqnx) obj, (TextView) h);
                    return true;
                case 9:
                    return (h instanceof View) && (obj instanceof Boolean) && this.a.a(((Boolean) obj).booleanValue(), h);
                case 10:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setAllCaps(((Boolean) obj).booleanValue());
                    return true;
                case 11:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Number)) {
                        return false;
                    }
                    this.a.z((Number) obj, h);
                    return true;
                case 12:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqgq)) {
                        return false;
                    }
                    this.a.A((cqgq) obj, h);
                    return true;
                case 13:
                    if (!(h instanceof ViewAnimator) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ViewAnimator) h).setAnimateFirstView(((Boolean) obj).booleanValue());
                    return true;
                case 14:
                    if (!(h instanceof ViewGroup) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.B(((Boolean) obj).booleanValue(), (ViewGroup) h);
                    return true;
                case 15:
                    if (!(h instanceof AutoCompleteTextView)) {
                        return false;
                    }
                    if (obj != null && (!(obj instanceof ListAdapter) || !(obj instanceof Filterable))) {
                        return false;
                    }
                    ((AutoCompleteTextView) h).setAdapter(d(obj));
                    return true;
                case 16:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.C(((Boolean) obj).booleanValue(), h, cqjzVar);
                    return true;
                case 17:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setAutoLinkMask(((Integer) obj).intValue());
                    return true;
                case 18:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        this.b.v(h, drawable);
                        h.setBackgroundDrawable(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        h.setBackgroundDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        h.setBackgroundDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        h.setBackgroundDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case 19:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.D(Integer.valueOf(this.b.n((Number) obj)), h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            this.a.D(null, h);
                            return true;
                        }
                    }
                    this.a.D(Integer.valueOf(this.b.f(h, (cqss) obj)), h);
                    return true;
                case 20:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable2 = (Drawable) obj;
                        this.b.v(h, drawable2);
                        this.a.E(drawable2, h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.E(this.b.e(h, ((Integer) obj).intValue()), h);
                            return true;
                        }
                        this.a.E(this.b.d(h, (Picture) obj), h);
                        return true;
                    } else {
                        this.a.E(this.b.c(h, (cqtd) obj), h);
                        return true;
                    }
                case 21:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((ImageView) h).setBaseline(this.b.j(h, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((ImageView) h).setBaseline(this.b.r((Integer) obj));
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.b.x(null);
                        return false;
                    }
                case 22:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((LinearLayout) h).setBaselineAligned(((Boolean) obj).booleanValue());
                    return true;
                case 23:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((LinearLayout) h).setBaselineAlignedChildIndex(((Integer) obj).intValue());
                    return true;
                case 24:
                    if (!(h instanceof ImageView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ImageView) h).setBaselineAlignBottom(((Boolean) obj).booleanValue());
                    return true;
                case 25:
                    if (Build.VERSION.SDK_INT < 23 || !(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setBreakStrategy(((Integer) obj).intValue());
                    return true;
                case 26:
                    if (!(h instanceof CompoundButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable3 = (Drawable) obj;
                        this.b.v(h, drawable3);
                        ((CompoundButton) h).setButtonDrawable(drawable3);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((CompoundButton) h).setButtonDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((CompoundButton) h).setButtonDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((CompoundButton) h).setButtonDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case 27:
                    if (!(h instanceof Checkable) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Checkable) h).setChecked(((Boolean) obj).booleanValue());
                    return true;
                case 28:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setClickable(((Boolean) obj).booleanValue());
                    return true;
                case 29:
                    if (!(h instanceof ViewGroup) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ViewGroup) h).setClipChildren(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setClipToOutline(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    if (!(h instanceof ViewGroup) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ViewGroup) h).setClipToPadding(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ColorFilter)) {
                        return false;
                    }
                    this.a.F((ColorFilter) obj, (ImageView) h);
                    return true;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    if (!(h instanceof GridLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridLayout) h).setColumnCount(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    if (!(h instanceof GridView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridView) h).setColumnWidth(((Integer) obj).intValue());
                    return true;
                case 35:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        h.setContentDescription(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        h.setContentDescription(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        h.setContentDescription((CharSequence) obj);
                        return true;
                    }
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    if (!(h instanceof TimePicker) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TimePicker) h).setCurrentHour((Integer) obj);
                    return true;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    if (!(h instanceof TimePicker) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TimePicker) h).setCurrentMinute((Integer) obj);
                    return true;
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setCursorVisible(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    if (!(h instanceof CalendarView) || !(obj instanceof Long)) {
                        return false;
                    }
                    ((CalendarView) h).setDate(((Long) obj).longValue());
                    return true;
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    if (Build.VERSION.SDK_INT < 26 || !(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setDefaultFocusHighlightEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                    if (!(h instanceof ViewGroup) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ViewGroup) h).setDescendantFocusability(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    if (!(h instanceof ViewAnimator) || !(obj instanceof cqjg)) {
                        return false;
                    }
                    this.a.G((cqjg) obj, (ViewAnimator) h, cqjzVar);
                    return true;
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    if (!(h instanceof NumberPicker) || !(obj instanceof List)) {
                        return false;
                    }
                    this.a.H((List) obj, (NumberPicker) h);
                    return true;
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    if (h instanceof LinearLayout) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable4 = (Drawable) obj;
                            this.b.v(h, drawable4);
                            ((LinearLayout) h).setDividerDrawable(drawable4);
                            return true;
                        } else if (obj instanceof cqtd) {
                            ((LinearLayout) h).setDividerDrawable(this.b.c(h, (cqtd) obj));
                            return true;
                        } else if (obj instanceof Picture) {
                            ((LinearLayout) h).setDividerDrawable(this.b.d(h, (Picture) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((LinearLayout) h).setDividerDrawable(this.b.e(h, ((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    if (!(h instanceof ListView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable5 = (Drawable) obj;
                        this.b.v(h, drawable5);
                        ((ListView) h).setDivider(drawable5);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((ListView) h).setDivider(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((ListView) h).setDivider(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ListView) h).setDivider(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    if (!(h instanceof ListView)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((ListView) h).setDividerHeight(this.b.j(h, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((ListView) h).setDividerHeight(this.b.r((Integer) obj));
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.b.x(null);
                        return false;
                    }
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    if (!(h instanceof LinearLayout)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((LinearLayout) h).setDividerPadding(this.b.i(h, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((LinearLayout) h).setDividerPadding(this.b.q((Integer) obj));
                        return true;
                    }
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable6 = (Drawable) obj;
                        this.b.v(h, drawable6);
                        this.a.I(drawable6, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.I(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.I(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.I(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable7 = (Drawable) obj;
                        this.b.v(h, drawable7);
                        this.a.J(drawable7, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.J(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.J(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.J(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable8 = (Drawable) obj;
                        this.b.v(h, drawable8);
                        this.a.K(drawable8, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.K(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.K(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.K(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((TextView) h).setCompoundDrawablePadding(this.b.i(h, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((TextView) h).setCompoundDrawablePadding(this.b.q((Integer) obj));
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable9 = (Drawable) obj;
                        this.b.v(h, drawable9);
                        this.a.L(drawable9, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.L(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.L(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.L(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable10 = (Drawable) obj;
                        this.b.v(h, drawable10);
                        this.a.M(drawable10, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.M(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.M(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.M(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable11 = (Drawable) obj;
                        this.b.v(h, drawable11);
                        this.a.N(drawable11, (TextView) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.N(this.b.e(h, ((Integer) obj).intValue()), (TextView) h);
                            return true;
                        }
                        this.a.N(this.b.d(h, (Picture) obj), (TextView) h);
                        return true;
                    } else {
                        this.a.N(this.b.c(h, (cqtd) obj), (TextView) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.O(((Boolean) obj).booleanValue(), h);
                    return true;
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.Q((Number) obj, h);
                        return true;
                    }
                    this.a.P((cqtv) obj, h);
                    return true;
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof TextUtils.TruncateAt)) {
                        return false;
                    }
                    ((TextView) h).setEllipsize((TextUtils.TruncateAt) obj);
                    return true;
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((TextView) h).setError(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((TextView) h).setError(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((TextView) h).setError((CharSequence) obj);
                        return true;
                    }
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    if (!(h instanceof AbsListView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((AbsListView) h).setFastScrollEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    if (!(h instanceof HorizontalScrollView) || !(obj instanceof Boolean)) {
                        if (!(h instanceof ScrollView) || !(obj instanceof Boolean)) {
                            return false;
                        }
                        ((ScrollView) h).setFillViewport(((Boolean) obj).booleanValue());
                        return true;
                    }
                    ((HorizontalScrollView) h).setFillViewport(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.R((Boolean) obj, h);
                    return true;
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof Boolean)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        h.setFocusable(((Integer) obj).intValue());
                        return true;
                    }
                    h.setFocusable(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setFocusableInTouchMode(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    if (Build.VERSION.SDK_INT < 26 || !(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setFocusedByDefault(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Typeface)) {
                        return false;
                    }
                    ((TextView) h).setTypeface((Typeface) obj);
                    return true;
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    if (!(h instanceof FrameLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable12 = (Drawable) obj;
                        this.b.v(h, drawable12);
                        this.a.S(drawable12, (FrameLayout) h);
                        return true;
                    } else if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.S(this.b.e(h, ((Integer) obj).intValue()), (FrameLayout) h);
                            return true;
                        }
                        this.a.S(this.b.d(h, (Picture) obj), (FrameLayout) h);
                        return true;
                    } else {
                        this.a.S(this.b.c(h, (cqtd) obj), (FrameLayout) h);
                        return true;
                    }
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    if (!(h instanceof NumberPicker)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof NumberPicker.Formatter)) {
                        return false;
                    }
                    ((NumberPicker) h).setFormatter((NumberPicker.Formatter) obj);
                    return true;
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    if (!(h instanceof ViewPager) || !(obj instanceof gt)) {
                        return false;
                    }
                    this.a.T((gt) obj, (ViewPager) h);
                    return true;
                case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Integer)) {
                        if (!(h instanceof RelativeLayout) || !(obj instanceof Integer)) {
                            if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                                return false;
                            }
                            ((TextView) h).setGravity(((Integer) obj).intValue());
                            return true;
                        }
                        ((RelativeLayout) h).setGravity(((Integer) obj).intValue());
                        return true;
                    }
                    ((LinearLayout) h).setGravity(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setHapticFeedbackEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((TextView) h).setHint(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((TextView) h).setHint(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((TextView) h).setHint((CharSequence) obj);
                        return true;
                    }
                case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setHorizontallyScrolling(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setHorizontalFadingEdgeEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    if (!(h instanceof GridView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridView) h).setHorizontalSpacing(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.U((Integer) obj, h);
                    return true;
                case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable13 = (Drawable) obj;
                        this.b.v(h, drawable13);
                        ((ImageView) h).setImageDrawable(drawable13);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((ImageView) h).setImageDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((ImageView) h).setImageDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ImageView) h).setImageDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                    boolean z2 = h instanceof ImageView;
                    if (!z2 || (obj != null && !(obj instanceof Matrix))) {
                        if (!z2 || !(obj instanceof Matrix)) {
                            return false;
                        }
                        ((ImageView) h).setImageMatrix((Matrix) obj);
                        return true;
                    }
                    this.a.V((Matrix) obj, (ImageView) h);
                    return true;
                case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setImeOptions(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    h.setImportantForAccessibility(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    if (!(h instanceof ViewAnimator)) {
                        return false;
                    }
                    if (!(obj instanceof cqrx) || (l = this.b.l(h, (cqrx) obj)) == null) {
                        if (!(obj instanceof Animation)) {
                            return false;
                        }
                        ((ViewAnimator) h).setInAnimation((Animation) obj);
                        return true;
                    }
                    ((ViewAnimator) h).setInAnimation(l);
                    return true;
                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setIncludeFontPadding(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    if (!(h instanceof ProgressBar)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ColorFilter)) {
                        return false;
                    }
                    this.a.W((ColorFilter) obj, (ProgressBar) h);
                    return true;
                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    if (!(h instanceof ProgressBar)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable14 = (Drawable) obj;
                        this.b.v(h, drawable14);
                        ((ProgressBar) h).setIndeterminateDrawable(drawable14);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((ProgressBar) h).setIndeterminateDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((ProgressBar) h).setIndeterminateDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ProgressBar) h).setIndeterminateDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    if (!(h instanceof ProgressBar)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((ProgressBar) h).setIndeterminateTintList(this.b.g(h, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((ProgressBar) h).setIndeterminateTintList(this.b.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((ProgressBar) h).setIndeterminateTintList((ColorStateList) obj);
                        return true;
                    }
                case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                    if (!(h instanceof DatePicker) || !(obj instanceof cqgg)) {
                        return false;
                    }
                    this.a.X((cqgg) obj, (DatePicker) h);
                    return true;
                case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setRawInputType(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    if (!(h instanceof TimePicker) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TimePicker) h).setIs24HourView((Boolean) obj);
                    return true;
                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    if (Build.VERSION.SDK_INT < 26 || !(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setKeyboardNavigationCluster(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.Y(((Integer) obj).intValue(), h);
                    return true;
                case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    this.a.Z(((Float) obj).floatValue(), h);
                    return true;
                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.aa(((Integer) obj).intValue(), h);
                    return true;
                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.ab(((Integer) obj).intValue(), h);
                    return true;
                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqva)) {
                        if (!(obj instanceof cqtv)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.ac(this.b.t((Integer) obj), h);
                            return true;
                        }
                        this.a.ac(this.b.k(h, (cqtv) obj), h);
                        return true;
                    }
                    this.a.ac(this.b.s((cqva) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.ad(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.ad(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.ae(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.ae(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.af(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.af(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.ag(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.ag(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.ah(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.ah(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.ai(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.ai(this.b.i(h, (cqtv) obj), h);
                    return true;
                case 100:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Integer)) {
                            return false;
                        }
                        this.a.aj(this.b.q((Integer) obj), h);
                        return true;
                    }
                    this.a.aj(this.b.i(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    this.a.ak(((Float) obj).floatValue(), h);
                    return true;
                case 102:
                    if (!(h instanceof ViewGroup)) {
                        return false;
                    }
                    if (obj instanceof cquq) {
                        ((ViewGroup) h).setLayoutTransition(this.b.m(h, (cquq) obj));
                        return true;
                    } else if (obj != null && !(obj instanceof LayoutTransition)) {
                        return false;
                    } else {
                        ((ViewGroup) h).setLayoutTransition((LayoutTransition) obj);
                        return true;
                    }
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    this.a.al(((Float) obj).floatValue(), h);
                    return true;
                case 104:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqva)) {
                        if (!(obj instanceof cqtv)) {
                            if (!(obj instanceof Integer)) {
                                return false;
                            }
                            this.a.am(this.b.t((Integer) obj), h);
                            return true;
                        }
                        this.a.am(this.b.k(h, (cqtv) obj), h);
                        return true;
                    }
                    this.a.am(this.b.s((cqva) obj), h);
                    return true;
                case 105:
                    if (!(h instanceof TextView) || !(obj instanceof Float)) {
                        return false;
                    }
                    this.a.an(((Float) obj).floatValue(), (TextView) h);
                    return true;
                case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.ao(this.b.p((Number) obj), (TextView) h);
                        return true;
                    }
                    this.a.ao(this.b.h(h, (cqtv) obj), (TextView) h);
                    return true;
                case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                    if (!(h instanceof TextView) || !(obj instanceof Number)) {
                        return false;
                    }
                    this.a.ap((Number) obj, (TextView) h);
                    return true;
                case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setLines(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                    return (h instanceof View) && (obj instanceof Object) && this.a.b(obj, h);
                case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                    if (!(h instanceof AbsListView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable15 = (Drawable) obj;
                        this.b.v(h, drawable15);
                        if (drawable15 != null) {
                            ((AbsListView) h).setSelector(drawable15);
                            return true;
                        }
                    }
                    if (!(obj instanceof cqtd)) {
                        if (!(obj instanceof Picture)) {
                            if (!(obj instanceof Integer) || (e = this.b.e(h, ((Integer) obj).intValue())) == null) {
                                if (!(obj instanceof Drawable)) {
                                    return false;
                                }
                                ((AbsListView) h).setSelector((Drawable) obj);
                                return true;
                            }
                            ((AbsListView) h).setSelector(e);
                            return true;
                        }
                        ((AbsListView) h).setSelector(this.b.d(h, (Picture) obj));
                        return true;
                    }
                    ((AbsListView) h).setSelector(this.b.c(h, (cqtd) obj));
                    return true;
                case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setLongClickable(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                    if (!(h instanceof ProgressBar) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ProgressBar) h).setMax(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    if (!(h instanceof CalendarView) || !(obj instanceof Long)) {
                        if (!(h instanceof DatePicker) || !(obj instanceof Long)) {
                            return false;
                        }
                        ((DatePicker) h).setMaxDate(((Long) obj).longValue());
                        return true;
                    }
                    ((CalendarView) h).setMaxDate(((Long) obj).longValue());
                    return true;
                case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                    if (h instanceof ImageView) {
                        if (obj instanceof cqtv) {
                            ((ImageView) h).setMaxHeight(this.b.j(h, (cqtv) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ImageView) h).setMaxHeight(this.b.r((Integer) obj));
                            return true;
                        } else if (obj == null) {
                            this.b.x(null);
                        }
                    }
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((TextView) h).setMaxHeight(this.b.j(h, (cqtv) obj));
                        return true;
                    }
                    boolean z3 = obj instanceof Integer;
                    if (z3) {
                        ((TextView) h).setMaxHeight(this.b.r((Integer) obj));
                        return true;
                    } else if (obj != null && !z3) {
                        return false;
                    } else {
                        this.b.x((Integer) obj);
                        return false;
                    }
                case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.aq(((Integer) obj).intValue(), (TextView) h);
                    return true;
                case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setMaxLines(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                    if (!(h instanceof NumberPicker) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((NumberPicker) h).setMaxValue(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                    if (h instanceof ImageView) {
                        if (obj instanceof cqtv) {
                            ((ImageView) h).setMaxWidth(this.b.j(h, (cqtv) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ImageView) h).setMaxWidth(this.b.r((Integer) obj));
                            return true;
                        } else if (obj == null) {
                            this.b.x(null);
                        }
                    }
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((TextView) h).setMaxWidth(this.b.j(h, (cqtv) obj));
                        return true;
                    }
                    boolean z4 = obj instanceof Integer;
                    if (z4) {
                        ((TextView) h).setMaxWidth(this.b.r((Integer) obj));
                        return true;
                    } else if (obj != null && !z4) {
                        return false;
                    } else {
                        this.b.x((Integer) obj);
                        return false;
                    }
                case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                    if (!(h instanceof FrameLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((FrameLayout) h).setMeasureAllChildren(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((LinearLayout) h).setMeasureWithLargestChildEnabled(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                    if (!(h instanceof VideoView) || !(obj instanceof MediaController)) {
                        return false;
                    }
                    ((VideoView) h).setMediaController((MediaController) obj);
                    return true;
                case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                    if (!(h instanceof CalendarView) || !(obj instanceof Long)) {
                        if (!(h instanceof DatePicker) || !(obj instanceof Long)) {
                            return false;
                        }
                        ((DatePicker) h).setMinDate(((Long) obj).longValue());
                        return true;
                    }
                    ((CalendarView) h).setMinDate(((Long) obj).longValue());
                    return true;
                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (obj instanceof Integer) {
                            this.a.ar(this.b.r((Integer) obj), h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.x(null);
                            return false;
                        }
                    }
                    this.a.ar(this.b.j(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                    if (!(h instanceof NumberPicker) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((NumberPicker) h).setMinValue(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (obj instanceof Integer) {
                            this.a.as(this.b.r((Integer) obj), h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.x(null);
                            return false;
                        }
                    }
                    this.a.as(this.b.j(h, (cqtv) obj), h);
                    return true;
                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                case 209:
                default:
                    return false;
                case 127:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof MovementMethod)) {
                        return false;
                    }
                    ((TextView) h).setMovementMethod((MovementMethod) obj);
                    return true;
                case 128:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.at(obj, h);
                    return true;
                case 129:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.au(obj, h);
                    return true;
                case 130:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.av(obj, h);
                    return true;
                case 131:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aw(obj, h);
                    return true;
                case 132:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.ax(obj, h);
                    return true;
                case 133:
                    if (!(h instanceof GridView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridView) h).setNumColumns(((Integer) obj).intValue());
                    return true;
                case 134:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnAttachStateChangeListener)) {
                        return false;
                    }
                    this.a.ay((View.OnAttachStateChangeListener) obj, h);
                    return true;
                case 135:
                    return (h instanceof View) && this.a.f(obj, h);
                case 136:
                    if (!(h instanceof VideoView) || !(obj instanceof MediaPlayer.OnCompletionListener)) {
                        return false;
                    }
                    ((VideoView) h).setOnCompletionListener((MediaPlayer.OnCompletionListener) obj);
                    return true;
                case 137:
                    if (!(h instanceof CompoundButton)) {
                        return false;
                    }
                    if (!(obj instanceof cqko)) {
                        if (obj != null && !(obj instanceof CompoundButton.OnCheckedChangeListener)) {
                            return false;
                        }
                        ((CompoundButton) h).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) obj);
                        return true;
                    }
                    this.a.az((cqko) obj, (CompoundButton) h);
                    return true;
                case 138:
                    if (!(h instanceof CalendarView) || !(obj instanceof CalendarView.OnDateChangeListener)) {
                        return false;
                    }
                    this.a.aA((CalendarView.OnDateChangeListener) obj, (CalendarView) h);
                    return true;
                case 139:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof TextView.OnEditorActionListener)) {
                        return false;
                    }
                    this.a.aB((TextView.OnEditorActionListener) obj, (TextView) h);
                    return true;
                case 140:
                    if (!(h instanceof VideoView) || !(obj instanceof MediaPlayer.OnErrorListener)) {
                        return false;
                    }
                    ((VideoView) h).setOnErrorListener((MediaPlayer.OnErrorListener) obj);
                    return true;
                case 141:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnFocusChangeListener)) {
                        return false;
                    }
                    this.a.aC((View.OnFocusChangeListener) obj, h);
                    return true;
                case 142:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqnx)) {
                        return false;
                    }
                    this.a.aD((cqnx) obj, h);
                    return true;
                case 143:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqnx)) {
                        return false;
                    }
                    this.a.aE((cqnx) obj, h);
                    return true;
                case 144:
                    if (!(h instanceof AdapterView) || (obj != null && !(obj instanceof AdapterView.OnItemClickListener))) {
                        if (!(h instanceof AutoCompleteTextView)) {
                            return false;
                        }
                        if (obj != null && !(obj instanceof AdapterView.OnItemClickListener)) {
                            return false;
                        }
                        ((AutoCompleteTextView) h).setOnItemClickListener((AdapterView.OnItemClickListener) obj);
                        return true;
                    }
                    ((AdapterView) h).setOnItemClickListener((AdapterView.OnItemClickListener) obj);
                    return true;
                case 145:
                    if (!(h instanceof AdapterView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof AdapterView.OnItemSelectedListener)) {
                        return false;
                    }
                    ((AdapterView) h).setOnItemSelectedListener((AdapterView.OnItemSelectedListener) obj);
                    return true;
                case 146:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnLayoutChangeListener)) {
                        return false;
                    }
                    this.a.aF((View.OnLayoutChangeListener) obj, h);
                    return true;
                case 147:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnLongClickListener)) {
                        return false;
                    }
                    View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) obj;
                    this.a.aG(h);
                    return true;
                case 148:
                    if (!(h instanceof ViewPager)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof bbb)) {
                        return false;
                    }
                    ((ViewPager) h).setOnPageChangeListener((bbb) obj);
                    return true;
                case 149:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqfc)) {
                        return false;
                    }
                    this.a.aH((cqfc) obj, h, cqjzVar);
                    return true;
                case 150:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqfd)) {
                        return false;
                    }
                    this.a.aI((cqfd) obj, h, cqjzVar);
                    return true;
                case 151:
                    if (!(h instanceof VideoView) || !(obj instanceof MediaPlayer.OnPreparedListener)) {
                        return false;
                    }
                    ((VideoView) h).setOnPreparedListener((MediaPlayer.OnPreparedListener) obj);
                    return true;
                case 152:
                    if (!(h instanceof RadioGroup)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof RadioGroup.OnCheckedChangeListener)) {
                        return false;
                    }
                    ((RadioGroup) h).setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) obj);
                    return true;
                case 153:
                    if (!(h instanceof axb)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof awz)) {
                        return false;
                    }
                    this.a.aJ((awz) obj, (axb) h);
                    return true;
                case 154:
                    if (!(h instanceof SeekBar)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof SeekBar.OnSeekBarChangeListener)) {
                        return false;
                    }
                    ((SeekBar) h).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) obj);
                    return true;
                case 155:
                    if (Build.VERSION.SDK_INT < 23 || !(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnScrollChangeListener)) {
                        return false;
                    }
                    h.setOnScrollChangeListener((View.OnScrollChangeListener) obj);
                    return true;
                case 156:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqnx)) {
                        return false;
                    }
                    this.a.aK((cqnx) obj, (TextView) h);
                    return true;
                case 157:
                    if (!(h instanceof TextView) || !(obj instanceof TextWatcher)) {
                        return false;
                    }
                    this.a.aL((TextWatcher) obj, (TextView) h);
                    return true;
                case 158:
                    if (!(h instanceof TimePicker) || !(obj instanceof TimePicker.OnTimeChangedListener)) {
                        return false;
                    }
                    this.a.aM((TimePicker.OnTimeChangedListener) obj, (TimePicker) h);
                    return true;
                case 159:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof View.OnTouchListener)) {
                        return false;
                    }
                    this.a.aN((View.OnTouchListener) obj, h);
                    return true;
                case 160:
                    if (!(h instanceof NumberPicker)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof NumberPicker.OnValueChangeListener)) {
                        return false;
                    }
                    ((NumberPicker) h).setOnValueChangedListener((NumberPicker.OnValueChangeListener) obj);
                    return true;
                case 161:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((LinearLayout) h).setOrientation(((Integer) obj).intValue());
                    return true;
                case 162:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.aO(Integer.valueOf(this.b.n((Number) obj)), h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            this.a.aO(null, h);
                            return true;
                        }
                    }
                    this.a.aO(Integer.valueOf(this.b.f(h, (cqss) obj)), h);
                    return true;
                case 163:
                    if (!(h instanceof View) || !(obj instanceof ViewOutlineProvider)) {
                        return false;
                    }
                    h.setOutlineProvider((ViewOutlineProvider) obj);
                    return true;
                case 164:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.aP(Integer.valueOf(this.b.n((Number) obj)), h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            this.a.aP(null, h);
                            return true;
                        }
                    }
                    this.a.aP(Integer.valueOf(this.b.f(h, (cqss) obj)), h);
                    return true;
                case 165:
                    if (!(h instanceof ViewAnimator)) {
                        return false;
                    }
                    if (!(obj instanceof cqrx) || (l2 = this.b.l(h, (cqrx) obj)) == null) {
                        if (!(obj instanceof Animation)) {
                            return false;
                        }
                        ((ViewAnimator) h).setOutAnimation((Animation) obj);
                        return true;
                    }
                    ((ViewAnimator) h).setOutAnimation(l2);
                    return true;
                case 166:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    h.setOverScrollMode(((Integer) obj).intValue());
                    return true;
                case 167:
                    if (!(h instanceof View) || !(obj instanceof Object[])) {
                        return false;
                    }
                    this.a.aQ((Object[]) obj, h);
                    return true;
                case 168:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aR(obj, h);
                    return true;
                case 169:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aS(obj, h);
                    return true;
                case 170:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aT(obj, h);
                    return true;
                case 171:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aU(obj, h);
                    return true;
                case 172:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aV(obj, h);
                    return true;
                case 173:
                    if (!(h instanceof View) || !(obj instanceof Object)) {
                        return false;
                    }
                    this.a.aW(obj, h);
                    return true;
                case 174:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextView) h).setPaintFlags(((Integer) obj).intValue());
                    return true;
                case 175:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        h.setPivotX(this.b.h(h, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        h.setPivotX(this.b.p((Number) obj));
                        return true;
                    }
                case 176:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        h.setPivotY(this.b.h(h, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        h.setPivotY(this.b.p((Number) obj));
                        return true;
                    }
                case 177:
                    if (!(h instanceof VideoView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.aX((Boolean) obj, (VideoView) h);
                    return true;
                case 178:
                    if (!(h instanceof ProgressBar) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ProgressBar) h).setProgress(((Integer) obj).intValue());
                    return true;
                case 179:
                    if (!(h instanceof ProgressBar)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable16 = (Drawable) obj;
                        this.b.v(h, drawable16);
                        ((ProgressBar) h).setProgressDrawable(drawable16);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((ProgressBar) h).setProgressDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((ProgressBar) h).setProgressDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ProgressBar) h).setProgressDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case 180:
                    if (!(h instanceof axb)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqtv)) {
                        return false;
                    }
                    this.a.aY((cqtv) obj, (axb) h);
                    return true;
                case 181:
                    if (!(h instanceof axb) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((axb) h).setRefreshing(((Boolean) obj).booleanValue());
                    return true;
                case 182:
                    if (!(h instanceof View) || !(obj instanceof cqje)) {
                        return false;
                    }
                    this.a.aZ((cqje) obj, h);
                    return true;
                case 183:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.ba((Boolean) obj, h);
                    return true;
                case 184:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    h.setRotation(((Float) obj).floatValue());
                    return true;
                case 185:
                    if (!(h instanceof GridLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridLayout) h).setRowCount(((Integer) obj).intValue());
                    return true;
                case 186:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setSaveEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 187:
                    if (!(h instanceof ImageView) || !(obj instanceof ImageView.ScaleType)) {
                        return false;
                    }
                    ((ImageView) h).setScaleType((ImageView.ScaleType) obj);
                    return true;
                case 188:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    h.setScaleX(((Float) obj).floatValue());
                    return true;
                case 189:
                    if (!(h instanceof View) || !(obj instanceof Float)) {
                        return false;
                    }
                    h.setScaleY(((Float) obj).floatValue());
                    return true;
                case 190:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.bb(((Boolean) obj).booleanValue(), h);
                    return true;
                case 191:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    h.setScrollBarStyle(((Integer) obj).intValue());
                    return true;
                case 192:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    this.a.bc(((Boolean) obj).booleanValue(), h);
                    return true;
                case 193:
                    if (!(h instanceof ProgressBar) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ProgressBar) h).setSecondaryProgress(((Integer) obj).intValue());
                    return true;
                case 194:
                    if (!(h instanceof VideoView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.bd((Integer) obj, (VideoView) h);
                    return true;
                case 195:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setSelectAllOnFocus(((Boolean) obj).booleanValue());
                    return true;
                case 196:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setSelected(((Boolean) obj).booleanValue());
                    return true;
                case 197:
                    if (!(h instanceof AdapterView) || !(obj instanceof Integer)) {
                        if (!(h instanceof EditText) || !(obj instanceof Integer)) {
                            return false;
                        }
                        ((EditText) h).setSelection(((Integer) obj).intValue());
                        return true;
                    }
                    ((AdapterView) h).setSelection(((Integer) obj).intValue());
                    return true;
                case 198:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.be(this.b.n((Number) obj), (TextView) h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            return false;
                        }
                    }
                    this.a.be(this.b.f(h, (cqss) obj), (TextView) h);
                    return true;
                case 199:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.bf(this.b.p((Number) obj), (TextView) h);
                        return true;
                    }
                    this.a.bf(this.b.h(h, (cqtv) obj), (TextView) h);
                    return true;
                case 200:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.bg(this.b.p((Number) obj), (TextView) h);
                        return true;
                    }
                    this.a.bg(this.b.h(h, (cqtv) obj), (TextView) h);
                    return true;
                case 201:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.bh(this.b.p((Number) obj), (TextView) h);
                        return true;
                    }
                    this.a.bh(this.b.h(h, (cqtv) obj), (TextView) h);
                    return true;
                case 202:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((LinearLayout) h).setShowDividers(((Integer) obj).intValue());
                    return true;
                case 203:
                    if (!(h instanceof TableLayout) || !(obj instanceof Integer[])) {
                        return false;
                    }
                    this.a.bi((Integer[]) obj, (TableLayout) h);
                    return true;
                case 204:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setSingleLine(((Boolean) obj).booleanValue());
                    return true;
                case 205:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable17 = (Drawable) obj;
                        this.b.v(h, drawable17);
                        ((ImageView) h).setImageDrawable(drawable17);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((ImageView) h).setImageDrawable(this.b.c(h, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((ImageView) h).setImageDrawable(this.b.d(h, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ImageView) h).setImageDrawable(this.b.e(h, ((Integer) obj).intValue()));
                        return true;
                    }
                case 206:
                    return (h instanceof View) && this.a.h(obj, h);
                case 207:
                    if (!(h instanceof TableLayout) || !(obj instanceof Integer[])) {
                        return false;
                    }
                    this.a.bj((Integer[]) obj, (TableLayout) h);
                    return true;
                case 208:
                    if (!(h instanceof GridView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridView) h).setStretchMode(((Integer) obj).intValue());
                    return true;
                case 210:
                    if (h instanceof TextView) {
                        if (!(obj instanceof cqsn)) {
                            if (!(obj instanceof Integer)) {
                                if (obj == null || (obj instanceof CharSequence)) {
                                    this.a.bk((CharSequence) obj, (TextView) h);
                                    return true;
                                }
                            } else {
                                this.a.bk(this.b.b(h, ((Integer) obj).intValue()), (TextView) h);
                                return true;
                            }
                        } else {
                            this.a.bk(this.b.a(h, (cqsn) obj), (TextView) h);
                            return true;
                        }
                    }
                    if (!(h instanceof TextSwitcher)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((TextSwitcher) h).setText(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((TextSwitcher) h).setText(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((TextSwitcher) h).setText((CharSequence) obj);
                        return true;
                    }
                case 211:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqgh)) {
                        return false;
                    }
                    this.a.bl((cqgh) obj, (TextView) h);
                    return true;
                case 212:
                    return (h instanceof View) && (obj instanceof Integer) && this.a.i(((Integer) obj).intValue(), h);
                case 213:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqsn)) {
                        if (!(obj instanceof Integer)) {
                            if (obj != null && !(obj instanceof CharSequence)) {
                                return false;
                            }
                            this.a.bm((CharSequence) obj, (TextView) h);
                            return true;
                        }
                        this.a.bm(this.b.b(h, ((Integer) obj).intValue()), (TextView) h);
                        return true;
                    }
                    this.a.bm(this.b.a(h, (cqsn) obj), (TextView) h);
                    return true;
                case 214:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.bn(((Integer) obj).intValue(), (TextView) h);
                    return true;
                case 215:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if ((obj != null && !(obj instanceof cqss)) || (g = this.b.g(h, (cqss) obj)) == null) {
                        if (!(obj instanceof Number) || (o = this.b.o((Number) obj)) == null) {
                            if (!(obj instanceof ColorStateList)) {
                                return false;
                            }
                            ((TextView) h).setTextColor((ColorStateList) obj);
                            return true;
                        }
                        ((TextView) h).setTextColor(o);
                        return true;
                    }
                    ((TextView) h).setTextColor(g);
                    return true;
                case 216:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if ((obj != null && !(obj instanceof cqss)) || (g2 = this.b.g(h, (cqss) obj)) == null) {
                        if (!(obj instanceof Number) || (o2 = this.b.o((Number) obj)) == null) {
                            if (!(obj instanceof ColorStateList)) {
                                return false;
                            }
                            ((TextView) h).setHintTextColor((ColorStateList) obj);
                            return true;
                        }
                        ((TextView) h).setHintTextColor(o2);
                        return true;
                    }
                    ((TextView) h).setHintTextColor(g2);
                    return true;
                case 217:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if ((obj != null && !(obj instanceof cqss)) || (g3 = this.b.g(h, (cqss) obj)) == null) {
                        if (!(obj instanceof Number) || (o3 = this.b.o((Number) obj)) == null) {
                            if (!(obj instanceof ColorStateList)) {
                                return false;
                            }
                            ((TextView) h).setLinkTextColor((ColorStateList) obj);
                            return true;
                        }
                        ((TextView) h).setLinkTextColor(o3);
                        return true;
                    }
                    ((TextView) h).setLinkTextColor(g3);
                    return true;
                case 218:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.bo(((Integer) obj).intValue(), h);
                    return true;
                case 219:
                    if (!(h instanceof TextView) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextView) h).setTextIsSelectable(((Boolean) obj).booleanValue());
                    return true;
                case 220:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqsn)) {
                        if (!(obj instanceof Integer)) {
                            if (obj != null && !(obj instanceof CharSequence)) {
                                return false;
                            }
                            this.a.bp((CharSequence) obj, (TextView) h);
                            return true;
                        }
                        this.a.bp(this.b.b(h, ((Integer) obj).intValue()), (TextView) h);
                        return true;
                    }
                    this.a.bp(this.b.a(h, (cqsn) obj), (TextView) h);
                    return true;
                case 221:
                    if (h instanceof ToggleButton) {
                        if (!(obj instanceof cqsn)) {
                            if (!(obj instanceof Integer)) {
                                if (obj == null || (obj instanceof CharSequence)) {
                                    this.a.bq((CharSequence) obj, (ToggleButton) h);
                                    return true;
                                }
                            } else {
                                this.a.bq(this.b.b(h, ((Integer) obj).intValue()), (ToggleButton) h);
                                return true;
                            }
                        } else {
                            this.a.bq(this.b.a(h, (cqsn) obj), (ToggleButton) h);
                            return true;
                        }
                    }
                    if (!(h instanceof Switch)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((Switch) h).setTextOff(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((Switch) h).setTextOff(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((Switch) h).setTextOff((CharSequence) obj);
                        return true;
                    }
                case 222:
                    if (h instanceof ToggleButton) {
                        if (!(obj instanceof cqsn)) {
                            if (!(obj instanceof Integer)) {
                                if (obj == null || (obj instanceof CharSequence)) {
                                    this.a.br((CharSequence) obj, (ToggleButton) h);
                                    return true;
                                }
                            } else {
                                this.a.br(this.b.b(h, ((Integer) obj).intValue()), (ToggleButton) h);
                                return true;
                            }
                        } else {
                            this.a.br(this.b.a(h, (cqsn) obj), (ToggleButton) h);
                            return true;
                        }
                    }
                    if (!(h instanceof Switch)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((Switch) h).setTextOn(this.b.a(h, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((Switch) h).setTextOn(this.b.b(h, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((Switch) h).setTextOn((CharSequence) obj);
                        return true;
                    }
                case 223:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.bs(this.b.p((Number) obj), (TextView) h);
                        return true;
                    }
                    this.a.bs(this.b.h(h, (cqtv) obj), (TextView) h);
                    return true;
                case 224:
                    if (!(h instanceof TextView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    this.a.bt(((Integer) obj).intValue(), (TextView) h);
                    return true;
                case 225:
                    if (!(h instanceof TextView) || !(obj instanceof cqvj)) {
                        return false;
                    }
                    this.a.bu((cqvj) obj, (TextView) h);
                    return true;
                case 226:
                    if (h instanceof AbsSeekBar) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable18 = (Drawable) obj;
                            this.b.v(h, drawable18);
                            this.a.bv(drawable18, (AbsSeekBar) h);
                            return true;
                        } else if (!(obj instanceof cqtd)) {
                            if (!(obj instanceof Picture)) {
                                if (obj instanceof Integer) {
                                    this.a.bv(this.b.e(h, ((Integer) obj).intValue()), (AbsSeekBar) h);
                                    return true;
                                }
                            } else {
                                this.a.bv(this.b.d(h, (Picture) obj), (AbsSeekBar) h);
                                return true;
                            }
                        } else {
                            this.a.bv(this.b.c(h, (cqtd) obj), (AbsSeekBar) h);
                            return true;
                        }
                    }
                    return (h instanceof Switch) && this.a.j(obj, (Switch) h);
                case 227:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.bw(Integer.valueOf(this.b.n((Number) obj)), (ImageView) h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            this.a.bw(null, (ImageView) h);
                            return true;
                        }
                    }
                    this.a.bw(Integer.valueOf(this.b.f(h, (cqss) obj)), (ImageView) h);
                    return true;
                case 228:
                    if (!(h instanceof ImageView)) {
                        return false;
                    }
                    if (!(obj instanceof cqss)) {
                        if (obj instanceof Number) {
                            this.a.bx(Integer.valueOf(this.b.n((Number) obj)), (ImageView) h);
                            return true;
                        } else if (obj != null) {
                            return false;
                        } else {
                            this.b.w(null);
                            this.a.bx(null, (ImageView) h);
                            return true;
                        }
                    }
                    this.a.bx(Integer.valueOf(this.b.f(h, (cqss) obj)), (ImageView) h);
                    return true;
                case 229:
                    if (!(h instanceof TextView)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof TransformationMethod)) {
                        return false;
                    }
                    ((TextView) h).setTransformationMethod((TransformationMethod) obj);
                    return true;
                case 230:
                    if (!(h instanceof View) || !(obj instanceof String)) {
                        return false;
                    }
                    this.a.by((String) obj, h);
                    return true;
                case 231:
                    if (!(h instanceof View)) {
                        return false;
                    }
                    if (!(obj instanceof cqtv)) {
                        if (!(obj instanceof Number)) {
                            return false;
                        }
                        this.a.bA((Number) obj, h);
                        return true;
                    }
                    this.a.bz((cqtv) obj, h);
                    return true;
                case 232:
                    return (h instanceof View) && (obj instanceof Object) && this.a.k(obj, h);
                case 233:
                    return (h instanceof View) && (obj instanceof Object) && this.a.l(obj, h);
                case 234:
                    if (!(h instanceof NumberPicker) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((NumberPicker) h).setValue(((Integer) obj).intValue());
                    return true;
                case 235:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setVerticalFadingEdgeEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 236:
                    if (!(h instanceof View) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    h.setVerticalScrollBarEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 237:
                    if (!(h instanceof GridView) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((GridView) h).setVerticalSpacing(((Integer) obj).intValue());
                    return true;
                case 238:
                    if (!(h instanceof VideoView) || !(obj instanceof String)) {
                        return false;
                    }
                    ((VideoView) h).setVideoPath((String) obj);
                    return true;
                case 239:
                    if (!(h instanceof VideoView) || !(obj instanceof Uri)) {
                        return false;
                    }
                    ((VideoView) h).setVideoURI((Uri) obj);
                    return true;
                case 240:
                    if (!(h instanceof ViewPager) || !(obj instanceof cqiw)) {
                        return false;
                    }
                    this.a.bB((cqiw) obj, (ViewPager) h);
                    return true;
                case 241:
                    if (!(h instanceof ViewPager) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ViewPager) h).setCurrentItem(((Integer) obj).intValue());
                    return true;
                case 242:
                    if (!(h instanceof ViewPager)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof List)) {
                        return false;
                    }
                    this.a.bC((List) obj, (ViewPager) h);
                    return true;
                case 243:
                    if (!(h instanceof ViewPager) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((ViewPager) h).setOffscreenPageLimit(((Integer) obj).intValue());
                    return true;
                case 244:
                    if (!(h instanceof ViewPager)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((ViewPager) h).setPageMargin(this.b.i(h, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((ViewPager) h).setPageMargin(this.b.q((Integer) obj));
                        return true;
                    }
                case 245:
                    if (!(h instanceof ViewPager)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof bbc)) {
                        return false;
                    }
                    this.a.bD((bbc) obj, (ViewPager) h);
                    return true;
                case 246:
                    if (!(h instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    h.setVisibility(((Integer) obj).intValue());
                    return true;
                case 247:
                    if (!(h instanceof WebView) || !(obj instanceof WebViewClient)) {
                        return false;
                    }
                    ((WebView) h).setWebViewClient((WebViewClient) obj);
                    return true;
                case 248:
                    if (!(h instanceof WebView) || !(obj instanceof String)) {
                        return false;
                    }
                    this.a.bE((String) obj, (WebView) h);
                    return true;
                case 249:
                    if (!(h instanceof WebView) || !(obj instanceof String)) {
                        return false;
                    }
                    ((WebView) h).loadUrl((String) obj);
                    return true;
                case 250:
                    if (!(h instanceof LinearLayout) || !(obj instanceof Float)) {
                        return false;
                    }
                    ((LinearLayout) h).setWeightSum(((Float) obj).floatValue());
                    return true;
                case 251:
                    if (!(h instanceof NumberPicker) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((NumberPicker) h).setWrapSelectorWheel(((Boolean) obj).booleanValue());
                    return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            int ordinal = ((cqfe) cqkuVar).ordinal();
            if (ordinal == 8) {
                if (!(view instanceof TextView)) {
                    return false;
                }
                this.a.y(null, (TextView) view);
                return true;
            } else if (ordinal == 109) {
                if (!(view instanceof ListView)) {
                    if (!(view instanceof GridView)) {
                        if (!(view instanceof AutoCompleteTextView)) {
                            if (!(view instanceof ViewPager)) {
                                if (!(view instanceof ViewGroup)) {
                                    return false;
                                }
                                cqfp.c((ViewGroup) view);
                                return true;
                            }
                            ((ViewPager) view).setAdapter(null);
                            return true;
                        }
                        ((AutoCompleteTextView) view).setAdapter(null);
                        return true;
                    }
                    ((GridView) view).setAdapter((ListAdapter) null);
                    return true;
                }
                ((ListView) view).setAdapter((ListAdapter) null);
                return true;
            } else if (ordinal == 137) {
                if (!(view instanceof CompoundButton)) {
                    return false;
                }
                ((CompoundButton) view).setOnCheckedChangeListener(null);
                return true;
            } else if (ordinal == 139) {
                if (!(view instanceof TextView)) {
                    return false;
                }
                this.a.aB(null, (TextView) view);
                return true;
            } else if (ordinal == 242) {
                if (!(view instanceof ViewPager)) {
                    return false;
                }
                cqlh cqlhVar = (cqlh) ((ViewPager) view).c();
                if (cqlhVar != null) {
                    cqlhVar.A(null);
                }
                return true;
            } else if (ordinal == 245) {
                if (!(view instanceof ViewPager)) {
                    return false;
                }
                this.a.bD(null, (ViewPager) view);
                return true;
            } else if (ordinal == 134) {
                if (!(view instanceof View)) {
                    return false;
                }
                cqfp.e(view);
                return true;
            } else if (ordinal == 135) {
                return (view instanceof View) && this.a.f(null, view);
            } else if (ordinal == 146) {
                if (!(view instanceof View)) {
                    return false;
                }
                this.a.aF(null, view);
                return true;
            } else if (ordinal == 147) {
                if (!(view instanceof View)) {
                    return false;
                }
                this.a.aG(view);
                return true;
            } else if (ordinal == 149) {
                if (!(view instanceof View)) {
                    return false;
                }
                this.a.aH(null, view, cqjzVar);
                return true;
            } else if (ordinal == 150) {
                if (!(view instanceof View)) {
                    return false;
                }
                this.a.aI(null, view, cqjzVar);
                return true;
            } else if (ordinal == 152) {
                if (!(view instanceof RadioGroup)) {
                    return false;
                }
                ((RadioGroup) view).setOnCheckedChangeListener(null);
                return true;
            } else if (ordinal != 153) {
                switch (ordinal) {
                    case 156:
                        if (!(view instanceof TextView)) {
                            return false;
                        }
                        this.a.aK(null, (TextView) view);
                        return true;
                    case 157:
                        if (!(view instanceof TextView)) {
                            return false;
                        }
                        this.a.aL(null, (TextView) view);
                        return true;
                    case 158:
                        if (!(view instanceof TimePicker)) {
                            return false;
                        }
                        ((TimePicker) view).setOnTimeChangedListener(null);
                        return true;
                    case 159:
                        if (!(view instanceof View)) {
                            return false;
                        }
                        this.a.aN(null, view);
                        return true;
                    default:
                        return false;
                }
            } else if (!(view instanceof axb)) {
                return false;
            } else {
                ((axb) view).setOnRefreshListener(null);
                return true;
            }
        }
        return false;
    }
}
