package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: ftn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ftn implements amz {
    public final /* synthetic */ BottomUiContainer a;
    private final /* synthetic */ int b;

    public /* synthetic */ ftn(BottomUiContainer bottomUiContainer, int i) {
        this.b = i;
        this.a = bottomUiContainer;
    }

    @Override // defpackage.amz
    public final void a(boolean z) {
        if (this.b != 0) {
            this.a.h = null;
            return;
        }
        BottomUiContainer bottomUiContainer = this.a;
        bottomUiContainer.e = null;
        bottomUiContainer.h = null;
        if (z) {
            return;
        }
        bottomUiContainer.n(null, null);
    }
}
