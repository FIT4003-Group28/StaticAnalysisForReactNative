package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Function;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
/* compiled from: PG */
/* renamed from: mee  reason: default package */
/* loaded from: classes3.dex */
public final class mee implements zdx {
    public final View a;
    public final Optional b;
    public final aypg c;
    public final /* synthetic */ PivotBar d;
    private final mek e;
    private final CharSequence f;
    private final Optional g;
    private final mej h;

    public mee(PivotBar pivotBar, int i, ViewGroup viewGroup, Drawable drawable, final CharSequence charSequence, Map map, Optional optional) {
        this.d = pivotBar;
        View inflate = LayoutInflater.from(pivotBar.getContext()).inflate(i, viewGroup, false);
        this.a = inflate;
        final mek mekVar = new mek(pivotBar, (ImageView) inflate.findViewById(R.id.image), drawable);
        this.e = mekVar;
        this.f = charSequence;
        this.g = Optional.ofNullable((TextView) inflate.findViewById(R.id.text)).map(new Function() { // from class: med
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                mee meeVar = mee.this;
                CharSequence charSequence2 = charSequence;
                return new mel(meeVar.d, (TextView) obj, charSequence2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
        this.b = optional;
        View findViewById = inflate.findViewById(R.id.progress_indicator_stub);
        if (optional.isPresent() && findViewById != null) {
            View a = ((mdx) optional.get()).a();
            ViewGroup viewGroup2 = (ViewGroup) findViewById.getParent();
            viewGroup2.addView(a, viewGroup2.indexOfChild(findViewById), findViewById.getLayoutParams());
            viewGroup2.removeView(findViewById);
        }
        final mej mejVar = new mej(pivotBar, zap.b((ViewStub) inflate.findViewById(R.id.new_content_dot), View.class), zap.b((ViewStub) inflate.findViewById(R.id.new_content_count), TextView.class), map);
        this.h = mejVar;
        ayoi o = ayoi.o(ayoi.T(charSequence), mejVar.a.V(new ayqe() { // from class: mei
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                final mej mejVar2 = mej.this;
                return ((Optional) obj).map(new Function() { // from class: mef
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return function.getClass();
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj2) {
                        mej mejVar3 = mej.this;
                        Integer num = (Integer) obj2;
                        if (num.intValue() > 0) {
                            return mejVar3.a(num.intValue());
                        }
                        return mejVar3.b();
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return function.getClass();
                    }
                });
            }
        }), ((aynx) optional.map(jsa.t).orElse(aynx.B(Optional.empty()))).W(), new ayqc() { // from class: meb
            @Override // defpackage.ayqc
            public final Object a(Object obj, Object obj2, Object obj3) {
                return mee.this.a((CharSequence) obj, (Optional) obj2, (Optional) obj3);
            }
        });
        inflate.getClass();
        this.c = new aypf(o.as(new lwf(inflate, 3)), ((aynx) optional.map(jsa.u).orElse(aynx.B(false))).C(lyd.f).Z(new ayqb() { // from class: mea
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                mek.this.a.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
            }
        }), banl.n(new aypv() { // from class: mdz
            @Override // defpackage.aypv
            public final void a() {
                mej.this.b.qr();
            }
        }), (aypg) optional.map(jsa.s).orElse(banl.m()));
    }

    public final CharSequence a(CharSequence charSequence, Optional optional, Optional optional2) {
        Object[] array = ((List) ayoi.U(optional, optional2).I(kth.h).V(lyd.g).ad(charSequence).aq().U()).toArray();
        int length = array.length;
        if (length == 1) {
            return charSequence;
        }
        try {
            return this.d.a.getString(length == 2 ? R.string.tab_name_with_extra_info : R.string.tab_name_with_two_extra_infos, array);
        } catch (MissingFormatArgumentException unused) {
            return charSequence;
        }
    }

    public final void b(boolean z, int i) {
        this.h.a.c(z ? Optional.of(Integer.valueOf(i)) : Optional.empty());
    }

    public final void c(final TypedArray typedArray) {
        mej mejVar = this.h;
        if (mejVar.c.c() && mejVar.c.a().getBackground() != null) {
            int[] iArr = met.a;
            int i = typedArray.hasValue(3) ? typedArray.getInt(3, 0) : -1;
            String b = gfs.LIGHT.b();
            String b2 = gfs.DARK.b();
            if (i == -1 || !mejVar.e.containsKey(b) || !mejVar.e.containsKey(b2)) {
                if (typedArray.hasValue(2)) {
                    mejVar.c.a().setBackground(typedArray.getDrawable(2));
                }
            } else {
                if (i != 0) {
                    b = b2;
                }
                int intValue = ((Integer) mejVar.e.get(b)).intValue();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(intValue);
                gradientDrawable.setStroke(mejVar.f.getResources().getDimensionPixelSize(R.dimen.new_content_badge_stroke_width), typedArray.getColor(4, 0));
                mejVar.c.a().setBackground(gradientDrawable);
            }
        }
        if (mejVar.d.c()) {
            int[] iArr2 = met.a;
            if (typedArray.hasValue(1)) {
                ((TextView) mejVar.d.a()).setBackground(typedArray.getDrawable(1));
            }
        }
        mek mekVar = this.e;
        int[] iArr3 = met.a;
        if (typedArray.hasValue(8) && typedArray.hasValue(9)) {
            ImageView imageView = mekVar.a;
            PivotBar pivotBar = mekVar.c;
            imageView.setImageDrawable(pivotBar.b.c(mekVar.b, pivotBar.a(typedArray.getColor(8, 0), typedArray.getColor(9, 0))));
        }
        this.g.ifPresent(new Consumer() { // from class: mec
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                TypedArray typedArray2 = typedArray;
                mel melVar = (mel) obj;
                int[] iArr4 = met.a;
                if (!typedArray2.hasValue(8) || !typedArray2.hasValue(7)) {
                    return;
                }
                melVar.a.setTextColor(melVar.b.a(typedArray2.getColor(8, 0), typedArray2.getColor(7, 0)));
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        if (!typedArray.hasValue(9)) {
            return;
        }
        Drawable background = this.a.getBackground();
        if (!(background instanceof RippleDrawable)) {
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) background.mutate();
        int color = typedArray.getColor(9, 0);
        rippleDrawable.setColor(this.d.b.a(color, color, color, color, color, color).withAlpha(66));
        this.a.setBackground(rippleDrawable);
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }
}
