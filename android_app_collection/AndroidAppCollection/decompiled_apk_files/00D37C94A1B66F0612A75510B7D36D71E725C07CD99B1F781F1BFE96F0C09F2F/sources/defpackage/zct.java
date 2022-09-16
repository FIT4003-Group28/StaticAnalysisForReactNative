package defpackage;

import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* compiled from: PG */
/* renamed from: zct  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zct implements zcx {
    public final /* synthetic */ SwipeLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ zct(SwipeLayout swipeLayout, int i) {
        this.b = i;
        this.a = swipeLayout;
    }

    @Override // defpackage.zcx
    public final Object a() {
        if (this.b == 0) {
            return Integer.valueOf(this.a.a());
        }
        return Integer.valueOf(-this.a.b());
    }
}
