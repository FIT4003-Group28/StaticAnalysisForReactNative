package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ViewAnimator;
import android.widget.ViewSwitcher;
import androidx.viewpager.widget.ViewPager;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqgr  reason: default package */
/* loaded from: classes.dex */
public final class cqgr {
    public static <T extends cqkp> cqnf<T> A(@dzsi Integer num) {
        return cqjv.j(cqfe.BACKGROUND_COLOR, num);
    }

    public static <T extends cqkp> cqnf<T> B(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.BACKGROUND_COLOR, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> C(cqtv cqtvVar) {
        return cqjv.j(cqfe.BASELINE, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> D(Boolean bool) {
        return cqjv.j(cqfe.BASELINE_ALIGNED, bool);
    }

    public static <T extends cqkp> cqnf<T> E(Boolean bool) {
        return cqjv.j(cqfe.BASELINE_ALIGN_BOTTOM, bool);
    }

    public static <T extends cqkp> cqnf<T> F(Integer num) {
        return cqjv.j(cqfe.BREAK_STRATEGY, num);
    }

    public static <T extends cqkp> cqnf<T> G(cqtd cqtdVar) {
        return cqjv.j(cqfe.BUTTON_DRAWABLE, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> H(Boolean bool) {
        return cqjv.j(cqfe.CHECKED, bool);
    }

    public static <T extends cqkp> cqnf<T> I(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.CHECKED, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> J(Boolean bool) {
        return cqjv.j(cqfe.CLICKABLE, bool);
    }

    public static <T extends cqkp> cqnf<T> K(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.CLICKABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> L(Boolean bool) {
        return cqjv.j(cqfe.CLIP_CHILDREN, bool);
    }

    public static <T extends cqkp> cqnf<T> M(Boolean bool) {
        return cqjv.j(cqfe.CLIP_TO_OUTLINE, bool);
    }

    public static <T extends cqkp> cqnf<T> N(ViewOutlineProvider viewOutlineProvider) {
        return cqjv.j(cqfe.OUTLINE_PROVIDER, viewOutlineProvider);
    }

    public static <T extends cqkp> cqnf<T> O(cqlc<T, ViewOutlineProvider> cqlcVar) {
        return cqjv.f(cqfe.OUTLINE_PROVIDER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> P(Boolean bool) {
        return cqjv.j(cqfe.CLIP_TO_PADDING, bool);
    }

    public static <T extends cqkp> cqnf<T> Q(Integer num) {
        return cqjv.j(cqfe.COLUMN_COUNT, num);
    }

    public static <T extends cqkp> cqnf<T> R(@dzsi CharSequence charSequence) {
        return cqjv.j(cqfe.CONTENT_DESCRIPTION, charSequence);
    }

    public static <T extends cqkp> cqnf<T> S(@dzsi Integer num) {
        return cqjv.j(cqfe.CONTENT_DESCRIPTION, num);
    }

    public static <T extends cqkp> cqnf<T> T(@dzsi cqsn cqsnVar) {
        return cqjv.j(cqfe.CONTENT_DESCRIPTION, cqsnVar);
    }

    public static <T extends cqkp> cqnf<T> U(cqjb<T, ? extends CharSequence> cqjbVar) {
        return cqjv.d(cqfe.CONTENT_DESCRIPTION, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> V(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.CONTENT_DESCRIPTION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> W(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.CURRENT_HOUR, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> X(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.CURRENT_MINUTE, cqlcVar);
    }

    public static <T extends cqkp> cqmu<T> Y(int i) {
        return new cqmu<>(i);
    }

    public static <T extends cqkp> cqmv<T> Z(int i) {
        return new cqmv<>(i);
    }

    public static <T extends cqkp> cqnf<T> a(View.AccessibilityDelegate accessibilityDelegate) {
        return cqjv.j(cqfe.ACCESSIBILITY_DELEGATE, accessibilityDelegate);
    }

    public static <T extends cqkp> cqnf<T> aA(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.FOCUSABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aB(cqjb<T, Boolean> cqjbVar) {
        return cqjv.d(cqfe.FOCUSABLE, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> aC(Boolean bool) {
        return cqjv.j(cqfe.FOCUSABLE_IN_TOUCH_MODE, bool);
    }

    public static <T extends cqkp> cqnf<T> aD(Boolean bool) {
        return cqjv.k(bool, fI(8), fI(0));
    }

    public static <T extends cqkp> cqnf<T> aE(cqjb<T, Boolean> cqjbVar) {
        return cqjv.o(cqjbVar, fI(8), fI(0));
    }

    public static <T extends cqkp> cqnf<T> aF(cqlc<T, Boolean> cqlcVar) {
        return cqjv.l(cqlcVar, fI(8), fI(0));
    }

    public static <T extends cqkp> cqnf<T> aG(Boolean bool) {
        return cqjv.k(bool, fI(0), fI(8));
    }

    public static <T extends cqkp> cqnf<T> aH(cqjb<T, Boolean> cqjbVar) {
        return cqjv.o(cqjbVar, fI(0), fI(8));
    }

    public static <T extends cqkp> cqnf<T> aI(cqlc<T, Boolean> cqlcVar) {
        return cqjv.l(cqlcVar, fI(0), fI(8));
    }

    public static <T extends cqkp> cqnf<T> aJ(Integer num) {
        return cqjv.j(cqfe.GRAVITY, num);
    }

    public static <T extends cqkp> cqnf<T> aK(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.GRAVITY, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aL(Boolean bool) {
        return cqjv.j(cqfe.HAPTIC_FEEDBACK_ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> aM(Boolean bool) {
        return cqjv.j(cqfe.HORIZONTALLY_SCROLLING, bool);
    }

    public static <T extends cqkp> cqnf<T> aN(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.HORIZONTALLY_SCROLLING, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aO(@dzsi Integer num) {
        return cqjv.j(cqfe.HINT, num);
    }

    public static <T extends cqkp> cqnf<T> aP(@dzsi cqsn cqsnVar) {
        return cqjv.j(cqfe.HINT, cqsnVar);
    }

    public static <T extends cqkp> cqnf<T> aQ(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.HINT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aR(@dzsi Integer num) {
        return cqjv.j(cqfe.ID, num);
    }

    public static <T extends cqkp> cqnf<T> aS(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.ID, cqlcVar);
    }

    public static <T extends cqkp> cqnl<T> aT(cqjg cqjgVar) {
        return new cqnl<>(cqjgVar);
    }

    public static <T extends cqkp> cqnf<T> aU(Integer num) {
        return cqjv.j(cqfe.IME_OPTIONS, num);
    }

    public static <T extends cqkp> cqnf<T> aV(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.IME_OPTIONS, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aW(Integer num) {
        return cqjv.j(cqfe.IMPORTANT_FOR_ACCESSIBILITY, num);
    }

    public static <T extends cqkp> cqnf<T> aX(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.IMPORTANT_FOR_ACCESSIBILITY, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> aY(Animation animation) {
        return cqjv.j(cqfe.IN_ANIMATION, animation);
    }

    public static <T extends cqkp> cqnf<T> aZ(Boolean bool) {
        return cqjv.j(cqfe.INCLUDE_FONT_PADDING, bool);
    }

    public static <T extends cqkp> cqnf<T> aa(Boolean bool) {
        return cqjv.j(cqfe.DEFAULT_FOCUS_HIGHLIGHT_ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> ab(Integer num) {
        return cqjv.j(cqfe.DESCENDANT_FOCUSABILITY, num);
    }

    public static <T extends cqkp> cqnf<T> ac(cqjg cqjgVar) {
        return cqjv.j(cqfe.DISPLAYED_CHILD, cqjgVar);
    }

    public static <T extends cqkp> cqnf<T> ad(cqlc<T, cqjg> cqlcVar) {
        return cqjv.f(cqfe.DISPLAYED_CHILD, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ae(cqlc<T, List<String>> cqlcVar) {
        return cqjv.f(cqfe.DISPLAYED_VALUES, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> af(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.DIVIDER, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> ag(cqlc<T, cqtd> cqlcVar) {
        return cqjv.f(cqfe.DRAWABLE_BOTTOM, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ah(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.DRAWABLE_END, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> ai(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.DRAWABLE_START, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> aj(cqlc<T, cqtd> cqlcVar) {
        return cqjv.f(cqfe.DRAWABLE_START, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ak(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.DRAWABLE_TOP, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> al(cqtv cqtvVar) {
        return cqjv.j(cqfe.DRAWABLE_PADDING, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> am(Boolean bool) {
        return cqjv.j(cqfe.DUPLICATE_PARENT_STATE_ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> an(final cqlc<T, ? extends List<cqix>> cqlcVar) {
        return ck(new cqjb(cqlcVar) { // from class: cqga
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqlc cqlcVar2 = this.a;
                cqiv cqivVar = new cqiv();
                cqivVar.g((Iterable) cqlcVar2.a(cqkpVar));
                return cqivVar;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> ao(Number number) {
        return cqjv.j(cqfe.ELEVATION, number);
    }

    public static <T extends cqkp> cqnf<T> ap(cqtv cqtvVar) {
        return cqjv.j(cqfe.ELEVATION, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> aq(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.ELEVATION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ar(@dzsi TextUtils.TruncateAt truncateAt) {
        return cqjv.j(cqfe.ELLIPSIZE, truncateAt);
    }

    public static <T extends cqkp> cqnf<T> as(cqlc<T, TextUtils.TruncateAt> cqlcVar) {
        return cqjv.f(cqfe.ELLIPSIZE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> at(Boolean bool) {
        return cqjv.j(cqfe.ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> au(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.ENABLED, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> av(Boolean bool) {
        return cqjv.j(cqfe.FILL_VIEWPORT, bool);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> aw(@dzsi Typeface typeface) {
        return cqjv.j(cqfe.FONT_FAMILY, typeface);
    }

    public static <T extends cqkp> cqnf<T> ax(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.FOREGROUND, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> ay(@dzsi Boolean bool) {
        return cqjv.j(cqfe.FITS_SYSTEM_WINDOWS, bool);
    }

    public static <T extends cqkp> cqnf<T> az(Boolean bool) {
        return cqjv.j(cqfe.FOCUSABLE, bool);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.ACCESSIBILITY_DELEGATE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bA(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bB(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bC(Integer num) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_BOTTOM, num);
    }

    public static <T extends cqkp> cqnf<T> bD(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_BOTTOM, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bE(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_MARGIN_BOTTOM, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bF(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_BOTTOM, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bG(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_END, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bH(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_MARGIN_END, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bI(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_END, cqlcVar);
    }

    public static <T extends cqkp> cqmn<T> bJ(cqtv cqtvVar) {
        return cqmn.a(bR(cqtvVar), bG(cqtvVar));
    }

    public static <T extends cqkp> cqmn<T> bK(cqtv cqtvVar) {
        return cqmn.a(bV(cqtvVar), bD(cqtvVar));
    }

    public static <T extends cqkp> cqnf<T> bL(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_LEFT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bM(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_LEFT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bN(Integer num) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_RIGHT, num);
    }

    public static <T extends cqkp> cqnf<T> bO(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_RIGHT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bP(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_RIGHT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bQ(Integer num) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_START, num);
    }

    public static <T extends cqkp> cqnf<T> bR(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_START, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bS(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_MARGIN_START, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bT(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_START, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bU(Integer num) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_TOP, num);
    }

    public static <T extends cqkp> cqnf<T> bV(cqtv cqtvVar) {
        return cqjv.j(cqfe.LAYOUT_MARGIN_TOP, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> bW(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_MARGIN_TOP, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bX(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_MARGIN_TOP, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bY(cqjd... cqjdVarArr) {
        cqfe cqfeVar = cqfe.RELATIVE_LAYOUT_RULES;
        cqjd[] cqjdVarArr2 = new cqjd[cqje.a];
        for (cqjd cqjdVar : cqjdVarArr) {
            cqjdVarArr2[cqjdVar.a()] = cqjdVar;
        }
        return new cqmz(cqfeVar, new cqgv(Arrays.asList(cqjdVarArr2)), false);
    }

    public static <T extends cqkp> cqnf<T> bZ(cquq cquqVar) {
        return cqjv.j(cqfe.LAYOUT_TRANSITION, cquqVar);
    }

    public static <T extends cqkp> cqnf<T> ba(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.INCLUDE_FONT_PADDING, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bb(cqjb<T, ColorFilter> cqjbVar) {
        return cqjv.d(cqfe.INDETERMINATE_COLOR_FILTER, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bc(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.INDETERMINATE_TINT_LIST, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> bd(final cqlc<T, Integer> cqlcVar, final cqlc<T, Integer> cqlcVar2, final cqlc<T, Integer> cqlcVar3, final cqlc<T, DatePicker.OnDateChangedListener> cqlcVar4) {
        return cqjv.f(cqfe.INIT_DATE_PICKER, new cqlc(cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4) { // from class: cqgb
            private final cqlc a;
            private final cqlc b;
            private final cqlc c;
            private final cqlc d;

            {
                this.a = cqlcVar;
                this.b = cqlcVar2;
                this.c = cqlcVar3;
                this.d = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new cqgs((Integer) ((cqlb) this.a).a, (Integer) ((cqlb) this.b).a, (Integer) ((cqlb) this.c).a, (DatePicker.OnDateChangedListener) this.d.a(cqkpVar));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> be(Integer num) {
        return cqjv.j(cqfe.INPUT_TYPE, num);
    }

    public static <T extends cqkp> cqnf<T> bf(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.INPUT_TYPE, cqlcVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> bg(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.IMAGE_DRAWABLE, cqtdVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> bh(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.IMAGE_DRAWABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bi(Boolean bool) {
        return cqjv.k(bool, fI(4), fI(0));
    }

    public static <T extends cqkp> cqnf<T> bj(cqjb<T, Boolean> cqjbVar) {
        return cqjv.o(cqjbVar, fI(4), fI(0));
    }

    public static <T extends cqkp> cqnf<T> bk(final cqlc<T, Boolean> cqlcVar) {
        return fK(new cqlc(cqlcVar) { // from class: cqgc
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Integer.valueOf(true != ((Boolean) this.a.a(cqkpVar)).booleanValue() ? 0 : 4);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> bl(Boolean bool) {
        return cqjv.k(bool, fI(0), fI(4));
    }

    public static <T extends cqkp> cqnf<T> bm(final cqlc<T, Boolean> cqlcVar) {
        return fK(new cqlc(cqlcVar) { // from class: cqgd
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Integer.valueOf(true != ((Boolean) this.a.a(cqkpVar)).booleanValue() ? 4 : 0);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends cqkp> cqnf<T> bn(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.IS_24HOUR_VIEW, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bo(Integer num) {
        return cqjv.j(cqfe.LAYER_TYPE, num);
    }

    public static <T extends cqkp> cqnf<T> bp(Integer num) {
        return cqjv.j(cqfe.LAYOUT_HEIGHT, num);
    }

    public static <T extends cqkp> cqnf<T> bq(cqtc cqtcVar) {
        return cqjv.j(cqfe.LAYOUT_HEIGHT, cqtcVar);
    }

    public static <T extends cqkp> cqnf<T> br(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_HEIGHT, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> bs(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_HEIGHT, cqlcVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> bt(int i, cqmp<T>... cqmpVarArr) {
        return new cqmi(i, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> bu(Float f) {
        return cqjv.j(cqfe.LAYOUT_COLUMN_WEIGHT, f);
    }

    public static <T extends cqkp> cqnf<T> bv(Integer num) {
        return cqjv.j(cqfe.LAYOUT_DIRECTION, num);
    }

    public static <T extends cqkp> cqnf<T> bw(Integer num) {
        return cqjv.j(cqfe.LAYOUT_GRAVITY, num);
    }

    public static <T extends cqkp> cqnf<T> bx(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_GRAVITY, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> by(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_GRAVITY, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> bz(Integer num) {
        return cqjv.j(cqfe.LAYOUT_MARGIN, num);
    }

    public static <T extends cqkp> cqnf<T> c(int i) {
        return cqjv.j(cqfe.ACCESSIBILITY_LIVE_REGION, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> cA(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.MAX_WIDTH, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cB(Integer num) {
        return cqjv.j(cqfe.MAX_LINES, num);
    }

    public static <T extends cqkp> cqnf<T> cC(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.MAX_LINES, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> cD(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.MAX_LINES, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cE(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.MAX_VALUE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cF(Boolean bool) {
        return cqjv.j(cqfe.MEASURE_ALL_CHILDREN, bool);
    }

    public static <T extends cqkp> cqnf<T> cG(cqlc<T, Long> cqlcVar) {
        return cqjv.f(cqfe.MIN_DATE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cH(cqtv cqtvVar) {
        return cqjv.j(cqfe.MIN_HEIGHT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> cI(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.MIN_HEIGHT, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> cJ(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.MIN_HEIGHT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cK(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.MIN_VALUE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cL(cqtv cqtvVar) {
        return cqjv.j(cqfe.MIN_WIDTH, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> cM(Integer num) {
        return cqjv.j(cqfe.MIN_WIDTH, num);
    }

    public static <T extends cqkp> cqnf<T> cN(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.MIN_WIDTH, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cO(@dzsi MovementMethod movementMethod) {
        return cqjv.j(cqfe.MOVEMENT_METHOD, movementMethod);
    }

    public static <T extends cqkp> cqnf<T> cP(cqlc<T, MovementMethod> cqlcVar) {
        return cqjv.f(cqfe.MOVEMENT_METHOD, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cQ(int i) {
        return cqjv.j(cqfe.NEXT_FOCUS_DOWN, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> cR(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.NEXT_FOCUS_DOWN, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cS(int i) {
        return cqjv.j(cqfe.NEXT_FOCUS_RIGHT, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> cT(@dzsi View.OnClickListener onClickListener) {
        return cqjv.j(cqfe.ON_CLICK, onClickListener);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> cU(@dzsi cqkl cqklVar) {
        return cqjv.h(cqfe.ON_CLICK, cqklVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> cV(@dzsi cqkn<? super T> cqknVar) {
        return cqjv.j(cqfe.ON_CLICK, cqknVar);
    }

    public static <T extends cqkp> cqnf<T> cW(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.ON_CLICK, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cX(cqlc<T, CompoundButton.OnCheckedChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_COMPOUND_BUTTON_CHECKED_CHANGE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cY(@dzsi View.OnLayoutChangeListener onLayoutChangeListener) {
        return cqjv.j(cqfe.ON_LAYOUT_CHANGE_LISTENER, onLayoutChangeListener);
    }

    public static <T extends cqkp> cqnf<T> cZ(cqlc<T, View.OnLayoutChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_LAYOUT_CHANGE_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ca(Float f) {
        return cqjv.j(cqfe.LAYOUT_WEIGHT, f);
    }

    public static <T extends cqkp> cqnf<T> cb(cqjb<T, Float> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_WEIGHT, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> cc(cqlc<T, Float> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_WEIGHT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cd(Integer num) {
        return cqjv.j(cqfe.LAYOUT_WIDTH, num);
    }

    public static <T extends cqkp> cqnf<T> ce(cqtc cqtcVar) {
        return cqjv.j(cqfe.LAYOUT_WIDTH, cqtcVar);
    }

    public static <T extends cqkp> cqnf<T> cf(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.LAYOUT_WIDTH, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> cg(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.LAYOUT_WIDTH, cqlcVar);
    }

    public static <T extends cqkp> cqmn<T> ch(cqtc cqtcVar) {
        return cqmn.a(ce(cqtcVar), bq(cqtcVar));
    }

    public static <T extends cqkp> cqmn<T> ci(cqlc<T, ? extends cqtc> cqlcVar) {
        return cqmn.a(cg(cqlcVar), bs(cqlcVar));
    }

    public static <T extends cqkp> cqnf<T> cj(Float f) {
        return cqjv.j(cqfe.LETTER_SPACING, f);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> ck(cqjb<T, cqiv> cqjbVar) {
        return cqjv.d(cqfe.LIST_ADAPTER, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> cl(Integer num) {
        return cqjv.j(cqfe.LINES, num);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> cm(cqtv cqtvVar) {
        return cqjv.j(cqfe.LINE_SPACING_EXTRA, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> cn(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.LINE_SPACING_EXTRA, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cp(Float f) {
        return cqjv.j(cqfe.LINE_SPACING_MULTIPLIER, f);
    }

    public static <T extends cqkp> cqnf<T> cq(cqtd cqtdVar) {
        return cqjv.j(cqfe.LIST_SELECTOR, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> cr(Boolean bool) {
        return cqjv.j(cqfe.LONG_CLICKABLE, bool);
    }

    public static <T extends cqkp> cqnf<T> cs(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.LONG_CLICKABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ct(cqlc<T, Long> cqlcVar) {
        return cqjv.f(cqfe.MAX_DATE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cu(cqtv cqtvVar) {
        return cqjv.j(cqfe.MAX_HEIGHT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> cv(Integer num) {
        return cqjv.j(cqfe.MAX, num);
    }

    public static <T extends cqkp> cqnf<T> cw(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.MAX, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cx(Integer num) {
        return cqjv.j(cqfe.MAX_LENGTH, num);
    }

    public static <T extends cqkp> cqnf<T> cy(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.MAX_LENGTH, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> cz(cqtv cqtvVar) {
        return cqjv.j(cqfe.MAX_WIDTH, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> d(int i) {
        return cqjv.j(cqfe.ACCESSIBILITY_TRAVERSAL_AFTER, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> dA(cqlc<T, ?> cqlcVar, cqlc<T, ?> cqlcVar2, cqlc<T, ?> cqlcVar3, cqlc<T, ?> cqlcVar4) {
        return new cqmz(cqfe.PADDING, new cqlc[]{cqlcVar, cqlcVar2, cqlcVar3, cqlcVar4}, false);
    }

    public static <T extends cqkp> cqnf<T> dB(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_BOTTOM, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dC(Integer num) {
        return cqjv.j(cqfe.PADDING_BOTTOM, num);
    }

    public static <T extends cqkp> cqnf<T> dD(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.PADDING_BOTTOM, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dE(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.PADDING_BOTTOM, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dF(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_END, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dG(Integer num) {
        return cqjv.j(cqfe.PADDING_END, num);
    }

    public static <T extends cqkp> cqnf<T> dH(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.PADDING_END, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dI(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.PADDING_END, cqlcVar);
    }

    public static <T extends cqkp> cqmn<T> dJ(cqtv cqtvVar) {
        return cqmn.a(dQ(cqtvVar), dF(cqtvVar));
    }

    public static <T extends cqkp> cqmn<T> dK(cqlc<T, cqtv> cqlcVar) {
        return cqmn.a(dT(cqlcVar), dI(cqlcVar));
    }

    public static <T extends cqkp> cqmn<T> dL(cqtv cqtvVar) {
        return cqmn.a(dU(cqtvVar), dB(cqtvVar));
    }

    public static <T extends cqkp> cqnf<T> dM(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_LEFT, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dN(Integer num) {
        return cqjv.j(cqfe.PADDING_LEFT, num);
    }

    public static <T extends cqkp> cqnf<T> dO(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_RIGHT, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> dP(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.PADDING_RIGHT, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dQ(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_START, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dR(Integer num) {
        return cqjv.j(cqfe.PADDING_START, num);
    }

    public static <T extends cqkp> cqnf<T> dS(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.PADDING_START, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dT(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.PADDING_START, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dU(cqtv cqtvVar) {
        return cqjv.j(cqfe.PADDING_TOP, cqtvVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dV(Integer num) {
        return cqjv.j(cqfe.PADDING_TOP, num);
    }

    public static <T extends cqkp> cqnf<T> dW(cqjb<T, cqtv> cqjbVar) {
        return cqjv.d(cqfe.PADDING_TOP, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dX(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.PADDING_TOP, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dY(Integer num) {
        return cqjv.j(cqfe.PAINT_FLAGS, num);
    }

    public static <T extends cqkp> cqnf<T> dZ(Integer num) {
        return cqjv.j(cqfe.PROGRESS, num);
    }

    public static <T extends cqkp> cqnf<T> da(cqlc<T, SeekBar.OnSeekBarChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_SEEK_BAR_CHANGE_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> db(@dzsi View.OnTouchListener onTouchListener) {
        return cqjv.j(cqfe.ON_TOUCH, onTouchListener);
    }

    public static <T extends cqkp> cqnf<T> dc(cqlc<T, View.OnTouchListener> cqlcVar) {
        return cqjv.f(cqfe.ON_TOUCH, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dd() {
        return db(cqge.a);
    }

    public static <T extends cqkp> cqnf<T> de(cqlc<T, RadioGroup.OnCheckedChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_RADIO_GROUP_CHECKED_CHANGE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> df(cqlc<T, awz> cqlcVar) {
        return cqjv.f(cqfe.ON_REFRESH, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dg(cqlc<T, View.OnFocusChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_FOCUS_CHANGE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dh(cqlc<T, AdapterView.OnItemSelectedListener> cqlcVar) {
        return cqjv.f(cqfe.ON_ITEM_SELECTED_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> di(cqlc<T, NumberPicker.OnValueChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_VALUE_CHANGE_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dj(@dzsi View.OnAttachStateChangeListener onAttachStateChangeListener) {
        return cqjv.j(cqfe.ON_ATTACH_STATE_CHANGE_LISTENER, onAttachStateChangeListener);
    }

    public static <T extends cqkp> cqnf<T> dk(cqlc<T, View.OnAttachStateChangeListener> cqlcVar) {
        return cqjv.f(cqfe.ON_ATTACH_STATE_CHANGE_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dl(cqlc<T, TextView.OnEditorActionListener> cqlcVar) {
        return cqjv.f(cqfe.ON_EDITOR_ACTION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dm(@dzsi cqkl cqklVar) {
        return cqjv.h(cqfe.ON_LONG_CLICK, cqklVar);
    }

    public static <T extends cqkp> cqnf<T> dn(cqlc<T, View.OnLongClickListener> cqlcVar) {
        return cqjv.f(cqfe.ON_LONG_CLICK, cqlcVar);
    }

    /* renamed from: do  reason: not valid java name */
    public static <T extends cqkp> cqnf<T> m6do(cqlc<T, bbb> cqlcVar) {
        return cqjv.f(cqfe.ON_PAGE_CHANGE_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dp(cqlc<T, TextWatcher> cqlcVar) {
        return cqjv.f(cqfe.ON_TEXT_CHANGED_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dq(cqlc<T, TimePicker.OnTimeChangedListener> cqlcVar) {
        return cqjv.f(cqfe.ON_TIME_CHANGED_LISTENER, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> dr(Integer num) {
        return cqjv.j(cqfe.ORIENTATION, num);
    }

    public static <T extends cqkp> cqnf<T> ds(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.ORIENTATION, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> dt(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.ORIENTATION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> du(Animation animation) {
        return cqjv.j(cqfe.OUT_ANIMATION, animation);
    }

    public static <T extends cqkp> cqnf<T> dv(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.OUTLINE_AMBIENT_SHADOW_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> dw(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.OUTLINE_SPOT_SHADOW_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> dx(Integer num) {
        return cqjv.j(cqfe.OVER_SCROLL_MODE, num);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> dy(Object obj, Object obj2, Object obj3, Object obj4) {
        cqfe cqfeVar = cqfe.PADDING;
        boolean z = false;
        Object[] objArr = {obj, obj2, obj3, obj4};
        if (cqvl.a(obj) && cqvl.a(obj2) && cqvl.a(obj3) && cqvl.a(obj4)) {
            z = true;
        }
        return new cqmz(cqfeVar, objArr, z);
    }

    public static <T extends cqkp> cqnf<T> dz(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4) {
        cqfe cqfeVar = cqfe.PADDING;
        boolean z = false;
        cqtv[] cqtvVarArr = {cqtvVar, cqtvVar2, cqtvVar3, cqtvVar4};
        if (cqvl.a(cqtvVar) && cqvl.a(cqtvVar2) && cqvl.a(cqtvVar3) && cqvl.a(cqtvVar4)) {
            z = true;
        }
        return new cqmz(cqfeVar, cqtvVarArr, z);
    }

    public static <T extends cqkp> cqnf<T> e(int i) {
        return cqjv.j(cqfe.ACCESSIBILITY_TRAVERSAL_BEFORE, Integer.valueOf(i));
    }

    public static <T extends cqkp> cqnf<T> eA(Integer... numArr) {
        return cqjv.j(cqfe.SHRINK_COLUMNS, numArr);
    }

    public static <T extends cqkp> cqnf<T> eB(Boolean bool) {
        return cqjv.j(cqfe.SINGLE_LINE, bool);
    }

    public static <T extends cqkp> cqnf<T> eC(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.SINGLE_LINE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eD(@dzsi Integer num) {
        return cqjv.j(cqfe.SRC, num);
    }

    public static <T extends cqkp> cqnf<T> eE(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.SRC, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> eF(cqjb<T, ?> cqjbVar) {
        return cqjv.d(cqfe.SRC, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> eG(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.SRC, cqlcVar);
    }

    @Deprecated
    public static <T extends cqkp> cqnf<T> eH(Integer num, Object... objArr) {
        return cqjv.d(cqfe.TEXT, cqiq.b(num, fU(objArr)));
    }

    public static <T extends cqkp> cqnf<T> eI(@dzsi CharSequence charSequence) {
        return cqjv.j(cqfe.TEXT, charSequence);
    }

    public static <T extends cqkp> cqnf<T> eJ(@dzsi cqsn cqsnVar) {
        return cqjv.j(cqfe.TEXT, cqsnVar);
    }

    public static <T extends cqkp> cqnf<T> eK(cqjb<T, ? extends CharSequence> cqjbVar) {
        return cqjv.d(cqfe.TEXT, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> eL(Integer num) {
        return cqjv.j(cqfe.TEXT, num);
    }

    public static <T extends cqkp> cqnf<T> eM(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TEXT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eN(Integer num) {
        return cqjv.j(cqfe.TEXT_ALIGNMENT, num);
    }

    public static <T extends cqkp> cqnf<T> eO(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.TEXT_ALIGNMENT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eP(@dzsi CharSequence charSequence) {
        return cqjv.j(cqfe.TEXT_AND_VISIBILITY, charSequence);
    }

    public static <T extends cqkp> cqnf<T> eQ(cqjb<T, ? extends CharSequence> cqjbVar) {
        return cqjv.d(cqfe.TEXT_AND_VISIBILITY, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> eR(cqlc<T, ? extends CharSequence> cqlcVar) {
        return cqjv.f(cqfe.TEXT_AND_VISIBILITY, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eS(Integer num) {
        return cqjv.j(cqfe.TEXT_APPEARANCE, num);
    }

    public static <T extends cqkp> cqnf<T> eT(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.TEXT_APPEARANCE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eU(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.TEXT_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> eV(cqjb<T, cqss> cqjbVar) {
        return cqjv.d(cqfe.TEXT_COLOR, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> eW(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TEXT_COLOR, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eX(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.TEXT_COLOR_HINT, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> eY(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.TEXT_COLOR_LINK, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> eZ(Integer num) {
        return cqjv.j(cqfe.TEXT_DIRECTION, num);
    }

    public static <T extends cqkp> cqnf<T> ea(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.PROGRESS, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eb(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.PROGRESS_DRAWABLE, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> ec(cqlc<T, cqtd> cqlcVar) {
        return cqjv.f(cqfe.PROGRESS_DRAWABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ed(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.PROGRESS_VIEW_OFFSET_START, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ee(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.REFRESHING, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ef(Float f) {
        return cqjv.j(cqfe.ROTATION, f);
    }

    public static <T extends cqkp> cqnf<T> eg(cqlc<T, Float> cqlcVar) {
        return cqjv.f(cqfe.ROTATION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eh(Boolean bool) {
        return cqjv.j(cqfe.SAVE_ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> ei(ImageView.ScaleType scaleType) {
        return cqjv.j(cqfe.SCALE_TYPE, scaleType);
    }

    public static <T extends cqkp> cqnf<T> ej(cqlc<T, ImageView.ScaleType> cqlcVar) {
        return cqjv.f(cqfe.SCALE_TYPE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ek(Float f) {
        return cqjv.j(cqfe.SCALE_X, f);
    }

    public static <T extends cqkp> cqnf<T> el(Float f) {
        return cqjv.j(cqfe.SCALE_Y, f);
    }

    public static <T extends cqkp> cqnf<T> em(cqlc<T, Float> cqlcVar) {
        return cqjv.f(cqfe.SCALE_Y, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> en(Boolean bool) {
        return cqjv.j(cqfe.SCREEN_READER_FOCUSABLE, bool);
    }

    public static <T extends cqkp> cqnf<T> eo(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.SCREEN_READER_FOCUSABLE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ep(Boolean bool) {
        return cqjv.j(cqfe.SCROLLBARS, bool);
    }

    public static <T extends cqkp> cqnf<T> eq(Integer num) {
        return cqjv.j(cqfe.SCROLL_BAR_STYLE, num);
    }

    public static <T extends cqkp> cqnf<T> er(Boolean bool) {
        return cqjv.j(cqfe.SELECTED, bool);
    }

    public static <T extends cqkp> cqnf<T> es(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.SELECTED, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> et(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.SELECTION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> eu(cqss cqssVar) {
        return cqjv.j(cqfe.SHADOW_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> ev(cqtv cqtvVar) {
        return cqjv.j(cqfe.SHADOW_DX, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> ew(Float f) {
        return cqjv.j(cqfe.SHADOW_DY, f);
    }

    public static <T extends cqkp> cqnf<T> ex(Float f) {
        return cqjv.j(cqfe.SHADOW_RADIUS, f);
    }

    public static <T extends cqkp> cqnf<T> ey(cqtv cqtvVar) {
        return cqjv.j(cqfe.SHADOW_RADIUS, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> ez(Integer num) {
        return cqjv.j(cqfe.SHOW_DIVIDERS, num);
    }

    public static <T extends cqkp> cqnf<T> f(cqjg cqjgVar) {
        return cqjv.j(cqfe.ACCESSIBILITY_TRAVERSAL_BEFORE, cqjgVar);
    }

    public static <T extends cqkp> cqnf<T> fA(Integer num) {
        return cqjv.j(cqfe.VIEW_PAGER_OFFSCREEN_PAGE_LIMIT, num);
    }

    public static <T extends cqkp> cqnf<T> fB(cqtc cqtcVar) {
        return cqjv.j(cqfe.VIEW_PAGER_PAGE_MARGIN, cqtcVar);
    }

    public static <T extends cqkp> cqnf<T> fC(@dzsi bbc bbcVar) {
        return cqjv.j(cqfe.VIEW_PAGER_PAGE_TRANSFORMER, bbcVar);
    }

    public static <T extends cqkp> cqnf<T> fD(@dzsi cqfc cqfcVar) {
        return cqjv.j(cqfe.ON_PRE_DRAW_APPLY_CALLBACK, cqfcVar);
    }

    public static <T extends cqkp> cqnf<T> fE(cqjb<T, cqfc> cqjbVar) {
        return cqjv.d(cqfe.ON_PRE_DRAW_APPLY_CALLBACK, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> fF(cqlc<T, cqfc> cqlcVar) {
        return cqjv.f(cqfe.ON_PRE_DRAW_APPLY_CALLBACK, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fG(@dzsi cqfd cqfdVar) {
        return cqjv.j(cqfe.ON_PRE_DRAW_CALLBACK, cqfdVar);
    }

    public static <T extends cqkp> cqnf<T> fH(cqlc<T, cqfd> cqlcVar) {
        return cqjv.f(cqfe.ON_PRE_DRAW_CALLBACK, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fI(Integer num) {
        return cqjv.j(cqfe.VISIBILITY, num);
    }

    public static <T extends cqkp> cqnf<T> fJ(cqjb<T, Integer> cqjbVar) {
        return cqjv.d(cqfe.VISIBILITY, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> fK(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.VISIBILITY, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fL(Float f) {
        return cqjv.j(cqfe.WEIGHT_SUM, f);
    }

    public static <T extends cqkp> cqnf<T> fM(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.WRAP_SELECTOR_WHEEL, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fN(cqjb<T, StateListAnimator> cqjbVar) {
        return cqjv.d(cqfe.STATE_LIST_ANIMATOR, cqjbVar);
    }

    @SafeVarargs
    public static <P extends cqkp, C extends cqkp> cqmm<P, C> fO(cqiw<C> cqiwVar, final C c, cqmp<P>... cqmpVarArr) {
        return new cqmm<>(cqiwVar, new cqjb(c) { // from class: cqfr
            private final cqkp a;

            {
                this.a = c;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (cqkp) cqjv.a(this.a, cqkpVar, context);
            }
        }, cqmpVarArr);
    }

    @SafeVarargs
    public static <P extends cqkp, C extends cqkp> cqmm<P, C> fP(cqiw<C> cqiwVar, final cqlc<P, C> cqlcVar, cqmp<P>... cqmpVarArr) {
        return new cqmm<>(cqiwVar, new cqjb(cqlcVar) { // from class: cqfs
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (cqkp) this.a.a(cqkpVar);
            }
        }, cqmpVarArr);
    }

    @SafeVarargs
    public static <P extends cqkp, C extends cqkp> cqmm<P, C> fQ(cqiw<C> cqiwVar, @dzsi C c, cqmp<P>... cqmpVarArr) {
        cqmm<P, C> cqmmVar = new cqmm<>(cqiwVar, cqne.b(c), cqmpVarArr);
        cqmmVar.b(aD(cqjv.v(c)));
        return cqmmVar;
    }

    @SafeVarargs
    public static <P extends cqkp, C extends cqkp> cqmm<P, C> fR(cqiw<C> cqiwVar, final cqlc<P, C> cqlcVar, cqmp<P>... cqmpVarArr) {
        cqmm<P, C> cqmmVar = new cqmm<>(cqiwVar, new cqjb(cqlcVar) { // from class: cqft
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (cqkp) this.a.a(cqkpVar);
            }
        }, cqmpVarArr);
        cqmmVar.b(aF(cqjv.x(cqlcVar)));
        return cqmmVar;
    }

    @SafeVarargs
    public static <P extends cqkp, C extends cqkp> cqmj<P> fS(cqiw<C> cqiwVar, final cqlc<P, C> cqlcVar, cqmp<P>... cqmpVarArr) {
        return fY(new cqmm(cqiwVar, new cqjb(cqlcVar) { // from class: cqfu
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return (cqkp) this.a.a(cqkpVar);
            }
        }, cqmpVarArr), cqic.c(cqjv.x(cqlcVar), new cqmp[0]));
    }

    public static <V extends cqkp> cqix<V> fT(cqiw<V> cqiwVar, V v) {
        return cqix.d(cqiwVar, v, true);
    }

    @Deprecated
    public static <V extends cqkp> cqip<V>[] fU(Object[] objArr) {
        cqip<V>[] cqipVarArr = new cqip[1];
        for (int i = 0; i <= 0; i++) {
            cqipVarArr[i] = cqiq.g(objArr[i]);
        }
        return cqipVarArr;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> fV(cqmp<T>... cqmpVarArr) {
        return new cqmh(Button.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> fW(cqmp<T>... cqmpVarArr) {
        return new cqmh(CheckBox.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> fX(cqmp<T>... cqmpVarArr) {
        return new cqmh(EditText.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> fY(cqmp<T>... cqmpVarArr) {
        return new cqmh(FrameLayout.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> fZ(cqmp<T>... cqmpVarArr) {
        return new cqmh(GridLayout.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> fa(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.TEXT_DIRECTION, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fb(Boolean bool) {
        return cqjv.j(cqfe.TEXT_IS_SELECTABLE, bool);
    }

    public static <T extends cqkp> cqnf<T> fc(@dzsi cqsn cqsnVar) {
        return cqjv.j(cqfe.TEXT_OFF, cqsnVar);
    }

    public static <T extends cqkp> cqnf<T> fd(@dzsi cqsn cqsnVar) {
        return cqjv.j(cqfe.TEXT_ON, cqsnVar);
    }

    public static <T extends cqkp> cqnf<T> fe(cqvj cqvjVar) {
        return cqjv.j(cqfe.TEXT_TYPEFACE, cqvjVar);
    }

    public static <T extends cqkp> cqnf<T> ff(cqjb<T, cqvj> cqjbVar) {
        return cqjv.d(cqfe.TEXT_TYPEFACE, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> fg(cqlc<T, cqvj> cqlcVar) {
        return cqjv.f(cqfe.TEXT_TYPEFACE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fh(cqtv cqtvVar) {
        return cqjv.j(cqfe.TEXT_SIZE, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> fi(cqlc<T, cqtv> cqlcVar) {
        return cqjv.f(cqfe.TEXT_SIZE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fj(Integer num) {
        return cqjv.j(cqfe.TEXT_STYLE, num);
    }

    public static <T extends cqkp> cqnf<T> fk(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.TEXT_STYLE, cqlcVar);
    }

    public static <T extends cqkp> cqnk<T> fl(int i) {
        return new cqnk<>(i);
    }

    public static <T extends cqkp> cqnf<T> fm(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.TINT, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> fn(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TINT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fo(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.TINT_TRANSPARENT, cqssVar);
    }

    public static <T extends cqkp> cqnf<T> fp(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TINT_TRANSPARENT, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fq(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TRANSLATION_X, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fr(cqtv cqtvVar) {
        return cqjv.j(cqfe.TRANSLATION_Y, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> fs(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.TRANSLATION_Y, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> ft(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.VALUE, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> fu(Boolean bool) {
        return cqjv.j(cqfe.VERTICAL_SCROLL_BAR_ENABLED, bool);
    }

    public static <T extends cqkp> cqnf<T> fv(cqjb<T, gt> cqjbVar) {
        return cqjv.d(cqfe.FRAGMENT_PAGER_ADAPTER, cqjbVar);
    }

    public static <T extends cqkp, U extends cqkp> cqnf<T> fw(cqiw<U> cqiwVar) {
        return cqjv.j(cqfe.VIEW_PAGER_ADAPTER, cqiwVar);
    }

    public static <T extends cqkp> cqnf<T> fx(cqlc<T, Integer> cqlcVar) {
        return cqjv.f(cqfe.VIEW_PAGER_CURRENT_ITEM_INDEX, cqlcVar);
    }

    public static <T extends cqkp, U extends cqkp> cqnf<T> fy(cqlc<T, List<U>> cqlcVar) {
        return cqjv.f(cqfe.VIEW_PAGER_ITEMS, cqlcVar);
    }

    public static <T extends cqkp, U extends cqkp> cqnf<T> fz(cqjb<T, List<U>> cqjbVar) {
        return cqjv.d(cqfe.VIEW_PAGER_ITEMS, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> g(cqlc<T, Adapter> cqlcVar) {
        return cqjv.f(cqfe.ADAPTER, cqlcVar);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> ga(cqmp<T>... cqmpVarArr) {
        return new cqmh(HorizontalScrollView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gb(cqmp<T>... cqmpVarArr) {
        return new cqmh(ImageButton.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gc(cqmp<T>... cqmpVarArr) {
        return new cqmh(ImageView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gd(cqmp<T>... cqmpVarArr) {
        return new cqmh(LinearLayout.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> ge(cqmp<T>... cqmpVarArr) {
        return new cqmh(ListView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gf(cqmp<T>... cqmpVarArr) {
        return new cqmh(NumberPicker.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gg(cqmp<T>... cqmpVarArr) {
        return new cqmh(ProgressBar.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gh(cqmp<T>... cqmpVarArr) {
        return new cqmh(RadioButton.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gi(cqmp<T>... cqmpVarArr) {
        return new cqmh(RadioGroup.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gj(cqmp<T>... cqmpVarArr) {
        return new cqmh(RelativeLayout.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gk(cqmp<T>... cqmpVarArr) {
        return new cqmh(ScrollView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gl(cqmp<T>... cqmpVarArr) {
        return new cqmh(SeekBar.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gm(cqmp<T>... cqmpVarArr) {
        return new cqmh(Space.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gn(cqmp<T>... cqmpVarArr) {
        return new cqmh(Spinner.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> go(cqmp<T>... cqmpVarArr) {
        return new cqmh(TableLayout.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gp(cqmp<T>... cqmpVarArr) {
        return new cqmh(TableRow.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gq(cqmp<T>... cqmpVarArr) {
        return new cqmh(TextView.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gr(cqmp<T>... cqmpVarArr) {
        return new cqmh(TimePicker.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gs(cqmp<T>... cqmpVarArr) {
        return new cqmh(View.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gt(cqmp<T>... cqmpVarArr) {
        return new cqmh(ViewAnimator.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gu(cqmp<T>... cqmpVarArr) {
        return new cqmh(ViewPager.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gv(cqmp<T>... cqmpVarArr) {
        return new cqmh(ViewSwitcher.class, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> gw(cqmp<T>... cqmpVarArr) {
        return new cqmh(WebView.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> gx() {
        return cqjv.j(cqfe.ACCESSIBILITY_HEADING, true);
    }

    public static <T extends cqkp> cqnf<T> gy() {
        return cqjv.j(cqfe.TINT, null);
    }

    public static <T extends cqkp> cqnf<T> h(Boolean bool) {
        return cqjv.j(cqfe.ALIGN_WITH_PARENT_IF_MISSING, bool);
    }

    public static <T extends cqkp> cqnf<T> i(@dzsi Number number) {
        return cqjv.j(cqfe.ALPHA, number);
    }

    public static <T extends cqkp> cqnf<T> j(cqlc<T, Number> cqlcVar) {
        return cqjv.f(cqfe.ALPHA, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> k(Boolean bool) {
        return cqjv.j(cqfe.ADJUST_VIEW_BOUNDS, bool);
    }

    public static <T extends cqkp> cqnf<T> l(Boolean bool) {
        return cqjv.j(cqfe.ALL_CAPS, bool);
    }

    public static <T extends cqkp> cqnf<T> m(cqlc<T, Boolean> cqlcVar) {
        return cqjv.f(cqfe.ALL_CAPS, cqlcVar);
    }

    public static cqgq n() {
        return new cqgq();
    }

    public static <T extends cqkp> cqnf<T> o(Boolean bool) {
        return cqjv.j(cqfe.ANIMATE_FIRST_VIEW, bool);
    }

    public static <T extends cqkp> cqnf<T> p(Boolean bool) {
        return cqjv.j(cqfe.ANIMATE_LAYOUT_CHANGES, bool);
    }

    public static <T extends cqkp> cqlc<T, View.OnClickListener> q(final cqlc<T, cqkl> cqlcVar) {
        return new cqlc(cqlcVar) { // from class: cqfq
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(final cqkp cqkpVar) {
                final cqlc cqlcVar2 = this.a;
                return new View.OnClickListener(cqlcVar2, cqkpVar) { // from class: cqfx
                    private final cqlc a;
                    private final cqkp b;

                    {
                        this.a = cqlcVar2;
                        this.b = cqkpVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.a(this.b);
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    public static <T extends cqkp> cqlc<T, View.OnClickListener> r(final cqkn<T> cqknVar) {
        return new cqlc(cqknVar) { // from class: cqfy
            private final cqkn a;

            {
                this.a = cqknVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new View.OnClickListener(this.a, cqkpVar) { // from class: cqfw
                    private final cqkn a;
                    private final cqkp b;

                    {
                        this.a = r1;
                        this.b = cqkpVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.a(this.b, view);
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    public static <T extends cqkp> cqlc<T, View.OnLongClickListener> s(final cqlc<T, cqkl> cqlcVar) {
        return new cqlc(cqlcVar) { // from class: cqfz
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return new View.OnLongClickListener(this.a, cqkpVar) { // from class: cqfv
                    private final cqlc a;
                    private final cqkp b;

                    {
                        this.a = r1;
                        this.b = cqkpVar;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        cqkl cqklVar = (cqkl) this.a.a(this.b);
                        return true;
                    }
                };
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    public static <T extends cqkp> cqnf<T> t(Boolean bool) {
        return cqjv.j(cqfe.AUTO_FOCUS, bool);
    }

    public static <T extends cqkp> cqnf<T> u(Integer num) {
        return cqjv.j(cqfe.AUTO_LINK, num);
    }

    public static <T extends cqkp> cqnf<T> v(@dzsi Integer num) {
        return cqjv.j(cqfe.BACKGROUND, num);
    }

    public static <T extends cqkp> cqnf<T> w(cqjb<T, cqtd> cqjbVar) {
        return cqjv.d(cqfe.BACKGROUND, cqjbVar);
    }

    public static <T extends cqkp> cqnf<T> x(@dzsi cqtd cqtdVar) {
        return cqjv.j(cqfe.BACKGROUND, cqtdVar);
    }

    public static <T extends cqkp> cqnf<T> y(cqlc<T, ?> cqlcVar) {
        return cqjv.f(cqfe.BACKGROUND, cqlcVar);
    }

    public static <T extends cqkp> cqnf<T> z(@dzsi cqss cqssVar) {
        return cqjv.j(cqfe.BACKGROUND_COLOR, cqssVar);
    }

    public static <T extends cqkp> cqmp<T> co(cqtv cqtvVar, boolean z) {
        return z ? cqmn.a(cm(cqtvVar), dB(cqtvVar)) : cm(cqtvVar);
    }
}
