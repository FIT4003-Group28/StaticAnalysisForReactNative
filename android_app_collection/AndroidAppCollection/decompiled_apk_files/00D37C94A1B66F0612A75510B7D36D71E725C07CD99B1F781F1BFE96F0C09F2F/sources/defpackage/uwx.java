package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;
import org.chromium.net.NetError;
/* compiled from: PG */
/* renamed from: uwx  reason: default package */
/* loaded from: classes4.dex */
public final class uwx implements Window.OnFrameMetricsAvailableListener {
    private final amqo a;
    private final ArrayMap b;

    public uwx(Context context, ArrayMap arrayMap) {
        this.a = aqxo.i(new nfd(context, 6));
        this.b = arrayMap;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        if (frameMetrics.getMetric(9) == 1) {
            return;
        }
        int metric = (int) (frameMetrics.getMetric(8) / 1000000);
        int intValue = ((Integer) this.a.get()).intValue();
        int metric2 = (int) (frameMetrics.getMetric(13) / 1000000);
        ArrayMap arrayMap = this.b;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            for (int i2 = 0; i2 < size; i2++) {
                uxb uxbVar = (uxb) arrayMap.valueAt(i2);
                if (metric < 0) {
                    ((amzw) ((amzw) uxb.a.d()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 78, "FrameTimeHistogram.java")).r("Invalid frame time: %d", metric);
                    uxbVar.k++;
                } else {
                    uxbVar.j++;
                    if (metric2 > 0) {
                        int i3 = metric - metric2;
                        if (uxbVar.p < i3) {
                            uxbVar.p = i3;
                        }
                        int[] iArr = uxbVar.g;
                        int i4 = i3 < 20 ? i3 >= -20 ? ((i3 + 20) >> 1) + 12 : i3 >= -30 ? ((i3 + 30) / 5) + 10 : i3 >= -100 ? ((i3 + 100) / 10) + 3 : i3 >= -200 ? ((i3 + 200) / 50) + 1 : 0 : i3 < 30 ? ((i3 - 20) / 5) + 32 : i3 < 100 ? ((i3 - 30) / 10) + 34 : i3 < 200 ? ((i3 - 50) / 100) + 41 : i3 < 1000 ? ((i3 + NetError.ERR_CERT_COMMON_NAME_INVALID) / 100) + 43 : 51;
                        iArr[i4] = iArr[i4] + 1;
                        if (metric > metric2) {
                            uxbVar.h++;
                            uxbVar.m += metric;
                        }
                        if (metric > intValue) {
                            uxbVar.i++;
                            uxbVar.n += metric;
                        }
                    } else if (metric > intValue) {
                        uxbVar.h++;
                        uxbVar.m += metric;
                    }
                    int[] iArr2 = uxbVar.f;
                    int i5 = metric <= 20 ? metric >= 8 ? (metric >> 1) - 2 : metric >> 2 : metric <= 30 ? (metric / 5) + 4 : metric <= 100 ? (metric / 10) + 7 : metric <= 200 ? (metric / 50) + 15 : metric <= 1000 ? (metric / 100) + 17 : 27;
                    iArr2[i5] = iArr2[i5] + 1;
                    uxbVar.k += i;
                    if (uxbVar.l < metric) {
                        uxbVar.l = metric;
                    }
                    uxbVar.o += metric;
                }
            }
        }
    }
}
