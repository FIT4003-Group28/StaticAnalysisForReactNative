package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: hqs  reason: default package */
/* loaded from: classes3.dex */
public final class hqs {
    public static void a(View view) {
        b(view, null);
    }

    public static void b(View view, final Runnable runnable) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: hqq
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                int i = paddingLeft;
                int i2 = paddingTop;
                int i3 = paddingRight;
                int i4 = paddingBottom;
                Runnable runnable2 = runnable;
                view2.setPadding(i, i2 + windowInsets.getSystemWindowInsetTop(), i3, i4);
                windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getStableInsetBottom());
                if (runnable2 != null) {
                    runnable2.run();
                }
                return windowInsets;
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new hqr());
        }
    }

    public static void c(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    public static boolean d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void e(View view, long j) {
        zag.o(view, true);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setDuration(125L).setStartDelay(j);
    }

    public static void f(View view) {
        e(view, 0L);
    }

    public static View g(Context context, int i, int i2, float f, List list) {
        Point point;
        aqxo.y(list.size() == 9);
        float[] A = almu.A(list);
        Matrix matrix = new Matrix();
        matrix.setValues(A);
        Matrix matrix2 = new Matrix();
        Matrix matrix3 = new Matrix();
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            point = new Point(i, (int) (f2 / f));
        } else {
            point = new Point((int) (f * f3), i2);
        }
        matrix2.setScale(point.x, point.y);
        matrix3.setTranslate((f2 - point.x) / 2.0f, (f3 - point.y) / 2.0f);
        matrix.postConcat(matrix2);
        matrix.postConcat(matrix3);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        View view = new View(context);
        view.setTranslationX(fArr[2]);
        view.setTranslationY(fArr[5]);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setRotation((float) (Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
        view.setLayoutParams(new FrameLayout.LayoutParams(Math.round((float) Math.hypot(fArr[0], fArr[3])), Math.round((float) Math.hypot(fArr[4], fArr[1]))));
        return view;
    }

    public static int h(aotk aotkVar) {
        return Color.argb((int) aotkVar.f, (int) aotkVar.c, (int) aotkVar.d, (int) aotkVar.e);
    }

    public static boolean i(dp dpVar) {
        if (dpVar.mJ() != null && !dpVar.mJ().isDestroyed() && !dpVar.mJ().isFinishing() && !dpVar.H && !dpVar.s && dpVar.ap()) {
            if (dpVar.ar()) {
                return true;
            }
            dt mJ = dpVar.mJ();
            if (Build.VERSION.SDK_INT >= 24 && mJ.isInMultiWindowMode()) {
                return true;
            }
        }
        return false;
    }

    public static void j(Context context, int i) {
        Toast makeText = Toast.makeText(context, i, 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    public static boolean k(RecyclerView recyclerView) {
        xw xwVar = recyclerView.n;
        if (xwVar != null && (xwVar instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) xwVar;
            int aq = linearLayoutManager.aq();
            if (linearLayoutManager.J() + aq >= linearLayoutManager.at()) {
                return true;
            }
        }
        return false;
    }

    public static avhe l(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                avhc avhcVar = (avhc) it.next();
                if ((avhcVar.b & 16384) != 0) {
                    avhe avheVar = avhcVar.k;
                    return avheVar == null ? avhe.a : avheVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void m(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            zag.m(textView, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n(android.widget.TextView r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.util.List r9, defpackage.avss r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L20
            java.util.Iterator r1 = r9.iterator()
        L7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            avhc r2 = (defpackage.avhc) r2
            int r3 = r2.b
            r3 = r3 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L7
            aplz r1 = r2.i
            if (r1 != 0) goto L21
            aplz r1 = defpackage.aplz.a
            goto L21
        L20:
            r1 = r0
        L21:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2f
            if (r1 != 0) goto L2d
            if (r10 == 0) goto L2f
        L2d:
            r10 = 1
            goto L30
        L2f:
            r10 = 0
        L30:
            if (r9 == 0) goto L4e
            java.util.Iterator r9 = r9.iterator()
        L36:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r9.next()
            avhc r2 = (defpackage.avhc) r2
            int r5 = r2.b
            r5 = r5 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L36
            apme r0 = r2.j
            if (r0 != 0) goto L4e
            apme r0 = defpackage.apme.a
        L4e:
            if (r6 != 0) goto L57
            if (r10 != 0) goto L56
            if (r0 == 0) goto L55
            goto L56
        L55:
            return r4
        L56:
            return r3
        L57:
            m(r6, r7)
            r9 = 2130970658(0x7f040822, float:1.7550032E38)
            if (r10 == 0) goto L83
            r7 = 2132018246(0x7f140446, float:1.9674793E38)
            r6.setText(r7)
            r6.setVisibility(r4)
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.zhn.d(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lca
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            if (r1 == 0) goto L7f
            r6.e()
            goto Lca
        L7f:
            r6.a()
            goto Lca
        L83:
            if (r0 == 0) goto Lad
            r7 = 2132018967(0x7f140717, float:1.9676256E38)
            r6.setText(r7)
            r6.setVisibility(r4)
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.zhn.d(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lca
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            int[] r7 = r6.c
            int[] r8 = com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView.a
            if (r7 == r8) goto Lca
            int[] r7 = com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView.a
            r6.c = r7
            r6.refreshDrawableState()
            goto Lca
        Lad:
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto Lca
            r6.setContentDescription(r8)
            android.content.Context r7 = r6.getContext()
            int r7 = defpackage.zhn.d(r7, r9)
            r6.setTextColor(r7)
            boolean r7 = r6 instanceof com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView
            if (r7 == 0) goto Lca
            com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView r6 = (com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView) r6
            r6.a()
        Lca:
            if (r10 != 0) goto Ld0
            if (r0 == 0) goto Lcf
            goto Ld0
        Lcf:
            return r4
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqs.n(android.widget.TextView, java.lang.CharSequence, java.lang.CharSequence, java.util.List, avss):boolean");
    }

    public static void o(TextView textView, avhe avheVar) {
        arag aragVar;
        textView.getClass();
        if (textView instanceof DurationBadgeView) {
            DurationBadgeView durationBadgeView = (DurationBadgeView) textView;
            int au = awwc.au(avheVar.e);
            if (au == 0) {
                au = 1;
            }
            int i = au - 1;
            if (i == 2) {
                durationBadgeView.e();
                textView.setTextColor(zhn.d(textView.getContext(), R.attr.ytStaticWhite));
            } else if (i != 5) {
                durationBadgeView.a();
                textView.setTextColor(zhn.d(textView.getContext(), R.attr.ytStaticWhite));
            } else {
                if (durationBadgeView.c != DurationBadgeView.b) {
                    durationBadgeView.c = DurationBadgeView.b;
                    durationBadgeView.refreshDrawableState();
                }
                textView.setTextColor(ake.d(textView.getContext(), R.color.yt_black1));
            }
        }
        arag aragVar2 = avheVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b = ajgl.b(aragVar2);
        if (!TextUtils.isEmpty(b)) {
            textView.setVisibility(0);
            textView.setText(b);
            if ((avheVar.b & 2) != 0) {
                aragVar = avheVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setContentDescription(ajgl.i(aragVar));
        }
        arhs arhsVar = avheVar.c;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b2 = arhr.b(arhsVar.c);
        if (b2 == null) {
            b2 = arhr.UNKNOWN;
        }
        if (b2 == arhr.LIVE) {
            Drawable drawable = textView.getContext().getResources().getDrawable(2131232832);
            drawable.setColorFilter(new PorterDuffColorFilter(ake.d(textView.getContext(), R.color.yt_white1), PorterDuff.Mode.SRC_IN));
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            int i2 = zew.i(textView.getContext().getResources().getDisplayMetrics(), 14);
            textView.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(textView.getContext().getResources(), Bitmap.createScaledBitmap(bitmap, i2, i2, false)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(textView.getPaddingLeft());
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static void p(TextView textView, CharSequence charSequence, CharSequence charSequence2, List list, avss avssVar) {
        avhe l = l(list);
        if (l == null) {
            n(textView, charSequence, charSequence2, list, avssVar);
            return;
        }
        if (textView != null) {
            o(textView, l);
        }
        awwc.au(l.e);
        awwc.au(l.e);
    }

    public static boolean q(ajrs ajrsVar) {
        if (ajqx.a(ajrsVar).a > 1) {
            return true;
        }
        return ajrsVar.j("always_display_as_grid", false);
    }

    public static final fma r(ViewGroup viewGroup, Spinner spinner, int i, int i2, int i3) {
        viewGroup.getClass();
        spinner.getClass();
        return new fma(viewGroup, spinner, i, i2, i3);
    }
}
