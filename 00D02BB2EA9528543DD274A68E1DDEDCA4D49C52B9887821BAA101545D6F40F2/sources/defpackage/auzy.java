package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: auzy  reason: default package */
/* loaded from: classes2.dex */
final class auzy implements Callable<Integer> {
    final /* synthetic */ avac a;

    public auzy(avac avacVar) {
        this.a = avacVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        View view = this.a.P;
        int[] iArr = {R.id.notification_opt_out_inner_container};
        char c = 0;
        while (true) {
            if (c > 0) {
                break;
            } else if (view == null) {
                view = null;
                break;
            } else {
                view = view.findViewById(iArr[0]);
                c = 1;
            }
        }
        if (view != null) {
            return Integer.valueOf(view.getHeight());
        }
        return 0;
    }
}
