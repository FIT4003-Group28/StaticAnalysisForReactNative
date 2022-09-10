package defpackage;

import android.animation.LayoutTransition;
import android.content.res.ColorStateList;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.view.View;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: cqlg  reason: default package */
/* loaded from: classes.dex */
public final class cqlg {
    public static final cqlg a = new cqlg();

    @dzsi
    public static final void u(View view, @dzsi Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(view.getDrawableState());
        drawable.jumpToCurrentState();
    }

    @dzsi
    public static final View.OnClickListener y(View view, @dzsi cqnx<cqkp, Object> cqnxVar) {
        if (cqnxVar == null) {
            return null;
        }
        return new cqlf(view, cqnxVar);
    }

    public final CharSequence a(View view, cqsn cqsnVar) {
        return cqsnVar.a(view.getContext());
    }

    public final CharSequence b(View view, int i) {
        return view.getResources().getText(i);
    }

    public final Drawable c(View view, cqtd cqtdVar) {
        Drawable a2 = cqtdVar.a(view.getContext());
        u(view, a2);
        dbsk.s(a2);
        return a2;
    }

    public final Drawable d(View view, Picture picture) {
        PictureDrawable pictureDrawable = new PictureDrawable(picture);
        u(view, pictureDrawable);
        return pictureDrawable;
    }

    @dzsi
    public final Drawable e(View view, int i) {
        if (i == 0) {
            return null;
        }
        Drawable drawable = view.getResources().getDrawable(i);
        u(view, drawable);
        dbsk.s(drawable);
        return drawable;
    }

    public final int f(View view, cqss cqssVar) {
        return cqssVar.b(view.getContext());
    }

    public final ColorStateList g(View view, @dzsi cqss cqssVar) {
        if (cqssVar == null) {
            return ColorStateList.valueOf(0);
        }
        return cqssVar.c(view.getContext());
    }

    public final float h(View view, cqtv cqtvVar) {
        return cqtvVar.a(view.getContext());
    }

    public final int i(View view, cqtv cqtvVar) {
        return cqtvVar.NR(view.getContext());
    }

    public final int j(View view, cqtv cqtvVar) {
        return cqtvVar.e(view.getContext());
    }

    public final int k(View view, cqtv cqtvVar) {
        return j(view, cqtvVar);
    }

    public final Animation l(View view, cqrx cqrxVar) {
        return cqrxVar.a(view.getContext());
    }

    public final LayoutTransition m(View view, cquq cquqVar) {
        view.getContext();
        LayoutTransition a2 = cquqVar.a();
        dbsk.s(a2);
        return a2;
    }

    public final int n(Number number) {
        return number.intValue();
    }

    public final ColorStateList o(Number number) {
        return ColorStateList.valueOf(number.intValue());
    }

    public final float p(Number number) {
        return number.floatValue();
    }

    public final int q(Integer num) {
        return num.intValue();
    }

    public final int r(Integer num) {
        return num.intValue();
    }

    public final int s(cqva cqvaVar) {
        return cqvaVar.a();
    }

    public final int t(Integer num) {
        return num.intValue();
    }

    @dzsi
    public final void v(View view, @dzsi Drawable drawable) {
        u(view, drawable);
    }

    @dzsi
    public final void w(@dzsi Number number) {
        dbsk.m(number == null, "Previous converters should have matched.");
    }

    @dzsi
    public final void x(@dzsi Integer num) {
        dbsk.m(num == null, "Previous converters should have matched.");
    }
}
