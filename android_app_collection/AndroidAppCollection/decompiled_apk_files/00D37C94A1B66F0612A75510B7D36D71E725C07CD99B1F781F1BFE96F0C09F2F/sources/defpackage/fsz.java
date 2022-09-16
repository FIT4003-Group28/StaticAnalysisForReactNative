package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Supplier;
import java.util.List;
/* compiled from: PG */
/* renamed from: fsz  reason: default package */
/* loaded from: classes3.dex */
public class fsz {
    public ViewStub d;
    public boolean e;
    public View f;

    /* JADX INFO: Access modifiers changed from: protected */
    public fsz(View view) {
        this.e = false;
        view.getClass();
        this.f = view;
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Drawable b(final Context context) {
        return (Drawable) zhn.i(context, R.attr.standaloneBadgeBackground).orElseGet(new Supplier() { // from class: fsy
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                return akf.a(context, R.drawable.standalone_badge_background_light);
            }
        });
    }

    public static void d(Context context, ViewGroup viewGroup, apmg[] apmgVarArr) {
        if (apmgVarArr == null) {
            return;
        }
        viewGroup.removeAllViews();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.intra_badge_padding);
        for (apmg apmgVar : apmgVarArr) {
            if (apmgVar != null) {
                View view = null;
                if ((apmgVar.b & 1) != 0) {
                    view = View.inflate(context, R.layout.standalone_ypc_badge, null);
                    ftc ftcVar = new ftc(view, 1);
                    apmk apmkVar = apmgVar.c;
                    if (apmkVar == null) {
                        apmkVar = apmk.a;
                    }
                    ftcVar.a(apmkVar);
                }
                if (view != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(dimensionPixelSize);
                    viewGroup.addView(view, layoutParams);
                }
            }
        }
    }

    public static void e(Context context, ViewGroup viewGroup, List list) {
        d(context, viewGroup, (apmg[]) Optional.ofNullable(list).map(eoo.g).orElse(new apmg[0]));
    }

    public final View c() {
        View view;
        if (!this.e || (view = this.f) == null) {
            View view2 = (View) Optional.ofNullable(this.d).map(eoo.f).orElse(null);
            view2.getClass();
            this.f = view2;
            this.e = true;
            return view2;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public fsz(ViewStub viewStub) {
        this.e = false;
        viewStub.getClass();
        this.d = viewStub;
    }
}
