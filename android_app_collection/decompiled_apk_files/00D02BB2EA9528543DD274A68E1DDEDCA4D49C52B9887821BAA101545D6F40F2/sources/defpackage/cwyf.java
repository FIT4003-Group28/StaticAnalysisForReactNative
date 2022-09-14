package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwyf  reason: default package */
/* loaded from: classes5.dex */
public final class cwyf implements Window.OnFrameMetricsAvailableListener {
    final /* synthetic */ cwyj a;

    public cwyf(cwyj cwyjVar) {
        this.a = cwyjVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        Map map;
        Map map2;
        dbty dbtyVar;
        int millis = (int) TimeUnit.NANOSECONDS.toMillis(frameMetrics.getMetric(8));
        map = this.a.d;
        synchronized (map) {
            map2 = this.a.d;
            for (cwyl cwylVar : map2.values()) {
                dbtyVar = this.a.e;
                int intValue = ((Integer) dbtyVar.a()).intValue();
                dbsk.a(millis >= 0);
                cwylVar.f++;
                if (millis > intValue) {
                    cwylVar.e++;
                    cwylVar.i += millis;
                }
                int[] iArr = cwylVar.d;
                int binarySearch = Arrays.binarySearch(cwyl.a, millis);
                if (binarySearch < 0) {
                    binarySearch = -(binarySearch + 2);
                }
                iArr[binarySearch] = iArr[binarySearch] + 1;
                cwylVar.g += i;
                cwylVar.h = Math.max(cwylVar.h, millis);
                cwylVar.j += millis;
            }
        }
    }
}
