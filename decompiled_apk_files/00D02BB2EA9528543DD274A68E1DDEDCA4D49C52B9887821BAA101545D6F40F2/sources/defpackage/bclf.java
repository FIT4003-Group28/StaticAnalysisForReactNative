package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bclf  reason: default package */
/* loaded from: classes3.dex */
public final class bclf implements bcle {
    private static final dcqe d = dcqe.c("bclf");
    private final Activity e;
    private final bckv f;
    @dzsi
    public final Toast b = d(R.string.FAILED_TO_FETCH_PHOTOS);
    @dzsi
    public final Toast c = d(R.string.NET_FAIL_TITLE);
    public dbsg<Integer> a = dbpy.a;

    public bclf(Activity activity, bckv bckvVar) {
        this.e = activity;
        this.f = bckvVar;
    }

    public static void c(@dzsi Toast toast) {
        if (toast == null || toast.getView().getWindowVisibility() == 0) {
            return;
        }
        toast.show();
    }

    @dzsi
    private final Toast d(int i) {
        Activity activity = this.e;
        if (activity != null) {
            return Toast.makeText(activity, activity.getString(i), 0);
        }
        return null;
    }

    @Override // defpackage.bcle
    public final void a(View view, int i) {
        if (!(view instanceof ckqg) || this.f.b()) {
            this.f.i(i, null);
            return;
        }
        this.f.i(i, ((ckqg) view).w());
    }

    @Override // defpackage.bcle
    public final void b(RecyclerView recyclerView) {
        if (this.a.a() && recyclerView.equals(this.f.g())) {
            int intValue = this.a.b().intValue();
            this.a = dbpy.a;
            if (this.f.c()) {
                recyclerView.n(this.f.h().t(intValue));
                return;
            }
            int s = this.f.h().s(intValue);
            abs absVar = recyclerView.l;
            if (!(absVar instanceof bcft)) {
                bvoo.h("Unhandled layout manager type; abandoning scroll to photo.", new Object[0]);
                return;
            }
            bcft bcftVar = (bcft) absVar;
            double d2 = bcftVar.E;
            Double.isNaN(d2);
            bcftVar.P(s + 1, (int) (d2 * 0.1d));
        }
    }
}
