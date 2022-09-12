package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjxu  reason: default package */
/* loaded from: classes.dex */
public final class cjxu {
    public static void a(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginStart() != i) {
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void b(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void c(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width != i) {
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public static boolean d(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static void e(ImageView imageView) {
        if (!bvox.a(imageView) || imageView.getDrawable() == null) {
            return;
        }
        imageView.setImageDrawable(new cqlv(imageView.getDrawable()));
    }

    public static boolean f(@dzsi View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void g(bvrb bvrbVar, Context context, CharSequence charSequence) {
        q(bvrbVar, context, charSequence, 1);
    }

    public static void h(Executor executor, Context context, CharSequence charSequence) {
        n(executor, context, charSequence, 1);
    }

    public static void i(Activity activity, CharSequence charSequence) {
        r(activity, charSequence, 1);
    }

    public static void j(Activity activity, bvrb bvrbVar, CharSequence charSequence) {
        q(bvrbVar, activity, charSequence, 0);
    }

    public static void k(bvrb bvrbVar, Context context, CharSequence charSequence) {
        q(bvrbVar, context, charSequence, 0);
    }

    public static void l(Executor executor, Context context, CharSequence charSequence) {
        n(executor, context, charSequence, 0);
    }

    public static void m(Activity activity, CharSequence charSequence) {
        r(activity, charSequence, 0);
    }

    public static void n(Executor executor, final Context context, final CharSequence charSequence, final int i) {
        executor.execute(new Runnable(context, charSequence, i) { // from class: cjxs
            private final Context a;
            private final CharSequence b;
            private final int c;

            {
                this.a = context;
                this.b = charSequence;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a, this.b, this.c).show();
            }
        });
    }

    public static void o(View view, boolean z) {
        p(view, true != z ? 8 : 0);
    }

    public static void p(@dzsi View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }

    private static void q(bvrb bvrbVar, Context context, CharSequence charSequence, int i) {
        n(bvrbVar.h(), context, charSequence, i);
    }

    private static void r(final Activity activity, final CharSequence charSequence, final int i) {
        activity.runOnUiThread(new Runnable(activity, charSequence, i) { // from class: cjxt
            private final Activity a;
            private final CharSequence b;
            private final int c;

            {
                this.a = activity;
                this.b = charSequence;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a, this.b, this.c).show();
            }
        });
    }
}
