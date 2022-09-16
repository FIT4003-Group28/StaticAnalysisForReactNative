package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajhx  reason: default package */
/* loaded from: classes.dex */
final class ajhx extends WindowInsetsAnimation.Callback {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ ViewGroup.MarginLayoutParams d;
    final /* synthetic */ ajhz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajhx(ajhz ajhzVar, int i, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(0);
        this.e = ajhzVar;
        this.a = i;
        this.b = view;
        this.c = view2;
        this.d = marginLayoutParams;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ajhz ajhzVar = this.e;
        if (!ajhzVar.ag) {
            return;
        }
        ajhzVar.ag = false;
        WindowInsets rootWindowInsets = this.c.getRootWindowInsets();
        int i = this.a;
        if (rootWindowInsets != null) {
            i += ajhz.aK(rootWindowInsets);
        }
        if (this.d.bottomMargin == i) {
            return;
        }
        zgd.t(this.b, zgd.e(i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            ajhz ajhzVar = this.e;
            ajhzVar.ag = true;
            Dialog dialog = ajhzVar.an;
            if (dialog == null) {
                return;
            }
            ((aljo) dialog).a().E(3);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        if (!this.e.ag) {
            return windowInsets;
        }
        zgd.t(this.b, zgd.e(this.a + ajhz.aK(windowInsets)), ViewGroup.MarginLayoutParams.class);
        return windowInsets;
    }
}
