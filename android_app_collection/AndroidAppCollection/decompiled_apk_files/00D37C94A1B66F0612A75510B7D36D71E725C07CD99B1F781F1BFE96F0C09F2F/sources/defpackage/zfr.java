package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: zfr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zfr implements azqb {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ zfr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public /* synthetic */ zfr(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.azqb
    public final Object get() {
        if (this.c == 0) {
            return new ViewGroup.LayoutParams(this.a, this.b);
        }
        return new FrameLayout.LayoutParams(this.a, this.b);
    }
}
