package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: svp  reason: default package */
/* loaded from: classes7.dex */
final class svp {
    public final cqkf<tfp> a;
    public final Resources b;
    public final TripDetailsContext c;
    public final swy d;
    private final cqkf<tfq> e;
    private final cqkf<tfo> f;

    public svp(cqkf<tfp> cqkfVar, cqkf<tfq> cqkfVar2, cqkf<tfo> cqkfVar3, Resources resources, TripDetailsContext tripDetailsContext, swy swyVar) {
        this.a = cqkfVar;
        this.e = cqkfVar2;
        this.f = cqkfVar3;
        this.b = resources;
        this.c = tripDetailsContext;
        this.d = swyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.b.getConfiguration().orientation == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        View findViewById;
        View c = (a() ? this.f : this.e).c();
        if (c == null || (findViewById = c.findViewById(R.id.trip_details_footer_layout)) == null) {
            return 0;
        }
        findViewById.measure(View.MeasureSpec.makeMeasureSpec(this.b.getDisplayMetrics().widthPixels, 1073741824), 0);
        return findViewById.getMeasuredHeight();
    }
}
