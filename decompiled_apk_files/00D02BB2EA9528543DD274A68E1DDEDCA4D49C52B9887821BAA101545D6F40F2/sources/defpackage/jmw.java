package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import com.google.android.apps.gmm.base.views.util.UiHelper$URLSpanNoUnderline;
import com.google.android.apps.maps.R;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: jmw  reason: default package */
/* loaded from: classes7.dex */
public final class jmw {
    public static boolean a(View view, float f, float f2) {
        if (view.getBackground() != null) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    float scrollX = ((view.getScrollX() + f) - childAt.getLeft()) - childAt.getTranslationX();
                    float scrollY = ((view.getScrollY() + f2) - childAt.getTop()) - childAt.getTranslationY();
                    if (scrollX >= 0.0f && scrollX <= childAt.getWidth() && scrollY >= 0.0f && scrollY <= childAt.getHeight() && a(childAt, scrollX, scrollY)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(Activity activity) {
        return activity.getResources().getConfiguration().hardKeyboardHidden != 2 || c(activity);
    }

    public static boolean c(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return Math.abs(((float) rect.bottom) - ((float) activity.getResources().getDisplayMetrics().heightPixels)) > activity.getResources().getDisplayMetrics().density * 100.0f;
    }

    public static void d(Activity activity, @dzsi Runnable runnable) {
        if (!c(activity)) {
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        new jmr(decorView, runnable);
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(decorView.getWindowToken(), 0);
    }

    public static ClickableSpan e(int i, cjqy cjqyVar, ddho ddhoVar, Runnable runnable) {
        return new jms(i, cjqyVar, ddhoVar, runnable);
    }

    public static void f(View view) {
        if (view instanceof ListView) {
            ((ListView) view).setSelection(0);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).l(0);
        } else if (view == null) {
        } else {
            view.scrollTo(0, 0);
        }
    }

    public static void g(Context context, int i, int i2) {
        new AlertDialog.Builder(context).setTitle(i).setMessage(i2).setPositiveButton(R.string.OK_BUTTON, new jmu()).create().show();
    }

    public static void h(Spannable spannable, String str, String str2) {
        Linkify.addLinks(spannable, Pattern.compile(str), (String) null, (Linkify.MatchFilter) null, new jmt(str2));
        i(spannable, 0);
    }

    public static void i(Spannable spannable, int i) {
        URLSpan[] uRLSpanArr;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new UiHelper$URLSpanNoUnderline(uRLSpan.getURL(), i), spanStart, spanEnd, 0);
        }
    }
}
