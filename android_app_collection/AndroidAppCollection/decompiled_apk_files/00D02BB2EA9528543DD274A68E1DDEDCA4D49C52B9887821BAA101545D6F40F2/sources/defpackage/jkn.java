package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: jkn  reason: default package */
/* loaded from: classes7.dex */
public final class jkn extends axb {
    public static final cqjg n = cqjg.a();

    public jkn(Context context) {
        this(context, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> m(cqmp<T>... cqmpVarArr) {
        return new cqmh(jkn.class, cqmpVarArr);
    }

    @Override // defpackage.axb
    public final boolean j() {
        ArrayList<View> a = dchl.a();
        cqkx.f(this, n, a);
        if (a.isEmpty()) {
            return false;
        }
        for (View view : a) {
            if ((view instanceof jkm) && view.getVisibility() == 0 && !((jkm) view).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.axb, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return false;
    }

    public jkn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setProgressBackgroundColorSchemeResource(R.color.mod_daynight_white);
        super.setColorSchemeResources(R.color.qu_daynight_google_blue_500, R.color.qu_daynight_google_red_500, R.color.qu_daynight_google_yellow_500, R.color.qu_daynight_google_green_500);
    }
}
