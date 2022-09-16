package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CancelTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gng  reason: default package */
/* loaded from: classes3.dex */
public final class gng implements aafl {
    public final aafo a;
    public final Map b = new HashMap();
    private final Handler c;

    public gng(Context context, aafo aafoVar) {
        this.a = aafoVar;
        this.c = new Handler(context.getMainLooper());
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Runnable runnable;
        if (apzgVar.qn(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint)) {
            TimeDelayedEndpoint$CreateTimeDelayedEndpoint timeDelayedEndpoint$CreateTimeDelayedEndpoint = (TimeDelayedEndpoint$CreateTimeDelayedEndpoint) apzgVar.qm(TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint);
            gnf gnfVar = new gnf(this, timeDelayedEndpoint$CreateTimeDelayedEndpoint, map, timeDelayedEndpoint$CreateTimeDelayedEndpoint.c);
            if ((timeDelayedEndpoint$CreateTimeDelayedEndpoint.b & 1) != 0) {
                this.b.put(timeDelayedEndpoint$CreateTimeDelayedEndpoint.c, gnfVar);
            }
            this.c.postDelayed(gnfVar, timeDelayedEndpoint$CreateTimeDelayedEndpoint.d);
        } else if (!apzgVar.qn(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint)) {
        } else {
            TimeDelayedEndpoint$CancelTimeDelayedEndpoint timeDelayedEndpoint$CancelTimeDelayedEndpoint = (TimeDelayedEndpoint$CancelTimeDelayedEndpoint) apzgVar.qm(TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint);
            if ((timeDelayedEndpoint$CancelTimeDelayedEndpoint.b & 1) == 0 || (runnable = (Runnable) this.b.remove(timeDelayedEndpoint$CancelTimeDelayedEndpoint.c)) == null) {
                return;
            }
            this.c.removeCallbacks(runnable);
        }
    }
}
