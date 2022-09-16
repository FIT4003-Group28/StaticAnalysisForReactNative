package androidx.window.layout;

import android.app.Activity;
/* compiled from: PG */
/* loaded from: classes.dex */
final class WindowInfoRepositoryImpl$currentWindowMetrics$1 extends azsu implements azrr {
    final /* synthetic */ WindowInfoRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryImpl$currentWindowMetrics$1(WindowInfoRepositoryImpl windowInfoRepositoryImpl) {
        super(0);
        this.this$0 = windowInfoRepositoryImpl;
    }

    @Override // defpackage.azrr
    /* renamed from: invoke */
    public final WindowMetrics mo26invoke() {
        WindowMetricsCalculator windowMetricsCalculator;
        Activity activity;
        windowMetricsCalculator = this.this$0.windowMetricsCalculator;
        activity = this.this$0.activity;
        return windowMetricsCalculator.computeCurrentWindowMetrics(activity);
    }
}
