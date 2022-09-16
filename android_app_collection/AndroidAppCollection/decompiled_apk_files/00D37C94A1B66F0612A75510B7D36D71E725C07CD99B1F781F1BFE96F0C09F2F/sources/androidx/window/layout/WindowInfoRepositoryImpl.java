package androidx.window.layout;

import android.app.Activity;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class WindowInfoRepositoryImpl implements WindowInfoRepository {
    private static final int BUFFER_CAPACITY = 10;
    public static final Companion Companion = new Companion(null);
    private final Activity activity;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(azsr azsrVar) {
            this();
        }
    }

    public WindowInfoRepositoryImpl(Activity activity, WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend) {
        activity.getClass();
        windowMetricsCalculator.getClass();
        windowBackend.getClass();
        this.activity = activity;
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    private final azxe configurationChanged(azrr azrrVar) {
        return azxy.c(new WindowInfoRepositoryImpl$configurationChanged$1(this, azrrVar, null));
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azxe getCurrentWindowMetrics() {
        return configurationChanged(new WindowInfoRepositoryImpl$currentWindowMetrics$1(this));
    }

    @Override // androidx.window.layout.WindowInfoRepository
    public azxe getWindowLayoutInfo() {
        return azxy.c(new WindowInfoRepositoryImpl$windowLayoutInfo$1(this, null));
    }
}
