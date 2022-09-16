package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: hzn  reason: default package */
/* loaded from: classes3.dex */
public final class hzn {
    public final dt a;
    public final hyt b;
    public final Context c;
    public ex d;
    public View e;
    public TextView f;
    public final int g;
    public final int h;
    public int i;
    public CharSequence j;
    public CoordinatorLayout k;
    public hzm l;

    public hzn(Context context, dt dtVar) {
        this.a = dtVar;
        this.c = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        dtVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.75d);
        this.g = i;
        this.h = displayMetrics.widthPixels;
        this.i = i;
        this.b = hyt.aG(i);
    }

    public final void a() {
        this.b.dismiss();
    }
}
