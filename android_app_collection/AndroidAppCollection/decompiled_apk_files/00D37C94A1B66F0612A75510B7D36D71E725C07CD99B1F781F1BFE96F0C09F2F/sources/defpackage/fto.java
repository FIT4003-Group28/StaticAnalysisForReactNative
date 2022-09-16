package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: fto  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fto implements ana {
    public final /* synthetic */ BottomUiContainer a;
    public final /* synthetic */ View b;
    private final /* synthetic */ int c;

    public /* synthetic */ fto(BottomUiContainer bottomUiContainer, View view) {
        this.a = bottomUiContainer;
        this.b = view;
    }

    public /* synthetic */ fto(BottomUiContainer bottomUiContainer, View view, int i) {
        this.c = i;
        this.a = bottomUiContainer;
        this.b = view;
    }

    @Override // defpackage.ana
    public final void a(float f) {
        if (this.c == 0) {
            BottomUiContainer bottomUiContainer = this.a;
            bottomUiContainer.j(bottomUiContainer.b(this.b));
            return;
        }
        BottomUiContainer bottomUiContainer2 = this.a;
        View view = this.b;
        int i = (int) f;
        lj.E(view, i - view.getTop());
        view.setAlpha(bottomUiContainer2.a(view, i));
    }
}
