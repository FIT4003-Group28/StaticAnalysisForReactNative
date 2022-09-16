package defpackage;

import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
/* compiled from: PG */
/* renamed from: zyf  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zyf implements Runnable {
    public final /* synthetic */ SegmentedControl a;
    public final /* synthetic */ SegmentedControlSegment b;
    private final /* synthetic */ int c;

    public /* synthetic */ zyf(SegmentedControl segmentedControl, SegmentedControlSegment segmentedControlSegment) {
        this.a = segmentedControl;
        this.b = segmentedControlSegment;
    }

    public /* synthetic */ zyf(SegmentedControl segmentedControl, SegmentedControlSegment segmentedControlSegment, int i) {
        this.c = i;
        this.a = segmentedControl;
        this.b = segmentedControlSegment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.e(this.b, true, true);
            return;
        }
        SegmentedControl segmentedControl = this.a;
        SegmentedControlSegment segmentedControlSegment = this.b;
        if (segmentedControl.d != -1) {
            return;
        }
        segmentedControl.e(segmentedControlSegment, false, false);
    }
}
