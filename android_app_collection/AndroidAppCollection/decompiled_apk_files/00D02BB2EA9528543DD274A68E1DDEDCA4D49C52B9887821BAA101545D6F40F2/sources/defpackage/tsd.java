package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tsd  reason: default package */
/* loaded from: classes7.dex */
public final class tsd {
    private static final cqrp d = cqrp.d(28.0d);
    public final Resources a;
    public final cqhu b;
    private final Activity e;
    private final cjmt f;
    private final btvo g;
    @dzsi
    private cqkf<?> h = null;
    @dzsi
    public cqkf<?> c = null;

    public tsd(Activity activity, cqhu cqhuVar, cjmt cjmtVar, btvo btvoVar) {
        this.e = activity;
        this.a = activity.getResources();
        this.b = cqhuVar;
        this.f = cjmtVar;
        this.g = btvoVar;
    }

    public static jkc d(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return jkc.i;
            }
            return jkc.d;
        }
        return jkc.q;
    }

    private final int i(@dzsi View view) {
        if (view != null) {
            boolean f = cjxu.f(view);
            cjxu.o(view, true);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.a.getDisplayMetrics().widthPixels, 1073741824), 0);
            cjxu.o(view, f);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(@dzsi cqkf<?> cqkfVar, @dzsi cqkf<?> cqkfVar2) {
        this.h = cqkfVar;
        this.c = cqkfVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<Integer> b(boolean z) {
        cqkf<?> cqkfVar = this.c;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        if (c == null) {
            return dbpy.a;
        }
        int g = g();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.getDisplayMetrics().widthPixels, 1073741824);
        ViewGroup viewGroup = (ViewGroup) c;
        if (!z) {
            viewGroup.measure(makeMeasureSpec, 0);
            viewGroup.layout(0, 0, this.a.getDisplayMetrics().widthPixels, g);
        }
        dcdc<View> e = cqhu.e(c, txb.a);
        if (viewGroup.getMeasuredHeight() <= g) {
            return dbsg.i(Integer.valueOf(e.size()));
        }
        int size = e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            View view = e.get(i2);
            view.measure(makeMeasureSpec, 0);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            if (rect.bottom > g) {
                break;
            }
            i++;
        }
        return dbsg.i(Integer.valueOf(i));
    }

    public final jjn c(boolean z) {
        int a = dkwn.a(this.g.getTwoDirectionPilotParameters().a);
        if (a != 0 && a == 3) {
            return jjn.FULLY_EXPANDED;
        }
        return z ? jjn.EXPANDED : jjn.FULLY_EXPANDED;
    }

    public final int e() {
        return f() + d.e(this.e) + this.f.h();
    }

    public final int f() {
        cqkf<?> cqkfVar = this.c;
        View view = null;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        View findViewById = c != null ? c.findViewById(R.id.query_options) : null;
        if (c != null) {
            view = c.findViewById(R.id.slider_grippy);
        }
        return i(findViewById) + i(view);
    }

    public final int g() {
        cqkf<?> cqkfVar = this.h;
        View c = cqkfVar != null ? cqkfVar.c() : null;
        int i = 0;
        if (c != null) {
            c.measure(View.MeasureSpec.makeMeasureSpec(this.a.getDisplayMetrics().widthPixels, 1073741824), 0);
            i = c.getMeasuredHeight();
        }
        return h() - i;
    }

    public final int h() {
        return (this.a.getDisplayMetrics().heightPixels - this.f.g()) - this.f.h();
    }
}
