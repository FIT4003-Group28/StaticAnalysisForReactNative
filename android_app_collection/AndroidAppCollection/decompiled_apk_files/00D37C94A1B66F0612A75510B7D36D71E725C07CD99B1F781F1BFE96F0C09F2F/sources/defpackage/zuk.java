package defpackage;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObservable;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: zuk  reason: default package */
/* loaded from: classes4.dex */
public final class zuk extends DataSetObservable {
    private String A;
    private View B;
    private String C;
    private ValueAnimator D;
    private ValueAnimator E;
    private final int F;
    public final float a;
    public final int b;
    public String c;
    public zua d;
    public final List e = new ArrayList();
    public final List f = new ArrayList();
    public String g;
    public HorizontalScrollView h;
    public znj i;
    public zse j;
    public boolean k;
    boolean l;
    public int m;
    public zuj n;
    public zwm o;
    private final Context p;
    private final float q;
    private final float r;
    private final int s;
    private final int t;
    private final int u;
    private final float v;
    private final int w;
    private final Map x;
    private final Map y;
    private final Map z;

    public zuk(Context context, int i) {
        context.getClass();
        this.p = context;
        this.F = i;
        this.x = new TreeMap();
        this.y = new TreeMap();
        this.z = new TreeMap();
        this.c = "NORMAL";
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.b = displayMetrics.widthPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_selected_alpha_value, typedValue, true);
        this.q = typedValue.getFloat();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.dimen.edit_filter_text_unselected_alpha_value, typedValue2, true);
        this.r = typedValue2.getFloat();
        if (i == R.layout.choose_filter_list_item_camera || i == R.layout.choose_filter_list_item_camera_preset || i == R.layout.choose_filter_list_item_shorts_camera_preset) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_selected_thumbnail_size);
            this.s = dimensionPixelSize;
            this.t = dimensionPixelSize;
            this.a = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_unselected_thumbnail_size) / dimensionPixelSize;
            this.u = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_first_last_item_margin);
            this.v = context.getResources().getDimensionPixelSize(R.dimen.camera_filter_preview_item_outline_width);
            if (i == R.layout.choose_filter_list_item_shorts_camera_preset) {
                this.w = zhn.j(context, R.attr.ytTextPrimary).orElse(0);
                return;
            } else {
                this.w = zhn.j(context, R.attr.ytOverlayTextPrimary).orElse(0);
                return;
            }
        }
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_selected_thumbnail_size);
        this.s = dimensionPixelSize2;
        this.t = dimensionPixelSize2;
        this.a = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_unselected_thumbnail_size) / dimensionPixelSize2;
        this.u = context.getResources().getDimensionPixelSize(R.dimen.edit_filter_preview_first_last_item_margin);
        this.v = 0.0f;
        this.w = 0;
    }

    private final void A(View view, TextureView textureView, View view2, String str, boolean z) {
        x(view, str);
        if (!akzj.f(str, this.C) || !z) {
            o(textureView, view2, this.a, 0.0f);
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.setDuration(225L);
        this.E.addUpdateListener(v(textureView, view2, true));
        this.E.start();
    }

    private final boolean B(String str) {
        return C() && t(str);
    }

    private final boolean C() {
        zse zseVar = this.j;
        if (zseVar != null) {
            return ((zsj) zseVar).f;
        }
        return true;
    }

    private final ValueAnimator.AnimatorUpdateListener v(final TextureView textureView, final View view, final boolean z) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: zuc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                zuk zukVar = zuk.this;
                boolean z2 = z;
                TextureView textureView2 = textureView;
                View view2 = view;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (z2) {
                    floatValue = 1.0f - floatValue;
                }
                float f = zukVar.a;
                zukVar.o(textureView2, view2, f + ((1.0f - f) * floatValue), floatValue);
            }
        };
    }

    private final void w() {
        if (!r() || this.B == null || !C()) {
            return;
        }
        this.B.setVisibility(true != u() ? 8 : 0);
    }

    private final void x(View view, String str) {
        int i = 0;
        if (!str.equals(((FilterMapTable$FilterDescriptor) this.e.get(0)).a)) {
            List list = this.e;
            if (!str.equals(((FilterMapTable$FilterDescriptor) list.get(list.size() - 1)).a)) {
                return;
            }
        }
        zfx[] zfxVarArr = new zfx[2];
        zfxVarArr[0] = zgd.i(str.equals(((FilterMapTable$FilterDescriptor) this.e.get(0)).a) ? this.u : 0);
        List list2 = this.e;
        if (str.equals(((FilterMapTable$FilterDescriptor) list2.get(list2.size() - 1)).a)) {
            i = this.u;
        }
        zfxVarArr[1] = zgd.o(i);
        zgd.t(view, zgd.b(zfxVarArr), ViewGroup.MarginLayoutParams.class);
    }

    private final void y(String str) {
        if (!r()) {
            this.A = str;
            return;
        }
        String str2 = null;
        this.A = null;
        str.getClass();
        View c = c(str);
        if (c != null && zdg.e(c.getContext())) {
            FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, str);
            if (a != null) {
                str2 = a.c(c.getContext());
            }
            if (str2 == null) {
                str2 = "";
            }
            zdg.c(c.getContext(), c, c.getContext().getString(true != str.equals(this.c) ? R.string.accessibility_filter_view_unselected : R.string.accessibility_filter_view_selected, str2));
        }
        m();
        notifyChanged();
    }

    private final void z(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setAlpha(this.q);
            } else {
                view.setAlpha(this.r);
            }
        }
    }

    final int a() {
        for (int i = 0; i < this.e.size(); i++) {
            if (((FilterMapTable$FilterDescriptor) this.e.get(i)).a.equals(this.c)) {
                return i;
            }
        }
        return 0;
    }

    public final TextureView b(String str) {
        return (TextureView) this.x.get(str);
    }

    public final View c(String str) {
        return (View) this.z.get(str);
    }

    public final ankt d() {
        znj znjVar = this.i;
        if (znjVar != null) {
            final znx znxVar = (znx) znjVar;
            return anii.h(znxVar.d(), new ampg() { // from class: zns
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    znx znxVar2 = znx.this;
                    Map map = (Map) obj;
                    int i = 0;
                    if (map == null) {
                        zep.b("Unexpected null map");
                        return 0;
                    }
                    for (final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : znxVar2.a) {
                        if (!map.containsKey(znx.e(filterMapTable$FilterDescriptor.a))) {
                            znxVar2.b.b(new ampg() { // from class: znt
                                @Override // defpackage.ampg
                                public final Object apply(Object obj2) {
                                    FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor2 = FilterMapTable$FilterDescriptor.this;
                                    aopa mo52toBuilder = ((awti) obj2).mo52toBuilder();
                                    mo52toBuilder.bb(znx.e(filterMapTable$FilterDescriptor2.a), 1);
                                    return (awti) mo52toBuilder.mo39build();
                                }
                            }, anjk.a);
                            i++;
                            filterMapTable$FilterDescriptor.d = new znl(1);
                        }
                    }
                    return Integer.valueOf(i);
                }
            }, anjk.a);
        } else if (this.j != null) {
            HashMap hashMap = new HashMap();
            for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : this.e) {
                if (!filterMapTable$FilterDescriptor.g()) {
                    hashMap.put(filterMapTable$FilterDescriptor.a, 1);
                }
            }
            this.j.d(hashMap);
            return anlz.q(Integer.valueOf(hashMap.size()));
        } else {
            zep.b("FilterList.setUnvisitedEffectsBrowsed failed");
            return anlz.q(0);
        }
    }

    public final String e(int i) {
        return ((FilterMapTable$FilterDescriptor) this.e.get(i)).a;
    }

    public final String f() {
        return ((FilterMapTable$FilterDescriptor) this.e.get(a())).c(this.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    public final void g(List list, ViewGroup viewGroup, final HorizontalScrollView horizontalScrollView, boolean z, boolean z2) {
        LayoutInflater layoutInflater;
        boolean z3;
        LayoutInflater layoutInflater2;
        this.p.getClass();
        aqxo.y(this.e.isEmpty());
        List list2 = this.e;
        list.getClass();
        list2.addAll(list);
        viewGroup.getClass();
        this.h = horizontalScrollView;
        Iterator it = list.iterator();
        ?? r5 = 0;
        int i = 0;
        LayoutInflater layoutInflater3 = (LayoutInflater) this.p.getSystemService("layout_inflater");
        while (it.hasNext()) {
            final FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor = (FilterMapTable$FilterDescriptor) it.next();
            View inflate = layoutInflater3.inflate(this.F, viewGroup, (boolean) r5);
            String c = filterMapTable$FilterDescriptor.c(layoutInflater3.getContext());
            if (c != null) {
                inflate.setContentDescription(c);
                TextView textView = (TextView) inflate.findViewById(R.id.filter_text);
                if (textView != null) {
                    textView.setText(c);
                }
            }
            inflate.setOnClickListener(new View.OnClickListener() { // from class: zud
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hdq hdqVar;
                    gyq gyqVar;
                    actj actjVar;
                    zuk zukVar = zuk.this;
                    String str = filterMapTable$FilterDescriptor.a;
                    zukVar.i(str);
                    if (str != null) {
                        zuj zujVar = zukVar.n;
                        if (zujVar != null && (gyqVar = (hdqVar = (hdq) zujVar).h) != null && (actjVar = hdqVar.i) != null) {
                            gyo a = gyqVar.a(actjVar);
                            aopa createBuilder = asjj.a.createBuilder();
                            aopa createBuilder2 = askf.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            askf askfVar = (askf) createBuilder2.instance;
                            askfVar.b |= 1;
                            askfVar.c = str;
                            createBuilder.copyOnWrite();
                            asjj asjjVar = (asjj) createBuilder.instance;
                            askf askfVar2 = (askf) createBuilder2.mo39build();
                            askfVar2.getClass();
                            asjjVar.g = askfVar2;
                            asjjVar.b |= 8;
                            a.a = (asjj) createBuilder.mo39build();
                            a.b();
                        }
                        zwm zwmVar = zukVar.o;
                        if (zwmVar != null) {
                            zwmVar.a(str);
                        }
                    }
                    zua zuaVar = zukVar.d;
                    if (zuaVar != null) {
                        zuaVar.g();
                    }
                }
            });
            inflate.measure(View.MeasureSpec.makeMeasureSpec(r5 == true ? 1 : 0, r5), View.MeasureSpec.makeMeasureSpec(r5, r5));
            i = Math.max(i, inflate.getMeasuredHeight());
            TextureView textureView = (TextureView) inflate.findViewById(R.id.filter_thumbnail);
            this.x.put(filterMapTable$FilterDescriptor.a, textureView);
            if (this.j != null) {
                View findViewById = inflate.findViewById(R.id.filter_thumbnail_background);
                zse zseVar = this.j;
                String str = filterMapTable$FilterDescriptor.a;
                zsp zspVar = new zsp(textureView, findViewById);
                if (str == null) {
                    layoutInflater = layoutInflater3;
                    String valueOf = String.valueOf(zspVar);
                    StringBuilder sb = new StringBuilder("null".length() + 31 + String.valueOf(valueOf).length());
                    sb.append("Unexpected requestThumbnail(null, ");
                    sb.append(valueOf);
                    sb.append(")");
                    zep.d(sb.toString(), new Exception());
                } else {
                    synchronized (((zsj) zseVar).d) {
                        zsp zspVar2 = (zsp) ((zsj) zseVar).d.get(str);
                        if (!akzj.f(zspVar2, zspVar)) {
                            if (zspVar2 != null) {
                                zspVar2.a.setSurfaceTextureListener(null);
                            }
                            ((zsj) zseVar).d.put(str, zspVar);
                            layoutInflater2 = layoutInflater3;
                            final zsj zsjVar = (zsj) zseVar;
                            zspVar.a.setSurfaceTextureListener(new zsr(str, ((zsj) zseVar).d, ((zsj) zseVar).e, new zdt() { // from class: zsf
                                @Override // defpackage.zdt
                                public final void a(Object obj) {
                                    zsj.this.i((String) obj);
                                }
                            }));
                        } else {
                            layoutInflater2 = layoutInflater3;
                        }
                        ((zsj) zseVar).i(str);
                    }
                    layoutInflater = layoutInflater2;
                }
            } else {
                layoutInflater = layoutInflater3;
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.new_content_dot);
            if (!z || filterMapTable$FilterDescriptor.i()) {
                z3 = false;
            } else {
                z3 = false;
                imageView.setVisibility(0);
            }
            if (z2) {
                View findViewById2 = inflate.findViewById(R.id.filter_thumbnail_spinner);
                int i2 = z3 ? 1 : 0;
                int i3 = z3 ? 1 : 0;
                int i4 = z3 ? 1 : 0;
                findViewById2.setVisibility(i2);
            }
            this.y.put(filterMapTable$FilterDescriptor.a, imageView);
            this.z.put(filterMapTable$FilterDescriptor.a, inflate);
            viewGroup.addView(inflate);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            ((ViewGroup) inflate).setLayoutTransition(layoutTransition);
            layoutInflater3 = layoutInflater;
            r5 = z3;
        }
        this.m = i;
        zgd.t(horizontalScrollView, zgd.h(i), ViewGroup.LayoutParams.class);
        p();
        zse zseVar2 = this.j;
        if (zseVar2 != null) {
            this.f.add(zseVar2.b(new zsd() { // from class: zuf
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    zno znoVar = (zno) obj;
                    horizontalScrollView.post(new zug(zuk.this));
                }
            }));
            if (!FilterMapTable$FilterDescriptor.h(this.c)) {
                this.j.c(this.c);
            }
            this.f.add(this.j.a(new zrm() { // from class: zue
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    zuk.this.n(((FilterMapTable$FilterDescriptor) obj).a);
                }
            }));
        }
        registerObserver(new zuh(this, horizontalScrollView));
        horizontalScrollView.post(new zug(this, 1));
        horizontalScrollView.postDelayed(new zug(this), 1000L);
    }

    public final void h(String str) {
        View c = c(str);
        if (c != null) {
            c.getViewTreeObserver().addOnGlobalLayoutListener(new zui(this, c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(String str) {
        String str2 = this.g;
        if (str2 == null) {
            str2 = "NORMAL";
        }
        if (true != B(str)) {
            str2 = str;
        }
        this.c = str2;
        y(str);
        zse zseVar = this.j;
        if (zseVar != null) {
            zseVar.c(this.c);
        }
        h(str);
        this.k = false;
    }

    public final void j() {
        int i;
        boolean s = s();
        int size = this.e.size();
        int a = a();
        if (s) {
            i = (a + 1) % size;
        } else {
            i = ((a + size) - 1) % size;
        }
        i(e(i));
        this.k = true;
    }

    public final void k() {
        int i;
        boolean s = s();
        int size = this.e.size();
        int a = a();
        if (s) {
            i = ((a + size) - 1) % size;
        } else {
            i = (a + 1) % size;
        }
        i(e(i));
        this.k = true;
    }

    public final void l(View view) {
        this.B = view;
        w();
    }

    public final void m() {
        FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, this.c);
        if (a == null) {
            String valueOf = String.valueOf(this.c);
            zep.c("FilterList", valueOf.length() != 0 ? "setSelectedEffectPreviewed Filter not found: ".concat(valueOf) : new String("setSelectedEffectPreviewed Filter not found: "));
        } else if (a.b || a.i()) {
        } else {
            znj znjVar = this.i;
            if (znjVar != null) {
                znjVar.a(this.c);
            } else {
                zse zseVar = this.j;
                if (zseVar != null) {
                    ((zsj) zseVar).d(amup.k(this.c, 2));
                } else {
                    String valueOf2 = String.valueOf(this.c);
                    zep.b(valueOf2.length() != 0 ? "FilterList.setSelectedEffectPreviewed failed to set effect previewed: ".concat(valueOf2) : new String("FilterList.setSelectedEffectPreviewed failed to set effect previewed: "));
                    return;
                }
            }
            ((ImageView) this.y.get(a.a)).setVisibility(8);
            View c = c(a.a);
            Context context = c.getContext();
            if (!zdg.e(context)) {
                return;
            }
            zdg.c(context, c, context.getString(R.string.a11y_new_effect_indicator));
        }
    }

    public final void n(String str) {
        if (!t(str)) {
            i(str);
        } else {
            notifyChanged();
        }
    }

    public final void o(TextureView textureView, View view, float f, float f2) {
        zgd.v((FrameLayout) textureView.getParent(), Math.round(this.t * f), Math.round(this.s * f));
        if (view != null) {
            int round = Math.round(this.v * f2);
            if (round > 0) {
                view.setVisibility(0);
                ((GradientDrawable) view.getBackground()).setStroke(round, this.w);
            } else {
                view.setVisibility(8);
            }
        }
        RectF rectF = new RectF(0.0f, 0.0f, this.t, this.s);
        float f3 = (1.0f - f) / 2.0f;
        float f4 = this.t;
        float f5 = this.s;
        float f6 = 1.0f - f3;
        RectF rectF2 = new RectF(f4 * f3, f3 * f5, f4 * f6, f5 * f6);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        textureView.setTransform(matrix);
        textureView.invalidate();
    }

    public final void p() {
        boolean h;
        for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : this.e) {
            String str = filterMapTable$FilterDescriptor.a;
            TextureView b = b(str);
            View c = c(str);
            View findViewById = c.findViewById(R.id.filter_thumbnail_border);
            View findViewById2 = c.findViewById(R.id.filter_text);
            String str2 = this.g;
            if (str2 != null) {
                h = str.equals(str2);
            } else {
                h = FilterMapTable$FilterDescriptor.h(str);
            }
            if (h) {
                A(c, b, findViewById, str, false);
                z(findViewById2, B(str));
            } else if (B(str)) {
                x(c, str);
                z(findViewById2, true);
                if (!akzj.f(this.C, str)) {
                    ValueAnimator valueAnimator = this.D;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.D = ofFloat;
                    ofFloat.setDuration(225L);
                    this.D.addUpdateListener(v(b, findViewById, false));
                    this.D.start();
                }
            } else {
                z(findViewById2, false);
                A(c, b, findViewById, str, true);
            }
        }
        this.C = C() ? this.c : null;
        String str3 = this.A;
        if (str3 != null) {
            y(str3);
        }
        w();
        m();
    }

    public final boolean q() {
        for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : this.e) {
            if (!filterMapTable$FilterDescriptor.g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return !this.e.isEmpty();
    }

    final boolean s() {
        return this.p.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public final boolean t(String str) {
        return FilterMapTable$FilterDescriptor.e(this.c, str);
    }

    public final boolean u() {
        if (!this.l) {
            for (FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor : this.e) {
                if (filterMapTable$FilterDescriptor.b) {
                    FilterMapTable$FilterDescriptor a = FilterMapTable$FilterDescriptor.a(this.e, this.c);
                    if (a != null) {
                        return a.b;
                    }
                    aqxo.y(false);
                    return false;
                }
            }
            this.l = true;
        }
        return false;
    }
}
