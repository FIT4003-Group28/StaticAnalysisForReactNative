package defpackage;

import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;
import com.google.android.libraries.elements.interfaces.PerformanceSpanBlocklist;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: thf  reason: default package */
/* loaded from: classes4.dex */
final class thf extends PerformanceMonitorAdapter {
    private final boolean a;

    public thf(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final long getCurrentThread() {
        thm thmVar = thm.b;
        return thl.a().b;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final EnumSet getPerformanceSpanBlocklist() {
        return EnumSet.noneOf(PerformanceSpanBlocklist.class);
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean isMainThread() {
        thm thmVar = thm.b;
        return thl.a().a;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean shouldRecordLogs() {
        return this.a;
    }
}
