package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: mfm  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mfm implements azqb {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ mfm(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                int i2 = this.a;
                return new LinearLayout.LayoutParams(i2, i2);
            } else if (i == 2) {
                int i3 = this.a;
                return new FrameLayout.LayoutParams(i3, i3);
            } else if (i == 3) {
                return new FrameLayout.LayoutParams(this.a, -1);
            } else {
                return Integer.valueOf(this.a);
            }
        }
        return new FrameLayout.LayoutParams(-1, this.a);
    }
}
